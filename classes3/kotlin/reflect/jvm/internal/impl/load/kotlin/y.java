// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import m6.d;
import org.jetbrains.annotations.e;

public final class y
{
    @e
    public static final a k;
    @d
    @e
    public static final y l;
    @d
    @e
    public static final y m;
    @d
    @e
    public static final y n;
    @d
    @e
    public static final y o;
    @d
    @e
    public static final y p;
    @d
    @e
    public static final y q;
    @d
    @e
    public static final y r;
    @d
    @e
    public static final y s;
    @d
    @e
    public static final y t;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    @f
    private final y f;
    private final boolean g;
    @f
    private final y h;
    @f
    private final y i;
    private final boolean j;
    
    static {
        k = new a(null);
        final y y = l = new y(false, false, false, false, false, null, false, null, null, false, 1023, null);
        final y y2 = m = new y(false, false, false, false, false, null, false, null, null, true, 511, null);
        n = new y(false, true, false, false, false, null, false, null, null, false, 1021, null);
        o = new y(false, false, false, false, false, y, false, null, null, false, 988, null);
        p = new y(false, false, false, false, false, y2, false, null, null, true, 476, null);
        q = new y(false, true, false, false, false, y, false, null, null, false, 988, null);
        r = new y(false, false, false, true, false, y, false, null, null, false, 983, null);
        s = new y(false, false, false, true, false, y, false, null, null, false, 919, null);
        t = new y(false, false, true, false, false, y, false, null, null, false, 984, null);
    }
    
    public y() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }
    
    public y(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e, @f final y f, final boolean g, @f final y h, @f final y i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean a() {
        return this.g;
    }
    
    public final boolean b() {
        return this.j;
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final boolean d() {
        return this.a;
    }
    
    public final boolean e() {
        return this.c;
    }
    
    @e
    public final y f(@e final k1 k1, final boolean b) {
        k0.p((Object)k1, "effectiveVariance");
        if (!b || !this.c) {
            final int n = y.b.a[k1.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    final y y;
                    if ((y = this.f) != null) {
                        return y;
                    }
                }
                else {
                    final y y;
                    if ((y = this.i) != null) {
                        return y;
                    }
                }
            }
            else {
                final y y;
                if ((y = this.h) != null) {
                    return y;
                }
            }
        }
        return this;
    }
    
    @e
    public final y g() {
        return new y(this.a, true, this.c, this.d, this.e, this.f, this.g, this.h, this.i, false, 512, null);
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
