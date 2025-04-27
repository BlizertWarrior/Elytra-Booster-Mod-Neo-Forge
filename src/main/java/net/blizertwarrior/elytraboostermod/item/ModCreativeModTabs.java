package net.blizertwarrior.elytraboostermod.item;

import net.blizertwarrior.elytraboostermod.ElytraBoosterMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElytraBoosterMod.MODID);

        public static final Supplier<CreativeModeTab> ELYTRABOOSTERMOD_TAB = CREATIVE_MODE_TABS.register("elytra_booster_mod_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELYTRABOOSTERMK1.get()))
                        .title(Component.translatable("creativetab.elytra_booster_mod_tab"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.ELYTRABOOSTERMK1.get());
                        })
                        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
