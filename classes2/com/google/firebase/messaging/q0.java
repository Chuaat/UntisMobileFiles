// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.os.Bundle;
import h2.b;
import androidx.annotation.j0;
import h2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class q0 implements Parcelable$Creator<p0>
{
    public static final int a = 0;
    
    static void c(final p0 p3, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.k(parcel, 2, p3.G, false);
        c.b(parcel, a);
    }
    
    @j0
    public p0 a(@j0 final Parcel parcel) {
        final int h0 = b.h0(parcel);
        Bundle g = null;
        while (parcel.dataPosition() < h0) {
            final int x = b.X(parcel);
            if (b.O(x) != 2) {
                b.g0(parcel, x);
            }
            else {
                g = b.g(parcel, x);
            }
        }
        b.N(parcel, h0);
        return new p0(g);
    }
    
    @j0
    public p0[] b(final int n) {
        return new p0[n];
    }
}
