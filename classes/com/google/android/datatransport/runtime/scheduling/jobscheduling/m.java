// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.backends.g;
import java.util.ArrayList;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.Objects;
import com.google.android.datatransport.runtime.scheduling.persistence.i;
import com.google.android.datatransport.runtime.o;
import com.google.android.datatransport.runtime.time.h;
import com.google.android.datatransport.runtime.time.a;
import b2.b;
import java.util.concurrent.Executor;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import com.google.android.datatransport.runtime.backends.e;
import android.content.Context;

public class m
{
    private static final String h = "Uploader";
    private final Context a;
    private final e b;
    private final c c;
    private final s d;
    private final Executor e;
    private final b f;
    private final a g;
    
    @e6.a
    public m(final Context a, final e b, final c c, final s d, final Executor e, final b f, @h final a g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    boolean e() {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    void j(final o o, final int n) {
        final n j = this.b.j(o.b());
        final Iterable<i> iterable = this.f.a((b.a<Iterable<i>>)new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(this, o));
        if (!iterable.iterator().hasNext()) {
            return;
        }
        com.google.android.datatransport.runtime.backends.h h;
        if (j == null) {
            z1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", o);
            h = com.google.android.datatransport.runtime.backends.h.a();
        }
        else {
            final ArrayList<com.google.android.datatransport.runtime.i> list = new ArrayList<com.google.android.datatransport.runtime.i>();
            final Iterator<i> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().b());
            }
            h = j.a(com.google.android.datatransport.runtime.backends.g.a().b(list).c(o.c()).a());
        }
        this.f.a((b.a<Object>)new j(this, h, iterable, o, n));
    }
    
    public void k(final o o, final int n, final Runnable runnable) {
        this.e.execute(new l(this, o, n, runnable));
    }
}
