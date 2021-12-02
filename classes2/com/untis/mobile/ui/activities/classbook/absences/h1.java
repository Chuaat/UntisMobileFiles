// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences;

import com.untis.mobile.c;
import android.widget.TextView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import org.joda.time.l0;
import com.untis.mobile.utils.comparator.b;
import kotlin.jvm.internal.w;
import java.util.Comparator;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.absence.StudentAttendance;
import java.util.List;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/h1;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "c", "", "getItemId", "getCount", "", "G", "Ljava/util/List;", "attendances", "", "H", "Z", "displayStudents", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h1 extends BaseAdapter
{
    @e
    private final List<StudentAttendance> G;
    private final boolean H;
    private final LayoutInflater I;
    
    public h1(@e final Context context, @e final List<StudentAttendance> g, final boolean h) {
        k0.p(context, "context");
        k0.p(g, "attendances");
        this.G = g;
        this.H = h;
        this.I = LayoutInflater.from(context);
        v.h5((Iterable<?>)g, (Comparator<? super Object>)g1.G);
    }
    
    private static final int b(final StudentAttendance studentAttendance, final StudentAttendance studentAttendance2) {
        int n;
        if ((n = b.G.b(studentAttendance.getStudent().getDisplayName(), studentAttendance2.getStudent().getDisplayName())) == 0) {
            n = ((org.joda.time.base.c)studentAttendance.getStart()).b((l0)studentAttendance2.getStart());
        }
        return n;
    }
    
    @e
    public StudentAttendance c(final int n) {
        return this.G.get(n);
    }
    
    public int getCount() {
        return this.G.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int jv, @f final View view, @f final ViewGroup viewGroup) {
        final StudentAttendance c = this.c(jv);
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493172, viewGroup, false);
        }
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.kv)).setText((CharSequence)com.untis.mobile.utils.time.b.c(c.getStart(), c.getEnd()));
        if (this.H) {
            jv = com.untis.mobile.c.i.jv;
            ((TextView)inflate.findViewById(jv)).setText((CharSequence)c.getStudent().getDisplayName());
            ((TextView)inflate.findViewById(jv)).setVisibility(0);
        }
        else {
            ((TextView)inflate.findViewById(com.untis.mobile.c.i.jv)).setVisibility(8);
        }
        k0.o(inflate, "view");
        return inflate;
    }
}
