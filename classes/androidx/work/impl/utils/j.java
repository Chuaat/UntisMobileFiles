// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.annotation.b1;
import androidx.annotation.j0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class j implements Executor
{
    private final ArrayDeque<a> G;
    private final Executor H;
    private final Object I;
    private volatile Runnable J;
    
    public j(@j0 final Executor h) {
        this.H = h;
        this.G = new ArrayDeque<a>();
        this.I = new Object();
    }
    
    @b1
    @j0
    public Executor a() {
        return this.H;
    }
    
    public boolean b() {
        synchronized (this.I) {
            return !this.G.isEmpty();
        }
    }
    
    void c() {
        synchronized (this.I) {
            final a j = this.G.poll();
            this.J = j;
            if (j != null) {
                this.H.execute(this.J);
            }
        }
    }
    
    @Override
    public void execute(@j0 final Runnable runnable) {
        synchronized (this.I) {
            this.G.add(new a(this, runnable));
            if (this.J == null) {
                this.c();
            }
        }
    }
    
    static class a implements Runnable
    {
        final j G;
        final Runnable H;
        
        a(@j0 final j g, @j0 final Runnable h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            try {
                this.H.run();
            }
            finally {
                this.G.c();
            }
        }
    }
}
