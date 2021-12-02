// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import n6.l;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.e;

public abstract class a
{
    @e
    public static final a f;
    @e
    private final int[] a;
    private final int b;
    private final int c;
    private final int d;
    @e
    private final List<Integer> e;
    
    static {
        f = new a(null);
    }
    
    public a(@e final int... a) {
        k0.p((Object)a, "numbers");
        this.a = a;
        final Integer ke = m.ke(a, 0);
        final int n = -1;
        int intValue;
        if (ke == null) {
            intValue = -1;
        }
        else {
            intValue = ke;
        }
        this.b = intValue;
        final Integer ke2 = m.ke(a, 1);
        int intValue2;
        if (ke2 == null) {
            intValue2 = -1;
        }
        else {
            intValue2 = ke2;
        }
        this.c = intValue2;
        final Integer ke3 = m.ke(a, 2);
        int intValue3;
        if (ke3 == null) {
            intValue3 = n;
        }
        else {
            intValue3 = ke3;
        }
        this.d = intValue3;
        List e;
        if (a.length > 3) {
            e = v.I5((Iterable)m.r(a).subList(3, a.length));
        }
        else {
            e = v.E();
        }
        this.e = (List<Integer>)e;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final boolean c(int c, final int n, final int n2) {
        final int b = this.b;
        boolean b2 = true;
        if (b > c) {
            return true;
        }
        if (b < c) {
            return false;
        }
        c = this.c;
        if (c > n) {
            return true;
        }
        if (c < n) {
            return false;
        }
        if (this.d < n2) {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean d(@e final a a) {
        k0.p((Object)a, "version");
        return this.c(a.b, a.c, a.d);
    }
    
    public final boolean e(int c, final int n, final int n2) {
        final int b = this.b;
        boolean b2 = true;
        if (b < c) {
            return true;
        }
        if (b > c) {
            return false;
        }
        c = this.c;
        if (c < n) {
            return true;
        }
        if (c > n) {
            return false;
        }
        if (this.d > n2) {
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o != null && k0.g((Object)this.getClass(), (Object)o.getClass())) {
            final int b = this.b;
            final a a = (a)o;
            if (b == a.b && this.c == a.c && this.d == a.d && k0.g((Object)this.e, (Object)a.e)) {
                return true;
            }
        }
        return false;
    }
    
    protected final boolean f(@e final a a) {
        k0.p((Object)a, "ourVersion");
        final int b = this.b;
        boolean b2 = true;
        if (b == 0) {
            if (a.b == 0 && this.c == a.c) {
                return b2;
            }
        }
        else if (b == a.b && this.c <= a.c) {
            return b2;
        }
        b2 = false;
        return b2;
    }
    
    @e
    public final int[] g() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final int b = this.b;
        final int n = b + (b * 31 + this.c);
        final int n2 = n + (n * 31 + this.d);
        return n2 + (n2 * 31 + this.e.hashCode());
    }
    
    @e
    @Override
    public String toString() {
        final int[] g = this.g();
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (final int j : g) {
            if (j == -1) {
                break;
            }
            list.add(j);
        }
        String z2;
        if (list.isEmpty()) {
            z2 = "unknown";
        }
        else {
            z2 = v.Z2((Iterable)list, (CharSequence)".", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
        }
        return z2;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
