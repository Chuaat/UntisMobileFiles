// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import com.bumptech.glide.util.m;
import java.io.Serializable;
import java.util.Iterator;
import com.bumptech.glide.load.engine.q;
import android.content.res.Resources$Theme;
import androidx.annotation.s;
import androidx.annotation.j0;
import android.util.Log;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.v;
import java.util.concurrent.Executor;
import java.util.List;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.h;
import android.content.Context;
import com.bumptech.glide.util.pool.c;
import androidx.annotation.k0;
import androidx.annotation.w;
import com.bumptech.glide.request.target.o;

public final class j<R> implements d, o, i
{
    private static final String D = "Request";
    private static final String E = "Glide";
    private static final boolean F;
    @w("requestLock")
    private int A;
    @w("requestLock")
    private boolean B;
    @k0
    private RuntimeException C;
    @k0
    private final String a;
    private final c b;
    private final Object c;
    @k0
    private final g<R> d;
    private final e e;
    private final Context f;
    private final com.bumptech.glide.d g;
    @k0
    private final Object h;
    private final Class<R> i;
    private final com.bumptech.glide.request.a<?> j;
    private final int k;
    private final int l;
    private final h m;
    private final p<R> n;
    @k0
    private final List<g<R>> o;
    private final com.bumptech.glide.request.transition.g<? super R> p;
    private final Executor q;
    @w("requestLock")
    private v<R> r;
    @w("requestLock")
    private k.d s;
    @w("requestLock")
    private long t;
    private volatile k u;
    @w("requestLock")
    private a v;
    @k0
    @w("requestLock")
    private Drawable w;
    @k0
    @w("requestLock")
    private Drawable x;
    @k0
    @w("requestLock")
    private Drawable y;
    @w("requestLock")
    private int z;
    
    static {
        F = Log.isLoggable("Request", 2);
    }
    
    private j(final Context f, final com.bumptech.glide.d g, @j0 final Object c, @k0 final Object h, final Class<R> i, final com.bumptech.glide.request.a<?> j, final int k, final int l, final h m, final p<R> n, @k0 final g<R> d, @k0 final List<g<R>> o, final e e, final k u, final com.bumptech.glide.request.transition.g<? super R> p16, final Executor q) {
        String value;
        if (com.bumptech.glide.request.j.F) {
            value = String.valueOf(super.hashCode());
        }
        else {
            value = null;
        }
        this.a = value;
        this.b = com.bumptech.glide.util.pool.c.a();
        this.c = c;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.d = d;
        this.o = o;
        this.e = e;
        this.u = u;
        this.p = p16;
        this.q = q;
        this.v = com.bumptech.glide.request.j.a.G;
        if (this.C == null && g.i()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }
    
    @w("requestLock")
    private void A() {
        if (!this.l()) {
            return;
        }
        Drawable p = null;
        if (this.h == null) {
            p = this.p();
        }
        Drawable o;
        if ((o = p) == null) {
            o = this.o();
        }
        Drawable q;
        if ((q = o) == null) {
            q = this.q();
        }
        this.n.h(q);
    }
    
    @w("requestLock")
    private void j() {
        if (!this.B) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
    
    @w("requestLock")
    private boolean k() {
        final e e = this.e;
        return e == null || e.k(this);
    }
    
    @w("requestLock")
    private boolean l() {
        final e e = this.e;
        return e == null || e.f(this);
    }
    
    @w("requestLock")
    private boolean m() {
        final e e = this.e;
        return e == null || e.h(this);
    }
    
    @w("requestLock")
    private void n() {
        this.j();
        this.b.c();
        this.n.b(this);
        final k.d s = this.s;
        if (s != null) {
            s.a();
            this.s = null;
        }
    }
    
    @w("requestLock")
    private Drawable o() {
        if (this.w == null && (this.w = this.j.O()) == null && this.j.N() > 0) {
            this.w = this.s(this.j.N());
        }
        return this.w;
    }
    
    @w("requestLock")
    private Drawable p() {
        if (this.y == null && (this.y = this.j.P()) == null && this.j.Q() > 0) {
            this.y = this.s(this.j.Q());
        }
        return this.y;
    }
    
    @w("requestLock")
    private Drawable q() {
        if (this.x == null && (this.x = this.j.V()) == null && this.j.W() > 0) {
            this.x = this.s(this.j.W());
        }
        return this.x;
    }
    
    @w("requestLock")
    private boolean r() {
        final e e = this.e;
        return e == null || !e.c().b();
    }
    
    @w("requestLock")
    private Drawable s(@s final int n) {
        Resources$Theme resources$Theme;
        if (this.j.b0() != null) {
            resources$Theme = this.j.b0();
        }
        else {
            resources$Theme = this.f.getTheme();
        }
        return com.bumptech.glide.load.resource.drawable.a.a((Context)this.g, n, resources$Theme);
    }
    
    private void t(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.a);
        Log.v("Request", sb.toString());
    }
    
    private static int u(int round, final float n) {
        if (round != Integer.MIN_VALUE) {
            round = Math.round(n * round);
        }
        return round;
    }
    
    @w("requestLock")
    private void v() {
        final e e = this.e;
        if (e != null) {
            e.a(this);
        }
    }
    
    @w("requestLock")
    private void w() {
        final e e = this.e;
        if (e != null) {
            e.j(this);
        }
    }
    
    public static <R> j<R> x(final Context context, final com.bumptech.glide.d d, final Object o, final Object o2, final Class<R> clazz, final com.bumptech.glide.request.a<?> a, final int n, final int n2, final h h, final p<R> p16, final g<R> g, @k0 final List<g<R>> list, final e e, final k k, final com.bumptech.glide.request.transition.g<? super R> g2, final Executor executor) {
        return new j<R>(context, d, o, o2, clazz, a, n, n2, h, p16, g, list, e, k, g2, executor);
    }
    
    private void y(final q q, int n) {
        this.b.c();
        synchronized (this.c) {
            q.l(this.C);
            final int g = this.g.g();
            if (g <= n) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.h);
                sb.append(" with size [");
                sb.append(this.z);
                sb.append("x");
                sb.append(this.A);
                sb.append("]");
                Log.w("Glide", sb.toString(), (Throwable)q);
                if (g <= 4) {
                    q.h("Glide");
                }
            }
            this.s = null;
            this.v = com.bumptech.glide.request.j.a.K;
            final int n2 = 1;
            this.B = true;
            try {
                final List<g<R>> o = this.o;
                int n3;
                if (o != null) {
                    final Iterator<g<R>> iterator = o.iterator();
                    n = 0;
                    while (true) {
                        n3 = n;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        n |= (iterator.next().d(q, this.h, this.n, this.r()) ? 1 : 0);
                    }
                }
                else {
                    n3 = 0;
                }
                final g<R> d = this.d;
                if (d != null && d.d(q, this.h, this.n, this.r())) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if ((n3 | n) == 0x0) {
                    this.A();
                }
                this.B = false;
                this.v();
            }
            finally {
                this.B = false;
            }
        }
    }
    
    @w("requestLock")
    private void z(final v<R> r, final R r2, final com.bumptech.glide.load.a obj) {
        final boolean r3 = this.r();
        this.v = com.bumptech.glide.request.j.a.J;
        this.r = r;
        if (this.g.g() <= 3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(r2.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(obj);
            sb.append(" for ");
            sb.append(this.h);
            sb.append(" with size [");
            sb.append(this.z);
            sb.append("x");
            sb.append(this.A);
            sb.append("] in ");
            sb.append(com.bumptech.glide.util.g.a(this.t));
            sb.append(" ms");
            Log.d("Glide", sb.toString());
        }
        final int n = 1;
        this.B = true;
        try {
            final List<g<R>> o = this.o;
            int n3;
            if (o != null) {
                final Iterator<g<R>> iterator = o.iterator();
                int n2 = 0;
                while (true) {
                    n3 = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    n2 |= (iterator.next().i(r2, this.h, this.n, obj, r3) ? 1 : 0);
                }
            }
            else {
                n3 = 0;
            }
            final g<R> d = this.d;
            int n4;
            if (d != null && d.i(r2, this.h, this.n, obj, r3)) {
                n4 = n;
            }
            else {
                n4 = 0;
            }
            if ((n4 | n3) == 0x0) {
                this.n.c(r2, this.p.a(obj, r3));
            }
            this.B = false;
            this.w();
        }
        finally {
            this.B = false;
        }
    }
    
    @Override
    public void D() {
        synchronized (this.c) {
            if (this.isRunning()) {
                this.clear();
            }
        }
    }
    
    @Override
    public void a(final q q) {
        this.y(q, 5);
    }
    
    @Override
    public boolean b() {
        synchronized (this.c) {
            return this.v == com.bumptech.glide.request.j.a.J;
        }
    }
    
    @Override
    public void c(final v<?> obj, final com.bumptech.glide.load.a a) {
        this.b.c();
        final v<?> v = null;
        final v<?> v2 = null;
        Object o = v;
        try {
            final Object c = this.c;
            o = v;
            // monitorenter(c)
            o = v2;
            q q2 = null;
            try {
                this.s = null;
                if (obj == null) {
                    o = v2;
                    o = v2;
                    o = v2;
                    final StringBuilder sb = new StringBuilder();
                    o = v2;
                    sb.append("Expected to receive a Resource<R> with an object of ");
                    o = v2;
                    sb.append(this.i);
                    o = v2;
                    sb.append(" inside, but instead got null.");
                    o = v2;
                    final q q = new q(sb.toString());
                    o = v2;
                    this.a(q);
                    o = v2;
                    // monitorexit(c)
                    return;
                }
                o = v2;
                final R value = obj.get();
                Label_0224: {
                    if (value == null) {
                        break Label_0224;
                    }
                    o = v2;
                    if (!this.i.isAssignableFrom(value.getClass())) {
                        break Label_0224;
                    }
                    o = v2;
                    Label_0205: {
                        if (this.m()) {
                            break Label_0205;
                        }
                        try {
                            this.r = null;
                            this.v = com.bumptech.glide.request.j.a.J;
                            // monitorexit(c)
                            this.u.l(obj);
                            return;
                            o = v2;
                            this.z((v<R>)obj, value, a);
                            o = v2;
                            // monitorexit(c)
                            return;
                            Serializable class1 = null;
                            Label_0284: {
                                class1 = "";
                            }
                            // iftrue(Label_0284:, value == null)
                            final StringBuilder sb2;
                            Label_0288: {
                                break Label_0288;
                                this.r = null;
                                o = new(com.bumptech.glide.load.engine.q.class);
                                sb2 = new StringBuilder();
                                sb2.append("Expected to receive an object of ");
                                sb2.append(this.i);
                                sb2.append(" but instead got ");
                                class1 = value.getClass();
                            }
                            sb2.append(class1);
                            sb2.append("{");
                            sb2.append(value);
                            sb2.append("} inside Resource{");
                            sb2.append(obj);
                            sb2.append("}.");
                            // iftrue(Label_0347:, value == null)
                            // monitorexit(c)
                            while (true) {
                                Block_11: {
                                    break Block_11;
                                    final String str;
                                    sb2.append(str);
                                    new q(sb2.toString());
                                    this.a((q)o);
                                    this.u.l(obj);
                                    return;
                                }
                                final String str = "";
                                continue;
                            }
                            Label_0347:
                            final String str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        finally {}
                    }
                }
            }
            finally {
                q2 = (q)o;
            }
            o = q2;
            // monitorexit(c)
            o = q2;
        }
        finally {
            if (o != null) {
                this.u.l((v<?>)o);
            }
        }
    }
    
    @Override
    public void clear() {
        synchronized (this.c) {
            this.j();
            this.b.c();
            final a v = this.v;
            final a l = com.bumptech.glide.request.j.a.L;
            if (v == l) {
                return;
            }
            this.n();
            v<?> r = this.r;
            if (r != null) {
                this.r = null;
            }
            else {
                r = null;
            }
            if (this.k()) {
                this.n.p(this.q());
            }
            this.v = l;
            // monitorexit(this.c)
            if (r != null) {
                this.u.l(r);
            }
        }
    }
    
    @Override
    public boolean d() {
        synchronized (this.c) {
            return this.v == com.bumptech.glide.request.j.a.J;
        }
    }
    
    @Override
    public boolean e(final d d) {
        if (!(d instanceof j)) {
            return false;
        }
        Object o = this.c;
        synchronized (o) {
            final int k = this.k;
            final int l = this.l;
            final Object h = this.h;
            final Class<R> i = this.i;
            final com.bumptech.glide.request.a<?> j = this.j;
            final h m = this.m;
            final List<g<R>> o2 = this.o;
            int size;
            if (o2 != null) {
                size = o2.size();
            }
            else {
                size = 0;
            }
            // monitorexit(o)
            final j j2 = (j)d;
            synchronized (j2.c) {
                final int k2 = j2.k;
                final int l2 = j2.l;
                o = j2.h;
                final Class<R> i2 = j2.i;
                final com.bumptech.glide.request.a<?> j3 = j2.j;
                final h m2 = j2.m;
                final List<g<R>> o3 = j2.o;
                int size2;
                if (o3 != null) {
                    size2 = o3.size();
                }
                else {
                    size2 = 0;
                }
                // monitorexit(j2.c)
                return k == k2 && l == l2 && com.bumptech.glide.util.m.c(h, o) && i.equals(i2) && j.equals(j3) && m == m2 && size == size2;
            }
        }
    }
    
    @Override
    public void f(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/request/j.b:Lcom/bumptech/glide/util/pool/c;
        //     4: invokevirtual   com/bumptech/glide/util/pool/c.c:()V
        //     7: aload_0        
        //     8: getfield        com/bumptech/glide/request/j.c:Ljava/lang/Object;
        //    11: astore_3       
        //    12: aload_3        
        //    13: monitorenter   
        //    14: getstatic       com/bumptech/glide/request/j.F:Z
        //    17: istore          4
        //    19: iload           4
        //    21: ifeq            65
        //    24: new             Ljava/lang/StringBuilder;
        //    27: astore          5
        //    29: aload           5
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: aload           5
        //    36: ldc_w           "Got onSizeReady in "
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: pop            
        //    43: aload           5
        //    45: aload_0        
        //    46: getfield        com/bumptech/glide/request/j.t:J
        //    49: invokestatic    com/bumptech/glide/util/g.a:(J)D
        //    52: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    55: pop            
        //    56: aload_0        
        //    57: aload           5
        //    59: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    62: invokespecial   com/bumptech/glide/request/j.t:(Ljava/lang/String;)V
        //    65: aload_0        
        //    66: getfield        com/bumptech/glide/request/j.v:Lcom/bumptech/glide/request/j$a;
        //    69: getstatic       com/bumptech/glide/request/j$a.I:Lcom/bumptech/glide/request/j$a;
        //    72: if_acmpeq       78
        //    75: aload_3        
        //    76: monitorexit    
        //    77: return         
        //    78: getstatic       com/bumptech/glide/request/j$a.H:Lcom/bumptech/glide/request/j$a;
        //    81: astore          5
        //    83: aload_0        
        //    84: aload           5
        //    86: putfield        com/bumptech/glide/request/j.v:Lcom/bumptech/glide/request/j$a;
        //    89: aload_0        
        //    90: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //    93: invokevirtual   com/bumptech/glide/request/a.a0:()F
        //    96: fstore          6
        //    98: aload_0        
        //    99: iload_1        
        //   100: fload           6
        //   102: invokestatic    com/bumptech/glide/request/j.u:(IF)I
        //   105: putfield        com/bumptech/glide/request/j.z:I
        //   108: aload_0        
        //   109: iload_2        
        //   110: fload           6
        //   112: invokestatic    com/bumptech/glide/request/j.u:(IF)I
        //   115: putfield        com/bumptech/glide/request/j.A:I
        //   118: iload           4
        //   120: ifeq            164
        //   123: new             Ljava/lang/StringBuilder;
        //   126: astore          7
        //   128: aload           7
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: aload           7
        //   135: ldc_w           "finished setup for calling load in "
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: pop            
        //   142: aload           7
        //   144: aload_0        
        //   145: getfield        com/bumptech/glide/request/j.t:J
        //   148: invokestatic    com/bumptech/glide/util/g.a:(J)D
        //   151: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   154: pop            
        //   155: aload_0        
        //   156: aload           7
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: invokespecial   com/bumptech/glide/request/j.t:(Ljava/lang/String;)V
        //   164: aload_0        
        //   165: getfield        com/bumptech/glide/request/j.u:Lcom/bumptech/glide/load/engine/k;
        //   168: astore          8
        //   170: aload_0        
        //   171: getfield        com/bumptech/glide/request/j.g:Lcom/bumptech/glide/d;
        //   174: astore          9
        //   176: aload_0        
        //   177: getfield        com/bumptech/glide/request/j.h:Ljava/lang/Object;
        //   180: astore          10
        //   182: aload_0        
        //   183: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   186: invokevirtual   com/bumptech/glide/request/a.Z:()Lcom/bumptech/glide/load/g;
        //   189: astore          11
        //   191: aload_0        
        //   192: getfield        com/bumptech/glide/request/j.z:I
        //   195: istore_1       
        //   196: aload_0        
        //   197: getfield        com/bumptech/glide/request/j.A:I
        //   200: istore_2       
        //   201: aload_0        
        //   202: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   205: invokevirtual   com/bumptech/glide/request/a.Y:()Ljava/lang/Class;
        //   208: astore          12
        //   210: aload_0        
        //   211: getfield        com/bumptech/glide/request/j.i:Ljava/lang/Class;
        //   214: astore          7
        //   216: aload_0        
        //   217: getfield        com/bumptech/glide/request/j.m:Lcom/bumptech/glide/h;
        //   220: astore          13
        //   222: aload_0        
        //   223: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   226: invokevirtual   com/bumptech/glide/request/a.L:()Lcom/bumptech/glide/load/engine/j;
        //   229: astore          14
        //   231: aload_0        
        //   232: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   235: invokevirtual   com/bumptech/glide/request/a.c0:()Ljava/util/Map;
        //   238: astore          15
        //   240: aload_0        
        //   241: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   244: invokevirtual   com/bumptech/glide/request/a.p0:()Z
        //   247: istore          16
        //   249: aload_0        
        //   250: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   253: invokevirtual   com/bumptech/glide/request/a.k0:()Z
        //   256: istore          17
        //   258: aload_0        
        //   259: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   262: invokevirtual   com/bumptech/glide/request/a.S:()Lcom/bumptech/glide/load/j;
        //   265: astore          18
        //   267: aload_0        
        //   268: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   271: invokevirtual   com/bumptech/glide/request/a.i0:()Z
        //   274: istore          19
        //   276: aload_0        
        //   277: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   280: invokevirtual   com/bumptech/glide/request/a.e0:()Z
        //   283: istore          20
        //   285: aload_0        
        //   286: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   289: invokevirtual   com/bumptech/glide/request/a.d0:()Z
        //   292: istore          21
        //   294: aload_0        
        //   295: getfield        com/bumptech/glide/request/j.j:Lcom/bumptech/glide/request/a;
        //   298: invokevirtual   com/bumptech/glide/request/a.R:()Z
        //   301: istore          22
        //   303: aload_0        
        //   304: getfield        com/bumptech/glide/request/j.q:Ljava/util/concurrent/Executor;
        //   307: astore          23
        //   309: aload           8
        //   311: aload           9
        //   313: aload           10
        //   315: aload           11
        //   317: iload_1        
        //   318: iload_2        
        //   319: aload           12
        //   321: aload           7
        //   323: aload           13
        //   325: aload           14
        //   327: aload           15
        //   329: iload           16
        //   331: iload           17
        //   333: aload           18
        //   335: iload           19
        //   337: iload           20
        //   339: iload           21
        //   341: iload           22
        //   343: aload_0        
        //   344: aload           23
        //   346: invokevirtual   com/bumptech/glide/load/engine/k.g:(Lcom/bumptech/glide/d;Ljava/lang/Object;Lcom/bumptech/glide/load/g;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/h;Lcom/bumptech/glide/load/engine/j;Ljava/util/Map;ZZLcom/bumptech/glide/load/j;ZZZZLcom/bumptech/glide/request/i;Ljava/util/concurrent/Executor;)Lcom/bumptech/glide/load/engine/k$d;
        //   349: astore          14
        //   351: aload_3        
        //   352: astore          7
        //   354: aload_0        
        //   355: aload           14
        //   357: putfield        com/bumptech/glide/request/j.s:Lcom/bumptech/glide/load/engine/k$d;
        //   360: aload_3        
        //   361: astore          7
        //   363: aload_0        
        //   364: getfield        com/bumptech/glide/request/j.v:Lcom/bumptech/glide/request/j$a;
        //   367: aload           5
        //   369: if_acmpeq       380
        //   372: aload_3        
        //   373: astore          7
        //   375: aload_0        
        //   376: aconst_null    
        //   377: putfield        com/bumptech/glide/request/j.s:Lcom/bumptech/glide/load/engine/k$d;
        //   380: iload           4
        //   382: ifeq            441
        //   385: aload_3        
        //   386: astore          7
        //   388: new             Ljava/lang/StringBuilder;
        //   391: astore          5
        //   393: aload_3        
        //   394: astore          7
        //   396: aload           5
        //   398: invokespecial   java/lang/StringBuilder.<init>:()V
        //   401: aload_3        
        //   402: astore          7
        //   404: aload           5
        //   406: ldc_w           "finished onSizeReady in "
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   412: pop            
        //   413: aload_3        
        //   414: astore          7
        //   416: aload           5
        //   418: aload_0        
        //   419: getfield        com/bumptech/glide/request/j.t:J
        //   422: invokestatic    com/bumptech/glide/util/g.a:(J)D
        //   425: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   428: pop            
        //   429: aload_3        
        //   430: astore          7
        //   432: aload_0        
        //   433: aload           5
        //   435: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   438: invokespecial   com/bumptech/glide/request/j.t:(Ljava/lang/String;)V
        //   441: aload_3        
        //   442: astore          7
        //   444: aload_3        
        //   445: monitorexit    
        //   446: return         
        //   447: astore          5
        //   449: goto            454
        //   452: astore          5
        //   454: aload_3        
        //   455: astore          7
        //   457: aload_3        
        //   458: monitorexit    
        //   459: aload           5
        //   461: athrow         
        //   462: astore          5
        //   464: aload           7
        //   466: astore_3       
        //   467: goto            454
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     19     452    454    Any
        //  24     65     452    454    Any
        //  65     77     452    454    Any
        //  78     118    452    454    Any
        //  123    164    452    454    Any
        //  164    309    452    454    Any
        //  309    351    447    452    Any
        //  354    360    462    470    Any
        //  363    372    462    470    Any
        //  375    380    462    470    Any
        //  388    393    462    470    Any
        //  396    401    462    470    Any
        //  404    413    462    470    Any
        //  416    429    462    470    Any
        //  432    441    462    470    Any
        //  444    446    462    470    Any
        //  457    459    462    470    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0380:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean g() {
        synchronized (this.c) {
            return this.v == com.bumptech.glide.request.j.a.L;
        }
    }
    
    @Override
    public Object h() {
        this.b.c();
        return this.c;
    }
    
    @Override
    public void i() {
        synchronized (this.c) {
            this.j();
            this.b.c();
            this.t = com.bumptech.glide.util.g.b();
            if (this.h == null) {
                if (com.bumptech.glide.util.m.v(this.k, this.l)) {
                    this.z = this.k;
                    this.A = this.l;
                }
                int n;
                if (this.p() == null) {
                    n = 5;
                }
                else {
                    n = 3;
                }
                this.y(new q("Received null model"), n);
                return;
            }
            final a v = this.v;
            final a h = com.bumptech.glide.request.j.a.H;
            if (v == h) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (v == com.bumptech.glide.request.j.a.J) {
                this.c(this.r, com.bumptech.glide.load.a.K);
                return;
            }
            final a i = com.bumptech.glide.request.j.a.I;
            this.v = i;
            if (com.bumptech.glide.util.m.v(this.k, this.l)) {
                this.f(this.k, this.l);
            }
            else {
                this.n.r(this);
            }
            final a v2 = this.v;
            if ((v2 == h || v2 == i) && this.l()) {
                this.n.k(this.q());
            }
            if (com.bumptech.glide.request.j.F) {
                final StringBuilder sb = new StringBuilder();
                sb.append("finished run method in ");
                sb.append(com.bumptech.glide.util.g.a(this.t));
                this.t(sb.toString());
            }
        }
    }
    
    @Override
    public boolean isRunning() {
        synchronized (this.c) {
            final a v = this.v;
            return v == com.bumptech.glide.request.j.a.H || v == com.bumptech.glide.request.j.a.I;
        }
    }
    
    private enum a
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
    }
}
