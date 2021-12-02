// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.opensource;

import android.view.View$OnClickListener;
import android.widget.TextView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import org.jetbrains.annotations.f;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/ui/activities/settings/opensource/i;", "Landroid/widget/BaseAdapter;", "", "url", "Lkotlin/j2;", "l", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/ui/activities/settings/opensource/j;", "f", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "", "H", "Ljava/util/List;", "openSourceLibraries", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends BaseAdapter
{
    @e
    private Context G;
    @e
    private final List<j> H;
    @e
    private LayoutInflater I;
    
    public i(@e final Context g, @e final List<j> h) {
        k0.p(g, "context");
        k0.p(h, "openSourceLibraries");
        this.G = g;
        this.H = h;
        final LayoutInflater from = LayoutInflater.from(g);
        k0.o(from, "from(context)");
        this.I = from;
    }
    
    private static final void g(final i i, final j j, final View view) {
        k0.p(i, "this$0");
        k0.p(j, "$library");
        i.l(j.e());
    }
    
    private static final void h(final i i, final j j, final View view) {
        k0.p(i, "this$0");
        k0.p(j, "$library");
        i.l(j.b());
    }
    
    private static final void i(final i i, final j j, final View view) {
        k0.p(i, "this$0");
        k0.p(j, "$library");
        i.l(j.e());
    }
    
    private static final void j(final i i, final j j, final View view) {
        k0.p(i, "this$0");
        k0.p(j, "$library");
        i.l(j.e());
    }
    
    private static final void k(final i i, final j j, final View view) {
        k0.p(i, "this$0");
        k0.p(j, "$library");
        i.l(j.d().f());
    }
    
    private final void l(final String s) {
        this.G.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
    
    @e
    public j f(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int n, @f final View view, @f final ViewGroup viewGroup) {
        final j f = this.f(n);
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493235, viewGroup, false);
            k0.o(inflate, "inflater.inflate(R.layout.item_open_source, parent, false)");
        }
        n = c.i.WA;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)f.f());
        ((TextView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.opensource.e(this, f));
        n = c.i.TA;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)f.a());
        ((TextView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new h(this, f));
        n = c.i.VA;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)f.c());
        ((TextView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new g(this, f));
        n = c.i.XA;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)f.g());
        ((TextView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new d(this, f));
        n = c.i.UA;
        ((TextView)inflate.findViewById(n)).setText((CharSequence)f.d().d());
        ((TextView)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.opensource.f(this, f));
        return inflate;
    }
}
