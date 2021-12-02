// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import n6.l;
import kotlin.coroutines.g$c;
import kotlin.q;
import kotlin.coroutines.b;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0016\u0010\b\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/m0;", "Ljava/io/Closeable;", "Lkotlin/j2;", "close", "Ljava/util/concurrent/Executor;", "M", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "H", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class v1 extends m0 implements Closeable
{
    @e
    public static final a H;
    
    static {
        H = new a(null);
    }
    
    @e
    public abstract Executor M();
    
    @Override
    public abstract void close();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "kotlinx/coroutines/v1$a", "Lkotlin/coroutines/b;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/v1;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    @q
    public static final class a extends b<m0, v1>
    {
        private a() {
            super((g$c)m0.G, (l)v1$a$a.G);
        }
    }
}
