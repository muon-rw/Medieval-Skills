package dev.muon.medieval_skills;

import dev.muon.medieval_skills.platform.MedievalPlatformHelper;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MedievalSkills {
    public static final String MOD_ID = "medieval";
    public static final Logger LOG = LoggerFactory.getLogger("Medieval");

    private static MedievalPlatformHelper helper;

    public static void init() {

    }

    public static ResourceLocation loc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static MedievalPlatformHelper getHelper() {
        return helper;
    }

    public static void setHelper(MedievalPlatformHelper helper) {
        MedievalSkills.helper = helper;
    }
}