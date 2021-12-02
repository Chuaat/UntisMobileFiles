// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Context;

public abstract class g0
{
    private static final String a;
    
    static {
        a = q.f("WorkerFactory");
    }
    
    @j0
    @t0({ t0.a.H })
    public static g0 c() {
        return new g0() {
            @k0
            @Override
            public ListenableWorker a(@j0 final Context context, @j0 final String s, @j0 final WorkerParameters workerParameters) {
                return null;
            }
        };
    }
    
    @k0
    public abstract ListenableWorker a(@j0 final Context p0, @j0 final String p1, @j0 final WorkerParameters p2);
    
    @k0
    @t0({ t0.a.H })
    public final ListenableWorker b(@j0 final Context context, @j0 final String str, @j0 final WorkerParameters workerParameters) {
        ListenableWorker a;
        final ListenableWorker listenableWorker = a = this.a(context, str, workerParameters);
        if (listenableWorker == null) {
            Class<? extends ListenableWorker> subclass = null;
            try {
                subclass = Class.forName(str).asSubclass(ListenableWorker.class);
            }
            finally {
                final q c = q.c();
                final String a2 = g0.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid class: ");
                sb.append(str);
                final Throwable t;
                c.b(a2, sb.toString(), t);
            }
            a = listenableWorker;
            if (subclass != null) {
                try {
                    final ListenableWorker listenableWorker2 = (ListenableWorker)subclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                }
                finally {
                    final q c2 = q.c();
                    final String a3 = g0.a;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not instantiate ");
                    sb2.append(str);
                    final Throwable t2;
                    c2.b(a3, sb2.toString(), t2);
                    a = listenableWorker;
                }
            }
        }
        if (a != null && a.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", this.getClass().getName(), str));
        }
        return a;
    }
}
