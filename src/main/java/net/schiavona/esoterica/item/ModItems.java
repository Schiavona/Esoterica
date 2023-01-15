package net.schiavona.esoterica.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.schiavona.esoterica.Esoterica;

public class ModItems {

public static final Item CINNABAR = registerItem("cinnabar", new Item(new Item.Settings()),ModItemGroup.ESOTERICA);
public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()),ModItemGroup.ESOTERICA);
public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()), ModItemGroup.ESOTERICA);
public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()), ModItemGroup.ESOTERICA);
public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()), ModItemGroup.ESOTERICA);
public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Settings()), ModItemGroup.ESOTERICA);
public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()), ModItemGroup.ESOTERICA);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(Esoterica.MOD_ID, name), item);
    }




    public static void registerModItems() {
        Esoterica.LOGGER.debug("Registering Mod Items for " + Esoterica.MOD_ID);
    }
}
