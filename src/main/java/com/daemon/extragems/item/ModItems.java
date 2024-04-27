package com.daemon.extragems.item;

import com.daemon.extragems.ExtraGems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JADE_GEM = registerItem("jade_gem", new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(JADE_GEM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExtraGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraGems.LOGGER.info("Registering Mod Items for " + ExtraGems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(
                ModItems::addItemsToIngredientItemGroup);
    }
}
