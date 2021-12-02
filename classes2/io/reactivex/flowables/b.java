// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.flowables;

import io.reactivex.annotations.g;
import io.reactivex.l;

public abstract class b<K, T> extends l<T>
{
    final K H;
    
    protected b(@g final K h) {
        this.H = h;
    }
    
    @g
    public K P8() {
        return this.H;
    }
}
