// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import androidx.annotation.j0;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.ParcelFileDescriptor;

public class i extends l<ParcelFileDescriptor>
{
    public i(final ContentResolver contentResolver, final Uri uri) {
        super(contentResolver, uri);
    }
    
    @j0
    @Override
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
    
    protected void g(final ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
    
    protected ParcelFileDescriptor h(final Uri obj, final ContentResolver contentResolver) throws FileNotFoundException {
        final AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(obj, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(obj);
        throw new FileNotFoundException(sb.toString());
    }
}
