// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;

public enum a
{
    I(false, false, 3, (w)null), 
    J(true, false, 2, (w)null), 
    K(true, true);
    
    private final boolean G;
    private final boolean H;
    
    private a(final boolean g, final boolean h) {
        this.G = g;
        this.H = h;
    }
    
    public final boolean b() {
        return this.G;
    }
    
    public final boolean d() {
        return this.H;
    }
}
