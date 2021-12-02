// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.view.View;
import android.content.res.Resources;
import c6.h;

public interface FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER>
{
    public static final int NO_ID = 0;
    
    @h
    FRAGMENT_MANAGER getChildFragmentManager(final FRAGMENT p0);
    
    @h
    FRAGMENT_MANAGER getFragmentManager(final FRAGMENT p0);
    
    int getId(final FRAGMENT p0);
    
    Resources getResources(final FRAGMENT p0);
    
    @h
    String getTag(final FRAGMENT p0);
    
    @h
    View getView(final FRAGMENT p0);
}
