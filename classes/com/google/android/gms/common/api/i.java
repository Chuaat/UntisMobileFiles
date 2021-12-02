// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNullable;
import android.os.Bundle;
import java.util.Iterator;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.data.b;

@f2.a
public class i<T, R extends a> extends s<R> implements b<T>
{
    @f2.a
    public i() {
    }
    
    @f2.a
    public i(@RecentlyNonNull final R r) {
        super((t)r);
    }
    
    @RecentlyNonNull
    @Override
    public Iterator<T> O1() {
        return this.b().O1();
    }
    
    @Override
    public void close() {
        this.b().close();
    }
    
    @RecentlyNonNull
    @Override
    public T get(@RecentlyNonNull final int n) {
        return this.b().get(n);
    }
    
    @RecentlyNonNull
    @Override
    public int getCount() {
        return this.b().getCount();
    }
    
    @RecentlyNonNull
    @Override
    public boolean isClosed() {
        return this.b().isClosed();
    }
    
    @RecentlyNonNull
    @Override
    public Iterator<T> iterator() {
        return this.b().iterator();
    }
    
    @Override
    public void release() {
        this.b().release();
    }
    
    @RecentlyNullable
    @Override
    public Bundle u() {
        return this.b().u();
    }
}
