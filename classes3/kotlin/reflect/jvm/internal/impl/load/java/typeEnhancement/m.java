// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.collections.q0;
import kotlin.ranges.o;
import kotlin.collections.y0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v;
import kotlin.n1;
import java.util.ArrayList;
import java.util.List;
import kotlin.s0;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.e;
import java.util.Map;

final class m
{
    @e
    private final Map<String, k> a;
    
    public m() {
        this.a = new LinkedHashMap<String, k>();
    }
    
    public static final /* synthetic */ Map a(final m m) {
        return m.a;
    }
    
    @e
    public final Map<String, k> b() {
        return this.a;
    }
    
    public final class a
    {
        @e
        private final String a;
        
        public a(final String a) {
            k0.p((Object)m.this, "this$0");
            k0.p((Object)a, "className");
            this.a = a;
        }
        
        public final void a(@e final String s, @e final l<? super m.a.a, j2> l) {
            k0.p((Object)s, "name");
            k0.p((Object)l, "block");
            final Map a = m.a(m.this);
            final m.a.a a2 = new m.a.a(s);
            l.invoke((Object)a2);
            final s0<String, k> a3 = a2.a();
            a.put(a3.e(), a3.f());
        }
        
        @e
        public final String b() {
            return this.a;
        }
        
        public final class a
        {
            @e
            private final String a;
            @e
            private final List<s0<String, s>> b;
            @e
            private s0<String, s> c;
            
            public a(final String a) {
                k0.p((Object)m.a.this, "this$0");
                k0.p((Object)a, "functionName");
                this.a = a;
                this.b = new ArrayList<s0<String, s>>();
                this.c = (s0<String, s>)n1.a((Object)"V", (Object)null);
            }
            
            @e
            public final s0<String, k> a() {
                final v a = v.a;
                final String b = m.a.this.b();
                final String b2 = this.b();
                final List<s0<String, s>> b3 = this.b;
                final ArrayList list = new ArrayList<String>(kotlin.collections.v.Y((Iterable)b3, 10));
                final Iterator<s0> iterator = b3.iterator();
                while (iterator.hasNext()) {
                    list.add((String)iterator.next().e());
                }
                final String k = a.k(b, a.j(b2, (List<String>)list, (String)this.c.e()));
                final s s = (s)this.c.f();
                final List<s0<String, s>> b4 = this.b;
                final ArrayList list2 = new ArrayList<s>(kotlin.collections.v.Y((Iterable)b4, 10));
                final Iterator<s0> iterator2 = b4.iterator();
                while (iterator2.hasNext()) {
                    list2.add((s)iterator2.next().f());
                }
                return (s0<String, k>)n1.a((Object)k, (Object)new k(s, (List<s>)list2));
            }
            
            @e
            public final String b() {
                return this.a;
            }
            
            public final void c(@e final String s, @e final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e... array) {
                k0.p((Object)s, "type");
                k0.p((Object)array, "qualifiers");
                final List<s0<String, s>> b = this.b;
                Object o;
                if (array.length == 0) {
                    o = null;
                }
                else {
                    final Iterable zy = kotlin.collections.m.Zy((Object[])array);
                    final LinkedHashMap linkedHashMap = new LinkedHashMap<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>(kotlin.ranges.o.n(y0.j(kotlin.collections.v.Y(zy, 10)), 16));
                    for (final q0 q0 : zy) {
                        linkedHashMap.put(Integer.valueOf(q0.e()), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e)q0.f());
                    }
                    o = new s((Map<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)linkedHashMap);
                }
                b.add((s0<String, s>)n1.a((Object)s, o));
            }
            
            public final void d(@e final String s, @e final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e... array) {
                k0.p((Object)s, "type");
                k0.p((Object)array, "qualifiers");
                final Iterable zy = kotlin.collections.m.Zy((Object[])array);
                final LinkedHashMap linkedHashMap = new LinkedHashMap<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>(o.n(y0.j(kotlin.collections.v.Y(zy, 10)), 16));
                for (final q0 q0 : zy) {
                    linkedHashMap.put(Integer.valueOf(q0.e()), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e)q0.f());
                }
                this.c = (s0<String, s>)n1.a((Object)s, (Object)new s((Map<Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)linkedHashMap));
            }
            
            public final void e(@e final d d) {
                k0.p((Object)d, "type");
                final String g = d.g();
                k0.o((Object)g, "type.desc");
                this.c = (s0<String, s>)n1.a((Object)g, (Object)null);
            }
        }
    }
}
