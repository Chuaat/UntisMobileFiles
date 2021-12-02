// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.w0;
import androidx.fragment.app.DialogFragment;

public class ConfirmationDialog extends DialogFragment
{
    private c h0;
    @w0
    private int i0;
    @w0
    private int j0;
    @w0
    private int k0;
    
    public ConfirmationDialog() {
        this.i0 = 2131886663;
        this.j0 = 2131886664;
        this.k0 = 2131886655;
    }
    
    @j0
    public static ConfirmationDialog O(@j0 final c h0) {
        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.h0 = h0;
        confirmationDialog.i0 = 2131886287;
        confirmationDialog.j0 = 2131886660;
        confirmationDialog.k0 = 2131886649;
        return confirmationDialog;
    }
    
    @j0
    public static ConfirmationDialog P(@j0 final c h0) {
        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.h0 = h0;
        confirmationDialog.i0 = 2131886570;
        confirmationDialog.j0 = 2131886660;
        confirmationDialog.k0 = 2131886649;
        return confirmationDialog;
    }
    
    @j0
    public static ConfirmationDialog Q(@j0 final c h0) {
        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.h0 = h0;
        confirmationDialog.i0 = 2131886257;
        confirmationDialog.j0 = 2131886660;
        confirmationDialog.k0 = 2131886649;
        return confirmationDialog;
    }
    
    @j0
    public static ConfirmationDialog R(@j0 final c h0) {
        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.h0 = h0;
        return confirmationDialog;
    }
    
    @j0
    public static ConfirmationDialog S(@j0 final c h0) {
        final ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.h0 = h0;
        confirmationDialog.i0 = 2131886812;
        confirmationDialog.j0 = 2131886660;
        confirmationDialog.k0 = 2131886649;
        return confirmationDialog;
    }
    
    @j0
    public Dialog B(final Bundle bundle) {
        final d$a d$a = new d$a((Context)((Fragment)this).getActivity());
        d$a.m(this.i0).B(this.j0, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                if (ConfirmationDialog.this.h0 != null) {
                    ConfirmationDialog.this.h0.a();
                }
            }
        }).r(this.k0, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                ConfirmationDialog.this.x().cancel();
                if (ConfirmationDialog.this.h0 != null) {
                    ConfirmationDialog.this.h0.onCancel();
                }
            }
        });
        return (Dialog)d$a.a();
    }
    
    public interface c
    {
        void a();
        
        void onCancel();
    }
}
