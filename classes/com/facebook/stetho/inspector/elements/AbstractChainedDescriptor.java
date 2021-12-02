// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Util;
import c6.h;
import com.facebook.stetho.common.Accumulator;

public abstract class AbstractChainedDescriptor<E> extends Descriptor<E> implements ChainedDescriptor<E>
{
    private Descriptor<? super E> mSuper;
    
    @Override
    public final void getAttributes(final E e, final AttributeAccumulator attributeAccumulator) {
        this.mSuper.getAttributes((Object)e, attributeAccumulator);
        this.onGetAttributes(e, attributeAccumulator);
    }
    
    @Override
    public final void getChildren(final E e, final Accumulator<Object> accumulator) {
        this.mSuper.getChildren((Object)e, accumulator);
        this.onGetChildren(e, accumulator);
    }
    
    @Override
    public void getComputedStyles(final E e, final ComputedStyleAccumulator computedStyleAccumulator) {
        this.mSuper.getComputedStyles((Object)e, computedStyleAccumulator);
        this.onGetComputedStyles(e, computedStyleAccumulator);
    }
    
    @Override
    public final String getLocalName(final E e) {
        return this.onGetLocalName(e);
    }
    
    @Override
    public final String getNodeName(final E e) {
        return this.onGetNodeName(e);
    }
    
    @Override
    public final NodeType getNodeType(final E e) {
        return this.onGetNodeType(e);
    }
    
    @Override
    public final String getNodeValue(final E e) {
        return this.onGetNodeValue(e);
    }
    
    @Override
    public final void getStyleRuleNames(final E e, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
        this.mSuper.getStyleRuleNames((Object)e, styleRuleNameAccumulator);
        this.onGetStyleRuleNames(e, styleRuleNameAccumulator);
    }
    
    @Override
    public final void getStyles(final E e, final String s, final StyleAccumulator styleAccumulator) {
        this.mSuper.getStyles((Object)e, s, styleAccumulator);
        this.onGetStyles(e, s, styleAccumulator);
    }
    
    final Descriptor<? super E> getSuper() {
        return this.mSuper;
    }
    
    @Override
    public final void hook(final E e) {
        this.verifyThreadAccess();
        this.mSuper.hook((Object)e);
        this.onHook(e);
    }
    
    protected void onGetAttributes(final E e, final AttributeAccumulator attributeAccumulator) {
    }
    
    protected void onGetChildren(final E e, final Accumulator<Object> accumulator) {
    }
    
    protected void onGetComputedStyles(final E e, final ComputedStyleAccumulator computedStyleAccumulator) {
    }
    
    protected String onGetLocalName(final E e) {
        return this.mSuper.getLocalName((Object)e);
    }
    
    protected String onGetNodeName(final E e) {
        return this.mSuper.getNodeName((Object)e);
    }
    
    protected NodeType onGetNodeType(final E e) {
        return this.mSuper.getNodeType((Object)e);
    }
    
    @h
    public String onGetNodeValue(final E e) {
        return this.mSuper.getNodeValue((Object)e);
    }
    
    protected void onGetStyleRuleNames(final E e, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }
    
    protected void onGetStyles(final E e, final String s, final StyleAccumulator styleAccumulator) {
    }
    
    protected void onHook(final E e) {
    }
    
    protected void onSetAttributesAsText(final E e, final String s) {
        this.mSuper.setAttributesAsText((Object)e, s);
    }
    
    protected void onSetStyle(final E e, final String s, final String s2, final String s3) {
    }
    
    protected void onUnhook(final E e) {
    }
    
    @Override
    public final void setAttributesAsText(final E e, final String s) {
        this.onSetAttributesAsText(e, s);
    }
    
    @Override
    public final void setStyle(final E e, final String s, final String s2, final String s3) {
        this.mSuper.setStyle((Object)e, s, s2, s3);
        this.onSetStyle(e, s, s2, s3);
    }
    
    @Override
    public void setSuper(final Descriptor<? super E> mSuper) {
        Util.throwIfNull(mSuper);
        final Descriptor<? super E> mSuper2 = this.mSuper;
        if (mSuper != mSuper2) {
            if (mSuper2 != null) {
                throw new IllegalStateException();
            }
            this.mSuper = mSuper;
        }
    }
    
    @Override
    public final void unhook(final E e) {
        this.verifyThreadAccess();
        this.onUnhook(e);
        this.mSuper.unhook((Object)e);
    }
}
