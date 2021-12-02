// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.j0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class e3 implements Executor
{
    private final Executor G;
    private final ArrayDeque<Runnable> H;
    private Runnable I;
    
    e3(@j0 final Executor g) {
        this.H = new ArrayDeque<Runnable>();
        this.G = g;
    }
    
    void a() {
        synchronized (this) {
            final Runnable i = this.H.poll();
            this.I = i;
            if (i != null) {
                this.G.execute(i);
            }
        }
    }
    
    @Override
    public void execute(final Runnable runnable) {
        synchronized (this) {
            this.H.offer(new Runnable() {
                @Override
                public void run() {
                    try {
                        runnable.run();
                    }
                    finally {
                        e3.this.a();
                    }
                }
            });
            if (this.I == null) {
                this.a();
            }
        }
    }
}
