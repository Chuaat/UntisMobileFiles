// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;
import com.google.android.gms.tasks.p;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.google.firebase.components.j;
import com.google.firebase.components.t;
import java.util.List;
import androidx.annotation.b1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import com.google.firebase.components.z;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.Set;
import n3.b;
import java.util.concurrent.ThreadFactory;

public class h implements k
{
    private static final ThreadFactory d;
    private b<l> a;
    private final Set<i> b;
    private final Executor c;
    
    static {
        d = f.G;
    }
    
    private h(final Context context, final Set<i> set) {
        this((b<l>)new z((b)new g(context)), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), h.d));
    }
    
    @b1
    h(final b<l> a, final Set<i> b, final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    public static com.google.firebase.components.f<k> i() {
        return (com.google.firebase.components.f<k>)com.google.firebase.components.f.d((Class)k.class).b(t.j((Class)Context.class)).b(t.l((Class)i.class)).f((j)c.a).d();
    }
    
    @Override
    public com.google.android.gms.tasks.m<Void> a(@j0 final String s) {
        if (this.b.size() <= 0) {
            return (com.google.android.gms.tasks.m<Void>)p.g((Object)null);
        }
        return (com.google.android.gms.tasks.m<Void>)p.d(this.c, (Callable)new e(this, s));
    }
    
    @j0
    @Override
    public a b(@j0 final String s) {
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean i = this.a.get().i(s, currentTimeMillis);
        final boolean h = this.a.get().h(currentTimeMillis);
        if (i && h) {
            return k.a.K;
        }
        if (h) {
            return k.a.J;
        }
        if (i) {
            return k.a.I;
        }
        return k.a.H;
    }
    
    @Override
    public com.google.android.gms.tasks.m<List<m>> c() {
        return (com.google.android.gms.tasks.m<List<m>>)p.d(this.c, (Callable)new d(this));
    }
}
