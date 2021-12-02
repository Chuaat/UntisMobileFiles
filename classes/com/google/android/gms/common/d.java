// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.app.FragmentManager;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

public class d extends DialogFragment
{
    private Dialog G;
    private DialogInterface$OnCancelListener H;
    
    @j0
    public static d a(@RecentlyNonNull final Dialog dialog) {
        return b(dialog, null);
    }
    
    @j0
    public static d b(@RecentlyNonNull Dialog g, @k0 final DialogInterface$OnCancelListener h) {
        final d d = new d();
        g = x.l(g, "Cannot display null dialog");
        g.setOnCancelListener((DialogInterface$OnCancelListener)null);
        g.setOnDismissListener((DialogInterface$OnDismissListener)null);
        d.G = g;
        if (h != null) {
            d.H = h;
        }
        return d;
    }
    
    public void onCancel(@RecentlyNonNull final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener h = this.H;
        if (h != null) {
            h.onCancel(dialogInterface);
        }
    }
    
    @j0
    public Dialog onCreateDialog(@k0 final Bundle bundle) {
        if (this.G == null) {
            this.setShowsDialog(false);
        }
        return this.G;
    }
    
    public void show(@RecentlyNonNull final FragmentManager fragmentManager, @k0 final String s) {
        super.show(fragmentManager, s);
    }
}
