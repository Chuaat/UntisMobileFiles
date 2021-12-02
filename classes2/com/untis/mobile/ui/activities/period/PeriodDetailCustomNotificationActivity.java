// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period;

import org.joda.time.base.g;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.untis.mobile.systemNotifications.d;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import android.app.DatePickerDialog$OnDateSetListener;
import android.content.Context;
import android.app.DatePickerDialog;
import org.joda.time.c;
import android.widget.DatePicker;
import org.jetbrains.annotations.e;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import org.joda.time.v;
import org.joda.time.t;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.r;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.systemNotifications.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class PeriodDetailCustomNotificationActivity extends b
{
    private static final String W = "andNowForSomethingTotalDiffernt";
    private static final String X = "kirschkuchen";
    private static final String Y = "period_id";
    private static final String Z = "start";
    private static final String a0 = "end";
    private static final String b0 = "timetable_entity_id";
    private static final String c0 = "timetable_entity_type_value";
    private static final String d0 = "system_notification";
    private Profile G;
    private a H;
    private Period I;
    private r J;
    private EntityType K;
    private long L;
    private EditText M;
    private View N;
    private TextView O;
    private View P;
    private TextView Q;
    private t R;
    private v S;
    private com.untis.mobile.systemNotifications.b T;
    private k U;
    @e
    private b0<com.untis.mobile.analytics.base.b> V;
    
    private void G() {
        if (!this.K()) {
            return;
        }
        this.V.getValue().c(com.untis.mobile.analytics.base.c.c.O);
        final a w = this.w();
        this.T.g(w);
        ((Activity)this).setResult(-1, x(w));
        ((Activity)this).finish();
    }
    
    @j0
    public static Intent H(@j0 final Context context, @j0 final Profile profile, @k0 final a a, final long n, final long n2, final long n3, @j0 final EntityType entityType, final long n4) {
        final Intent intent = new Intent(context, (Class)PeriodDetailCustomNotificationActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("kirschkuchen", profile.getUniqueId());
        bundle.putLong("period_id", n);
        bundle.putLong("start", n2);
        bundle.putLong("end", n3);
        bundle.putInt("timetable_entity_type_value", entityType.getWebuntisId());
        bundle.putLong("timetable_entity_id", n4);
        if (a != null) {
            bundle.putParcelable("andNowForSomethingTotalDiffernt", (Parcelable)a);
        }
        intent.putExtras(bundle);
        return intent;
    }
    
    private void I(@j0 final t r) {
        this.R = r;
        this.O.setText((CharSequence)r.g4("dd.MM.yyyy"));
    }
    
    private void J(@j0 final v s) {
        this.S = s;
        this.Q.setText((CharSequence)s.g4("H:mm"));
    }
    
    private boolean K() {
        boolean b;
        if (this.M.getText().toString().isEmpty()) {
            this.M.setError((CharSequence)((Activity)this).getString(2131886702));
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
    
    @j0
    private a w() {
        final a e = this.T.e(this.G.getUniqueId(), this.K, this.L, this.I, this.M.getText().toString(), this.R.x0(this.S));
        final a h = this.H;
        if (h == null) {
            return e;
        }
        e.x(h.e());
        return e;
    }
    
    @j0
    public static Intent x(@j0 final a a) {
        final Intent intent = new Intent();
        intent.putExtra("system_notification", (Parcelable)a);
        return intent;
    }
    
    @k0
    public static a y(@k0 final Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            return (a)intent.getParcelableExtra("system_notification");
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private void z(@k0 final Bundle bundle) {
        this.V = (b0<com.untis.mobile.analytics.base.b>)org.koin.java.a.i((Class)com.untis.mobile.analytics.base.b.class);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras == null) {
            return;
        }
        this.G = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("kirschkuchen", ""));
        this.T = new d().a();
        this.U = this.G.getTimeTableService();
        this.H = (a)extras.getParcelable("andNowForSomethingTotalDiffernt");
        this.I = this.U.l(extras.getLong("period_id"));
        try {
            this.J = new r(extras.getLong("start"), extras.getLong("end"));
        }
        catch (Exception ex) {
            this.J = null;
        }
        this.K = EntityType.Companion.findBy(extras.getInt("timetable_entity_type_value"));
        this.L = extras.getLong("timetable_entity_id");
        final r j = this.J;
        if (j == null || ((org.joda.time.base.i)j).n() == 0L) {
            this.J = new r(((g)this.I.getStart()).n(), ((g)this.I.getEnd()).n());
        }
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492945);
        this.z(bundle);
        this.M = (EditText)this.findViewById(2131296766);
        this.N = this.findViewById(2131296757);
        this.O = (TextView)this.findViewById(2131296758);
        this.P = this.findViewById(2131296767);
        this.Q = (TextView)this.findViewById(2131296768);
        final a h = this.H;
        if (h != null) {
            this.M.setText((CharSequence)h.i());
        }
        final a h2 = this.H;
        c c;
        if (h2 != null) {
            c = new c(h2.n());
        }
        else {
            c = new c((Object)this.I.getStart());
        }
        this.N.setOnClickListener((View$OnClickListener)new m(this, c));
        this.I(c.h1());
        this.P.setOnClickListener((View$OnClickListener)new n(this, c));
        this.J(c.j1());
        this.findViewById(2131296759).setOnClickListener((View$OnClickListener)new l(this));
        ((TextView)this.findViewById(2131296765)).setText((CharSequence)com.untis.mobile.utils.time.b.d(this.J));
        this.findViewById(2131296756).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.k(this));
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
        bundle.putString("kirschkuchen", this.G.getUniqueId());
        bundle.putParcelable("andNowForSomethingTotalDiffernt", (Parcelable)this.H);
        bundle.putLong("period_id", this.I.getId());
        bundle.putLong("start", ((org.joda.time.base.i)this.J).n());
        bundle.putLong("end", ((org.joda.time.base.i)this.J).I());
        bundle.putInt("timetable_entity_type_value", this.K.getWebuntisId());
        bundle.putLong("timetable_entity_id", this.L);
    }
}
