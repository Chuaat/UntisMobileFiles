// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import android.util.Log;
import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class q
{
    private static q a;
    private static final String b = "WM-";
    private static final int c = 23;
    private static final int d = 20;
    
    public q(final int n) {
    }
    
    public static q c() {
        synchronized (q.class) {
            if (q.a == null) {
                q.a = new a(3);
            }
            return q.a;
        }
    }
    
    public static void e(final q a) {
        synchronized (q.class) {
            q.a = a;
        }
    }
    
    public static String f(@j0 final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        final int d = q.d;
        String substring = s;
        if (length >= d) {
            substring = s.substring(0, d);
        }
        sb.append(substring);
        return sb.toString();
    }
    
    public abstract void a(final String p0, final String p1, final Throwable... p2);
    
    public abstract void b(final String p0, final String p1, final Throwable... p2);
    
    public abstract void d(final String p0, final String p1, final Throwable... p2);
    
    public abstract void g(final String p0, final String p1, final Throwable... p2);
    
    public abstract void h(final String p0, final String p1, final Throwable... p2);
    
    public static class a extends q
    {
        private int e;
        
        public a(final int e) {
            super(e);
            this.e = e;
        }
        
        @Override
        public void a(final String s, final String s2, final Throwable... array) {
            if (this.e <= 3) {
                if (array != null && array.length >= 1) {
                    Log.d(s, s2, array[0]);
                }
                else {
                    Log.d(s, s2);
                }
            }
        }
        
        @Override
        public void b(final String s, final String s2, final Throwable... array) {
            if (this.e <= 6) {
                if (array != null && array.length >= 1) {
                    Log.e(s, s2, array[0]);
                }
                else {
                    Log.e(s, s2);
                }
            }
        }
        
        @Override
        public void d(final String s, final String s2, final Throwable... array) {
            if (this.e <= 4) {
                if (array != null && array.length >= 1) {
                    Log.i(s, s2, array[0]);
                }
                else {
                    Log.i(s, s2);
                }
            }
        }
        
        @Override
        public void g(final String s, final String s2, final Throwable... array) {
            if (this.e <= 2) {
                if (array != null && array.length >= 1) {
                    Log.v(s, s2, array[0]);
                }
                else {
                    Log.v(s, s2);
                }
            }
        }
        
        @Override
        public void h(final String s, final String s2, final Throwable... array) {
            if (this.e <= 5) {
                if (array != null && array.length >= 1) {
                    Log.w(s, s2, array[0]);
                }
                else {
                    Log.w(s, s2);
                }
            }
        }
    }
}
