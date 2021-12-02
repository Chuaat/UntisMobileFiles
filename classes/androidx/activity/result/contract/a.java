// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result.contract;

import androidx.annotation.k0;
import android.content.Intent;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import android.content.Context;

public abstract class a<I, O>
{
    @j0
    public abstract Intent a(@j0 final Context p0, @SuppressLint({ "UnknownNullness" }) final I p1);
    
    @k0
    public a<O> b(@j0 final Context context, @SuppressLint({ "UnknownNullness" }) final I n) {
        return null;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public abstract O c(final int p0, @k0 final Intent p1);
    
    public static final class a<T>
    {
        @SuppressLint({ "UnknownNullness" })
        private final T a;
        
        public a(@SuppressLint({ "UnknownNullness" }) final T a) {
            this.a = a;
        }
        
        @SuppressLint({ "UnknownNullness" })
        public T a() {
            return this.a;
        }
    }
}
