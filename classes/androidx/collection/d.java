// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "T", "Landroidx/collection/c;", "a", "", "values", "b", "([Ljava/lang/Object;)Landroidx/collection/c;", "collection-ktx" }, k = 2, mv = { 1, 4, 0 })
public final class d
{
    @e
    public static final <T> c<T> a() {
        return new c<T>();
    }
    
    @e
    public static final <T> c<T> b(@e final T... array) {
        k0.q((Object)array, "values");
        final c<T> c = new c<T>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            c.add(array[i]);
        }
        return c;
    }
}
