// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import android.net.Uri;
import androidx.webkit.l;
import androidx.webkit.u;
import androidx.webkit.t;
import android.webkit.WebViewClient;
import androidx.annotation.k0;
import android.webkit.WebChromeClient;
import java.lang.reflect.InvocationHandler;
import androidx.webkit.m;
import androidx.annotation.p0;
import org.chromium.support_lib_boundary.util.a;
import androidx.webkit.r;
import androidx.annotation.j0;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public class w
{
    WebViewProviderBoundaryInterface a;
    
    public w(@j0 final WebViewProviderBoundaryInterface a) {
        this.a = a;
    }
    
    @j0
    public h a(@j0 final String s, @j0 final String[] array) {
        return h.b(this.a.addDocumentStartJavaScript(s, array));
    }
    
    @p0(19)
    public void b(@j0 final String s, @j0 final String[] array, @j0 final r.c c) {
        this.a.addWebMessageListener(s, array, org.chromium.support_lib_boundary.util.a.d((Object)new p(c)));
    }
    
    @j0
    public m[] c() {
        final InvocationHandler[] webMessageChannel = this.a.createWebMessageChannel();
        final m[] array = new m[webMessageChannel.length];
        for (int i = 0; i < webMessageChannel.length; ++i) {
            array[i] = new q(webMessageChannel[i]);
        }
        return array;
    }
    
    @k0
    public WebChromeClient d() {
        return this.a.getWebChromeClient();
    }
    
    @j0
    public WebViewClient e() {
        return this.a.getWebViewClient();
    }
    
    @k0
    public t f() {
        return b0.c(this.a.getWebViewRenderer());
    }
    
    @k0
    public u g() {
        final InvocationHandler webViewRendererClient = this.a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((z)org.chromium.support_lib_boundary.util.a.g(webViewRendererClient)).a();
    }
    
    @p0(19)
    public void h(final long n, @j0 final r.b b) {
        this.a.insertVisualStateCallback(n, org.chromium.support_lib_boundary.util.a.d((Object)new androidx.webkit.internal.m(b)));
    }
    
    @p0(19)
    public void i(@j0 final l l, @j0 final Uri uri) {
        this.a.postMessageToMainFrame(org.chromium.support_lib_boundary.util.a.d((Object)new n(l)), uri);
    }
    
    public void j(@j0 final String s) {
        this.a.removeWebMessageListener(s);
    }
    
    @SuppressLint({ "LambdaLast" })
    @p0(19)
    public void k(@k0 final Executor executor, @k0 final u u) {
        InvocationHandler d;
        if (u != null) {
            d = org.chromium.support_lib_boundary.util.a.d((Object)new z(executor, u));
        }
        else {
            d = null;
        }
        this.a.setWebViewRendererClient(d);
    }
}
