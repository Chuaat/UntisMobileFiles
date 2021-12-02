// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.util.Iterator;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0006\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lkotlin/collections/g0;", "", "", "a", "()Ljava/lang/Double;", "b", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class g0 implements Iterator<Double>, a
{
    @e
    public final Double a() {
        return this.b();
    }
    
    public abstract double b();
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
