// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils.taskexecutor;

import android.os.Looper;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import android.os.Handler;
import androidx.work.impl.utils.j;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b implements a
{
    private final j a;
    private final Handler b;
    private final Executor c;
    
    public b(@j0 final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new Executor() {
            @Override
            public void execute(@j0 final Runnable runnable) {
                androidx.work.impl.utils.taskexecutor.b.this.a(runnable);
            }
        };
        this.a = new j(executor);
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.b.post(runnable);
    }
    
    @Override
    public Executor b() {
        return this.c;
    }
    
    @Override
    public void c(final Runnable runnable) {
        this.a.execute(runnable);
    }
    
    @j0
    @Override
    public j d() {
        return this.a;
    }
}
