// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.addabsence.dialog;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001e\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006 " }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/addabsence/dialog/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "", "Lcom/untis/mobile/persistence/models/profile/Child;", "a", "Ljava/util/List;", "children", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "child", "onChild", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final List<Child> a;
    @e
    private final l<Child, j2> b;
    private final LayoutInflater c;
    
    public b(@e final Context context, @e final List<Child> a, @e final l<? super Child, j2> b) {
        k0.p(context, "context");
        k0.p(a, "children");
        k0.p(b, "onChild");
        this.a = a;
        this.b = (l<Child, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
    }
    
    private static final void j(final b b, final Child child, final View view) {
        k0.p(b, "this$0");
        k0.p(child, "$child");
        b.b.invoke(child);
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final Child child = this.a.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Nx)).setText((CharSequence)child.displayableTitle());
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Lx)).setOnClickListener((View$OnClickListener)new a(this, child));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Mx)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493196, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dialog_addstudentabsence_select_child, parent, false)");
        return new o0(inflate);
    }
}
