// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.Iterator;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNullable;

public abstract class a<T> implements b<T>
{
    @RecentlyNullable
    @f2.a
    protected final DataHolder G;
    
    @f2.a
    protected a(@k0 final DataHolder g) {
        this.G = g;
    }
    
    @RecentlyNonNull
    @Override
    public Iterator<T> O1() {
        return new l<T>(this);
    }
    
    @Override
    public final void close() {
        this.release();
    }
    
    @RecentlyNonNull
    @Override
    public abstract T get(@RecentlyNonNull final int p0);
    
    @RecentlyNonNull
    @Override
    public int getCount() {
        final DataHolder g = this.G;
        if (g == null) {
            return 0;
        }
        return g.getCount();
    }
    
    @Deprecated
    @RecentlyNonNull
    @Override
    public boolean isClosed() {
        final DataHolder g = this.G;
        return g == null || g.isClosed();
    }
    
    @RecentlyNonNull
    @Override
    public Iterator<T> iterator() {
        return new c<T>(this);
    }
    
    @Override
    public void release() {
        final DataHolder g = this.G;
        if (g != null) {
            g.close();
        }
    }
    
    @RecentlyNullable
    @Override
    public Bundle u() {
        final DataHolder g = this.G;
        if (g == null) {
            return null;
        }
        return g.u();
    }
}
