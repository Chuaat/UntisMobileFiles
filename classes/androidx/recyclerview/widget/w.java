// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.os.Looper;
import android.os.Handler;
import android.util.Log;
import android.os.AsyncTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

class w<T> implements i0<T>
{
    @Override
    public a<T> a(final a<T> a) {
        return new a<T>() {
            static final int g = 1;
            static final int h = 2;
            static final int i = 3;
            static final int j = 4;
            final c a = new c();
            private final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;
            AtomicBoolean c = new AtomicBoolean(false);
            private Runnable d = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        final d a = i0.a.this.a.a();
                        if (a == null) {
                            break;
                        }
                        final int b = a.b;
                        if (b != 1) {
                            if (b != 2) {
                                if (b != 3) {
                                    if (b != 4) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Unsupported message, what=");
                                        sb.append(a.b);
                                        Log.e("ThreadUtil", sb.toString());
                                    }
                                    else {
                                        a.b((j0.a)a.h);
                                    }
                                }
                                else {
                                    a.c(a.c, a.d);
                                }
                            }
                            else {
                                i0.a.this.a.b(2);
                                i0.a.this.a.b(3);
                                a.a(a.c, a.d, a.e, a.f, a.g);
                            }
                        }
                        else {
                            i0.a.this.a.b(1);
                            a.d(a.c);
                        }
                    }
                    i0.a.this.c.set(false);
                }
            };
            
            private void e() {
                if (this.c.compareAndSet(false, true)) {
                    this.b.execute(this.d);
                }
            }
            
            private void f(final d d) {
                this.a.c(d);
                this.e();
            }
            
            private void g(final d d) {
                this.a.d(d);
                this.e();
            }
            
            @Override
            public void a(final int n, final int n2, final int n3, final int n4, final int n5) {
                this.g(w.d.b(2, n, n2, n3, n4, n5, null));
            }
            
            @Override
            public void b(final j0.a<T> a) {
                this.f(w.d.c(4, 0, a));
            }
            
            @Override
            public void c(final int n, final int n2) {
                this.f(w.d.a(3, n, n2));
            }
            
            @Override
            public void d(final int n) {
                this.g(w.d.c(1, n, null));
            }
        };
    }
    
    @Override
    public b<T> b(final b<T> b) {
        return new b<T>() {
            static final int f = 1;
            static final int g = 2;
            static final int h = 3;
            final c a = new c();
            private final Handler b = new Handler(Looper.getMainLooper());
            private Runnable c = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        final d a = i0.b.this.a.a();
                        if (a == null) {
                            break;
                        }
                        final int b = a.b;
                        if (b != 1) {
                            if (b != 2) {
                                if (b != 3) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unsupported message, what=");
                                    sb.append(a.b);
                                    Log.e("ThreadUtil", sb.toString());
                                }
                                else {
                                    b.b(a.c, a.d);
                                }
                            }
                            else {
                                b.a(a.c, (j0.a)a.h);
                            }
                        }
                        else {
                            b.c(a.c, a.d);
                        }
                    }
                }
            };
            
            private void d(final d d) {
                this.a.c(d);
                this.b.post(this.c);
            }
            
            @Override
            public void a(final int n, final j0.a<T> a) {
                this.d(w.d.c(2, n, a));
            }
            
            @Override
            public void b(final int n, final int n2) {
                this.d(w.d.a(3, n, n2));
            }
            
            @Override
            public void c(final int n, final int n2) {
                this.d(w.d.a(1, n, n2));
            }
        };
    }
    
    static class c
    {
        private d a;
        
        d a() {
            synchronized (this) {
                final d a = this.a;
                if (a == null) {
                    return null;
                }
                this.a = a.a;
                return a;
            }
        }
        
        void b(final int n) {
            synchronized (this) {
                d a;
                while (true) {
                    a = this.a;
                    if (a == null || a.b != n) {
                        break;
                    }
                    this.a = a.a;
                    a.d();
                }
                if (a != null) {
                    d a3;
                    for (Object a2 = a.a; a2 != null; a2 = a3) {
                        a3 = ((d)a2).a;
                        if (((d)a2).b == n) {
                            a.a = a3;
                            ((d)a2).d();
                        }
                        else {
                            a = (d)a2;
                        }
                    }
                }
            }
        }
        
        void c(final d d) {
            synchronized (this) {
                d a;
                if ((a = this.a) == null) {
                    this.a = d;
                    return;
                }
                while (true) {
                    final d a2 = a.a;
                    if (a2 == null) {
                        break;
                    }
                    a = a2;
                }
                a.a = d;
            }
        }
        
        void d(final d a) {
            synchronized (this) {
                a.a = this.a;
                this.a = a;
            }
        }
    }
    
    static class d
    {
        private static d i;
        private static final Object j;
        d a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Object h;
        
        static {
            j = new Object();
        }
        
        static d a(final int n, final int n2, final int n3) {
            return b(n, n2, n3, 0, 0, 0, null);
        }
        
        static d b(final int b, final int c, final int d, final int e, final int f, final int g, final Object h) {
            synchronized (w.d.j) {
                d i = w.d.i;
                if (i == null) {
                    i = new d();
                }
                else {
                    w.d.i = i.a;
                    i.a = null;
                }
                i.b = b;
                i.c = c;
                i.d = d;
                i.e = e;
                i.f = f;
                i.g = g;
                i.h = h;
                return i;
            }
        }
        
        static d c(final int n, final int n2, final Object o) {
            return b(n, n2, 0, 0, 0, 0, o);
        }
        
        void d() {
            this.a = null;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.c = 0;
            this.b = 0;
            this.h = null;
            synchronized (w.d.j) {
                final d i = w.d.i;
                if (i != null) {
                    this.a = i;
                }
                w.d.i = this;
            }
        }
    }
}
