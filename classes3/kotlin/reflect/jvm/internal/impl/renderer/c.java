// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.w;
import m6.d;
import org.jetbrains.annotations.e;

public abstract class c
{
    @e
    public static final k a;
    @d
    @e
    public static final c b;
    @d
    @e
    public static final c c;
    @d
    @e
    public static final c d;
    @d
    @e
    public static final c e;
    @d
    @e
    public static final c f;
    @d
    @e
    public static final c g;
    @d
    @e
    public static final c h;
    @d
    @e
    public static final c i;
    @d
    @e
    public static final c j;
    @d
    @e
    public static final c k;
    
    static {
        final k l = a = new k(null);
        b = l.b((n6.l<? super f, j2>)c$c.G);
        c = l.b((n6.l<? super f, j2>)c$a.G);
        d = l.b((n6.l<? super f, j2>)c$b.G);
        e = l.b((n6.l<? super f, j2>)c$d.G);
        f = l.b((n6.l<? super f, j2>)c$i.G);
        g = l.b((n6.l<? super f, j2>)c$f.G);
        h = l.b((n6.l<? super f, j2>)c$g.G);
        i = l.b((n6.l<? super f, j2>)c$j.G);
        j = l.b((n6.l<? super f, j2>)c$e.G);
        k = l.b((n6.l<? super f, j2>)c$h.G);
    }
    
    @e
    public final c A(@e final n6.l<? super f, j2> l) {
        k0.p((Object)l, "changeOptions");
        final g s = ((kotlin.reflect.jvm.internal.impl.renderer.d)this).j0().s();
        l.invoke((Object)s);
        s.n0();
        return new kotlin.reflect.jvm.internal.impl.renderer.d(s);
    }
    
    @e
    public abstract String s(@e final m p0);
    
    @e
    public abstract String t(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p0, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e p1);
    
    @e
    public abstract String v(@e final String p0, @e final String p1, @e final KotlinBuiltIns p2);
    
    @e
    public abstract String w(@e final kotlin.reflect.jvm.internal.impl.name.c p0);
    
    @e
    public abstract String x(@e final kotlin.reflect.jvm.internal.impl.name.e p0, final boolean p1);
    
    @e
    public abstract String y(@e final c0 p0);
    
    @e
    public abstract String z(@e final y0 p0);
    
    public static final class k
    {
        private k() {
        }
        
        @e
        public final String a(@e final i i) {
            k0.p((Object)i, "classifier");
            String s = null;
            if (i instanceof a1) {
                s = "typealias";
            }
            else {
                if (!(i instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                    throw new AssertionError((Object)k0.C("Unexpected classifier: ", (Object)i));
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)i;
                if (e.G()) {
                    s = "companion object";
                }
                else {
                    switch (a.a[((Enum)e.n()).ordinal()]) {
                        default: {
                            throw new h0();
                        }
                        case 6: {
                            s = "enum entry";
                            break;
                        }
                        case 5: {
                            s = "annotation class";
                            break;
                        }
                        case 4: {
                            s = "object";
                            break;
                        }
                        case 3: {
                            s = "enum class";
                            break;
                        }
                        case 2: {
                            s = "interface";
                            break;
                        }
                        case 1: {
                            s = "class";
                            break;
                        }
                    }
                }
            }
            return s;
        }
        
        @e
        public final c b(@e final n6.l<? super f, j2> l) {
            k0.p((Object)l, "changeOptions");
            final g g = new g();
            l.invoke((Object)g);
            g.n0();
            return new kotlin.reflect.jvm.internal.impl.renderer.d(g);
        }
    }
    
    public interface l
    {
        void a(@e final e1 p0, final int p1, final int p2, @e final StringBuilder p3);
        
        void b(final int p0, @e final StringBuilder p1);
        
        void c(final int p0, @e final StringBuilder p1);
        
        void d(@e final e1 p0, final int p1, final int p2, @e final StringBuilder p3);
        
        public static final class a implements l
        {
            @e
            public static final a a;
            
            static {
                a = new a();
            }
            
            private a() {
            }
            
            @Override
            public void a(@e final e1 e1, final int n, final int n2, @e final StringBuilder sb) {
                k0.p((Object)e1, "parameter");
                k0.p((Object)sb, "builder");
            }
            
            @Override
            public void b(final int n, @e final StringBuilder sb) {
                k0.p((Object)sb, "builder");
                sb.append("(");
            }
            
            @Override
            public void c(final int n, @e final StringBuilder sb) {
                k0.p((Object)sb, "builder");
                sb.append(")");
            }
            
            @Override
            public void d(@e final e1 e1, final int n, final int n2, @e final StringBuilder sb) {
                k0.p((Object)e1, "parameter");
                k0.p((Object)sb, "builder");
                if (n != n2 - 1) {
                    sb.append(", ");
                }
            }
        }
    }
}
