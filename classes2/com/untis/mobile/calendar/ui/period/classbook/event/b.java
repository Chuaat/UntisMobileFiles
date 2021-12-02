// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.masterdata.a;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BH\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001e\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006%" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "holder", "position", "Lkotlin/j2;", "i", "getItemCount", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "events", "l", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/services/masterdata/a;", "a", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "b", "Ljava/util/List;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "event", "onEvent", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/services/masterdata/a;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final a a;
    @e
    private List<Event> b;
    @e
    private final l<Event, j2> c;
    private final LayoutInflater d;
    
    public b(@e final Context context, @e final a a, @e final List<Event> b, @e final l<? super Event, j2> c) {
        k0.p(context, "context");
        k0.p(a, "masterDataService");
        k0.p(b, "events");
        k0.p(c, "onEvent");
        this.a = a;
        this.b = b;
        this.c = (l<Event, j2>)c;
        this.d = LayoutInflater.from(context.getApplicationContext());
    }
    
    private static final void j(final b b, final Event event, final View view) {
        k0.p(b, "this$0");
        k0.p(event, "$event");
        b.c.invoke(event);
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void i(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final Event event = this.b.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ji)).setText((CharSequence)d0.o(event.getDateTime()));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.qi);
        final DisplayableEntity v = this.a.v(event.getEntityType(), event.getEntityId());
        final String s = "";
        String displayableTitle;
        if (v == null || (displayableTitle = v.getDisplayableTitle()) == null) {
            displayableTitle = "";
        }
        ((TextView)appCompatTextView).setText((CharSequence)displayableTitle);
        final View itemView = o0.itemView;
        n = com.untis.mobile.c.i.ni;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)itemView.findViewById(n);
        final EventReason eventReason = event.getEventReason();
        String displayableTitle2;
        if (eventReason == null) {
            displayableTitle2 = s;
        }
        else {
            displayableTitle2 = eventReason.getDisplayableTitle();
            if (displayableTitle2 == null) {
                displayableTitle2 = s;
            }
        }
        ((TextView)appCompatTextView2).setText((CharSequence)displayableTitle2);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.mi);
        final CharSequence text = ((AppCompatTextView)o0.itemView.findViewById(n)).getText();
        if (text != null && !kotlin.text.s.U1(text)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        final View itemView2 = o0.itemView;
        n = com.untis.mobile.c.i.pi;
        ((TextView)itemView2.findViewById(n)).setText((CharSequence)event.getText());
        final LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.oi);
        final CharSequence text2 = ((AppCompatTextView)o0.itemView.findViewById(n)).getText();
        if (text2 != null && !kotlin.text.s.U1(text2)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat2).setVisibility(h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.ii)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.a(this, event));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131492995, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.calendar_item_period_event, parent, false)");
        return new o0(inflate);
    }
    
    public final void l(@e final List<Event> b) {
        k0.p(b, "events");
        this.b = b;
        this.notifyDataSetChanged();
    }
}
