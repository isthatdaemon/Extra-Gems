package com.daemon.extragems.block;

import com.daemon.extragems.ExtraGems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL)));

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), Block.Settings.copy(Blocks.STONE).strength(2f)));
    public static final Block JADE_DEEPSLATE_ORE = registerBlock("jade_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), Block.Settings.copy(Blocks.DEEPSLATE).strength(4f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ExtraGems.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ExtraGems.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ExtraGems.LOGGER.info("Registering ModBlocks for " + ExtraGems.MOD_ID);
    }
}
