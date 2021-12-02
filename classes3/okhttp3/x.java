// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.jvm.internal.k0;
import n6.l;
import org.jetbrains.annotations.f;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00e6\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lokhttp3/x;", "", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface x
{
    public static final b a = b.a;
    
    @e
    g0 intercept(@e final a p0) throws IOException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0014\u001a\u00020\u000bH&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0016" }, d2 = { "okhttp3/x$a", "", "Lokhttp3/e0;", "k", "request", "Lokhttp3/g0;", "e", "Lokhttp3/j;", "f", "Lokhttp3/e;", "call", "", "h", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "Lokhttp3/x$a;", "d", "b", "g", "c", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        @e
        a a(final int p0, @e final TimeUnit p1);
        
        int b();
        
        int c();
        
        @e
        okhttp3.e call();
        
        @e
        a d(final int p0, @e final TimeUnit p1);
        
        @e
        g0 e(@e final e0 p0) throws IOException;
        
        @f
        j f();
        
        @e
        a g(final int p0, @e final TimeUnit p1);
        
        int h();
        
        @e
        e0 k();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\n\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r" }, d2 = { "okhttp3/x$b", "", "Lkotlin/Function1;", "Lokhttp3/x$a;", "Lkotlin/t0;", "name", "chain", "Lokhttp3/g0;", "block", "Lokhttp3/x;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        static final /* synthetic */ b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        @e
        public final x a(@e final l<? super a, g0> l) {
            k0.p((Object)l, "block");
            return new x() {
                @e
                @Override
                public final g0 intercept(@e final a a) {
                    k0.p((Object)a, "it");
                    return (g0)l.invoke((Object)a);
                }
            };
        }
    }
}
