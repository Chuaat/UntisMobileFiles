// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import okio.n;
import okio.r0;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.f;
import okio.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0016J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0\u001cH\u0016¨\u0006$" }, d2 = { "Lokhttp3/tls/internal/der/j;", "T", "", "Lokhttp3/tls/internal/der/k;", "header", "", "a", "Lokhttp3/tls/internal/der/l;", "reader", "b", "(Lokhttp3/tls/internal/der/l;)Ljava/lang/Object;", "Lokio/p;", "byteString", "c", "(Lokio/p;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/m;", "writer", "value", "Lkotlin/j2;", "h", "(Lokhttp3/tls/internal/der/m;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Lokio/p;", "", "tagClass", "", "tag", "forceConstructed", "Lokhttp3/tls/internal/der/f;", "d", "(IJLjava/lang/Boolean;)Lokhttp3/tls/internal/der/f;", "", "name", "", "g", "e", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public interface j<T>
{
    boolean a(@e final k p0);
    
    T b(@e final l p0);
    
    T c(@e final p p0);
    
    @e
    okhttp3.tls.internal.der.f<T> d(final int p0, final long p1, @f final Boolean p2);
    
    @e
    okhttp3.tls.internal.der.f<List<T>> e();
    
    @e
    p f(final T p0);
    
    @e
    okhttp3.tls.internal.der.f<List<T>> g(@e final String p0, final int p1, final long p2);
    
    void h(@e final m p0, final T p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 0 })
    public static final class a
    {
        @e
        public static <T> okhttp3.tls.internal.der.f<List<T>> a(@e final j<T> j, @e final String s, final int n, final long n2) {
            k0.p((Object)s, "name");
            return new okhttp3.tls.internal.der.f<List<T>>(s, n, n2, (okhttp3.tls.internal.der.f.a)new okhttp3.tls.internal.der.f.a<List<? extends T>>() {
                @e
                public List<T> c(@e final l l) {
                    k0.p((Object)l, "reader");
                    final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<T>();
                    while (l.l()) {
                        list.add(j.b(l));
                    }
                    return (List<T>)list;
                }
                
                public void d(@e final m m, @e final List<? extends T> list) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)list, "value");
                    final Iterator<? extends T> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        j.h(m, iterator.next());
                    }
                }
            }, false, null, false, 112, null);
        }
        
        @e
        public static <T> okhttp3.tls.internal.der.f<List<T>> c(@e final j<T> j) {
            return j.g("SET OF", 0, 17L);
        }
        
        public static <T> T d(@e final j<T> j, @e final p p2) {
            k0.p((Object)p2, "byteString");
            return j.b(new l(new okio.m().p0(p2)));
        }
        
        @e
        public static <T> p e(@e final j<T> j, final T t) {
            final okio.m m = new okio.m();
            j.h(new m(m), t);
            return m.D3();
        }
        
        @e
        public static <T> okhttp3.tls.internal.der.f<T> f(@e final j<T> j, final int n, final long n2, @f final Boolean b) {
            return new okhttp3.tls.internal.der.f<T>("EXPLICIT", n, n2, (okhttp3.tls.internal.der.f.a)new okhttp3.tls.internal.der.f.a<T>() {
                final /* synthetic */ Boolean b;
                
                @Override
                public T a(@e final l l) {
                    k0.p((Object)l, "reader");
                    return j.b(l);
                }
                
                @Override
                public void b(@e final m m, final T t) {
                    k0.p((Object)m, "writer");
                    j.h(m, t);
                    final Boolean b = this.b;
                    if (b != null) {
                        m.c(b);
                    }
                }
            }, false, null, false, 112, null);
        }
    }
}
