// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.os.Handler;
import androidx.core.content.res.g;
import android.content.res.Resources;
import androidx.core.content.res.d;
import androidx.core.provider.f;
import android.os.CancellationSignal;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import androidx.collection.j;
import android.annotation.SuppressLint;

@SuppressLint({ "NewApi" })
public class x
{
    private static final d0 a;
    private static final j<String, Typeface> b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        d0 a2;
        if (sdk_INT >= 29) {
            a2 = new c0();
        }
        else if (sdk_INT >= 28) {
            a2 = new b0();
        }
        else if (sdk_INT >= 26) {
            a2 = new a0();
        }
        else if (sdk_INT >= 24 && z.m()) {
            a2 = new z();
        }
        else if (sdk_INT >= 21) {
            a2 = new y();
        }
        else {
            a2 = new d0();
        }
        a = a2;
        b = new j<String, Typeface>(16);
    }
    
    private x() {
    }
    
    @b1
    @t0({ t0.a.I })
    public static void a() {
        x.b.d();
    }
    
    @j0
    public static Typeface b(@j0 final Context context, @k0 final Typeface typeface, final int n) {
        if (context != null) {
            if (Build$VERSION.SDK_INT < 21) {
                final Typeface h = h(context, typeface, n);
                if (h != null) {
                    return h;
                }
            }
            return Typeface.create(typeface, n);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
    
    @k0
    @t0({ t0.a.I })
    public static Typeface c(@j0 final Context context, @k0 final CancellationSignal cancellationSignal, @j0 final f.c[] array, final int n) {
        return x.a.c(context, cancellationSignal, array, n);
    }
    
    @k0
    @t0({ t0.a.I })
    public static Typeface d(@j0 final Context context, @j0 final d.a a, @j0 final Resources resources, final int n, final int n2, @k0 final g.c c, @k0 Handler c2, final boolean b) {
        Typeface typeface;
        if (a instanceof d.e) {
            final d.e e = (d.e)a;
            final Typeface i = i(e.c());
            if (i != null) {
                if (c != null) {
                    c.b(i, c2);
                }
                return i;
            }
            final boolean b2 = b ? (e.a() == 0) : (c == null);
            int d;
            if (b) {
                d = e.d();
            }
            else {
                d = -1;
            }
            c2 = g.c.c(c2);
            typeface = f.f(context, e.b(), n2, b2, d, c2, (f.d)new a(c));
        }
        else {
            final Typeface typeface2 = typeface = x.a.b(context, (d.c)a, resources, n2);
            if (c != null) {
                if (typeface2 != null) {
                    c.b(typeface2, c2);
                    typeface = typeface2;
                }
                else {
                    c.a(-3, c2);
                    typeface = typeface2;
                }
            }
        }
        if (typeface != null) {
            x.b.j(f(resources, n, n2), typeface);
        }
        return typeface;
    }
    
    @k0
    @t0({ t0.a.I })
    public static Typeface e(@j0 final Context context, @j0 final Resources resources, final int n, final String s, final int n2) {
        final Typeface e = x.a.e(context, resources, n, s, n2);
        if (e != null) {
            x.b.j(f(resources, n, n2), e);
        }
        return e;
    }
    
    private static String f(final Resources resources, final int i, final int j) {
        final StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(j);
        return sb.toString();
    }
    
    @k0
    @t0({ t0.a.I })
    public static Typeface g(@j0 final Resources resources, final int n, final int n2) {
        return x.b.f(f(resources, n, n2));
    }
    
    @k0
    private static Typeface h(final Context context, final Typeface typeface, final int n) {
        final d0 a = x.a;
        final d.c i = a.i(typeface);
        if (i == null) {
            return null;
        }
        return a.b(context, i, context.getResources(), n);
    }
    
    private static Typeface i(@k0 final String s) {
        Typeface typeface2;
        final Typeface typeface = typeface2 = null;
        if (s != null) {
            if (s.isEmpty()) {
                typeface2 = typeface;
            }
            else {
                final Typeface create = Typeface.create(s, 0);
                final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                typeface2 = typeface;
                if (create != null) {
                    typeface2 = typeface;
                    if (!create.equals((Object)create2)) {
                        typeface2 = create;
                    }
                }
            }
        }
        return typeface2;
    }
    
    @t0({ t0.a.G })
    public static class a extends d
    {
        @k0
        private g.c j;
        
        public a(@k0 final g.c j) {
            this.j = j;
        }
        
        @Override
        public void a(final int n) {
            final g.c j = this.j;
            if (j != null) {
                j.d(n);
            }
        }
        
        @Override
        public void b(@j0 final Typeface typeface) {
            final g.c j = this.j;
            if (j != null) {
                j.e(typeface);
            }
        }
    }
}
