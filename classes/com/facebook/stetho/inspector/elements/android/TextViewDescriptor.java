// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Util;
import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import android.widget.TextView;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class TextViewDescriptor extends AbstractChainedDescriptor<TextView>
{
    private static final String TEXT_ATTRIBUTE_NAME = "text";
    private final Map<TextView, ElementContext> mElementToContextMap;
    
    TextViewDescriptor() {
        this.mElementToContextMap = Collections.synchronizedMap(new IdentityHashMap<TextView, ElementContext>());
    }
    
    @Override
    protected void onGetAttributes(final TextView textView, final AttributeAccumulator attributeAccumulator) {
        final CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            attributeAccumulator.store("text", text.toString());
        }
    }
    
    @Override
    protected void onHook(final TextView textView) {
        final ElementContext elementContext = new ElementContext();
        elementContext.hook(textView);
        this.mElementToContextMap.put(textView, elementContext);
    }
    
    @Override
    protected void onUnhook(final TextView textView) {
        this.mElementToContextMap.remove(textView).unhook();
    }
    
    private final class ElementContext implements TextWatcher
    {
        private TextView mElement;
        
        public void afterTextChanged(final Editable editable) {
            if (editable.length() == 0) {
                Descriptor.this.getHost().onAttributeRemoved(this.mElement, "text");
            }
            else {
                Descriptor.this.getHost().onAttributeModified(this.mElement, "text", editable.toString());
            }
        }
        
        public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        }
        
        public void hook(TextView mElement) {
            mElement = Util.throwIfNull(mElement);
            (this.mElement = mElement).addTextChangedListener((TextWatcher)this);
        }
        
        public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        }
        
        public void unhook() {
            final TextView mElement = this.mElement;
            if (mElement != null) {
                mElement.removeTextChangedListener((TextWatcher)this);
                this.mElement = null;
            }
        }
    }
}
