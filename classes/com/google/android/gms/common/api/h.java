// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class h
{
    @RecentlyNonNull
    public static final int a = -1;
    @RecentlyNonNull
    public static final int b = 0;
    @Deprecated
    @RecentlyNonNull
    public static final int c = 2;
    @Deprecated
    @RecentlyNonNull
    public static final int d = 3;
    @RecentlyNonNull
    public static final int e = 4;
    @RecentlyNonNull
    public static final int f = 5;
    @RecentlyNonNull
    public static final int g = 6;
    @RecentlyNonNull
    public static final int h = 7;
    @RecentlyNonNull
    public static final int i = 8;
    @RecentlyNonNull
    public static final int j = 10;
    @RecentlyNonNull
    public static final int k = 13;
    @RecentlyNonNull
    public static final int l = 14;
    @RecentlyNonNull
    public static final int m = 15;
    @RecentlyNonNull
    public static final int n = 16;
    @RecentlyNonNull
    public static final int o = 17;
    @RecentlyNonNull
    public static final int p = 19;
    @RecentlyNonNull
    public static final int q = 20;
    @RecentlyNonNull
    public static final int r = 21;
    @RecentlyNonNull
    public static final int s = 22;
    
    @a
    protected h() {
    }
    
    @j0
    public static String a(@RecentlyNonNull final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            }
            case 22: {
                return "RECONNECTION_TIMED_OUT";
            }
            case 21: {
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            }
            case 20: {
                return "CONNECTION_SUSPENDED_DURING_CALL";
            }
            case 19: {
                return "REMOTE_EXCEPTION";
            }
            case 18: {
                return "DEAD_CLIENT";
            }
            case 17: {
                return "API_NOT_CONNECTED";
            }
            case 16: {
                return "CANCELED";
            }
            case 15: {
                return "TIMEOUT";
            }
            case 14: {
                return "INTERRUPTED";
            }
            case 13: {
                return "ERROR";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "SUCCESS_CACHE";
            }
        }
    }
}
