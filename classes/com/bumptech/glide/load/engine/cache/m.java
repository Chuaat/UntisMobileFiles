// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import androidx.annotation.j0;
import com.bumptech.glide.util.pool.c;
import com.bumptech.glide.util.k;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import com.bumptech.glide.util.pool.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.h;

public class m
{
    private final h<g, String> a;
    private final androidx.core.util.m.a<b> b;
    
    public m() {
        this.a = new h<g, String>(1000L);
        this.b = com.bumptech.glide.util.pool.a.e(10, (a.d<b>)new a.d<b>() {
            public b a() {
                try {
                    return new b(MessageDigest.getInstance("SHA-256"));
                }
                catch (NoSuchAlgorithmException cause) {
                    throw new RuntimeException(cause);
                }
            }
        });
    }
    
    private String a(final g g) {
        final b b = k.d(this.b.b());
        try {
            g.a(b.G);
            return com.bumptech.glide.util.m.w(b.G.digest());
        }
        finally {
            this.b.a(b);
        }
    }
    
    public String b(final g g) {
        Object o = this.a;
        synchronized (o) {
            final String s = this.a.k(g);
            // monitorexit(o)
            o = s;
            if (s == null) {
                o = this.a(g);
            }
            synchronized (this.a) {
                this.a.o(g, (String)o);
                return (String)o;
            }
        }
    }
    
    private static final class b implements f
    {
        final MessageDigest G;
        private final c H;
        
        b(final MessageDigest g) {
            this.H = com.bumptech.glide.util.pool.c.a();
            this.G = g;
        }
        
        @j0
        @Override
        public c g() {
            return this.H;
        }
    }
}
