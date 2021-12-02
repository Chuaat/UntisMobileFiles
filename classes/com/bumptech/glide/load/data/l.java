// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.FileNotFoundException;
import android.util.Log;
import com.bumptech.glide.h;
import androidx.annotation.j0;
import com.bumptech.glide.load.a;
import java.io.IOException;
import android.content.ContentResolver;
import android.net.Uri;

public abstract class l<T> implements d<T>
{
    private static final String J = "LocalUriFetcher";
    private final Uri G;
    private final ContentResolver H;
    private T I;
    
    public l(final ContentResolver h, final Uri g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public void b() {
        final T i = this.I;
        if (i == null) {
            return;
        }
        try {
            this.c(i);
        }
        catch (IOException ex) {}
    }
    
    protected abstract void c(final T p0) throws IOException;
    
    @Override
    public void cancel() {
    }
    
    @j0
    @Override
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.G;
    }
    
    @Override
    public final void e(@j0 final h h, @j0 final a<? super T> a) {
        try {
            a.f(this.I = this.f(this.G, this.H));
        }
        catch (FileNotFoundException ex) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", (Throwable)ex);
            }
            a.c(ex);
        }
    }
    
    protected abstract T f(final Uri p0, final ContentResolver p1) throws FileNotFoundException;
}
