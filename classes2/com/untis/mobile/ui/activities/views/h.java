// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import java.util.concurrent.atomic.AtomicInteger;

public class h
{
    private static final AtomicInteger a;
    
    static {
        a = new AtomicInteger(1);
    }
    
    public static int a() {
        AtomicInteger a;
        int value;
        int newValue;
        do {
            a = h.a;
            value = a.get();
            if ((newValue = value + 1) > 16777215) {
                newValue = 1;
            }
        } while (!a.compareAndSet(value, newValue));
        return value;
    }
}
