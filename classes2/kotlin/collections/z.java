// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import o6.a;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import org.jetbrains.annotations.e;
import java.util.Enumeration;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¨\u0006\u0004" }, d2 = { "T", "Ljava/util/Enumeration;", "", "f0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class z extends y
{
    public z() {
    }
    
    @e
    public static <T> Iterator<T> f0(@e final Enumeration<T> enumeration) {
        k0.p(enumeration, "$this$iterator");
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }
            
            @Override
            public T next() {
                return enumeration.nextElement();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
