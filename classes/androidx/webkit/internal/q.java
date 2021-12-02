// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import android.webkit.WebMessagePort$WebMessageCallback;
import android.os.Handler;
import android.annotation.SuppressLint;
import java.lang.reflect.Proxy;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.webkit.WebMessage;
import androidx.webkit.l;
import org.chromium.support_lib_boundary.util.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import android.webkit.WebMessagePort;
import androidx.webkit.m;

public class q extends m
{
    private WebMessagePort a;
    private WebMessagePortBoundaryInterface b;
    
    public q(final WebMessagePort a) {
        this.a = a;
    }
    
    public q(final InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebMessagePortBoundaryInterface.class, invocationHandler);
    }
    
    @j0
    @p0(23)
    public static WebMessage g(final l l) {
        return new WebMessage(l.a(), h(l.b()));
    }
    
    @k0
    @p0(23)
    public static WebMessagePort[] h(final m[] array) {
        if (array == null) {
            return null;
        }
        final int length = array.length;
        final WebMessagePort[] array2 = new WebMessagePort[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = array[i].b();
        }
        return array2;
    }
    
    @j0
    @p0(23)
    public static l i(final WebMessage webMessage) {
        return new l(webMessage.getData(), l(webMessage.getPorts()));
    }
    
    private WebMessagePortBoundaryInterface j() {
        if (this.b == null) {
            this.b = (WebMessagePortBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebMessagePortBoundaryInterface.class, v.c().g(this.a));
        }
        return this.b;
    }
    
    @p0(23)
    private WebMessagePort k() {
        if (this.a == null) {
            this.a = v.c().f(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
    
    @k0
    public static m[] l(final WebMessagePort[] array) {
        if (array == null) {
            return null;
        }
        final m[] array2 = new m[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new q(array[i]);
        }
        return array2;
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void a() {
        final u k0 = u.k0;
        if (k0.j()) {
            this.k().close();
        }
        else {
            if (!k0.k()) {
                throw u.f();
            }
            this.j().close();
        }
    }
    
    @p0(23)
    @Override
    public WebMessagePort b() {
        return this.k();
    }
    
    @Override
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(this.j());
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void d(@j0 final l l) {
        final u j0 = u.j0;
        if (j0.j()) {
            this.k().postMessage(g(l));
        }
        else {
            if (!j0.k()) {
                throw u.f();
            }
            this.j().postMessage(org.chromium.support_lib_boundary.util.a.d((Object)new n(l)));
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void e(final Handler handler, @j0 final a a) {
        final u m0 = u.m0;
        if (m0.j()) {
            this.k().setWebMessageCallback((WebMessagePort$WebMessageCallback)new WebMessagePort$WebMessageCallback() {
                public void onMessage(final WebMessagePort webMessagePort, final WebMessage webMessage) {
                    a.a(new q(webMessagePort), q.i(webMessage));
                }
            }, handler);
        }
        else {
            if (!m0.k()) {
                throw u.f();
            }
            this.j().setWebMessageCallback(a.d((Object)new o(a)), handler);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void f(@j0 final a a) {
        final u l0 = u.l0;
        if (l0.j()) {
            this.k().setWebMessageCallback((WebMessagePort$WebMessageCallback)new WebMessagePort$WebMessageCallback() {
                public void onMessage(final WebMessagePort webMessagePort, final WebMessage webMessage) {
                    a.a(new q(webMessagePort), q.i(webMessage));
                }
            });
        }
        else {
            if (!l0.k()) {
                throw u.f();
            }
            this.j().setWebMessageCallback(a.d((Object)new o(a)));
        }
    }
}
