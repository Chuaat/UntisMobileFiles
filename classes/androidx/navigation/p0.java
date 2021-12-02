// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import androidx.annotation.y;
import kotlin.Metadata;

@r0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J)\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007J\u001f\u0010\f\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007J\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006$" }, d2 = { "Landroidx/navigation/p0;", "", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/y0;", "Lkotlin/j2;", "Lkotlin/s;", "popUpToBuilder", "e", "Landroidx/navigation/h;", "animBuilder", "a", "Landroidx/navigation/o0;", "b", "()Landroidx/navigation/o0;", "", "Z", "c", "()Z", "f", "(Z)V", "launchSingleTop", "value", "I", "d", "()I", "g", "(I)V", "popUpTo", "inclusive", "Landroidx/navigation/o0$a;", "Landroidx/navigation/o0$a;", "builder", "<init>", "()V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class p0
{
    private final o0.a a;
    private boolean b;
    @y
    private int c;
    private boolean d;
    
    public p0() {
        this.a = new o0.a();
        this.c = -1;
    }
    
    public final void a(@e final l<? super h, j2> l) {
        k0.q((Object)l, "animBuilder");
        final h h = new h();
        l.invoke((Object)h);
        this.a.b(h.a()).c(h.b()).e(h.c()).f(h.d());
    }
    
    @e
    public final o0 b() {
        final o0.a a = this.a;
        a.d(this.b);
        a.g(this.c, this.d);
        final o0 a2 = a.a();
        k0.h((Object)a2, "builder.apply {\n        \u2026 inclusive)\n    }.build()");
        return a2;
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final int d() {
        return this.c;
    }
    
    public final void e(@y final int n, @e final l<? super y0, j2> l) {
        k0.q((Object)l, "popUpToBuilder");
        this.g(n);
        final y0 y0 = new y0();
        l.invoke((Object)y0);
        this.d = y0.a();
    }
    
    public final void f(final boolean b) {
        this.b = b;
    }
    
    public final void g(final int c) {
        this.c = c;
        this.d = false;
    }
}
