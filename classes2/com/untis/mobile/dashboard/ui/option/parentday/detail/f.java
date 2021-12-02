// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday.detail;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import java.util.Iterator;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.persistence.models.masterdata.Subject;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.masterdata.Student;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayStudentSubject;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0017R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "holder", "position", "Lkotlin/j2;", "h", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayStudentSubject;", "a", "Ljava/util/List;", "studentSubjects", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "b", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "dashboardParentDayContext", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends RecyclerView$h<o0>
{
    @e
    private final List<DashboardParentDayStudentSubject> a;
    @e
    private final c b;
    private final LayoutInflater c;
    
    public f(@e final Context context, @e final List<DashboardParentDayStudentSubject> a, @e final c b) {
        k0.p(context, "context");
        k0.p(a, "studentSubjects");
        k0.p(b, "dashboardParentDayContext");
        this.a = a;
        this.b = b;
        this.c = LayoutInflater.from(context.getApplicationContext());
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    @SuppressLint({ "SetTextI18n" })
    public void h(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardParentDayStudentSubject dashboardParentDayStudentSubject = this.a.get(n);
        final Student student = (Student)this.b.b().get(dashboardParentDayStudentSubject.getStudentId());
        String str = "";
        if (student != null) {
            final String displayableTitle = student.getDisplayableTitle();
            if (displayableTitle != null) {
                str = displayableTitle;
            }
        }
        final List<Long> subjectIds = dashboardParentDayStudentSubject.getSubjectIds();
        final ArrayList<Subject> list = new ArrayList<Subject>();
        final Iterator<Number> iterator = subjectIds.iterator();
        while (iterator.hasNext()) {
            final Subject subject = (Subject)this.b.c().get(iterator.next().longValue());
            if (subject != null) {
                list.add(subject);
            }
        }
        final String h = com.untis.mobile.utils.extension.h.H(list, null, false, 3, null);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Mw);
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (");
        sb.append(h);
        sb.append(')');
        ((TextView)appCompatTextView).setText((CharSequence)sb.toString());
    }
    
    @e
    public o0 i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493189, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_parentday_appointment_child, parent, false)");
        return new o0(inflate);
    }
}
