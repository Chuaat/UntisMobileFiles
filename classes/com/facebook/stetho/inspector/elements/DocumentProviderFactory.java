// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;

public interface DocumentProviderFactory extends ThreadBound
{
    DocumentProvider create();
}
