// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.more;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.h0;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B:\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/ui/core/more/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "holder", "position", "Lkotlin/j2;", "i", "getItemCount", "", "Lcom/untis/mobile/ui/core/more/a;", "a", "Ljava/util/List;", "options", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "option", "onMoreOption", "<init>", "(Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends RecyclerView$h<o0>
{
    @e
    private final List<com.untis.mobile.ui.core.more.a> a;
    @e
    private final l<com.untis.mobile.ui.core.more.a, j2> b;
    
    public c(@e final List<? extends com.untis.mobile.ui.core.more.a> a, @e final l<? super com.untis.mobile.ui.core.more.a, j2> b) {
        k0.p(a, "options");
        k0.p(b, "onMoreOption");
        this.a = (List<com.untis.mobile.ui.core.more.a>)a;
        this.b = (l<com.untis.mobile.ui.core.more.a, j2>)b;
    }
    
    private static final void j(final c c, final com.untis.mobile.ui.core.more.a a, final View view) {
        k0.p(c, "this$0");
        k0.p(a, "$option");
        c.b.invoke(a);
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void i(@e final o0 o0, int n) {
        k0.p(o0, "holder");
        final com.untis.mobile.ui.core.more.a a = this.a.get(n);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Nz);
        final int[] a2 = c.a.a;
        n = a2[a.ordinal()];
        Context context;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                context = o0.itemView.getContext();
                n = 2131886115;
            }
            else {
                context = o0.itemView.getContext();
                n = 2131886642;
            }
        }
        else {
            context = o0.itemView.getContext();
            n = 2131886764;
        }
        ((TextView)appCompatTextView).setText((CharSequence)context.getString(n));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Mz);
        n = a2[a.ordinal()];
        Context context2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                context2 = o0.itemView.getContext();
                n = 2131231061;
            }
            else {
                context2 = o0.itemView.getContext();
                n = 2131231153;
            }
        }
        else {
            context2 = o0.itemView.getContext();
            n = 2131231140;
        }
        appCompatImageView.setImageDrawable(d.i(context2, n));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Lz)).setOnClickListener((View$OnClickListener)new b(this, a));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493224, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_more_option, parent, false)");
        return new o0(inflate);
    }
}
