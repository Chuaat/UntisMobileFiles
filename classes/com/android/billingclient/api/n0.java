// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import android.content.Intent;
import com.google.android.gms.internal.play_billing.a;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

final class n0 extends BroadcastReceiver
{
    private final o a = a;
    private boolean b;
    final /* synthetic */ o0 c;
    
    public final void b(final Context context, final IntentFilter intentFilter) {
        if (!this.b) {
            context.registerReceiver((BroadcastReceiver)this.c.b, intentFilter);
            this.b = true;
        }
    }
    
    public final void c(final Context context) {
        if (this.b) {
            context.unregisterReceiver((BroadcastReceiver)this.c.b);
            this.b = false;
            return;
        }
        com.google.android.gms.internal.play_billing.a.k("BillingBroadcastManager", "Receiver is not registered.");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.c(com.google.android.gms.internal.play_billing.a.g(intent, "BillingBroadcastManager"), com.google.android.gms.internal.play_billing.a.i(intent.getExtras()));
    }
}
