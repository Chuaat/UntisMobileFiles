// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import n6.l;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import java.util.Iterator;
import java.util.Objects;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.e;

public final class d
{
    @e
    public static final a c;
    private static int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    @m6.d
    @e
    public static final d o;
    @m6.d
    @e
    public static final d p;
    @m6.d
    @e
    public static final d q;
    @m6.d
    @e
    public static final d r;
    @m6.d
    @e
    public static final d s;
    @m6.d
    @e
    public static final d t;
    @m6.d
    @e
    public static final d u;
    @m6.d
    @e
    public static final d v;
    @m6.d
    @e
    public static final d w;
    @m6.d
    @e
    public static final d x;
    @e
    private static final List<a.a> y;
    @e
    private static final List<a.a> z;
    @e
    private final List<c> a;
    private final int b;
    
    static {
        final a a = c = new a(null);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.d = 1;
        e = a.l();
        f = a.l();
        g = a.l();
        h = a.l();
        i = a.l();
        j = a.l();
        k = a.l() - 1;
        l = (a.f() | a.h() | a.i());
        m = (a.h() | a.e() | a.k());
        n = (a.e() | a.k());
        o = new d(a.b(), null, 2, null);
        p = new d(a.c(), null, 2, null);
        q = new d(a.f(), null, 2, null);
        r = new d(a.h(), null, 2, null);
        s = new d(a.i(), null, 2, null);
        t = new d(a.d(), null, 2, null);
        u = new d(a.g(), null, 2, null);
        v = new d(a.e(), null, 2, null);
        w = new d(a.k(), null, 2, null);
        x = new d(a.j(), null, 2, null);
        final Field[] fields = d.class.getFields();
        k0.o((Object)fields, "T::class.java.fields");
        final ArrayList<Field> list = new ArrayList<Field>();
        for (final Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                list.add(field);
            }
        }
        final ArrayList<Object> y2 = (ArrayList<Object>)new ArrayList<a.a>();
        for (final Field field2 : list) {
            final Object value = field2.get(null);
            d d;
            if (value instanceof d) {
                d = (d)value;
            }
            else {
                d = null;
            }
            Object o3;
            if (d != null) {
                final int o2 = d.o();
                final String name = field2.getName();
                k0.o((Object)name, "field.name");
                o3 = new a.a(o2, name);
            }
            else {
                o3 = null;
            }
            if (o3 != null) {
                y2.add(o3);
            }
        }
        y = y2;
        final Field[] fields2 = d.class.getFields();
        k0.o((Object)fields2, "T::class.java.fields");
        final ArrayList<Field> list2 = new ArrayList<Field>();
        for (final Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                list2.add(field3);
            }
        }
        final ArrayList<Field> list3 = new ArrayList<Field>();
        for (final Field next : list2) {
            if (k0.g((Object)next.getType(), (Object)Integer.TYPE)) {
                list3.add(next);
            }
        }
        final ArrayList<Object> z2 = (ArrayList<Object>)new ArrayList<a.a>();
        for (final Field field4 : list3) {
            final Object value2 = field4.get(null);
            Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.Int");
            final int intValue = (int)value2;
            Object o4;
            if (intValue == (-intValue & intValue)) {
                final String name2 = field4.getName();
                k0.o((Object)name2, "field.name");
                o4 = new a.a(intValue, name2);
            }
            else {
                o4 = null;
            }
            if (o4 != null) {
                z2.add(o4);
            }
        }
        z = z2;
    }
    
    public d(int b, @e final List<? extends c> a) {
        k0.p((Object)a, "excludes");
        this.a = (List<c>)a;
        final Iterator<c> iterator = a.iterator();
        while (iterator.hasNext()) {
            b &= ~iterator.next().a();
        }
        this.b = b;
    }
    
    public static final /* synthetic */ int b() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.k;
    }
    
    public static final /* synthetic */ int c() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.n;
    }
    
    public static final /* synthetic */ int d() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.l;
    }
    
    public static final /* synthetic */ int e() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.i;
    }
    
    public static final /* synthetic */ int f() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.e;
    }
    
    public static final /* synthetic */ int g() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.d;
    }
    
    public static final /* synthetic */ int h() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.h;
    }
    
    public static final /* synthetic */ int i() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f;
    }
    
    public static final /* synthetic */ int j() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.g;
    }
    
    public static final /* synthetic */ int k() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.m;
    }
    
    public static final /* synthetic */ int l() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.j;
    }
    
    public static final /* synthetic */ void m(final int d) {
        d.d = d;
    }
    
    public final boolean a(final int n) {
        return (n & this.b) != 0x0;
    }
    
    @e
    public final List<c> n() {
        return this.a;
    }
    
    public final int o() {
        return this.b;
    }
    
    @f
    public final d p(int n) {
        n &= this.b;
        if (n == 0) {
            return null;
        }
        return new d(n, this.a);
    }
    
    @e
    @Override
    public String toString() {
        while (true) {
            for (final Object next : kotlin.reflect.jvm.internal.impl.resolve.scopes.d.y) {
                if (((a.a)next).a() == this.o()) {
                    final a.a a = (a.a)next;
                    String b;
                    if (a == null) {
                        b = null;
                    }
                    else {
                        b = a.b();
                    }
                    String z2 = b;
                    if (b == null) {
                        final List<a.a> z3 = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.z;
                        final ArrayList<String> list = new ArrayList<String>();
                        for (final a.a a2 : z3) {
                            String b2;
                            if (this.a(a2.a())) {
                                b2 = a2.b();
                            }
                            else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                list.add(b2);
                            }
                        }
                        z2 = kotlin.collections.v.Z2((Iterable)list, (CharSequence)" | ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("DescriptorKindFilter(");
                    sb.append(z2);
                    sb.append(", ");
                    sb.append(this.a);
                    sb.append(')');
                    return sb.toString();
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final int l() {
            final int g = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.g();
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.g() << 1);
            return g;
        }
        
        public final int b() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.b();
        }
        
        public final int c() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.c();
        }
        
        public final int d() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.d();
        }
        
        public final int e() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.e();
        }
        
        public final int f() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f();
        }
        
        public final int g() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.h();
        }
        
        public final int h() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.i();
        }
        
        public final int i() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.j();
        }
        
        public final int j() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.k();
        }
        
        public final int k() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.d.l();
        }
        
        private static final class a
        {
            private final int a;
            @e
            private final String b;
            
            public a(final int a, @e final String b) {
                k0.p((Object)b, "name");
                this.a = a;
                this.b = b;
            }
            
            public final int a() {
                return this.a;
            }
            
            @e
            public final String b() {
                return this.b;
            }
        }
    }
}
