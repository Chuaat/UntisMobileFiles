// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.j0;
import android.os.Handler;

public class t0
{
    private final a0 a;
    private final Handler b;
    private a c;
    
    public t0(@j0 final y y) {
        this.a = new a0(y);
        this.b = new Handler();
    }
    
    private void f(final s.b b) {
        final a c = this.c;
        if (c != null) {
            c.run();
        }
        final a c2 = new a(this.a, b);
        this.c = c2;
        this.b.postAtFrontOfQueue((Runnable)c2);
    }
    
    @j0
    public s a() {
        return this.a;
    }
    
    public void b() {
        this.f(s.b.ON_START);
    }
    
    public void c() {
        this.f(s.b.ON_CREATE);
    }
    
    public void d() {
        this.f(s.b.ON_STOP);
        this.f(s.b.ON_DESTROY);
    }
    
    public void e() {
        this.f(s.b.ON_START);
    }
    
    static class a implements Runnable
    {
        private final a0 G;
        final s.b H;
        private boolean I;
        
        a(@j0 final a0 g, final s.b h) {
            this.I = false;
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            if (!this.I) {
                this.G.j(this.H);
                this.I = true;
            }
        }
    }
}
