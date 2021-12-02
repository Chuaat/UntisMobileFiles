// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.data.mediastore.c;
import com.bumptech.glide.load.data.mediastore.b;
import androidx.annotation.k0;
import com.bumptech.glide.load.resource.bitmap.j0;
import com.bumptech.glide.load.j;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import com.bumptech.glide.load.model.n;

public class e implements n<Uri, InputStream>
{
    private final Context a;
    
    public e(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    private boolean e(final j j) {
        final Long n = j.c(j0.g);
        return n != null && n == -1L;
    }
    
    @k0
    public n.a<InputStream> c(@androidx.annotation.j0 final Uri uri, final int n, final int n2, @androidx.annotation.j0 final j j) {
        if (b.d(n, n2) && this.e(j)) {
            return (n.a<InputStream>)new n.a(new com.bumptech.glide.signature.e(uri), (d<Object>)c.g(this.a, uri));
        }
        return null;
    }
    
    public boolean d(@androidx.annotation.j0 final Uri uri) {
        return b.c(uri);
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
        
        @androidx.annotation.j0
        @Override
        public n<Uri, InputStream> c(final r r) {
            return new e(this.a);
        }
    }
}
