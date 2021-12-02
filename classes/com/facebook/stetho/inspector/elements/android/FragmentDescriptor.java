// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import android.view.View;
import android.graphics.Rect;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.common.LogUtil;
import c6.h;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.common.android.FragmentAccessor;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class FragmentDescriptor extends AbstractChainedDescriptor<Object> implements HighlightableDescriptor<Object>
{
    private static final String ID_ATTRIBUTE_NAME = "id";
    private static final String TAG_ATTRIBUTE_NAME = "tag";
    private final FragmentAccessor mAccessor;
    
    private FragmentDescriptor(final FragmentCompat fragmentCompat) {
        this.mAccessor = fragmentCompat.forFragment();
    }
    
    private static void maybeRegister(final DescriptorMap descriptorMap, @h final FragmentCompat fragmentCompat) {
        if (fragmentCompat != null) {
            final Class<?> fragmentClass = fragmentCompat.getFragmentClass();
            LogUtil.d("Adding support for %s", fragmentClass.getName());
            descriptorMap.registerDescriptor(fragmentClass, (Descriptor)new FragmentDescriptor(fragmentCompat));
        }
    }
    
    public static DescriptorMap register(final DescriptorMap descriptorMap) {
        maybeRegister(descriptorMap, FragmentCompat.getSupportLibInstance());
        maybeRegister(descriptorMap, FragmentCompat.getFrameworkInstance());
        return descriptorMap;
    }
    
    @h
    @Override
    public Object getElementToHighlightAtPosition(Object elementToHighlightAtPosition, final int n, final int n2, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final Object o = null;
        Object view;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            view = this.mAccessor.getView(elementToHighlightAtPosition);
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(view);
        }
        else {
            view = (highlightableDescriptor = null);
        }
        if (highlightableDescriptor == null) {
            elementToHighlightAtPosition = o;
        }
        else {
            elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(view, n, n2, rect);
        }
        return elementToHighlightAtPosition;
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final Object o, final Rect rect) {
        return this.mAccessor.getView(o);
    }
    
    @Override
    protected void onGetAttributes(final Object o, final AttributeAccumulator attributeAccumulator) {
        final int id = this.mAccessor.getId(o);
        if (id != 0) {
            attributeAccumulator.store("id", ResourcesUtil.getIdStringQuietly(o, this.mAccessor.getResources(o), id));
        }
        final String tag = this.mAccessor.getTag(o);
        if (tag != null && tag.length() > 0) {
            attributeAccumulator.store("tag", tag);
        }
    }
    
    @Override
    protected void onGetChildren(final Object o, final Accumulator<Object> accumulator) {
        final View view = this.mAccessor.getView(o);
        if (view != null) {
            accumulator.store(view);
        }
    }
}
