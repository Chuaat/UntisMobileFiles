// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences.absencereason;

import android.widget.TextView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import java.util.Collection;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import java.util.List;
import android.content.Context;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.ArrayList;
import android.view.LayoutInflater;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0 \u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0018j\b\u0012\u0004\u0012\u00020\t`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011¨\u0006#" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/absencereason/b;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "a", "", "getItemId", "getCount", "K", "I", "colorHighlight", "J", "colorDefault", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "H", "Landroid/view/LayoutInflater;", "inflater", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "absenceReasons", "G", "selectedAbsenceReasonId", "Landroid/content/Context;", "context", "", "<init>", "(Landroid/content/Context;Ljava/util/List;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends BaseAdapter
{
    private final long G;
    private final LayoutInflater H;
    @e
    private final ArrayList<AbsenceReason> I;
    private final int J;
    private final int K;
    
    public b(@e final Context context, @e final List<AbsenceReason> c, final long g) {
        k0.p(context, "context");
        k0.p(c, "absenceReasons");
        this.G = g;
        this.H = LayoutInflater.from(context);
        final ArrayList<AbsenceReason> i = new ArrayList<AbsenceReason>();
        this.I = i;
        this.J = d.f(context, 2131099970);
        this.K = d.f(context, 2131099677);
        final String string = context.getString(2131886745);
        k0.o(string, "context.getString(R.string.shared_noSelection_text)");
        i.add(new AbsenceReason(0L, string, null, false, 13, null));
        i.addAll(c);
    }
    
    @e
    public AbsenceReason a(final int index) {
        final AbsenceReason value = this.I.get(index);
        k0.o(value, "absenceReasons[position]");
        return value;
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int n, @f final View view, @f final ViewGroup viewGroup) {
        final AbsenceReason a = this.a(n);
        final int n2 = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493163, viewGroup, false);
        }
        n = c.i.nu;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)a.getName());
        final TextView textView = (TextView)inflate.findViewById(n);
        if (a.getId() == this.G) {
            n = this.K;
        }
        else {
            n = this.J;
        }
        textView.setTextColor(n);
        n = c.i.mu;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)a.getLongName());
        final TextView textView2 = (TextView)inflate.findViewById(n);
        if (a.getLongName().length() > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = n2;
        }
        else {
            n = 8;
        }
        textView2.setVisibility(n);
        k0.o(inflate, "view");
        return inflate;
    }
}
