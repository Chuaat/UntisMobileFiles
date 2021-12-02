// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

public class d0
{
    public static final int a = 0;
    public static final int b = 1;
    
    public static int a(final int n) {
        if (n >= 200 && n <= 299) {
            return 0;
        }
        if (n >= 300 && n <= 399) {
            return 1;
        }
        if (n >= 400 && n <= 499) {
            return 0;
        }
        return 1;
    }
}
