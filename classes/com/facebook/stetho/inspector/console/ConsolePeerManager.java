// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.console;

import c6.h;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class ConsolePeerManager extends ChromePeerManager
{
    private static ConsolePeerManager sInstance;
    
    private ConsolePeerManager() {
    }
    
    @h
    public static ConsolePeerManager getInstanceOrNull() {
        synchronized (ConsolePeerManager.class) {
            return ConsolePeerManager.sInstance;
        }
    }
    
    public static ConsolePeerManager getOrCreateInstance() {
        synchronized (ConsolePeerManager.class) {
            if (ConsolePeerManager.sInstance == null) {
                ConsolePeerManager.sInstance = new ConsolePeerManager();
            }
            return ConsolePeerManager.sInstance;
        }
    }
}
