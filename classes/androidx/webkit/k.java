// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import androidx.webkit.internal.l;
import java.util.concurrent.Executor;
import androidx.annotation.k0;
import java.io.OutputStream;
import androidx.annotation.j0;
import androidx.annotation.t0;

public abstract class k
{
    @t0({ t0.a.G })
    public k() {
    }
    
    @j0
    public static k a() {
        return a.a;
    }
    
    public abstract boolean b();
    
    public abstract void c(@j0 final j p0);
    
    public abstract boolean d(@k0 final OutputStream p0, @j0 final Executor p1);
    
    private static class a
    {
        static final k a;
        
        static {
            a = new l();
        }
    }
}
