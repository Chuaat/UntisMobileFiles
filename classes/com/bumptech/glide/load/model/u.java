// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import android.content.res.AssetFileDescriptor;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.io.File;
import androidx.annotation.k0;
import android.text.TextUtils;
import android.net.Uri;

public class u<Data> implements n<String, Data>
{
    private final n<Uri, Data> a;
    
    public u(final n<Uri, Data> a) {
        this.a = a;
    }
    
    @k0
    private static Uri e(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        if (s.charAt(0) != '/') {
            final Uri parse = Uri.parse(s);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return f(s);
    }
    
    private static Uri f(final String pathname) {
        return Uri.fromFile(new File(pathname));
    }
    
    public n.a<Data> c(@j0 final String s, final int n, final int n2, @j0 final j j) {
        final Uri e = e(s);
        if (e != null && this.a.a(e)) {
            return this.a.b(e, n, n2, j);
        }
        return null;
    }
    
    public boolean d(@j0 final String s) {
        return true;
    }
    
    public static final class a implements o<String, AssetFileDescriptor>
    {
        @Override
        public void a() {
        }
        
        @Override
        public n<String, AssetFileDescriptor> c(@j0 final r r) {
            return new u<AssetFileDescriptor>((n<Uri, AssetFileDescriptor>)r.d(Uri.class, (Class<Data>)AssetFileDescriptor.class));
        }
    }
    
    public static class b implements o<String, ParcelFileDescriptor>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<String, ParcelFileDescriptor> c(@j0 final r r) {
            return new u<ParcelFileDescriptor>((n<Uri, ParcelFileDescriptor>)r.d(Uri.class, (Class<Data>)ParcelFileDescriptor.class));
        }
    }
    
    public static class c implements o<String, InputStream>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<String, InputStream> c(@j0 final r r) {
            return new u<InputStream>((n<Uri, InputStream>)r.d(Uri.class, (Class<Data>)InputStream.class));
        }
    }
}
