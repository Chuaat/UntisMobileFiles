// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import androidx.annotation.g0;
import androidx.annotation.t0;
import androidx.annotation.j0;
import java.util.concurrent.atomic.AtomicReference;

public abstract class s
{
    @j0
    @t0({ t0.a.H })
    AtomicReference<Object> a;
    
    public s() {
        this.a = new AtomicReference<Object>();
    }
    
    @g0
    public abstract void a(@j0 final x p0);
    
    @g0
    @j0
    public abstract c b();
    
    @g0
    public abstract void c(@j0 final x p0);
    
    public enum b
    {
        ON_ANY, 
        ON_CREATE, 
        ON_DESTROY, 
        ON_PAUSE, 
        ON_RESUME, 
        ON_START, 
        ON_STOP;
        
        @k0
        public static b b(@j0 final c c) {
            final int n = s$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_DESTROY;
            }
            if (n == 2) {
                return b.ON_STOP;
            }
            if (n != 3) {
                return null;
            }
            return b.ON_PAUSE;
        }
        
        @k0
        public static b d(@j0 final c c) {
            final int n = s$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_STOP;
            }
            if (n == 2) {
                return b.ON_PAUSE;
            }
            if (n != 4) {
                return null;
            }
            return b.ON_DESTROY;
        }
        
        @k0
        public static b g(@j0 final c c) {
            final int n = s$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_START;
            }
            if (n == 2) {
                return b.ON_RESUME;
            }
            if (n != 5) {
                return null;
            }
            return b.ON_CREATE;
        }
        
        @k0
        public static b h(@j0 final c c) {
            final int n = s$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_CREATE;
            }
            if (n == 2) {
                return b.ON_START;
            }
            if (n != 3) {
                return null;
            }
            return b.ON_RESUME;
        }
        
        @j0
        public c f() {
            switch (s$a.b[this.ordinal()]) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new IllegalArgumentException(sb.toString());
                }
                case 6: {
                    return c.G;
                }
                case 5: {
                    return c.K;
                }
                case 3:
                case 4: {
                    return c.J;
                }
                case 1:
                case 2: {
                    return c.I;
                }
            }
        }
    }
    
    public enum c
    {
        G, 
        H, 
        I, 
        J, 
        K;
        
        public boolean b(@j0 final c o) {
            return this.compareTo(o) >= 0;
        }
    }
}
