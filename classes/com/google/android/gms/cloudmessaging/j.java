// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.m;
import java.util.concurrent.ThreadFactory;
import com.google.android.gms.internal.cloudmessaging.f;
import com.google.android.gms.common.util.concurrent.b;
import androidx.annotation.b1;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import d6.a;
import androidx.annotation.k0;

public final class j
{
    @k0
    @a("MessengerIpcClient.class")
    private static j e;
    private final Context a;
    private final ScheduledExecutorService b;
    @a("this")
    private k c;
    @a("this")
    private int d;
    
    @b1
    private j(final Context context, final ScheduledExecutorService b) {
        this.c = new k(this, null);
        this.d = 1;
        this.b = b;
        this.a = context.getApplicationContext();
    }
    
    private final int a() {
        synchronized (this) {
            return this.d++;
        }
    }
    
    public static j c(final Context context) {
        synchronized (j.class) {
            if (j.e == null) {
                j.e = new j(context, com.google.android.gms.internal.cloudmessaging.a.a().a(1, new b("MessengerIpcClient"), f.b));
            }
            return j.e;
        }
    }
    
    private final <T> m<T> e(final v<T> obj) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 9);
                sb.append("Queueing ");
                sb.append(value);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.c.e(obj)) {
                (this.c = new k(this, null)).e(obj);
            }
            return obj.b.a();
        }
    }
    
    public final m<Void> d(final int n, final Bundle bundle) {
        return this.e((v<Void>)new s(this.a(), 2, bundle));
    }
    
    public final m<Bundle> f(final int n, final Bundle bundle) {
        return this.e((v<Bundle>)new x(this.a(), 1, bundle));
    }
}
