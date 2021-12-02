// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R.\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Landroidx/navigation/p;", "", "Landroidx/navigation/o;", "a", "", "value", "c", "Z", "()Z", "f", "(Z)V", "nullable", "Landroidx/navigation/s0;", "b", "Landroidx/navigation/s0;", "_type", "Landroidx/navigation/o$a;", "Landroidx/navigation/o$a;", "builder", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "defaultValue", "()Landroidx/navigation/s0;", "g", "(Landroidx/navigation/s0;)V", "type", "<init>", "()V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class p
{
    private final o.a a;
    private s0<?> b;
    private boolean c;
    @f
    private Object d;
    
    public p() {
        this.a = new o.a();
    }
    
    @e
    public final o a() {
        final o a = this.a.a();
        k0.h((Object)a, "builder.build()");
        return a;
    }
    
    @f
    public final Object b() {
        return this.d;
    }
    
    public final boolean c() {
        return this.c;
    }
    
    @e
    public final s0<?> d() {
        final s0<?> b = this.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }
    
    public final void e(@f final Object d) {
        this.d = d;
        this.a.b(d);
    }
    
    public final void f(final boolean c) {
        this.c = c;
        this.a.c(c);
    }
    
    public final void g(@e final s0<?> b) {
        k0.q((Object)b, "value");
        this.b = b;
        this.a.d(b);
    }
}
