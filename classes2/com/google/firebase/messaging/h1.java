// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.f;
import android.util.Log;
import android.os.Process;
import com.google.android.gms.tasks.m;
import android.os.Binder;

class h1 extends Binder
{
    private final a e;
    
    h1(final a e) {
        this.e = e;
    }
    
    void b(final k1.a a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.e.a(a.a).f(f1.G, (f)new g1(a));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
    
    interface a
    {
        m<Void> a(final Intent p0);
    }
}
