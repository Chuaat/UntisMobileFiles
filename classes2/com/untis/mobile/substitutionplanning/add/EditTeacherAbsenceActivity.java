// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.d;
import org.joda.time.base.g;
import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import android.content.Intent;
import java.util.List;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.f;
import androidx.fragment.app.Fragment;
import android.widget.TimePicker;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import com.untis.mobile.utils.v;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import com.untis.mobile.utils.g0;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import android.os.Bundle;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.k0;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import retrofit2.t;
import android.view.View;
import android.content.DialogInterface;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import n6.a;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006+" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/EditTeacherAbsenceActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/substitutionplanning/add/y0;", "Lkotlin/j2;", "N", "T", "P", "L", "s0", "Landroid/os/Bundle;", "arguments", "Y", "y0", "m0", "o0", "h0", "j0", "v0", "x0", "l0", "w0", "c0", "Z", "q0", "r0", "savedInstanceState", "onCreate", "", "Lcom/untis/wu/rest/model/TeacherAbsenceReasonRefDto;", "n", "absenceReasonRefDto", "m", "h", "Lcom/untis/mobile/substitutionplanning/add/u0;", "G", "Lkotlin/b0;", "M", "()Lcom/untis/mobile/substitutionplanning/add/u0;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class EditTeacherAbsenceActivity extends b implements y0
{
    @e
    public static final a H;
    @e
    private static final String I = "profile_id";
    @e
    private static final String J = "date_iso";
    @e
    private static final String K = "dto_json";
    private static final Gson L;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
        L = new GsonBuilder().create();
    }
    
    public EditTeacherAbsenceActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<u0>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final u0 invoke() {
                return (u0)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(u0.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ Gson K() {
        return EditTeacherAbsenceActivity.L;
    }
    
    private final void L() {
        ((ComponentActivity)this).onBackPressed();
    }
    
    private final u0 M() {
        return this.G.getValue();
    }
    
    private final void N() {
        ((ViewGroup)this.findViewById(c.i.l3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.d0(this));
    }
    
    private static final void O(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.l0();
    }
    
    private final void P() {
        ((ImageView)this.findViewById(c.i.B3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.b0(this));
        ((ImageView)this.findViewById(c.i.C3)).setOnClickListener((View$OnClickListener)new q0(this));
        ((Button)this.findViewById(c.i.S2)).setOnClickListener((View$OnClickListener)new a0(this));
    }
    
    private static final void Q(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.L();
    }
    
    private static final void R(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.s0();
    }
    
    private static final void S(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.c0();
    }
    
    private final void T() {
        ((ViewGroup)this.findViewById(c.i.s3)).setOnClickListener((View$OnClickListener)new c0(this));
        ((ViewGroup)this.findViewById(c.i.u3)).setOnClickListener((View$OnClickListener)new r0(this));
        ((ViewGroup)this.findViewById(c.i.W2)).setOnClickListener((View$OnClickListener)new s0(this));
        ((ViewGroup)this.findViewById(c.i.Y2)).setOnClickListener((View$OnClickListener)new p0(this));
    }
    
    private static final void U(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.m0();
    }
    
    private static final void V(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.o0();
    }
    
    private static final void W(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.h0();
    }
    
    private static final void X(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final View view) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.j0();
    }
    
    private final void Y(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final String string = bundle.getString("profile_id");
        if (string != null) {
            final org.joda.time.t c0 = org.joda.time.t.c0(bundle.getString("date_iso"));
            final TeacherAbsenceDto teacherAbsenceDto = EditTeacherAbsenceActivity.L.fromJson(bundle.getString("dto_json"), TeacherAbsenceDto.class);
            final u0 m = this.M();
            k0.o(c0, "date");
            k0.o(teacherAbsenceDto, "teacherAbsenceDto");
            m.m(string, c0, teacherAbsenceDto);
            return;
        }
        throw new IllegalArgumentException("profile must not be null");
    }
    
    private final void Z() {
        this.q0();
        this.M().o().C5((rx.functions.b)new e0(this), (rx.functions.b)new h0(this));
    }
    
    private static final void a0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.y0();
        editTeacherAbsenceActivity.r0();
    }
    
    private static final void b0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final Throwable t) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        k0.o(t, "it");
        h.l((Context)editTeacherAbsenceActivity, t);
        editTeacherAbsenceActivity.r0();
    }
    
    private final void c0() {
        if (!g0.a((Context)this)) {
            h.r((Context)this, h.V(2131886819, (Context)this));
            return;
        }
        ((Dialog)new d$a((Context)this, 2131951928).m(2131886847).B(2131886653, (DialogInterface$OnClickListener)new n0(this)).r(2131886649, (DialogInterface$OnClickListener)o0.G).a()).show();
    }
    
    private static final void d0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.q0();
        editTeacherAbsenceActivity.M().b().C5((rx.functions.b)new i0(editTeacherAbsenceActivity), (rx.functions.b)new f0(editTeacherAbsenceActivity));
    }
    
    private static final void e0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final t t) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        ((Activity)editTeacherAbsenceActivity).setResult(-1);
        ((Activity)editTeacherAbsenceActivity).finish();
        editTeacherAbsenceActivity.r0();
    }
    
    private static final void f0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final Throwable t) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        k0.o(t, "it");
        h.l((Context)editTeacherAbsenceActivity, t);
        editTeacherAbsenceActivity.r0();
    }
    
    private static final void g0(final DialogInterface dialogInterface, final int n) {
    }
    
    private final void h0() {
        final org.joda.time.c f = this.M().f();
        org.joda.time.t h1;
        if (f == null) {
            h1 = null;
        }
        else {
            h1 = f.h1();
        }
        if (h1 == null) {
            return;
        }
        final v a = v.a;
        if (((org.joda.time.base.e)h1).o((org.joda.time.n0)a.g())) {
            return;
        }
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this, 2131951928, (DatePickerDialog$OnDateSetListener)new com.untis.mobile.substitutionplanning.add.k0(this), h1.k2(), h1.f3() - 1, h1.X3());
        datePickerDialog.getDatePicker().setMinDate(((g)a.g().F0()).n());
        datePickerDialog.show();
    }
    
    private static final void i0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.M().t(new org.joda.time.t(n, n2 + 1, n3));
        editTeacherAbsenceActivity.v0();
    }
    
    private final void j0() {
        final org.joda.time.c f = this.M().f();
        org.joda.time.v j1 = null;
        Object h1;
        if (f == null) {
            h1 = null;
        }
        else {
            h1 = f.h1();
        }
        if (h1 == null) {
            return;
        }
        final org.joda.time.c f2 = this.M().f();
        if (f2 != null) {
            j1 = f2.j1();
        }
        if (j1 == null) {
            return;
        }
        if (((org.joda.time.base.e)h1).o((org.joda.time.n0)v.a.g())) {
            return;
        }
        new TimePickerDialog((Context)this, 2131951928, (TimePickerDialog$OnTimeSetListener)new com.untis.mobile.substitutionplanning.add.m0(this), j1.s4(), j1.k5(), true).show();
    }
    
    private static final void k0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.M().u(new org.joda.time.v(n, n2));
        editTeacherAbsenceActivity.v0();
    }
    
    private final void l0() {
        final androidx.fragment.app.a0 r = ((d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.h(((ViewGroup)this.findViewById(c.i.p3)).getId(), (Fragment)SelectReasonFragment.H.a(), "select-reason-fragment");
        r.p("select-reason-fragment");
        r.r();
    }
    
    private final void m0() {
        final org.joda.time.c j = this.M().j();
        org.joda.time.t h1;
        if (j == null) {
            h1 = null;
        }
        else {
            h1 = j.h1();
        }
        if (h1 == null) {
            return;
        }
        final v a = v.a;
        if (((org.joda.time.base.e)h1).o((org.joda.time.n0)a.g())) {
            return;
        }
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this, 2131951928, (DatePickerDialog$OnDateSetListener)new z(this), h1.k2(), h1.f3() - 1, h1.X3());
        datePickerDialog.getDatePicker().setMinDate(((g)a.g().F0()).n());
        datePickerDialog.show();
    }
    
    private static final void n0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.M().v(new org.joda.time.t(n, n2 + 1, n3));
        editTeacherAbsenceActivity.v0();
    }
    
    private final void o0() {
        final org.joda.time.c j = this.M().j();
        org.joda.time.v j2 = null;
        Object h1;
        if (j == null) {
            h1 = null;
        }
        else {
            h1 = j.h1();
        }
        if (h1 == null) {
            return;
        }
        final org.joda.time.c i = this.M().j();
        if (i != null) {
            j2 = i.j1();
        }
        if (j2 == null) {
            return;
        }
        if (((org.joda.time.base.e)h1).o((org.joda.time.n0)v.a.g())) {
            return;
        }
        new TimePickerDialog((Context)this, 2131951928, (TimePickerDialog$OnTimeSetListener)new l0(this), j2.s4(), j2.k5(), true).show();
    }
    
    private static final void p0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.M().w(new org.joda.time.v(n, n2));
        editTeacherAbsenceActivity.v0();
    }
    
    private final void q0() {
        ((ViewGroup)this.findViewById(c.i.d3)).setVisibility(0);
    }
    
    private final void r0() {
        ((ViewGroup)this.findViewById(c.i.d3)).setVisibility(8);
    }
    
    private final void s0() {
        if (!g0.a((Context)this)) {
            h.r((Context)this, h.V(2131886819, (Context)this));
            return;
        }
        this.q0();
        this.M().s().C5((rx.functions.b)new j0(this), (rx.functions.b)new com.untis.mobile.substitutionplanning.add.g0(this));
    }
    
    private static final void t0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final t t) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        ((Activity)editTeacherAbsenceActivity).setResult(-1);
        ((Activity)editTeacherAbsenceActivity).finish();
        editTeacherAbsenceActivity.r0();
    }
    
    private static final void u0(final EditTeacherAbsenceActivity editTeacherAbsenceActivity, final Throwable t) {
        k0.p(editTeacherAbsenceActivity, "this$0");
        editTeacherAbsenceActivity.r0();
        k0.o(t, "it");
        if (f.c(t)) {
            int n;
            if (editTeacherAbsenceActivity.M().n()) {
                n = 2131886844;
            }
            else {
                n = 2131886845;
            }
            h.j((Context)editTeacherAbsenceActivity, n);
        }
        else {
            h.l((Context)editTeacherAbsenceActivity, t);
        }
    }
    
    private final void v0() {
        ((TextView)this.findViewById(c.i.r3)).setText((CharSequence)this.M().i());
        ((TextView)this.findViewById(c.i.t3)).setText((CharSequence)this.M().k());
        ((TextView)this.findViewById(c.i.V2)).setText((CharSequence)this.M().e());
        ((TextView)this.findViewById(c.i.X2)).setText((CharSequence)this.M().g());
    }
    
    private final void w0() {
        ((EditText)this.findViewById(c.i.j3)).setText((CharSequence)this.M().h((Context)this));
    }
    
    private final void x0() {
        ((TextView)this.findViewById(c.i.n3)).setText((CharSequence)this.M().d((Context)this));
    }
    
    private final void y0() {
        ((ViewGroup)this.findViewById(c.i.x3)).setVisibility(8);
        this.v0();
        this.x0();
        this.w0();
        ((Button)this.findViewById(c.i.S2)).setVisibility(h.U(this.M().c(), 0, 1, null));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    public void h() {
        ((ComponentActivity)this).onBackPressed();
    }
    
    @Override
    public void m(@e final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto) {
        k0.p(teacherAbsenceReasonRefDto, "absenceReasonRefDto");
        final u0 m = this.M();
        final Long id = teacherAbsenceReasonRefDto.getId();
        k0.o(id, "absenceReasonRefDto.id");
        final long longValue = id.longValue();
        final String displayName = teacherAbsenceReasonRefDto.getDisplayName();
        k0.o(displayName, "absenceReasonRefDto.displayName");
        m.r(longValue, displayName);
        ((ComponentActivity)this).onBackPressed();
        this.x0();
    }
    
    @e
    @Override
    public List<TeacherAbsenceReasonRefDto> n() {
        return this.M().l();
    }
    
    @Override
    protected void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492900);
        ((TextView)this.findViewById(c.i.A3)).setText(2131886848);
        this.findViewById(c.i.b3).requestFocus();
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.Y(extras);
        this.P();
        this.T();
        this.N();
        b.setUpTopActionBar$default(this, null, null, 3, null);
        this.Z();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "com/untis/mobile/substitutionplanning/add/EditTeacherAbsenceActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lorg/joda/time/t;", "date", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "teacherAbsenceDto", "Landroid/content/Intent;", "a", "ARGUMENT_DATE_ISO", "Ljava/lang/String;", "ARGUMENT_DTO_JSON", "ARGUMENT_PROFILE_ID", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, @e final org.joda.time.t t, @e final TeacherAbsenceDto teacherAbsenceDto) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(t, "date");
            k0.p(teacherAbsenceDto, "teacherAbsenceDto");
            final Intent intent = new Intent(context, (Class)EditTeacherAbsenceActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", s);
            bundle.putString("date_iso", t.toString());
            bundle.putString("dto_json", EditTeacherAbsenceActivity.K().toJson(teacherAbsenceDto));
            intent.putExtras(bundle);
            return intent;
        }
    }
}
