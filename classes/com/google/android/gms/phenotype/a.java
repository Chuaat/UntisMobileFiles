// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import h2.c;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import android.os.Parcelable$Creator;
import h2.d;

@f2.a
@h2.d.a(creator = "ConfigurationCreator")
@f({ 1 })
public class a extends h2.a implements Comparable<a>
{
    @f2.a
    public static final Parcelable$Creator<a> CREATOR;
    @c(id = 2)
    private final int G;
    @c(id = 3)
    private final n[] H;
    @c(id = 4)
    private final String[] I;
    private final Map<String, n> J;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    @b
    public a(@e(id = 2) int i, @e(id = 3) final n[] h, @e(id = 4) final String[] array) {
        this.G = i;
        this.H = h;
        this.J = new TreeMap<String, n>();
        int length;
        n n;
        for (length = h.length, i = 0; i < length; ++i) {
            n = h[i];
            this.J.put(n.G, n);
        }
        if ((this.I = array) != null) {
            Arrays.sort(array);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof a) {
            final a a = (a)o;
            if (this.G == a.G && s.a(this.J, a.J) && Arrays.equals(this.I, a.I)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.G);
        sb.append(", ");
        sb.append("(");
        final Iterator<n> iterator = this.J.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        final String[] i = this.I;
        if (i != null) {
            for (int length = i.length, j = 0; j < length; ++j) {
                sb.append(i[j]);
                sb.append(", ");
            }
        }
        else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 2, this.G);
        h2.c.b0(parcel, 3, this.H, n, false);
        h2.c.Y(parcel, 4, this.I, false);
        h2.c.b(parcel, a);
    }
}
