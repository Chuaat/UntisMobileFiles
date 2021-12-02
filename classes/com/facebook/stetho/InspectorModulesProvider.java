// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho;

import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public interface InspectorModulesProvider
{
    Iterable<ChromeDevtoolsDomain> get();
}
