// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.e1;
import kotlin.Metadata;
import o6.e;
import java.util.List;
import java.util.AbstractList;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lkotlin/collections/g;", "E", "", "Ljava/util/AbstractList;", "", "index", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "f", "(I)Ljava/lang/Object;", "Lkotlin/j2;", "add", "(ILjava/lang/Object;)V", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class g<E> extends AbstractList<E> implements List<E>, e
{
    protected g() {
    }
    
    @Override
    public abstract void add(final int p0, final E p1);
    
    public abstract int b();
    
    public abstract E f(final int p0);
    
    @Override
    public final /* bridge */ E remove(final int n) {
        return this.f(n);
    }
    
    @Override
    public abstract E set(final int p0, final E p1);
    
    @Override
    public final /* bridge */ int size() {
        return this.b();
    }
}
