// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public abstract class g<T>
{
    private final T a;
    
    public g(final T a) {
        this.a = a;
    }
    
    @e
    public abstract c0 a(@e final e0 p0);
    
    public T b() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f Object b) {
        if (this != b) {
            final Object b2 = this.b();
            final boolean b3 = b instanceof g;
            final Object o = null;
            g<Object> g;
            if (b3) {
                g = (g<Object>)b;
            }
            else {
                g = null;
            }
            if (g == null) {
                b = o;
            }
            else {
                b = g.b();
            }
            if (!k0.g(b2, b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final Object b = this.b();
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        return String.valueOf(this.b());
    }
}
