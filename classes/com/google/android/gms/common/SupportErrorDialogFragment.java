// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.content.DialogInterface$OnDismissListener;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment
{
    private Dialog h0;
    private DialogInterface$OnCancelListener i0;
    
    @j0
    public static SupportErrorDialogFragment N(@RecentlyNonNull final Dialog dialog) {
        return O(dialog, null);
    }
    
    @j0
    public static SupportErrorDialogFragment O(@RecentlyNonNull Dialog h0, @k0 final DialogInterface$OnCancelListener i0) {
        final SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        h0 = x.l(h0, "Cannot display null dialog");
        h0.setOnCancelListener((DialogInterface$OnCancelListener)null);
        h0.setOnDismissListener((DialogInterface$OnDismissListener)null);
        supportErrorDialogFragment.h0 = h0;
        if (i0 != null) {
            supportErrorDialogFragment.i0 = i0;
        }
        return supportErrorDialogFragment;
    }
    
    @j0
    @Override
    public Dialog B(@k0 final Bundle bundle) {
        if (this.h0 == null) {
            this.H(false);
        }
        return this.h0;
    }
    
    @Override
    public void L(@RecentlyNonNull final FragmentManager fragmentManager, @k0 final String s) {
        super.L(fragmentManager, s);
    }
    
    @Override
    public void onCancel(@RecentlyNonNull final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener i0 = this.i0;
        if (i0 != null) {
            i0.onCancel(dialogInterface);
        }
    }
}
