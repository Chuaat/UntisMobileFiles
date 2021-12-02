// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.subjects;

import io.reactivex.annotations.f;
import io.reactivex.annotations.g;
import io.reactivex.i0;
import io.reactivex.b0;

public abstract class i<T> extends b0<T> implements i0<T>
{
    @g
    public abstract Throwable l8();
    
    public abstract boolean m8();
    
    public abstract boolean n8();
    
    public abstract boolean o8();
    
    @f
    public final i<T> p8() {
        if (this instanceof io.reactivex.subjects.g) {
            return this;
        }
        return new io.reactivex.subjects.g<T>(this);
    }
}
