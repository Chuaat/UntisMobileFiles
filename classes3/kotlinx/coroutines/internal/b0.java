// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.w2;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/internal/b0;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "allFactories", "Lkotlinx/coroutines/w2;", "createDispatcher", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public final class b0 implements MainDispatcherFactory
{
    @e
    public static final b0 a;
    
    static {
        a = new b0();
    }
    
    private b0() {
    }
    
    @e
    @Override
    public w2 createDispatcher(@e final List<? extends MainDispatcherFactory> list) {
        return new a0(null, null, 2, null);
    }
    
    @Override
    public int getLoadPriority() {
        return -1;
    }
    
    @f
    @Override
    public String hintOnError() {
        return MainDispatcherFactory.a.a(this);
    }
}
