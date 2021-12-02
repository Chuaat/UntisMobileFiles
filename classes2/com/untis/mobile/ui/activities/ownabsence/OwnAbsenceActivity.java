// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.ownabsence;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.os.PersistableBundle;
import android.view.MenuItem;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.utils.u0;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import android.text.Spanned;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.DatePicker;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import android.text.InputFilter;
import android.widget.TextView$OnEditorActionListener;
import android.widget.EditText;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.Spinner;
import android.view.View$OnClickListener;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import org.joda.time.l0;
import org.joda.time.n0;
import org.joda.time.v;
import com.untis.mobile.services.infocenter.w;
import androidx.annotation.k0;
import java.util.Iterator;
import com.untis.mobile.persistence.models.profile.Child;
import org.joda.time.t;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.services.masterdata.a;
import org.joda.time.r;
import android.widget.ProgressBar;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.common.b;

public class OwnAbsenceActivity extends b
{
    private static final String R = "data_absence";
    private static final String S = "oida";
    private static final String T = "absenceId";
    private static final String U = "absenceStudentId";
    private static final String V = "absenceStartMillis";
    private static final String W = "absenceEndMillis";
    private static final String X = "absenceReasonId";
    private static final String Y = "absenceText";
    private Profile G;
    private View H;
    private ProgressBar I;
    private long J;
    private long K;
    private r L;
    private long M;
    private String N;
    private a O;
    private com.untis.mobile.services.classbook.a P;
    private com.untis.mobile.services.infocenter.a Q;
    
    @j0
    public static Intent F(@j0 final StudentAbsence studentAbsence) {
        final Intent intent = new Intent();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("data_absence", (Parcelable)studentAbsence);
        intent.putExtras(bundle);
        return intent;
    }
    
    @j0
    private List<Student> G() {
        final ArrayList<Student> list = new ArrayList<Student>();
        final boolean studentRole = this.G.getEntityType().isStudentRole();
        final Long value = 0L;
        if (studentRole) {
            list.add(new Student(this.G.getEntityId(), this.G.getUserDisplayName(), "", new t(0L), value));
        }
        if (this.G.getEntityType().isParentRole()) {
            for (final Child child : this.G.getUserChildren()) {
                list.add(new Student(child.getId(), child.getFirstName(), child.getLastName(), new t(0L), value));
            }
        }
        return list;
    }
    
    private void H(@k0 final Bundle bundle) {
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(extras.getString("oida", ""));
            this.J = extras.getLong("absenceId", 0L);
            this.K = extras.getLong("absenceStudentId", 0L);
            this.L = new r(extras.getLong("absenceStartMillis", 0L), extras.getLong("absenceEndMillis", 0L));
            this.M = extras.getLong("absenceReasonId", 0L);
            this.N = extras.getString("absenceText", "");
        }
        this.O = this.G.getMasterDataService();
        this.P = this.G.getClassBookService();
        this.Q = new w(this.G.getUniqueId());
        final r l = this.L;
        if (l == null || ((org.joda.time.base.i)l).n() == 0L) {
            final TimeGrid y = this.O.y(com.untis.mobile.utils.time.a.b());
            if (y != null) {
                final v earliestStart = y.getEarliestStart();
                final v latestEnd = y.getLatestEnd();
                v v;
                if ((v = earliestStart) == null) {
                    v = new v(8, 0);
                }
                v v2;
                if ((v2 = latestEnd) == null) {
                    v2 = new v(20, 0);
                }
                r i;
                if (((org.joda.time.base.e)com.untis.mobile.utils.time.a.c()).o((n0)v2)) {
                    i = new r((l0)v.u0(), (l0)v2.u0());
                }
                else {
                    i = new r((l0)v.u0().S0(1), (l0)v2.u0().S0(1));
                }
                this.L = i;
            }
        }
    }
    
    private void I() {
        this.findViewById(2131296726).setOnClickListener((View$OnClickListener)new m(this));
        this.findViewById(2131296728).setOnClickListener((View$OnClickListener)new n(this));
    }
    
    private void J() {
        this.findViewById(2131296724).setVisibility(8);
        this.findViewById(2131296732).setVisibility(0);
        this.findViewById(2131296730).setVisibility(8);
        this.H.setOnClickListener((View$OnClickListener)null);
    }
    
    private void K() {
        final boolean g = this.P.g();
        final View viewById = this.findViewById(2131296733);
        if (!g) {
            viewById.setVisibility(8);
            return;
        }
        if (!com.untis.mobile.services.a.a.r(this.G)) {
            viewById.setVisibility(8);
            return;
        }
        final List<AbsenceReason> d = this.O.d(true);
        if (d.size() == 0) {
            viewById.setVisibility(8);
            return;
        }
        final Spinner spinner = (Spinner)this.findViewById(2131296734);
        final com.untis.mobile.ui.activities.ownabsence.a adapter = new com.untis.mobile.ui.activities.ownabsence.a((Context)this, d);
        spinner.setAdapter((SpinnerAdapter)adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                OwnAbsenceActivity.this.M = adapter.a(n).getId();
            }
            
            public void onNothingSelected(final AdapterView<?> adapterView) {
            }
        });
    }
    
    private void L() {
        this.findViewById(2131296737).setOnClickListener((View$OnClickListener)new l(this));
        this.findViewById(2131296739).setOnClickListener((View$OnClickListener)new j(this));
    }
    
    private void M() {
        if (this.G.hasAnyRole(EntityType.STUDENT)) {
            this.findViewById(2131296722).setVisibility(8);
        }
        final Spinner spinner = (Spinner)this.findViewById(2131296723);
        final o adapter = new o((Context)this, this.G());
        spinner.setAdapter((SpinnerAdapter)adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                OwnAbsenceActivity.this.K = adapter.a(n).getId();
            }
            
            public void onNothingSelected(final AdapterView<?> adapterView) {
            }
        });
    }
    
    private void N() {
        final boolean k = this.P.K();
        final View viewById = this.findViewById(2131296741);
        if (!k) {
            viewById.setVisibility(8);
            return;
        }
        final EditText editText = (EditText)this.findViewById(2131296721);
        editText.setText((CharSequence)this.N);
        editText.setOnEditorActionListener((TextView$OnEditorActionListener)new c(this));
        editText.clearFocus();
        editText.setFilters(new InputFilter[] { (InputFilter)new i(this) });
    }
    
    public static void b0(@j0 final b b, @j0 final Profile profile) {
        final Intent intent = new Intent((Context)b, (Class)OwnAbsenceActivity.class);
        final Bundle bundle = new Bundle();
        Label_0090: {
            long n;
            if (profile.getEntityType().isParentRole()) {
                if (profile.getUserChildren().size() <= 0) {
                    break Label_0090;
                }
                n = profile.getUserChildren().iterator().next().getId();
            }
            else {
                if (!profile.getEntityType().isStudentRole()) {
                    break Label_0090;
                }
                n = profile.getEntityId();
            }
            bundle.putLong("absenceStudentId", n);
        }
        bundle.putString("oida", profile.getUniqueId());
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 900);
    }
    
    public static void c0(@j0 final b b, @j0 final Profile profile, @j0 final StudentAbsence studentAbsence) {
        final Intent intent = new Intent((Context)b, (Class)OwnAbsenceActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putString("oida", profile.getUniqueId());
        bundle.putLong("absenceId", studentAbsence.getId());
        bundle.putLong("absenceStudentId", studentAbsence.getStudent().getId());
        bundle.putLong("absenceStartMillis", ((org.joda.time.base.g)studentAbsence.getStart()).n());
        bundle.putLong("absenceEndMillis", ((org.joda.time.base.g)studentAbsence.getEnd()).n());
        if (studentAbsence.getAbsenceReason() != null) {
            bundle.putLong("absenceReasonId", studentAbsence.getAbsenceReason().getId());
        }
        intent.putExtras(bundle);
        ((ComponentActivity)b).startActivityForResult(intent, 900);
    }
    
    private StudentAbsence d0() {
        final StudentAbsence z = this.P.Z(this.J);
        if (z != null) {
            return new StudentAbsence(z.getId(), z.getPeriodId(), z.getStudent(), z.getKlasse(), ((org.joda.time.base.d)this.L).b(), ((org.joda.time.base.d)this.L).s(), z.getExcused(), this.O.H(this.M), z.getOwner(), this.N, z.getExcuse(), false);
        }
        Student v = this.O.V(this.K);
        final long j = this.J;
        if (v == null) {
            v = new Student();
        }
        return new StudentAbsence(j, 0L, v, null, ((org.joda.time.base.d)this.L).b(), ((org.joda.time.base.d)this.L).s(), false, this.O.H(this.M), true, this.N, null, false);
    }
    
    private void e0() {
        ((TextView)this.findViewById(2131296738)).setText((CharSequence)((org.joda.time.base.a)((org.joda.time.base.d)this.L).b()).g4("dd.MM.yyyy"));
        ((TextView)this.findViewById(2131296740)).setText((CharSequence)((org.joda.time.base.a)((org.joda.time.base.d)this.L).b()).g4("H:mm"));
        ((TextView)this.findViewById(2131296729)).setText((CharSequence)((org.joda.time.base.a)((org.joda.time.base.d)this.L).s()).g4("H:mm"));
        ((TextView)this.findViewById(2131296727)).setText((CharSequence)((org.joda.time.base.a)((org.joda.time.base.d)this.L).s()).g4("dd.MM.yyyy"));
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492939);
        this.H = this.findViewById(2131296735);
        this.I = (ProgressBar)this.findViewById(2131296731);
        this.H(bundle);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.Y(true);
            supportActionBar.z0(2131886813);
        }
        if (!com.untis.mobile.utils.a.a((Context)this).I(this.G)) {
            this.J();
        }
        else {
            this.M();
            this.L();
            this.I();
            this.e0();
            this.K();
            this.N();
            this.findViewById(2131296730).setOnClickListener((View$OnClickListener)new k(this));
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(@j0 final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
    }
    
    public void onSaveInstanceState(final Bundle bundle, final PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putString("oida", this.G.getUniqueId());
    }
}
