// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import androidx.annotation.b1;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class g
{
    private static g e;
    private a a;
    private b b;
    private e c;
    private f d;
    
    private g(@j0 Context applicationContext, @j0 final androidx.work.impl.utils.taskexecutor.a a) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = new a(applicationContext, a);
        this.b = new b(applicationContext, a);
        this.c = new e(applicationContext, a);
        this.d = new f(applicationContext, a);
    }
    
    @j0
    public static g c(final Context context, final androidx.work.impl.utils.taskexecutor.a a) {
        synchronized (g.class) {
            if (g.e == null) {
                g.e = new g(context, a);
            }
            return g.e;
        }
    }
    
    @b1
    public static void f(@j0 final g e) {
        synchronized (g.class) {
            g.e = e;
        }
    }
    
    @j0
    public a a() {
        return this.a;
    }
    
    @j0
    public b b() {
        return this.b;
    }
    
    @j0
    public e d() {
        return this.c;
    }
    
    @j0
    public f e() {
        return this.d;
    }
}
