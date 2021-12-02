// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

class p0 implements a<Long>
{
    public void b(final Long n, final y0 y0) {
        String s;
        if (n >= -2147483648L && n <= 2147483647L) {
            s = String.format("NumberLong(%d)", n);
        }
        else {
            s = String.format("NumberLong(\"%d\")", n);
        }
        y0.d(s);
    }
}
