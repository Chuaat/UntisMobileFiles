// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.IOException;
import android.util.Log;
import com.bumptech.glide.util.a;
import com.bumptech.glide.load.j;
import java.io.File;
import androidx.annotation.j0;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.d;

public class c implements d<ByteBuffer>
{
    private static final String a = "ByteBufferEncoder";
    
    public boolean c(@j0 final ByteBuffer byteBuffer, @j0 final File file, @j0 final j j) {
        boolean b;
        try {
            com.bumptech.glide.util.a.e(byteBuffer, file);
            b = true;
        }
        catch (IOException ex) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", (Throwable)ex);
            }
            b = false;
        }
        return b;
    }
}
