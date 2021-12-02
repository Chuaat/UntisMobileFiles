// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observables;

import io.reactivex.annotations.g;
import io.reactivex.b0;

public abstract class b<K, T> extends b0<T>
{
    final K G;
    
    protected b(@g final K g) {
        this.G = g;
    }
    
    @g
    public K l8() {
        return this.G;
    }
}
