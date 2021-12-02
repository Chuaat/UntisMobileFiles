// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.e1;
import kotlin.Metadata;
import o6.h;
import java.util.Set;
import java.util.AbstractSet;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lkotlin/collections/i;", "E", "", "Ljava/util/AbstractSet;", "element", "", "add", "(Ljava/lang/Object;)Z", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class i<E> extends AbstractSet<E> implements Set<E>, h
{
    protected i() {
    }
    
    @Override
    public abstract boolean add(final E p0);
    
    public abstract int b();
    
    @Override
    public final /* bridge */ int size() {
        return this.b();
    }
}
