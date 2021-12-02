// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;

public class b<Data> implements n<byte[], Data>
{
    private final b<Data> a;
    
    public b(final b<Data> a) {
        this.a = a;
    }
    
    public n.a<Data> c(@j0 final byte[] array, final int n, final int n2, @j0 final j j) {
        return (n.a<Data>)new n.a(new e(array), new c<Object>(array, (b<Object>)this.a));
    }
    
    public boolean d(@j0 final byte[] array) {
        return true;
    }
    
    public static class a implements o<byte[], ByteBuffer>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<byte[], ByteBuffer> c(@j0 final r r) {
            return new b<ByteBuffer>((b<ByteBuffer>)new b<ByteBuffer>() {
                @Override
                public Class<ByteBuffer> a() {
                    return ByteBuffer.class;
                }
                
                public ByteBuffer c(final byte[] array) {
                    return ByteBuffer.wrap(array);
                }
            });
        }
    }
    
    public interface b<Data>
    {
        Class<Data> a();
        
        Data b(final byte[] p0);
    }
    
    private static class c<Data> implements d<Data>
    {
        private final byte[] G;
        private final b<Data> H;
        
        c(final byte[] g, final b<Data> h) {
            this.G = g;
            this.H = h;
        }
        
        @j0
        @Override
        public Class<Data> a() {
            return this.H.a();
        }
        
        @Override
        public void b() {
        }
        
        @Override
        public void cancel() {
        }
        
        @j0
        @Override
        public a d() {
            return a.G;
        }
        
        @Override
        public void e(@j0 final h h, @j0 final a<? super Data> a) {
            a.f(this.H.b(this.G));
        }
    }
    
    public static class d implements o<byte[], InputStream>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<byte[], InputStream> c(@j0 final r r) {
            return new b<InputStream>((b<InputStream>)new b<InputStream>() {
                @Override
                public Class<InputStream> a() {
                    return InputStream.class;
                }
                
                public InputStream c(final byte[] buf) {
                    return new ByteArrayInputStream(buf);
                }
            });
        }
    }
}
