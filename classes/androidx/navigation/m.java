// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.p1;
import java.util.Arrays;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.os.Bundle;
import n6.a;
import kotlin.reflect.d;
import kotlin.Metadata;
import kotlin.b0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015" }, d2 = { "Landroidx/navigation/m;", "Landroidx/navigation/l;", "Args", "Lkotlin/b0;", "", "a", "G", "Landroidx/navigation/l;", "cached", "Lkotlin/reflect/d;", "H", "Lkotlin/reflect/d;", "navArgsClass", "b", "()Landroidx/navigation/l;", "value", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lkotlin/reflect/d;Ln6/a;)V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class m<Args extends l> implements b0<Args>
{
    private Args G;
    private final d<Args> H;
    private final a<Bundle> I;
    
    public m(@e final d<Args> h, @e final a<Bundle> i) {
        k0.q((Object)h, "navArgsClass");
        k0.q((Object)i, "argumentProducer");
        this.H = h;
        this.I = i;
    }
    
    public boolean a() {
        return this.G != null;
    }
    
    @e
    public Args b() {
        l g;
        if ((g = this.G) == null) {
            final Bundle bundle = (Bundle)this.I.invoke();
            Method method = n.a().get(this.H);
            if (method == null) {
                final Class c = m6.a.c((d)this.H);
                final Class<Bundle>[] b = n.b();
                method = c.getMethod("fromBundle", (Class[])Arrays.copyOf(b, b.length));
                n.a().put(this.H, method);
                k0.h((Object)method, "navArgsClass.java.getMet\u2026hod\n                    }");
            }
            final Object invoke = method.invoke(null, bundle);
            if (invoke == null) {
                throw new p1("null cannot be cast to non-null type Args");
            }
            g = (Args)invoke;
            this.G = (Args)g;
        }
        return (Args)g;
    }
}
