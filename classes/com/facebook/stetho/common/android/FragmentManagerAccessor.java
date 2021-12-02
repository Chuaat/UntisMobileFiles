// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import c6.h;
import java.util.List;

public interface FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT>
{
    @h
    List<FRAGMENT> getAddedFragments(final FRAGMENT_MANAGER p0);
}
