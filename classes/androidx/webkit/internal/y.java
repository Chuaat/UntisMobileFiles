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
import org.chromium.support_lib_boundary.util.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public class y implements x
{
    WebViewProviderFactoryBoundaryInterface a;
    
    public y(final WebViewProviderFactoryBoundaryInterface a) {
        this.a = a;
    }
    
    @Override
    public String[] a() {
        return this.a.getSupportedFeatures();
    }
    
    @Override
    public WebViewProviderBoundaryInterface createWebView(final WebView webView) {
        return (WebViewProviderBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }
    
    @Override
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)ProxyControllerBoundaryInterface.class, this.a.getProxyController());
    }
    
    @j0
    @Override
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)ServiceWorkerControllerBoundaryInterface.class, this.a.getServiceWorkerController());
    }
    
    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)StaticsBoundaryInterface.class, this.a.getStatics());
    }
    
    @Override
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)TracingControllerBoundaryInterface.class, this.a.getTracingController());
    }
    
    @Override
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
}
