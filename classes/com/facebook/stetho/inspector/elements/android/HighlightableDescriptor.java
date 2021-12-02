// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import c6.h;
import android.graphics.Rect;

public interface HighlightableDescriptor<E>
{
    @h
    Object getElementToHighlightAtPosition(final E p0, final int p1, final int p2, final Rect p3);
    
    @h
    View getViewAndBoundsForHighlighting(final E p0, final Rect p1);
}
