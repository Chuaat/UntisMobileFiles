// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import androidx.annotation.j0;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

public class h extends b<ParcelFileDescriptor>
{
    public h(final AssetManager assetManager, final String s) {
        super(assetManager, s);
    }
    
    @j0
    @Override
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
    
    protected void g(final ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
    
    protected ParcelFileDescriptor h(final AssetManager assetManager, final String s) throws IOException {
        return assetManager.openFd(s).getParcelFileDescriptor();
    }
}
