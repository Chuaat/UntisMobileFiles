// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import androidx.activity.ComponentActivity;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.os.Bundle;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.a;
import android.widget.TextView;
import androidx.annotation.j0;
import android.widget.RelativeLayout;
import android.view.View;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class HelpPageFragment extends UmFragment
{
    private static final String I = "context";
    private static final String J = "last_page";
    private b G;
    private boolean H;
    
    private void u(@j0 final RelativeLayout relativeLayout) {
        final Profile n = com.untis.mobile.services.profile.legacy.j0.G.n();
        final TextView textView = (TextView)relativeLayout.findViewById(2131297848);
        final int n2 = 0;
        final boolean b = n != null && a.a.h(n);
        final boolean b2 = n != null && a.a.f(n);
        final boolean b3 = n != null && a.a.b(n);
        int n3 = n2;
        if (n != null) {
            n3 = n2;
            if (a.a.r(n)) {
                n3 = 1;
            }
        }
        int n4;
        if (b) {
            n4 = 2;
        }
        else {
            n4 = 1;
        }
        int n5 = n4;
        if (b2) {
            n5 = n4 + 1;
        }
        int n6 = n5;
        if (b3) {
            n6 = n5 + 1;
        }
        int n7 = n6;
        if (n3 != 0) {
            n7 = n6 + 1;
        }
        String s;
        if (n7 > 1) {
            textView.setLineSpacing(0.0f, 1.5f);
            textView.setGravity(8388611);
            textView.append((CharSequence)":");
            s = "\n\t\u2022 ";
        }
        else {
            s = " ";
        }
        if (b) {
            textView.append((CharSequence)s);
            textView.append((CharSequence)this.getResources().getString(2131886879));
        }
        if (n3 != 0) {
            textView.append((CharSequence)s);
            textView.append((CharSequence)this.getResources().getString(2131886813));
        }
        if (b2) {
            textView.append((CharSequence)s);
            textView.append((CharSequence)this.getResources().getString(2131886254));
        }
        textView.append((CharSequence)s);
        textView.append((CharSequence)this.getResources().getString(2131886880));
        if (b3) {
            textView.append((CharSequence)s);
            textView.append((CharSequence)this.getResources().getString(2131886205));
        }
    }
    
    @j0
    public static HelpPageFragment v(@j0 final b b, final boolean b2) {
        final HelpPageFragment helpPageFragment = new HelpPageFragment();
        final Bundle arguments = new Bundle();
        arguments.putParcelable("context", (Parcelable)b);
        arguments.putBoolean("last_page", b2);
        helpPageFragment.setArguments(arguments);
        return helpPageFragment;
    }
    
    private void z(final RelativeLayout relativeLayout, @k0 final Profile profile) {
        if (profile == null) {
            return;
        }
        final TextView textView = (TextView)relativeLayout.findViewById(2131297439);
        if (textView == null) {
            return;
        }
        if (profile.getUserPremiumEnd() == null) {
            textView.setText(2131886513);
        }
        else {
            textView.setText((CharSequence)this.getString(2131886538).replace("{0}", profile.getUserPremiumEnd().g4("dd.MM.yyyy")));
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final Context context = this.getContext();
        if (context == null) {
            return null;
        }
        Bundle arguments;
        if ((arguments = bundle) == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = (b)arguments.getParcelable("context");
            this.H = arguments.getBoolean("last_page");
        }
        if (this.G == null) {
            return null;
        }
        final RelativeLayout relativeLayout = (RelativeLayout)layoutInflater.inflate(2131492916, viewGroup, false);
        final com.untis.mobile.ui.activities.views.b b = new com.untis.mobile.ui.activities.views.b(context, this.G.a());
        relativeLayout.addView((View)b, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final int c = this.G.c();
        layoutInflater.inflate(c, (ViewGroup)relativeLayout, true);
        if (c == 2131493141 || c == 2131493144) {
            this.u(relativeLayout);
        }
        if (c == 2131493056) {
            this.z(relativeLayout, com.untis.mobile.services.profile.legacy.j0.G.n());
        }
        final Button button = (Button)relativeLayout.findViewById(2131297846);
        if (button != null) {
            final String s = (String)button.getTag();
            if (s == null) {
                button.setOnClickListener((View$OnClickListener)new d(this));
                int text;
                if (this.H) {
                    text = 2131886660;
                }
                else {
                    text = 2131886657;
                }
                button.setText(text);
            }
            else {
                button.setOnClickListener((View$OnClickListener)new e(this, s));
            }
        }
        else {
            b.setOnClickListener((View$OnClickListener)new c(this));
        }
        return (View)relativeLayout;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("context", (Parcelable)this.G);
        bundle.putBoolean("last_page", this.H);
    }
}
