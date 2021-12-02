// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import android.annotation.SuppressLint;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.util.a;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import java.lang.ref.WeakReference;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import android.webkit.WebViewRenderProcess;
import java.util.WeakHashMap;
import androidx.webkit.t;

public class b0 extends t
{
    private static WeakHashMap<WebViewRenderProcess, b0> c;
    private WebViewRendererBoundaryInterface a;
    private WeakReference<WebViewRenderProcess> b;
    
    static {
        b0.c = new WeakHashMap<WebViewRenderProcess, b0>();
    }
    
    public b0(@j0 final WebViewRenderProcess referent) {
        this.b = new WeakReference<WebViewRenderProcess>(referent);
    }
    
    public b0(@j0 final WebViewRendererBoundaryInterface a) {
        this.a = a;
    }
    
    @j0
    public static b0 b(@j0 final WebViewRenderProcess webViewRenderProcess) {
        final b0 b0 = androidx.webkit.internal.b0.c.get(webViewRenderProcess);
        if (b0 != null) {
            return b0;
        }
        final b0 value = new b0(webViewRenderProcess);
        androidx.webkit.internal.b0.c.put(webViewRenderProcess, value);
        return value;
    }
    
    @j0
    public static b0 c(@j0 final InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface)a.a((Class)WebViewRendererBoundaryInterface.class, invocationHandler);
        return (b0)((IsomorphicObjectBoundaryInterface)webViewRendererBoundaryInterface).getOrCreatePeer((Callable)new Callable<Object>() {
            @Override
            public Object call() {
                return new b0(webViewRendererBoundaryInterface);
            }
        });
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean a() {
        final u s0 = u.s0;
        if (s0.j()) {
            final WebViewRenderProcess webViewRenderProcess = this.b.get();
            return webViewRenderProcess != null && webViewRenderProcess.terminate();
        }
        if (s0.k()) {
            return this.a.terminate();
        }
        throw u.f();
    }
}
