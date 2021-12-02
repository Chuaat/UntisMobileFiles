// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import java.util.Iterator;
import com.google.firebase.components.j;
import com.google.firebase.components.t;
import com.google.firebase.components.g;
import java.util.Set;

public class c implements i
{
    private final String a;
    private final d b;
    
    c(final Set<f> set, final d b) {
        this.a = e(set);
        this.b = b;
    }
    
    public static com.google.firebase.components.f<i> c() {
        return (com.google.firebase.components.f<i>)com.google.firebase.components.f.d((Class)i.class).b(t.l((Class)f.class)).f((j)b.a).d();
    }
    
    private static String e(final Set<f> set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<f> iterator = set.iterator();
        while (iterator.hasNext()) {
            final f f = iterator.next();
            sb.append(f.b());
            sb.append('/');
            sb.append(f.c());
            if (iterator.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    @Override
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(e(this.b.b()));
        return sb.toString();
    }
}
