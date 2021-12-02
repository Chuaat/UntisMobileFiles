// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.os.CancellationSignal;

public final class c
{
    private boolean a;
    private a b;
    private Object c;
    private boolean d;
    
    private void f() {
        while (this.d) {
            try {
                this.wait();
            }
            catch (InterruptedException ex) {}
        }
    }
    
    public void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            final a b = this.b;
            final Object c = this.c;
            // monitorexit(this)
            Label_0051: {
                if (b == null) {
                    break Label_0051;
                }
                try {
                    b.onCancel();
                    break Label_0051;
                }
                finally {
                    synchronized (this) {
                        this.d = false;
                        this.notifyAll();
                    }
                    while (true) {
                        ((CancellationSignal)c).cancel();
                        break Label_0051;
                        continue;
                    }
                }
                // iftrue(Label_0093:, c == null || Build$VERSION.SDK_INT < 16)
            }
            synchronized (this) {
                this.d = false;
                this.notifyAll();
            }
        }
    }
    
    @k0
    public Object b() {
        if (Build$VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.c == null) {
                final CancellationSignal c = new CancellationSignal();
                this.c = c;
                if (this.a) {
                    c.cancel();
                }
            }
            return this.c;
        }
    }
    
    public boolean c() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public void d(@k0 final a b) {
        synchronized (this) {
            this.f();
            if (this.b == b) {
                return;
            }
            this.b = b;
            if (this.a && b != null) {
                // monitorexit(this)
                b.onCancel();
            }
        }
    }
    
    public void e() {
        if (!this.c()) {
            return;
        }
        throw new n();
    }
    
    public interface a
    {
        void onCancel();
    }
}
