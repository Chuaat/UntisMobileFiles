// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public enum h
{
    @e
    public static final a H;
    
    I("ignore"), 
    J("warn"), 
    K("strict");
    
    @e
    private final String G;
    
    static {
        H = new a(null);
    }
    
    private h(final String g) {
        this.G = g;
    }
    
    @e
    public final String b() {
        return this.G;
    }
    
    public final boolean d() {
        return this == h.I;
    }
    
    public final boolean f() {
        return this == h.J;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
