// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import androidx.annotation.k0;
import android.os.Handler;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.webkit.WebMessagePort;
import androidx.annotation.t0;

public abstract class m
{
    @t0({ t0.a.G })
    public m() {
    }
    
    public abstract void a();
    
    @j0
    @p0(23)
    @t0({ t0.a.G })
    public abstract WebMessagePort b();
    
    @j0
    @t0({ t0.a.G })
    public abstract InvocationHandler c();
    
    public abstract void d(@j0 final l p0);
    
    public abstract void e(@k0 final Handler p0, @j0 final a p1);
    
    public abstract void f(@j0 final a p0);
    
    public abstract static class a
    {
        public void a(@j0 final m m, @k0 final l l) {
        }
    }
}
