// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import java.util.Collection;
import java.util.ArrayList;
import android.util.Log;
import java.io.IOException;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.load.j;
import androidx.core.util.m;
import com.bumptech.glide.load.resource.transcode.e;
import com.bumptech.glide.load.l;
import java.util.List;

public class i<DataType, ResourceType, Transcode>
{
    private static final String f = "DecodePath";
    private final Class<DataType> a;
    private final List<? extends l<DataType, ResourceType>> b;
    private final e<ResourceType, Transcode> c;
    private final m.a<List<Throwable>> d;
    private final String e;
    
    public i(final Class<DataType> a, final Class<ResourceType> clazz, final Class<Transcode> clazz2, final List<? extends l<DataType, ResourceType>> b, final e<ResourceType, Transcode> c, final m.a<List<Throwable>> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(a.getSimpleName());
        sb.append("->");
        sb.append(clazz.getSimpleName());
        sb.append("->");
        sb.append(clazz2.getSimpleName());
        sb.append("}");
        this.e = sb.toString();
    }
    
    @j0
    private v<ResourceType> b(final com.bumptech.glide.load.data.e<DataType> e, final int n, final int n2, @j0 final j j) throws q {
        final List<Throwable> list = k.d(this.d.b());
        try {
            return this.c(e, n, n2, j, list);
        }
        finally {
            this.d.a(list);
        }
    }
    
    @j0
    private v<ResourceType> c(final com.bumptech.glide.load.data.e<DataType> e, final int n, final int n2, @j0 final j j, final List<Throwable> c) throws q {
        final int size = this.b.size();
        Object o = null;
        int n3 = 0;
        Object b;
        while (true) {
            b = o;
            if (n3 >= size) {
                break;
            }
            final l obj = (l)this.b.get(n3);
            b = o;
            Label_0161: {
                try {
                    if (obj.a(e.a(), j)) {
                        b = obj.b(e.a(), n, n2, j);
                    }
                    break Label_0161;
                }
                catch (OutOfMemoryError b) {}
                catch (RuntimeException b) {}
                catch (IOException ex) {}
                if (Log.isLoggable("DecodePath", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(obj);
                    Log.v("DecodePath", sb.toString(), (Throwable)b);
                }
                c.add((OutOfMemoryError)b);
                b = o;
            }
            if (b != null) {
                break;
            }
            ++n3;
            o = b;
        }
        if (b != null) {
            return (v<ResourceType>)b;
        }
        throw new q(this.e, new ArrayList<Throwable>(c));
    }
    
    public v<Transcode> a(final com.bumptech.glide.load.data.e<DataType> e, final int n, final int n2, @j0 final j j, final a<ResourceType> a) throws q {
        return this.c.a(a.a(this.b(e, n, n2, j)), j);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.a);
        sb.append(", decoders=");
        sb.append(this.b);
        sb.append(", transcoder=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
    
    interface a<ResourceType>
    {
        @j0
        v<ResourceType> a(@j0 final v<ResourceType> p0);
    }
}
