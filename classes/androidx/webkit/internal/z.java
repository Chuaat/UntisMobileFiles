// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.webkit.t;
import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;
import androidx.annotation.j0;
import android.annotation.SuppressLint;
import androidx.annotation.k0;
import androidx.webkit.u;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

public class z implements WebViewRendererClientBoundaryInterface
{
    private static final String[] c;
    private final Executor a;
    private final u b;
    
    static {
        c = new String[] { "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE" };
    }
    
    @SuppressLint({ "LambdaLast" })
    public z(@k0 final Executor a, @k0 final u b) {
        this.a = a;
        this.b = b;
    }
    
    @k0
    public u a() {
        return this.b;
    }
    
    @j0
    public final String[] getSupportedFeatures() {
        return z.c;
    }
    
    public final void onRendererResponsive(@j0 final WebView webView, @j0 final InvocationHandler invocationHandler) {
        final b0 c = b0.c(invocationHandler);
        final u b = this.b;
        final Executor a = this.a;
        if (a == null) {
            b.a(webView, c);
        }
        else {
            a.execute(new Runnable() {
                @Override
                public void run() {
                    b.a(webView, c);
                }
            });
        }
    }
    
    public final void onRendererUnresponsive(@j0 final WebView webView, @j0 final InvocationHandler invocationHandler) {
        final b0 c = b0.c(invocationHandler);
        final u b = this.b;
        final Executor a = this.a;
        if (a == null) {
            b.b(webView, c);
        }
        else {
            a.execute(new Runnable() {
                @Override
                public void run() {
                    b.b(webView, c);
                }
            });
        }
    }
}
