// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import org.apache.commons.codec.f;

class g
{
    private static final int a = 16;
    
    static int a(final byte i) throws f {
        final int digit = Character.digit((char)i, 16);
        if (digit != -1) {
            return digit;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid URL encoding: not a valid digit (radix 16): ");
        sb.append(i);
        throw new f(sb.toString());
    }
    
    static char b(final int n) {
        return Character.toUpperCase(Character.forDigit(n & 0xF, 16));
    }
}
