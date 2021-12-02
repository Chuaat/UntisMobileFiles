// 
// Decompiled by Procyon v0.5.36
// 

package rx.observables;

import rx.internal.operators.d1;
import rx.internal.operators.z;
import rx.o;
import rx.functions.b;
import rx.functions.m;
import rx.g;

public abstract class c<T> extends g<T>
{
    protected c(final a<T> a) {
        super((a)a);
    }
    
    public g<T> E7() {
        return this.F7(1);
    }
    
    public g<T> F7(final int n) {
        return this.G7(n, m.a());
    }
    
    public g<T> G7(final int n, final rx.functions.b<? super o> b) {
        if (n <= 0) {
            this.I7(b);
            return this;
        }
        return g.Q6((a<T>)new z(this, n, b));
    }
    
    public final o H7() {
        final o[] array = { null };
        this.I7(new rx.functions.b<o>() {
            public void a(final o o) {
                array[0] = o;
            }
        });
        return array[0];
    }
    
    public abstract void I7(final rx.functions.b<? super o> p0);
    
    public g<T> J7() {
        return g.Q6((a<T>)new d1(this));
    }
}
