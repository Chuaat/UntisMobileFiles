// 
// Decompiled by Procyon v0.5.36
// 

package androidx.arch.core.executor;

import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;
import androidx.annotation.k0;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class b extends c
{
    private final Object a;
    private final ExecutorService b;
    @k0
    private volatile Handler c;
    
    public b() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new ThreadFactory() {
            private static final String I = "arch_disk_io_%d";
            private final AtomicInteger G = new AtomicInteger(0);
            
            @Override
            public Thread newThread(final Runnable target) {
                final Thread thread = new Thread(target);
                thread.setName(String.format("arch_disk_io_%d", this.G.getAndIncrement()));
                return thread;
            }
        });
    }
    
    private static Handler e(@j0 final Looper looper) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return Handler.createAsync(looper);
        }
        if (sdk_INT < 16) {
            goto Label_0083;
        }
        try {
            return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        }
        catch (InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            goto Label_0083;
        }
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.b.execute(runnable);
    }
    
    @Override
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    @Override
    public void d(final Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = e(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }
}
