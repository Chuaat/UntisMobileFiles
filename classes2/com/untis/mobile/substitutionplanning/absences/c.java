// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences;

import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.j2;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\t0\u0006¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/c;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "periodGroup", "", "position", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlin/j2;", "onPeriodGroupDto", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$g0
{
    public c(@e final View view) {
        k0.p(view, "view");
        super(view);
    }
    
    private static final void c(final l l, final int i, final View view) {
        k0.p(l, "$onPeriodGroupDto");
        l.invoke(i);
    }
    
    public final void b(@e final PeriodGroupDto periodGroupDto, final int n, @e final l<? super Integer, j2> l) {
        k0.p(periodGroupDto, "periodGroup");
        k0.p(l, "onPeriodGroupDto");
        ((TextView)super.itemView.findViewById(com.untis.mobile.c.i.nA)).setText((CharSequence)d.e(periodGroupDto));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)super.itemView.findViewById(com.untis.mobile.c.i.hA);
        final Context context = super.itemView.getContext();
        k0.o(context, "itemView.context");
        ((TextView)appCompatTextView).setText((CharSequence)d.j(periodGroupDto, context));
        final String a = d.a(periodGroupDto);
        ((TextView)super.itemView.findViewById(com.untis.mobile.c.i.kA)).setText((CharSequence)a);
        ((ViewGroup)super.itemView.findViewById(com.untis.mobile.c.i.iA)).setVisibility(h.U(s.U1((CharSequence)a) ^ true, 0, 1, null));
        ((ViewGroup)super.itemView.findViewById(com.untis.mobile.c.i.Oz)).setOnClickListener((View$OnClickListener)new b(l, n));
    }
}
