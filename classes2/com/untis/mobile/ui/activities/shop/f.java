// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.shop;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.ArrayList;
import android.view.View;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.j2;
import com.untis.mobile.services.billing.a;
import n6.l;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019#B:\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0017J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0014\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006$" }, d2 = { "Lcom/untis/mobile/ui/activities/shop/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lkotlin/j2;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "holder", "position", "j", "getItemCount", "", "Lcom/untis/mobile/utils/billing/f;", "purchases", "n", "Lcom/untis/mobile/services/billing/a;", "products", "m", "Lcom/untis/mobile/ui/activities/shop/f$b;", "c", "Ljava/util/List;", "filteredShopItems", "a", "shopItems", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "product", "onShopItemClick", "<init>", "(Ljava/util/List;Ln6/l;)V", "d", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends RecyclerView$h<o0>
{
    @e
    public static final a d;
    @e
    private final List<b> a;
    @e
    private final l<com.untis.mobile.services.billing.a, j2> b;
    @e
    private List<b> c;
    
    static {
        d = new a(null);
    }
    
    public f(@e final List<b> a, @e final l<? super com.untis.mobile.services.billing.a, j2> b) {
        k0.p(a, "shopItems");
        k0.p(b, "onShopItemClick");
        this.a = a;
        this.b = (l<com.untis.mobile.services.billing.a, j2>)b;
        this.c = v.E();
    }
    
    private final void i() {
        final List<b> a = this.a;
        final ArrayList<b> c = new ArrayList<b>();
        for (final b next : a) {
            final b b = next;
            final com.untis.mobile.services.billing.a c2 = b.c();
            boolean b2 = true;
            Label_0082: {
                if (c2 != null) {
                    if (b.a()) {
                        break Label_0082;
                    }
                    if (b.e() != null) {
                        break Label_0082;
                    }
                }
                b2 = false;
            }
            if (b2) {
                c.add(next);
            }
        }
        this.c = c;
        this.notifyDataSetChanged();
    }
    
    private static final void k(final f f, final b b, final View view) {
        k0.p(f, "this$0");
        k0.p(b, "$shopItem");
        final l<com.untis.mobile.services.billing.a, j2> b2 = f.b;
        final com.untis.mobile.services.billing.a c = b.c();
        if (c == null) {
            return;
        }
        b2.invoke(c);
    }
    
    public int getItemCount() {
        return this.c.size();
    }
    
    @SuppressLint({ "SetTextI18n" })
    public void j(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final b b = this.c.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.UB)).setText(b.f());
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.TB);
        if (b.e() != null) {
            ((TextView)appCompatTextView).setText(2131886540);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final com.untis.mobile.services.billing.a c = b.c();
            Object e;
            if (c == null) {
                e = null;
            }
            else {
                e = c.e();
            }
            sb.append(e);
            sb.append(' ');
            final com.untis.mobile.services.billing.a c2 = b.c();
            Object a;
            if (c2 == null) {
                a = null;
            }
            else {
                a = c2.a();
            }
            sb.append(a);
            ((TextView)appCompatTextView).setText((CharSequence)sb.toString());
        }
        if (k0.g(b.d(), "subscription_premium_month_2") && b.c() != null) {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.SB)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.shop.e(this, b));
        }
        else {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.SB)).setOnClickListener((View$OnClickListener)null);
        }
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493252, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_shop_product, parent, false)");
        return new o0(inflate);
    }
    
    public final void m(@e final List<? extends com.untis.mobile.services.billing.a> list) {
        k0.p(list, "products");
    Label_0017:
        for (final b b : this.a) {
            while (true) {
                for (final com.untis.mobile.services.billing.a next : list) {
                    if (k0.g(next.c(), b.d())) {
                        com.untis.mobile.services.billing.a c;
                        if ((c = next) == null) {
                            c = b.c();
                        }
                        b.h(c);
                        continue Label_0017;
                    }
                }
                com.untis.mobile.services.billing.a next = null;
                continue;
            }
        }
        this.i();
    }
    
    public final void n(@e final List<? extends com.untis.mobile.utils.billing.f> list) {
        k0.p(list, "purchases");
    Label_0017:
        for (final b b : this.a) {
            while (true) {
                for (final com.untis.mobile.utils.billing.f next : list) {
                    if (b.b().contains(next.i())) {
                        com.untis.mobile.utils.billing.f e;
                        if ((e = next) == null) {
                            e = b.e();
                        }
                        b.i(e);
                        continue Label_0017;
                    }
                }
                com.untis.mobile.utils.billing.f next = null;
                continue;
            }
        }
        this.i();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007" }, d2 = { "com/untis/mobile/ui/activities/shop/f$a", "", "", "Lcom/untis/mobile/ui/activities/shop/f$b;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final List<b> a() {
            return v.L(new b(2131886796, v.L("product_id_premium", "subscription_premium_year_3", "subscription_premium_year"), "subscription_premium_year_3", null, null, false, 56, null), new b(2131886731, v.L("subscription_premium_month_2", "subscription_premium_month"), "subscription_premium_month_2", null, null, true, 24, null), new b(2131886306, v.k("product_id_homework"), "product_id_homework", null, null, false, 56, null), new b(2131886915, v.k("product_id_widgets"), "product_id_widgets", null, null, false, 56, null), new b(2131886548, v.k("product_id_tt_settings"), "product_id_tt_settings", null, null, false, 56, null));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0!\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\n\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006(" }, d2 = { "com/untis/mobile/ui/activities/shop/f$b", "", "Lcom/untis/mobile/utils/billing/f;", "e", "Lcom/untis/mobile/utils/billing/f;", "()Lcom/untis/mobile/utils/billing/f;", "i", "(Lcom/untis/mobile/utils/billing/f;)V", "purchase", "", "a", "I", "f", "()I", "titleKey", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "productKey", "Lcom/untis/mobile/services/billing/a;", "Lcom/untis/mobile/services/billing/a;", "()Lcom/untis/mobile/services/billing/a;", "h", "(Lcom/untis/mobile/services/billing/a;)V", "product", "", "Z", "()Z", "g", "(Z)V", "alwaysVisible", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "keys", "<init>", "(ILjava/util/List;Ljava/lang/String;Lcom/untis/mobile/services/billing/a;Lcom/untis/mobile/utils/billing/f;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private final int a;
        @e
        private final List<String> b;
        @org.jetbrains.annotations.f
        private final String c;
        @org.jetbrains.annotations.f
        private com.untis.mobile.services.billing.a d;
        @org.jetbrains.annotations.f
        private com.untis.mobile.utils.billing.f e;
        private boolean f;
        
        public b(final int a, @e final List<String> b, @org.jetbrains.annotations.f final String c, @org.jetbrains.annotations.f final com.untis.mobile.services.billing.a d, @org.jetbrains.annotations.f final com.untis.mobile.utils.billing.f e, final boolean f) {
            k0.p(b, "keys");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        public final boolean a() {
            return this.f;
        }
        
        @e
        public final List<String> b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.f
        public final com.untis.mobile.services.billing.a c() {
            return this.d;
        }
        
        @org.jetbrains.annotations.f
        public final String d() {
            return this.c;
        }
        
        @org.jetbrains.annotations.f
        public final com.untis.mobile.utils.billing.f e() {
            return this.e;
        }
        
        public final int f() {
            return this.a;
        }
        
        public final void g(final boolean f) {
            this.f = f;
        }
        
        public final void h(@org.jetbrains.annotations.f final com.untis.mobile.services.billing.a d) {
            this.d = d;
        }
        
        public final void i(@org.jetbrains.annotations.f final com.untis.mobile.utils.billing.f e) {
            this.e = e;
        }
    }
}
