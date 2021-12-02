// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import androidx.annotation.j0;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.Field;
import android.util.Log;
import androidx.annotation.k0;
import android.graphics.Typeface;
import android.annotation.SuppressLint;
import androidx.core.content.res.d;
import java.util.concurrent.ConcurrentHashMap;
import androidx.annotation.t0;

@t0({ t0.a.I })
class d0
{
    private static final String b = "TypefaceCompatBaseImpl";
    private static final int c = 0;
    @SuppressLint({ "BanConcurrentHashMap" })
    private ConcurrentHashMap<Long, d.c> a;
    
    d0() {
        this.a = new ConcurrentHashMap<Long, d.c>();
    }
    
    private void a(final Typeface typeface, final d.c value) {
        final long j = j(typeface);
        if (j != 0L) {
            this.a.put(j, value);
        }
    }
    
    private d.d f(final d.c c, final int n) {
        return g(c.a(), n, (c<d.d>)new c<d.d>() {
            public int c(final d.d d) {
                return d.e();
            }
            
            public boolean d(final d.d d) {
                return d.f();
            }
        });
    }
    
    private static <T> T g(final T[] array, int i, final c<T> c) {
        int n;
        if ((i & 0x1) == 0x0) {
            n = 400;
        }
        else {
            n = 700;
        }
        final boolean b = (i & 0x2) != 0x0;
        T t = null;
        int n2 = Integer.MAX_VALUE;
        int length;
        T t2;
        int abs;
        int n3;
        int n4;
        int n5;
        for (length = array.length, i = 0; i < length; ++i, n2 = n5) {
            t2 = array[i];
            abs = Math.abs(c.a(t2) - n);
            if (c.b(t2) == b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            n4 = abs * 2 + n3;
            if (t == null || (n5 = n2) > n4) {
                t = t2;
                n5 = n4;
            }
        }
        return t;
    }
    
    private static long j(@k0 final Typeface obj) {
        if (obj == null) {
            return 0L;
        }
        try {
            final Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number)declaredField.get(obj)).longValue();
        }
        catch (IllegalAccessException ex) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", (Throwable)ex);
            return 0L;
        }
        catch (NoSuchFieldException ex2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", (Throwable)ex2);
            return 0L;
        }
    }
    
    @k0
    public Typeface b(final Context context, final d.c c, final Resources resources, final int n) {
        final d.d f = this.f(c, n);
        if (f == null) {
            return null;
        }
        final Typeface e = x.e(context, resources, f.b(), f.a(), n);
        this.a(e, c);
        return e;
    }
    
    @k0
    public Typeface c(final Context context, @k0 final CancellationSignal cancellationSignal, @j0 final f.c[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        final f.c h = this.h(array, n);
        try {
            final InputStream openInputStream = context.getContentResolver().openInputStream(h.d());
            try {
                final Typeface d = this.d(context, openInputStream);
                e0.a(openInputStream);
                return d;
            }
            catch (IOException ex) {}
        }
        catch (IOException ex2) {}
    }
    
    protected Typeface d(Context e, final InputStream inputStream) {
        e = (Context)e0.e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!e0.d((File)e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(((File)e).getPath());
        }
        catch (RuntimeException ex) {
            return null;
        }
        finally {
            ((File)e).delete();
        }
    }
    
    @k0
    public Typeface e(Context e, final Resources resources, final int n, final String s, final int n2) {
        e = (Context)e0.e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!e0.c((File)e, resources, n)) {
                return null;
            }
            return Typeface.createFromFile(((File)e).getPath());
        }
        catch (RuntimeException ex) {
            return null;
        }
        finally {
            ((File)e).delete();
        }
    }
    
    protected f.c h(final f.c[] array, final int n) {
        return g(array, n, (c<f.c>)new c<f.c>() {
            public int c(final f.c c) {
                return c.e();
            }
            
            public boolean d(final f.c c) {
                return c.f();
            }
        });
    }
    
    @k0
    d.c i(final Typeface typeface) {
        final long j = j(typeface);
        if (j == 0L) {
            return null;
        }
        return this.a.get(j);
    }
    
    private interface c<T>
    {
        int a(final T p0);
        
        boolean b(final T p0);
    }
}
