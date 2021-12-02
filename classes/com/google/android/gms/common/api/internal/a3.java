// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.c;
import android.util.Log;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.k0;
import android.util.SparseArray;

public class a3 extends c3
{
    private final SparseArray<a> L;
    
    private a3(final m m) {
        super(m);
        this.L = (SparseArray<a>)new SparseArray();
        super.G.b("AutoManageHelper", this);
    }
    
    public static a3 r(final l l) {
        final m e = LifecycleCallback.e(l);
        final a3 a3 = e.e("AutoManageHelper", a3.class);
        if (a3 != null) {
            return a3;
        }
        return new a3(e);
    }
    
    @k0
    private final a u(final int n) {
        if (this.L.size() <= n) {
            return null;
        }
        final SparseArray<a> l = this.L;
        return (a)l.get(l.keyAt(n));
    }
    
    @Override
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        for (int i = 0; i < this.L.size(); ++i) {
            final a u = this.u(i);
            if (u != null) {
                printWriter.append(s).append("GoogleApiClient #").print(u.e);
                printWriter.println(":");
                u.f.i(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
            }
        }
    }
    
    @Override
    public void k() {
        super.k();
        final boolean h = super.H;
        final String value = String.valueOf(this.L);
        final StringBuilder sb = new StringBuilder(value.length() + 14);
        sb.append("onStart ");
        sb.append(h);
        sb.append(" ");
        sb.append(value);
        Log.d("AutoManageHelper", sb.toString());
        if (super.I.get() == null) {
            for (int i = 0; i < this.L.size(); ++i) {
                final a u = this.u(i);
                if (u != null) {
                    u.f.f();
                }
            }
        }
    }
    
    @Override
    public void l() {
        super.l();
        for (int i = 0; i < this.L.size(); ++i) {
            final a u = this.u(i);
            if (u != null) {
                u.f.h();
            }
        }
    }
    
    @Override
    protected final void n() {
        for (int i = 0; i < this.L.size(); ++i) {
            final a u = this.u(i);
            if (u != null) {
                u.f.f();
            }
        }
    }
    
    @Override
    protected final void o(final c c, final int n) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (n < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", (Throwable)new Exception());
            return;
        }
        final a a = (a)this.L.get(n);
        if (a != null) {
            this.s(n);
            final k.c g = a.g;
            if (g != null) {
                g.onConnectionFailed(c);
            }
        }
    }
    
    public final void s(final int n) {
        final a a = (a)this.L.get(n);
        this.L.remove(n);
        if (a != null) {
            a.f.F((k.c)a);
            a.f.h();
        }
    }
    
    public final void t(final int n, final k obj, @k0 final k.c c) {
        x.l(obj, "GoogleApiClient instance cannot be null");
        final boolean b = this.L.indexOfKey(n) < 0;
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(n);
        x.r(b, sb.toString());
        final e3 obj2 = super.I.get();
        final boolean h = super.H;
        final String value = String.valueOf(obj2);
        final StringBuilder sb2 = new StringBuilder(value.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(n);
        sb2.append(" ");
        sb2.append(h);
        sb2.append(" ");
        sb2.append(value);
        Log.d("AutoManageHelper", sb2.toString());
        final a a = new a(n, obj, c);
        obj.B((k.c)a);
        this.L.put(n, (Object)a);
        if (super.H && obj2 == null) {
            final String value2 = String.valueOf(obj);
            final StringBuilder sb3 = new StringBuilder(value2.length() + 11);
            sb3.append("connecting ");
            sb3.append(value2);
            Log.d("AutoManageHelper", sb3.toString());
            obj.f();
        }
    }
    
    private final class a implements c
    {
        public final int e;
        public final k f;
        @k0
        public final c g;
        
        public a(final int e, @k0 final k f, final c g) {
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void onConnectionFailed(@j0 final com.google.android.gms.common.c obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(value);
            Log.d("AutoManageHelper", sb.toString());
            a3.this.q(obj, this.e);
        }
    }
}
