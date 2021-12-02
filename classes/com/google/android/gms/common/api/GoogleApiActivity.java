// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.g;
import android.content.ActivityNotFoundException;
import android.os.Build;
import android.content.IntentSender$SendIntentException;
import android.util.Log;
import androidx.annotation.k0;
import android.os.Bundle;
import android.content.DialogInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.internal.i;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.annotation.KeepName;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface$OnCancelListener
{
    @d0
    private int G;
    
    public GoogleApiActivity() {
        this.G = 0;
    }
    
    @RecentlyNonNull
    public static PendingIntent a(@RecentlyNonNull final Context context, @RecentlyNonNull final PendingIntent pendingIntent, @RecentlyNonNull final int n) {
        return PendingIntent.getActivity(context, 0, b(context, pendingIntent, n, true), 134217728);
    }
    
    @RecentlyNonNull
    public static Intent b(@RecentlyNonNull final Context context, @RecentlyNonNull final PendingIntent pendingIntent, @RecentlyNonNull final int n, @RecentlyNonNull final boolean b) {
        final Intent intent = new Intent(context, (Class)GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", n);
        intent.putExtra("notify_manager", b);
        return intent;
    }
    
    protected void onActivityResult(@RecentlyNonNull final int n, @RecentlyNonNull final int n2, @RecentlyNonNull final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1) {
            final boolean booleanExtra = this.getIntent().getBooleanExtra("notify_manager", true);
            this.G = 0;
            this.setResult(n2, intent);
            if (booleanExtra) {
                final i e = i.e((Context)this);
                if (n2 != -1) {
                    if (n2 == 0) {
                        e.r(new c(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
                else {
                    e.v();
                }
            }
        }
        else if (n == 2) {
            this.G = 0;
            this.setResult(n2, intent);
        }
        this.finish();
    }
    
    public void onCancel(@RecentlyNonNull final DialogInterface dialogInterface) {
        this.setResult(this.G = 0);
        this.finish();
    }
    
    protected void onCreate(@k0 Bundle obj) {
        super.onCreate(obj);
        if (obj != null) {
            this.G = obj.getInt("resolution");
        }
        if (this.G != 1) {
            final Bundle extras = this.getIntent().getExtras();
            Label_0049: {
                String s;
                if (extras == null) {
                    s = "Activity started without extras";
                }
                else {
                    obj = (Bundle)extras.get("pending_intent");
                    final Integer n = (Integer)extras.get("error_code");
                    if (obj != null || n != null) {
                        if (obj != null) {
                            try {
                                this.startIntentSenderForResult(((PendingIntent)obj).getIntentSender(), 1, (Intent)null, 0, 0, 0);
                                this.G = 1;
                                return;
                            }
                            catch (IntentSender$SendIntentException ex) {
                                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)ex);
                                break Label_0049;
                            }
                            catch (ActivityNotFoundException ex2) {
                                if (extras.getBoolean("notify_manager", true)) {
                                    i.e((Context)this).r(new c(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
                                }
                                else {
                                    final String value = String.valueOf(obj);
                                    final StringBuilder sb = new StringBuilder(value.length() + 36);
                                    sb.append("Activity not found while launching ");
                                    sb.append(value);
                                    sb.append(".");
                                    String obj2 = sb.toString();
                                    if (Build.FINGERPRINT.contains("generic")) {
                                        obj2 = String.valueOf(obj2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                                    }
                                    Log.e("GoogleApiActivity", obj2, (Throwable)ex2);
                                }
                                this.G = 1;
                                break Label_0049;
                            }
                        }
                        g.y().C(this, x.k(n), 2, (DialogInterface$OnCancelListener)this);
                        this.G = 1;
                        return;
                    }
                    s = "Activity started without resolution";
                }
                Log.e("GoogleApiActivity", s);
            }
            this.finish();
        }
    }
    
    protected void onSaveInstanceState(@RecentlyNonNull final Bundle bundle) {
        bundle.putInt("resolution", this.G);
        super.onSaveInstanceState(bundle);
    }
}
