// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import java.util.concurrent.Callable;
import androidx.annotation.k0;
import java.util.concurrent.Executor;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.core.graphics.x;
import android.os.CancellationSignal;
import android.content.Context;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import androidx.annotation.w;
import androidx.core.util.c;
import java.util.ArrayList;
import androidx.collection.m;
import java.util.concurrent.ExecutorService;
import android.graphics.Typeface;
import androidx.collection.j;

class e
{
    static final j<String, Typeface> a;
    private static final ExecutorService b;
    static final Object c;
    @w("LOCK")
    static final m<String, ArrayList<c<e>>> d;
    
    static {
        a = new j<String, Typeface>(16);
        b = g.a("fonts-androidx", 10, 10000);
        c = new Object();
        d = new m<String, ArrayList<c<e>>>();
    }
    
    private e() {
    }
    
    private static String a(@j0 final d d, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append(d.d());
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }
    
    @SuppressLint({ "WrongConstant" })
    private static int b(@j0 final f.b b) {
        final int c = b.c();
        final int n = -3;
        final boolean b2 = true;
        if (c == 0) {
            final f.c[] b3 = b.b();
            int n2 = b2 ? 1 : 0;
            if (b3 != null) {
                if (b3.length == 0) {
                    n2 = (b2 ? 1 : 0);
                }
                else {
                    final int length = b3.length;
                    final int n3 = 0;
                    int n4 = 0;
                    while (true) {
                        n2 = n3;
                        if (n4 >= length) {
                            break;
                        }
                        int b4 = b3[n4].b();
                        if (b4 != 0) {
                            if (b4 < 0) {
                                b4 = n;
                            }
                            return b4;
                        }
                        ++n4;
                    }
                }
            }
            return n2;
        }
        if (b.c() != 1) {
            return -3;
        }
        return -2;
    }
    
    @j0
    static e c(@j0 final String s, @j0 final Context context, @j0 final d d, final int n) {
        final j<String, Typeface> a = e.a;
        final Typeface typeface = a.f(s);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            final f.b d2 = androidx.core.provider.c.d(context, d, null);
            final int b = b(d2);
            if (b != 0) {
                return new e(b);
            }
            final Typeface c = x.c(context, null, d2.b(), n);
            if (c != null) {
                a.j(s, c);
                return new e(c);
            }
            return new e(-3);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return new e(-1);
        }
    }
    
    static Typeface d(@j0 final Context context, @j0 final d d, final int n, @k0 final Executor executor, @j0 final a a) {
        final String a2 = a(d, n);
        final Typeface typeface = e.a.f(a2);
        if (typeface != null) {
            a.b(new e(typeface));
            return typeface;
        }
        final c<e> c = new c<e>() {
            public void a(final e e) {
                a.b(e);
            }
        };
        synchronized (e.c) {
            final m<String, ArrayList<c<e>>> d2 = e.d;
            final ArrayList<c<e>> list = d2.get(a2);
            if (list != null) {
                list.add(c);
                return null;
            }
            final ArrayList<e$b> list2 = new ArrayList<e$b>();
            list2.add(c);
            d2.put(a2, (ArrayList<c<e>>)list2);
            // monitorexit(e.c)
            final Callable<e> callable = new Callable<e>() {
                public e a() {
                    return e.c(a2, context, d, n);
                }
            };
            Executor b;
            if ((b = executor) == null) {
                b = e.b;
            }
            g.c(b, (Callable<Object>)callable, (c<Object>)new c<e>() {
                public void a(final e e) {
                    synchronized (e.c) {
                        final m<String, ArrayList<c<e>>> d = e.d;
                        final ArrayList<c<e>> list = d.get(a2);
                        if (list == null) {
                            return;
                        }
                        d.remove(a2);
                        // monitorexit(e.c)
                        for (int i = 0; i < list.size(); ++i) {
                            list.get(i).accept(e);
                        }
                    }
                }
            });
            return null;
        }
    }
    
    static Typeface e(@j0 final Context context, @j0 final d d, @j0 final a a, final int n, final int n2) {
        final String a2 = a(d, n);
        final Typeface typeface = e.a.f(a2);
        if (typeface != null) {
            a.b(new e(typeface));
            return typeface;
        }
        if (n2 == -1) {
            final e c = c(a2, context, d, n);
            a.b(c);
            return c.a;
        }
        final Callable<e> callable = new Callable<e>() {
            public e a() {
                return e.c(a2, context, d, n);
            }
        };
        try {
            final e e = g.d(androidx.core.provider.e.b, (Callable<e>)callable, n2);
            a.b(e);
            return e.a;
        }
        catch (InterruptedException ex) {
            a.b(new e(-3));
            return null;
        }
    }
    
    static void f() {
        e.a.d();
    }
    
    static final class e
    {
        final Typeface a;
        final int b;
        
        e(final int b) {
            this.a = null;
            this.b = b;
        }
        
        @SuppressLint({ "WrongConstant" })
        e(@j0 final Typeface a) {
            this.a = a;
            this.b = 0;
        }
        
        @SuppressLint({ "WrongConstant" })
        boolean a() {
            return this.b == 0;
        }
    }
}
