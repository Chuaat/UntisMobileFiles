// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import androidx.annotation.k0;
import androidx.annotation.p0;
import android.os.Build$VERSION;
import androidx.core.util.n;
import androidx.annotation.j0;
import android.content.LocusId;

public final class g
{
    private final String a;
    private final LocusId b;
    
    public g(@j0 final String s) {
        this.a = n.l(s, "id cannot be empty");
        LocusId a;
        if (Build$VERSION.SDK_INT >= 29) {
            a = g.a.a(s);
        }
        else {
            a = null;
        }
        this.b = a;
    }
    
    @j0
    private String b() {
        final int length = this.a.length();
        final StringBuilder sb = new StringBuilder();
        sb.append(length);
        sb.append("_chars");
        return sb.toString();
    }
    
    @j0
    @p0(29)
    public static g d(@j0 final LocusId locusId) {
        n.h(locusId, "locusId cannot be null");
        return new g(n.l(a.b(locusId), "id cannot be empty"));
    }
    
    @j0
    public String a() {
        return this.a;
    }
    
    @j0
    @p0(29)
    public LocusId c() {
        return this.b;
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (g.class != o.getClass()) {
            return false;
        }
        final g g = (g)o;
        final String a = this.a;
        final String a2 = g.a;
        if (a == null) {
            if (a2 != null) {
                b = false;
            }
            return b;
        }
        return a.equals(a2);
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return 31 + hashCode;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LocusIdCompat[");
        sb.append(this.b());
        sb.append("]");
        return sb.toString();
    }
    
    @p0(29)
    private static class a
    {
        @j0
        static LocusId a(@j0 final String s) {
            return new LocusId(s);
        }
        
        @j0
        static String b(@j0 final LocusId locusId) {
            return locusId.getId();
        }
    }
}
