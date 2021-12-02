// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import androidx.annotation.j0;
import android.content.res.AssetManager;
import java.io.InputStream;

public class n extends b<InputStream>
{
    public n(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    @j0
    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }
    
    protected void g(final InputStream inputStream) throws IOException {
        inputStream.close();
    }
    
    protected InputStream h(final AssetManager assetManager, final String s) throws IOException {
        return assetManager.open(s);
    }
}
