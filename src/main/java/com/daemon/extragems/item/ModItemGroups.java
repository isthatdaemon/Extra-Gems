package com.daemon.extragems.item;

import com.daemon.extragems.ExtraGems;
import com.daemon.extragems.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup JADE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExtraGems.MOD_ID, "jade_gem"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.extragems"))
                    .icon(() -> new ItemStack(ModItems.JADE_GEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.JADE_GEM);

                        entries.add(ModBlocks.JADE_BLOCK);

                        entries.add(ModBlocks.JADE_ORE);
                        entries.add(ModBlocks.JADE_DEEPSLATE_ORE);

                    }).build());

    public static void registerItemGroups() {
        ExtraGems.LOGGER.info("Registering Item Groups for " + ExtraGems.MOD_ID);
    }
}
