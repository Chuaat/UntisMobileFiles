// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public abstract class j
{
    @e
    public static final b a;
    @e
    private static final d b;
    @e
    private static final d c;
    @e
    private static final d d;
    @e
    private static final d e;
    @e
    private static final d f;
    @e
    private static final d g;
    @e
    private static final d h;
    @e
    private static final d i;
    
    static {
        a = new b(null);
        b = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K);
        c = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.L);
        d = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.M);
        e = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.N);
        f = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.O);
        g = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.P);
        h = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.Q);
        i = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.R);
    }
    
    private j() {
    }
    
    public static final /* synthetic */ d a() {
        return j.b;
    }
    
    public static final /* synthetic */ d b() {
        return j.d;
    }
    
    public static final /* synthetic */ d c() {
        return j.c;
    }
    
    public static final /* synthetic */ d d() {
        return j.i;
    }
    
    public static final /* synthetic */ d e() {
        return j.g;
    }
    
    public static final /* synthetic */ d f() {
        return j.f;
    }
    
    public static final /* synthetic */ d g() {
        return j.h;
    }
    
    public static final /* synthetic */ d h() {
        return j.e;
    }
    
    @e
    @Override
    public String toString() {
        return l.a.l(this);
    }
    
    public static final class a extends j
    {
        @e
        private final j j;
        
        public a(@e final j j) {
            k0.p((Object)j, "elementType");
            super(null);
            this.j = j;
        }
        
        @e
        public final j i() {
            return this.j;
        }
    }
    
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d a() {
            return j.a();
        }
        
        @e
        public final d b() {
            return j.b();
        }
        
        @e
        public final d c() {
            return j.c();
        }
        
        @e
        public final d d() {
            return j.d();
        }
        
        @e
        public final d e() {
            return j.e();
        }
        
        @e
        public final d f() {
            return j.f();
        }
        
        @e
        public final d g() {
            return j.g();
        }
        
        @e
        public final d h() {
            return j.h();
        }
    }
    
    public static final class c extends j
    {
        @e
        private final String j;
        
        public c(@e final String j) {
            k0.p((Object)j, "internalName");
            super(null);
            this.j = j;
        }
        
        @e
        public final String i() {
            return this.j;
        }
    }
    
    public static final class d extends j
    {
        @f
        private final kotlin.reflect.jvm.internal.impl.resolve.jvm.d j;
        
        public d(@f final kotlin.reflect.jvm.internal.impl.resolve.jvm.d j) {
            super(null);
            this.j = j;
        }
        
        @f
        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.d i() {
            return this.j;
        }
    }
}
