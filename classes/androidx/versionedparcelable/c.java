// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.t0;
import java.io.OutputStream;
import java.io.InputStream;

public class c
{
    private static final String a = "a";
    
    private c() {
    }
    
    @t0({ t0.a.I })
    public static <T extends h> T a(final InputStream inputStream) {
        return new g(inputStream, null).g0();
    }
    
    @t0({ t0.a.I })
    public static <T extends h> T b(final Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl)parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }
    
    @k0
    public static <T extends h> T c(@j0 Bundle bundle, @j0 final String s) {
        try {
            bundle = (Bundle)bundle.getParcelable(s);
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(c.class.getClassLoader());
            return b(bundle.getParcelable("a"));
        }
        catch (RuntimeException ex) {
            return null;
        }
    }
    
    @k0
    public static <T extends h> List<T> d(Bundle bundle, final String s) {
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<T>();
        try {
            bundle = (Bundle)bundle.getParcelable(s);
            bundle.setClassLoader(c.class.getClassLoader());
            final Iterator<Parcelable> iterator = bundle.getParcelableArrayList("a").iterator();
            while (iterator.hasNext()) {
                list.add(b(iterator.next()));
            }
            return (List<T>)list;
        }
        catch (RuntimeException ex) {
            return null;
        }
    }
    
    public static void e(@j0 final Bundle bundle, @j0 final String s, @k0 final h h) {
        if (h == null) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", h(h));
        bundle.putParcelable(s, (Parcelable)bundle2);
    }
    
    public static void f(@j0 final Bundle bundle, @j0 final String s, @j0 final List<? extends h> list) {
        final Bundle bundle2 = new Bundle();
        final ArrayList<Parcelable> list2 = new ArrayList<Parcelable>();
        final Iterator<? extends h> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(h((h)iterator.next()));
        }
        bundle2.putParcelableArrayList("a", (ArrayList)list2);
        bundle.putParcelable(s, (Parcelable)bundle2);
    }
    
    @t0({ t0.a.I })
    public static void g(final h h, final OutputStream outputStream) {
        final g g = new g(null, outputStream);
        g.l1(h);
        g.a();
    }
    
    @t0({ t0.a.I })
    public static Parcelable h(final h h) {
        return (Parcelable)new ParcelImpl(h);
    }
}
