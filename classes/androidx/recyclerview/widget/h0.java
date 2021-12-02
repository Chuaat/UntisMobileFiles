// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.collection.h;
import androidx.annotation.j0;

interface h0
{
    @j0
    d a();
    
    public static class a implements h0
    {
        long a;
        
        public a() {
            this.a = 0L;
        }
        
        @j0
        @Override
        public d a() {
            return new h0.a.a();
        }
        
        long b() {
            final long a = this.a;
            this.a = 1L + a;
            return a;
        }
        
        class a implements d
        {
            private final h<Long> a;
            
            a() {
                this.a = new h<Long>();
            }
            
            @Override
            public long a(final long n) {
                Long value;
                if ((value = this.a.j(n)) == null) {
                    value = h0.a.this.b();
                    this.a.s(n, value);
                }
                return value;
            }
        }
    }
    
    public static class b implements h0
    {
        private final d a;
        
        public b() {
            this.a = new d() {
                @Override
                public long a(final long n) {
                    return -1L;
                }
            };
        }
        
        @j0
        @Override
        public d a() {
            return this.a;
        }
    }
    
    public static class c implements h0
    {
        private final d a;
        
        public c() {
            this.a = new d() {
                @Override
                public long a(final long n) {
                    return n;
                }
            };
        }
        
        @j0
        @Override
        public d a() {
            return this.a;
        }
    }
    
    public interface d
    {
        long a(final long p0);
    }
}
