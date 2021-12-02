// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.clearcut;

import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.t6;
import java.util.TimeZone;
import com.google.android.gms.internal.clearcut.i6;
import java.util.ArrayList;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.internal.clearcut.r6;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.clearcut.e3;
import c6.h;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.clearcut.l5;
import android.content.Context;
import com.google.android.gms.phenotype.b;
import com.google.android.gms.internal.clearcut.l6;

@a
public final class a
{
    private static final com.google.android.gms.common.api.a.g<l6> n;
    private static final a.a<l6, com.google.android.gms.common.api.a.d.d> o;
    @Deprecated
    public static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.d> p;
    private static final com.google.android.gms.phenotype.b[] q;
    private static final String[] r;
    private static final byte[][] s;
    private final Context a;
    private final String b;
    private final int c;
    private String d;
    private int e;
    private String f;
    private String g;
    private final boolean h;
    private l5.v.b i;
    private final com.google.android.gms.clearcut.d j;
    private final g k;
    private d l;
    private final b m;
    
    static {
        p = new com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.d>("ClearcutLogger.API", o = new com.google.android.gms.clearcut.c(), n = new com.google.android.gms.common.api.a.g());
        q = new com.google.android.gms.phenotype.b[0];
        r = new String[0];
        s = new byte[0][];
    }
    
    @d0
    private a(final Context a, final int n, final String d, final String f, final String s, final boolean h, final com.google.android.gms.clearcut.d j, final g k, final d d2, final b m) {
        this.e = -1;
        final l5.v.b h2 = l5.v.b.H;
        this.i = h2;
        this.a = a;
        this.b = a.getPackageName();
        this.c = c(a);
        this.e = -1;
        this.d = d;
        this.f = f;
        this.g = null;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = new d();
        this.i = h2;
        this.m = m;
        if (h) {
            x.b(f == null, "can't be anonymous with an upload account");
        }
    }
    
    @a
    public a(final Context context, final String s, @h final String s2) {
        this(context, -1, s, s2, null, false, e3.A(context), com.google.android.gms.common.util.k.e(), null, (b)new r6(context));
    }
    
    @a
    public static a a(final Context context, final String s) {
        return new a(context, -1, s, null, null, true, e3.A(context), k.e(), null, (b)new r6(context));
    }
    
    private static int c(final Context context) {
        int versionCode = 0;
        try {
            versionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.wtf("ClearcutLogger", "This can't happen.", (Throwable)ex);
        }
        return versionCode;
    }
    
    private static int[] e(final ArrayList<Integer> list) {
        if (list == null) {
            return null;
        }
        final int[] array = new int[list.size()];
        Integer value;
        for (int size = list.size(), i = 0, n = 0; i < size; ++i, array[n] = value, ++n) {
            value = list.get(i);
        }
        return array;
    }
    
    static /* synthetic */ int[] g(final ArrayList list) {
        return e(null);
    }
    
    @a
    public final a b(@h final byte[] array) {
        return new a(array, (com.google.android.gms.clearcut.c)null);
    }
    
    public class a
    {
        private int a;
        private String b;
        private String c;
        private String d;
        private l5.v.b e;
        private final c f;
        private ArrayList<Integer> g;
        private ArrayList<String> h;
        private ArrayList<Integer> i;
        private ArrayList<com.google.android.gms.phenotype.b> j;
        private ArrayList<byte[]> k;
        private boolean l;
        private final i6 m;
        private boolean n;
        
        private a(final com.google.android.gms.clearcut.a a, final byte[] array) {
            this(a, array, (c)null);
        }
        
        private a(final byte[] t, final c c) {
            this.a = com.google.android.gms.clearcut.a.this.e;
            this.b = com.google.android.gms.clearcut.a.this.d;
            this.c = com.google.android.gms.clearcut.a.this.f;
            this.d = null;
            this.e = com.google.android.gms.clearcut.a.this.i;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = true;
            final i6 m = new i6();
            this.m = m;
            this.n = false;
            this.c = com.google.android.gms.clearcut.a.this.f;
            this.d = null;
            m.g0 = com.google.android.gms.internal.clearcut.b.a(com.google.android.gms.clearcut.a.this.a);
            m.I = com.google.android.gms.clearcut.a.this.k.a();
            m.J = com.google.android.gms.clearcut.a.this.k.d();
            com.google.android.gms.clearcut.a.this.l;
            m.Y = TimeZone.getDefault().getOffset(m.I) / 1000;
            if (t != null) {
                m.T = t;
            }
            this.f = null;
        }
        
        @f2.a
        public void a() {
            if (this.n) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.n = true;
            final com.google.android.gms.clearcut.g g = new com.google.android.gms.clearcut.g(new t6(com.google.android.gms.clearcut.a.this.b, com.google.android.gms.clearcut.a.this.c, this.a, this.b, this.c, this.d, com.google.android.gms.clearcut.a.this.h, this.e), this.m, null, null, com.google.android.gms.clearcut.a.g(null), null, com.google.android.gms.clearcut.a.g(null), null, null, this.l);
            if (com.google.android.gms.clearcut.a.this.m.a(g)) {
                com.google.android.gms.clearcut.a.this.j.a(g);
                return;
            }
            com.google.android.gms.common.api.o.g(Status.L, null);
        }
        
        @f2.a
        public a b(final int m) {
            this.m.M = m;
            return this;
        }
    }
    
    public interface b
    {
        boolean a(final com.google.android.gms.clearcut.g p0);
    }
    
    public interface c
    {
        byte[] zza();
    }
    
    public static final class d
    {
    }
}
