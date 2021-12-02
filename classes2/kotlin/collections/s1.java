// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.e1;
import kotlin.k;
import kotlin.i;
import kotlin.Metadata;
import o6.a;
import kotlin.q1;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\b" }, d2 = { "Lkotlin/collections/s1;", "", "Lkotlin/q1;", "a", "()B", "b", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@i(level = k.H, message = "This class is not going to be stabilized and is to be removed soon.")
@e1(version = "1.3")
public abstract class s1 implements Iterator<q1>, a
{
    public final byte a() {
        return this.b();
    }
    
    public abstract byte b();
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
