// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import android.annotation.SuppressLint;
import androidx.annotation.p0;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.util.a;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import android.webkit.WebResourceError;
import androidx.webkit.n;

public class r extends n
{
    private WebResourceError a;
    private WebResourceErrorBoundaryInterface b;
    
    public r(@j0 final WebResourceError a) {
        this.a = a;
    }
    
    public r(@j0 final InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebResourceErrorBoundaryInterface.class, invocationHandler);
    }
    
    private WebResourceErrorBoundaryInterface c() {
        if (this.b == null) {
            this.b = (WebResourceErrorBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebResourceErrorBoundaryInterface.class, v.c().i(this.a));
        }
        return this.b;
    }
    
    @p0(23)
    private WebResourceError d() {
        if (this.a == null) {
            this.a = v.c().h(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
    
    @SuppressLint({ "NewApi" })
    @j0
    @Override
    public CharSequence a() {
        final u e0 = u.e0;
        if (e0.j()) {
            return this.d().getDescription();
        }
        if (e0.k()) {
            return this.c().getDescription();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public int b() {
        final u f0 = u.f0;
        if (f0.j()) {
            return this.d().getErrorCode();
        }
        if (f0.k()) {
            return this.c().getErrorCode();
        }
        throw u.f();
    }
}
