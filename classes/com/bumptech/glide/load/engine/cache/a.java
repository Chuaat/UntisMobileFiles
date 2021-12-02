// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import androidx.annotation.j0;
import androidx.annotation.k0;
import java.io.File;
import com.bumptech.glide.load.g;

public interface a
{
    void a(final g p0, final b p1);
    
    @k0
    File b(final g p0);
    
    void c(final g p0);
    
    void clear();
    
    public interface a
    {
        public static final int a = 262144000;
        public static final String b = "image_manager_disk_cache";
        
        @k0
        com.bumptech.glide.load.engine.cache.a h();
    }
    
    public interface b
    {
        boolean a(@j0 final File p0);
    }
}
