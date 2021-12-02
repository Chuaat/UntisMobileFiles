// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.os.ParcelFileDescriptor;
import android.content.res.AssetManager;
import java.lang.reflect.Array;
import android.net.Uri;
import java.util.Map;
import android.content.ContentResolver;
import java.io.IOException;
import android.graphics.Typeface$Builder;
import androidx.annotation.j0;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import androidx.core.content.res.d;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontVariationAxis;
import android.content.Context;
import androidx.annotation.k0;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(26)
@t0({ t0.a.I })
public class a0 extends y
{
    private static final int A = -1;
    private static final String t = "TypefaceCompatApi26Impl";
    private static final String u = "android.graphics.FontFamily";
    private static final String v = "addFontFromAssetManager";
    private static final String w = "addFontFromBuffer";
    private static final String x = "createFromFamiliesWithDefault";
    private static final String y = "freeze";
    private static final String z = "abortCreation";
    protected final Class<?> m;
    protected final Constructor<?> n;
    protected final Method o;
    protected final Method p;
    protected final Method q;
    protected final Method r;
    protected final Method s;
    
    public a0() {
        Class<?> m = null;
        Constructor<?> z = null;
        Method v = null;
        Method w = null;
        Method a = null;
        Method u = null;
        Object x = null;
        Label_0125: {
            try {
                final Class<?> y = this.y();
                z = this.z(y);
                v = this.v(y);
                w = this.w(y);
                a = this.A(y);
                u = this.u(y);
                x = this.x(y);
                m = y;
                break Label_0125;
            }
            catch (NoSuchMethodException z) {}
            catch (ClassNotFoundException ex) {}
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(z.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), (Throwable)z);
            x = (z = null);
            v = (w = (Method)z);
            a = (u = w);
        }
        this.m = m;
        this.n = z;
        this.o = v;
        this.p = w;
        this.q = a;
        this.r = u;
        this.s = (Method)x;
    }
    
    @k0
    private Object o() {
        try {
            return this.n.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    private void p(final Object obj) {
        try {
            this.r.invoke(obj, new Object[0]);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {}
    }
    
    private boolean q(final Context context, final Object obj, final String s, final int i, final int j, final int k, @k0 final FontVariationAxis[] array) {
        try {
            return (boolean)this.o.invoke(obj, context.getAssets(), s, 0, Boolean.FALSE, i, j, k, array);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private boolean r(final Object obj, final ByteBuffer byteBuffer, final int i, final int j, final int k) {
        try {
            return (boolean)this.p.invoke(obj, byteBuffer, i, null, j, k);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private boolean s(final Object obj) {
        try {
            return (boolean)this.q.invoke(obj, new Object[0]);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private boolean t() {
        if (this.o == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.o != null;
    }
    
    protected Method A(final Class<?> clazz) throws NoSuchMethodException {
        return clazz.getMethod("freeze", (Class[])new Class[0]);
    }
    
    @k0
    @Override
    public Typeface b(final Context context, final d.c c, final Resources resources, int i) {
        if (!this.t()) {
            return super.b(context, c, resources, i);
        }
        final Object o = this.o();
        if (o == null) {
            return null;
        }
        final d.d[] a = c.a();
        int length;
        d.d d;
        for (length = a.length, i = 0; i < length; ++i) {
            d = a[i];
            if (!this.q(context, o, d.a(), d.c(), d.e(), d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(d.d()))) {
                this.p(o);
                return null;
            }
        }
        if (!this.s(o)) {
            return null;
        }
        return this.l(o);
    }
    
    @k0
    @Override
    public Typeface c(Context openFileDescriptor, @k0 final CancellationSignal cancellationSignal, @j0 final f.c[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        if (!this.t()) {
            final f.c h = this.h(array, n);
            final ContentResolver contentResolver = openFileDescriptor.getContentResolver();
            try {
                openFileDescriptor = (Context)contentResolver.openFileDescriptor(h.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                    }
                    return null;
                }
                try {
                    final Typeface build = new Typeface$Builder(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor()).setWeight(h.e()).setItalic(h.f()).build();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return build;
                }
                finally {
                    try {
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)cancellationSignal).addSuppressed(exception);
                    }
                }
            }
            catch (IOException ex) {
                return null;
            }
        }
        final Map<Uri, ByteBuffer> h2 = e0.h(openFileDescriptor, array, cancellationSignal);
        final Object o = this.o();
        if (o == null) {
            return null;
        }
        final int length = array.length;
        boolean b = false;
        for (final f.c c : array) {
            final ByteBuffer byteBuffer = h2.get(c.d());
            if (byteBuffer != null) {
                if (!this.r(o, byteBuffer, c.c(), c.e(), c.f() ? 1 : 0)) {
                    this.p(o);
                    return null;
                }
                b = true;
            }
        }
        if (!b) {
            this.p(o);
            return null;
        }
        if (!this.s(o)) {
            return null;
        }
        final Typeface l = this.l(o);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, n);
    }
    
    @k0
    @Override
    public Typeface e(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.t()) {
            return super.e(context, resources, n, s, n2);
        }
        final Object o = this.o();
        if (o == null) {
            return null;
        }
        if (!this.q(context, o, s, 0, -1, -1, null)) {
            this.p(o);
            return null;
        }
        if (!this.s(o)) {
            return null;
        }
        return this.l(o);
    }
    
    @k0
    protected Typeface l(final Object o) {
        try {
            final Object instance = Array.newInstance(this.m, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.s.invoke(null, instance, -1, -1);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    protected Method u(final Class<?> clazz) throws NoSuchMethodException {
        return clazz.getMethod("abortCreation", (Class[])new Class[0]);
    }
    
    protected Method v(final Class<?> clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, type, Boolean.TYPE, type, type, type, FontVariationAxis[].class);
    }
    
    protected Method w(final Class<?> clazz) throws NoSuchMethodException {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromBuffer", ByteBuffer.class, type, FontVariationAxis[].class, type, type);
    }
    
    protected Method x(final Class<?> componentType) throws NoSuchMethodException {
        final Class<?> class1 = Array.newInstance(componentType, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
    
    protected Class<?> y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }
    
    protected Constructor<?> z(final Class<?> clazz) throws NoSuchMethodException {
        return clazz.getConstructor((Class<?>[])new Class[0]);
    }
}
