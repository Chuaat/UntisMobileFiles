// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.ByteArrayInputStream;
import android.util.Base64;
import java.io.InputStream;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import java.io.IOException;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;

public final class e<Model, Data> implements n<Model, Data>
{
    private static final String b = "data:image";
    private static final String c = ";base64";
    private final a<Data> a;
    
    public e(final a<Data> a) {
        this.a = a;
    }
    
    @Override
    public boolean a(@j0 final Model model) {
        return model.toString().startsWith("data:image");
    }
    
    @Override
    public n.a<Data> b(@j0 final Model model, final int n, final int n2, @j0 final j j) {
        return (n.a<Data>)new n.a(new com.bumptech.glide.signature.e(model), new b<Object>(model.toString(), (a<Object>)this.a));
    }
    
    public interface a<Data>
    {
        Class<Data> a();
        
        Data b(final String p0) throws IllegalArgumentException;
        
        void c(final Data p0) throws IOException;
    }
    
    private static final class b<Data> implements d<Data>
    {
        private final String G;
        private final e.a<Data> H;
        private Data I;
        
        b(final String g, final e.a<Data> h) {
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
            try {
                this.H.c(this.I);
            }
            catch (IOException ex) {}
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
        public void e(@j0 final h h, @j0 final d.a<? super Data> a) {
            try {
                a.f(this.I = this.H.b(this.G));
            }
            catch (IllegalArgumentException ex) {
                a.c(ex);
            }
        }
    }
    
    public static final class c<Model> implements o<Model, InputStream>
    {
        private final a<InputStream> a;
        
        public c() {
            this.a = new a<InputStream>() {
                @Override
                public Class<InputStream> a() {
                    return InputStream.class;
                }
                
                public void d(final InputStream inputStream) throws IOException {
                    inputStream.close();
                }
                
                public InputStream e(final String s) {
                    if (!s.startsWith("data:image")) {
                        throw new IllegalArgumentException("Not a valid image data URL.");
                    }
                    final int index = s.indexOf(44);
                    if (index == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    }
                    if (s.substring(0, index).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(s.substring(index + 1), 0));
                    }
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            };
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Model, InputStream> c(@j0 final r r) {
            return new e<Model, InputStream>(this.a);
        }
    }
}
