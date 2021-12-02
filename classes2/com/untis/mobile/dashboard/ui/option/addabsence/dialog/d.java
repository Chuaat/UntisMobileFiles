// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.addabsence.dialog;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.a;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.text.s;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010$\u001a\u00020#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030%¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001e\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006," }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/addabsence/dialog/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lkotlin/j2;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "m", "getItemCount", "holder", "position", "k", "", "search", "j", "f", "I", "highlightColor", "", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "a", "Ljava/util/List;", "reasons", "d", "Ljava/lang/String;", "filter", "e", "filtered", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "reason", "onReason", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$h<o0>
{
    @e
    private final List<AbsenceReason> a;
    @e
    private final l<AbsenceReason, j2> b;
    private final LayoutInflater c;
    @e
    private String d;
    @e
    private List<AbsenceReason> e;
    private final int f;
    
    public d(@e final Context context, @e final List<AbsenceReason> list, @e final l<? super AbsenceReason, j2> b) {
        k0.p(context, "context");
        k0.p(list, "reasons");
        k0.p(b, "onReason");
        this.a = list;
        this.b = (l<AbsenceReason, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
        this.d = "";
        this.e = list;
        this.f = androidx.core.content.d.f(context, 2131100003);
    }
    
    private final void i() {
        if (s.U1((CharSequence)this.d)) {
            this.e = this.a;
            return;
        }
        final List<AbsenceReason> a = this.a;
        final ArrayList<AbsenceReason> e = new ArrayList<AbsenceReason>();
        for (final AbsenceReason next : a) {
            final AbsenceReason absenceReason = next;
            final String name = absenceReason.getName();
            final String d = this.d;
            boolean b = true;
            if (!s.S2((CharSequence)name, (CharSequence)d, true)) {
                if (!s.S2((CharSequence)absenceReason.getLongName(), (CharSequence)this.d, true)) {
                    b = false;
                }
            }
            if (b) {
                e.add(next);
            }
        }
        this.e = e;
    }
    
    private static final void l(final d d, final AbsenceReason absenceReason, final View view) {
        k0.p(d, "this$0");
        k0.p(absenceReason, "$reason");
        d.b.invoke(absenceReason);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public final void j(@e final String d) {
        k0.p(d, "search");
        this.d = d;
        this.i();
        this.notifyDataSetChanged();
    }
    
    public void k(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final AbsenceReason absenceReason = this.e.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Rx)).setText((CharSequence)h.P(absenceReason.getLongName(), this.f, this.d));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Qx)).setText((CharSequence)h.P(absenceReason.getName(), this.f, this.d));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Ox)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.addabsence.dialog.c(this, absenceReason));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Px)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 m(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493197, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dialog_addstudentabsence_select_reason, parent, false)");
        return new o0(inflate);
    }
}
