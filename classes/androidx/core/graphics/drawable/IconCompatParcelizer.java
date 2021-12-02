// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.os.Parcelable;
import android.content.res.ColorStateList;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class IconCompatParcelizer
{
    public static IconCompat read(final e e) {
        final IconCompat iconCompat = new IconCompat();
        iconCompat.a = e.M(iconCompat.a, 1);
        iconCompat.c = e.t(iconCompat.c, 2);
        iconCompat.d = e.W(iconCompat.d, 3);
        iconCompat.e = e.M(iconCompat.e, 4);
        iconCompat.f = e.M(iconCompat.f, 5);
        iconCompat.g = e.W(iconCompat.g, 6);
        iconCompat.i = e.d0(iconCompat.i, 7);
        iconCompat.j = e.d0(iconCompat.j, 8);
        iconCompat.g();
        return iconCompat;
    }
    
    public static void write(final IconCompat iconCompat, final e e) {
        e.j0(true, true);
        iconCompat.h(e.i());
        final int a = iconCompat.a;
        if (-1 != a) {
            e.M0(a, 1);
        }
        final byte[] c = iconCompat.c;
        if (c != null) {
            e.u0(c, 2);
        }
        final Parcelable d = iconCompat.d;
        if (d != null) {
            e.X0(d, 3);
        }
        final int e2 = iconCompat.e;
        if (e2 != 0) {
            e.M0(e2, 4);
        }
        final int f = iconCompat.f;
        if (f != 0) {
            e.M0(f, 5);
        }
        final ColorStateList g = iconCompat.g;
        if (g != null) {
            e.X0((Parcelable)g, 6);
        }
        final String i = iconCompat.i;
        if (i != null) {
            e.f1(i, 7);
        }
        final String j = iconCompat.j;
        if (j != null) {
            e.f1(j, 8);
        }
    }
}
