// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import java.io.IOException;
import android.util.Log;
import com.bumptech.glide.util.a;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import java.io.File;
import androidx.annotation.j0;
import com.bumptech.glide.load.m;

public class d implements m<c>
{
    private static final String a = "GifEncoder";
    
    @j0
    @Override
    public com.bumptech.glide.load.c b(@j0 final j j) {
        return com.bumptech.glide.load.c.G;
    }
    
    public boolean c(@j0 final v<c> v, @j0 final File file, @j0 final j j) {
        final c c = v.get();
        boolean b;
        try {
            com.bumptech.glide.util.a.e(c.f(), file);
            b = true;
        }
        catch (IOException ex) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", (Throwable)ex);
            }
            b = false;
        }
        return b;
    }
}
