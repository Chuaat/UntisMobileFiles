// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.provider;

import androidx.annotation.j0;
import java.util.ArrayList;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;

public final class b
{
    private final List<ImageHeaderParser> a;
    
    public b() {
        this.a = new ArrayList<ImageHeaderParser>();
    }
    
    public void a(@j0 final ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.a.add(imageHeaderParser);
        }
    }
    
    @j0
    public List<ImageHeaderParser> b() {
        synchronized (this) {
            return this.a;
        }
    }
}
