// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n" }, d2 = { "Lokhttp3/o;", "", "Lokhttp3/w;", "url", "", "Lokhttp3/n;", "cookies", "Lkotlin/j2;", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface o
{
    @d
    @e
    public static final o a = new a.a();
    public static final a b = new a(null);
    
    void a(@e final okhttp3.w p0, @e final List<n> p1);
    
    @e
    List<n> b(@e final okhttp3.w p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b" }, d2 = { "okhttp3/o$a", "", "Lokhttp3/o;", "NO_COOKIES", "Lokhttp3/o;", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f" }, d2 = { "okhttp3/o$a$a", "Lokhttp3/o;", "Lokhttp3/w;", "url", "", "Lokhttp3/n;", "cookies", "Lkotlin/j2;", "a", "b", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        private static final class a implements o
        {
            public a() {
            }
            
            @Override
            public void a(@e final okhttp3.w w, @e final List<n> list) {
                k0.p((Object)w, "url");
                k0.p((Object)list, "cookies");
            }
            
            @e
            @Override
            public List<n> b(@e final okhttp3.w w) {
                k0.p((Object)w, "url");
                return (List<n>)v.E();
            }
        }
    }
}
