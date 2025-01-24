package dev.muon.medieval_skills;

import dev.muon.medieval_skills.platform.MedievalPlatformHelperFabric;
import dev.muon.medieval_skills.platform.Services;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class MedievalFabricPre implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        Medieval.setHelper(new MedievalPlatformHelperFabric());
        Services.setup(new MedievalPlatformHelperFabric());
    }
}