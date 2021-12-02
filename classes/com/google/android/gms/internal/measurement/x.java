// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class x
{
    final List<n0> a;
    
    protected x() {
        this.a = new ArrayList<n0>();
    }
    
    public abstract q a(final String p0, final g5 p1, final List<q> p2);
    
    final q b(String message) {
        if (this.a.contains(h6.e(message))) {
            message = String.valueOf(message);
            if (message.length() != 0) {
                message = "Command not implemented: ".concat(message);
            }
            else {
                message = new String("Command not implemented: ");
            }
            throw new UnsupportedOperationException(message);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
