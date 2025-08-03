package dev.muon.medieval_skills;

import dev.muon.medieval_skills.platform.MedievalPlatformHelperNeoForge;
import dev.muon.medieval_skills.platform.Services;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(MedievalSkills.MOD_ID)
public class MedievalSkillsNeoForge {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalSkills.MOD_ID);

    public MedievalSkillsNeoForge(IEventBus eventBus) {
        MedievalSkills.init();
        MedievalSkills.setHelper(new MedievalPlatformHelperNeoForge());
        Services.setup(new MedievalPlatformHelperNeoForge());

        CREATIVE_MODE_TABS.register(eventBus);

    }

}