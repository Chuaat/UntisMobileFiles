// 
// Decompiled by Procyon v0.5.36
// 

package org.chromium.support_lib_boundary;

public interface ServiceWorkerWebSettingsBoundaryInterface
{
    boolean getAllowContentAccess();
    
    boolean getAllowFileAccess();
    
    boolean getBlockNetworkLoads();
    
    int getCacheMode();
    
    void setAllowContentAccess(final boolean p0);
    
    void setAllowFileAccess(final boolean p0);
    
    void setBlockNetworkLoads(final boolean p0);
    
    void setCacheMode(final int p0);
}
