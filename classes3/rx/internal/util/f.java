// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.Collection;
import java.util.ArrayList;
import rx.exceptions.b;
import java.util.concurrent.atomic.AtomicReference;

public enum f
{
    private static final Throwable G;
    
    static {
        G = new Throwable("Terminated");
    }
    
    public static boolean b(final AtomicReference<Throwable> atomicReference, final Throwable t) {
        Throwable expectedValue;
        Throwable newValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == f.G) {
                return false;
            }
            if (expectedValue == null) {
                newValue = t;
            }
            else if (expectedValue instanceof b) {
                final ArrayList list = new ArrayList<Throwable>(((b)expectedValue).b());
                list.add(t);
                newValue = new b((Collection<? extends Throwable>)list);
            }
            else {
                newValue = new b(new Throwable[] { expectedValue, t });
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public static boolean d(final Throwable t) {
        return t == f.G;
    }
    
    public static boolean f(final AtomicReference<Throwable> atomicReference) {
        return d(atomicReference.get());
    }
    
    public static Throwable g(final AtomicReference<Throwable> atomicReference) {
        final Throwable t = atomicReference.get();
        final Throwable g = f.G;
        Throwable t2 = t;
        if (t != g) {
            t2 = atomicReference.getAndSet(g);
        }
        return t2;
    }
}
