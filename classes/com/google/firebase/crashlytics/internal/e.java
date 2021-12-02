// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal;

import java.io.File;
import androidx.annotation.j0;
import com.google.firebase.crashlytics.internal.model.c0;
import n3.a$a;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements a
{
    private static final g c;
    private final n3.a<a> a;
    private final AtomicReference<a> b;
    
    static {
        c = new b();
    }
    
    public e(final n3.a<a> a) {
        this.b = new AtomicReference<a>(null);
        (this.a = a).a((a$a)new com.google.firebase.crashlytics.internal.b(this));
    }
    
    @Override
    public void a(@j0 final String s) {
        this.a.a((a$a)new c(s));
    }
    
    @j0
    @Override
    public g b(@j0 final String s) {
        final a a = this.b.get();
        g g;
        if (a == null) {
            g = e.c;
        }
        else {
            g = a.b(s);
        }
        return g;
    }
    
    @Override
    public boolean c(@j0 final String s) {
        final a a = this.b.get();
        return a != null && a.c(s);
    }
    
    @Override
    public void d(@j0 final String str, @j0 final String s, final long n, @j0 final c0 c0) {
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Deferring native open session: ");
        sb.append(str);
        f.k(sb.toString());
        this.a.a((a$a)new d(str, s, n, c0));
    }
    
    private static final class b implements g
    {
        @Override
        public File a() {
            return null;
        }
        
        @Override
        public File b() {
            return null;
        }
        
        @Override
        public File c() {
            return null;
        }
        
        @Override
        public File d() {
            return null;
        }
        
        @Override
        public File e() {
            return null;
        }
        
        @Override
        public File f() {
            return null;
        }
        
        @Override
        public File g() {
            return null;
        }
    }
}
