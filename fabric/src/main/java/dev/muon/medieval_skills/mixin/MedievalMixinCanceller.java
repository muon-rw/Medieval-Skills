package dev.muon.medieval_skills.mixin;

import com.bawnorton.mixinsquared.api.MixinCanceller;

import java.util.List;

public class MedievalMixinCanceller implements MixinCanceller {
    @Override
    public boolean shouldCancel(List<String> targetClassNames, String mixinClassName) {
        return false;
    }
}