// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import android.content.res.Resources;
import androidx.core.content.res.d;
import android.content.Context;
import java.lang.reflect.GenericDeclaration;
import android.util.Log;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.system.Os;
import java.io.File;
import androidx.annotation.j0;
import android.os.ParcelFileDescriptor;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(21)
@t0({ t0.a.I })
class y extends d0
{
    private static final String d = "TypefaceCompatApi21Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static Class<?> h;
    private static Constructor<?> i;
    private static Method j;
    private static Method k;
    private static boolean l = false;
    
    private static boolean k(final Object ex, final String s, final int i, final boolean b) {
        n();
        try {
            return (boolean)y.j.invoke(ex, s, i, b);
        }
        catch (InvocationTargetException ex) {}
        catch (IllegalAccessException ex2) {}
        throw new RuntimeException(ex);
    }
    
    private static Typeface l(Object cause) {
        n();
        try {
            final Object instance = Array.newInstance(y.h, 1);
            Array.set(instance, 0, cause);
            cause = (InvocationTargetException)y.k.invoke(null, instance);
            return (Typeface)cause;
        }
        catch (InvocationTargetException cause) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException(cause);
    }
    
    private File m(@j0 final ParcelFileDescriptor parcelFileDescriptor) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            final String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        }
        catch (ErrnoException ex) {
            return null;
        }
    }
    
    private static void n() {
        if (y.l) {
            return;
        }
        y.l = true;
        Constructor<?> i = null;
        GenericDeclaration forName = null;
        GenericDeclaration method = null;
        Method method2 = null;
        Label_0122: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                final Constructor<?> constructor = ((Class<?>)forName).getConstructor((Class<?>[])new Class[0]);
                method = ((Class)forName).getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>)forName, 1).getClass());
                i = constructor;
                break Label_0122;
            }
            catch (NoSuchMethodException method2) {}
            catch (ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi21Impl", ((NoSuchMethodException)method2).getClass().getName(), (Throwable)method2);
            final Method method3 = null;
            method = (forName = method3);
            method2 = method3;
        }
        y.i = i;
        y.h = (Class<?>)forName;
        y.j = (Method)method;
        y.k = method2;
    }
    
    private static Object o() {
        n();
        Object instance = null;
        try {
            instance = y.i.newInstance(new Object[0]);
            return instance;
        }
        catch (InvocationTargetException instance) {}
        catch (InstantiationException instance) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException((Throwable)instance);
    }
    
    @Override
    public Typeface b(final Context context, d.c e, final Resources resources, int i) {
        final Object o = o();
        final d.d[] a = e.a();
        final int length = a.length;
        i = 0;
        while (i < length) {
            final d.d d = a[i];
            e = (d.c)e0.e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!e0.c((File)e, resources, d.b())) {
                    return null;
                }
                final boolean k = k(o, ((File)e).getPath(), d.e(), d.f());
                ((File)e).delete();
                if (!k) {
                    return null;
                }
                ++i;
                continue;
            }
            catch (RuntimeException ex) {
                return null;
            }
            finally {
                ((File)e).delete();
            }
            break;
        }
        return l(o);
    }
    
    @Override
    public Typeface c(final Context context, CancellationSignal openFileDescriptor, @j0 f.c[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        final f.c h = this.h(array, n);
        final ContentResolver contentResolver = context.getContentResolver();
        try {
            openFileDescriptor = (CancellationSignal)contentResolver.openFileDescriptor(h.d(), "r", openFileDescriptor);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                return null;
            }
            try {
                final File m = this.m((ParcelFileDescriptor)openFileDescriptor);
                if (m != null && m.canRead()) {
                    final Typeface fromFile = Typeface.createFromFile(m);
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return fromFile;
                }
                array = (f.c[])(Object)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                try {
                    final Typeface d = super.d(context, (InputStream)(Object)array);
                    ((FileInputStream)(Object)array).close();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return d;
                }
                finally {
                    try {
                        ((FileInputStream)(Object)array).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)context).addSuppressed(exception);
                    }
                }
            }
            finally {
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable exception2;
                    ((Throwable)context).addSuppressed(exception2);
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
}
