// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.util.k;
import java.util.List;
import androidx.core.util.m;

public class t<Data, ResourceType, Transcode>
{
    private final Class<Data> a;
    private final m.a<List<Throwable>> b;
    private final List<? extends i<Data, ResourceType, Transcode>> c;
    private final String d;
    
    public t(final Class<Data> a, final Class<ResourceType> clazz, final Class<Transcode> clazz2, final List<i<Data, ResourceType, Transcode>> list, final m.a<List<Throwable>> b) {
        this.a = a;
        this.b = b;
        this.c = k.c(list);
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(a.getSimpleName());
        sb.append("->");
        sb.append(clazz.getSimpleName());
        sb.append("->");
        sb.append(clazz2.getSimpleName());
        sb.append("}");
        this.d = sb.toString();
    }
    
    private v<Transcode> c(final e<Data> e, @j0 final j j, final int n, final int n2, final i.a<ResourceType> a, final List<Throwable> c) throws q {
        final int size = this.c.size();
        v<Transcode> a2 = null;
        int n3 = 0;
        v<Transcode> v;
        while (true) {
            v = a2;
            if (n3 >= size) {
                break;
            }
            final i i = (i)this.c.get(n3);
            try {
                a2 = i.a(e, n, n2, j, (i.a<Object>)a);
            }
            catch (q q) {
                c.add(q);
            }
            if (a2 != null) {
                v = a2;
                break;
            }
            ++n3;
        }
        if (v != null) {
            return v;
        }
        throw new q(this.d, new ArrayList<Throwable>(c));
    }
    
    public Class<Data> a() {
        return this.a;
    }
    
    public v<Transcode> b(final e<Data> e, @j0 final j j, final int n, final int n2, final i.a<ResourceType> a) throws q {
        final List<Throwable> list = k.d(this.b.b());
        try {
            return this.c(e, j, n, n2, a, list);
        }
        finally {
            this.b.a(list);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.c.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
