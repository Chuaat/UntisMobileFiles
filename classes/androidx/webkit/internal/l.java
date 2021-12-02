// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import java.util.concurrent.Executor;
import java.io.OutputStream;
import java.util.Collection;
import android.webkit.TracingConfig$Builder;
import androidx.annotation.j0;
import androidx.webkit.j;
import androidx.annotation.p0;
import android.annotation.SuppressLint;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import android.webkit.TracingController;
import androidx.webkit.k;

public class l extends k
{
    private TracingController a;
    private TracingControllerBoundaryInterface b;
    
    @SuppressLint({ "NewApi" })
    public l() {
        final u t0 = u.t0;
        if (t0.j()) {
            this.a = TracingController.getInstance();
            this.b = null;
        }
        else {
            if (!t0.k()) {
                throw u.f();
            }
            this.a = null;
            this.b = v.d().getTracingController();
        }
    }
    
    private TracingControllerBoundaryInterface e() {
        if (this.b == null) {
            this.b = v.d().getTracingController();
        }
        return this.b;
    }
    
    @p0(28)
    private TracingController f() {
        if (this.a == null) {
            this.a = TracingController.getInstance();
        }
        return this.a;
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean b() {
        final u t0 = u.t0;
        if (t0.j()) {
            return this.f().isTracing();
        }
        if (t0.k()) {
            return this.e().isTracing();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void c(@j0 final j j) {
        if (j != null) {
            final u t0 = u.t0;
            if (t0.j()) {
                this.f().start(new TracingConfig$Builder().addCategories(new int[] { j.b() }).addCategories((Collection)j.a()).setTracingMode(j.c()).build());
            }
            else {
                if (!t0.k()) {
                    throw u.f();
                }
                this.e().start(j.b(), (Collection)j.a(), j.c());
            }
            return;
        }
        throw new IllegalArgumentException("Tracing config must be non null");
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean d(final OutputStream outputStream, final Executor executor) {
        final u t0 = u.t0;
        if (t0.j()) {
            return this.f().stop(outputStream, executor);
        }
        if (t0.k()) {
            return this.e().stop(outputStream, executor);
        }
        throw u.f();
    }
}
