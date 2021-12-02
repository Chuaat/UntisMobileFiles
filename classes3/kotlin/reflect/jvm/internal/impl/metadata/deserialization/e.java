// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

public final class e
{
    @f
    public static final <M extends i.d<M>, T> T a(@org.jetbrains.annotations.e final i.d<M> d, @org.jetbrains.annotations.e final i.g<M, T> g) {
        k0.p((Object)d, "<this>");
        k0.p((Object)g, "extension");
        T v;
        if (d.y(g)) {
            v = d.v(g);
        }
        else {
            v = null;
        }
        return v;
    }
    
    @f
    public static final <M extends i.d<M>, T> T b(@org.jetbrains.annotations.e final i.d<M> d, @org.jetbrains.annotations.e final i.g<M, List<T>> g, final int n) {
        k0.p((Object)d, "<this>");
        k0.p((Object)g, "extension");
        T w;
        if (n < d.x(g)) {
            w = d.w(g, n);
        }
        else {
            w = null;
        }
        return w;
    }
}
