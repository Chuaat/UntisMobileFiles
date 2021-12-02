// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.iid;

import com.google.firebase.messaging.l0;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.c1;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import com.google.android.gms.tasks.m;
import com.google.firebase.messaging.p;
import com.google.android.gms.cloudmessaging.a;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.gms.cloudmessaging.b;

public final class FirebaseInstanceIdReceiver extends b
{
    @c1
    protected final int b(@j0 final Context ex, @j0 final a a) {
        try {
            return (int)com.google.android.gms.tasks.p.a((m)new p((Context)ex).g(a.Q1()));
        }
        catch (InterruptedException ex) {}
        catch (ExecutionException ex2) {}
        Log.e("FirebaseMessaging", "Failed to send message to service.", (Throwable)ex);
        return 500;
    }
    
    @c1
    protected final void c(@j0 final Context context, @j0 final Bundle bundle) {
        final Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (l0.B(putExtras)) {
            l0.s(putExtras);
        }
    }
}
