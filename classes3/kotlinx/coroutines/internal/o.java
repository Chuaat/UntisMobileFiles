// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.w0;
import java.util.ArrayList;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import m6.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u00d6\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00f8\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/internal/o;", "E", "", "element", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/j2;", "action", "f", "(Ljava/lang/Object;Ln6/l;)V", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)I", "other", "", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "holder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@e
public final class o<E>
{
    private final Object a = a;
    
    @org.jetbrains.annotations.e
    public static Object b(@f final Object o) {
        return o;
    }
    
    public static boolean d(final Object o, final Object o2) {
        return o2 instanceof o && k0.g(o, ((o)o2).j());
    }
    
    public static final boolean e(final Object o, final Object o2) {
        return k0.g(o, o2);
    }
    
    public static final void f(final Object o, @org.jetbrains.annotations.e final l<? super E, j2> l) {
        if (o == null) {
            return;
        }
        if (!(o instanceof ArrayList)) {
            l.invoke(o);
        }
        else {
            final ArrayList list = (ArrayList)o;
            for (int i = list.size() - 1; i >= 0; --i) {
                l.invoke(list.get(i));
            }
        }
    }
    
    public static int g(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @org.jetbrains.annotations.e
    public static final Object h(Object e, final E e2) {
        if (w0.b() && !(e2 instanceof List ^ true)) {
            throw new AssertionError();
        }
        if (e == null) {
            e = b(e2);
        }
        else if (e instanceof ArrayList) {
            ((ArrayList)e).add(e2);
            e = b(e);
        }
        else {
            final ArrayList<E> list = new ArrayList<E>(4);
            list.add((E)e);
            list.add(e2);
            e = b(list);
        }
        return e;
    }
    
    public static String i(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("InlineList(holder=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        return d(this.a, o);
    }
    
    @Override
    public int hashCode() {
        return g(this.a);
    }
    
    public final /* synthetic */ Object j() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return i(this.a);
    }
}
