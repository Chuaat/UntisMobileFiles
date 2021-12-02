// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.io.InputStream;

public class e extends h
{
    public e(final InputStream inputStream) {
        this(inputStream, false);
    }
    
    public e(final InputStream inputStream, final boolean b) {
        super(inputStream, new d(false), b);
    }
    
    public e(final InputStream inputStream, final boolean b, final int n, final byte[] array) {
        super(inputStream, new d(n, array), b);
    }
}
