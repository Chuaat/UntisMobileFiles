// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.text.s;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;

public enum m
{
    G, 
    H;
    
    @e
    public abstract String b(@e final String p0);
    
    static final class a extends m
    {
        a(final String s, final int n) {
            super(s, n, null);
        }
        
        @e
        @Override
        public String b(@e final String s) {
            k0.p((Object)s, "string");
            return s.k2(s.k2(s, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    }
    
    static final class b extends m
    {
        b(final String s, final int n) {
            super(s, n, null);
        }
        
        @e
        @Override
        public String b(@e final String s) {
            k0.p((Object)s, "string");
            return s;
        }
    }
}
