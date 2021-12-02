// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.util.Collection;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001J\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d" }, d2 = { "Landroidx/navigation/f0;", "Landroidx/navigation/b0;", "Landroidx/navigation/e0;", "Landroidx/navigation/a0;", "D", "navDestination", "Lkotlin/j2;", "l", "n", "destination", "j", "k", "Landroidx/navigation/v0;", "h", "Landroidx/navigation/v0;", "m", "()Landroidx/navigation/v0;", "provider", "", "g", "Ljava/util/List;", "destinations", "", "i", "I", "startDestination", "id", "<init>", "(Landroidx/navigation/v0;II)V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public class f0 extends b0<e0>
{
    private final List<a0> g;
    @e
    private final v0 h;
    private int i;
    
    public f0(@e final v0 h, @y final int n, @y final int i) {
        k0.q((Object)h, "provider");
        final i0 d = h.d(i0.class);
        k0.h((Object)d, "getNavigator(clazz.java)");
        super(d, n);
        this.h = h;
        this.i = i;
        this.g = new ArrayList<a0>();
    }
    
    public final void j(@e final a0 a0) {
        k0.q((Object)a0, "destination");
        this.g.add(a0);
    }
    
    @e
    public e0 k() {
        final e0 e0 = super.c();
        e0.L(this.g);
        final int i = this.i;
        if (i != 0) {
            e0.U(i);
            return e0;
        }
        throw new IllegalStateException("You must set a startDestination");
    }
    
    public final <D extends a0> void l(@e final b0<? extends D> b0) {
        k0.q((Object)b0, "navDestination");
        this.g.add((a0)b0.c());
    }
    
    @e
    public final v0 m() {
        return this.h;
    }
    
    public final void n(@e final a0 a0) {
        k0.q((Object)a0, "$this$unaryPlus");
        this.j(a0);
    }
}
