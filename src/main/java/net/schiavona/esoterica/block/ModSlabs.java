package net.schiavona.esoterica.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.schiavona.esoterica.Esoterica;
import net.schiavona.esoterica.item.ModItemGroup;

public class ModSlabs {


    public static final SlabBlock CUT_LEAD_SLAB = registerSlab("cut_lead_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)),ModItemGroup.ESOTERICA);
    private static Item registerSlabItem(String name, SlabBlock slab, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Esoterica.MOD_ID, name),
                new BlockItem(slab, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    private static SlabBlock registerSlab (String name, SlabBlock slab, ItemGroup tab){
        registerSlabItem(name, slab, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Esoterica.MOD_ID, name), slab);
    }

    public static void registerModSlabs () {
        Esoterica.LOGGER.debug("Registering Mod Slabs for " + Esoterica.MOD_ID);
    }
}
