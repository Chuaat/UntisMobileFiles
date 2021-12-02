// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.addabsence;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.l0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.v;
import org.joda.time.t;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.dashboard.ui.option.addabsence.dialog.AddStudentAbsenceSelectStudentDialog;
import com.untis.mobile.dashboard.ui.option.addabsence.dialog.AddStudentAbsenceSelectReasonDialog;
import android.content.Context;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import androidx.lifecycle.y;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.view.View;
import kotlin.d0;
import com.untis.mobile.dashboard.ui.option.absence.student.c;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.lifecycle.d1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import android.os.Bundle;
import n6.a;
import kotlin.jvm.internal.k1;
import kotlin.b0;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010,\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/addabsence/AddStudentAbsenceFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "settings", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lkotlin/j2;", "a0", "Y", "X", "S", "Lorg/joda/time/c;", "start", "T", "V", "end", "O", "Q", "", "show", "Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/addabsence/n;", "G", "Landroidx/navigation/m;", "J", "()Lcom/untis/mobile/dashboard/ui/option/addabsence/n;", "args", "Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "H", "Lkotlin/b0;", "K", "()Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AddStudentAbsenceFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public AddStudentAbsenceFragment() {
        this.G = new m(k1.d(n.class), (a)new a<Bundle>() {
            final /* synthetic */ Fragment G;
            
            @e
            @Override
            public final Bundle invoke() {
                final Bundle arguments = this.G.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this.G);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
        this.H = d0.c((a<?>)new a<c>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final c invoke() {
                return (c)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(c.class), null, this.I, null);
            }
        });
    }
    
    private final n J() {
        return ((b0<n>)this.G).getValue();
    }
    
    private final c K() {
        return this.H.getValue();
    }
    
    private static final void L(final AddStudentAbsenceFragment addStudentAbsenceFragment, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        addStudentAbsenceFragment.onBackPressed();
    }
    
    private static final void M(final AddStudentAbsenceFragment addStudentAbsenceFragment, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        addStudentAbsenceFragment.Y();
    }
    
    private static final void N(final AddStudentAbsenceFragment addStudentAbsenceFragment, final View view, final DashboardStudentAbsence dashboardStudentAbsence) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(view, "$view");
        if (dashboardStudentAbsence == null) {
            return;
        }
        final y viewLifecycleOwner = addStudentAbsenceFragment.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            Object G;
            int H;
            final /* synthetic */ AddStudentAbsenceFragment I;
            final /* synthetic */ DashboardStudentAbsence J;
            final /* synthetic */ View K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    int H;
                    final /* synthetic */ AddStudentAbsenceFragment I = this.I;
                    final /* synthetic */ DashboardStudentAbsence J = this.J;
                    final /* synthetic */ View K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((AddStudentAbsenceFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int h2 = this.H;
                ClassbookSettings g = null;
                Label_0154: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                g = (ClassbookSettings)this.G;
                                c1.n(o);
                                break Label_0154;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final c f = AddStudentAbsenceFragment.this.K();
                        this.H = 1;
                        if ((o = f.u(this)) == h) {
                            return h;
                        }
                    }
                    g = (ClassbookSettings)o;
                    final c f2 = AddStudentAbsenceFragment.this.K();
                    final long studentId = this.J.getStudentId();
                    final long f3 = AddStudentAbsenceFragment.this.J().f();
                    this.G = g;
                    this.H = 2;
                    o = f2.s(studentId, f3, this);
                    if (o == h) {
                        return h;
                    }
                }
                AddStudentAbsenceFragment.this.a0(this.K, g, this.J, (Student)o);
                AddStudentAbsenceFragment.this.Z(this.K, false);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    private final void O(final org.joda.time.c c) {
        new DatePickerDialog(this.requireContext(), (DatePickerDialog$OnDateSetListener)new com.untis.mobile.dashboard.ui.option.addabsence.e(this, c), ((org.joda.time.base.a)c).k2(), com.untis.mobile.utils.d0.b(c), ((org.joda.time.base.a)c).X3()).show();
    }
    
    private static final void P(final AddStudentAbsenceFragment addStudentAbsenceFragment, final org.joda.time.c c, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(c, "$end");
        addStudentAbsenceFragment.K().O(com.untis.mobile.utils.d0.h(c, n, n2, n3));
    }
    
    private final void Q(final org.joda.time.c c) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        new TimePickerDialog(requireContext, (TimePickerDialog$OnTimeSetListener)new com.untis.mobile.dashboard.ui.option.addabsence.f(this, c), ((org.joda.time.base.a)c).s4(), ((org.joda.time.base.a)c).k5(), com.untis.mobile.utils.d0.c(requireContext)).show();
    }
    
    private static final void R(final AddStudentAbsenceFragment addStudentAbsenceFragment, final org.joda.time.c c, final TimePicker timePicker, final int n, final int n2) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(c, "$end");
        addStudentAbsenceFragment.K().O(com.untis.mobile.utils.d0.i(c, n, n2));
    }
    
    private final void S() {
        new AddStudentAbsenceSelectReasonDialog().L(this.getChildFragmentManager(), "add-student-absence-select-reason-dialog");
    }
    
    private final void T(final org.joda.time.c c) {
        new DatePickerDialog(this.requireContext(), (DatePickerDialog$OnDateSetListener)new com.untis.mobile.dashboard.ui.option.addabsence.a(this, c), ((org.joda.time.base.a)c).k2(), com.untis.mobile.utils.d0.b(c), ((org.joda.time.base.a)c).X3()).show();
    }
    
    private static final void U(final AddStudentAbsenceFragment addStudentAbsenceFragment, final org.joda.time.c c, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(c, "$start");
        addStudentAbsenceFragment.K().P(com.untis.mobile.utils.d0.h(c, n, n2, n3));
    }
    
    private final void V(final org.joda.time.c c) {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        new TimePickerDialog(requireContext, (TimePickerDialog$OnTimeSetListener)new com.untis.mobile.dashboard.ui.option.addabsence.g(this, c), ((org.joda.time.base.a)c).s4(), ((org.joda.time.base.a)c).k5(), com.untis.mobile.utils.d0.c(requireContext)).show();
    }
    
    private static final void W(final AddStudentAbsenceFragment addStudentAbsenceFragment, final org.joda.time.c c, final TimePicker timePicker, final int n, final int n2) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(c, "$start");
        addStudentAbsenceFragment.K().P(com.untis.mobile.utils.d0.i(c, n, n2));
    }
    
    private final void X() {
        new AddStudentAbsenceSelectStudentDialog().L(this.getChildFragmentManager(), "add-student-absence-select-student-dialog");
    }
    
    private final void Y() {
        if (!this.K().U()) {
            final Context requireContext = this.requireContext();
            k0.o(requireContext, "requireContext()");
            com.untis.mobile.utils.extension.h.q(requireContext, 2131886313);
            return;
        }
        this.K().T(this.getErrorHandler(), new a<j2>() {
            public final void invoke() {
                UmFragment.this.onBackPressed();
            }
        });
    }
    
    private final void Z(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void a0(final View view, final ClassbookSettings classbookSettings, final DashboardStudentAbsence dashboardStudentAbsence, final Student student) {
        if (dashboardStudentAbsence.getId() <= 0L && !this.K().G()) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.vo);
            String displayName;
            if (student == null) {
                displayName = null;
            }
            else {
                displayName = student.getDisplayName();
            }
            String string = displayName;
            if (displayName == null) {
                string = this.getString(2131886745);
            }
            ((TextView)appCompatTextView).setText((CharSequence)string);
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.uo)).setOnClickListener((View$OnClickListener)new i(this));
        }
        else {
            final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.vo);
            CharSequence displayName2;
            if (student == null) {
                displayName2 = null;
            }
            else {
                displayName2 = student.getDisplayName();
            }
            ((TextView)appCompatTextView2).setText(displayName2);
            final int uo = com.untis.mobile.c.i.uo;
            ((ViewGroup)view.findViewById(uo)).setClickable(false);
            ((ViewGroup)view.findViewById(uo)).setFocusable(false);
            ((ViewGroup)view.findViewById(uo)).setOnClickListener((View$OnClickListener)null);
            ((ImageView)view.findViewById(com.untis.mobile.c.i.co)).setVisibility(8);
        }
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.qo)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.addabsence.c(this, dashboardStudentAbsence));
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.ro);
        final t h1 = dashboardStudentAbsence.getStart().h1();
        k0.o(h1, "absence.start.toLocalDate()");
        ((TextView)appCompatTextView3).setText((CharSequence)com.untis.mobile.utils.d0.m(h1));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.so)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.addabsence.m(this, dashboardStudentAbsence));
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.to);
        final v j1 = dashboardStudentAbsence.getStart().j1();
        k0.o(j1, "absence.start.toLocalTime()");
        ((TextView)appCompatTextView4).setText((CharSequence)com.untis.mobile.utils.d0.r(j1));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.eo)).setOnClickListener((View$OnClickListener)new l(this, dashboardStudentAbsence));
        final AppCompatTextView appCompatTextView5 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.fo);
        final t h2 = dashboardStudentAbsence.getEnd().h1();
        k0.o(h2, "absence.end.toLocalDate()");
        ((TextView)appCompatTextView5).setText((CharSequence)com.untis.mobile.utils.d0.m(h2));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.go)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.addabsence.b(this, dashboardStudentAbsence));
        final AppCompatTextView appCompatTextView6 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.ho);
        final v j2 = dashboardStudentAbsence.getEnd().j1();
        k0.o(j2, "absence.end.toLocalTime()");
        ((TextView)appCompatTextView6).setText((CharSequence)com.untis.mobile.utils.d0.r(j2));
        ((ImageView)view.findViewById(com.untis.mobile.c.i.oo)).setVisibility(com.untis.mobile.utils.extension.h.U(classbookSettings.getShowAbsenceReason() && this.K().a() && classbookSettings.getShowAbsenceText(), 0, 1, null));
        final AppCompatTextView appCompatTextView7 = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.po);
        String text;
        if ((text = dashboardStudentAbsence.getReasonTitle()) == null) {
            text = this.getString(2131886842);
        }
        ((TextView)appCompatTextView7).setText((CharSequence)text);
        final int no = com.untis.mobile.c.i.no;
        ((ViewGroup)view.findViewById(no)).setVisibility(com.untis.mobile.utils.extension.h.U(classbookSettings.getShowAbsenceReason() && this.K().a(), 0, 1, null));
        ((ViewGroup)view.findViewById(no)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.addabsence.h(this));
        ((ImageView)view.findViewById(com.untis.mobile.c.i.mo)).setVisibility(com.untis.mobile.utils.extension.h.U(classbookSettings.getShowAbsenceReason() && classbookSettings.getShowAbsenceReason(), 0, 1, null));
        final int do1 = com.untis.mobile.c.i.do;
        ((EditText)view.findViewById(do1)).setText((CharSequence)dashboardStudentAbsence.getText());
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.lo)).setVisibility(com.untis.mobile.utils.extension.h.U(classbookSettings.getShowAbsenceText(), 0, 1, null));
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(do1);
        k0.o(appCompatEditText, "view.fragment_dashboard_addstudentabsence_edit_note");
        com.untis.mobile.utils.extension.h.A(appCompatEditText, new n6.l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                AddStudentAbsenceFragment.this.K().Q(s);
            }
        });
    }
    
    private static final void b0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        addStudentAbsenceFragment.X();
    }
    
    private static final void c0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        addStudentAbsenceFragment.T(dashboardStudentAbsence.getStart());
    }
    
    private static final void d0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        addStudentAbsenceFragment.V(dashboardStudentAbsence.getStart());
    }
    
    private static final void e0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        addStudentAbsenceFragment.O(dashboardStudentAbsence.getEnd());
    }
    
    private static final void f0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final DashboardStudentAbsence dashboardStudentAbsence, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        k0.p(dashboardStudentAbsence, "$absence");
        addStudentAbsenceFragment.Q(dashboardStudentAbsence.getEnd());
    }
    
    private static final void g0(final AddStudentAbsenceFragment addStudentAbsenceFragment, final View view) {
        k0.p(addStudentAbsenceFragment, "this$0");
        addStudentAbsenceFragment.S();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        if (!this.K().F()) {
            this.K().K();
            this.K().H(this.getErrorHandler());
        }
        this.K().I(this.J().e());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493083, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.ko)).setOnClickListener((View$OnClickListener)new j(this));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.jo)).setOnClickListener((View$OnClickListener)new k(this));
        this.Z(inflate, true);
        this.K().A().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.addabsence.d(this, inflate));
        return inflate;
    }
}
