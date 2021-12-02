// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import android.os.Parcelable;
import androidx.annotation.j0;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.a;
import android.content.Intent;
import androidx.annotation.k0;
import android.os.ResultReceiver;
import android.app.Activity;

public class ProxyBillingActivity extends Activity
{
    @k0
    private ResultReceiver G;
    private boolean H;
    
    private final Intent a() {
        final Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(this.getApplicationContext().getPackageName());
        return intent;
    }
    
    protected void onActivityResult(int n, final int n2, @k0 final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 100) {
            final int b = a.g(intent, "ProxyBillingActivity").b();
            Label_0101: {
                if ((n = n2) == -1) {
                    if (b == 0) {
                        n = 0;
                        break Label_0101;
                    }
                    n = -1;
                }
                final StringBuilder sb = new StringBuilder(85);
                sb.append("Activity finished with resultCode ");
                sb.append(n);
                sb.append(" and billing's responseCode: ");
                sb.append(b);
                a.k("ProxyBillingActivity", sb.toString());
                n = b;
            }
            final ResultReceiver g = this.G;
            if (g != null) {
                Bundle extras;
                if (intent == null) {
                    extras = null;
                }
                else {
                    extras = intent.getExtras();
                }
                g.send(n, extras);
            }
            else {
                final Intent a = this.a();
                if (intent != null) {
                    if (intent.getExtras() != null) {
                        a.putExtras(intent.getExtras());
                    }
                    else {
                        com.google.android.gms.internal.play_billing.a.k("ProxyBillingActivity", "Got null bundle!");
                        a.putExtra("RESPONSE_CODE", 6);
                        a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                }
                this.sendBroadcast(a);
            }
        }
        else {
            final StringBuilder sb2 = new StringBuilder(69);
            sb2.append("Got onActivityResult with wrong requestCode: ");
            sb2.append(n);
            sb2.append("; skipping...");
            a.k("ProxyBillingActivity", sb2.toString());
        }
        this.H = false;
        this.finish();
    }
    
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a.j("ProxyBillingActivity", "Launching Play Store billing flow");
            PendingIntent pendingIntent;
            if (this.getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent)this.getIntent().getParcelableExtra("BUY_INTENT");
            }
            else if (this.getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent)this.getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.G = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            }
            else {
                pendingIntent = null;
            }
            try {
                this.H = true;
                this.startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                return;
            }
            catch (IntentSender$SendIntentException obj) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 53);
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(value);
                a.k("ProxyBillingActivity", sb.toString());
                final ResultReceiver g = this.G;
                if (g != null) {
                    g.send(6, (Bundle)null);
                }
                else {
                    final Intent a = this.a();
                    a.putExtra("RESPONSE_CODE", 6);
                    a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    this.sendBroadcast(a);
                }
                this.H = false;
                this.finish();
                return;
            }
        }
        a.j("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.H = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.G = (ResultReceiver)bundle.getParcelable("result_receiver");
        }
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (!this.isFinishing()) {
            return;
        }
        if (!this.H) {
            return;
        }
        final Intent a = this.a();
        a.putExtra("RESPONSE_CODE", 1);
        a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        this.sendBroadcast(a);
    }
    
    protected void onSaveInstanceState(@j0 final Bundle bundle) {
        final ResultReceiver g = this.G;
        if (g != null) {
            bundle.putParcelable("result_receiver", (Parcelable)g);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.H);
    }
}
