// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import java.io.File;
import android.content.Context;

public final class h extends d
{
    public h(final Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }
    
    public h(final Context context, final long n) {
        this(context, "image_manager_disk_cache", n);
    }
    
    public h(final Context context, final String s, final long n) {
        super((c)new c() {
            @Override
            public File a() {
                final File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                if (s != null) {
                    return new File(cacheDir, s);
                }
                return cacheDir;
            }
        }, n);
    }
}
