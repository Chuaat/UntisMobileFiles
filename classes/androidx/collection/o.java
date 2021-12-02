// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import java.util.Iterator;
import kotlin.i;
import kotlin.collections.t0;
import n6.a;
import kotlin.j2;
import n6.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a/\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aQ\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0086\b\u001a\u0016\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"$\u0010 \u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!" }, d2 = { "T", "Landroidx/collection/n;", "", "key", "", "a", "value", "Lkotlin/j2;", "j", "(Landroidx/collection/n;ILjava/lang/Object;)V", "other", "h", "defaultValue", "c", "(Landroidx/collection/n;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "d", "(Landroidx/collection/n;ILn6/a;)Ljava/lang/Object;", "f", "i", "(Landroidx/collection/n;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "b", "Lkotlin/collections/t0;", "g", "", "k", "e", "(Landroidx/collection/n;)I", "size", "collection-ktx" }, k = 2, mv = { 1, 4, 0 })
public final class o
{
    public static final <T> boolean a(@e final n<T> n, final int n2) {
        k0.q((Object)n, "receiver$0");
        return n.d(n2);
    }
    
    public static final <T> void b(@e final n<T> n, @e final p<? super Integer, ? super T, j2> p2) {
        k0.q((Object)n, "receiver$0");
        k0.q((Object)p2, "action");
        for (int c = n.C(), i = 0; i < c; ++i) {
            p2.invoke((Object)n.r(i), (Object)n.D(i));
        }
    }
    
    public static final <T> T c(@e final n<T> n, final int n2, final T t) {
        k0.q((Object)n, "receiver$0");
        return n.l(n2, t);
    }
    
    public static final <T> T d(@e final n<T> n, final int n2, @e final a<? extends T> a) {
        k0.q((Object)n, "receiver$0");
        k0.q((Object)a, "defaultValue");
        Object o = n.j(n2);
        if (o == null) {
            o = a.invoke();
        }
        return (T)o;
    }
    
    public static final <T> int e(@e final n<T> n) {
        k0.q((Object)n, "receiver$0");
        return n.C();
    }
    
    public static final <T> boolean f(@e final n<T> n) {
        k0.q((Object)n, "receiver$0");
        return n.q() ^ true;
    }
    
    @e
    public static final <T> t0 g(@e final n<T> n) {
        k0.q((Object)n, "receiver$0");
        return new t0() {
            private int G;
            
            public int b() {
                return n.r(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < n.C();
            }
        };
    }
    
    @e
    public static final <T> n<T> h(@e final n<T> n, @e final n<T> n2) {
        k0.q((Object)n, "receiver$0");
        k0.q((Object)n2, "other");
        final n n3 = new n(n.C() + n2.C());
        n3.t(n);
        n3.t(n2);
        return (n<T>)n3;
    }
    
    @i(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean i(@e final n<T> n, final int n2, final T t) {
        k0.q((Object)n, "receiver$0");
        return n.w(n2, t);
    }
    
    public static final <T> void j(@e final n<T> n, final int n2, final T t) {
        k0.q((Object)n, "receiver$0");
        n.s(n2, t);
    }
    
    @e
    public static final <T> Iterator<T> k(@e final n<T> n) {
        k0.q((Object)n, "receiver$0");
        return new Iterator<T>() {
            private int G;
            
            public final int a() {
                return this.G;
            }
            
            public final void b(final int g) {
                this.G = g;
            }
            
            @Override
            public boolean hasNext() {
                return this.G < n.C();
            }
            
            @Override
            public T next() {
                return n.D(this.G++);
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
