// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.gifdecoder;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import java.io.InputStream;
import androidx.annotation.j0;
import java.nio.ByteBuffer;

public interface a
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    
    int a();
    
    int b();
    
    void clear();
    
    @j0
    ByteBuffer getData();
    
    int h();
    
    int i(@k0 final InputStream p0, final int p1);
    
    @k0
    Bitmap j();
    
    void k();
    
    void l(@j0 final c p0, @j0 final byte[] p1);
    
    int m();
    
    int n();
    
    void o(@j0 final Bitmap$Config p0);
    
    int p(final int p0);
    
    void q();
    
    void r(@j0 final c p0, @j0 final ByteBuffer p1);
    
    int read(@k0 final byte[] p0);
    
    int s();
    
    void t(@j0 final c p0, @j0 final ByteBuffer p1, final int p2);
    
    int u();
    
    int v();
    
    int w();
    
    @Deprecated
    int x();
    
    public interface a
    {
        @j0
        Bitmap a(final int p0, final int p1, @j0 final Bitmap$Config p2);
        
        @j0
        int[] b(final int p0);
        
        void c(@j0 final Bitmap p0);
        
        void d(@j0 final byte[] p0);
        
        @j0
        byte[] e(final int p0);
        
        void f(@j0 final int[] p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }
}
