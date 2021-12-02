// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.util.a;
import android.webkit.ServiceWorkerClient;
import androidx.annotation.k0;
import androidx.webkit.g;
import androidx.annotation.j0;
import androidx.annotation.p0;
import android.annotation.SuppressLint;
import androidx.webkit.i;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import android.webkit.ServiceWorkerController;
import androidx.webkit.h;

public class j extends h
{
    private ServiceWorkerController a;
    private ServiceWorkerControllerBoundaryInterface b;
    private final i c;
    
    @SuppressLint({ "NewApi" })
    public j() {
        final u t = u.T;
        k c;
        if (t.j()) {
            final ServiceWorkerController instance = ServiceWorkerController.getInstance();
            this.a = instance;
            this.b = null;
            c = new k(instance.getServiceWorkerWebSettings());
        }
        else {
            if (!t.k()) {
                throw u.f();
            }
            this.a = null;
            final ServiceWorkerControllerBoundaryInterface serviceWorkerController = v.d().getServiceWorkerController();
            this.b = serviceWorkerController;
            c = new k(serviceWorkerController.getServiceWorkerWebSettings());
        }
        this.c = c;
    }
    
    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.b == null) {
            this.b = v.d().getServiceWorkerController();
        }
        return this.b;
    }
    
    @p0(24)
    private ServiceWorkerController e() {
        if (this.a == null) {
            this.a = ServiceWorkerController.getInstance();
        }
        return this.a;
    }
    
    @j0
    @Override
    public i b() {
        return this.c;
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void c(@k0 final g g) {
        final u t = u.T;
        if (t.j()) {
            this.e().setServiceWorkerClient((ServiceWorkerClient)new c(g));
        }
        else {
            if (!t.k()) {
                throw u.f();
            }
            this.d().setServiceWorkerClient(org.chromium.support_lib_boundary.util.a.d((Object)new androidx.webkit.internal.i(g)));
        }
    }
}
