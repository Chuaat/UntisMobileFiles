// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.exceptions;

import io.reactivex.internal.util.k;
import io.reactivex.annotations.f;

public final class b
{
    private b() {
        throw new IllegalStateException("No instances!");
    }
    
    @f
    public static RuntimeException a(@f final Throwable t) {
        throw k.f(t);
    }
    
    public static void b(@f final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
}
