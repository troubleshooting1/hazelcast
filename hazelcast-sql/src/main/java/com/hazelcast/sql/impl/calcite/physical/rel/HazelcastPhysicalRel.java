package com.hazelcast.sql.impl.calcite.physical.rel;

import com.hazelcast.sql.impl.calcite.HazelcastRelNode;
import org.apache.calcite.plan.Convention;
import org.apache.calcite.plan.RelTraitSet;

public interface HazelcastPhysicalRel extends HazelcastRelNode {
    /** Physical convention. */
    Convention HAZELCAST_PHYSICAL = new Convention.Impl("PHYSICAL", HazelcastPhysicalRel.class) {
        @Override
        public boolean canConvertConvention(Convention toConvention) {
            return true;
        }

        @Override
        public boolean useAbstractConvertersForConversion(RelTraitSet fromTraits, RelTraitSet toTraits) {
            return true;
        }
    };

}
