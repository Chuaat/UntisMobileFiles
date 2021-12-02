// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import m6.d;
import org.jetbrains.annotations.e;

public abstract class b1
{
    @e
    public static final b a;
    @d
    @e
    public static final b1 b;
    
    static {
        a = new b(null);
        b = new b1() {
            @Override
            public boolean f() {
                return true;
            }
            
            @f
            public Void h(@e final c0 c0) {
                k0.p((Object)c0, "key");
                return null;
            }
            
            @e
            @Override
            public String toString() {
                return "Empty TypeSubstitution";
            }
        };
    }
    
    public boolean a() {
        return false;
    }
    
    public boolean b() {
        return false;
    }
    
    @e
    public final d1 c() {
        final d1 g = d1.g(this);
        k0.o((Object)g, "create(this)");
        return g;
    }
    
    @e
    public g d(@e final g g) {
        k0.p((Object)g, "annotations");
        return g;
    }
    
    @f
    public abstract y0 e(@e final c0 p0);
    
    public boolean f() {
        return false;
    }
    
    @e
    public c0 g(@e final c0 c0, @e final k1 k1) {
        k0.p((Object)c0, "topLevelType");
        k0.p((Object)k1, "position");
        return c0;
    }
    
    public static final class b
    {
        private b() {
        }
    }
}
