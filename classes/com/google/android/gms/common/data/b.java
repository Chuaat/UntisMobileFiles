// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import f2.a;
import androidx.annotation.RecentlyNullable;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.Iterator;
import java.io.Closeable;
import com.google.android.gms.common.api.p;

public interface b<T> extends p, Closeable, Iterable<T>
{
    @RecentlyNonNull
    Iterator<T> O1();
    
    void close();
    
    @RecentlyNonNull
    T get(@RecentlyNonNull final int p0);
    
    @RecentlyNonNull
    int getCount();
    
    @Deprecated
    @RecentlyNonNull
    boolean isClosed();
    
    @RecentlyNonNull
    Iterator<T> iterator();
    
    void release();
    
    @RecentlyNullable
    @a
    Bundle u();
}
