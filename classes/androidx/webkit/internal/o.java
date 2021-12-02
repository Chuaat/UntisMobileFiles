// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.util.a;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import androidx.webkit.m;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

public class o implements WebMessageCallbackBoundaryInterface
{
    m.a a;
    
    public o(@j0 final m.a a) {
        this.a = a;
    }
    
    @j0
    public String[] getSupportedFeatures() {
        return new String[] { "WEB_MESSAGE_CALLBACK_ON_MESSAGE" };
    }
    
    public void onMessage(final InvocationHandler invocationHandler, final InvocationHandler invocationHandler2) {
        this.a.a(new q(invocationHandler), n.b((WebMessageBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
