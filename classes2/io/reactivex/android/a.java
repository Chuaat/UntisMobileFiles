// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.c;

public abstract class a implements c
{
    private final AtomicBoolean G;
    
    public a() {
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
    public final void dispose() {
        if (this.G.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a();
            }
            else {
                io.reactivex.android.schedulers.a.c().e(new Runnable() {
                    @Override
                    public void run() {
                        a.this.a();
                    }
                });
            }
        }
    }
    
    @Override
    public final boolean i() {
        return this.G.get();
    }
}
