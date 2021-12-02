// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.util.a;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import org.chromium.support_lib_boundary.ScriptReferenceBoundaryInterface;
import androidx.webkit.f;

public class h extends f
{
    private ScriptReferenceBoundaryInterface a;
    
    private h(@j0 final ScriptReferenceBoundaryInterface a) {
        this.a = a;
    }
    
    @j0
    public static h b(@j0 final InvocationHandler invocationHandler) {
        return new h((ScriptReferenceBoundaryInterface)a.a((Class)ScriptReferenceBoundaryInterface.class, invocationHandler));
    }
    
    @Override
    public void a() {
        this.a.remove();
    }
}
