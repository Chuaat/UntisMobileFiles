// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import android.widget.ImageView;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.widget.TextView;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import android.content.Context;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%" }, d2 = { "Lcom/untis/mobile/ui/dialogs/e;", "Landroid/widget/BaseAdapter;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "entity", "Lkotlin/j2;", "a", "", "position", "b", "", "getItemId", "getCount", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "", "I", "Z", "displayIcons", "", "H", "Ljava/util/List;", "displayableEntities", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends BaseAdapter
{
    @org.jetbrains.annotations.e
    private final Context G;
    @org.jetbrains.annotations.e
    private final List<DisplayableEntity> H;
    private final boolean I;
    private final LayoutInflater J;
    
    public e(@org.jetbrains.annotations.e final Context g, @org.jetbrains.annotations.e final List<? extends DisplayableEntity> h, final boolean i) {
        k0.p(g, "context");
        k0.p(h, "displayableEntities");
        this.G = g;
        this.H = (List<DisplayableEntity>)h;
        this.I = i;
        this.J = LayoutInflater.from(g);
    }
    
    private final void a(final View view, final DisplayableEntity displayableEntity) {
        if (this.I) {
            final int vx = c.i.Vx;
            ((ImageView)view.findViewById(vx)).setVisibility(0);
            ((AppCompatImageView)view.findViewById(vx)).setImageDrawable(h.t(this.G, displayableEntity.entityType()));
        }
        else {
            ((ImageView)view.findViewById(c.i.Vx)).setVisibility(8);
        }
        ((TextView)view.findViewById(c.i.Xx)).setText((CharSequence)displayableEntity.getDisplayableTitle());
        ((TextView)view.findViewById(c.i.Wx)).setText((CharSequence)displayableEntity.getDisplayableDescription());
    }
    
    @org.jetbrains.annotations.e
    public DisplayableEntity b(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return this.H.get(n).entityId();
    }
    
    @org.jetbrains.annotations.e
    public View getView(final int n, @f final View view, @f final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493199, viewGroup, false);
        }
        if (inflate == null) {
            return new View(this.G);
        }
        this.a(inflate, this.b(n));
        return inflate;
    }
}
