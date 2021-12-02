// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

public class d
{
    int a;
    String b;
    
    public d(final int a, String s) {
        this.a = a;
        if (s != null && s.trim().length() != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(" (response: ");
            sb.append(c.o(a));
            sb.append(")");
            s = sb.toString();
        }
        else {
            s = c.o(a);
        }
        this.b = s;
    }
    
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    public boolean c() {
        return this.d() ^ true;
    }
    
    public boolean d() {
        return this.a == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IabResult: ");
        sb.append(this.a());
        return sb.toString();
    }
}
