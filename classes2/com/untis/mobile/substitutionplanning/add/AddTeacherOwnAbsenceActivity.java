// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LiveData;
import android.widget.TextView;
import android.app.Activity;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import android.text.TextWatcher;
import com.untis.mobile.utils.n0;
import kotlin.j2;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.wu.rest.model.TeacherRefDto;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.utils.extension.f;
import android.widget.TimePicker;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import rx.g;
import android.widget.DatePicker;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0%H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\rH\u0016J\b\u0010.\u001a\u00020\u0004H\u0016R\u001d\u00104\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00069" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/AddTeacherOwnAbsenceActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/substitutionplanning/add/y0;", "Lcom/untis/mobile/substitutionplanning/add/c1;", "Lkotlin/j2;", "U", "p0", "m0", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "viewDto", "F0", "j0", "A0", "Lcom/untis/wu/rest/model/TeacherRefDto;", "spTeacher", "G0", "Y", "R", "v0", "w0", "y0", "q0", "s0", "i0", "h0", "", "note", "u0", "B0", "Q", "", "H0", "O", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "Lcom/untis/wu/rest/model/TeacherAbsenceReasonRefDto;", "n", "absenceReasonRefDto", "m", "h", "d", "teacher", "f", "c", "Lcom/untis/mobile/substitutionplanning/add/b;", "G", "Lkotlin/b0;", "P", "()Lcom/untis/mobile/substitutionplanning/add/b;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AddTeacherOwnAbsenceActivity extends b implements y0, c1
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public AddTeacherOwnAbsenceActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<com.untis.mobile.substitutionplanning.add.b>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final com.untis.mobile.substitutionplanning.add.b invoke() {
                return (com.untis.mobile.substitutionplanning.add.b)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(com.untis.mobile.substitutionplanning.add.b.class), null, null);
            }
        });
    }
    
    private final void A0() {
        final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.h(((ViewGroup)this.findViewById(c.i.p3)).getId(), (Fragment)SelectTeacherFragment.H.a(), "select-teacher-fragment");
        r.p("select-teacher-fragment");
        r.r();
    }
    
    private final void B0() {
        ((ViewGroup)this.findViewById(c.i.d3)).setVisibility(0);
    }
    
    private final void C0() {
        if (!this.H0()) {
            return;
        }
        final g<TeacherAbsenceDto> v = this.P().v();
        if (v == null) {
            return;
        }
        this.B0();
        v.C5((rx.functions.b)new m(this), (rx.functions.b)new q(this));
    }
    
    private static final void D0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TeacherAbsenceDto teacherAbsenceDto) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.Q();
        ((Activity)addTeacherOwnAbsenceActivity).setResult(-1);
        ((Activity)addTeacherOwnAbsenceActivity).finish();
    }
    
    private static final void E0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final Throwable t) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.Q();
        k0.o(t, "it");
        if (f.c(t)) {
            int n;
            if (addTeacherOwnAbsenceActivity.P().j()) {
                n = 2131886844;
            }
            else {
                n = 2131886845;
            }
            h.j((Context)addTeacherOwnAbsenceActivity, n);
        }
        else {
            h.l((Context)addTeacherOwnAbsenceActivity, t);
        }
    }
    
    private final void F0(final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        this.P().x(teacherAbsenceViewDto);
    }
    
    private final void G0(final TeacherRefDto teacherRefDto) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(c.i.y3);
        String displayName;
        if (teacherRefDto == null) {
            displayName = null;
        }
        else {
            displayName = teacherRefDto.getDisplayName();
        }
        String string = displayName;
        if (displayName == null) {
            string = ((Activity)this).getString(2131886851);
        }
        ((TextView)appCompatTextView).setText((CharSequence)string);
    }
    
    private final boolean H0() {
        final com.untis.mobile.substitutionplanning.add.b p = this.P();
        boolean b;
        if (!p.j() && ((LiveData)p.h()).f() == null) {
            b = false;
            h.j((Context)this, 2131886846);
        }
        else {
            b = true;
        }
        return b;
    }
    
    private final void O() {
        ((ComponentActivity)this).onBackPressed();
    }
    
    private final com.untis.mobile.substitutionplanning.add.b P() {
        return this.G.getValue();
    }
    
    private final void Q() {
        ((ViewGroup)this.findViewById(c.i.d3)).setVisibility(8);
    }
    
    private final void R() {
        ((ViewGroup)this.findViewById(c.i.l3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.y(this));
        ((LiveData)this.P().e()).j((y)this, (l0)new com.untis.mobile.substitutionplanning.add.g(this));
    }
    
    private static final void S(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.v0();
    }
    
    private static final void T(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)addTeacherOwnAbsenceActivity.findViewById(c.i.n3);
        String displayName;
        if (teacherAbsenceReasonRefDto == null) {
            displayName = null;
        }
        else {
            displayName = teacherAbsenceReasonRefDto.getDisplayName();
        }
        String string = displayName;
        if (displayName == null) {
            string = ((Activity)addTeacherOwnAbsenceActivity).getString(2131886842);
        }
        ((TextView)appCompatTextView).setText((CharSequence)string);
    }
    
    private final void U() {
        ((ImageView)this.findViewById(c.i.B3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.w(this));
        ((ImageView)this.findViewById(c.i.C3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.e(this));
        ((Button)this.findViewById(c.i.S2)).setOnClickListener((View$OnClickListener)new d(this));
    }
    
    private static final void V(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.O();
    }
    
    private static final void W(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.C0();
    }
    
    private static final void X(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.p0();
    }
    
    private final void Y() {
        ((ViewGroup)this.findViewById(c.i.s3)).setOnClickListener((View$OnClickListener)new v(this));
        ((LiveData)this.P().g()).j((y)this, (l0)new k(this));
        ((ViewGroup)this.findViewById(c.i.u3)).setOnClickListener((View$OnClickListener)new t(this));
        ((LiveData)this.P().g()).j((y)this, (l0)new i(this));
        ((ViewGroup)this.findViewById(c.i.W2)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.add.f(this));
        ((LiveData)this.P().b()).j((y)this, (l0)new j(this));
        ((ViewGroup)this.findViewById(c.i.Y2)).setOnClickListener((View$OnClickListener)new x(this));
        ((LiveData)this.P().b()).j((y)this, (l0)new l(this));
    }
    
    private static final void Z(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final org.joda.time.c c) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)addTeacherOwnAbsenceActivity.findViewById(com.untis.mobile.c.i.t3);
        CharSequence q;
        if (c == null) {
            q = null;
        }
        else {
            q = com.untis.mobile.utils.d0.q(c);
        }
        ((TextView)appCompatTextView).setText(q);
    }
    
    private static final void a0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.q0();
    }
    
    private static final void b0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final org.joda.time.c c) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)addTeacherOwnAbsenceActivity.findViewById(com.untis.mobile.c.i.V2);
        CharSequence l;
        if (c == null) {
            l = null;
        }
        else {
            l = com.untis.mobile.utils.d0.l(c);
        }
        ((TextView)appCompatTextView).setText(l);
    }
    
    private static final void c0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.s0();
    }
    
    private static final void d0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final org.joda.time.c c) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)addTeacherOwnAbsenceActivity.findViewById(com.untis.mobile.c.i.X2);
        CharSequence q;
        if (c == null) {
            q = null;
        }
        else {
            q = com.untis.mobile.utils.d0.q(c);
        }
        ((TextView)appCompatTextView).setText(q);
    }
    
    private static final void e0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.w0();
    }
    
    private static final void f0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final org.joda.time.c c) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)addTeacherOwnAbsenceActivity.findViewById(com.untis.mobile.c.i.r3);
        CharSequence l;
        if (c == null) {
            l = null;
        }
        else {
            l = com.untis.mobile.utils.d0.l(c);
        }
        ((TextView)appCompatTextView).setText(l);
    }
    
    private static final void g0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.y0();
    }
    
    private final void h0() {
        ((EditText)this.findViewById(c.i.j3)).addTextChangedListener((TextWatcher)new n0(new n6.l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                AddTeacherOwnAbsenceActivity.this.u0(s);
            }
        }));
    }
    
    private final void i0() {
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    private final void j0() {
        if (this.P().j()) {
            ((ViewGroup)this.findViewById(c.i.x3)).setVisibility(8);
        }
        else {
            ((ViewGroup)this.findViewById(c.i.x3)).setOnClickListener((View$OnClickListener)new u(this));
        }
        ((LiveData)this.P().h()).j((y)this, (l0)new com.untis.mobile.substitutionplanning.add.h(this));
        this.G0(null);
    }
    
    private static final void k0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final View view) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.A0();
    }
    
    private static final void l0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TeacherRefDto teacherRefDto) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.G0(teacherRefDto);
    }
    
    private final void m0() {
        final g<TeacherAbsenceViewDto> k = this.P().k();
        if (k == null) {
            return;
        }
        this.B0();
        final g q3 = k.Q3(rx.android.schedulers.a.c());
        if (q3 != null) {
            q3.C5((rx.functions.b)new o(this), (rx.functions.b)new p(this));
        }
    }
    
    private static final void n0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        k0.o(teacherAbsenceViewDto, "it");
        addTeacherOwnAbsenceActivity.F0(teacherAbsenceViewDto);
        addTeacherOwnAbsenceActivity.Q();
    }
    
    private static final void o0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final Throwable t) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        k0.o(t, "it");
        h.l((Context)addTeacherOwnAbsenceActivity, t);
        addTeacherOwnAbsenceActivity.Q();
    }
    
    private final void p0() {
        h.p((Context)this, "delete clicked");
    }
    
    private final void q0() {
        final org.joda.time.c c = (org.joda.time.c)((LiveData)this.P().b()).f();
        org.joda.time.t h1;
        if (c == null) {
            h1 = null;
        }
        else {
            h1 = c.h1();
        }
        if (h1 == null) {
            return;
        }
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this, 2131951928, (DatePickerDialog$OnDateSetListener)new com.untis.mobile.substitutionplanning.add.c(this), h1.k2(), h1.f3() - 1, h1.X3());
        datePickerDialog.getDatePicker().setMinDate(((org.joda.time.base.g)com.untis.mobile.utils.v.a.g().F0()).n());
        datePickerDialog.show();
    }
    
    private static final void r0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.P().y(new org.joda.time.t(n, n2 + 1, n3));
    }
    
    private final void s0() {
        final org.joda.time.c c = (org.joda.time.c)((LiveData)this.P().b()).f();
        org.joda.time.v j1;
        if (c == null) {
            j1 = null;
        }
        else {
            j1 = c.j1();
        }
        if (j1 == null) {
            return;
        }
        new TimePickerDialog((Context)this, 2131951928, (TimePickerDialog$OnTimeSetListener)new r(this), j1.s4(), j1.k5(), true).show();
    }
    
    private static final void t0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.P().z(new org.joda.time.v(n, n2));
    }
    
    private final void u0(final String s) {
        this.P().d().q((Object)s);
    }
    
    private final void v0() {
        final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.h(((ViewGroup)this.findViewById(c.i.p3)).getId(), (Fragment)SelectReasonFragment.H.a(), "select-reason-fragment");
        r.p("select-reason-fragment");
        r.r();
    }
    
    private final void w0() {
        final org.joda.time.c c = (org.joda.time.c)((LiveData)this.P().g()).f();
        org.joda.time.t h1;
        if (c == null) {
            h1 = null;
        }
        else {
            h1 = c.h1();
        }
        if (h1 == null) {
            return;
        }
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this, 2131951928, (DatePickerDialog$OnDateSetListener)new n(this), h1.k2(), h1.f3() - 1, h1.X3());
        datePickerDialog.getDatePicker().setMinDate(((org.joda.time.base.g)com.untis.mobile.utils.v.a.g().F0()).n());
        datePickerDialog.show();
    }
    
    private static final void x0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.P().A(new org.joda.time.t(n, n2 + 1, n3));
    }
    
    private final void y0() {
        final org.joda.time.c c = (org.joda.time.c)((LiveData)this.P().g()).f();
        org.joda.time.v j1;
        if (c == null) {
            j1 = null;
        }
        else {
            j1 = c.j1();
        }
        if (j1 == null) {
            return;
        }
        new TimePickerDialog((Context)this, 2131951928, (TimePickerDialog$OnTimeSetListener)new s(this), j1.s4(), j1.k5(), true).show();
    }
    
    private static final void z0(final AddTeacherOwnAbsenceActivity addTeacherOwnAbsenceActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(addTeacherOwnAbsenceActivity, "this$0");
        addTeacherOwnAbsenceActivity.P().B(new org.joda.time.v(n, n2));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    public void c() {
        ((ComponentActivity)this).onBackPressed();
    }
    
    @e
    @Override
    public List<TeacherRefDto> d() {
        List<TeacherRefDto> list;
        if ((list = this.P().i()) == null) {
            list = kotlin.collections.v.E();
        }
        return list;
    }
    
    @Override
    public void f(@e final TeacherRefDto teacherRefDto) {
        k0.p(teacherRefDto, "teacher");
        this.P().h().q((Object)teacherRefDto);
        ((ComponentActivity)this).onBackPressed();
    }
    
    @Override
    public void h() {
        ((ComponentActivity)this).onBackPressed();
    }
    
    @Override
    public void m(@e final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto) {
        k0.p(teacherAbsenceReasonRefDto, "absenceReasonRefDto");
        this.P().e().q((Object)teacherAbsenceReasonRefDto);
        ((ComponentActivity)this).onBackPressed();
    }
    
    @e
    @Override
    public List<TeacherAbsenceReasonRefDto> n() {
        List<TeacherAbsenceReasonRefDto> list;
        if ((list = this.P().f()) == null) {
            list = kotlin.collections.v.E();
        }
        return list;
    }
    
    @Override
    protected void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492900);
        this.findViewById(c.i.b3).requestFocus();
        this.U();
        this.j0();
        this.Y();
        this.R();
        this.h0();
        this.i0();
        this.m0();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/substitutionplanning/add/AddTeacherOwnAbsenceActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)AddTeacherOwnAbsenceActivity.class);
        }
    }
}
