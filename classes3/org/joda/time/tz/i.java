// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

public class i
{
    static ThreadLocal<Boolean> a;
    
    static {
        i.a = new ThreadLocal<Boolean>() {
            protected Boolean a() {
                return Boolean.FALSE;
            }
        };
    }
    
    public static void a(final boolean b) {
        i.a.set(b);
    }
    
    public static boolean b() {
        return i.a.get();
    }
}
