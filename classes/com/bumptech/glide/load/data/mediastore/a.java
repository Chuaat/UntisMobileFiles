// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data.mediastore;

import java.io.File;

class a
{
    public boolean a(final File file) {
        return file.exists();
    }
    
    public File b(final String pathname) {
        return new File(pathname);
    }
    
    public long c(final File file) {
        return file.length();
    }
}
