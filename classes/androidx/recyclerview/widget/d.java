// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.os.Looper;
import android.os.Handler;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.util.List;
import java.util.concurrent.Executor;

public class d<T>
{
    private static final Executor h;
    private final v a;
    final androidx.recyclerview.widget.c<T> b;
    Executor c;
    private final List<b<T>> d;
    @k0
    private List<T> e;
    @j0
    private List<T> f;
    int g;
    
    static {
        h = new c();
    }
    
    public d(@j0 final RecyclerView.h h, @j0 final k.f<T> f) {
        this(new androidx.recyclerview.widget.b(h), new androidx.recyclerview.widget.c.a<T>(f).a());
    }
    
    public d(@j0 final v a, @j0 final androidx.recyclerview.widget.c<T> b) {
        this.d = new CopyOnWriteArrayList<b<T>>();
        this.f = Collections.emptyList();
        this.a = a;
        this.b = b;
        Executor c;
        if (b.c() != null) {
            c = b.c();
        }
        else {
            c = androidx.recyclerview.widget.d.h;
        }
        this.c = c;
    }
    
    private void d(@j0 final List<T> list, @k0 final Runnable runnable) {
        final Iterator<b<T>> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public void a(@j0 final b<T> b) {
        this.d.add(b);
    }
    
    @j0
    public List<T> b() {
        return this.f;
    }
    
    void c(@j0 final List<T> list, @j0 final k.e e, @k0 final Runnable runnable) {
        final List<T> f = this.f;
        this.e = list;
        this.f = Collections.unmodifiableList((List<? extends T>)list);
        e.d(this.a);
        this.d(f, runnable);
    }
    
    public void e(@j0 final b<T> b) {
        this.d.remove(b);
    }
    
    public void f(@k0 final List<T> list) {
        this.g(list, null);
    }
    
    public void g(@k0 final List<T> list, @k0 final Runnable runnable) {
        final int g = this.g + 1;
        this.g = g;
        final List<T> e = this.e;
        if (list == e) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        final List<T> f = this.f;
        if (list == null) {
            final int size = e.size();
            this.e = null;
            this.f = Collections.emptyList();
            this.a.c(0, size);
            this.d(f, runnable);
            return;
        }
        if (e == null) {
            this.e = list;
            this.f = Collections.unmodifiableList((List<? extends T>)list);
            this.a.b(0, list.size());
            this.d(f, runnable);
            return;
        }
        this.b.a().execute(new Runnable() {
            final /* synthetic */ d K;
            
            @Override
            public void run() {
                androidx.recyclerview.widget.d.this.c.execute(new Runnable() {
                    final /* synthetic */ k.e G = k.b((k.b)new k.b(this) {
                        @Override
                        public boolean a(final int n, final int n2) {
                            final T value = e.get(n);
                            final T value2 = list.get(n2);
                            if (value != null && value2 != null) {
                                return d.this.b.b().a(value, value2);
                            }
                            if (value == null && value2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }
                        
                        @Override
                        public boolean b(final int n, final int n2) {
                            final T value = e.get(n);
                            final T value2 = list.get(n2);
                            if (value != null && value2 != null) {
                                return d.this.b.b().b(value, value2);
                            }
                            return value == null && value2 == null;
                        }
                        
                        @k0
                        @Override
                        public Object c(final int n, final int n2) {
                            final T value = e.get(n);
                            final T value2 = list.get(n2);
                            if (value != null && value2 != null) {
                                return d.this.b.b().c(value, value2);
                            }
                            throw new AssertionError();
                        }
                        
                        @Override
                        public int d() {
                            return list.size();
                        }
                        
                        @Override
                        public int e() {
                            return e.size();
                        }
                    });
                    
                    @Override
                    public void run() {
                        final Runnable h = Runnable.this;
                        final d k = h.K;
                        if (k.g == g) {
                            k.c(list, this.G, runnable);
                        }
                    }
                });
            }
        });
    }
    
    public interface b<T>
    {
        void a(@j0 final List<T> p0, @j0 final List<T> p1);
    }
    
    private static class c implements Executor
    {
        final Handler G;
        
        c() {
            this.G = new Handler(Looper.getMainLooper());
        }
        
        @Override
        public void execute(@j0 final Runnable runnable) {
            this.G.post(runnable);
        }
    }
}
