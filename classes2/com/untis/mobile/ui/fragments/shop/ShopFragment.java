// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.shop;

import android.os.Parcelable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import com.untis.mobile.utils.u0;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.util.Log;
import com.untis.mobile.ui.activities.shop.ShopActivity;
import com.untis.mobile.services.billing.b;
import java.util.List;
import android.widget.ProgressBar;
import android.view.View;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ShopFragment extends UmFragment
{
    private static final String J = "shop_context";
    private View G;
    private ProgressBar H;
    private a I;
    
    @k0
    private b K() {
        if (this.getActivity() instanceof ShopActivity) {
            return null;
        }
        Log.e("untis_log", "purchaseService is null!");
        return null;
    }
    
    private void L(@j0 final View view, @j0 final a a) {
        final View viewById = view.findViewById(2131297801);
        if (a.f()) {
            viewById.setVisibility(0);
            return;
        }
        final TextView textView = (TextView)view.findViewById(2131297799);
        final TextView textView2 = (TextView)view.findViewById(2131297800);
        if (!a.g() && !a.j()) {
            if (!a.f()) {
                viewById.setOnClickListener((View$OnClickListener)new o(this, view));
                textView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a.a());
                return;
            }
            textView.setVisibility(0);
        }
        else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(8);
    }
    
    private void M(@j0 final View view, @j0 final a a) {
        final View viewById = view.findViewById(2131297804);
        final TextView textView = (TextView)view.findViewById(2131297802);
        final TextView textView2 = (TextView)view.findViewById(2131297803);
        final TextView textView3 = (TextView)view.findViewById(2131297805);
        if (a.g()) {
            textView.setVisibility(0);
        }
        else {
            if (!a.j()) {
                viewById.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.fragments.shop.b(this, view));
                textView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a.b());
                textView3.setVisibility(0);
                return;
            }
            textView.setVisibility(4);
        }
        textView2.setVisibility(8);
        textView3.setVisibility(8);
    }
    
    private void N(@j0 final View view, @j0 final a a) {
        final View viewById = view.findViewById(2131297809);
        if (a.h()) {
            viewById.setVisibility(0);
            return;
        }
        final TextView textView = (TextView)view.findViewById(2131297807);
        final TextView textView2 = (TextView)view.findViewById(2131297808);
        if (!a.g() && !a.j()) {
            if (!a.h()) {
                viewById.setOnClickListener((View$OnClickListener)new m(this, view));
                textView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a.c());
                return;
            }
            textView.setVisibility(0);
        }
        else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(8);
    }
    
    private void O(@j0 final View view, @j0 final a a) {
        final View viewById = view.findViewById(2131297812);
        if (a.i()) {
            viewById.setVisibility(0);
            return;
        }
        final TextView textView = (TextView)view.findViewById(2131297810);
        final TextView textView2 = (TextView)view.findViewById(2131297811);
        if (!a.g() && !a.j()) {
            if (!a.i()) {
                viewById.setOnClickListener((View$OnClickListener)new n(this, view));
                textView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a.d());
                return;
            }
            textView.setVisibility(0);
        }
        else {
            textView.setVisibility(4);
        }
        textView2.setVisibility(8);
    }
    
    private void P(@j0 final View view, @j0 final a a) {
        final View viewById = view.findViewById(2131297815);
        final TextView textView = (TextView)view.findViewById(2131297813);
        final TextView textView2 = (TextView)view.findViewById(2131297814);
        final TextView textView3 = (TextView)view.findViewById(2131297816);
        if (a.j()) {
            textView.setVisibility(0);
        }
        else {
            if (!a.g()) {
                viewById.setOnClickListener((View$OnClickListener)new l(this, view));
                textView.setVisibility(8);
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a.e());
                textView3.setVisibility(0);
                return;
            }
            textView.setVisibility(4);
        }
        textView2.setVisibility(8);
        textView3.setVisibility(8);
    }
    
    private void j0() {
        this.H.setVisibility(0);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(this.requireContext());
        final b k = this.K();
        if (k == null) {
            return;
        }
        k.a().C5((rx.functions.b)new k(this, a, k), (rx.functions.b)new h(this));
    }
    
    private void k0(@j0 final a a) {
        this.M(this.G, a);
        if (a.j()) {
            this.G.findViewById(2131297815).setVisibility(0);
            this.P(this.G, a);
        }
        if (a.f() || a.h() || a.i()) {
            this.G.findViewById(2131297806).setVisibility(0);
            this.L(this.G, a);
            this.O(this.G, a);
            this.N(this.G, a);
        }
    }
    
    @j0
    public static ShopFragment l0() {
        return new ShopFragment();
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493125, viewGroup, false);
        this.G = inflate;
        this.H = (ProgressBar)inflate.findViewById(2131297817);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.I = (a)arguments.getParcelable("shop_context");
        }
        final a i = this.I;
        if (i == null) {
            this.j0();
        }
        else {
            this.k0(i);
        }
        return this.G;
    }
    
    public void onSaveInstanceState(@org.jetbrains.annotations.e final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("shop_context", (Parcelable)this.I);
    }
}
