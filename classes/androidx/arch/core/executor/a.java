// 
// Decompiled by Procyon v0.5.36
// 

package androidx.arch.core.executor;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class a extends c
{
    private static volatile a c;
    @j0
    private static final Executor d;
    @j0
    private static final Executor e;
    @j0
    private c a;
    @j0
    private c b;
    
    static {
        d = new Executor() {
            @Override
            public void execute(final Runnable runnable) {
                androidx.arch.core.executor.a.f().d(runnable);
            }
        };
        e = new Executor() {
            @Override
            public void execute(final Runnable runnable) {
                androidx.arch.core.executor.a.f().a(runnable);
            }
        };
    }
    
    private a() {
        final b b = new b();
        this.b = b;
        this.a = b;
    }
    
    @j0
    public static Executor e() {
        return a.e;
    }
    
    @j0
    public static a f() {
        if (a.c != null) {
            return a.c;
        }
        synchronized (a.class) {
            if (a.c == null) {
                a.c = new a();
            }
            return a.c;
        }
    }
    
    @j0
    public static Executor g() {
        return a.d;
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.a.a(runnable);
    }
    
    @Override
    public boolean c() {
        return this.a.c();
    }
    
    @Override
    public void d(final Runnable runnable) {
        this.a.d(runnable);
    }
    
    public void h(@k0 final c c) {
        c b = c;
        if (c == null) {
            b = this.b;
        }
        this.a = b;
    }
}
