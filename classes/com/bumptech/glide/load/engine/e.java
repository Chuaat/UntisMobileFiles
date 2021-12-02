// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import java.io.File;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.engine.cache.a;

class e<DataType> implements b
{
    private final d<DataType> a;
    private final DataType b;
    private final j c;
    
    e(final d<DataType> a, final DataType b, final j c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean a(@j0 final File file) {
        return this.a.a(this.b, file, this.c);
    }
}
