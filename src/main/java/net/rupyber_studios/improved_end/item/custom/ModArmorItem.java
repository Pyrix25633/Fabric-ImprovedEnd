package net.rupyber_studios.improved_end.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.item.*;
import net.rupyber_studios.improved_end.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
        (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
            .put(ModArmorMaterials.SHULKER,
                new StatusEffectInstance(StatusEffects.SLOW_FALLING, 400, 1)).build();

    private boolean bootsOn, leggingsOn, chestplateOn, helmetOn;

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, @NotNull World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                if(hasArmorOn(player)) {
                    evaluateArmorEffects(player);
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(@NotNull PlayerEntity player, ArmorMaterial mapArmorMaterial, @NotNull StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(!hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    private boolean hasArmorOn(@NotNull PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        bootsOn = !boots.isEmpty();
        leggingsOn = !leggings.isEmpty();
        chestplateOn = !chestplate.isEmpty();
        helmetOn = !helmet.isEmpty();

        return bootsOn || leggingsOn || chestplateOn || helmetOn;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, @NotNull PlayerEntity player) {
        Item bootsItem = player.getInventory().getArmorStack(0).getItem();
        Item leggingsItem = player.getInventory().getArmorStack(1).getItem();
        Item chestplateItem = player.getInventory().getArmorStack(2).getItem();
        Item helmetItem = player.getInventory().getArmorStack(3).getItem();

        boolean bootsOk = false, leggingsOk = false, chestplateOk = false, helmetOk = false;

        if(bootsOn) {
            bootsOk = ((ArmorItem)bootsItem).getMaterial() == material;
        }
        if(leggingsOn) {
            leggingsOk = ((ArmorItem)leggingsItem).getMaterial() == material;
        }
        if(chestplateOn && chestplateItem != Items.ELYTRA) {
            chestplateOk = ((ArmorItem)chestplateItem).getMaterial() == material;
        }
        if(helmetOn) {
            helmetOk = ((ArmorItem)helmetItem).getMaterial() == material;
        }

        return bootsOk || leggingsOk || chestplateOk || helmetOk;
    }
}