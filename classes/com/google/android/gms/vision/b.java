// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import d6.a;
import c6.h;

public abstract class b<T>
{
    private final Object a;
    @h
    @d6.a("processorLock")
    private b<T> b;
    
    public b() {
        this.a = new Object();
    }
    
    @RecentlyNonNull
    public abstract SparseArray<T> a(@RecentlyNonNull final d p0);
    
    public boolean b() {
        return true;
    }
    
    public void c(@RecentlyNonNull final d d) {
        final d.b b = new d.b(d.c());
        b.i();
        final a a = new a(this.a(d), b, this.b());
        synchronized (this.a) {
            final b<T> b2 = this.b;
            if (b2 != null) {
                b2.o((a<T>)a);
                return;
            }
            throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
        }
    }
    
    public void d() {
        synchronized (this.a) {
            final b<T> b = this.b;
            if (b != null) {
                b.release();
                this.b = null;
            }
        }
    }
    
    public boolean e(final int n) {
        return true;
    }
    
    public void f(@RecentlyNonNull final b<T> b) {
        synchronized (this.a) {
            final b<T> b2 = this.b;
            if (b2 != null) {
                b2.release();
            }
            this.b = b;
        }
    }
    
    public static class a<T>
    {
        private final SparseArray<T> a;
        private final d.b b;
        private final boolean c;
        
        public a(@RecentlyNonNull final SparseArray<T> a, @RecentlyNonNull final d.b b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public boolean a() {
            return this.c;
        }
        
        @RecentlyNonNull
        public SparseArray<T> b() {
            return this.a;
        }
        
        @RecentlyNonNull
        public d.b c() {
            return this.b;
        }
    }
    
    public interface b<T>
    {
        void o(@RecentlyNonNull final a<T> p0);
        
        void release();
    }
}
