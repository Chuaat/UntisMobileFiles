// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.format.a;

public class p extends IllegalArgumentException
{
    private static final long G = 2858712538216L;
    
    public p(final long n, final String s) {
        super(a(n, s));
    }
    
    public p(final String s) {
        super(s);
    }
    
    private static String a(final long n, String string) {
        final String v = a.f("yyyy-MM-dd'T'HH:mm:ss.SSS").v(new q(n));
        if (string != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(string);
            sb.append(")");
            string = sb.toString();
        }
        else {
            string = "";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        sb2.append(v);
        sb2.append(string);
        return sb2.toString();
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof p || (t.getCause() != null && t.getCause() != t && b(t.getCause()));
    }
}
