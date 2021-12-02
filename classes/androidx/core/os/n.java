// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.core.util.i;
import androidx.annotation.k0;

public class n extends RuntimeException
{
    public n() {
        this((String)null);
    }
    
    public n(@k0 final String s) {
        super(i.f(s, "The operation has been canceled."));
    }
}
