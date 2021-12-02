// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.IOException;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.nio.ByteBuffer;
import java.io.File;

public class d implements n<File, ByteBuffer>
{
    private static final String a = "ByteBufferFileLoader";
    
    public n.a<ByteBuffer> c(@j0 final File file, final int n, final int n2, @j0 final j j) {
        return (n.a<ByteBuffer>)new n.a(new e(file), (com.bumptech.glide.load.data.d<Object>)new a(file));
    }
    
    public boolean d(@j0 final File file) {
        return true;
    }
    
    private static final class a implements d<ByteBuffer>
    {
        private final File G;
        
        a(final File g) {
            this.G = g;
        }
        
        @j0
        @Override
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
        
        @Override
        public void b() {
        }
        
        @Override
        public void cancel() {
        }
        
        @j0
        @Override
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.G;
        }
        
        @Override
        public void e(@j0 final h h, @j0 final com.bumptech.glide.load.data.d.a<? super ByteBuffer> a) {
            try {
                a.f(com.bumptech.glide.util.a.a(this.G));
            }
            catch (IOException ex) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", (Throwable)ex);
                }
                a.c(ex);
            }
        }
    }
    
    public static class b implements o<File, ByteBuffer>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<File, ByteBuffer> c(@j0 final r r) {
            return new d();
        }
    }
}
