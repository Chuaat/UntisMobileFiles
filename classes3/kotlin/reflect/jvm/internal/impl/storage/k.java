// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.w;
import java.util.concurrent.locks.Lock;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public interface k
{
    @e
    public static final a a = k.a.a;
    
    void lock();
    
    void unlock();
    
    public static final class a
    {
        static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        public final d a(@f final Runnable runnable, @f final l<? super InterruptedException, j2> l) {
            d d;
            if (runnable != null && l != null) {
                d = new c(runnable, l);
            }
            else {
                d = new d(null, 1, null);
            }
            return d;
        }
    }
}
