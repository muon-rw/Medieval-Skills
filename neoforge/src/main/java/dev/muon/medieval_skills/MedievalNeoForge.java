package dev.muon.medieval_skills;

import dev.muon.medieval_skills.platform.MedievalPlatformHelperNeoForge;
import dev.muon.medieval_skills.platform.Services;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Medieval.MOD_ID)
public class MedievalNeoForge {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Medieval.MOD_ID);

    public MedievalNeoForge(IEventBus eventBus) {
        Medieval.init();
        Medieval.setHelper(new MedievalPlatformHelperNeoForge());
        Services.setup(new MedievalPlatformHelperNeoForge());

        CREATIVE_MODE_TABS.register(eventBus);

    }

}