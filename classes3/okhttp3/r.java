// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.List;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lokhttp3/r;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface r
{
    @d
    @e
    public static final r a = new a.a();
    public static final a b = new a(null);
    
    @e
    List<InetAddress> a(@e final String p0) throws UnknownHostException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b" }, d2 = { "okhttp3/r$a", "", "Lokhttp3/r;", "SYSTEM", "Lokhttp3/r;", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t" }, d2 = { "okhttp3/r$a$a", "Lokhttp3/r;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        private static final class a implements r
        {
            public a() {
            }
            
            @e
            @Override
            public List<InetAddress> a(@e final String s) {
                k0.p((Object)s, "hostname");
                try {
                    final InetAddress[] allByName = InetAddress.getAllByName(s);
                    k0.o((Object)allByName, "InetAddress.getAllByName(hostname)");
                    return (List<InetAddress>)m.ey((Object[])allByName);
                }
                catch (NullPointerException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Broken system behaviour for dns lookup of ");
                    sb.append(s);
                    final UnknownHostException ex = new UnknownHostException(sb.toString());
                    ex.initCause(cause);
                    throw ex;
                }
            }
        }
    }
}
