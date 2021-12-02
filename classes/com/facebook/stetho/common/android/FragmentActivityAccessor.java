// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import c6.h;
import android.app.Activity;

public interface FragmentActivityAccessor<FRAGMENT_ACTIVITY extends Activity, FRAGMENT_MANAGER>
{
    @h
    FRAGMENT_MANAGER getFragmentManager(final FRAGMENT_ACTIVITY p0);
}
