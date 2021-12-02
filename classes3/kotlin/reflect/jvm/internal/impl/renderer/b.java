// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.List;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;

public interface b
{
    @e
    String a(@e final h p0, @e final kotlin.reflect.jvm.internal.impl.renderer.c p1);
    
    public static final class a implements b
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        @Override
        public String a(@e final h h, @e final kotlin.reflect.jvm.internal.impl.renderer.c c) {
            k0.p((Object)h, "classifier");
            k0.p((Object)c, "renderer");
            if (h instanceof b1) {
                final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)h).getName();
                k0.o((Object)name, "classifier.name");
                return c.x(name, false);
            }
            final kotlin.reflect.jvm.internal.impl.name.c m = d.m((m)h);
            k0.o((Object)m, "getFqName(classifier)");
            return c.w(m);
        }
    }
    
    public static final class b implements kotlin.reflect.jvm.internal.impl.renderer.b
    {
        @e
        public static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        @e
        @Override
        public String a(@e h c, @e final kotlin.reflect.jvm.internal.impl.renderer.c c2) {
            k0.p((Object)c, "classifier");
            k0.p((Object)c2, "renderer");
            if (c instanceof b1) {
                final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)c).getName();
                k0.o((Object)name, "classifier.name");
                return c2.x(name, false);
            }
            final ArrayList<kotlin.reflect.jvm.internal.impl.name.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>();
            do {
                list.add(((f0)c).getName());
            } while ((c = (h)((m)c).c()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e);
            return n.c(v.Z0((List)list));
        }
    }
    
    public static final class c implements b
    {
        @e
        public static final c a;
        
        static {
            a = new c();
        }
        
        private c() {
        }
        
        private final String b(final h h) {
            final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)h).getName();
            k0.o((Object)name, "descriptor.name");
            final String b = n.b(name);
            if (h instanceof b1) {
                return b;
            }
            final m c = ((kotlin.reflect.jvm.internal.impl.descriptors.n)h).c();
            k0.o((Object)c, "descriptor.containingDeclaration");
            final String c2 = this.c(c);
            String string = b;
            if (c2 != null) {
                string = b;
                if (!k0.g((Object)c2, (Object)"")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append((Object)c2);
                    sb.append('.');
                    sb.append(b);
                    string = sb.toString();
                }
            }
            return string;
        }
        
        private final String c(final m m) {
            String s;
            if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                s = this.b((h)m);
            }
            else if (m instanceof h0) {
                final kotlin.reflect.jvm.internal.impl.name.c j = ((h0)m).f().j();
                k0.o((Object)j, "descriptor.fqName.toUnsafe()");
                s = n.a(j);
            }
            else {
                s = null;
            }
            return s;
        }
        
        @e
        @Override
        public String a(@e final h h, @e final kotlin.reflect.jvm.internal.impl.renderer.c c) {
            k0.p((Object)h, "classifier");
            k0.p((Object)c, "renderer");
            return this.b(h);
        }
    }
}
