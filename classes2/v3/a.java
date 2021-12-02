// 
// Decompiled by Procyon v0.5.36
// 

package v3;

import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import com.untis.mobile.analytics.base.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0016" }, d2 = { "Lv3/a;", "Lcom/untis/mobile/analytics/base/b;", "Lcom/untis/mobile/analytics/base/a;", "event", "Lkotlin/j2;", "c", "", "property", "value", "b", "", "enable", "a", "Landroid/os/Bundle;", "params", "d", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "Landroid/content/Context;", "context", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements b
{
    @e
    private final FirebaseAnalytics a;
    @e
    private final Context b;
    
    public a(@e final FirebaseAnalytics a, @e final Context b) {
        k0.p(a, "firebaseAnalytics");
        k0.p(b, "context");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final boolean b) {
        this.a.d(b);
    }
    
    @Override
    public void b(@e final String s, @e final String s2) {
        k0.p(s, "property");
        k0.p(s2, "value");
        this.a.i(s, s2);
    }
    
    @Override
    public void c(@e final com.untis.mobile.analytics.base.a a) {
        k0.p(a, "event");
        this.a.b(a.b(), (Bundle)null);
    }
    
    @Override
    public void d(@e final com.untis.mobile.analytics.base.a a, @f final Bundle bundle) {
        k0.p(a, "event");
        this.a.b(a.b(), bundle);
    }
}
