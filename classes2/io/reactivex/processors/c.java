// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import io.reactivex.annotations.f;
import io.reactivex.annotations.d;
import io.reactivex.annotations.g;
import io.reactivex.q;
import o7.a;
import io.reactivex.l;

public abstract class c<T> extends l<T> implements a<T, T>, q<T>
{
    @g
    public abstract Throwable P8();
    
    public abstract boolean Q8();
    
    public abstract boolean R8();
    
    public abstract boolean S8();
    
    @d
    @f
    public final c<T> T8() {
        if (this instanceof io.reactivex.processors.g) {
            return this;
        }
        return new io.reactivex.processors.g<T>(this);
    }
}
