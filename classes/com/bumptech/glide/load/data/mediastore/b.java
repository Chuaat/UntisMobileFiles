// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

public final class b
{
    private static final int a = 512;
    private static final int b = 384;
    
    private b() {
    }
    
    public static boolean a(final Uri uri) {
        return b(uri) && !e(uri);
    }
    
    public static boolean b(final Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
    
    public static boolean c(final Uri uri) {
        return b(uri) && e(uri);
    }
    
    public static boolean d(final int n, final int n2) {
        return n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE && n <= 512 && n2 <= 384;
    }
    
    private static boolean e(final Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
