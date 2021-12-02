// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import java.util.concurrent.RejectedExecutionException;
import androidx.core.util.n;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import android.os.Handler;

public final class f
{
    private f() {
    }
    
    @j0
    public static Executor a(@j0 final Handler handler) {
        return new a(handler);
    }
    
    private static class a implements Executor
    {
        private final Handler G;
        
        a(@j0 final Handler handler) {
            this.G = n.g(handler);
        }
        
        @Override
        public void execute(@j0 final Runnable runnable) {
            if (this.G.post((Runnable)n.g(runnable))) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(this.G);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }
}
