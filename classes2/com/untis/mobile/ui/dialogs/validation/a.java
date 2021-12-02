// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs.validation;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 " }, d2 = { "Lcom/untis/mobile/ui/dialogs/validation/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Ly3/a;", "error", "", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "k", "getItemCount", "holder", "position", "Lkotlin/j2;", "j", "", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "errors", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<o0>
{
    @e
    private final List<y3.a> a;
    private final LayoutInflater b;
    
    public a(@e final Context context, @e final List<y3.a> a) {
        k0.p(context, "context");
        k0.p(a, "errors");
        this.a = a;
        this.b = LayoutInflater.from(context.getApplicationContext());
    }
    
    private final String i(final y3.a a) {
        if (k0.g(a.c(), a.b())) {
            return a.a();
        }
        if (s.U1((CharSequence)a.b())) {
            return a.a();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(a.b());
        sb.append(" (");
        sb.append(a.a());
        sb.append(')');
        return sb.toString();
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    @e
    public final List<y3.a> h() {
        return this.a;
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final y3.a a = this.a.get(n);
        ((TextView)o0.itemView.findViewById(c.i.Ux)).setText((CharSequence)a.c());
        final View itemView = o0.itemView;
        final int tx = c.i.Tx;
        ((TextView)itemView.findViewById(tx)).setText((CharSequence)this.i(a));
        ((TextView)o0.itemView.findViewById(tx)).setVisibility(8);
        ((ImageView)o0.itemView.findViewById(c.i.Sx)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 k(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.b.inflate(2131493198, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dialog_apivalidationerrors, parent, false)");
        return new o0(inflate);
    }
}
