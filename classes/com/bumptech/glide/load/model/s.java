// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import android.content.res.AssetFileDescriptor;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.content.res.Resources;
import android.net.Uri;

public class s<Data> implements n<Integer, Data>
{
    private static final String c = "ResourceLoader";
    private final n<Uri, Data> a;
    private final Resources b;
    
    public s(final Resources b, final n<Uri, Data> a) {
        this.b = b;
        this.a = a;
    }
    
    @k0
    private Uri d(final Integer obj) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.b.getResourcePackageName((int)obj));
            sb.append('/');
            sb.append(this.b.getResourceTypeName((int)obj));
            sb.append('/');
            sb.append(this.b.getResourceEntryName((int)obj));
            return Uri.parse(sb.toString());
        }
        catch (Resources$NotFoundException ex) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(obj);
                Log.w("ResourceLoader", sb2.toString(), (Throwable)ex);
            }
            return null;
        }
    }
    
    public n.a<Data> c(@j0 final Integer n, final int n2, final int n3, @j0 final j j) {
        final Uri d = this.d(n);
        Object b;
        if (d == null) {
            b = null;
        }
        else {
            b = this.a.b(d, n2, n3, j);
        }
        return (n.a<Data>)b;
    }
    
    public boolean e(@j0 final Integer n) {
        return true;
    }
    
    public static final class a implements o<Integer, AssetFileDescriptor>
    {
        private final Resources a;
        
        public a(final Resources a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public n<Integer, AssetFileDescriptor> c(final r r) {
            return new s<AssetFileDescriptor>(this.a, (n<Uri, AssetFileDescriptor>)r.d(Uri.class, (Class<Data>)AssetFileDescriptor.class));
        }
    }
    
    public static class b implements o<Integer, ParcelFileDescriptor>
    {
        private final Resources a;
        
        public b(final Resources a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Integer, ParcelFileDescriptor> c(final r r) {
            return new s<ParcelFileDescriptor>(this.a, (n<Uri, ParcelFileDescriptor>)r.d(Uri.class, (Class<Data>)ParcelFileDescriptor.class));
        }
    }
    
    public static class c implements o<Integer, InputStream>
    {
        private final Resources a;
        
        public c(final Resources a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Integer, InputStream> c(final r r) {
            return new s<InputStream>(this.a, (n<Uri, InputStream>)r.d(Uri.class, (Class<Data>)InputStream.class));
        }
    }
    
    public static class d implements o<Integer, Uri>
    {
        private final Resources a;
        
        public d(final Resources a) {
            this.a = a;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Integer, Uri> c(final r r) {
            return new s<Uri>(this.a, (n<Uri, Uri>)v.c());
        }
    }
}
