// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.annotation.k0;
import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import androidx.annotation.j0;
import androidx.webkit.g;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

public class i implements ServiceWorkerClientBoundaryInterface
{
    private final g a;
    
    public i(@j0 final g a) {
        this.a = a;
    }
    
    @j0
    public String[] getSupportedFeatures() {
        return new String[] { "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST" };
    }
    
    @k0
    public WebResourceResponse shouldInterceptRequest(@j0 final WebResourceRequest webResourceRequest) {
        return this.a.a(webResourceRequest);
    }
}
