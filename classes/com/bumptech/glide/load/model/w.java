// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.InputStream;
import com.bumptech.glide.load.data.i;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.net.Uri;

public class w<Data> implements n<Uri, Data>
{
    private static final Set<String> b;
    private final c<Data> a;
    
    static {
        b = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("file", "android.resource", "content")));
    }
    
    public w(final c<Data> a) {
        this.a = a;
    }
    
    public n.a<Data> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return (n.a<Data>)new n.a(new e(uri), (com.bumptech.glide.load.data.d<Object>)this.a.b(uri));
    }
    
    public boolean d(@j0 final Uri uri) {
        return w.b.contains(uri.getScheme());
    }
    
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor>
    {
        private final ContentResolver a;
        
        public a(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(final Uri uri) {
            return new com.bumptech.glide.load.data.a(this.a, uri);
        }
        
        @Override
        public n<Uri, AssetFileDescriptor> c(final r r) {
            return new w<AssetFileDescriptor>((c<AssetFileDescriptor>)this);
        }
    }
    
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor>
    {
        private final ContentResolver a;
        
        public b(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(final Uri uri) {
            return new i(this.a, uri);
        }
        
        @j0
        @Override
        public n<Uri, ParcelFileDescriptor> c(final r r) {
            return new w<ParcelFileDescriptor>((c<ParcelFileDescriptor>)this);
        }
    }
    
    public interface c<Data>
    {
        com.bumptech.glide.load.data.d<Data> b(final Uri p0);
    }
    
    public static class d implements o<Uri, InputStream>, c<InputStream>
    {
        private final ContentResolver a;
        
        public d(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public com.bumptech.glide.load.data.d<InputStream> b(final Uri uri) {
            return new com.bumptech.glide.load.data.o(this.a, uri);
        }
        
        @j0
        @Override
        public n<Uri, InputStream> c(final r r) {
            return new w<InputStream>((c<InputStream>)this);
        }
    }
}
