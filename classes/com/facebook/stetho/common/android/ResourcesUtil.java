// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import c6.g;
import com.facebook.stetho.common.LogUtil;
import android.content.res.Resources$NotFoundException;
import c6.h;
import android.content.res.Resources;

public class ResourcesUtil
{
    private ResourcesUtil() {
    }
    
    private static String getFallbackIdString(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
    
    public static String getIdString(@h final Resources resources, final int n) throws Resources$NotFoundException {
        if (resources == null) {
            return getFallbackIdString(n);
        }
        final int resourcePackageId = getResourcePackageId(n);
        String resourcePackageName = "";
        String str;
        if (resourcePackageId != 127) {
            resourcePackageName = resources.getResourcePackageName(n);
            str = ":";
        }
        else {
            str = "";
        }
        final String resourceTypeName = resources.getResourceTypeName(n);
        final String resourceEntryName = resources.getResourceEntryName(n);
        final StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }
    
    @g
    public static String getIdStringQuietly(final Object obj, @h final Resources resources, final int n) {
        try {
            return getIdString(resources, n);
        }
        catch (Resources$NotFoundException ex) {
            final String fallbackIdString = getFallbackIdString(n);
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown identifier encountered on ");
            sb.append(obj);
            sb.append(": ");
            sb.append(fallbackIdString);
            LogUtil.w(sb.toString());
            return fallbackIdString;
        }
    }
    
    private static int getResourcePackageId(final int n) {
        return n >>> 24 & 0xFF;
    }
}
