// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.a;

public class e<R> implements f<R>
{
    static final e<?> a;
    private static final g<?> b;
    
    static {
        a = new e<Object>();
        b = new a<Object>();
    }
    
    public static <R> f<R> b() {
        return (f<R>)e.a;
    }
    
    public static <R> g<R> c() {
        return (g<R>)e.b;
    }
    
    @Override
    public boolean a(final Object o, final f.a a) {
        return false;
    }
    
    public static class a<R> implements g<R>
    {
        @Override
        public f<R> a(final com.bumptech.glide.load.a a, final boolean b) {
            return (f<R>)e.a;
        }
    }
}
