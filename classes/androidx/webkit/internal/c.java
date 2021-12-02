// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.annotation.k0;
import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import androidx.annotation.j0;
import androidx.webkit.g;
import androidx.annotation.p0;
import android.webkit.ServiceWorkerClient;

@p0(24)
public class c extends ServiceWorkerClient
{
    private final g a;
    
    public c(@j0 final g a) {
        this.a = a;
    }
    
    @k0
    public WebResourceResponse shouldInterceptRequest(@j0 final WebResourceRequest webResourceRequest) {
        return this.a.a(webResourceRequest);
    }
}
