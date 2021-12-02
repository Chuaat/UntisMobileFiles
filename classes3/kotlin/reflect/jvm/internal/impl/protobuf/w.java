// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

public class w extends RuntimeException
{
    private final List<String> G;
    
    public w(final q q) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.G = null;
    }
    
    public k a() {
        return new k(this.getMessage());
    }
}
