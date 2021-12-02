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
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.i;

public class k extends i
{
    private ServiceWorkerWebSettings a;
    private ServiceWorkerWebSettingsBoundaryInterface b;
    
    public k(@j0 final ServiceWorkerWebSettings a) {
        this.a = a;
    }
    
    public k(@j0 final InvocationHandler invocationHandler) {
        this.b = (ServiceWorkerWebSettingsBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
    
    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.b == null) {
            this.b = (ServiceWorkerWebSettingsBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)ServiceWorkerWebSettingsBoundaryInterface.class, v.c().d(this.a));
        }
        return this.b;
    }
    
    @p0(24)
    private ServiceWorkerWebSettings j() {
        if (this.a == null) {
            this.a = v.c().c(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean a() {
        final u v = u.V;
        if (v.j()) {
            return this.j().getAllowContentAccess();
        }
        if (v.k()) {
            return this.i().getAllowContentAccess();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean b() {
        final u w = u.W;
        if (w.j()) {
            return this.j().getAllowFileAccess();
        }
        if (w.k()) {
            return this.i().getAllowFileAccess();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean c() {
        final u x = u.X;
        if (x.j()) {
            return this.j().getBlockNetworkLoads();
        }
        if (x.k()) {
            return this.i().getBlockNetworkLoads();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public int d() {
        final u u = androidx.webkit.internal.u.U;
        if (u.j()) {
            return this.j().getCacheMode();
        }
        if (u.k()) {
            return this.i().getCacheMode();
        }
        throw androidx.webkit.internal.u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void e(final boolean b) {
        final u v = u.V;
        if (v.j()) {
            this.j().setAllowContentAccess(b);
        }
        else {
            if (!v.k()) {
                throw u.f();
            }
            this.i().setAllowContentAccess(b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void f(final boolean b) {
        final u w = u.W;
        if (w.j()) {
            this.j().setAllowFileAccess(b);
        }
        else {
            if (!w.k()) {
                throw u.f();
            }
            this.i().setAllowFileAccess(b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void g(final boolean b) {
        final u x = u.X;
        if (x.j()) {
            this.j().setBlockNetworkLoads(b);
        }
        else {
            if (!x.k()) {
                throw u.f();
            }
            this.i().setBlockNetworkLoads(b);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void h(final int n) {
        final u u = androidx.webkit.internal.u.U;
        if (u.j()) {
            this.j().setCacheMode(n);
        }
        else {
            if (!u.k()) {
                throw androidx.webkit.internal.u.f();
            }
            this.i().setCacheMode(n);
        }
    }
}
