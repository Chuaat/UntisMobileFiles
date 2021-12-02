// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.FileInputStream;
import java.io.InputStream;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.io.File;

public class f<Data> implements n<File, Data>
{
    private static final String b = "FileLoader";
    private final d<Data> a;
    
    public f(final d<Data> a) {
        this.a = a;
    }
    
    public n.a<Data> c(@j0 final File file, final int n, final int n2, @j0 final j j) {
        return (n.a<Data>)new n.a(new com.bumptech.glide.signature.e(file), new c<Object>(file, (d<Object>)this.a));
    }
    
    public boolean d(@j0 final File file) {
        return true;
    }
    
    public static class a<Data> implements o<File, Data>
    {
        private final d<Data> a;
        
        public a(final d<Data> a) {
            this.a = a;
        }
        
        @Override
        public final void a() {
        }
        
        @j0
        @Override
        public final n<File, Data> c(@j0 final r r) {
            return new f<Data>(this.a);
        }
    }
    
    public static class b extends a<ParcelFileDescriptor>
    {
        public b() {
            super(new d<ParcelFileDescriptor>() {
                @Override
                public Class<ParcelFileDescriptor> a() {
                    return ParcelFileDescriptor.class;
                }
                
                public void d(final ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }
                
                public ParcelFileDescriptor e(final File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            });
        }
    }
    
    private static final class c<Data> implements d<Data>
    {
        private final File G;
        private final f.d<Data> H;
        private Data I;
        
        c(final File g, final f.d<Data> h) {
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
            final Data i = this.I;
            if (i == null) {
                return;
            }
            try {
                this.H.c(i);
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
        public void e(@j0 final h h, @j0 final a<? super Data> a) {
            try {
                a.f(this.I = this.H.b(this.G));
            }
            catch (FileNotFoundException ex) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", (Throwable)ex);
                }
                a.c(ex);
            }
        }
    }
    
    public interface d<Data>
    {
        Class<Data> a();
        
        Data b(final File p0) throws FileNotFoundException;
        
        void c(final Data p0) throws IOException;
    }
    
    public static class e extends a<InputStream>
    {
        public e() {
            super(new d<InputStream>() {
                @Override
                public Class<InputStream> a() {
                    return InputStream.class;
                }
                
                public void d(final InputStream inputStream) throws IOException {
                    inputStream.close();
                }
                
                public InputStream e(final File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }
}
