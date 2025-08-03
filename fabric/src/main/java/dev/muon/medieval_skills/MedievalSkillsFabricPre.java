package dev.muon.medieval_skills;

import dev.muon.medieval_skills.platform.MedievalPlatformHelperFabric;
import dev.muon.medieval_skills.platform.Services;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class MedievalSkillsFabricPre implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        MedievalSkills.setHelper(new MedievalPlatformHelperFabric());
        Services.setup(new MedievalPlatformHelperFabric());
    }
}