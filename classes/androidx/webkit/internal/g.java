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
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import android.webkit.SafeBrowsingResponse;
import androidx.webkit.e;

public class g extends e
{
    private SafeBrowsingResponse a;
    private SafeBrowsingResponseBoundaryInterface b;
    
    public g(@j0 final SafeBrowsingResponse a) {
        this.a = a;
    }
    
    public g(@j0 final InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }
    
    private SafeBrowsingResponseBoundaryInterface d() {
        if (this.b == null) {
            this.b = (SafeBrowsingResponseBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)SafeBrowsingResponseBoundaryInterface.class, v.c().b(this.a));
        }
        return this.b;
    }
    
    @p0(27)
    private SafeBrowsingResponse e() {
        if (this.a == null) {
            this.a = v.c().a(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void a(final boolean b) {
        final u g0 = u.g0;
        if (g0.j()) {
            this.e().backToSafety(b);
        }
        else {
            if (!g0.k()) {
                throw u.f();
            }
            this.d().backToSafety(b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void b(final boolean b) {
        final u h0 = u.h0;
        if (h0.j()) {
            this.e().proceed(b);
        }
        else {
            if (!h0.k()) {
                throw u.f();
            }
            this.d().proceed(b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void c(final boolean b) {
        final u i0 = u.i0;
        if (i0.j()) {
            this.e().showInterstitial(b);
        }
        else {
            if (!i0.k()) {
                throw u.f();
            }
            this.d().showInterstitial(b);
        }
    }
}
