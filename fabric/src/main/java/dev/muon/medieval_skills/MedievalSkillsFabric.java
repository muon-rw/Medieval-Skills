package dev.muon.medieval_skills;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class MedievalSkillsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MedievalSkills.LOG.info("Hello Fabric world!");
        MedievalSkills.init();

    }

}