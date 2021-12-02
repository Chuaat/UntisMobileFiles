// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import androidx.webkit.internal.f;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import androidx.annotation.t0;

public abstract class c
{
    @t0({ t0.a.G })
    public c() {
    }
    
    @j0
    public static c b() {
        if (s.a("PROXY_OVERRIDE")) {
            return a.a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }
    
    public abstract void a(@j0 final Executor p0, @j0 final Runnable p1);
    
    public abstract void c(@j0 final b p0, @j0 final Executor p1, @j0 final Runnable p2);
    
    private static class a
    {
        static final c a;
        
        static {
            a = new f();
        }
    }
}
