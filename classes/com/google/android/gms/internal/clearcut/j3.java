// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class j3
{
    private final String a;
    private int b;
    
    j3(final String a) {
        this.a = a;
        this.b = 0;
    }
    
    final boolean a() {
        return this.b < this.a.length();
    }
    
    final int b() {
        final char char1 = this.a.charAt(this.b++);
        if (char1 < '\ud800') {
            return char1;
        }
        int n = char1 & '\u1fff';
        int n2 = 13;
        char char2;
        while (true) {
            char2 = this.a.charAt(this.b++);
            if (char2 < '\ud800') {
                break;
            }
            n |= (char2 & '\u1fff') << n2;
            n2 += 13;
        }
        return n | char2 << n2;
    }
}
