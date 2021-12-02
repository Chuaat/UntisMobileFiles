// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;

public final class ObjectDescriptor extends Descriptor<Object>
{
    @Override
    public void getAttributes(final Object o, final AttributeAccumulator attributeAccumulator) {
    }
    
    @Override
    public void getChildren(final Object o, final Accumulator<Object> accumulator) {
    }
    
    @Override
    public void getComputedStyles(final Object o, final ComputedStyleAccumulator computedStyleAccumulator) {
    }
    
    @Override
    public String getLocalName(final Object o) {
        return this.getNodeName(o);
    }
    
    @Override
    public String getNodeName(final Object o) {
        return o.getClass().getName();
    }
    
    @Override
    public NodeType getNodeType(final Object o) {
        return NodeType.ELEMENT_NODE;
    }
    
    @Override
    public String getNodeValue(final Object o) {
        return null;
    }
    
    @Override
    public void getStyleRuleNames(final Object o, final StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }
    
    @Override
    public void getStyles(final Object o, final String s, final StyleAccumulator styleAccumulator) {
    }
    
    @Override
    public void hook(final Object o) {
    }
    
    @Override
    public void setAttributesAsText(final Object o, final String s) {
    }
    
    @Override
    public void setStyle(final Object o, final String s, final String s2, final String s3) {
    }
    
    @Override
    public void unhook(final Object o) {
    }
}
