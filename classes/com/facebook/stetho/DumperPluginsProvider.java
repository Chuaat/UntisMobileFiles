// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho;

import com.facebook.stetho.dumpapp.DumperPlugin;

public interface DumperPluginsProvider
{
    Iterable<DumperPlugin> get();
}
