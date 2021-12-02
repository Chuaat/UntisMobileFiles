// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import com.untis.mobile.c;
import android.widget.TextView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.view.View;
import com.untis.mobile.utils.comparator.b;
import java.util.Comparator;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.Displayable;
import java.util.List;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u001e\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/s0;", "Landroid/widget/BaseAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/Displayable;", "c", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "H", "Landroid/view/LayoutInflater;", "inflater", "", "G", "Ljava/util/List;", "entities", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s0 extends BaseAdapter
{
    @e
    private final List<Displayable> G;
    private final LayoutInflater H;
    
    public s0(@e final Context context, @e final List<? extends Displayable> g) {
        k0.p(context, "context");
        k0.p(g, "entities");
        this.G = (List<Displayable>)g;
        this.H = LayoutInflater.from(context);
        v.h5((Iterable<?>)g, (Comparator<? super Object>)r0.G);
    }
    
    private static final int b(final Displayable displayable, final Displayable displayable2) {
        return b.G.b(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle());
    }
    
    @e
    public Displayable c(final int n) {
        return this.G.get(n);
    }
    
    public int getCount() {
        return this.G.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(final int n, @f final View view, @f final ViewGroup viewGroup) {
        final Displayable c = this.c(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493241, viewGroup, false);
        }
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.nB)).setText((CharSequence)c.getDisplayableTitle());
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.mB)).setText((CharSequence)c.getDisplayableDescription());
        k0.o(inflate, "view");
        return inflate;
    }
}
