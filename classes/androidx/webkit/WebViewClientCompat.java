// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.webkit.internal.g;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceResponse;
import java.lang.reflect.InvocationHandler;
import androidx.webkit.internal.r;
import android.webkit.WebResourceError;
import androidx.annotation.t0;
import androidx.webkit.internal.u;
import androidx.annotation.p0;
import androidx.annotation.a1;
import android.os.Build$VERSION;
import android.webkit.WebResourceRequest;
import androidx.annotation.j0;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import android.webkit.WebViewClient;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface
{
    private static final String[] a;
    
    static {
        a = new String[] { "VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT" };
    }
    
    @a1
    @p0(21)
    public void a(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, @j0 final n n) {
        if (Build$VERSION.SDK_INT < 21) {
            return;
        }
        if (s.a("WEB_RESOURCE_ERROR_GET_CODE")) {
            if (s.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
                if (webResourceRequest.isForMainFrame()) {
                    this.onReceivedError(webView, n.b(), n.a().toString(), webResourceRequest.getUrl().toString());
                }
            }
        }
    }
    
    @a1
    public void b(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, final int n, @j0 final e e) {
        if (s.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            e.c(true);
            return;
        }
        throw u.f();
    }
    
    @j0
    @t0({ t0.a.G })
    public final String[] getSupportedFeatures() {
        return WebViewClientCompat.a;
    }
    
    @a1
    public void onPageCommitVisible(@j0 final WebView webView, @j0 final String s) {
    }
    
    @p0(23)
    public final void onReceivedError(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, @j0 final WebResourceError webResourceError) {
        if (Build$VERSION.SDK_INT < 23) {
            return;
        }
        this.a(webView, webResourceRequest, new r(webResourceError));
    }
    
    @p0(21)
    @t0({ t0.a.G })
    public final void onReceivedError(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, @j0 final InvocationHandler invocationHandler) {
        this.a(webView, webResourceRequest, new r(invocationHandler));
    }
    
    @a1
    public void onReceivedHttpError(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, @j0 final WebResourceResponse webResourceResponse) {
    }
    
    @p0(27)
    public final void onSafeBrowsingHit(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, final int n, @j0 final SafeBrowsingResponse safeBrowsingResponse) {
        this.b(webView, webResourceRequest, n, new g(safeBrowsingResponse));
    }
    
    @t0({ t0.a.G })
    public final void onSafeBrowsingHit(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest, final int n, @j0 final InvocationHandler invocationHandler) {
        this.b(webView, webResourceRequest, n, new g(invocationHandler));
    }
    
    @a1
    @p0(21)
    public boolean shouldOverrideUrlLoading(@j0 final WebView webView, @j0 final WebResourceRequest webResourceRequest) {
        return Build$VERSION.SDK_INT >= 21 && this.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface a {
    }
}
