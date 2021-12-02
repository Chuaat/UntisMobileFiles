// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.diagnostics;

import e7.a;

public final class c
{
    public static final String a = "org.bson";
    private static final boolean b;
    
    static {
        b = b();
    }
    
    private c() {
    }
    
    public static b a(String string) {
        e7.a.e("suffix", string);
        if (string.startsWith(".") || string.endsWith(".")) {
            throw new IllegalArgumentException("The suffix can not start or end with a '.'");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("org.bson.");
        sb.append(string);
        string = sb.toString();
        if (c.b) {
            return new d(string);
        }
        return new org.bson.diagnostics.a(string);
    }
    
    private static boolean b() {
        try {
            Class.forName("org.slf4j.Logger");
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
}
