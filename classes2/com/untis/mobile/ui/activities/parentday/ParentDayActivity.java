// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import androidx.activity.ComponentActivity;
import android.view.ViewGroup;
import org.joda.time.base.e;
import android.app.Activity;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.annotation.k0;
import com.untis.mobile.services.parentday.d;
import org.joda.time.n0;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class ParentDayActivity extends b
{
    private static final String L = "parent_days";
    private static final String M = "sternschnuppe";
    private Profile G;
    private RecyclerView H;
    private RecyclerView$h I;
    private LinearLayoutManager J;
    private List<ParentDay> K;
    
    private static void s(@j0 final b b, @j0 final Profile profile, @j0 final List<ParentDay> c) {
        if (c.size() == 1) {
            final ParentDay parentDay = c.get(0);
            if (w(parentDay)) {
                ((Activity)b).startActivity(ParentDayMultipleDayAppointmentActivity.I.a(profile, parentDay));
            }
            else {
                ParentDayAppointmentActivity.r(b, profile, parentDay);
            }
            return;
        }
        final Intent intent = new Intent((Context)b, (Class)ParentDayActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("parent_days", new ArrayList((Collection<? extends E>)c));
        bundle.putString("sternschnuppe", profile.getUniqueId());
        intent.putExtras(bundle);
        ((Activity)b).startActivity(intent);
    }
    
    private void t(final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.G = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("sternschnuppe", ""));
        this.K = (List<ParentDay>)extras.getParcelableArrayList("parent_days");
    }
    
    private static boolean w(final ParentDay parentDay) {
        return ((e)parentDay.getStart().h1()).p((n0)parentDay.getEnd().h1()) ^ true;
    }
    
    public static void x(@j0 final b b, @j0 final Profile profile, @j0 final List<ParentDay> list) {
        new d((Context)b).a(profile).C5((rx.functions.b)new a(b, profile), (rx.functions.b)new com.untis.mobile.ui.activities.parentday.b(b, profile, list));
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492940);
        this.t(bundle);
        (this.H = (RecyclerView)this.findViewById(2131296753)).setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
        this.J = linearLayoutManager;
        this.H.setLayoutManager((RecyclerView$p)linearLayoutManager);
        this.H.n((RecyclerView$o)new l(((ViewGroup)this.H).getContext(), this.J.M2()));
        final com.untis.mobile.ui.activities.parentday.d d = new com.untis.mobile.ui.activities.parentday.d(this, this.G, this.K);
        this.I = d;
        this.H.setAdapter((RecyclerView$h)d);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886487);
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
}
