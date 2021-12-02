// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.d0;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.collections.y0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import java.util.Map;
import org.jetbrains.annotations.f;
import m6.d;

public final class e
{
    @org.jetbrains.annotations.e
    public static final a i;
    @d
    @org.jetbrains.annotations.e
    public static final h j;
    @d
    @org.jetbrains.annotations.e
    public static final e k;
    @d
    @org.jetbrains.annotations.e
    public static final e l;
    @d
    @org.jetbrains.annotations.e
    public static final e m;
    @org.jetbrains.annotations.e
    private final h a;
    @f
    private final h b;
    @org.jetbrains.annotations.e
    private final Map<String, h> c;
    private final boolean d;
    @org.jetbrains.annotations.e
    private final h e;
    @org.jetbrains.annotations.e
    private final b0 f;
    private final boolean g;
    private final boolean h;
    
    static {
        i = new a(null);
        k = new e(j = h.J, null, y0.z(), false, null, 24, null);
        final h i2 = h.I;
        l = new e(i2, i2, y0.z(), false, null, 24, null);
        final h k2 = h.K;
        m = new e(k2, k2, y0.z(), false, null, 24, null);
    }
    
    public e(@org.jetbrains.annotations.e final h a, @f final h b, @org.jetbrains.annotations.e final Map<String, ? extends h> c, final boolean d, @org.jetbrains.annotations.e final h e) {
        k0.p((Object)a, "globalJsr305Level");
        k0.p((Object)c, "userDefinedLevelForSpecificJsr305Annotation");
        k0.p((Object)e, "jspecifyReportLevel");
        this.a = a;
        this.b = b;
        this.c = (Map<String, h>)c;
        this.d = d;
        this.e = e;
        this.f = d0.c((n6.a)new n6.a<String[]>() {
            final /* synthetic */ e G;
            
            @org.jetbrains.annotations.e
            public final String[] a() {
                final ArrayList<String> list = new ArrayList<String>();
                list.add(this.G.d().b());
                final h f = this.G.f();
                if (f != null) {
                    list.add(k0.C("under-migration:", (Object)f.b()));
                }
                for (final Map.Entry<String, h> entry : this.G.g().entrySet()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append('@');
                    sb.append(entry.getKey());
                    sb.append(':');
                    sb.append(entry.getValue().b());
                    list.add(sb.toString());
                }
                final String[] array = list.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return array;
            }
        });
        final h i = kotlin.reflect.jvm.internal.impl.utils.h.I;
        final boolean b2 = true;
        final boolean g = a == i && b == i && c.isEmpty();
        this.g = g;
        boolean h = b2;
        if (!g) {
            h = (e == i && b2);
        }
        this.h = h;
    }
    
    public final boolean a() {
        return this.h;
    }
    
    public final boolean b() {
        return this.g;
    }
    
    public final boolean c() {
        return this.d;
    }
    
    @org.jetbrains.annotations.e
    public final h d() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final h e() {
        return this.e;
    }
    
    @f
    public final h f() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final Map<String, h> g() {
        return this.c;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
