// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.m0;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006" }, d2 = { "Lkotlinx/coroutines/channels/o;", "E", "Lkotlinx/coroutines/channels/l0;", "Lkotlinx/coroutines/channels/h0;", "u", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface o<E> extends l0<E>, h0<E>
{
    @e
    public static final String A = "kotlinx.coroutines.channels.defaultBuffer";
    @e
    public static final b u = b.h;
    public static final int v = Integer.MAX_VALUE;
    public static final int w = 0;
    public static final int x = -1;
    public static final int y = -2;
    public static final int z = -3;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0017" }, d2 = { "kotlinx/coroutines/channels/o$b", "", "", "b", "I", "RENDEZVOUS", "c", "CONFLATED", "a", "UNLIMITED", "", "f", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "g", "()I", "CHANNEL_DEFAULT_CAPACITY", "d", "BUFFERED", "e", "OPTIONAL_CHANNEL", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class b
    {
        public static final int a = Integer.MAX_VALUE;
        public static final int b = 0;
        public static final int c = -1;
        public static final int d = -2;
        public static final int e = -3;
        @e
        public static final String f = "kotlinx.coroutines.channels.defaultBuffer";
        private static final int g;
        static final /* synthetic */ b h;
        
        static {
            h = new b();
            g = m0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);
        }
        
        private b() {
        }
        
        public final int a() {
            return o.b.g;
        }
    }
}
