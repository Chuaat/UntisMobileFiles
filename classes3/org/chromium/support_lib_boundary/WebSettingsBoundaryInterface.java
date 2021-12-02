// 
// Decompiled by Procyon v0.5.36
// 

package org.chromium.support_lib_boundary;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

public interface WebSettingsBoundaryInterface
{
    int getDisabledActionModeMenuItems();
    
    int getForceDark();
    
    int getForceDarkBehavior();
    
    boolean getOffscreenPreRaster();
    
    boolean getSafeBrowsingEnabled();
    
    boolean getWillSuppressErrorPage();
    
    void setDisabledActionModeMenuItems(final int p0);
    
    void setForceDark(final int p0);
    
    void setForceDarkBehavior(final int p0);
    
    void setOffscreenPreRaster(final boolean p0);
    
    void setSafeBrowsingEnabled(final boolean p0);
    
    void setWillSuppressErrorPage(final boolean p0);
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }
}
