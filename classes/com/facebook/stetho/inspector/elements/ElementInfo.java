// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ListUtil;
import com.facebook.stetho.common.Util;
import c6.h;
import java.util.List;
import d6.b;

@b
public final class ElementInfo
{
    public final List<Object> children;
    public final Object element;
    @h
    public final Object parentElement;
    
    ElementInfo(final Object o, @h final Object parentElement, final List<Object> list) {
        this.element = Util.throwIfNull(o);
        this.parentElement = parentElement;
        this.children = ListUtil.copyToImmutableList(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ElementInfo) {
            final ElementInfo elementInfo = (ElementInfo)o;
            if (this.element != elementInfo.element || this.parentElement != elementInfo.parentElement || !ListUtil.identityEquals((List<?>)this.children, (List<?>)elementInfo.children)) {
                b = false;
            }
            return b;
        }
        return false;
    }
}
