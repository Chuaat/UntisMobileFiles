// 
// Decompiled by Procyon v0.5.36
// 

package j7;

import kotlin.reflect.d;
import kotlin.jvm.internal.k1;
import kotlin.p1;
import android.content.ComponentCallbacks;
import androidx.lifecycle.x;
import org.koin.androidx.scope.ScopeObserver;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.s$b;
import org.koin.core.scope.a;
import org.jetbrains.annotations.e;
import androidx.lifecycle.y;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002\u001a\u001c\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e\"\u0017\u0010\u0014\u001a\u00020\u0007*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015" }, d2 = { "Landroidx/lifecycle/y;", "Lorg/koin/core/a;", "e", "Ll7/d;", "h", "", "g", "Lorg/koin/core/scope/a;", "f", "scopeId", "Ll7/a;", "qualifier", "c", "scope", "Landroidx/lifecycle/s$b;", "event", "Lkotlin/j2;", "a", "d", "(Landroidx/lifecycle/y;)Lorg/koin/core/scope/a;", "currentScope", "koin-androidx-scope_release" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    public static final void a(@e final y y, @e final a a, @e final s$b s$b) {
        k0.q((Object)y, "$this$bindScope");
        k0.q((Object)a, "scope");
        k0.q((Object)s$b, "event");
        y.getLifecycle().a((x)new ScopeObserver(s$b, y, a));
    }
    
    public static /* synthetic */ void b(final y y, final a a, s$b on_DESTROY, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            on_DESTROY = s$b.ON_DESTROY;
        }
        a(y, a, on_DESTROY);
    }
    
    private static final a c(@e final y y, final String s, final l7.a a) {
        final a g = e(y).g(s, a);
        b(y, g, null, 2, null);
        return g;
    }
    
    @e
    public static final a d(@e final y y) {
        k0.q((Object)y, "$this$currentScope");
        return f(y);
    }
    
    private static final org.koin.core.a e(@e final y y) {
        if (y != null) {
            return org.koin.android.ext.android.a.e((ComponentCallbacks)y);
        }
        throw new p1("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }
    
    private static final a f(@e final y y) {
        final String g = g(y);
        final a a = e(y).A(g);
        a c;
        if (a != null) {
            c = a;
        }
        else {
            c = c(y, g, h(y));
        }
        return c;
    }
    
    private static final String g(@e final y y) {
        final StringBuilder sb = new StringBuilder();
        sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)y.getClass())));
        sb.append("@");
        sb.append(System.identityHashCode(y));
        return sb.toString();
    }
    
    private static final l7.d h(@e final y y) {
        return new l7.d((d<?>)k1.d((Class)y.getClass()));
    }
}
