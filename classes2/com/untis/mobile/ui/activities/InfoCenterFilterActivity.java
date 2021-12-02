// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import org.joda.time.base.g;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.widget.CompoundButton;
import android.view.MenuItem;
import androidx.annotation.k0;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.time.a;
import android.content.DialogInterface$OnCancelListener;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.DialogInterface;
import android.widget.DatePicker;
import org.joda.time.t;
import android.content.Context;
import com.untis.mobile.utils.settings.old.d;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.TextView;
import com.untis.mobile.ui.activities.common.b;

public class InfoCenterFilterActivity extends com.untis.mobile.ui.activities.common.b
{
    private static final String P = "filter";
    private b G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private TextView M;
    private TextView N;
    private TextView O;
    
    public static void G(@j0 final com.untis.mobile.ui.activities.common.b b, @j0 final b b2) {
        final Intent intent = new Intent((Context)b, (Class)InfoCenterFilterActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putInt("filter", b2.d());
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 130);
    }
    
    private void H(@j0 final t t) {
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this, (DatePickerDialog$OnDateSetListener)new j(this), t.k2(), t.f3() - 1, t.X3());
        datePickerDialog.setOnCancelListener((DialogInterface$OnCancelListener)new k(this));
        datePickerDialog.getDatePicker().setMinDate(((g)a.a().a2()).n());
        datePickerDialog.show();
    }
    
    private void I(@j0 final com.untis.mobile.ui.adapters.infocenter.a other) {
        final TextView m = this.M;
        String text;
        if (this.I) {
            text = other.l((Context)this);
        }
        else {
            text = other.k((Context)this);
        }
        m.setText((CharSequence)text);
        final TextView n = this.N;
        int visibility;
        if (com.untis.mobile.ui.adapters.infocenter.a.M.equals(other)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        n.setVisibility(visibility);
        final TextView n2 = this.N;
        String text2;
        if (this.I) {
            text2 = other.j((Context)this);
        }
        else {
            text2 = other.i((Context)this);
        }
        n2.setText((CharSequence)text2);
        d.n((Context)this).d(other);
    }
    
    private void J(@j0 final t t) {
        this.O.setText((CharSequence)t.g4("dd.MM.yyyy"));
        d.n((Context)this).e(t);
    }
    
    private void w() {
        final View viewById = this.findViewById(2131296626);
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(2131296627);
        final View viewById2 = this.findViewById(2131296625);
        int visibility;
        if (this.I) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewById2.setVisibility(visibility);
        switchCompat.setChecked(d.n((Context)this).l());
        viewById.setOnClickListener((View$OnClickListener)new n(this, switchCompat));
        ((CompoundButton)switchCompat).setOnClickListener((View$OnClickListener)new m(this, switchCompat));
    }
    
    private void x(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            final b b = InfoCenterFilterActivity.b.b(extras.getInt("filter"));
            this.G = b;
            final int n = InfoCenterFilterActivity$a.a[b.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    this.H = true;
                    this.I = true;
                    this.K = true;
                    return;
                }
                if (n != 3) {
                    if (n != 4) {
                        return;
                    }
                    this.H = true;
                    this.K = true;
                }
                else {
                    this.H = true;
                }
            }
            else {
                this.J = true;
            }
            this.L = true;
        }
    }
    
    private void y() {
        final View viewById = this.findViewById(2131296629);
        this.M = (TextView)this.findViewById(2131296631);
        this.N = (TextView)this.findViewById(2131296630);
        final View viewById2 = this.findViewById(2131296628);
        int visibility;
        if (this.H) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewById2.setVisibility(visibility);
        viewById.setOnClickListener((View$OnClickListener)new l(this));
        this.I(d.n((Context)this).i());
        if (this.L && this.H) {
            InfoCenterDateRangeActivity.u(this, this.K);
        }
    }
    
    private void z() {
        final View viewById = this.findViewById(2131296633);
        this.O = (TextView)this.findViewById(2131296634);
        final View viewById2 = this.findViewById(2131296632);
        int visibility;
        if (this.J) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewById2.setVisibility(visibility);
        final t j = d.n((Context)this).j();
        viewById.setOnClickListener((View$OnClickListener)new o(this, j));
        this.J(j);
        if (this.L && this.J) {
            this.H(j);
        }
    }
    
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 130) {
            super.onActivityResult(n, n2, intent);
        }
        else {
            if (b && intent != null) {
                this.I(InfoCenterDateRangeActivity.s(intent));
                ((Activity)this).setResult(-1);
            }
            if (this.L) {
                ((Activity)this).finish();
            }
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492925);
        this.x(bundle);
        this.y();
        this.z();
        this.w();
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("filter", this.G.d());
    }
    
    public enum b
    {
        H(0), 
        I(1), 
        J(2), 
        K(3);
        
        private final int G;
        
        private b(final int g) {
            this.G = g;
        }
        
        @j0
        public static b b(final int n) {
            for (final b b : values()) {
                if (b.d() == n) {
                    return b;
                }
            }
            return b.J;
        }
        
        public int d() {
            return this.G;
        }
    }
}
