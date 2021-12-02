// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import androidx.annotation.j0;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;

public final class a extends l<AssetFileDescriptor>
{
    public a(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    @j0
    @Override
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }
    
    protected void g(final AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }
    
    protected AssetFileDescriptor h(final Uri obj, final ContentResolver contentResolver) throws FileNotFoundException {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(obj, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(obj);
        throw new FileNotFoundException(sb.toString());
    }
}
