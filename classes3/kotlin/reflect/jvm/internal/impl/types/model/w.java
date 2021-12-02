// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public enum w
{
    H("in"), 
    I("out"), 
    J("");
    
    @e
    private final String G;
    
    private w(final String g) {
        this.G = g;
    }
    
    @e
    @Override
    public String toString() {
        return this.G;
    }
}
