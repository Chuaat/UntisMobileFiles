// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import androidx.annotation.j0;

public class j<F, S>
{
    public final F a;
    public final S b;
    
    public j(final F a, final S b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    public static <A, B> j<A, B> a(final A a, final B b) {
        return new j<A, B>(a, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof j;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final j j = (j)o;
        boolean b3 = b2;
        if (i.a(j.a, this.a)) {
            b3 = b2;
            if (i.a(j.b, this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final F a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final S b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
