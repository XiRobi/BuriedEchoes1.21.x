package net.xirobi.buriedechoes.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.xirobi.buriedechoes.BuriedEchoes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {
    public static final Item DENDRON_BARK = registerItem("dendron_bark", new Item(new Item.Settings()));
    public static final Item ANTHRACITE_COAL = registerItem("anthracite_coal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BuriedEchoes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BuriedEchoes.LOGGER.info("Registering Mod Items for " + BuriedEchoes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DENDRON_BARK);
            entries.add(ANTHRACITE_COAL);
        });

    }
}
