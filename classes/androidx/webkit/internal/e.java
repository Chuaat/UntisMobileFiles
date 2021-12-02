// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import java.util.concurrent.Callable;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import androidx.webkit.a;

public class e extends a
{
    private JsReplyProxyBoundaryInterface a;
    
    public e(@j0 final JsReplyProxyBoundaryInterface a) {
        this.a = a;
    }
    
    @j0
    public static e b(@j0 final InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (e)((IsomorphicObjectBoundaryInterface)jsReplyProxyBoundaryInterface).getOrCreatePeer((Callable)new Callable<Object>() {
            @Override
            public Object call() {
                return new e(jsReplyProxyBoundaryInterface);
            }
        });
    }
    
    @Override
    public void a(@j0 final String s) {
        if (u.A0.k()) {
            this.a.postMessage(s);
            return;
        }
        throw u.f();
    }
}
