// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.app.Activity;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public interface m
{
    @RecentlyNonNull
    @a
    boolean a();
    
    @a
    void b(@RecentlyNonNull final String p0, @RecentlyNonNull final LifecycleCallback p1);
    
    @RecentlyNullable
    @a
     <T extends LifecycleCallback> T e(@RecentlyNonNull final String p0, @RecentlyNonNull final Class<T> p1);
    
    @RecentlyNonNull
    @a
    Activity f();
    
    @RecentlyNonNull
    @a
    boolean n();
    
    @a
    void startActivityForResult(@RecentlyNonNull final Intent p0, @RecentlyNonNull final int p1);
}
