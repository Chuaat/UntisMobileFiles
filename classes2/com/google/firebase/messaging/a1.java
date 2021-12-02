// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.k0;
import androidx.annotation.c1;
import android.content.Context;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import androidx.annotation.w;
import java.lang.ref.WeakReference;

final class a1
{
    @w("TopicsStore.class")
    private static WeakReference<a1> d;
    private final SharedPreferences a;
    private w0 b;
    private final Executor c;
    
    private a1(final SharedPreferences a, final Executor c) {
        this.c = c;
        this.a = a;
    }
    
    @c1
    public static a1 b(final Context context, final Executor executor) {
        synchronized (a1.class) {
            final WeakReference<a1> d = a1.d;
            a1 a1;
            if (d != null) {
                a1 = d.get();
            }
            else {
                a1 = null;
            }
            if (a1 == null) {
                final a1 referent = new a1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                referent.d();
                com.google.firebase.messaging.a1.d = new WeakReference<a1>(referent);
                return referent;
            }
            return a1;
        }
    }
    
    @c1
    private void d() {
        synchronized (this) {
            this.b = w0.d(this.a, "topic_operation_queue", ",", this.c);
        }
    }
    
    boolean a(final z0 z0) {
        synchronized (this) {
            return this.b.a(z0.e());
        }
    }
    
    @k0
    z0 c() {
        synchronized (this) {
            return z0.a(this.b.f());
        }
    }
    
    boolean e(final z0 z0) {
        synchronized (this) {
            return this.b.g(z0.e());
        }
    }
}
