// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.k0;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import android.app.Activity;

public abstract class m<TResult>
{
    @j0
    public m<TResult> a(@j0 final Activity activity, @j0 final e e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }
    
    @j0
    public m<TResult> b(@j0 final e e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }
    
    @j0
    public m<TResult> c(@j0 final Executor executor, @j0 final e e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }
    
    @j0
    public m<TResult> d(@j0 final Activity activity, @j0 final f<TResult> f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    @j0
    public m<TResult> e(@j0 final f<TResult> f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    @j0
    public m<TResult> f(@j0 final Executor executor, @j0 final f<TResult> f) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    @j0
    public abstract m<TResult> g(@j0 final Activity p0, @j0 final g p1);
    
    @j0
    public abstract m<TResult> h(@j0 final g p0);
    
    @j0
    public abstract m<TResult> i(@j0 final Executor p0, @j0 final g p1);
    
    @j0
    public abstract m<TResult> j(@j0 final Activity p0, @j0 final h<? super TResult> p1);
    
    @j0
    public abstract m<TResult> k(@j0 final h<? super TResult> p0);
    
    @j0
    public abstract m<TResult> l(@j0 final Executor p0, @j0 final h<? super TResult> p1);
    
    @j0
    public <TContinuationResult> m<TContinuationResult> m(@j0 final c<TResult, TContinuationResult> c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    @j0
    public <TContinuationResult> m<TContinuationResult> n(@j0 final Executor executor, @j0 final c<TResult, TContinuationResult> c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    @j0
    public <TContinuationResult> m<TContinuationResult> o(@j0 final c<TResult, m<TContinuationResult>> c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    @j0
    public <TContinuationResult> m<TContinuationResult> p(@j0 final Executor executor, @j0 final c<TResult, m<TContinuationResult>> c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    @k0
    public abstract Exception q();
    
    public abstract TResult r();
    
    public abstract <X extends Throwable> TResult s(@j0 final Class<X> p0) throws X, Throwable;
    
    public abstract boolean t();
    
    public abstract boolean u();
    
    public abstract boolean v();
    
    @j0
    public <TContinuationResult> m<TContinuationResult> w(@j0 final l<TResult, TContinuationResult> l) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
    
    @j0
    public <TContinuationResult> m<TContinuationResult> x(@j0 final Executor executor, @j0 final l<TResult, TContinuationResult> l) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
