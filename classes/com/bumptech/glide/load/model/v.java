// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.signature.e;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;

public class v<Model> implements n<Model, Model>
{
    private static final v<?> a;
    
    static {
        a = new v<Object>();
    }
    
    @Deprecated
    public v() {
    }
    
    public static <T> v<T> c() {
        return (v<T>)v.a;
    }
    
    @Override
    public boolean a(@j0 final Model model) {
        return true;
    }
    
    @Override
    public n.a<Model> b(@j0 final Model model, final int n, final int n2, @j0 final j j) {
        return (n.a<Model>)new n.a(new e(model), new b<Object>(model));
    }
    
    public static class a<Model> implements o<Model, Model>
    {
        private static final a<?> a;
        
        static {
            a = new a<Object>();
        }
        
        @Deprecated
        public a() {
        }
        
        public static <T> a<T> b() {
            return (a<T>)v.a.a;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Model, Model> c(final r r) {
            return (n<Model, Model>)v.c();
        }
    }
    
    private static class b<Model> implements d<Model>
    {
        private final Model G;
        
        b(final Model g) {
            this.G = g;
        }
        
        @j0
        @Override
        public Class<Model> a() {
            return (Class<Model>)this.G.getClass();
        }
        
        @Override
        public void b() {
        }
        
        @Override
        public void cancel() {
        }
        
        @j0
        @Override
        public a d() {
            return a.G;
        }
        
        @Override
        public void e(@j0 final h h, @j0 final d.a<? super Model> a) {
            a.f(this.G);
        }
    }
}
