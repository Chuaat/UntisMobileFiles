// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import kotlinx.coroutines.w2;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "", "allFactories", "Lkotlinx/coroutines/w2;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public interface MainDispatcherFactory
{
    @e
    w2 createDispatcher(@e final List<? extends MainDispatcherFactory> p0);
    
    int getLoadPriority();
    
    @f
    String hintOnError();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        @f
        public static String a(@e final MainDispatcherFactory mainDispatcherFactory) {
            return null;
        }
    }
}
