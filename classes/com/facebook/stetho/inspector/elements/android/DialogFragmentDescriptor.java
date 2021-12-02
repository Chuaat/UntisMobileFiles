// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Util;
import android.view.View;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.inspector.elements.NodeType;
import android.graphics.Rect;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.common.LogUtil;
import c6.h;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.common.android.DialogFragmentAccessor;
import com.facebook.stetho.inspector.elements.ChainedDescriptor;
import com.facebook.stetho.inspector.elements.Descriptor;

final class DialogFragmentDescriptor extends Descriptor<Object> implements ChainedDescriptor<Object>, HighlightableDescriptor<Object>
{
    private final DialogFragmentAccessor mAccessor;
    private Descriptor<? super Object> mSuper;
    
    private DialogFragmentDescriptor(final FragmentCompat fragmentCompat) {
        this.mAccessor = fragmentCompat.forDialogFragment();
    }
    
    private static void maybeRegister(final DescriptorMap descriptorMap, @h final FragmentCompat fragmentCompat) {
        if (fragmentCompat != null) {
            final Class<?> dialogFragmentClass = fragmentCompat.getDialogFragmentClass();
            LogUtil.d("Adding support for %s", dialogFragmentClass);
            descriptorMap.registerDescriptor(dialogFragmentClass, (Descriptor)new DialogFragmentDescriptor(fragmentCompat));
        }
    }
    
    public static DescriptorMap register(final DescriptorMap descriptorMap) {
        maybeRegister(descriptorMap, FragmentCompat.getSupportLibInstance());
        maybeRegister(descriptorMap, FragmentCompat.getFrameworkInstance());
        return descriptorMap;
    }
    
    @Override
    public void getAttributes(final Object o, final AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes(o, attributeAccumulator);
    }
    
    @Override
    public void getChildren(final Object o, final Accumulator<Object> accumulator) {
        accumulator.store(this.mAccessor.getDialog(o));
    }
    
    @Override
    public void getComputedStyles(final Object o, final ComputedStyleAccumulator computedStyleAccumulator) {
    }
    
    @h
    @Override
    public Object getElementToHighlightAtPosition(Object elementToHighlightAtPosition, final int n, final int n2, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final Object o = null;
        Object dialog;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            dialog = this.mAccessor.getDialog(elementToHighlightAtPosition);
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(dialog);
        }
        else {
            dialog = (highlightableDescriptor = null);
        }
        if (highlightableDescriptor == null) {
            elementToHighlightAtPosition = o;
        }
        else {
            elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(dialog, n, n2, rect);
        }
        return elementToHighlightAtPosition;
    }
    
    @Override
    public String getLocalName(final Object o) {
        return this.mSuper.getLocalName(o);
    }
    
    @Override
    public String getNodeName(final Object o) {
        return this.mSuper.getNodeName(o);
    }
    
    @Override
    public NodeType getNodeType(final Object o) {
        return this.mSuper.getNodeType(o);
    }
    
    @h
    @Override
    public String getNodeValue(final Object o) {
        return this.mSuper.getNodeValue(o);
    }
    
    @Override
    public void getStyleRuleNames(final Object o, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }
    
    @Override
    public void getStyles(final Object o, final String s, final StyleAccumulator styleAccumulator) {
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final Object o, final Rect rect) {
        final Host host = this.getHost();
        final boolean b = host instanceof AndroidDescriptorHost;
        final View view = null;
        Object dialog;
        HighlightableDescriptor highlightableDescriptor;
        if (b) {
            dialog = this.mAccessor.getDialog(o);
            highlightableDescriptor = ((AndroidDescriptorHost)host).getHighlightableDescriptor(dialog);
        }
        else {
            dialog = (highlightableDescriptor = null);
        }
        View viewAndBoundsForHighlighting;
        if (highlightableDescriptor == null) {
            viewAndBoundsForHighlighting = view;
        }
        else {
            viewAndBoundsForHighlighting = highlightableDescriptor.getViewAndBoundsForHighlighting(dialog, rect);
        }
        return viewAndBoundsForHighlighting;
    }
    
    @Override
    public void hook(final Object o) {
        this.mSuper.hook(o);
    }
    
    @Override
    public void setAttributesAsText(final Object o, final String s) {
        this.mSuper.setAttributesAsText(o, s);
    }
    
    @Override
    public void setStyle(final Object o, final String s, final String s2, final String s3) {
    }
    
    @Override
    public void setSuper(final Descriptor<? super Object> mSuper) {
        Util.throwIfNull(mSuper);
        final Descriptor<? super Object> mSuper2 = this.mSuper;
        if (mSuper != mSuper2) {
            if (mSuper2 != null) {
                throw new IllegalStateException();
            }
            this.mSuper = mSuper;
        }
    }
    
    @Override
    public void unhook(final Object o) {
        this.mSuper.unhook(o);
    }
}
