// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import rx.h;
import rx.g;

public abstract class f<T, R> extends g<R> implements h<T>
{
    protected f(final a<R> a) {
        super((a)a);
    }
    
    public abstract boolean E7();
    
    public final e<T, R> F7() {
        if (this.getClass() == e.class) {
            return (e<T, R>)this;
        }
        return new e<T, R>(this);
    }
}
