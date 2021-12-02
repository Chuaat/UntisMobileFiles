// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import com.google.android.gms.vision.e;
import java.util.HashMap;

public final class na
{
    private static final Object a;
    private static final HashMap<String, Integer> b;
    
    static {
        a = new Object();
        b = new HashMap<String, Integer>();
    }
    
    public static boolean a(String s, final String s2) {
        synchronized (na.a) {
            final String value = String.valueOf(s);
            s = String.valueOf(s2);
            if (s.length() != 0) {
                s = value.concat(s);
            }
            else {
                s = new String(value);
            }
            final HashMap<String, Integer> b = na.b;
            int intValue;
            if (b.containsKey(s)) {
                intValue = b.get(s);
            }
            else {
                intValue = 0;
            }
            if ((intValue & 0x1) != 0x0) {
                return true;
            }
            try {
                System.loadLibrary(s2);
                b.put(s, intValue | 0x1);
                return true;
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                if ((intValue & 0x4) == 0x0) {
                    e.d(unsatisfiedLinkError, "System.loadLibrary failed: %s", s2);
                    na.b.put(s, intValue | 0x4);
                }
                return false;
            }
        }
    }
}
