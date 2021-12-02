// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public enum k1
{
    K("", true, true, 0), 
    L("in", true, false, -1), 
    M("out", false, true, 1);
    
    @e
    private final String G;
    private final boolean H;
    private final boolean I;
    private final int J;
    
    private k1(final String g, final boolean h, final boolean i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public final boolean b() {
        return this.I;
    }
    
    @e
    public final String d() {
        return this.G;
    }
    
    @e
    @Override
    public String toString() {
        return this.G;
    }
}
