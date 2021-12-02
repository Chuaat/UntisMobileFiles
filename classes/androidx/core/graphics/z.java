// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.net.Uri;
import androidx.collection.m;
import androidx.annotation.j0;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import androidx.annotation.k0;
import android.content.res.Resources;
import androidx.core.content.res.d;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.GenericDeclaration;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(24)
@t0({ t0.a.I })
class z extends d0
{
    private static final String d = "TypefaceCompatApi24Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static final Class<?> h;
    private static final Constructor<?> i;
    private static final Method j;
    private static final Method k;
    
    static {
        final Constructor<?> constructor = null;
        Class<?> forName = null;
        Constructor<?> constructor2 = null;
        GenericDeclaration method = null;
        Method method2 = null;
        Label_0113: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor2 = forName.getConstructor((Class<?>[])new Class[0]);
                final Class<Integer> type = Integer.TYPE;
                method = forName.getMethod("addFontWeightStyle", ByteBuffer.class, type, List.class, type, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(forName, 1).getClass());
                break Label_0113;
            }
            catch (NoSuchMethodException constructor2) {}
            catch (ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi24Impl", constructor2.getClass().getName(), (Throwable)constructor2);
            forName = null;
            method = (method2 = (Method)forName);
            constructor2 = constructor;
        }
        i = constructor2;
        h = forName;
        j = (Method)method;
        k = method2;
    }
    
    private static boolean k(final Object obj, final ByteBuffer byteBuffer, final int i, final int j, final boolean b) {
        try {
            return (boolean)z.j.invoke(obj, byteBuffer, i, null, j, b);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private static Typeface l(final Object o) {
        try {
            final Object instance = Array.newInstance(z.h, 1);
            Array.set(instance, 0, o);
            return (Typeface)z.k.invoke(null, instance);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public static boolean m() {
        final Method j = z.j;
        if (j == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return j != null;
    }
    
    private static Object n() {
        try {
            return z.i.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    @k0
    @Override
    public Typeface b(final Context context, final d.c c, final Resources resources, int i) {
        final Object n = n();
        if (n == null) {
            return null;
        }
        final d.d[] a = c.a();
        int length;
        d.d d;
        ByteBuffer b;
        for (length = a.length, i = 0; i < length; ++i) {
            d = a[i];
            b = e0.b(context, resources, d.b());
            if (b == null) {
                return null;
            }
            if (!k(n, b, d.c(), d.e(), d.f())) {
                return null;
            }
        }
        return l(n);
    }
    
    @k0
    @Override
    public Typeface c(final Context context, @k0 final CancellationSignal cancellationSignal, @j0 final f.c[] array, final int n) {
        final Object n2 = n();
        if (n2 == null) {
            return null;
        }
        final m<Uri, ByteBuffer> m = new m<Uri, ByteBuffer>();
        for (final f.c c : array) {
            final Uri d = c.d();
            ByteBuffer f;
            if ((f = m.get(d)) == null) {
                f = e0.f(context, cancellationSignal, d);
                m.put(d, f);
            }
            if (f == null) {
                return null;
            }
            if (!k(n2, f, c.c(), c.e(), c.f())) {
                return null;
            }
        }
        final Typeface l = l(n2);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, n);
    }
}
