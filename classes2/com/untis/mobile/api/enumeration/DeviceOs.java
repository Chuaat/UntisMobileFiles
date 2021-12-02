// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.enumeration;

public enum DeviceOs
{
    AND("Android"), 
    IOS("IOS"), 
    WIN("Windows");
    
    private final String description;
    
    private DeviceOs(final String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
