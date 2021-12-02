// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.o0;
import org.bson.types.ObjectId;

public final class q
{
    public static final p<ObjectId> a;
    public static final p<o0> b;
    
    static {
        a = new p<ObjectId>() {
            @Override
            public Class<ObjectId> a() {
                return ObjectId.class;
            }
            
            public ObjectId c() {
                return new ObjectId();
            }
        };
        b = new p<o0>() {
            @Override
            public Class<o0> a() {
                return o0.class;
            }
            
            public o0 c() {
                return new o0();
            }
        };
    }
    
    private q() {
    }
}
