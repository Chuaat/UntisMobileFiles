// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.StringUtil;
import android.view.Window;
import android.view.View;
import com.facebook.stetho.inspector.elements.Descriptor;
import android.graphics.Rect;
import java.util.List;
import com.facebook.stetho.common.Accumulator;
import c6.h;
import com.facebook.stetho.common.android.FragmentCompat;
import android.app.Activity;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class ActivityDescriptor extends AbstractChainedDescriptor<Activity> implements HighlightableDescriptor<Activity>
{
    private static void getDialogFragments(@h final FragmentCompat fragmentCompat, final Activity activity, final Accumulator<Object> accumulator) {
        if (fragmentCompat != null) {
            if (fragmentCompat.getFragmentActivityClass().isInstance(activity)) {
                final Object fragmentManager = fragmentCompat.forFragmentActivity().getFragmentManager(activity);
                if (fragmentManager == null) {
                    return;
                }
                final List<FRAGMENT> addedFragments = fragmentCompat.forFragmentManager().getAddedFragments(fragmentManager);
                if (addedFragments == null) {
                    return;
                }
                for (int i = 0; i < addedFragments.size(); ++i) {
                    final FRAGMENT value = addedFragments.get(i);
                    if (fragmentCompat.getDialogFragmentClass().isInstance(value)) {
                        accumulator.store(value);
                    }
                }
            }
        }
    }
    
    @h
    @Override
    public Object getElementToHighlightAtPosition(final Activity activity, final int n, final int n2, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final Object o = null;
        Object window;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            window = activity.getWindow();
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
    public View getViewAndBoundsForHighlighting(final Activity activity, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final View view = null;
        Object window;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            window = activity.getWindow();
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
    protected void onGetChildren(final Activity activity, final Accumulator<Object> accumulator) {
        getDialogFragments(FragmentCompat.getSupportLibInstance(), activity, accumulator);
        getDialogFragments(FragmentCompat.getFrameworkInstance(), activity, accumulator);
        final Window window = activity.getWindow();
        if (window != null) {
            accumulator.store(window);
        }
    }
    
    @Override
    protected String onGetNodeName(final Activity activity) {
        return StringUtil.removePrefix(activity.getClass().getName(), "android.app.");
    }
}
