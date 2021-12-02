// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.Collections;
import android.annotation.SuppressLint;
import androidx.annotation.t0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.List;
import androidx.annotation.k0;
import android.content.Context;
import androidx.annotation.j0;
import androidx.sqlite.db.d;

public class n0
{
    @j0
    public final d.c a;
    @j0
    public final Context b;
    @k0
    public final String c;
    @j0
    public final r2.d d;
    @k0
    public final List<r2.b> e;
    @k0
    public final r2.e f;
    @j0
    public final List<Object> g;
    public final boolean h;
    public final r2.c i;
    @j0
    public final Executor j;
    @j0
    public final Executor k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    private final Set<Integer> o;
    @k0
    public final String p;
    @k0
    public final File q;
    @k0
    public final Callable<InputStream> r;
    
    @Deprecated
    @t0({ t0.a.I })
    public n0(@j0 final Context context, @k0 final String s, @j0 final d.c c, @j0 final r2.d d, @k0 final List<r2.b> list, final boolean b, final r2.c c2, @j0 final Executor executor, @j0 final Executor executor2, final boolean b2, final boolean b3, final boolean b4, @k0 final Set<Integer> set) {
        this(context, s, c, d, list, b, c2, executor, executor2, b2, b3, b4, set, null, null, null, null, null);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public n0(@j0 final Context context, @k0 final String s, @j0 final d.c c, @j0 final r2.d d, @k0 final List<r2.b> list, final boolean b, final r2.c c2, @j0 final Executor executor, @j0 final Executor executor2, final boolean b2, final boolean b3, final boolean b4, @k0 final Set<Integer> set, @k0 final String s2, @k0 final File file) {
        this(context, s, c, d, list, b, c2, executor, executor2, b2, b3, b4, set, s2, file, null, null, null);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public n0(@j0 final Context context, @k0 final String s, @j0 final d.c c, @j0 final r2.d d, @k0 final List<r2.b> list, final boolean b, @j0 final r2.c c2, @j0 final Executor executor, @j0 final Executor executor2, final boolean b2, final boolean b3, final boolean b4, @k0 final Set<Integer> set, @k0 final String s2, @k0 final File file, @k0 final Callable<InputStream> callable) {
        this(context, s, c, d, list, b, c2, executor, executor2, b2, b3, b4, set, s2, file, callable, null, null);
    }
    
    @Deprecated
    @SuppressLint({ "LambdaLast" })
    @t0({ t0.a.I })
    public n0(@j0 final Context context, @k0 final String s, @j0 final d.c c, @j0 final r2.d d, @k0 final List<r2.b> list, final boolean b, @j0 final r2.c c2, @j0 final Executor executor, @j0 final Executor executor2, final boolean b2, final boolean b3, final boolean b4, @k0 final Set<Integer> set, @k0 final String s2, @k0 final File file, @k0 final Callable<InputStream> callable, @k0 final r2.e e) {
        this(context, s, c, d, list, b, c2, executor, executor2, b2, b3, b4, set, s2, file, callable, e, null);
    }
    
    @SuppressLint({ "LambdaLast" })
    @t0({ t0.a.I })
    public n0(@j0 final Context b, @k0 final String c, @j0 final d.c a, @j0 final r2.d d, @k0 final List<r2.b> e, final boolean h, @j0 final r2.c i, @j0 final Executor j, @j0 final Executor k, final boolean l, final boolean m, final boolean n, @k0 final Set<Integer> o, @k0 final String p18, @k0 final File q, @k0 final Callable<InputStream> r, @k0 final r2.e f, @k0 final List<Object> list) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
        this.f = f;
        List<Object> emptyList;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        else {
            emptyList = list;
        }
        this.g = emptyList;
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public n0(@j0 final Context context, @k0 final String s, @j0 final d.c c, @j0 final r2.d d, @k0 final List<r2.b> list, final boolean b, final r2.c c2, @j0 final Executor executor, final boolean b2, @k0 final Set<Integer> set) {
        this(context, s, c, d, list, b, c2, executor, executor, false, b2, false, set, null, null, null, null, null);
    }
    
    public boolean a(final int i, int n) {
        final boolean b = true;
        if (i > n) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0 && this.n) {
            return false;
        }
        if (this.m) {
            final Set<Integer> o = this.o;
            boolean b2 = b;
            if (o == null) {
                return b2;
            }
            if (!o.contains(i)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean b(final int n) {
        return this.a(n, n + 1);
    }
}
