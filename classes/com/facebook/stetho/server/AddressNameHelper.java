// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import com.facebook.stetho.common.ProcessUtil;

public class AddressNameHelper
{
    private static final String PREFIX = "stetho_";
    
    public static String createCustomAddress(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("stetho_");
        sb.append(ProcessUtil.getProcessName());
        sb.append(str);
        return sb.toString();
    }
}
