// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.webkit.r;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

public class m implements VisualStateCallbackBoundaryInterface
{
    private r.b a;
    
    public m(final r.b a) {
        this.a = a;
    }
    
    public void onComplete(final long n) {
        this.a.onComplete(n);
    }
}
