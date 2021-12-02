// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

public class s
{
    private final WebResourceRequestBoundaryInterface a;
    
    public s(final WebResourceRequestBoundaryInterface a) {
        this.a = a;
    }
    
    public boolean a() {
        return this.a.isRedirect();
    }
}
