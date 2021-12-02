// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.q1;
import java.util.UUID;

public class m1 extends s1 implements l1<UUID>
{
    public m1() {
    }
    
    public m1(final q1 q1) {
        super(q1);
    }
    
    @Override
    public n0<UUID> e(final q1 q1) {
        return new m1(q1);
    }
}
