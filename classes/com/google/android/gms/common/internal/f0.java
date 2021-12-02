// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import com.google.android.gms.common.api.internal.m;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;
import androidx.annotation.k0;
import android.content.Intent;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

public abstract class f0 implements DialogInterface$OnClickListener
{
    public static f0 a(final Activity activity, @k0 final Intent intent, final int n) {
        return new i0(intent, activity, n);
    }
    
    public static f0 b(@j0 final Fragment fragment, @k0 final Intent intent, final int n) {
        return new h0(intent, fragment, n);
    }
    
    public static f0 c(@j0 final m m, @k0 final Intent intent, final int n) {
        return new com.google.android.gms.common.internal.j0(intent, m, 2);
    }
    
    protected abstract void d();
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.d();
                dialogInterface.dismiss();
                return;
            }
            finally {}
        }
        catch (ActivityNotFoundException ex) {
            String concat = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains("generic")) {
                concat = "Failed to start resolution intent.".concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
            }
            Log.e("DialogRedirect", concat, (Throwable)ex);
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
    }
}
