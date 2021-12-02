// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.common;

import android.view.View;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.annotation.e0;
import androidx.fragment.app.Fragment;

public class SimpleLayoutFragment extends Fragment
{
    private static final String H = "layout_id";
    @e0
    private int G;
    
    @j0
    public static SimpleLayoutFragment r(@e0 final int n) {
        final SimpleLayoutFragment simpleLayoutFragment = new SimpleLayoutFragment();
        final Bundle arguments = new Bundle();
        arguments.putInt("layout_id", n);
        simpleLayoutFragment.setArguments(arguments);
        return simpleLayoutFragment;
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = arguments.getInt("layout_id");
        }
        return layoutInflater.inflate(this.G, viewGroup, false);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("layout_id", this.G);
    }
}
