// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.duty;

import org.joda.time.base.d;
import android.widget.TextView;
import org.joda.time.m0;
import org.joda.time.r;
import android.content.Context;
import kotlin.text.s;
import org.joda.time.l0;
import java.util.Iterator;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.services.masterdata.b;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import kotlin.jvm.internal.w;
import java.util.Set;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import org.joda.time.c;
import com.untis.mobile.services.timetable.placeholder.p;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/duty/a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "classRole", "Lkotlin/j2;", "d", "c", "a", "", "h", "", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "e", "absence", "", "i", "absences", "f", "g", "b", "Landroid/view/View;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "J", "periodId", "Ljava/lang/String;", "profileId", "<init>", "(Landroid/view/View;JLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$g0
{
    @e
    private final View a;
    private final long b;
    @e
    private final String c;
    @e
    private final Period d;
    
    public a(@e final View a, final long b, @e final String c) {
        k0.p(a, "view");
        k0.p(c, "profileId");
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
        Period l;
        if ((l = p.Y.a(c).l(b)) == null) {
            l = new Period(b, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.d = l;
    }
    
    private final void a(final ClassRole classRole) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.a.findViewById(com.untis.mobile.c.i.Ju);
        ((TextView)appCompatTextView).setText((CharSequence)this.h(classRole));
        final CharSequence text = appCompatTextView.getText();
        k0.o(text, "text");
        final int length = text.length();
        int visibility = 0;
        if (length == 0) {
            visibility = 8;
        }
        ((TextView)appCompatTextView).setVisibility(visibility);
    }
    
    private final void c(final ClassRole classRole) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.a.findViewById(com.untis.mobile.c.i.Ku);
        ((TextView)appCompatTextView).setText((CharSequence)classRole.getText());
        final CharSequence text = appCompatTextView.getText();
        k0.o(text, "text");
        final int length = text.length();
        int visibility = 0;
        if (length == 0) {
            visibility = 8;
        }
        ((TextView)appCompatTextView).setVisibility(visibility);
    }
    
    private final void d(final ClassRole classRole) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.a.findViewById(com.untis.mobile.c.i.Lu);
        final Student v = com.untis.mobile.services.masterdata.b.Z.a(this.c).V(classRole.getStudentId());
        String text = "";
        if (v != null) {
            final String displayTitleInverted = v.getDisplayTitleInverted();
            if (displayTitleInverted != null) {
                text = displayTitleInverted;
            }
        }
        ((TextView)appCompatTextView).setText((CharSequence)text);
    }
    
    private final List<StudentAbsence> e(final ClassRole classRole) {
        final com.untis.mobile.services.classbook.a a = com.untis.mobile.services.classbook.k0.a0.a(this.c);
        Classbook s;
        if ((s = a.S(this.b)) == null) {
            s = new Classbook(this.b, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        final Set<Long> absences = s.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = a.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            final StudentAbsence studentAbsence = next;
            if (studentAbsence.getStudent().getId() == classRole.getStudentId() && this.i(studentAbsence)) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    private final String f(final List<StudentAbsence> list) {
        final int size = list.size();
        String s;
        if (size != 0) {
            if (size != 1) {
                s = this.a.getContext().getString(2131886802);
                k0.o(s, "view.context.getString(R.string.students_absent_text)");
            }
            else {
                s = this.g(list.get(0));
            }
        }
        else {
            s = "";
        }
        return s;
    }
    
    private final String g(final StudentAbsence studentAbsence) {
        final Context context = this.a.getContext();
        String s;
        String s2;
        String s3;
        if (((org.joda.time.base.c)studentAbsence.getStart()).R((l0)this.d.getStart())) {
            s = context.getString(2131886804);
            k0.o(s, "context.getString(R.string.students_leftAt_text)");
            s2 = ((org.joda.time.base.a)studentAbsence.getStart()).g4("H:mm");
            s3 = "absence.start.toString(\"H:mm\")";
        }
        else {
            if (!((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)this.d.getEnd())) {
                final String s4 = context.getString(2131886802);
                k0.o(s4, "context.getString(R.string.students_absent_text)");
                return s4;
            }
            s = context.getString(2131886803);
            k0.o(s, "context.getString(R.string.students_arrivedAt_text)");
            s2 = ((org.joda.time.base.a)studentAbsence.getEnd()).g4("H:mm");
            s3 = "absence.end.toString(\"H:mm\")";
        }
        k0.o(s2, s3);
        return kotlin.text.s.k2(s, "{0}", s2, false, 4, (Object)null);
    }
    
    private final String h(final ClassRole classRole) {
        return this.f(this.e(classRole));
    }
    
    private final boolean i(final StudentAbsence studentAbsence) {
        return ((d)new r((l0)studentAbsence.getStart(), (l0)studentAbsence.getEnd())).F((m0)new r((l0)this.d.getStart(), (l0)this.d.getEnd()));
    }
    
    public final void b(@e final ClassRole classRole) {
        k0.p(classRole, "classRole");
        this.d(classRole);
        this.c(classRole);
        this.a(classRole);
    }
}
