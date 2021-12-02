// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.exceptions.d;

public final class a
{
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    
    static {
        b = (a = (d)rx.a.c.a);
        c = (d)rx.a.b.a;
        d = (d)rx.a.a.a;
    }
    
    private a() {
        throw new IllegalStateException("No instances!");
    }
    
    static final class a implements d
    {
        static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public boolean a() {
            return false;
        }
    }
    
    static final class b implements d
    {
        static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        @Override
        public boolean a() {
            return true;
        }
    }
    
    static final class c implements d
    {
        static final c a;
        
        static {
            a = new c();
        }
        
        private c() {
        }
        
        @Override
        public boolean a() throws rx.exceptions.d {
            throw new rx.exceptions.d("Overflowed buffer");
        }
    }
    
    public interface d
    {
        boolean a() throws rx.exceptions.d;
    }
}
