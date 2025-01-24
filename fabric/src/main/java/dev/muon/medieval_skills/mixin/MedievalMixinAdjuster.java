package dev.muon.medieval_skills.mixin;

import com.bawnorton.mixinsquared.adjuster.tools.AdjustableAnnotationNode;
import com.bawnorton.mixinsquared.api.MixinAnnotationAdjuster;
import org.objectweb.asm.tree.MethodNode;

import java.util.List;

public class MedievalMixinAdjuster implements MixinAnnotationAdjuster {

    @Override
    public AdjustableAnnotationNode adjust(List<String> targetClassNames, String mixinClassName, MethodNode method, AdjustableAnnotationNode annotation) {
        return annotation;
    }
}