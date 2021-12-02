// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.solve;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import com.untis.mobile.substitutionplanning.model.SubjectRefDto;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.d0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0017R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/solve/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "holder", "position", "Lkotlin/j2;", "h", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "a", "Ljava/util/List;", "solutions", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$h<o0>
{
    @e
    private final List<PeriodConflictDto> a;
    private final LayoutInflater b;
    
    public c(@e final Context context, @e final List<PeriodConflictDto> a) {
        k0.p(context, "context");
        k0.p(a, "solutions");
        this.a = a;
        this.b = LayoutInflater.from(context);
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    @SuppressLint({ "SetTextI18n" })
    public void h(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final PeriodConflictDto periodConflictDto = this.a.get(n);
        final String startDateTime = periodConflictDto.getStartDateTime();
        String q = null;
        Label_0059: {
            if (startDateTime != null) {
                final org.joda.time.c j = d0.j(startDateTime);
                if (j != null) {
                    q = d0.q(j);
                    break Label_0059;
                }
            }
            q = null;
        }
        if (q == null) {
            return;
        }
        final String endDateTime = periodConflictDto.getEndDateTime();
        String q2 = null;
        Label_0104: {
            if (endDateTime != null) {
                final org.joda.time.c i = d0.j(endDateTime);
                if (i != null) {
                    q2 = d0.q(i);
                    break Label_0104;
                }
            }
            q2 = null;
        }
        if (q2 == null) {
            return;
        }
        final SubjectRefDto subject = periodConflictDto.getSubject();
        String str = "";
        if (subject != null) {
            final String displayName = subject.getDisplayName();
            if (displayName != null) {
                str = displayName;
            }
        }
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.mv);
        final StringBuilder sb = new StringBuilder();
        sb.append(q);
        sb.append(" - ");
        sb.append(q2);
        sb.append(" | ");
        sb.append(str);
        ((TextView)appCompatTextView).setText((CharSequence)sb.toString());
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.lv)).setVisibility(h.U(o0.getAdapterPosition() < this.getItemCount() - 1, 0, 1, null));
    }
    
    @e
    public o0 i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.b.inflate(2131493173, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_conflict_solution_affected_period, parent, false)");
        return new o0(inflate);
    }
}
