// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import android.database.Cursor;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import android.provider.MediaStore;
import android.os.Environment;
import androidx.annotation.k0;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.data.mediastore.b;
import android.os.Build$VERSION;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.io.File;
import android.content.Context;
import androidx.annotation.p0;
import android.net.Uri;
import com.bumptech.glide.load.model.n;

@p0(29)
public final class f<DataT> implements n<Uri, DataT>
{
    private final Context a;
    private final n<File, DataT> b;
    private final n<Uri, DataT> c;
    private final Class<DataT> d;
    
    f(final Context context, final n<File, DataT> b, final n<Uri, DataT> c, final Class<DataT> d) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public n.a<DataT> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return (n.a<DataT>)new n.a(new e(uri), new d<Object>(this.a, (n<File, Object>)this.b, (n<Uri, Object>)this.c, uri, n, n2, j, (Class<Object>)this.d));
    }
    
    public boolean d(@j0 final Uri uri) {
        return Build$VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
    
    private abstract static class a<DataT> implements o<Uri, DataT>
    {
        private final Context a;
        private final Class<DataT> b;
        
        a(final Context a, final Class<DataT> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final void a() {
        }
        
        @j0
        @Override
        public final n<Uri, DataT> c(@j0 final r r) {
            return new f<DataT>(this.a, (n<File, DataT>)r.d(File.class, (Class<DataT>)this.b), (n<Uri, DataT>)r.d(Uri.class, (Class<DataT>)this.b), this.b);
        }
    }
    
    @p0(29)
    public static final class b extends a<ParcelFileDescriptor>
    {
        public b(final Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }
    
    @p0(29)
    public static final class c extends a<InputStream>
    {
        public c(final Context context) {
            super(context, InputStream.class);
        }
    }
    
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT>
    {
        private static final String[] Q;
        private final Context G;
        private final n<File, DataT> H;
        private final n<Uri, DataT> I;
        private final Uri J;
        private final int K;
        private final int L;
        private final j M;
        private final Class<DataT> N;
        private volatile boolean O;
        @k0
        private volatile com.bumptech.glide.load.data.d<DataT> P;
        
        static {
            Q = new String[] { "_data" };
        }
        
        d(final Context context, final n<File, DataT> h, final n<Uri, DataT> i, final Uri j, final int k, final int l, final j m, final Class<DataT> n) {
            this.G = context.getApplicationContext();
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
            this.N = n;
        }
        
        @k0
        private n.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.H.b(this.h(this.J), this.K, this.L, this.M);
            }
            Uri uri;
            if (this.g()) {
                uri = MediaStore.setRequireOriginal(this.J);
            }
            else {
                uri = this.J;
            }
            return this.I.b(uri, this.K, this.L, this.M);
        }
        
        @k0
        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            final n.a<DataT> c = this.c();
            com.bumptech.glide.load.data.d<DataT> c2;
            if (c != null) {
                c2 = c.c;
            }
            else {
                c2 = null;
            }
            return c2;
        }
        
        private boolean g() {
            return this.G.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }
        
        @j0
        private File h(final Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                final Cursor query = this.G.getContentResolver().query(uri, d.Q, (String)null, (String[])null, (String)null);
                if (query != null) {
                    cursor = query;
                    if (query.moveToFirst()) {
                        cursor = query;
                        final String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        cursor = query;
                        if (!TextUtils.isEmpty((CharSequence)string)) {
                            cursor = query;
                            final File file = new File(string);
                            query.close();
                            return file;
                        }
                        cursor = query;
                        cursor = query;
                        cursor = query;
                        final StringBuilder sb = new StringBuilder();
                        cursor = query;
                        sb.append("File path was empty in media store for: ");
                        cursor = query;
                        sb.append(uri);
                        cursor = query;
                        final FileNotFoundException ex = new FileNotFoundException(sb.toString());
                        cursor = query;
                        throw ex;
                    }
                }
                cursor = query;
                cursor = query;
                cursor = query;
                final StringBuilder sb2 = new StringBuilder();
                cursor = query;
                sb2.append("Failed to media store entry for: ");
                cursor = query;
                sb2.append(uri);
                cursor = query;
                final FileNotFoundException ex2 = new FileNotFoundException(sb2.toString());
                cursor = query;
                throw ex2;
            }
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        
        @j0
        @Override
        public Class<DataT> a() {
            return this.N;
        }
        
        @Override
        public void b() {
            final com.bumptech.glide.load.data.d<DataT> p = this.P;
            if (p != null) {
                p.b();
            }
        }
        
        @Override
        public void cancel() {
            this.O = true;
            final com.bumptech.glide.load.data.d<DataT> p = this.P;
            if (p != null) {
                p.cancel();
            }
        }
        
        @j0
        @Override
        public a d() {
            return a.G;
        }
        
        @Override
        public void e(@j0 final h h, @j0 final com.bumptech.glide.load.data.d.a<? super DataT> a) {
            try {
                final com.bumptech.glide.load.data.d<DataT> f = this.f();
                if (f == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to build fetcher for: ");
                    sb.append(this.J);
                    a.c(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.P = f;
                if (this.O) {
                    this.cancel();
                }
                else {
                    f.e(h, a);
                }
            }
            catch (FileNotFoundException ex) {
                a.c(ex);
            }
        }
    }
}
