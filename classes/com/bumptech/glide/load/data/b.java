// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import android.util.Log;
import com.bumptech.glide.h;
import androidx.annotation.j0;
import com.bumptech.glide.load.a;
import java.io.IOException;
import android.content.res.AssetManager;

public abstract class b<T> implements d<T>
{
    private static final String J = "AssetPathFetcher";
    private final String G;
    private final AssetManager H;
    private T I;
    
    public b(final AssetManager h, final String g) {
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
    public void e(@j0 final h h, @j0 final a<? super T> a) {
        try {
            a.f(this.I = this.f(this.H, this.G));
        }
        catch (IOException ex) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", (Throwable)ex);
            }
            a.c(ex);
        }
    }
    
    protected abstract T f(final AssetManager p0, final String p1) throws IOException;
}
