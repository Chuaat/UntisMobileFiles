// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.io.OutputStream;

public class c extends i
{
    public c(final OutputStream outputStream) {
        this(outputStream, true);
    }
    
    public c(final OutputStream outputStream, final boolean b) {
        super(outputStream, new a(false), b);
    }
    
    public c(final OutputStream outputStream, final boolean b, final int n, final byte[] array) {
        super(outputStream, new a(n, array), b);
    }
}
