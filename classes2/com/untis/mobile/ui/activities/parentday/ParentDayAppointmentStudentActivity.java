// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import androidx.activity.ComponentActivity;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.MenuItem;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.parentday.ParentDayStudent;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.annotation.k0;
import android.os.Bundle;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.parentday.ParentDayAppointment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.ui.activities.common.b;

public class ParentDayAppointmentStudentActivity extends b
{
    private static final String M = "appointment";
    private static final String N = "chefsSaltyBalls";
    private RecyclerView G;
    private RecyclerView$h H;
    private LinearLayoutManager I;
    private ParentDayAppointment J;
    private Profile K;
    private a L;
    
    private void q(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.K = j0.G.l(extras.getString("chefsSaltyBalls", ""));
        this.J = (ParentDayAppointment)extras.getParcelable("appointment");
        this.L = this.K.getMasterDataService();
    }
    
    public static void r(@androidx.annotation.j0 final b b, @androidx.annotation.j0 final Profile profile, @androidx.annotation.j0 final ParentDayAppointment parentDayAppointment) {
        final Intent intent = new Intent((Context)b, (Class)ParentDayAppointmentStudentActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("appointment", (Parcelable)parentDayAppointment);
        bundle.putString("chefsSaltyBalls", profile.getUniqueId());
        intent.putExtras(bundle);
        ((Activity)b).startActivity(intent);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492942);
        this.q(bundle);
        (this.G = (RecyclerView)this.findViewById(2131296744)).setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)this);
        this.I = linearLayoutManager;
        this.G.setLayoutManager((RecyclerView$p)linearLayoutManager);
        this.G.n((RecyclerView$o)new l(((ViewGroup)this.G).getContext(), this.I.M2()));
        final List<ParentDayStudent> studentsWithSubjects = this.J.getStudentsWithSubjects();
        if (studentsWithSubjects.size() == 0) {
            this.H = new j((Context)this, this.K.getUniqueId(), this.J.getStudents());
        }
        else {
            this.H = new j((Context)this, this.K.getUniqueId(), studentsWithSubjects);
        }
        this.G.setAdapter(this.H);
        final Teacher k = this.L.k(this.J.getTeacherId());
        String displayName;
        if (k != null) {
            displayName = k.getDisplayName();
        }
        else {
            displayName = "";
        }
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)displayName);
            supportActionBar.y0((CharSequence)com.untis.mobile.utils.time.b.f(this.J.getStart().j1(), this.J.getEnd().j1()));
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
        bundle.putString("chefsSaltyBalls", this.K.getUniqueId());
        bundle.putParcelable("appointment", (Parcelable)this.J);
    }
}
