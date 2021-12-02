// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.io.OutputStream;

public class f extends i
{
    public f(final OutputStream outputStream) {
        this(outputStream, true);
    }
    
    public f(final OutputStream outputStream, final boolean b) {
        super(outputStream, new d(false), b);
    }
    
    public f(final OutputStream outputStream, final boolean b, final int n, final byte[] array) {
        super(outputStream, new d(n, array), b);
    }
}
