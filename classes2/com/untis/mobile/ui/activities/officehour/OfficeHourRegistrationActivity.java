// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.officehour;

import android.app.Activity;
import android.widget.FrameLayout;
import android.view.MenuItem;
import com.untis.mobile.services.infocenter.w;
import androidx.annotation.k0;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.Context;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlot;
import android.widget.AdapterView;
import com.untis.mobile.utils.u0;
import androidx.cardview.widget.CardView;
import com.untis.mobile.ui.adapters.officehour.a;
import android.widget.ProgressBar;
import android.widget.ListView;
import android.view.View;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class OfficeHourRegistrationActivity extends b
{
    private static final String Q = "office_hour";
    private static final String R = "karrote";
    private Profile G;
    private OfficeHour H;
    private boolean I;
    private View J;
    private ListView K;
    private ProgressBar L;
    private a M;
    private CardView N;
    private com.untis.mobile.services.infocenter.a O;
    private com.untis.mobile.systemNotifications.b P;
    
    private void G() {
        this.L.setVisibility(0);
        if (this.G == null) {
            return;
        }
        this.O.r(this.H).C5((rx.functions.b)new com.untis.mobile.ui.activities.officehour.b(this), (rx.functions.b)new f(this));
    }
    
    private void H() {
        this.K.setVisibility(8);
        ((FrameLayout)this.N).setVisibility(0);
    }
    
    private OfficeHourRegistration I(final OfficeHourTimeSlot officeHourTimeSlot) {
        return new OfficeHourRegistration(this.H.getId(), this.H.getTeacher(), officeHourTimeSlot.getStart(), officeHourTimeSlot.getEnd(), this.H.getUserText());
    }
    
    public static void J(@j0 final Fragment fragment, @j0 final Profile profile, @j0 final OfficeHour officeHour) {
        final Intent intent = new Intent(fragment.getContext(), (Class)OfficeHourRegistrationActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("karrote", profile.getUniqueId());
        bundle.putParcelable("office_hour", (Parcelable)officeHour);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, 800);
    }
    
    private void K(@j0 final OfficeHourTimeSlot officeHourTimeSlot) {
        final Profile g = this.G;
        if (g == null) {
            return;
        }
        if (g.getEntityType().isParentRole()) {
            if (this.G.getEntityType().isStudentRole()) {
                this.L.setVisibility(0);
                this.O.q(this.I(officeHourTimeSlot)).C5((rx.functions.b)new c(this), (rx.functions.b)new e(this));
            }
        }
    }
    
    private void x(@j0 final OfficeHourTimeSlot officeHourTimeSlot) {
        final Profile g = this.G;
        if (g == null) {
            return;
        }
        if (g.getEntityType().isParentRole()) {
            if (this.G.getEntityType().isStudentRole()) {
                this.L.setVisibility(0);
                this.O.l(this.I(officeHourTimeSlot)).C5((rx.functions.b)new d(this), (rx.functions.b)new g(this));
            }
        }
    }
    
    private void y(@j0 final f5.a a) {
        ValidationErrorDialog.P(a.a()).L(((androidx.fragment.app.d)this).getSupportFragmentManager(), "validation_errors");
    }
    
    public void onBackPressed() {
        if (this.I) {
            ((Activity)this).setResult(-1);
            ((Activity)this).finish();
        }
        else {
            super.onBackPressed();
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492937);
        this.J = this.findViewById(2131296716);
        this.N = (CardView)this.findViewById(2131296714);
        this.K = (ListView)this.findViewById(2131296717);
        this.L = (ProgressBar)this.findViewById(2131296715);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("karrote", ""));
            this.H = (OfficeHour)extras.getParcelable("office_hour");
        }
        this.O = new w(this.G.getUniqueId());
        this.P = new com.untis.mobile.systemNotifications.d().a();
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
            final StringBuilder sb = new StringBuilder();
            sb.append(this.H.getDisplayNameTeacher());
            sb.append(", ");
            sb.append(com.untis.mobile.utils.time.b.c(this.H.getStart(), this.H.getEnd()));
            supportActionBar.y0((CharSequence)sb.toString());
        }
        if (com.untis.mobile.utils.a.a((Context)this).I(this.G)) {
            this.G();
        }
        else {
            this.H();
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(@j0 final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.onBackPressed();
        return true;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("office_hour", (Parcelable)this.H);
        bundle.putString("karrote", this.G.getUniqueId());
    }
}
