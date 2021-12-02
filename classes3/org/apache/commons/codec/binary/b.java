// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.io.InputStream;

public class b extends h
{
    public b(final InputStream inputStream) {
        this(inputStream, false);
    }
    
    public b(final InputStream inputStream, final boolean b) {
        super(inputStream, new a(false), b);
    }
    
    public b(final InputStream inputStream, final boolean b, final int n, final byte[] array) {
        super(inputStream, new a(n, array), b);
    }
}
