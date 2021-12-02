// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result;

import androidx.annotation.j0;
import androidx.activity.result.contract.a;

public interface c
{
    @j0
     <I, O> d<I> registerForActivityResult(@j0 final a<I, O> p0, @j0 final ActivityResultRegistry p1, @j0 final b<O> p2);
    
    @j0
     <I, O> d<I> registerForActivityResult(@j0 final a<I, O> p0, @j0 final b<O> p1);
}
