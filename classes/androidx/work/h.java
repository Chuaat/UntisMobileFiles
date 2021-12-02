// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.b1;
import androidx.annotation.k0;
import java.util.Iterator;
import androidx.annotation.j0;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class h extends g0
{
    private static final String c;
    private final List<g0> b;
    
    static {
        c = q.f("DelegatingWkrFctry");
    }
    
    public h() {
        this.b = new CopyOnWriteArrayList<g0>();
    }
    
    @k0
    @Override
    public final ListenableWorker a(@j0 final Context context, @j0 String format, @j0 final WorkerParameters workerParameters) {
        for (final g0 g0 : this.b) {
            try {
                final ListenableWorker a = g0.a(context, format, workerParameters);
                if (a != null) {
                    return a;
                }
                continue;
            }
            finally {
                format = String.format("Unable to instantiate a ListenableWorker (%s)", format);
                q.c().b(h.c, format, (Throwable)context);
            }
            break;
        }
        return null;
    }
    
    public final void d(@j0 final g0 g0) {
        this.b.add(g0);
    }
    
    @b1
    @j0
    List<g0> e() {
        return this.b;
    }
}
