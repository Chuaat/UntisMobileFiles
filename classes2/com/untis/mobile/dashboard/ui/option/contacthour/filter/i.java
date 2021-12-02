// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour.filter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.a;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.text.s;
import android.view.View;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BB\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b0#¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001e\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006*" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/filter/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "getItemCount", "holder", "position", "Lkotlin/j2;", "j", "", "filter", "i", "f", "I", "colorHighlight", "", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "a", "Ljava/util/List;", "classes", "e", "filtered", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "d", "Ljava/lang/String;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "klasse", "onKlasse", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends RecyclerView$h<o0>
{
    @e
    private final List<Klasse> a;
    @e
    private final l<Klasse, j2> b;
    private final LayoutInflater c;
    @e
    private String d;
    @e
    private List<Klasse> e;
    private final int f;
    
    public i(@e final Context context, @e final List<Klasse> a, @e final l<? super Klasse, j2> b) {
        k0.p(context, "context");
        k0.p(a, "classes");
        k0.p(b, "onKlasse");
        this.a = a;
        this.b = (l<Klasse, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
        this.d = "";
        this.e = v.I5((Iterable<? extends Klasse>)a);
        this.f = androidx.core.content.d.f(context, 2131100003);
    }
    
    private static final void k(final i i, final Klasse klasse, final View view) {
        k0.p(i, "this$0");
        k0.p(klasse, "$klasse");
        i.b.invoke(klasse);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public final void i(@e final String d) {
        k0.p(d, "filter");
        if (k0.g(this.d, d)) {
            return;
        }
        final boolean u1 = s.U1((CharSequence)d);
        this.d = d;
        if (u1) {
            this.e = v.I5((Iterable<? extends Klasse>)this.a);
        }
        else {
            final List<Klasse> a = this.a;
            final ArrayList<Klasse> e = new ArrayList<Klasse>();
            for (final Klasse next : a) {
                final Klasse klasse = next;
                final String displayableTitle = klasse.getDisplayableTitle();
                int n = 1;
                if (!s.S2((CharSequence)displayableTitle, (CharSequence)d, true)) {
                    if (s.S2((CharSequence)klasse.getDisplayableDescription(), (CharSequence)d, true)) {
                        n = n;
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    e.add(next);
                }
            }
            this.e = e;
        }
        this.notifyDataSetChanged();
    }
    
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final Klasse klasse = this.e.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Cw)).setText((CharSequence)h.P(klasse.getDisplayableTitle(), this.f, this.d));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Bw)).setText((CharSequence)h.P(klasse.getDisplayableDescription(), this.f, this.d));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.zw)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.h(this, klasse));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Aw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131493184, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_filter_class, parent, false)");
        return new o0(inflate);
    }
}
