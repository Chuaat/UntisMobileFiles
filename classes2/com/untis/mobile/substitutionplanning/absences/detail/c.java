// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences.detail;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/detail/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/substitutionplanning/absences/detail/a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "viewHolder", "position", "Lkotlin/j2;", "h", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "a", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "periodGroupDto", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$h<a>
{
    @e
    private final PeriodGroupDto a;
    
    public c(@e final PeriodGroupDto a) {
        k0.p(a, "periodGroupDto");
        this.a = a;
    }
    
    public int getItemCount() {
        return this.a.getPeriods().size();
    }
    
    public void h(@e final a a, final int n) {
        k0.p(a, "viewHolder");
        a.a(this.a.getPeriods().get(n));
    }
    
    @e
    public a i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final PeriodGroupDto a = this.a;
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493226, viewGroup, false);
        k0.o(inflate, "from(parent.context)\n                .inflate(R.layout.item_my_teacher_absence_detail, parent, false)");
        return new a(a, inflate);
    }
}
