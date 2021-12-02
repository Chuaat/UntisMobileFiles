// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.jvm.internal.k0;
import java.io.IOException;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00e6\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t" }, d2 = { "Lokhttp3/b;", "", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface b
{
    @d
    @e
    public static final b a = new a.a();
    @d
    @e
    public static final b b = new okhttp3.internal.authenticator.b(null, 1, null);
    public static final a c = new a(null);
    
    @f
    e0 a(@f final i0 p0, @e final g0 p1) throws IOException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t" }, d2 = { "okhttp3/b$a", "", "Lokhttp3/b;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/b;", "NONE", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n" }, d2 = { "okhttp3/b$a$a", "Lokhttp3/b;", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        private static final class a implements b
        {
            public a() {
            }
            
            @f
            @Override
            public e0 a(@f final i0 i0, @e final g0 g0) {
                k0.p((Object)g0, "response");
                return null;
            }
        }
    }
}
