// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import androidx.annotation.t0;
import androidx.annotation.p0;
import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.j0;

public final class j
{
    @j0
    public static final j e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new j(0, 0, 0, 0);
    }
    
    private j(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @j0
    public static j a(@j0 final j j, @j0 final j i) {
        return d(j.a + i.a, j.b + i.b, j.c + i.c, j.d + i.d);
    }
    
    @j0
    public static j b(@j0 final j j, @j0 final j i) {
        return d(Math.max(j.a, i.a), Math.max(j.b, i.b), Math.max(j.c, i.c), Math.max(j.d, i.d));
    }
    
    @j0
    public static j c(@j0 final j j, @j0 final j i) {
        return d(Math.min(j.a, i.a), Math.min(j.b, i.b), Math.min(j.c, i.c), Math.min(j.d, i.d));
    }
    
    @j0
    public static j d(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return j.e;
        }
        return new j(n, n2, n3, n4);
    }
    
    @j0
    public static j e(@j0 final Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    @j0
    public static j f(@j0 final j j, @j0 final j i) {
        return d(j.a - i.a, j.b - i.b, j.c - i.c, j.d - i.d);
    }
    
    @j0
    @p0(api = 29)
    public static j g(@j0 final Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }
    
    @Deprecated
    @j0
    @p0(api = 29)
    @t0({ t0.a.I })
    public static j i(@j0 final Insets insets) {
        return g(insets);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && j.class == o.getClass()) {
            final j j = (j)o;
            return this.d == j.d && this.a == j.a && this.c == j.c && this.b == j.b;
        }
        return false;
    }
    
    @j0
    @p0(api = 29)
    public Insets h() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
