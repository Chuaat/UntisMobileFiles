// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.data.mediastore.c;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.data.mediastore.b;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import com.bumptech.glide.load.model.n;

public class d implements n<Uri, InputStream>
{
    private final Context a;
    
    public d(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public n.a<InputStream> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        if (b.d(n, n2)) {
            return (n.a<InputStream>)new n.a(new e(uri), (com.bumptech.glide.load.data.d<Object>)c.f(this.a, uri));
        }
        return null;
    }
    
    public boolean d(@j0 final Uri uri) {
        return b.a(uri);
    }
    
    public static class a implements o<Uri, InputStream>
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
        public n<Uri, InputStream> c(final r r) {
            return new d(this.a);
        }
    }
}
