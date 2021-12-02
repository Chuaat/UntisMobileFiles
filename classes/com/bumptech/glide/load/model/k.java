// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import android.database.Cursor;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.mediastore.b;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import android.content.Context;
import java.io.File;
import android.net.Uri;

public final class k implements n<Uri, File>
{
    private final Context a;
    
    public k(final Context a) {
        this.a = a;
    }
    
    public n.a<File> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return (n.a<File>)new n.a(new e(uri), (d<Object>)new b(this.a, uri));
    }
    
    public boolean d(@j0 final Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
    
    public static final class a implements o<Uri, File>
    {
        private final Context a;
        
        public a(final Context a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Uri, File> c(final r r) {
            return new k(this.a);
        }
    }
    
    private static class b implements d<File>
    {
        private static final String[] I;
        private final Context G;
        private final Uri H;
        
        static {
            I = new String[] { "_data" };
        }
        
        b(final Context g, final Uri h) {
            this.G = g;
            this.H = h;
        }
        
        @j0
        @Override
        public Class<File> a() {
            return File.class;
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
        public void e(@j0 final h h, @j0 final d.a<? super File> a) {
            final Cursor query = this.G.getContentResolver().query(this.H, b.I, (String)null, (String[])null, (String)null);
            final String pathname = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                }
                finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty((CharSequence)pathname)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.H);
                a.c(new FileNotFoundException(sb.toString()));
            }
            else {
                a.f(new File(pathname));
            }
        }
    }
}
