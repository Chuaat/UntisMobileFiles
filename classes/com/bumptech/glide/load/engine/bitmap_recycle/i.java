// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

public final class i implements a<int[]>
{
    private static final String a = "IntegerArrayPool";
    
    @Override
    public String J() {
        return "IntegerArrayPool";
    }
    
    @Override
    public int a() {
        return 4;
    }
    
    public int c(final int[] array) {
        return array.length;
    }
    
    public int[] d(final int n) {
        return new int[n];
    }
}
