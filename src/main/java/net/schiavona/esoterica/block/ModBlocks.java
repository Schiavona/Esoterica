package net.schiavona.esoterica.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.schiavona.esoterica.Esoterica;
import net.schiavona.esoterica.item.ModItemGroup;

public class ModBlocks {

    public static final Block LEAD_BLOCK = registerBlock("lead_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ESOTERICA);
    public static final Block CUT_LEAD_BLOCK = registerBlock("cut_lead_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ESOTERICA);



    private static Block registerBlock (String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registries.BLOCK, new Identifier(Esoterica.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Esoterica.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }



    public static void registerModBlocks () {
        Esoterica.LOGGER.debug("Registering Mod Blocks for " + Esoterica.MOD_ID);
    }

}