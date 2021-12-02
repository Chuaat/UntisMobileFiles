// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import java.io.File;
import android.content.Context;

@Deprecated
public final class f extends d
{
    public f(final Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }
    
    public f(final Context context, final int n) {
        this(context, "image_manager_disk_cache", n);
    }
    
    public f(final Context context, final String s, final int n) {
        super((c)new c() {
            @Override
            public File a() {
                final File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    return null;
                }
                if (s != null) {
                    return new File(externalCacheDir, s);
                }
                return externalCacheDir;
            }
        }, n);
    }
}
