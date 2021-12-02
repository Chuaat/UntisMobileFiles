// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.a;

public class c extends Exception
{
    private final a<com.google.android.gms.common.api.internal.c<?>, com.google.android.gms.common.c> G;
    
    public c(@RecentlyNonNull final a<com.google.android.gms.common.api.internal.c<?>, com.google.android.gms.common.c> g) {
        this.G = g;
    }
    
    @j0
    public com.google.android.gms.common.c a(@RecentlyNonNull final j<? extends com.google.android.gms.common.api.a.d> j) {
        final com.google.android.gms.common.api.internal.c<? extends com.google.android.gms.common.api.a.d> b = j.b();
        final boolean b2 = this.G.get(b) != null;
        final String a = b.a();
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("The given API (");
        sb.append(a);
        sb.append(") was not part of the availability request.");
        x.b(b2, sb.toString());
        return x.k(this.G.get(b));
    }
    
    @j0
    public com.google.android.gms.common.c b(@RecentlyNonNull final l<? extends com.google.android.gms.common.api.a.d> l) {
        final com.google.android.gms.common.api.internal.c<? extends com.google.android.gms.common.api.a.d> b = l.b();
        final boolean b2 = this.G.get(b) != null;
        final String a = b.a();
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("The given API (");
        sb.append(a);
        sb.append(") was not part of the availability request.");
        x.b(b2, sb.toString());
        return x.k(this.G.get(b));
    }
    
    @j0
    @Override
    public String getMessage() {
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<com.google.android.gms.common.api.internal.c<?>> iterator = this.G.keySet().iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final com.google.android.gms.common.api.internal.c<?> c = iterator.next();
            final com.google.android.gms.common.c obj = x.k(this.G.get(c));
            if (obj.j2()) {
                b = false;
            }
            final String a = c.a();
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + value.length());
            sb.append(a);
            sb.append(": ");
            sb.append(value);
            list.add(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        String str;
        if (b) {
            str = "None of the queried APIs are available. ";
        }
        else {
            str = "Some of the queried APIs are unavailable. ";
        }
        sb2.append(str);
        sb2.append(TextUtils.join((CharSequence)"; ", (Iterable)list));
        return sb2.toString();
    }
}
