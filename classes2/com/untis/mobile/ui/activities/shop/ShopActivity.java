// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.shop;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import androidx.lifecycle.y;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import android.content.Context;
import com.untis.mobile.utils.z;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/ui/activities/shop/ShopActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "arguments", "Lkotlin/j2;", "B", "w", "Lcom/untis/mobile/services/billing/a;", "product", "C", "save", "onCreate", "Lcom/untis/mobile/ui/activities/shop/o;", "G", "Lkotlin/b0;", "v", "()Lcom/untis/mobile/ui/activities/shop/o;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ShopActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "profile_role";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public ShopActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<o>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final o invoke() {
                return (o)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(o.class), null, null);
            }
        });
    }
    
    private static final void A(final ShopActivity shopActivity, final View view) {
        k0.p(shopActivity, "this$0");
        z.a.k((Context)shopActivity, shopActivity.v().f((Context)shopActivity));
    }
    
    private final void B(final Bundle bundle) {
        final o v = this.v();
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = bundle.getString("profile_role");
        }
        v.k(string);
    }
    
    private final void C(final com.untis.mobile.services.billing.a a) {
        this.v().m(a);
    }
    
    private final o v() {
        return this.G.getValue();
    }
    
    private final void w() {
        ((ImageView)this.findViewById(c.i.Bb)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.shop.b(this));
        ((TextView)this.findViewById(c.i.Fb)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.shop.a(this));
        ((TextView)this.findViewById(c.i.Cb)).setOnClickListener((View$OnClickListener)new d(this));
        ((TextView)this.findViewById(c.i.Db)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.shop.c(this));
        final f adapter = new f(null, new l<com.untis.mobile.services.billing.a, j2>() {
            public final void a(@e final com.untis.mobile.services.billing.a a) {
                k0.p(a, "it");
                ShopActivity.this.C(a);
            }
        }, 1, null);
        ((RecyclerView)this.findViewById(c.i.Eb)).setAdapter((RecyclerView$h)adapter);
        this.v().h().j((y)this, (l0)new l0<T>() {
            public final void a(final T t) {
                adapter.m((List<? extends com.untis.mobile.services.billing.a>)t);
            }
        });
        this.v().i().j((y)this, (l0)new l0<T>() {
            public final void a(final T t) {
                adapter.n((List<? extends com.untis.mobile.utils.billing.f>)t);
            }
        });
    }
    
    private static final void x(final ShopActivity shopActivity, final View view) {
        k0.p(shopActivity, "this$0");
        ((ComponentActivity)shopActivity).onBackPressed();
    }
    
    private static final void y(final ShopActivity shopActivity, final View view) {
        k0.p(shopActivity, "this$0");
        z.a.k((Context)shopActivity, shopActivity.v().g((Context)shopActivity));
    }
    
    private static final void z(final ShopActivity shopActivity, final View view) {
        k0.p(shopActivity, "this$0");
        z.a.k((Context)shopActivity, shopActivity.v().j());
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492960);
        b.setUpTopActionBar$default(this, null, null, 3, null);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.B(extras);
        this.v().l(this);
        this.w();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f" }, d2 = { "com/untis/mobile/ui/activities/shop/ShopActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Landroid/content/Intent;", "a", "ARGUMENT_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)ShopActivity.class);
            intent.putExtra("profile_role", s);
            return intent;
        }
    }
}
