// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.InputStream;
import com.bumptech.glide.load.data.h;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import android.content.res.AssetManager;
import android.net.Uri;

public class a<Data> implements n<Uri, Data>
{
    private static final String c = "android_asset";
    private static final String d = "file:///android_asset/";
    private static final int e = 22;
    private final AssetManager a;
    private final a<Data> b;
    
    public a(final AssetManager a, final a<Data> b) {
        this.a = a;
        this.b = b;
    }
    
    public n.a<Data> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return (n.a<Data>)new n.a(new e(uri), (d<Object>)this.b.b(this.a, uri.toString().substring(com.bumptech.glide.load.model.a.e)));
    }
    
    public boolean d(@j0 final Uri uri) {
        final boolean equals = "file".equals(uri.getScheme());
        boolean b2;
        final boolean b = b2 = false;
        if (equals) {
            b2 = b;
            if (!uri.getPathSegments().isEmpty()) {
                b2 = b;
                if ("android_asset".equals(uri.getPathSegments().get(0))) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public interface a<Data>
    {
        d<Data> b(final AssetManager p0, final String p1);
    }
    
    public static class b implements o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor>
    {
        private final AssetManager a;
        
        public b(final AssetManager a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public d<ParcelFileDescriptor> b(final AssetManager assetManager, final String s) {
            return new h(assetManager, s);
        }
        
        @j0
        @Override
        public n<Uri, ParcelFileDescriptor> c(final r r) {
            return new a<ParcelFileDescriptor>(this.a, (a<ParcelFileDescriptor>)this);
        }
    }
    
    public static class c implements o<Uri, InputStream>, a<InputStream>
    {
        private final AssetManager a;
        
        public c(final AssetManager a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public d<InputStream> b(final AssetManager assetManager, final String s) {
            return new com.bumptech.glide.load.data.n(assetManager, s);
        }
        
        @j0
        @Override
        public n<Uri, InputStream> c(final r r) {
            return new a<InputStream>(this.a, (a<InputStream>)this);
        }
    }
}
