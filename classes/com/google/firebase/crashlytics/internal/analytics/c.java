// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.analytics;

import com.google.firebase.crashlytics.internal.f;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a
{
    static final String g = "_ae";
    private final e a;
    private final int b;
    private final TimeUnit c;
    private final Object d;
    private CountDownLatch e;
    private boolean f;
    
    public c(@j0 final e a, final int b, final TimeUnit c) {
        this.d = new Object();
        this.f = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void S(@j0 final String anObject, @j0 final Bundle bundle) {
        final CountDownLatch e = this.e;
        if (e == null) {
            return;
        }
        if ("_ae".equals(anObject)) {
            e.countDown();
        }
    }
    
    @Override
    public void a(@j0 final String str, @k0 final Bundle obj) {
        synchronized (this.d) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Logging event ");
            sb.append(str);
            sb.append(" to Firebase Analytics with params ");
            sb.append(obj);
            f.k(sb.toString());
            this.e = new CountDownLatch(1);
            this.f = false;
            this.a.a(str, obj);
            com.google.firebase.crashlytics.internal.f.f().k("Awaiting app exception callback from Analytics...");
            try {
                if (this.e.await(this.b, this.c)) {
                    this.f = true;
                    com.google.firebase.crashlytics.internal.f.f().k("App exception callback received from Analytics listener.");
                }
                else {
                    com.google.firebase.crashlytics.internal.f.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            }
            catch (InterruptedException ex) {
                com.google.firebase.crashlytics.internal.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }
    
    boolean b() {
        return this.f;
    }
}
