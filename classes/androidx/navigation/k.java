// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import android.os.Bundle;
import androidx.core.os.b;
import java.util.Arrays;
import kotlin.p1;
import kotlin.s0;
import kotlin.collections.y0;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d" }, d2 = { "Landroidx/navigation/k;", "", "Lkotlin/Function1;", "Landroidx/navigation/p0;", "Lkotlin/j2;", "Lkotlin/s;", "optionsBuilder", "d", "Landroidx/navigation/j;", "a", "()Landroidx/navigation/j;", "", "I", "c", "()I", "e", "(I)V", "destinationId", "Landroidx/navigation/o0;", "Landroidx/navigation/o0;", "navOptions", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "defaultArguments", "<init>", "()V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    private int a;
    @e
    private final Map<String, Object> b;
    private o0 c;
    
    public k() {
        this.b = new LinkedHashMap<String, Object>();
    }
    
    @e
    public final j a() {
        final int a = this.a;
        final o0 c = this.c;
        Bundle a2;
        if (this.b.isEmpty()) {
            a2 = null;
        }
        else {
            final Object[] array = y0.F1((Map)this.b).toArray(new s0[0]);
            if (array == null) {
                throw new p1("null cannot be cast to non-null type kotlin.Array<T>");
            }
            final s0<String, ?>[] original = (s0<String, ?>[])array;
            a2 = androidx.core.os.b.a((s0<String, ?>[])Arrays.copyOf(original, original.length));
        }
        return new j(a, c, a2);
    }
    
    @e
    public final Map<String, Object> b() {
        return this.b;
    }
    
    public final int c() {
        return this.a;
    }
    
    public final void d(@e final l<? super p0, j2> l) {
        k0.q((Object)l, "optionsBuilder");
        final p0 p = new p0();
        l.invoke((Object)p);
        this.c = p.b();
    }
    
    public final void e(final int a) {
        this.a = a;
    }
}
