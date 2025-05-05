package net.blizertwarrior.elytraboostermod;

import com.mojang.logging.LogUtils;
import net.blizertwarrior.elytraboostermod.item.ModCreativeModTabs;
import net.blizertwarrior.elytraboostermod.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

@Mod(ElytraBoosterMod.MODID)
public class ElytraBoosterMod
{
    public static final String MOD_ID = "elytraboostermod";

    public static final String MODID = "elytraboostermod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public ElytraBoosterMod(IEventBus modEventBus, ModContainer modContainer)
    {
        NeoForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
    }
}
