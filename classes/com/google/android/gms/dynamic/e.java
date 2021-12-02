// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import android.app.Activity;
import f2.a;

@a
public interface e
{
    @a
    void a();
    
    @a
    void b(@RecentlyNonNull final Activity p0, @RecentlyNonNull final Bundle p1, @RecentlyNonNull final Bundle p2);
    
    @RecentlyNonNull
    @a
    View c(@RecentlyNonNull final LayoutInflater p0, @RecentlyNonNull final ViewGroup p1, @RecentlyNonNull final Bundle p2);
    
    @a
    void d();
    
    @a
    void e(@RecentlyNonNull final Bundle p0);
    
    @a
    void f();
    
    @a
    void g();
    
    @a
    void h();
    
    @a
    void i(@RecentlyNonNull final Bundle p0);
    
    @a
    void onDestroy();
    
    @a
    void onLowMemory();
}
