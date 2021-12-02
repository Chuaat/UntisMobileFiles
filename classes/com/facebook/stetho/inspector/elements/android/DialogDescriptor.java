// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import android.view.View;
import c6.h;
import com.facebook.stetho.inspector.elements.Descriptor;
import android.graphics.Rect;
import android.app.Dialog;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class DialogDescriptor extends AbstractChainedDescriptor<Dialog> implements HighlightableDescriptor<Dialog>
{
    @h
    @Override
    public Object getElementToHighlightAtPosition(final Dialog dialog, final int n, final int n2, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final Object o = null;
        Object window;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            window = dialog.getWindow();
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(window);
        }
        else {
            window = (highlightableDescriptor = null);
        }
        Object elementToHighlightAtPosition;
        if (highlightableDescriptor == null) {
            elementToHighlightAtPosition = o;
        }
        else {
            elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(window, n, n2, rect);
        }
        return elementToHighlightAtPosition;
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final Dialog dialog, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final View view = null;
        Object window;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            window = dialog.getWindow();
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(window);
        }
        else {
            window = (highlightableDescriptor = null);
        }
        View viewAndBoundsForHighlighting;
        if (highlightableDescriptor == null) {
            viewAndBoundsForHighlighting = view;
        }
        else {
            viewAndBoundsForHighlighting = highlightableDescriptor.getViewAndBoundsForHighlighting(window, rect);
        }
        return viewAndBoundsForHighlighting;
    }
    
    @Override
    protected void onGetChildren(final Dialog dialog, final Accumulator<Object> accumulator) {
        final Window window = dialog.getWindow();
        if (window != null) {
            accumulator.store(window);
        }
    }
}
