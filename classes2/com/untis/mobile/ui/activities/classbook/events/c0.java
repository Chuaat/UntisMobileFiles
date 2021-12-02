// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.events;

import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import java.util.List;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u001e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/events/c0;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "a", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "I", "Landroid/view/LayoutInflater;", "inflater", "", "G", "Ljava/util/List;", "eventReasonGroups", "H", "J", "selectedGroupId", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c0 extends BaseAdapter
{
    @e
    private final List<EventReasonGroup> G;
    private final long H;
    private final LayoutInflater I;
    
    public c0(@e final Context context, @e final List<EventReasonGroup> g, final long h) {
        k0.p(context, "context");
        k0.p(g, "eventReasonGroups");
        this.G = g;
        this.H = h;
        this.I = LayoutInflater.from(context);
    }
    
    @e
    public EventReasonGroup a(final int n) {
        return this.G.get(n);
    }
    
    public int getCount() {
        return this.G.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int qy, @f final View view, @f final ViewGroup viewGroup) {
        final EventReasonGroup a = this.a(qy);
        int visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493209, viewGroup, false);
        }
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(c.i.py);
        if (this.H == a.getId()) {
            qy = 0;
        }
        else {
            qy = 4;
        }
        ((ImageView)appCompatImageView).setVisibility(qy);
        ((TextView)inflate.findViewById(c.i.ry)).setText((CharSequence)a.getName());
        qy = c.i.qy;
        ((TextView)inflate.findViewById(qy)).setText((CharSequence)a.getLongName());
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(qy);
        final CharSequence text = ((AppCompatTextView)inflate.findViewById(qy)).getText();
        k0.o(text, "view.item_event_reason_group_subtitle.text");
        if (text.length() == 0) {
            qy = 1;
        }
        else {
            qy = 0;
        }
        if (qy != 0) {
            visibility = 8;
        }
        ((TextView)appCompatTextView).setVisibility(visibility);
        k0.o(inflate, "view");
        return inflate;
    }
}
