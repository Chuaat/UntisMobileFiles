// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import androidx.activity.ComponentActivity;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.MenuItem;
import androidx.appcompat.app.a;
import com.untis.mobile.persistence.models.EntityType;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class ParentDayAppointmentActivity extends b
{
    private static final String L = "parent_day";
    private static final String M = "gerhald";
    @k0
    private Profile G;
    private RecyclerView H;
    private RecyclerView$h I;
    private LinearLayoutManager J;
    private ParentDay K;
    
    private void q(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.G = j0.G.l(extras.getString("gerhald", ""));
        this.K = (ParentDay)extras.getParcelable("parent_day");
    }
    
    public static void r(@androidx.annotation.j0 final b b, @androidx.annotation.j0 final Profile profile, @androidx.annotation.j0 final ParentDay parentDay) {
        final Intent intent = new Intent((Context)b, (Class)ParentDayAppointmentActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("parent_day", (Parcelable)parentDay);
        bundle.putString("gerhald", profile.getUniqueId());
        intent.putExtras(bundle);
        ((Activity)b).startActivity(intent);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492941);
        this.q(bundle);
        (this.H = (RecyclerView)this.findViewById(2131296742)).setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
        this.J = linearLayoutManager;
        this.H.setLayoutManager((RecyclerView$p)linearLayoutManager);
        this.H.n((RecyclerView$o)new l(((ViewGroup)this.H).getContext(), this.J.M2()));
        final h h = new h(this, this.G, this.K);
        this.I = h;
        this.H.setAdapter((RecyclerView$h)h);
        if (this.K.getAppointments().isEmpty()) {
            int n;
            if (this.G.hasAnyRole(EntityType.TEACHER)) {
                n = 2131296747;
            }
            else {
                n = 2131296746;
            }
            this.findViewById(n).setVisibility(0);
        }
        final a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)this.K.getName());
            supportActionBar.y0((CharSequence)com.untis.mobile.utils.time.b.c(this.K.getStart(), this.K.getEnd()));
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
        bundle.putString("gerhald", this.G.getUniqueId());
        bundle.putParcelable("parent_day", (Parcelable)this.K);
    }
}
