// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Util;
import android.app.Application;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class AndroidDocumentRoot extends AbstractChainedDescriptor<AndroidDocumentRoot>
{
    private final Application mApplication;
    
    public AndroidDocumentRoot(final Application application) {
        this.mApplication = Util.throwIfNull(application);
    }
    
    @Override
    protected void onGetChildren(final AndroidDocumentRoot androidDocumentRoot, final Accumulator<Object> accumulator) {
        accumulator.store(this.mApplication);
    }
    
    @Override
    protected String onGetNodeName(final AndroidDocumentRoot androidDocumentRoot) {
        return "root";
    }
    
    @Override
    protected NodeType onGetNodeType(final AndroidDocumentRoot androidDocumentRoot) {
        return NodeType.DOCUMENT_NODE;
    }
}
