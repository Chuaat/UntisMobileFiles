// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceError;
import android.webkit.WebMessagePort;
import org.chromium.support_lib_boundary.util.a;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import android.webkit.WebSettings;
import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.p0;
import android.webkit.SafeBrowsingResponse;
import androidx.annotation.j0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class c0
{
    private final WebkitToCompatConverterBoundaryInterface a;
    
    public c0(final WebkitToCompatConverterBoundaryInterface a) {
        this.a = a;
    }
    
    @j0
    @p0(27)
    public SafeBrowsingResponse a(@j0 final InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse)this.a.convertSafeBrowsingResponse(invocationHandler);
    }
    
    @j0
    public InvocationHandler b(@j0 final SafeBrowsingResponse safeBrowsingResponse) {
        return this.a.convertSafeBrowsingResponse((Object)safeBrowsingResponse);
    }
    
    @j0
    @p0(24)
    public ServiceWorkerWebSettings c(@j0 final InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings)this.a.convertServiceWorkerSettings(invocationHandler);
    }
    
    @j0
    public InvocationHandler d(@j0 final ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.a.convertServiceWorkerSettings((Object)serviceWorkerWebSettings);
    }
    
    @j0
    public t e(final WebSettings webSettings) {
        return new t((WebSettingsBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebSettingsBoundaryInterface.class, this.a.convertSettings(webSettings)));
    }
    
    @j0
    @p0(23)
    public WebMessagePort f(@j0 final InvocationHandler invocationHandler) {
        return (WebMessagePort)this.a.convertWebMessagePort(invocationHandler);
    }
    
    @j0
    public InvocationHandler g(@j0 final WebMessagePort webMessagePort) {
        return this.a.convertWebMessagePort((Object)webMessagePort);
    }
    
    @j0
    @p0(23)
    public WebResourceError h(@j0 final InvocationHandler invocationHandler) {
        return (WebResourceError)this.a.convertWebResourceError(invocationHandler);
    }
    
    @j0
    public InvocationHandler i(@j0 final WebResourceError webResourceError) {
        return this.a.convertWebResourceError((Object)webResourceError);
    }
    
    @j0
    public s j(final WebResourceRequest webResourceRequest) {
        return new s((WebResourceRequestBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebResourceRequestBoundaryInterface.class, this.a.convertWebResourceRequest(webResourceRequest)));
    }
}
