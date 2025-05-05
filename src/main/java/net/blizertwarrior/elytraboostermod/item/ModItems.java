package net.blizertwarrior.elytraboostermod.item;

import net.blizertwarrior.elytraboostermod.ElytraBoosterMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElytraBoosterMod.MODID);

    public static final DeferredItem<Item> ELYTRABOOSTERMK1 = ITEMS.register("elytraboostermk1",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
