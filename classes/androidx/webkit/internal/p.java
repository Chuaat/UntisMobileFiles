// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.util.a;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import android.net.Uri;
import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;
import androidx.annotation.j0;
import androidx.webkit.r;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

public class p implements WebMessageListenerBoundaryInterface
{
    private r.c a;
    
    public p(@j0 final r.c a) {
        this.a = a;
    }
    
    @j0
    public String[] getSupportedFeatures() {
        return new String[] { "WEB_MESSAGE_LISTENER" };
    }
    
    public void onPostMessage(@j0 final WebView webView, @j0 final InvocationHandler invocationHandler, @j0 final Uri uri, final boolean b, @j0 final InvocationHandler invocationHandler2) {
        this.a.a(webView, n.b((WebMessageBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebMessageBoundaryInterface.class, invocationHandler)), uri, b, e.b(invocationHandler2));
    }
}
