// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import com.untis.mobile.substitutionplanning.model.PeriodGroupCollectionDto;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/substitutionplanning/absences/c;", "", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "h", "Landroid/view/ViewGroup;", "parent", "", "viewType", "j", "holder", "position", "Lkotlin/j2;", "i", "getItemCount", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "dto", "k", "a", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "periodGroupCollectionDto", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onPeriodGroupDto", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<c>
{
    @f
    private PeriodGroupCollectionDto a;
    @e
    private final l<Integer, j2> b;
    
    public a(@f final PeriodGroupCollectionDto a, @e final l<? super Integer, j2> b) {
        k0.p(b, "onPeriodGroupDto");
        this.a = a;
        this.b = (l<Integer, j2>)b;
    }
    
    private final List<PeriodGroupDto> h() {
        final PeriodGroupCollectionDto a = this.a;
        List<PeriodGroupDto> groups;
        if (a == null) {
            groups = null;
        }
        else {
            groups = a.getGroups();
        }
        List<PeriodGroupDto> e = groups;
        if (groups == null) {
            e = v.E();
        }
        return e;
    }
    
    public int getItemCount() {
        return this.h().size();
    }
    
    public void i(@e final c c, final int n) {
        k0.p(c, "holder");
        c.b(this.h().get(n), n, this.b);
    }
    
    @e
    public c j(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493225, viewGroup, false);
        k0.o(inflate, "from(parent.context)\n                .inflate(R.layout.item_my_teacher_absence, parent, false)");
        return new c(inflate);
    }
    
    @SuppressLint({ "NotifyDataSetChanged" })
    public final void k(@e final PeriodGroupCollectionDto a) {
        k0.p(a, "dto");
        this.a = a;
        this.notifyDataSetChanged();
    }
}
