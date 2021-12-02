// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import androidx.annotation.j0;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;

public interface x
{
    String[] a();
    
    WebViewProviderBoundaryInterface createWebView(final WebView p0);
    
    ProxyControllerBoundaryInterface getProxyController();
    
    @j0
    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();
    
    StaticsBoundaryInterface getStatics();
    
    TracingControllerBoundaryInterface getTracingController();
    
    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
