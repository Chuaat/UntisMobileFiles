// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.webkit.t;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebView;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.webkit.u;
import androidx.annotation.p0;
import android.webkit.WebViewRenderProcessClient;

@p0(29)
public class a0 extends WebViewRenderProcessClient
{
    private u a;
    
    public a0(@j0 final u a) {
        this.a = a;
    }
    
    @k0
    public u a() {
        return this.a;
    }
    
    public void onRenderProcessResponsive(@j0 final WebView webView, @k0 final WebViewRenderProcess webViewRenderProcess) {
        this.a.a(webView, b0.b(webViewRenderProcess));
    }
    
    public void onRenderProcessUnresponsive(@j0 final WebView webView, @k0 final WebViewRenderProcess webViewRenderProcess) {
        this.a.b(webView, b0.b(webViewRenderProcess));
    }
}
