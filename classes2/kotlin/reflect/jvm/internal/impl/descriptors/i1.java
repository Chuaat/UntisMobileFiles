// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.collections.y0;
import java.util.Map;
import org.jetbrains.annotations.e;

public final class i1
{
    @org.jetbrains.annotations.e
    public static final i1 a;
    @org.jetbrains.annotations.e
    private static final Map<j1, Integer> b;
    @org.jetbrains.annotations.e
    private static final h c;
    
    static {
        a = new i1();
        final Map<e, Integer> g = y0.g();
        final f c2 = f.c;
        final Integer value = 0;
        g.put((e)c2, value);
        g.put(e.c, value);
        final b c3 = i1.b.c;
        final Integer value2 = 1;
        g.put((e)c3, value2);
        g.put((e)i1.g.c, value2);
        final h c4 = h.c;
        g.put((e)c4, 2);
        b = y0.d((Map<j1, Integer>)g);
        c = c4;
    }
    
    private i1() {
    }
    
    @org.jetbrains.annotations.f
    public final Integer a(@org.jetbrains.annotations.e final j1 j1, @org.jetbrains.annotations.e final j1 j2) {
        k0.p(j1, "first");
        k0.p(j2, "second");
        if (j1 == j2) {
            return 0;
        }
        final Map<j1, Integer> b = i1.b;
        final Integer n = b.get(j1);
        final Integer n2 = b.get(j2);
        Integer value;
        if (n != null && n2 != null && !k0.g(n, n2)) {
            value = n - n2;
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final boolean b(@org.jetbrains.annotations.e final j1 j1) {
        k0.p(j1, "visibility");
        return j1 == e.c || j1 == f.c;
    }
    
    public static final class a extends j1
    {
        @org.jetbrains.annotations.e
        public static final a c;
        
        static {
            c = new a();
        }
        
        private a() {
            super("inherited", false);
        }
    }
    
    public static final class b extends j1
    {
        @org.jetbrains.annotations.e
        public static final b c;
        
        static {
            c = new b();
        }
        
        private b() {
            super("internal", false);
        }
    }
    
    public static final class c extends j1
    {
        @org.jetbrains.annotations.e
        public static final c c;
        
        static {
            c = new c();
        }
        
        private c() {
            super("invisible_fake", false);
        }
    }
    
    public static final class d extends j1
    {
        @org.jetbrains.annotations.e
        public static final d c;
        
        static {
            c = new d();
        }
        
        private d() {
            super("local", false);
        }
    }
    
    public static final class e extends j1
    {
        @org.jetbrains.annotations.e
        public static final e c;
        
        static {
            c = new e();
        }
        
        private e() {
            super("private", false);
        }
    }
    
    public static final class f extends j1
    {
        @org.jetbrains.annotations.e
        public static final f c;
        
        static {
            c = new f();
        }
        
        private f() {
            super("private_to_this", false);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String b() {
            return "private/*private to this*/";
        }
    }
    
    public static final class g extends j1
    {
        @org.jetbrains.annotations.e
        public static final g c;
        
        static {
            c = new g();
        }
        
        private g() {
            super("protected", true);
        }
    }
    
    public static final class h extends j1
    {
        @org.jetbrains.annotations.e
        public static final h c;
        
        static {
            c = new h();
        }
        
        private h() {
            super("public", true);
        }
    }
    
    public static final class i extends j1
    {
        @org.jetbrains.annotations.e
        public static final i c;
        
        static {
            c = new i();
        }
        
        private i() {
            super("unknown", false);
        }
    }
}
