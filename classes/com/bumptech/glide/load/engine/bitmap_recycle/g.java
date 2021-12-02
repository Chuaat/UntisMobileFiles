// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

public final class g implements a<byte[]>
{
    private static final String a = "ByteArrayPool";
    
    @Override
    public String J() {
        return "ByteArrayPool";
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    public int c(final byte[] array) {
        return array.length;
    }
    
    public byte[] d(final int n) {
        return new byte[n];
    }
}
