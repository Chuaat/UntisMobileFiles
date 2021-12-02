// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import java.io.File;

public class d implements a
{
    private final long c;
    private final c d;
    
    public d(final c d, final long c) {
        this.c = c;
        this.d = d;
    }
    
    public d(final String s, final long n) {
        this((c)new c() {
            @Override
            public File a() {
                return new File(s);
            }
        }, n);
    }
    
    public d(final String s, final String s2, final long n) {
        this((c)new c() {
            @Override
            public File a() {
                return new File(s, s2);
            }
        }, n);
    }
    
    @Override
    public com.bumptech.glide.load.engine.cache.a h() {
        final File a = this.d.a();
        if (a == null) {
            return null;
        }
        if (!a.mkdirs() && (!a.exists() || !a.isDirectory())) {
            return null;
        }
        return e.d(a, this.c);
    }
    
    public interface c
    {
        File a();
    }
}
