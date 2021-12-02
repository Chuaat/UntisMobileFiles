// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import org.joda.time.t;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkKt;
import com.untis.mobile.utils.extension.q;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.utils.d0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import org.joda.time.n0;
import android.view.View;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import androidx.core.content.d;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100-¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014R\u001e\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001d¨\u00063" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "", "i", "", "position", "m", "Landroid/view/ViewGroup;", "parent", "viewType", "l", "getItemCount", "holder", "Lkotlin/j2;", "j", "showAll", "o", "", "homework", "n", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "e", "Ljava/util/List;", "filtered", "Landroid/graphics/drawable/Drawable;", "h", "Landroid/graphics/drawable/Drawable;", "homeworkIcon", "a", "Z", "homeworkCompletedIcon", "f", "homeworkLocalIcon", "g", "homeworkLocalCompletedIcon", "b", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onHomework", "<init>", "(Landroid/content/Context;ZLjava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    private boolean a;
    @e
    private List<HomeWork> b;
    @e
    private final l<HomeWork, j2> c;
    private final LayoutInflater d;
    @e
    private List<HomeWork> e;
    @f
    private final Drawable f;
    @f
    private final Drawable g;
    @f
    private final Drawable h;
    @f
    private final Drawable i;
    
    public b(@e final Context context, final boolean a, @e final List<HomeWork> b, @e final l<? super HomeWork, j2> c) {
        k0.p(context, "context");
        k0.p(b, "homework");
        k0.p(c, "onHomework");
        this.a = a;
        this.b = b;
        this.c = (l<HomeWork, j2>)c;
        this.d = LayoutInflater.from(context.getApplicationContext());
        final List<HomeWork> b2 = this.b;
        final ArrayList<HomeWork> e = new ArrayList<HomeWork>();
        for (final HomeWork next : b2) {
            if (this.i(next)) {
                e.add(next);
            }
        }
        this.e = e;
        final Drawable i = androidx.core.content.d.i(context, 2131231110);
        final Drawable drawable = null;
        Drawable mutate;
        if (i == null) {
            mutate = null;
        }
        else {
            mutate = i.mutate();
        }
        this.f = mutate;
        final Drawable j = androidx.core.content.d.i(context, 2131231110);
        Drawable mutate2;
        if (j == null) {
            mutate2 = null;
        }
        else {
            mutate2 = j.mutate();
        }
        this.g = mutate2;
        final Drawable k = androidx.core.content.d.i(context, 2131231109);
        Drawable mutate3;
        if (k == null) {
            mutate3 = null;
        }
        else {
            mutate3 = k.mutate();
        }
        this.h = mutate3;
        final Drawable l = androidx.core.content.d.i(context, 2131231109);
        Drawable mutate4;
        if (l == null) {
            mutate4 = drawable;
        }
        else {
            mutate4 = l.mutate();
        }
        this.i = mutate4;
        if (mutate2 != null) {
            mutate2.setTint(androidx.core.content.d.f(context, 2131099989));
        }
        if (mutate4 != null) {
            mutate4.setTint(androidx.core.content.d.f(context, 2131099989));
        }
    }
    
    private final boolean i(final HomeWork homeWork) {
        return this.a || (homeWork.getCompletedStatus() ^ true);
    }
    
    private static final void k(final b b, final HomeWork homeWork, final View view) {
        k0.p(b, "this$0");
        k0.p(homeWork, "$homework");
        b.c.invoke(homeWork);
    }
    
    private final boolean m(final int n) {
        return n == 0 || (((org.joda.time.base.e)this.e.get(n - 1).getEnd().h1()).p((n0)this.e.get(n).getEnd().h1()) ^ true);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public void j(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final HomeWork homeWork = this.e.get(n);
        final boolean m = this.m(n);
        final View itemView = o0.itemView;
        final int ui = com.untis.mobile.c.i.ui;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(ui);
        Drawable imageDrawable;
        if (homeWork.getLocal() && homeWork.getCompletedStatus()) {
            imageDrawable = this.g;
        }
        else if (homeWork.getLocal()) {
            imageDrawable = this.f;
        }
        else if (!homeWork.getLocal() && homeWork.getCompletedStatus()) {
            imageDrawable = this.i;
        }
        else {
            imageDrawable = this.h;
        }
        appCompatImageView.setImageDrawable(imageDrawable);
        final View itemView2 = o0.itemView;
        n = com.untis.mobile.c.i.si;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)itemView2.findViewById(n);
        final t h1 = homeWork.getEnd().h1();
        k0.o(h1, "homework.end.toLocalDate()");
        ((TextView)appCompatTextView).setText((CharSequence)d0.m(h1));
        ((TextView)o0.itemView.findViewById(n)).setVisibility(com.untis.mobile.utils.extension.h.U(m, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.ti)).setVisibility(com.untis.mobile.utils.extension.h.U(m, 0, 1, null));
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)o0.itemView.findViewById(ui);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.xi)).setText((CharSequence)homeWork.getText());
        final View itemView3 = o0.itemView;
        n = com.untis.mobile.c.i.vi;
        ((TextView)itemView3.findViewById(n)).setText((CharSequence)homeWork.getRemark());
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)o0.itemView.findViewById(n);
        k0.o(appCompatTextView2, "holder.itemView.calendar_item_period_homework_subtitle");
        q.e(appCompatTextView2, homeWork.getText(), 0, 2, null);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.wi)).setText((CharSequence)HomeWorkKt.getDisplayableDate(homeWork));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ri)).setOnClickListener((View$OnClickListener)new a(this, homeWork));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131492996, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.calendar_item_period_homework, parent, false)");
        return new o0(inflate);
    }
    
    public final void n(@e final List<HomeWork> b) {
        k0.p(b, "homework");
        this.b = b;
        final ArrayList<HomeWork> e = new ArrayList<HomeWork>();
        for (final HomeWork next : b) {
            if (this.i(next)) {
                e.add(next);
            }
        }
        this.e = e;
        this.notifyDataSetChanged();
    }
    
    public final void o(final boolean a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        final List<HomeWork> b = this.b;
        final ArrayList<HomeWork> e = new ArrayList<HomeWork>();
        for (final HomeWork next : b) {
            if (this.i(next)) {
                e.add(next);
            }
        }
        this.e = e;
        this.notifyDataSetChanged();
    }
}
