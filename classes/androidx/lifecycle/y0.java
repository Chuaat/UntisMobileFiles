// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.a;
import kotlin.reflect.d;
import kotlin.Metadata;
import kotlin.b0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0017" }, d2 = { "Landroidx/lifecycle/y0;", "Landroidx/lifecycle/w0;", "VM", "Lkotlin/b0;", "", "a", "Lkotlin/reflect/d;", "H", "Lkotlin/reflect/d;", "viewModelClass", "b", "()Landroidx/lifecycle/w0;", "value", "G", "Landroidx/lifecycle/w0;", "cached", "Lkotlin/Function0;", "Landroidx/lifecycle/c1;", "storeProducer", "Landroidx/lifecycle/z0$b;", "factoryProducer", "<init>", "(Lkotlin/reflect/d;Ln6/a;Ln6/a;)V", "lifecycle-viewmodel-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class y0<VM extends w0> implements b0<VM>
{
    private VM G;
    private final d<VM> H;
    private final a<c1> I;
    private final a<z0.b> J;
    
    public y0(@e final d<VM> h, @e final a<? extends c1> i, @e final a<? extends z0.b> j) {
        k0.q((Object)h, "viewModelClass");
        k0.q((Object)i, "storeProducer");
        k0.q((Object)j, "factoryProducer");
        this.H = h;
        this.I = (a<c1>)i;
        this.J = (a<z0.b>)j;
    }
    
    public boolean a() {
        return this.G != null;
    }
    
    @e
    public VM b() {
        w0 g;
        if ((g = this.G) == null) {
            g = new z0((c1)this.I.invoke(), (z0.b)this.J.invoke()).a((Class<VM>)m6.a.c((d)this.H));
            k0.h((Object)(this.G = (VM)g), "ViewModelProvider(store,\u2026ed = it\n                }");
        }
        return (VM)g;
    }
}
