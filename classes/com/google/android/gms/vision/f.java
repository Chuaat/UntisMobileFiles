// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import java.util.Iterator;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;

public class f extends b<Object>
{
    private List<b<?>> c;
    
    private f() {
        this.c = new ArrayList<b<?>>();
    }
    
    @RecentlyNonNull
    @Override
    public SparseArray<Object> a(@RecentlyNonNull final d d) {
        final SparseArray sparseArray = new SparseArray();
        final Iterator<b<?>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final android.util.SparseArray<?> a = iterator.next().a(d);
            for (int i = 0; i < a.size(); ++i) {
                final int key = a.keyAt(i);
                if (sparseArray.get(key) != null) {
                    final StringBuilder sb = new StringBuilder(104);
                    sb.append("Detection ID overlap for id = ");
                    sb.append(key);
                    sb.append("  This means that one of the detectors is not using global IDs.");
                    throw new IllegalStateException(sb.toString());
                }
                sparseArray.append(key, a.valueAt(i));
            }
        }
        return (SparseArray<Object>)sparseArray;
    }
    
    @Override
    public boolean b() {
        final Iterator<b<?>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().b()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void c(@RecentlyNonNull final d d) {
        final Iterator<b<?>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(d);
        }
    }
    
    @Override
    public void d() {
        final Iterator<b<?>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        this.c.clear();
    }
    
    @Override
    public void f(@RecentlyNonNull final b<Object> b) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }
    
    public static class a
    {
        private f a;
        
        public a() {
            this.a = new f(null);
        }
        
        @RecentlyNonNull
        public a a(@RecentlyNonNull final b<?> b) {
            this.a.c.add(b);
            return this;
        }
        
        @RecentlyNonNull
        public f b() {
            if (this.a.c.size() != 0) {
                return this.a;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }
}
