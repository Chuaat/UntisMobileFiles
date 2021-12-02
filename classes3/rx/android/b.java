// 
// Decompiled by Procyon v0.5.36
// 

package rx.android;

import rx.android.schedulers.a;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;

public abstract class b implements o
{
    private final AtomicBoolean G;
    
    public b() {
        this.G = new AtomicBoolean();
    }
    
    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        throw new IllegalStateException(sb.toString());
    }
    
    protected abstract void a();
    
    @Override
    public final boolean g() {
        return this.G.get();
    }
    
    @Override
    public final void i() {
        if (this.G.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a();
            }
            else {
                a.c().a().c(new rx.functions.a() {
                    @Override
                    public void call() {
                        b.this.a();
                    }
                });
            }
        }
    }
}
