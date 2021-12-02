// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.k0;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.app.Dialog;
import androidx.annotation.j0;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment
{
    private boolean h0;
    
    private void O() {
        if (this.h0) {
            super.v();
        }
        else {
            super.u();
        }
    }
    
    private void P(@j0 final BottomSheetBehavior<?> bottomSheetBehavior, final boolean h0) {
        this.h0 = h0;
        if (bottomSheetBehavior.o0() == 5) {
            this.O();
        }
        else {
            if (this.x() instanceof a) {
                ((a)this.x()).n();
            }
            bottomSheetBehavior.U((BottomSheetBehavior.g)new b());
            bottomSheetBehavior.K0(5);
        }
    }
    
    private boolean Q(final boolean b) {
        final Dialog x = this.x();
        if (x instanceof a) {
            final a a = (a)x;
            final BottomSheetBehavior<FrameLayout> k = a.k();
            if (k.t0() && a.l()) {
                this.P(k, b);
                return true;
            }
        }
        return false;
    }
    
    @j0
    @Override
    public Dialog B(@k0 final Bundle bundle) {
        return new a(this.getContext(), this.z());
    }
    
    @Override
    public void u() {
        if (!this.Q(false)) {
            super.u();
        }
    }
    
    @Override
    public void v() {
        if (!this.Q(true)) {
            super.v();
        }
    }
    
    private class b extends g
    {
        @Override
        public void a(@j0 final View view, final float n) {
        }
        
        @Override
        public void b(@j0 final View view, final int n) {
            if (n == 5) {
                BottomSheetDialogFragment.this.O();
            }
        }
    }
}
