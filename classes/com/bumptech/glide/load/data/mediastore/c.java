// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data.mediastore;

import android.provider.MediaStore$Video$Thumbnails;
import android.provider.MediaStore$Images$Thumbnails;
import android.database.Cursor;
import android.content.ContentResolver;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import java.io.IOException;
import androidx.annotation.j0;
import java.io.FileNotFoundException;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.b;
import android.content.Context;
import androidx.annotation.b1;
import android.net.Uri;
import java.io.InputStream;
import com.bumptech.glide.load.data.d;

public class c implements d<InputStream>
{
    private static final String J = "MediaStoreThumbFetcher";
    private final Uri G;
    private final e H;
    private InputStream I;
    
    @b1
    c(final Uri g, final e h) {
        this.G = g;
        this.H = h;
    }
    
    private static c c(final Context context, final Uri uri, final com.bumptech.glide.load.data.mediastore.d d) {
        return new c(uri, new e(com.bumptech.glide.b.d(context).m().g(), d, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }
    
    public static c f(final Context context, final Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }
    
    public static c g(final Context context, final Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }
    
    private InputStream h() throws FileNotFoundException {
        final InputStream d = this.H.d(this.G);
        int a;
        if (d != null) {
            a = this.H.a(this.G);
        }
        else {
            a = -1;
        }
        InputStream inputStream = d;
        if (a != -1) {
            inputStream = new g(d, a);
        }
        return inputStream;
    }
    
    @j0
    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }
    
    @Override
    public void b() {
        final InputStream i = this.I;
        if (i == null) {
            return;
        }
        try {
            i.close();
        }
        catch (IOException ex) {}
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
    public void e(@j0 final h h, @j0 final d.a<? super InputStream> a) {
        try {
            a.f(this.I = this.h());
        }
        catch (FileNotFoundException ex) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", (Throwable)ex);
            }
            a.c(ex);
        }
    }
    
    static class a implements d
    {
        private static final String[] b;
        private static final String c = "kind = 1 AND image_id = ?";
        private final ContentResolver a;
        
        static {
            b = new String[] { "_data" };
        }
        
        a(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
        public Cursor a(final Uri uri) {
            return this.a.query(MediaStore$Images$Thumbnails.EXTERNAL_CONTENT_URI, com.bumptech.glide.load.data.mediastore.c.a.b, "kind = 1 AND image_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
        }
    }
    
    static class b implements d
    {
        private static final String[] b;
        private static final String c = "kind = 1 AND video_id = ?";
        private final ContentResolver a;
        
        static {
            b = new String[] { "_data" };
        }
        
        b(final ContentResolver a) {
            this.a = a;
        }
        
        @Override
        public Cursor a(final Uri uri) {
            return this.a.query(MediaStore$Video$Thumbnails.EXTERNAL_CONTENT_URI, com.bumptech.glide.load.data.mediastore.c.b.b, "kind = 1 AND video_id = ?", new String[] { uri.getLastPathSegment() }, (String)null);
        }
    }
}
