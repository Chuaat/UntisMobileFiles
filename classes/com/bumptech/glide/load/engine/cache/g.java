// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import androidx.annotation.k0;
import java.io.File;
import android.content.Context;

public final class g extends d
{
    public g(final Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }
    
    public g(final Context context, final long n) {
        this(context, "image_manager_disk_cache", n);
    }
    
    public g(final Context context, final String s, final long n) {
        super((c)new c() {
            @k0
            private File b() {
                final File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                if (s != null) {
                    return new File(cacheDir, s);
                }
                return cacheDir;
            }
            
            @Override
            public File a() {
                final File b = this.b();
                if (b != null && b.exists()) {
                    return b;
                }
                final File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null || !externalCacheDir.canWrite()) {
                    return b;
                }
                if (s != null) {
                    return new File(externalCacheDir, s);
                }
                return externalCacheDir;
            }
        }, n);
    }
}
