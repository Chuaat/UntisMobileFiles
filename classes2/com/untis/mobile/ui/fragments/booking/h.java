// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.booking;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.List;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012%\b\u0002\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u001e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006%" }, d2 = { "Lcom/untis/mobile/ui/fragments/booking/h;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "b", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "", "G", "Ljava/util/List;", "rooms", "", "H", "Z", "addRoom", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "room", "Lkotlin/j2;", "onDeleteRoom", "<init>", "(Landroid/content/Context;Ljava/util/List;ZLn6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends BaseAdapter
{
    @e
    private final List<Room> G;
    private final boolean H;
    @f
    private final l<Room, j2> I;
    private final LayoutInflater J;
    
    public h(@e final Context context, @e final List<Room> g, final boolean h, @f final l<? super Room, j2> i) {
        k0.p(context, "context");
        k0.p(g, "rooms");
        this.G = g;
        this.H = h;
        this.I = (l<Room, j2>)i;
        this.J = LayoutInflater.from(context);
    }
    
    private static final void c(final h h, final Room room, final View view) {
        k0.p(h, "this$0");
        k0.p(room, "$room");
        h.I.invoke(room);
    }
    
    @e
    public Room b(final int n) {
        return this.G.get(n);
    }
    
    public int getCount() {
        return this.G.size();
    }
    
    public long getItemId(final int n) {
        return this.G.get(n).getId();
    }
    
    @e
    public View getView(int hu, @f final View view, @f final ViewGroup viewGroup) {
        final Room b = this.b(hu);
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493167, viewGroup, false);
        }
        final int gu = c.i.Gu;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(gu);
        if (this.H) {
            hu = 0;
        }
        else {
            hu = 8;
        }
        ((ImageView)appCompatImageView).setVisibility(hu);
        final boolean h = this.H;
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)inflate.findViewById(gu);
        if (h) {
            ((ImageView)appCompatImageView2).setVisibility(0);
        }
        else {
            ((ImageView)appCompatImageView2).setVisibility(8);
        }
        if (this.I != null && !this.H) {
            ((ImageView)inflate.findViewById(c.i.Iu)).setVisibility(0);
            hu = c.i.Hu;
            ((ImageView)inflate.findViewById(hu)).setVisibility(0);
            ((ImageView)inflate.findViewById(hu)).setOnClickListener((View$OnClickListener)new g(this, b));
        }
        else {
            ((ImageView)inflate.findViewById(c.i.Iu)).setVisibility(8);
            ((ImageView)inflate.findViewById(c.i.Hu)).setVisibility(8);
        }
        ((TextView)inflate.findViewById(c.i.Fu)).setText((CharSequence)b.getDisplayableTitle());
        ((TextView)inflate.findViewById(c.i.Eu)).setText((CharSequence)b.getDisplayableDescription());
        k0.o(inflate, "view");
        return inflate;
    }
}
