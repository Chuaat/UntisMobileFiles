// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences;

import android.widget.ImageButton;
import android.widget.FrameLayout;
import android.widget.Button;
import androidx.activity.ComponentActivity;
import android.widget.EditText;
import android.app.Dialog;
import android.app.Activity;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.Menu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import android.os.Bundle;
import android.content.Intent;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import com.untis.mobile.persistence.models.classbook.absence.StudentAttendance;
import android.annotation.SuppressLint;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.untis.mobile.ui.activities.classbook.absences.absencereason.AbsenceReasonActivity;
import com.google.android.material.textfield.TextInputEditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.widget.RelativeLayout;
import com.untis.mobile.utils.u0;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.Set;
import kotlin.collections.v;
import kotlin.c1;
import java.util.Iterator;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import android.content.DialogInterface;
import org.joda.time.c;
import org.joda.time.l0;
import android.widget.TimePicker;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import java.util.List;
import com.untis.mobile.services.classbook.a;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsenceResult;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Y2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0016\u0010\u001e\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J\b\u0010 \u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001cH\u0003J\u0016\u0010$\u001a\u00020\"2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0003J\u0016\u0010%\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\bH\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002J\u0012\u0010+\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\u0002H\u0002J\u0012\u0010.\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0014J\b\u0010/\u001a\u00020\bH\u0014J\u0010\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020,H\u0014J\"\u00107\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\b\u00106\u001a\u0004\u0018\u000105H\u0014J\u0012\u0010:\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;H\u0017R\u0018\u0010@\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR&\u0010R\u001a\u0012\u0012\u0004\u0012\u00020N0Mj\b\u0012\u0004\u0012\u00020N`O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006[" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/AbsenceDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "j0", "k0", "Lorg/joda/time/c;", "Z0", "dateTime", "Lkotlin/j2;", "D1", "w1", "z1", "y1", "u1", "Y0", "C1", "m1", "p1", "o1", "t1", "K1", "b1", "J1", "L1", "v1", "F1", "A0", "", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "results", "B1", "q0", "O0", "result", "Landroid/view/View;", "o0", "p0", "I1", "H1", "G1", "E1", "a1", "finish", "K0", "Landroid/os/Bundle;", "save", "onCreate", "onResume", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "L", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "absenceResult", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "J", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "students", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "K", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "absence", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AbsenceDetailActivity extends b
{
    @e
    public static final a M;
    @e
    private static final String N = "gamma";
    @e
    private static final String O = "omega";
    @e
    private static final String P = "alpha";
    @e
    private static final String Q = "beta";
    @e
    private static final String R = "zeta";
    @e
    private static final String S = "aoide";
    @e
    private static final String T = "oida";
    @e
    private static final String U = "theta";
    private Profile G;
    @e
    private ArrayList<Student> H;
    private Period I;
    private Classbook J;
    private StudentAbsence K;
    @f
    private StudentAbsenceResult L;
    
    static {
        M = new a(null);
    }
    
    public AbsenceDetailActivity() {
        this.H = new ArrayList<Student>();
    }
    
    private final void A0() {
        final StudentAbsence k = this.K;
        if (k == null) {
            k0.S("absence");
            throw null;
        }
        if (k.getStudent().getId() == 0L && (this.H.isEmpty() ^ true)) {
            final StudentAbsence i = this.K;
            if (i == null) {
                k0.S("absence");
                throw null;
            }
            final Student value = this.H.get(0);
            k0.o(value, "students[0]");
            i.setStudent(value);
        }
        this.E1();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period j = this.I;
        if (j == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence l = this.K;
        if (l != null) {
            com.untis.mobile.services.classbook.a.a.b(classBookService, j, l, this.H, null, 8, null).C5((rx.functions.b)new f0(this), (rx.functions.b)new c0(this));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void A1(final AbsenceDetailActivity absenceDetailActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(absenceDetailActivity, "this$0");
        final c y1 = absenceDetailActivity.Z0().Y1(n, n2, 0, 0);
        final c y2 = absenceDetailActivity.Y0();
        Object z1 = null;
        Label_0067: {
            if (!((org.joda.time.base.c)y2).C((l0)y1)) {
                z1 = y2;
                if (!((org.joda.time.base.c)y2).X4((l0)y1)) {
                    break Label_0067;
                }
            }
            z1 = y1.Z1(y2.j1());
            k0.o(z1, "start.withTime(end.toLocalTime())");
        }
        Object v0 = null;
        Label_0111: {
            if (!((org.joda.time.base.c)z1).C((l0)y1)) {
                v0 = z1;
                if (!((org.joda.time.base.c)z1).X4((l0)y1)) {
                    break Label_0111;
                }
            }
            v0 = new c((Object)y1).V0(1);
            k0.o(v0, "DateTime(start).plusMinutes(1)");
        }
        k0.o(y1, "start");
        absenceDetailActivity.D1(y1);
        absenceDetailActivity.C1((c)v0);
        absenceDetailActivity.K1();
    }
    
    private static final void B0(final AbsenceDetailActivity absenceDetailActivity, final List list) {
        k0.p(absenceDetailActivity, "this$0");
        k0.o(list, "results");
        if (absenceDetailActivity.I1(list)) {
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>(null) {
                Object G;
                Object H;
                Object I;
                Object J;
                Object K;
                Object L;
                Object M;
                int N;
                final /* synthetic */ List<StudentAbsenceResult> O;
                final /* synthetic */ AbsenceDetailActivity P;
                final /* synthetic */ ArrayList<StudentAbsence> Q;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        Object K;
                        Object L;
                        Object M;
                        int N;
                        final /* synthetic */ List<StudentAbsenceResult> O = this.O;
                        final /* synthetic */ AbsenceDetailActivity P = this.P;
                        final /* synthetic */ ArrayList<StudentAbsence> Q = this.Q;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$h)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int n = this.N;
                    while (true) {
                        Object o2 = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection collection = null;
                        ArrayList<StudentAbsence> list = null;
                        Iterator<StudentAbsenceResult> iterator2 = null;
                        AbsenceDetailActivity absenceDetailActivity = null;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                        Object a = null;
                        Label_0382: {
                            ArrayList<StudentAbsence> q;
                            AbsenceDetailActivity p2;
                            Object iterator3;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p3;
                            if (n != 0) {
                                if (n == 1) {
                                    o2 = this.M;
                                    iterator = (Iterator<StudentAbsence>)this.L;
                                    collection = (Collection)this.K;
                                    list = (ArrayList<StudentAbsence>)this.J;
                                    iterator2 = (Iterator<StudentAbsenceResult>)this.I;
                                    absenceDetailActivity = (AbsenceDetailActivity)this.H;
                                    q = (ArrayList<StudentAbsence>)this.G;
                                    c1.n(o);
                                    p = this;
                                    a = o;
                                    break Label_0382;
                                }
                                if (n == 2) {
                                    c1.n(o);
                                    return j2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsenceResult> o3 = this.O;
                                k0.o(o3, "results");
                                q = this.Q;
                                p2 = this.P;
                                iterator3 = o3.iterator();
                                p3 = this;
                            }
                            AbsenceDetailActivity h2;
                            ArrayList<StudentAbsence> j;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p5;
                            Object l;
                            while (true) {
                                if (((Iterator)iterator3).hasNext()) {
                                    final List<StudentAbsence> absences = ((Iterator<StudentAbsenceResult>)iterator3).next().getAbsences();
                                    final Object o4 = new ArrayList(v.Y((Iterable<?>)absences, 10));
                                    final Iterator<Object> iterator4 = absences.iterator();
                                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p4 = p3;
                                    h2 = p2;
                                    o = o4;
                                    j = q;
                                    p5 = p4;
                                    l = iterator4;
                                }
                                else {
                                    final Classbook m0 = AbsenceDetailActivity.m0(p3.P);
                                    if (m0 == null) {
                                        k0.S("classbook");
                                        throw null;
                                    }
                                    final Set<Long> absences2 = m0.getAbsences();
                                    final ArrayList<StudentAbsence> q2 = p3.Q;
                                    final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)q2, 10));
                                    final Iterator<Object> iterator5 = q2.iterator();
                                    while (iterator5.hasNext()) {
                                        list2.add(kotlin.coroutines.jvm.internal.b.g(iterator5.next().getId()));
                                    }
                                    absences2.addAll((Collection<? extends Long>)list2);
                                    final Profile n2 = AbsenceDetailActivity.n0(p3.P);
                                    if (n2 == null) {
                                        k0.S("profile");
                                        throw null;
                                    }
                                    final a classBookService = n2.getClassBookService();
                                    final Classbook m2 = AbsenceDetailActivity.m0(p3.P);
                                    if (m2 == null) {
                                        k0.S("classbook");
                                        throw null;
                                    }
                                    p3.G = null;
                                    p3.H = null;
                                    p3.I = null;
                                    p3.J = null;
                                    p3.K = null;
                                    p3.L = null;
                                    p3.M = null;
                                    p3.N = 2;
                                    if (classBookService.a0(m2, p3) == h) {
                                        return h;
                                    }
                                    return j2.a;
                                }
                                if (!((Iterator)l).hasNext()) {
                                    j.addAll((Collection<? extends StudentAbsence>)o);
                                    p3 = p5;
                                    p2 = h2;
                                    continue;
                                }
                                break;
                            }
                            final StudentAbsence studentAbsence = ((Iterator<StudentAbsence>)l).next();
                            final Profile n3 = AbsenceDetailActivity.n0(h2);
                            if (n3 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService2 = n3.getClassBookService();
                            p5.G = q;
                            p5.H = h2;
                            p5.I = iterator3;
                            p5.J = j;
                            p5.K = o;
                            p5.L = l;
                            p5.M = o;
                            p5.N = 1;
                            a = classBookService2.a(studentAbsence, p5);
                            if (a == h) {
                                return h;
                            }
                            final ArrayList<StudentAbsence> list3 = j;
                            final AbsenceDetailActivity absenceDetailActivity2 = h2;
                            final Object o5 = o;
                            final Iterator<StudentAbsenceResult> iterator6 = (Iterator<StudentAbsenceResult>)iterator3;
                            p = p5;
                            list = list3;
                            absenceDetailActivity = absenceDetailActivity2;
                            iterator2 = iterator6;
                            iterator = (Iterator<StudentAbsence>)l;
                            collection = (Collection)o5;
                            o2 = o;
                        }
                        ((Collection<StudentAbsence>)o2).add((StudentAbsence)a);
                        o = collection;
                        final Iterator<StudentAbsenceResult> iterator7 = iterator2;
                        final AbsenceDetailActivity absenceDetailActivity3 = absenceDetailActivity;
                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p6 = p;
                        ArrayList<StudentAbsence> j = list;
                        AbsenceDetailActivity h2 = absenceDetailActivity3;
                        Object l = iterator;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p5 = p6;
                        Object iterator3 = iterator7;
                        continue;
                    }
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, list2, false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            final d$a u = new d$a((Context)absenceDetailActivity, 2131951624).M(absenceDetailActivity.p0(list)).r(2131886649, (DialogInterface$OnClickListener)new y0(absenceDetailActivity)).u(2131886117, (DialogInterface$OnClickListener)new v0(absenceDetailActivity));
            if (absenceDetailActivity.B1(list)) {
                u.B(2131886118, (DialogInterface$OnClickListener)new w0(absenceDetailActivity));
            }
            ((Dialog)u.a()).show();
        }
    }
    
    private final boolean B1(final List<StudentAbsenceResult> list) {
        final Iterator<Object> iterator = list.iterator();
        while (true) {
            StudentAbsenceResult next;
            do {
                final boolean hasNext = iterator.hasNext();
                boolean b = true;
                if (!hasNext) {
                    next = null;
                    if (next != null) {
                        b = false;
                    }
                    return b;
                }
                next = iterator.next();
            } while (!(next.getSeparateSaveAllowed() ^ true));
            continue;
        }
    }
    
    private static final void C0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private final void C1(final c end) {
        final StudentAbsence k = this.K;
        if (k != null) {
            k.setEnd(end);
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void D0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.w(i, k, absenceDetailActivity.H, CreateAbsenceStrategy.COMBINE).C5((rx.functions.b)new t0(absenceDetailActivity, dialogInterface), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.absences.k0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void D1(final c start) {
        final StudentAbsence k = this.K;
        if (k != null) {
            k.setStart(start);
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void E0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final List list) {
        k0.p(absenceDetailActivity, "this$0");
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        k0.o(list, "results");
        if (absenceDetailActivity.I1(list)) {
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>(null) {
                Object G;
                Object H;
                Object I;
                Object J;
                Object K;
                Object L;
                Object M;
                int N;
                final /* synthetic */ List<StudentAbsenceResult> O;
                final /* synthetic */ ArrayList<StudentAbsence> P;
                final /* synthetic */ AbsenceDetailActivity Q;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        Object K;
                        Object L;
                        Object M;
                        int N;
                        final /* synthetic */ List<StudentAbsenceResult> O = this.O;
                        final /* synthetic */ ArrayList<StudentAbsence> P = this.P;
                        final /* synthetic */ AbsenceDetailActivity Q = this.Q;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$k)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int n = this.N;
                    while (true) {
                        Object o2 = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection collection = null;
                        ArrayList<StudentAbsence> list = null;
                        Iterator<StudentAbsenceResult> iterator2 = null;
                        AbsenceDetailActivity absenceDetailActivity = null;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                        Object a = null;
                        Label_0357: {
                            ArrayList<StudentAbsence> p2;
                            AbsenceDetailActivity q;
                            Object iterator3;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p3;
                            if (n != 0) {
                                if (n == 1) {
                                    o2 = this.M;
                                    iterator = (Iterator<StudentAbsence>)this.L;
                                    collection = (Collection)this.K;
                                    list = (ArrayList<StudentAbsence>)this.J;
                                    iterator2 = (Iterator<StudentAbsenceResult>)this.I;
                                    absenceDetailActivity = (AbsenceDetailActivity)this.H;
                                    final ArrayList<StudentAbsence> g = (ArrayList<StudentAbsence>)this.G;
                                    c1.n(o);
                                    p = this;
                                    a = o;
                                    break Label_0357;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsenceResult> o3 = this.O;
                                k0.o(o3, "results");
                                p2 = this.P;
                                q = this.Q;
                                iterator3 = o3.iterator();
                                p3 = this;
                            }
                            ArrayList<StudentAbsence> g;
                            Object iterator4;
                            AbsenceDetailActivity h2;
                            while (true) {
                                if (!((Iterator)iterator3).hasNext()) {
                                    return j2.a;
                                }
                                final List<StudentAbsence> absences = ((Iterator<StudentAbsenceResult>)iterator3).next().getAbsences();
                                final Object o4 = new ArrayList(v.Y((Iterable<?>)absences, 10));
                                iterator4 = absences.iterator();
                                g = p2;
                                h2 = q;
                                o = o4;
                                if (!((Iterator)iterator4).hasNext()) {
                                    p2.addAll((Collection<? extends StudentAbsence>)o);
                                    q = h2;
                                    p2 = g;
                                    continue;
                                }
                                break;
                            }
                            final StudentAbsence studentAbsence = ((Iterator<StudentAbsence>)iterator4).next();
                            final Profile n2 = AbsenceDetailActivity.n0(h2);
                            if (n2 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n2.getClassBookService();
                            p3.G = g;
                            p3.H = h2;
                            p3.I = iterator3;
                            p3.J = p2;
                            p3.K = o;
                            p3.L = iterator4;
                            p3.M = o;
                            p3.N = 1;
                            a = classBookService.a(studentAbsence, p3);
                            if (a == h) {
                                return h;
                            }
                            final ArrayList<StudentAbsence> list2 = p2;
                            final AbsenceDetailActivity absenceDetailActivity2 = h2;
                            final Object o5 = o;
                            iterator2 = (Iterator<StudentAbsenceResult>)iterator3;
                            p = p3;
                            list = list2;
                            absenceDetailActivity = absenceDetailActivity2;
                            iterator = (Iterator<StudentAbsence>)iterator4;
                            collection = (Collection)o5;
                            o2 = o;
                        }
                        ((Collection<StudentAbsence>)o2).add((StudentAbsence)a);
                        o = collection;
                        final Iterator<StudentAbsenceResult> iterator5 = iterator2;
                        final AbsenceDetailActivity absenceDetailActivity3 = absenceDetailActivity;
                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p4 = p;
                        ArrayList<StudentAbsence> p2 = list;
                        AbsenceDetailActivity h2 = absenceDetailActivity3;
                        Object iterator4 = iterator;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p3 = p4;
                        Object iterator3 = iterator5;
                        continue;
                    }
                }
            }, 1, (Object)null);
            final ArrayList<Student> h = absenceDetailActivity.H;
            final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)h, 10));
            final Iterator<Object> iterator = h.iterator();
            while (iterator.hasNext()) {
                list3.add(Long.valueOf(iterator.next().getId()));
            }
            final Classbook j = absenceDetailActivity.J;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences = j.getAbsences();
            final ArrayList<Object> list4 = (ArrayList<Object>)new ArrayList<StudentAbsence>();
            final Iterator<Number> iterator2 = absences.iterator();
            while (iterator2.hasNext()) {
                final long longValue = iterator2.next().longValue();
                final Profile g = absenceDetailActivity.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final StudentAbsence z = g.getClassBookService().Z(longValue);
                if (z == null) {
                    continue;
                }
                list4.add(z);
            }
            final ArrayList<StudentAbsence> list5 = new ArrayList<StudentAbsence>();
            for (final StudentAbsence next : list4) {
                if (list3.contains(next.getStudent().getId()) ^ true) {
                    list5.add(next);
                }
            }
            final ArrayList list6 = new ArrayList<Long>(v.Y((Iterable<?>)list5, 10));
            final Iterator<Object> iterator4 = list5.iterator();
            while (iterator4.hasNext()) {
                list6.add(Long.valueOf(iterator4.next().getId()));
            }
            j.setAbsences(v.M5((Iterable<? extends Long>)list6));
            final Classbook i = absenceDetailActivity.J;
            if (i == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences2 = i.getAbsences();
            final ArrayList list7 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
            final Iterator<Object> iterator5 = list2.iterator();
            while (iterator5.hasNext()) {
                list7.add(Long.valueOf(iterator5.next().getId()));
            }
            absences2.addAll((Collection<? extends Long>)list7);
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$l)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, list2, false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private final void E1() {
        ((RelativeLayout)this.findViewById(com.untis.mobile.c.i.nE)).setVisibility(0);
    }
    
    private static final void F0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not create absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private final void F1() {
        final StudentAbsence k = this.K;
        if (k != null) {
            if (k.getId() > 0L) {
                this.O0();
            }
            else {
                final StudentAbsence i = this.K;
                if (i == null) {
                    k0.S("absence");
                    throw null;
                }
                if (i.getStudent().getId() == 0L && this.H.size() > 1) {
                    this.A0();
                }
                else {
                    this.q0();
                }
            }
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void G0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.w(i, k, absenceDetailActivity.H, CreateAbsenceStrategy.WRITE_SEPARATE).C5((rx.functions.b)new q0(absenceDetailActivity, dialogInterface), (rx.functions.b)new o0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void G1() {
        this.E1();
        final StudentAbsence k = this.K;
        if (k == null) {
            k0.S("absence");
            throw null;
        }
        final Period i = this.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        k.setPeriodId(i.getId());
        final StudentAbsence j = this.K;
        if (j == null) {
            k0.S("absence");
            throw null;
        }
        j.setSynced(false);
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final StudentAbsence l = this.K;
        if (l != null) {
            if (l.getStudent().getId() != 0L) {
                h.h((g)null, (p)new p<r0, d<? super Boolean>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ ArrayList<StudentAbsence> I;
                    final /* synthetic */ AbsenceDetailActivity J;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Boolean>, Object>() {
                            Object G;
                            int H;
                            final /* synthetic */ ArrayList<StudentAbsence> I = this.I;
                            final /* synthetic */ AbsenceDetailActivity J = this.J;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super Boolean> d) {
                        return ((AbsenceDetailActivity$u)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int h2 = this.H;
                        ArrayList<Object> list;
                        Object a;
                        if (h2 != 0) {
                            if (h2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = (ArrayList<Object>)this.G;
                            c1.n(o);
                            a = o;
                        }
                        else {
                            c1.n(o);
                            final ArrayList<StudentAbsence> i = this.I;
                            final Profile n0 = AbsenceDetailActivity.n0(this.J);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            final StudentAbsence l0 = AbsenceDetailActivity.l0(this.J);
                            if (l0 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            this.G = i;
                            this.H = 1;
                            a = classBookService.a(l0, this);
                            if (a == h) {
                                return h;
                            }
                            list = (ArrayList<Object>)i;
                        }
                        return kotlin.coroutines.jvm.internal.b.a(list.add(a));
                    }
                }, 1, (Object)null);
            }
            for (final Student student : this.H) {
                final StudentAbsence m = this.K;
                if (m == null) {
                    k0.S("absence");
                    throw null;
                }
                if (k0.g(student, m.getStudent())) {
                    continue;
                }
                h.h((g)null, (p)new p<r0, d<? super Boolean>, Object>(null) {
                    Object G;
                    int H;
                    final /* synthetic */ ArrayList<StudentAbsence> I;
                    final /* synthetic */ AbsenceDetailActivity J;
                    final /* synthetic */ Student K;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Boolean>, Object>(d) {
                            Object G;
                            int H;
                            final /* synthetic */ ArrayList<StudentAbsence> I = this.I;
                            final /* synthetic */ AbsenceDetailActivity J = this.J;
                            final /* synthetic */ Student K = this.K;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super Boolean> d) {
                        return ((AbsenceDetailActivity$v)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int h2 = this.H;
                        ArrayList<StudentAbsence> i;
                        if (h2 != 0) {
                            if (h2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i = (ArrayList<StudentAbsence>)this.G;
                            c1.n(a);
                        }
                        else {
                            c1.n(a);
                            i = this.I;
                            final Profile n0 = AbsenceDetailActivity.n0(this.J);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            final StudentAbsence l0 = AbsenceDetailActivity.l0(this.J);
                            if (l0 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final long periodId = l0.getPeriodId();
                            final Student k = this.K;
                            final Profile n2 = AbsenceDetailActivity.n0(this.J);
                            if (n2 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final com.untis.mobile.services.masterdata.a masterDataService = n2.getMasterDataService();
                            final Long klasse = this.K.getKlasse();
                            long longValue;
                            if (klasse == null) {
                                longValue = 0L;
                            }
                            else {
                                longValue = klasse;
                            }
                            final Klasse n3 = masterDataService.N(longValue);
                            final StudentAbsence l2 = AbsenceDetailActivity.l0(this.J);
                            if (l2 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final c start = l2.getStart();
                            final StudentAbsence l3 = AbsenceDetailActivity.l0(this.J);
                            if (l3 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final c end = l3.getEnd();
                            final StudentAbsence l4 = AbsenceDetailActivity.l0(this.J);
                            if (l4 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final boolean excused = l4.getExcused();
                            final StudentAbsence l5 = AbsenceDetailActivity.l0(this.J);
                            if (l5 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final AbsenceReason absenceReason = l5.getAbsenceReason();
                            final StudentAbsence l6 = AbsenceDetailActivity.l0(this.J);
                            if (l6 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final String text = l6.getText();
                            final StudentAbsence l7 = AbsenceDetailActivity.l0(this.J);
                            if (l7 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final Excuse excuse = l7.getExcuse();
                            final StudentAbsence l8 = AbsenceDetailActivity.l0(this.J);
                            if (l8 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            final StudentAbsence studentAbsence = new StudentAbsence(0L, periodId, k, n3, start, end, excused, absenceReason, false, text, excuse, l8.getSynced(), 257, null);
                            this.G = i;
                            this.H = 1;
                            a = classBookService.a(studentAbsence, this);
                            if (a == h) {
                                return h;
                            }
                        }
                        return kotlin.coroutines.jvm.internal.b.a(i.add((StudentAbsence)a));
                    }
                }, 1, (Object)null);
            }
            if (list.size() >= 1) {
                final Classbook j2 = this.J;
                if (j2 == null) {
                    k0.S("classbook");
                    throw null;
                }
                final Set<Long> absences = j2.getAbsences();
                final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    list2.add(Long.valueOf(iterator2.next().getId()));
                }
                absences.addAll((Collection<? extends Long>)list2);
                final Classbook j3 = this.J;
                if (j3 == null) {
                    k0.S("classbook");
                    throw null;
                }
                j3.setSynced(false);
                h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ AbsenceDetailActivity H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ AbsenceDetailActivity H = this.H;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                        return ((AbsenceDetailActivity$w)this.create(r0, d)).invokeSuspend(kotlin.j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            final Profile n0 = AbsenceDetailActivity.n0(this.H);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                            if (m0 == null) {
                                k0.S("classbook");
                                throw null;
                            }
                            this.G = 1;
                            if (classBookService.a0(m0, this) == h) {
                                return h;
                            }
                        }
                        return kotlin.j2.a;
                    }
                }, 1, (Object)null);
            }
            this.a1();
            ((Activity)this).setResult(-1, a.j(AbsenceDetailActivity.M, list, false, false, 6, null));
            ((Activity)this).finish();
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void H0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final List list) {
        k0.p(absenceDetailActivity, "this$0");
        k0.o(list, "results");
        if (absenceDetailActivity.I1(list)) {
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>(null) {
                Object G;
                Object H;
                Object I;
                Object J;
                Object K;
                Object L;
                Object M;
                int N;
                final /* synthetic */ List<StudentAbsenceResult> O;
                final /* synthetic */ ArrayList<StudentAbsence> P;
                final /* synthetic */ AbsenceDetailActivity Q;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        Object K;
                        Object L;
                        Object M;
                        int N;
                        final /* synthetic */ List<StudentAbsenceResult> O = this.O;
                        final /* synthetic */ ArrayList<StudentAbsence> P = this.P;
                        final /* synthetic */ AbsenceDetailActivity Q = this.Q;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$i)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int n = this.N;
                    while (true) {
                        Object o2 = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection collection = null;
                        ArrayList<StudentAbsence> list = null;
                        Iterator<StudentAbsenceResult> iterator2 = null;
                        AbsenceDetailActivity absenceDetailActivity = null;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                        Object a = null;
                        Label_0361: {
                            ArrayList<StudentAbsence> p2;
                            AbsenceDetailActivity q;
                            Object iterator3;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p3;
                            if (n != 0) {
                                if (n == 1) {
                                    o2 = this.M;
                                    iterator = (Iterator<StudentAbsence>)this.L;
                                    collection = (Collection)this.K;
                                    list = (ArrayList<StudentAbsence>)this.J;
                                    iterator2 = (Iterator<StudentAbsenceResult>)this.I;
                                    absenceDetailActivity = (AbsenceDetailActivity)this.H;
                                    final ArrayList<StudentAbsence> g = (ArrayList<StudentAbsence>)this.G;
                                    c1.n(o);
                                    p = this;
                                    a = o;
                                    break Label_0361;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsenceResult> o3 = this.O;
                                k0.o(o3, "results");
                                p2 = this.P;
                                q = this.Q;
                                iterator3 = o3.iterator();
                                p3 = this;
                            }
                            ArrayList<StudentAbsence> g;
                            Object iterator4;
                            AbsenceDetailActivity h2;
                            while (true) {
                                if (!((Iterator)iterator3).hasNext()) {
                                    return j2.a;
                                }
                                final List<StudentAbsence> absences = ((Iterator<StudentAbsenceResult>)iterator3).next().getAbsences();
                                final Object o4 = new ArrayList(v.Y((Iterable<?>)absences, 10));
                                iterator4 = absences.iterator();
                                g = p2;
                                h2 = q;
                                o = o4;
                                if (!((Iterator)iterator4).hasNext()) {
                                    p2.addAll((Collection<? extends StudentAbsence>)o);
                                    q = h2;
                                    p2 = g;
                                    continue;
                                }
                                break;
                            }
                            final StudentAbsence studentAbsence = ((Iterator<StudentAbsence>)iterator4).next();
                            final Profile n2 = AbsenceDetailActivity.n0(h2);
                            if (n2 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n2.getClassBookService();
                            p3.G = g;
                            p3.H = h2;
                            p3.I = iterator3;
                            p3.J = p2;
                            p3.K = o;
                            p3.L = iterator4;
                            p3.M = o;
                            p3.N = 1;
                            a = classBookService.a(studentAbsence, p3);
                            if (a == h) {
                                return h;
                            }
                            final ArrayList<StudentAbsence> list2 = p2;
                            final AbsenceDetailActivity absenceDetailActivity2 = h2;
                            final Object o5 = o;
                            final Iterator<StudentAbsenceResult> iterator5 = (Iterator<StudentAbsenceResult>)iterator3;
                            p = p3;
                            list = list2;
                            absenceDetailActivity = absenceDetailActivity2;
                            iterator2 = iterator5;
                            iterator = (Iterator<StudentAbsence>)iterator4;
                            collection = (Collection)o5;
                            o2 = o;
                        }
                        ((Collection<StudentAbsence>)o2).add((StudentAbsence)a);
                        o = collection;
                        final Iterator<StudentAbsenceResult> iterator6 = iterator2;
                        final AbsenceDetailActivity absenceDetailActivity3 = absenceDetailActivity;
                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p4 = p;
                        ArrayList<StudentAbsence> p2 = list;
                        AbsenceDetailActivity h2 = absenceDetailActivity3;
                        Object iterator4 = iterator;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p3 = p4;
                        Object iterator3 = iterator6;
                        continue;
                    }
                }
            }, 1, (Object)null);
            final ArrayList<Student> h = absenceDetailActivity.H;
            final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)h, 10));
            final Iterator<Object> iterator = h.iterator();
            while (iterator.hasNext()) {
                list3.add(Long.valueOf(iterator.next().getId()));
            }
            final Classbook j = absenceDetailActivity.J;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences = j.getAbsences();
            final ArrayList<Object> list4 = (ArrayList<Object>)new ArrayList<StudentAbsence>();
            final Iterator<Number> iterator2 = absences.iterator();
            while (iterator2.hasNext()) {
                final long longValue = iterator2.next().longValue();
                final Profile g = absenceDetailActivity.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final StudentAbsence z = g.getClassBookService().Z(longValue);
                if (z == null) {
                    continue;
                }
                list4.add(z);
            }
            final ArrayList<StudentAbsence> list5 = new ArrayList<StudentAbsence>();
            for (final StudentAbsence next : list4) {
                if (list3.contains(next.getStudent().getId()) ^ true) {
                    list5.add(next);
                }
            }
            final ArrayList list6 = new ArrayList<Long>(v.Y((Iterable<?>)list5, 10));
            final Iterator<Object> iterator4 = list5.iterator();
            while (iterator4.hasNext()) {
                list6.add(Long.valueOf(iterator4.next().getId()));
            }
            j.setAbsences(v.M5((Iterable<? extends Long>)list6));
            final Classbook i = absenceDetailActivity.J;
            if (i == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences2 = i.getAbsences();
            final ArrayList list7 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
            final Iterator<Object> iterator5 = list2.iterator();
            while (iterator5.hasNext()) {
                list7.add(Long.valueOf(iterator5.next().getId()));
            }
            absences2.addAll((Collection<? extends Long>)list7);
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$j)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, list2, false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private final boolean H1(final StudentAbsenceResult studentAbsenceResult) {
        return !(studentAbsenceResult.getConflicts().isEmpty() ^ true) && !(studentAbsenceResult.getAttendances().isEmpty() ^ true);
    }
    
    private static final void I0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not create absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private final boolean I1(final List<StudentAbsenceResult> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (final StudentAbsenceResult next : list) {
            if (this.H1(next) ^ true) {
                return next == null;
            }
        }
        StudentAbsenceResult next = null;
        return next == null;
    }
    
    private static final void J0(final AbsenceDetailActivity absenceDetailActivity, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not edit absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
    }
    
    private final void J1() {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(com.untis.mobile.c.i.S1);
        final StudentAbsence k = this.K;
        String displayName = null;
        if (k != null) {
            final AbsenceReason absenceReason = k.getAbsenceReason();
            if (absenceReason != null) {
                displayName = absenceReason.getDisplayName();
            }
            String string = displayName;
            if (displayName == null) {
                string = ((Activity)this).getString(2131886745);
            }
            ((TextView)appCompatTextView).setText((CharSequence)string);
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void K0(final boolean b) {
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ AbsenceDetailActivity H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ AbsenceDetailActivity H = this.H;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((AbsenceDetailActivity$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final Profile n0 = AbsenceDetailActivity.n0(this.H);
                    if (n0 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    final a classBookService = n0.getClassBookService();
                    final StudentAbsence l0 = AbsenceDetailActivity.l0(this.H);
                    if (l0 == null) {
                        k0.S("absence");
                        throw null;
                    }
                    this.G = 1;
                    if (classBookService.f(l0, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final Profile g = this.G;
        if (g != null) {
            if (g.getSchoolApiVersion() >= 102) {
                final Profile g2 = this.G;
                if (g2 == null) {
                    k0.S("profile");
                    throw null;
                }
                final com.untis.mobile.services.classbook.a classBookService = g2.getClassBookService();
                final Period i = this.I;
                if (i == null) {
                    k0.S("period");
                    throw null;
                }
                final StudentAbsence k = this.K;
                if (k == null) {
                    k0.S("absence");
                    throw null;
                }
                classBookService.x(i, k).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.absences.u0(this, b), (rx.functions.b)new b0(this));
            }
            else {
                h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ AbsenceDetailActivity H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ AbsenceDetailActivity H = this.H;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                        return ((AbsenceDetailActivity$p)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                if (g == 2) {
                                    c1.n(o);
                                    return j2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                            }
                        }
                        else {
                            c1.n(o);
                            final Profile n0 = AbsenceDetailActivity.n0(this.H);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            final StudentAbsence l0 = AbsenceDetailActivity.l0(this.H);
                            if (l0 == null) {
                                k0.S("absence");
                                throw null;
                            }
                            this.G = 1;
                            if (classBookService.f(l0, this) == h) {
                                return h;
                            }
                        }
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        m0.setSynced(false);
                        final Classbook m2 = AbsenceDetailActivity.m0(this.H);
                        if (m2 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        final Set<Long> absences = m2.getAbsences();
                        final StudentAbsence l2 = AbsenceDetailActivity.l0(this.H);
                        if (l2 == null) {
                            k0.S("absence");
                            throw null;
                        }
                        absences.remove(kotlin.coroutines.jvm.internal.b.g(l2.getId()));
                        final Profile n2 = AbsenceDetailActivity.n0(this.H);
                        if (n2 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService2 = n2.getClassBookService();
                        final Classbook m3 = AbsenceDetailActivity.m0(this.H);
                        if (m3 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 2;
                        if (classBookService2.a0(m3, this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
                final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
                final StudentAbsence j = this.K;
                if (j == null) {
                    k0.S("absence");
                    throw null;
                }
                list.add(j);
                ((Activity)this).setResult(-1, a.j(AbsenceDetailActivity.M, list, true, false, 4, null));
                if (b) {
                    ((Activity)this).finish();
                }
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void K1() {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(com.untis.mobile.c.i.g2);
        final StudentAbsence k = this.K;
        if (k == null) {
            k0.S("absence");
            throw null;
        }
        ((TextView)appCompatTextView).setText((CharSequence)((org.joda.time.base.a)k.getStart()).g4("E d.MM.yyyy"));
        final TextView textView = (TextView)this.findViewById(com.untis.mobile.c.i.i2);
        final StudentAbsence i = this.K;
        if (i == null) {
            k0.S("absence");
            throw null;
        }
        textView.setText((CharSequence)((org.joda.time.base.a)i.getStart()).g4("H:mm"));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.findViewById(com.untis.mobile.c.i.b2);
        final StudentAbsence j = this.K;
        if (j == null) {
            k0.S("absence");
            throw null;
        }
        ((TextView)appCompatTextView2).setText((CharSequence)((org.joda.time.base.a)j.getEnd()).g4("E d.MM.yyyy"));
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)this.findViewById(com.untis.mobile.c.i.d2);
        final StudentAbsence l = this.K;
        if (l != null) {
            ((TextView)appCompatTextView3).setText((CharSequence)((org.joda.time.base.a)l.getEnd()).g4("H:mm"));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void L1() {
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(com.untis.mobile.c.i.l2);
        final StudentAbsence k = this.K;
        if (k != null) {
            ((EditText)textInputEditText).setText((CharSequence)k.getText());
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void M0(final AbsenceDetailActivity absenceDetailActivity, final boolean b, final Boolean b2) {
        k0.p(absenceDetailActivity, "this$0");
        h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ AbsenceDetailActivity H;
            final /* synthetic */ Boolean I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ AbsenceDetailActivity H = this.H;
                    final /* synthetic */ Boolean I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((AbsenceDetailActivity$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final Profile n0 = AbsenceDetailActivity.n0(this.H);
                    if (n0 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    final a classBookService = n0.getClassBookService();
                    final StudentAbsence l0 = AbsenceDetailActivity.l0(this.H);
                    if (l0 == null) {
                        k0.S("absence");
                        throw null;
                    }
                    this.G = 1;
                    if (classBookService.f(l0, this) == h) {
                        return h;
                    }
                }
                final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                if (m0 == null) {
                    k0.S("classbook");
                    throw null;
                }
                final Boolean i = this.I;
                k0.o(i, "success");
                m0.setSynced(i);
                final Classbook m2 = AbsenceDetailActivity.m0(this.H);
                if (m2 == null) {
                    k0.S("classbook");
                    throw null;
                }
                final Set<Long> absences = m2.getAbsences();
                final StudentAbsence l2 = AbsenceDetailActivity.l0(this.H);
                if (l2 == null) {
                    k0.S("absence");
                    throw null;
                }
                absences.remove(kotlin.coroutines.jvm.internal.b.g(l2.getId()));
                final Profile n2 = AbsenceDetailActivity.n0(this.H);
                if (n2 == null) {
                    k0.S("profile");
                    throw null;
                }
                final a classBookService2 = n2.getClassBookService();
                final Classbook m3 = AbsenceDetailActivity.m0(this.H);
                if (m3 == null) {
                    k0.S("classbook");
                    throw null;
                }
                this.G = 2;
                if (classBookService2.a0(m3, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            list.add(k);
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, list, true, false, 4, null));
            if (b) {
                ((Activity)absenceDetailActivity).finish();
            }
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void N0(final AbsenceDetailActivity absenceDetailActivity, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not delete in absence details", t);
        final Classbook j = absenceDetailActivity.J;
        if (j == null) {
            k0.S("classbook");
            throw null;
        }
        j.setSynced(false);
        final Classbook i = absenceDetailActivity.J;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        final Set<Long> absences = i.getAbsences();
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            absences.remove(k.getId());
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$o)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void O0() {
        this.E1();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = this.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = this.K;
        if (k != null) {
            com.untis.mobile.services.classbook.a.a.c(classBookService, i, k, null, 4, null).C5((rx.functions.b)new z(this), (rx.functions.b)new d0(this));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void P0(final AbsenceDetailActivity absenceDetailActivity, final StudentAbsenceResult studentAbsenceResult) {
        k0.p(absenceDetailActivity, "this$0");
        k0.o(studentAbsenceResult, "result");
        if (absenceDetailActivity.H1(studentAbsenceResult)) {
            final List c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ StudentAbsenceResult L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ StudentAbsenceResult L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$r)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0253: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0253;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final StudentAbsence studentAbsence4 = studentAbsence;
                        final Collection<StudentAbsence> collection6 = collection2;
                        Object iterator2 = iterator;
                        AbsenceDetailActivity m = absenceDetailActivity2;
                        h = studentAbsence4;
                        Collection<StudentAbsence> collection3 = collection6;
                        continue;
                    }
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            final d$a u = new d$a((Context)absenceDetailActivity, 2131951624).M(absenceDetailActivity.o0(studentAbsenceResult)).r(2131886649, (DialogInterface$OnClickListener)new z0(absenceDetailActivity)).u(2131886117, (DialogInterface$OnClickListener)new x0(absenceDetailActivity));
            if (studentAbsenceResult.getSeparateSaveAllowed()) {
                u.B(2131886118, (DialogInterface$OnClickListener)new a1(absenceDetailActivity));
            }
            ((Dialog)u.a()).show();
        }
    }
    
    private static final void Q0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private static final void R0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.b(i, k, CreateAbsenceStrategy.COMBINE).C5((rx.functions.b)new i0(absenceDetailActivity, dialogInterface), (rx.functions.b)new m0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void S0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final StudentAbsenceResult studentAbsenceResult) {
        k0.p(absenceDetailActivity, "this$0");
        k0.o(studentAbsenceResult, "result");
        if (absenceDetailActivity.H1(studentAbsenceResult)) {
            final List c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ StudentAbsenceResult L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ StudentAbsenceResult L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$s)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0253: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0253;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final StudentAbsence studentAbsence4 = studentAbsence;
                        final Collection<StudentAbsence> collection6 = collection2;
                        Object iterator2 = iterator;
                        final AbsenceDetailActivity absenceDetailActivity4 = absenceDetailActivity2;
                        h = studentAbsence4;
                        Collection<StudentAbsence> collection3 = collection6;
                        AbsenceDetailActivity m = absenceDetailActivity4;
                        continue;
                    }
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private static final void T0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not edit absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private static final void U0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.b(i, k, CreateAbsenceStrategy.WRITE_SEPARATE).C5((rx.functions.b)new h0(absenceDetailActivity, dialogInterface), (rx.functions.b)new j0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void V0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final StudentAbsenceResult studentAbsenceResult) {
        k0.p(absenceDetailActivity, "this$0");
        k0.o(studentAbsenceResult, "result");
        if (absenceDetailActivity.H1(studentAbsenceResult)) {
            final List c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ StudentAbsenceResult L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ StudentAbsenceResult L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$q)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0253: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0253;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final Iterator<StudentAbsence> iterator3 = iterator;
                        final AbsenceDetailActivity absenceDetailActivity4 = absenceDetailActivity2;
                        h = studentAbsence;
                        Collection<StudentAbsence> collection3 = collection2;
                        Object iterator2 = iterator3;
                        AbsenceDetailActivity m = absenceDetailActivity4;
                        continue;
                    }
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private static final void W0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not edit absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private static final void X0(final AbsenceDetailActivity absenceDetailActivity, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not edit absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
    }
    
    private final c Y0() {
        final StudentAbsence k = this.K;
        if (k != null) {
            return k.getEnd();
        }
        k0.S("absence");
        throw null;
    }
    
    private final c Z0() {
        final StudentAbsence k = this.K;
        if (k != null) {
            return k.getStart();
        }
        k0.S("absence");
        throw null;
    }
    
    private final void a1() {
        ((RelativeLayout)this.findViewById(com.untis.mobile.c.i.nE)).setVisibility(8);
    }
    
    private final void b1() {
        final AbsenceReasonActivity.a i = AbsenceReasonActivity.I;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final StudentAbsence k = this.K;
        if (k != null) {
            ((ComponentActivity)this).startActivityForResult(i.a((Context)this, uniqueId, k.getAbsenceReason()), 1200);
            this.J1();
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void c1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.w1();
    }
    
    private static final void d1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.z1();
    }
    
    private static final void e1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.y1();
    }
    
    private static final void f1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.u1();
    }
    
    private static final void g1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.m1();
    }
    
    private static final void h1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.p1();
    }
    
    private static final void i1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.o1();
    }
    
    private final boolean j0() {
        final Profile g = this.G;
        if (g != null) {
            return g.getClassBookService().g();
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void j1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.t1();
    }
    
    private final boolean k0() {
        final Profile g = this.G;
        if (g != null) {
            return g.getClassBookService().K();
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void k1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.b1();
    }
    
    public static final /* synthetic */ StudentAbsence l0(final AbsenceDetailActivity absenceDetailActivity) {
        return absenceDetailActivity.K;
    }
    
    private static final void l1(final AbsenceDetailActivity absenceDetailActivity, final View view) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.v1();
    }
    
    public static final /* synthetic */ Classbook m0(final AbsenceDetailActivity absenceDetailActivity) {
        return absenceDetailActivity.J;
    }
    
    private final void m1() {
        new DatePickerDialog((Context)this, (DatePickerDialog$OnDateSetListener)new t(this), ((org.joda.time.base.a)this.Y0()).k2(), ((org.joda.time.base.a)this.Y0()).f3() - 1, ((org.joda.time.base.a)this.Y0()).X3()).show();
    }
    
    public static final /* synthetic */ Profile n0(final AbsenceDetailActivity absenceDetailActivity) {
        return absenceDetailActivity.G;
    }
    
    private static final void n1(final AbsenceDetailActivity absenceDetailActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(absenceDetailActivity, "this$0");
        final c z0 = absenceDetailActivity.Z0();
        final c u1 = absenceDetailActivity.Y0().u1(n, n2 + 1, n3);
        Object z2 = z0;
        if (((org.joda.time.base.c)z0).R((l0)u1)) {
            z2 = u1.Z1(z0.j1());
            k0.o(z2, "end.withTime(start.toLocalTime())");
        }
        Object v0 = z2;
        if (((org.joda.time.base.c)z2).R((l0)u1)) {
            v0 = new c((Object)u1).v0(1);
            k0.o(v0, "DateTime(end).minusMinutes(1)");
        }
        absenceDetailActivity.D1((c)v0);
        k0.o(u1, "end");
        absenceDetailActivity.C1(u1);
        absenceDetailActivity.K1();
    }
    
    @SuppressLint({ "InflateParams" })
    private final View o0(final StudentAbsenceResult studentAbsenceResult) {
        final View inflate = ((Activity)this).getLayoutInflater().inflate(2131493027, (ViewGroup)null, false);
        ((ListView)inflate.findViewById(com.untis.mobile.c.i.al)).setAdapter((ListAdapter)new f1((Context)this, studentAbsenceResult.getConflicts(), false, 4, null));
        ((ListView)inflate.findViewById(com.untis.mobile.c.i.bl)).setAdapter((ListAdapter)new h1((Context)this, studentAbsenceResult.getAttendances(), false, 4, null));
        k0.o(inflate, "view");
        return inflate;
    }
    
    private final void o1() {
        final c a = com.untis.mobile.utils.time.a.a();
        final c z0 = this.Z0();
        if (((org.joda.time.base.c)z0).R((l0)a) || ((org.joda.time.base.c)z0).X4((l0)a)) {
            final c v0 = a.v0(1);
            k0.o(v0, "now.minusMinutes(1)");
            this.D1(v0);
        }
        this.C1(a);
        this.K1();
    }
    
    @SuppressLint({ "InflateParams" })
    private final View p0(final List<StudentAbsenceResult> list) {
        final View inflate = ((Activity)this).getLayoutInflater().inflate(2131493027, (ViewGroup)null, false);
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        final ArrayList<StudentAttendance> list3 = new ArrayList<StudentAttendance>();
        for (final StudentAbsenceResult studentAbsenceResult : list) {
            list2.addAll(studentAbsenceResult.getConflicts());
            list3.addAll(studentAbsenceResult.getAttendances());
        }
        ((ListView)inflate.findViewById(com.untis.mobile.c.i.al)).setAdapter((ListAdapter)new f1((Context)this, list2, true));
        ((ListView)inflate.findViewById(com.untis.mobile.c.i.bl)).setAdapter((ListAdapter)new h1((Context)this, list3, true));
        k0.o(inflate, "view");
        return inflate;
    }
    
    private final void p1() {
        new TimePickerDialog((Context)this, (TimePickerDialog$OnTimeSetListener)new p0(this), ((org.joda.time.base.a)this.Y0()).s4(), ((org.joda.time.base.a)this.Y0()).k5(), true).show();
    }
    
    private final void q0() {
        final StudentAbsence k = this.K;
        if (k == null) {
            k0.S("absence");
            throw null;
        }
        if (k.getStudent().getId() == 0L && (this.H.isEmpty() ^ true)) {
            final StudentAbsence i = this.K;
            if (i == null) {
                k0.S("absence");
                throw null;
            }
            final Student value = this.H.get(0);
            k0.o(value, "students[0]");
            i.setStudent(value);
        }
        this.E1();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period j = this.I;
        if (j == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence l = this.K;
        if (l != null) {
            com.untis.mobile.services.classbook.a.a.a(classBookService, j, l, null, 4, null).C5((rx.functions.b)new g0(this), (rx.functions.b)new a0(this));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private static final void q1(final AbsenceDetailActivity absenceDetailActivity, final TimePicker timePicker, final int n, final int n2) {
        k0.p(absenceDetailActivity, "this$0");
        final c z0 = absenceDetailActivity.Z0();
        final c y1 = absenceDetailActivity.Y0().Y1(n, n2, 0, 0);
        Object z2 = null;
        Label_0067: {
            if (!((org.joda.time.base.c)z0).R((l0)y1)) {
                z2 = z0;
                if (!((org.joda.time.base.c)z0).X4((l0)y1)) {
                    break Label_0067;
                }
            }
            z2 = y1.Z1(z0.j1());
            k0.o(z2, "end.withTime(start.toLocalTime())");
        }
        Object v0 = null;
        Label_0111: {
            if (!((org.joda.time.base.c)z2).R((l0)y1)) {
                v0 = z2;
                if (!((org.joda.time.base.c)z2).X4((l0)y1)) {
                    break Label_0111;
                }
            }
            v0 = new c((Object)y1).v0(1);
            k0.o(v0, "DateTime(end).minusMinutes(1)");
        }
        absenceDetailActivity.D1((c)v0);
        k0.o(y1, "end");
        absenceDetailActivity.C1(y1);
        absenceDetailActivity.K1();
    }
    
    private static final void r0(final AbsenceDetailActivity absenceDetailActivity, List c) {
        k0.p(absenceDetailActivity, "this$0");
        if (absenceDetailActivity.H1(c.get(0))) {
            c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ List<StudentAbsenceResult> L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ List<StudentAbsenceResult> L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$e)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0262: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0262;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.get(0).getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final StudentAbsence studentAbsence4 = studentAbsence;
                        final Collection<StudentAbsence> collection6 = collection2;
                        Object iterator2 = iterator;
                        AbsenceDetailActivity m = absenceDetailActivity2;
                        h = studentAbsence4;
                        Collection<StudentAbsence> collection3 = collection6;
                        continue;
                    }
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            final StudentAbsence k = absenceDetailActivity.K;
            if (k == null) {
                k0.S("absence");
                throw null;
            }
            boolean b = false;
            Label_0207: {
                if (k0.g(k.getStart(), c.get(0).getStart())) {
                    final StudentAbsence i = absenceDetailActivity.K;
                    if (i == null) {
                        k0.S("absence");
                        throw null;
                    }
                    if (k0.g(i.getEnd(), c.get(0).getEnd())) {
                        final StudentAbsence j = absenceDetailActivity.K;
                        if (j == null) {
                            k0.S("absence");
                            throw null;
                        }
                        if (k0.g(j.getAbsenceReason(), c.get(0).getAbsenceReason())) {
                            final StudentAbsence l = absenceDetailActivity.K;
                            if (l == null) {
                                k0.S("absence");
                                throw null;
                            }
                            if (k0.g(l.getText(), c.get(0).getText())) {
                                b = false;
                                break Label_0207;
                            }
                        }
                    }
                }
                b = true;
            }
            final Classbook m = absenceDetailActivity.J;
            if (m == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences = m.getAbsences();
            final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)c, 10));
            final Iterator<StudentAbsence> iterator = (Iterator<StudentAbsence>)c.iterator();
            while (iterator.hasNext()) {
                list.add(Long.valueOf(iterator.next().getId()));
            }
            absences.addAll((Collection<? extends Long>)list);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, b, 2, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            final d$a u = new d$a((Context)absenceDetailActivity, 2131951624).M(absenceDetailActivity.o0(c.get(0))).r(2131886649, (DialogInterface$OnClickListener)new l(absenceDetailActivity)).u(2131886117, (DialogInterface$OnClickListener)new j(absenceDetailActivity));
            if (c.get(0).getSeparateSaveAllowed()) {
                u.B(2131886118, (DialogInterface$OnClickListener)new m(absenceDetailActivity));
            }
            ((Dialog)u.a()).show();
        }
    }
    
    private static final void r1(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void s0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private static final void s1(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        absenceDetailActivity.K0(true);
        dialogInterface.dismiss();
    }
    
    private static final void t0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.c(i, k, CreateAbsenceStrategy.COMBINE).C5((rx.functions.b)new s0(absenceDetailActivity, dialogInterface), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.absences.l0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void t1() {
        final c z0 = this.Z0();
        final Period i = this.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        Label_0086: {
            if (!((org.joda.time.base.c)z0).R((l0)i.getEnd())) {
                final Period j = this.I;
                if (j == null) {
                    k0.S("period");
                    throw null;
                }
                if (!((org.joda.time.base.c)z0).X4((l0)j.getEnd())) {
                    break Label_0086;
                }
            }
            final Period k = this.I;
            if (k == null) {
                k0.S("period");
                throw null;
            }
            final c v0 = k.getEnd().v0(1);
            k0.o(v0, "period.end.minusMinutes(1)");
            this.D1(v0);
        }
        final Period l = this.I;
        if (l != null) {
            this.C1(l.getEnd());
            this.K1();
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void u0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, List c) {
        k0.p(absenceDetailActivity, "this$0");
        if (absenceDetailActivity.H1((StudentAbsenceResult)c.get(0))) {
            c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ List<StudentAbsenceResult> L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ List<StudentAbsenceResult> L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$g)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0262: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0262;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.get(0).getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final Iterator<StudentAbsence> iterator3 = iterator;
                        final AbsenceDetailActivity absenceDetailActivity4 = absenceDetailActivity2;
                        h = studentAbsence;
                        Collection<StudentAbsence> collection3 = collection2;
                        Object iterator2 = iterator3;
                        AbsenceDetailActivity m = absenceDetailActivity4;
                        continue;
                    }
                }
            }, 1, (Object)null);
            final Classbook j = absenceDetailActivity.J;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences = j.getAbsences();
            final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
            final Iterator<Number> iterator = absences.iterator();
            while (iterator.hasNext()) {
                final long longValue = iterator.next().longValue();
                final Profile g = absenceDetailActivity.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final StudentAbsence z = g.getClassBookService().Z(longValue);
                if (z == null) {
                    continue;
                }
                list.add(z);
            }
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            for (final StudentAbsence next : list) {
                final long id = next.getStudent().getId();
                final StudentAbsence k = absenceDetailActivity.K;
                if (k == null) {
                    k0.S("absence");
                    throw null;
                }
                if (id == k.getStudent().getId()) {
                    continue;
                }
                list2.add(next);
            }
            final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
            final Iterator<Object> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                list3.add(Long.valueOf(iterator3.next().getId()));
            }
            j.setAbsences(v.M5((Iterable<? extends Long>)list3));
            final Classbook i = absenceDetailActivity.J;
            if (i == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences2 = i.getAbsences();
            final ArrayList list4 = new ArrayList<Long>(v.Y((Iterable<?>)c, 10));
            final Iterator<StudentAbsence> iterator4 = (Iterator<StudentAbsence>)c.iterator();
            while (iterator4.hasNext()) {
                list4.add(Long.valueOf(iterator4.next().getId()));
            }
            absences2.addAll((Collection<? extends Long>)list4);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$f)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private final void u1() {
        final c y0 = this.Y0();
        final Period i = this.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        Label_0086: {
            if (!((org.joda.time.base.c)y0).C((l0)i.getStart())) {
                final Period j = this.I;
                if (j == null) {
                    k0.S("period");
                    throw null;
                }
                if (!((org.joda.time.base.c)y0).X4((l0)j.getStart())) {
                    break Label_0086;
                }
            }
            final Period k = this.I;
            if (k == null) {
                k0.S("period");
                throw null;
            }
            final c v0 = k.getStart().V0(1);
            k0.o(v0, "period.start.plusMinutes(1)");
            this.C1(v0);
        }
        final Period l = this.I;
        if (l != null) {
            this.D1(l.getStart());
            this.K1();
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void v0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not create absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private final void v1() {
        if (com.untis.mobile.utils.g0.a((Context)this)) {
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            if (g.getSchoolApiVersion() >= 102) {
                this.F1();
                return;
            }
        }
        this.G1();
    }
    
    private static final void w0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(absenceDetailActivity, "this$0");
        final Profile g = absenceDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
        final Period i = absenceDetailActivity.I;
        if (i == null) {
            k0.S("period");
            throw null;
        }
        final StudentAbsence k = absenceDetailActivity.K;
        if (k != null) {
            classBookService.c(i, k, CreateAbsenceStrategy.WRITE_SEPARATE).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.absences.r0(absenceDetailActivity, dialogInterface), (rx.functions.b)new n0(absenceDetailActivity, dialogInterface));
            return;
        }
        k0.S("absence");
        throw null;
    }
    
    private final void w1() {
        new DatePickerDialog((Context)this, (DatePickerDialog$OnDateSetListener)new i(this), ((org.joda.time.base.a)this.Z0()).k2(), ((org.joda.time.base.a)this.Z0()).f3() - 1, ((org.joda.time.base.a)this.Z0()).X3()).show();
    }
    
    private static final void x0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, List c) {
        k0.p(absenceDetailActivity, "this$0");
        if (absenceDetailActivity.H1((StudentAbsenceResult)c.get(0))) {
            c = (List)h.h((g)null, (p)new p<r0, d<? super List<? extends StudentAbsence>>, Object>() {
                Object G;
                Object H;
                Object I;
                Object J;
                int K;
                final /* synthetic */ List<StudentAbsenceResult> L;
                final /* synthetic */ AbsenceDetailActivity M;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object>() {
                        Object G;
                        Object H;
                        Object I;
                        Object J;
                        int K;
                        final /* synthetic */ List<StudentAbsenceResult> L = this.L;
                        final /* synthetic */ AbsenceDetailActivity M = this.M;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super List<StudentAbsence>> d) {
                    return ((AbsenceDetailActivity$d)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    Object h = kotlin.coroutines.intrinsics.b.h();
                    final int k = this.K;
                    while (true) {
                        Collection<StudentAbsence> collection = null;
                        Iterator<StudentAbsence> iterator = null;
                        Collection<StudentAbsence> collection2 = null;
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p = null;
                        StudentAbsence studentAbsence = null;
                        AbsenceDetailActivity absenceDetailActivity2 = null;
                        Object a = null;
                        Label_0262: {
                            AbsenceDetailActivity m;
                            Collection<StudentAbsence> collection3;
                            Object iterator2;
                            p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2;
                            if (k != 0) {
                                if (k == 1) {
                                    collection = (Collection<StudentAbsence>)this.J;
                                    iterator = (Iterator<StudentAbsence>)this.I;
                                    collection2 = (Collection<StudentAbsence>)this.H;
                                    final AbsenceDetailActivity absenceDetailActivity = (AbsenceDetailActivity)this.G;
                                    c1.n(o);
                                    p = this;
                                    studentAbsence = (StudentAbsence)h;
                                    absenceDetailActivity2 = absenceDetailActivity;
                                    a = o;
                                    break Label_0262;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final List<StudentAbsence> absences = this.L.get(0).getAbsences();
                                m = this.M;
                                collection3 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
                                iterator2 = absences.iterator();
                                p2 = this;
                            }
                            if (!((Iterator)iterator2).hasNext()) {
                                return collection3;
                            }
                            final StudentAbsence studentAbsence2 = ((Iterator<StudentAbsence>)iterator2).next();
                            final Profile n0 = AbsenceDetailActivity.n0(m);
                            if (n0 == null) {
                                k0.S("profile");
                                throw null;
                            }
                            final a classBookService = n0.getClassBookService();
                            p2.G = m;
                            p2.H = collection3;
                            p2.I = iterator2;
                            p2.J = collection3;
                            p2.K = 1;
                            a = classBookService.a(studentAbsence2, p2);
                            if (a == h) {
                                return h;
                            }
                            final AbsenceDetailActivity absenceDetailActivity3 = m;
                            final Collection<StudentAbsence> collection4 = collection3;
                            final StudentAbsence studentAbsence3 = (StudentAbsence)h;
                            final Collection<StudentAbsence> collection5 = collection4;
                            absenceDetailActivity2 = absenceDetailActivity3;
                            iterator = (Iterator<StudentAbsence>)iterator2;
                            collection2 = collection5;
                            collection = collection4;
                            studentAbsence = studentAbsence3;
                            p = p2;
                        }
                        collection.add((StudentAbsence)a);
                        p<r0, kotlin.coroutines.d<? super List<? extends StudentAbsence>>, Object> p2 = p;
                        final StudentAbsence studentAbsence4 = studentAbsence;
                        final Collection<StudentAbsence> collection6 = collection2;
                        Object iterator2 = iterator;
                        AbsenceDetailActivity m = absenceDetailActivity2;
                        h = studentAbsence4;
                        Collection<StudentAbsence> collection3 = collection6;
                        continue;
                    }
                }
            }, 1, (Object)null);
            final Classbook j = absenceDetailActivity.J;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences = j.getAbsences();
            final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
            final Iterator<Number> iterator = absences.iterator();
            while (iterator.hasNext()) {
                final long longValue = iterator.next().longValue();
                final Profile g = absenceDetailActivity.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final StudentAbsence z = g.getClassBookService().Z(longValue);
                if (z == null) {
                    continue;
                }
                list.add(z);
            }
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            for (final StudentAbsence next : list) {
                final long id = next.getStudent().getId();
                final StudentAbsence k = absenceDetailActivity.K;
                if (k == null) {
                    k0.S("absence");
                    throw null;
                }
                if (id == k.getStudent().getId()) {
                    continue;
                }
                list2.add(next);
            }
            final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
            final Iterator<Object> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                list3.add(Long.valueOf(iterator3.next().getId()));
            }
            j.setAbsences(v.M5((Iterable<? extends Long>)list3));
            final Classbook i = absenceDetailActivity.J;
            if (i == null) {
                k0.S("classbook");
                throw null;
            }
            final Set<Long> absences2 = i.getAbsences();
            final ArrayList list4 = new ArrayList<Long>(v.Y((Iterable<?>)c, 10));
            final Iterator<StudentAbsence> iterator4 = (Iterator<StudentAbsence>)c.iterator();
            while (iterator4.hasNext()) {
                list4.add(Long.valueOf(iterator4.next().getId()));
            }
            absences2.addAll((Collection<? extends Long>)list4);
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AbsenceDetailActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AbsenceDetailActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((AbsenceDetailActivity$c)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final Profile n0 = AbsenceDetailActivity.n0(this.H);
                        if (n0 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final a classBookService = n0.getClassBookService();
                        final Classbook m0 = AbsenceDetailActivity.m0(this.H);
                        if (m0 == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (classBookService.a0(m0, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
            ((Activity)absenceDetailActivity).setResult(-1, a.j(AbsenceDetailActivity.M, new ArrayList(c), false, false, 6, null));
            ((Activity)absenceDetailActivity).finish();
        }
        else {
            Log.e("untis_log", "could not solve conflict");
            u0.b(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), 2131886216);
            absenceDetailActivity.a1();
            dialogInterface.dismiss();
        }
    }
    
    private static final void x1(final AbsenceDetailActivity absenceDetailActivity, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(absenceDetailActivity, "this$0");
        final c u1 = absenceDetailActivity.Z0().u1(n, n2 + 1, n3);
        final c y0 = absenceDetailActivity.Y0();
        Object z1 = null;
        Label_0069: {
            if (!((org.joda.time.base.c)y0).C((l0)u1)) {
                z1 = y0;
                if (!((org.joda.time.base.c)y0).X4((l0)u1)) {
                    break Label_0069;
                }
            }
            z1 = u1.Z1(y0.j1());
            k0.o(z1, "start.withTime(end.toLocalTime())");
        }
        Object v0 = null;
        Label_0113: {
            if (!((org.joda.time.base.c)z1).C((l0)u1)) {
                v0 = z1;
                if (!((org.joda.time.base.c)z1).X4((l0)u1)) {
                    break Label_0113;
                }
            }
            v0 = new c((Object)u1).V0(1);
            k0.o(v0, "DateTime(start).plusMinutes(1)");
        }
        k0.o(u1, "start");
        absenceDetailActivity.D1(u1);
        absenceDetailActivity.C1((c)v0);
        absenceDetailActivity.K1();
    }
    
    private static final void y0(final AbsenceDetailActivity absenceDetailActivity, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not create absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
        dialogInterface.dismiss();
    }
    
    private final void y1() {
        final c a = com.untis.mobile.utils.time.a.a();
        final c y0 = this.Y0();
        if (((org.joda.time.base.c)y0).C((l0)a) || ((org.joda.time.base.c)y0).X4((l0)a)) {
            final c v0 = a.V0(1);
            k0.o(v0, "now.plusMinutes(1)");
            this.C1(v0);
        }
        this.D1(a);
        this.K1();
    }
    
    private static final void z0(final AbsenceDetailActivity absenceDetailActivity, final Throwable t) {
        k0.p(absenceDetailActivity, "this$0");
        Log.e("untis_log", "could not edit absence", t);
        u0.d(absenceDetailActivity.findViewById(com.untis.mobile.c.i.f2), t);
        absenceDetailActivity.a1();
    }
    
    private final void z1() {
        new TimePickerDialog((Context)this, (TimePickerDialog$OnTimeSetListener)new e0(this), ((org.joda.time.base.a)this.Z0()).s4(), ((org.joda.time.base.a)this.Z0()).k5(), true).show();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 1200) {
            if (intent != null && b) {
                final StudentAbsence k = this.K;
                if (k == null) {
                    k0.S("absence");
                    throw null;
                }
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                k.setAbsenceReason(g.getMasterDataService().H(AbsenceReasonActivity.I.b(intent)));
                this.J1();
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("gamma", "");
            if (string == null) {
                string = s;
            }
        }
        final com.untis.mobile.services.profile.legacy.j0 g = com.untis.mobile.services.profile.legacy.j0.G;
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        final ArrayList<Student> h = this.H;
        Bundle extras3;
        if (extras == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = extras;
        }
        ArrayList<? extends Student> parcelableArrayList;
        if (extras3 == null) {
            parcelableArrayList = null;
        }
        else {
            parcelableArrayList = (ArrayList<? extends Student>)extras3.getParcelableArrayList("omega");
        }
        ArrayList<? extends Student> c = parcelableArrayList;
        if (parcelableArrayList == null) {
            c = new ArrayList<Student>();
        }
        h.addAll(c);
        Bundle extras4;
        if (extras == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = extras;
        }
        StudentAbsence studentAbsence;
        if (extras4 == null) {
            studentAbsence = null;
        }
        else {
            studentAbsence = (StudentAbsence)extras4.getParcelable("alpha");
        }
        StudentAbsence k = studentAbsence;
        if (studentAbsence == null) {
            k = new StudentAbsence(0L, 0L, null, null, null, null, false, null, false, null, null, false, 4095, null);
        }
        this.K = k;
        Bundle extras5;
        if (extras == null) {
            extras5 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras5 = extras;
        }
        StudentAbsenceResult l;
        if (extras5 == null) {
            l = null;
        }
        else {
            l = (StudentAbsenceResult)extras5.getParcelable("beta");
        }
        this.L = l;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras == null) {
            long1 = 0L;
        }
        else {
            long1 = extras.getLong("zeta");
        }
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        Period i;
        if ((i = g3.getTimeTableService().l(long1)) == null) {
            i = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.I = i;
        final Profile g4 = this.G;
        if (g4 != null) {
            Classbook s2;
            if ((s2 = g4.getClassBookService().S(long1)) == null) {
                s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
            }
            this.J = s2;
            this.setContentView(2131492893);
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                final StudentAbsence j = this.K;
                if (j == null) {
                    k0.S("absence");
                    throw null;
                }
                int n;
                if (j.getId() != 0L) {
                    n = 2131886126;
                }
                else {
                    n = 2131886120;
                }
                supportActionBar.z0(n);
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.Y(true);
            }
            if (this.H.isEmpty()) {
                final ArrayList<Student> h2 = this.H;
                final StudentAbsence m = this.K;
                if (m == null) {
                    k0.S("absence");
                    throw null;
                }
                h2.add(m.getStudent());
            }
            final int j2 = com.untis.mobile.c.i.j2;
            ((ListView)this.findViewById(j2)).setAdapter((ListAdapter)new b1((Context)this, this.H));
            final ListView listView = (ListView)this.findViewById(j2);
            final int n2 = 0;
            listView.setClickable(false);
            ((ViewGroup)this.findViewById(com.untis.mobile.c.i.Z1)).setOnClickListener((View$OnClickListener)new u(this));
            ((LinearLayout)this.findViewById(com.untis.mobile.c.i.a2)).setOnClickListener((View$OnClickListener)new s(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.Y1)).setOnClickListener((View$OnClickListener)new q(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.X1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.o(this));
            ((ViewGroup)this.findViewById(com.untis.mobile.c.i.U1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.w(this));
            ((ViewGroup)this.findViewById(com.untis.mobile.c.i.V1)).setOnClickListener((View$OnClickListener)new x(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.T1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.v(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.W1)).setOnClickListener((View$OnClickListener)new y(this));
            this.K1();
            final CardView cardView = (CardView)this.findViewById(com.untis.mobile.c.i.Q1);
            int visibility;
            if (this.j0()) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((FrameLayout)cardView).setVisibility(visibility);
            ((ViewGroup)this.findViewById(com.untis.mobile.c.i.R1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.p(this));
            this.J1();
            final CardView cardView2 = (CardView)this.findViewById(com.untis.mobile.c.i.k2);
            int visibility2;
            if (this.k0()) {
                visibility2 = n2;
            }
            else {
                visibility2 = 8;
            }
            ((FrameLayout)cardView2).setVisibility(visibility2);
            final int l2 = com.untis.mobile.c.i.l2;
            ((EditText)this.findViewById(l2)).addTextChangedListener((TextWatcher)new TextWatcher() {
                final /* synthetic */ AbsenceDetailActivity G;
                
                public void afterTextChanged(@f final Editable editable) {
                }
                
                public void beforeTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
                
                public void onTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
                    final StudentAbsence l0 = AbsenceDetailActivity.l0(this.G);
                    if (l0 != null) {
                        final String s = "";
                        String string;
                        if (charSequence == null) {
                            string = s;
                        }
                        else {
                            string = charSequence.toString();
                            if (string == null) {
                                string = s;
                            }
                        }
                        l0.setText(string);
                        return;
                    }
                    k0.S("absence");
                    throw null;
                }
            });
            final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(l2);
            k0.o(textInputEditText, "activity_absence_detail_text_edit");
            com.untis.mobile.utils.extension.h.D(textInputEditText, null, 1, null);
            this.L1();
            ((ImageButton)this.findViewById(com.untis.mobile.c.i.e2)).setOnClickListener((View$OnClickListener)new r(this));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@f final Menu menu) {
        this.getMenuInflater().inflate(2131558401, menu);
        k0.m(menu);
        final MenuItem item = menu.findItem(2131298428);
        final StudentAbsence k = this.K;
        if (k != null) {
            item.setVisible(k.getId() != 0L);
            return super.onCreateOptionsMenu(menu);
        }
        k0.S("absence");
        throw null;
    }
    
    @SuppressLint({ "InflateParams" })
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        if (itemId != 2131298428) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((Dialog)new d$a((Context)this, 2131951624).M(((Activity)this).getLayoutInflater().inflate(2131493034, (ViewGroup)null, false)).r(2131886649, (DialogInterface$OnClickListener)n.G).B(2131886653, (DialogInterface$OnClickListener)new k(this)).a()).show();
        return true;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("gamma", g.getUniqueId());
        bundle.putParcelableArrayList("omega", (ArrayList)this.H);
        final StudentAbsence k = this.K;
        if (k == null) {
            k0.S("absence");
            throw null;
        }
        bundle.putParcelable("alpha", (Parcelable)k);
        final StudentAbsenceResult l = this.L;
        if (l != null) {
            bundle.putParcelable("beta", (Parcelable)l);
        }
        final Period i = this.I;
        if (i != null) {
            bundle.putLong("zeta", i.getId());
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J&\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004J,\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0005\u001a\u00020\u0004J2\u0010\u001f\u001a\u00020\r2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0019j\b\u0012\u0004\u0012\u00020\u0006`\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010 \u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\rR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010%¨\u0006/" }, d2 = { "com/untis/mobile/ui/activities/classbook/absences/AbsenceDetailActivity$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "d", "Lorg/joda/time/c;", "start", "g", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "h", "studentAbsence", "", "periodId", "a", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "b", "", "students", "c", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "studentabsences", "", "delete", "webuntisChangedTheAbsence", "i", "data", "k", "e", "f", "BUNDLE_DELETE", "Ljava/lang/String;", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "BUNDLE_STUDENTS", "BUNDLE_STUDENT_ABSENCE", "BUNDLE_STUDENT_ABSENCES", "BUNDLE_STUDENT_ABSENCE_RESULT", "BUNDLE_WEBUNTIS_CHANGED_ABSENCE", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final StudentAbsence d(final String s, final Period period) {
            final a a = com.untis.mobile.services.classbook.k0.a0.a(s);
            final int n = AbsenceDetailActivity.a.a.a[a.y().ordinal()];
            c c;
            if (n != 1) {
                if (n == 2) {
                    final org.joda.time.v d0 = a.d0();
                    c v4;
                    if (d0 == null) {
                        v4 = null;
                    }
                    else {
                        v4 = ((org.joda.time.base.e)d0).V4((l0)period.getEnd());
                    }
                    c = v4;
                    if (v4 != null) {
                        return new StudentAbsence(0L, period.getId(), new Student(0L, null, null, null, null, 31, null), null, period.getStart(), c, false, null, true, null, null, true, 1737, null);
                    }
                }
                c = period.getEnd();
            }
            else {
                c = this.g(s, period.getStart());
            }
            return new StudentAbsence(0L, period.getId(), new Student(0L, null, null, null, null, 31, null), null, period.getStart(), c, false, null, true, null, null, true, 1737, null);
        }
        
        private final c g(final String s, final c c) {
            final org.joda.time.t h1 = c.h1();
            final org.joda.time.v v = new org.joda.time.v(0L);
            final com.untis.mobile.services.timetable.placeholder.k a = com.untis.mobile.services.timetable.placeholder.p.Y.a(s);
            k0.o(h1, "date");
            final Iterator<Object> iterator = a.n(h1).iterator();
            org.joda.time.v end = v;
            while (iterator.hasNext()) {
                final TimeGridUnit timeGridUnit = iterator.next();
                if (((org.joda.time.base.e)timeGridUnit.getEnd()).m((org.joda.time.n0)end)) {
                    end = timeGridUnit.getEnd();
                }
            }
            final c v2 = ((org.joda.time.base.e)end).V4((l0)c);
            k0.o(v2, "end.toDateTime(start)");
            return v2;
        }
        
        private final Intent h(final Context context) {
            return new Intent(context, (Class)AbsenceDetailActivity.class);
        }
        
        public static /* synthetic */ Intent j(final AbsenceDetailActivity.a a, final ArrayList list, boolean b, boolean b2, final int n, final Object o) {
            if ((n & 0x2) != 0x0) {
                b = false;
            }
            if ((n & 0x4) != 0x0) {
                b2 = false;
            }
            return a.i(list, b, b2);
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, @e final StudentAbsence studentAbsence, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(studentAbsence, "studentAbsence");
            final Intent h = this.h(context);
            final ArrayList<Student> list = new ArrayList<Student>();
            list.add(studentAbsence.getStudent());
            final Bundle bundle = new Bundle();
            bundle.putLong("zeta", n);
            bundle.putString("gamma", s);
            bundle.putParcelableArrayList("omega", (ArrayList)list);
            bundle.putParcelable("alpha", (Parcelable)studentAbsence);
            h.putExtras(bundle);
            return h;
        }
        
        @e
        public final Intent b(@e final Context context, @e final String s, @e final Student e, @e final Period period) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(e, "student");
            k0.p(period, "period");
            final ArrayList<Student> list = new ArrayList<Student>();
            list.add(e);
            return this.c(context, s, list, period);
        }
        
        @e
        public final Intent c(@e final Context context, @e final String s, @e final List<Student> c, @e final Period period) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(c, "students");
            k0.p(period, "period");
            final Intent h = this.h(context);
            final ArrayList list = new ArrayList();
            list.addAll(c);
            final Bundle bundle = new Bundle();
            bundle.putLong("zeta", period.getId());
            bundle.putString("gamma", s);
            bundle.putParcelable("alpha", (Parcelable)this.d(s, period));
            bundle.putParcelableArrayList("omega", list);
            h.putExtras(bundle);
            return h;
        }
        
        public final boolean e(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getBooleanExtra("aoide", false);
        }
        
        public final boolean f(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getBooleanExtra("theta", false);
        }
        
        @e
        public final Intent i(@e final ArrayList<StudentAbsence> list, final boolean b, final boolean b2) {
            k0.p(list, "studentabsences");
            final Intent intent = new Intent();
            intent.putParcelableArrayListExtra("oida", (ArrayList)list);
            intent.putExtra("aoide", b);
            intent.putExtra("theta", b2);
            return intent;
        }
        
        @e
        public final List<StudentAbsence> k(@e final Intent intent) {
            k0.p(intent, "data");
            ArrayList<StudentAbsence> parcelableArrayListExtra;
            if ((parcelableArrayListExtra = (ArrayList<StudentAbsence>)intent.getParcelableArrayListExtra("oida")) == null) {
                parcelableArrayListExtra = new ArrayList<StudentAbsence>();
            }
            return parcelableArrayListExtra;
        }
    }
}
