package net.schiavona.esoterica.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.schiavona.esoterica.Esoterica;

public class ModItemGroup {

    public static final ItemGroup ESOTERICA = FabricItemGroup.builder(new Identifier(Esoterica.MOD_ID))
            .displayName(Text.literal("Esoterica"))
            .icon(() -> new ItemStack(ModItems.CINNABAR))
            .build();
}
