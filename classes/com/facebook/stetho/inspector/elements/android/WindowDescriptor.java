// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Accumulator;
import android.view.View;
import c6.h;
import com.facebook.stetho.inspector.elements.Descriptor;
import android.graphics.Rect;
import android.view.Window;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class WindowDescriptor extends AbstractChainedDescriptor<Window> implements HighlightableDescriptor<Window>
{
    @h
    @Override
    public Object getElementToHighlightAtPosition(final Window window, final int n, final int n2, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final Object o = null;
        Object peekDecorView;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            peekDecorView = window.peekDecorView();
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(peekDecorView);
        }
        else {
            peekDecorView = (highlightableDescriptor = null);
        }
        Object elementToHighlightAtPosition;
        if (highlightableDescriptor == null) {
            elementToHighlightAtPosition = o;
        }
        else {
            elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(peekDecorView, n, n2, rect);
        }
        return elementToHighlightAtPosition;
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final Window window, final Rect rect) {
        return window.peekDecorView();
    }
    
    @Override
    protected void onGetChildren(final Window window, final Accumulator<Object> accumulator) {
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            accumulator.store(peekDecorView);
        }
    }
}
