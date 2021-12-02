// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.disposables.c;
import io.reactivex.annotations.g;
import x5.f;

public interface n<T> extends k<T>
{
    void c(@g final f p0);
    
    long d();
    
    boolean e(@io.reactivex.annotations.f final Throwable p0);
    
    boolean isCancelled();
    
    void j(@g final c p0);
    
    @io.reactivex.annotations.f
    n<T> serialize();
}
