// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events.reminder;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtypeKt;
import android.view.View;
import androidx.core.content.d;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.joda.time.t;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BH\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010%\u001a\u00020\"\u0012!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050-¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0016¨\u00063" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/reminder/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "type", "Lkotlin/j2;", "m", "Landroid/graphics/drawable/Drawable;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "getItemCount", "holder", "position", "j", "", "activeTypes", "n", "h", "Landroid/graphics/drawable/Drawable;", "drawableUnchecked", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "drawableNotAvailable", "Lorg/joda/time/t;", "c", "Lorg/joda/time/t;", "date", "b", "Ljava/util/List;", "", "f", "types", "g", "drawableChecked", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onType", "<init>", "(Landroid/content/Context;Ljava/util/List;Lorg/joda/time/t;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private List<ReminderSubtype> b;
    @e
    private final t c;
    @e
    private final l<ReminderSubtype, j2> d;
    private final LayoutInflater e;
    @e
    private final List<ReminderSubtype> f;
    @f
    private final Drawable g;
    @f
    private final Drawable h;
    @f
    private final Drawable i;
    
    public b(@e final Context a, @e final List<ReminderSubtype> b, @e final t c, @e final l<? super ReminderSubtype, j2> d) {
        k0.p(a, "context");
        k0.p(b, "activeTypes");
        k0.p(c, "date");
        k0.p(d, "onType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<ReminderSubtype, j2>)d;
        this.e = LayoutInflater.from(a.getApplicationContext());
        this.f = v.L(ReminderSubtype.OneDay, ReminderSubtype.ThreeDays, ReminderSubtype.OneWeek, ReminderSubtype.TwoWeeks);
        this.g = androidx.core.content.d.i(a, 2131231088);
        this.h = androidx.core.content.d.i(a, 2131231165);
        this.i = androidx.core.content.d.i(a, 2131231129);
    }
    
    private final Drawable i(final ReminderSubtype reminderSubtype) {
        if (!ReminderSubtypeKt.isAvailable$default(reminderSubtype, this.c, null, 2, null)) {
            return this.i;
        }
        Drawable drawable;
        if (this.b.contains(reminderSubtype)) {
            drawable = this.g;
        }
        else {
            drawable = this.h;
        }
        return drawable;
    }
    
    private static final void k(final b b, final ReminderSubtype reminderSubtype, final o0 o0, final View view) {
        k0.p(b, "this$0");
        k0.p(reminderSubtype, "$type");
        k0.p(o0, "$holder");
        b.d.invoke(reminderSubtype);
        b.m(reminderSubtype);
        ((AppCompatImageView)o0.itemView.findViewById(c.i.vw)).setImageDrawable(b.i(reminderSubtype));
    }
    
    private final void m(final ReminderSubtype reminderSubtype) {
        if (this.b.contains(reminderSubtype)) {
            this.b.remove(reminderSubtype);
        }
        else {
            this.b.add(reminderSubtype);
        }
    }
    
    public int getItemCount() {
        return this.f.size();
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final ReminderSubtype reminderSubtype = this.f.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.yw)).setText((CharSequence)ReminderSubtypeKt.getTitle(reminderSubtype, this.a));
        ((AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.vw)).setImageDrawable(this.i(reminderSubtype));
        if (ReminderSubtypeKt.isAvailable$default(reminderSubtype, this.c, null, 2, null)) {
            final View itemView = o0.itemView;
            final int ww = com.untis.mobile.c.i.ww;
            ((ViewGroup)itemView.findViewById(ww)).setOnClickListener((View$OnClickListener)new a(this, reminderSubtype, o0));
            ((ViewGroup)o0.itemView.findViewById(ww)).setClickable(true);
            ((ViewGroup)o0.itemView.findViewById(ww)).setFocusable(true);
        }
        else {
            final View itemView2 = o0.itemView;
            final int ww2 = com.untis.mobile.c.i.ww;
            ((ViewGroup)itemView2.findViewById(ww2)).setOnClickListener((View$OnClickListener)null);
            ((ViewGroup)o0.itemView.findViewById(ww2)).setClickable(false);
            ((ViewGroup)o0.itemView.findViewById(ww2)).setFocusable(false);
        }
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.xw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131493183, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_event_notification, parent, false)");
        return new o0(inflate);
    }
    
    public final void n(@e final List<ReminderSubtype> b) {
        k0.p(b, "activeTypes");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
