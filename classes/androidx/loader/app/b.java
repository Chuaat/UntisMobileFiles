// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.app;

import androidx.collection.n;
import androidx.lifecycle.z0;
import androidx.lifecycle.w0;
import androidx.lifecycle.l0;
import androidx.core.util.d;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Looper;
import androidx.annotation.g0;
import android.util.Log;
import java.lang.reflect.Modifier;
import androidx.loader.content.c;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.annotation.j0;
import androidx.lifecycle.y;

class b extends androidx.loader.app.a
{
    static final String c = "LoaderManager";
    static boolean d = false;
    @j0
    private final y a;
    @j0
    private final c b;
    
    b(@j0 final y a, @j0 final c1 c1) {
        this.a = a;
        this.b = androidx.loader.app.b.c.c(c1);
    }
    
    @g0
    @j0
    private <D> androidx.loader.content.c<D> j(final int n, @k0 final Bundle bundle, @j0 final androidx.loader.app.a.a<D> a, @k0 final androidx.loader.content.c<D> c) {
        try {
            this.b.j();
            final androidx.loader.content.c<D> b = a.b(n, bundle);
            if (b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (b.getClass().isMemberClass() && !Modifier.isStatic(b.getClass().getModifiers())) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(b);
                throw new IllegalArgumentException(sb.toString());
            }
            final a obj = new a<D>(n, bundle, (androidx.loader.content.c<Object>)b, (androidx.loader.content.c<Object>)c);
            if (androidx.loader.app.b.d) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("  Created new loader ");
                sb2.append(obj);
                Log.v("LoaderManager", sb2.toString());
            }
            this.b.h(n, obj);
            this.b.b();
            return obj.w(this.a, a);
        }
        finally {
            this.b.b();
        }
    }
    
    @g0
    @Override
    public void a(final int i) {
        if (this.b.f()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (androidx.loader.app.b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(this);
                sb.append(" of ");
                sb.append(i);
                Log.v("LoaderManager", sb.toString());
            }
            final a<Object> d = this.b.d(i);
            if (d != null) {
                d.r(true);
                this.b.i(i);
            }
            return;
        }
        throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    
    @Deprecated
    @Override
    public void b(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.b.a(s, fileDescriptor, printWriter, array);
    }
    
    @k0
    @Override
    public <D> androidx.loader.content.c<D> e(final int n) {
        if (!this.b.f()) {
            final a<D> d = this.b.d(n);
            androidx.loader.content.c<D> t;
            if (d != null) {
                t = d.t();
            }
            else {
                t = null;
            }
            return t;
        }
        throw new IllegalStateException("Called while creating a loader");
    }
    
    @Override
    public boolean f() {
        return this.b.e();
    }
    
    @g0
    @j0
    @Override
    public <D> androidx.loader.content.c<D> g(final int n, @k0 final Bundle obj, @j0 final androidx.loader.app.a.a<D> a) {
        if (this.b.f()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        final a<D> d = this.b.d(n);
        if (androidx.loader.app.b.d) {
            final StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(obj);
            Log.v("LoaderManager", sb.toString());
        }
        if (d == null) {
            return this.j(n, obj, a, null);
        }
        if (androidx.loader.app.b.d) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("  Re-using existing loader ");
            sb2.append(d);
            Log.v("LoaderManager", sb2.toString());
        }
        return d.w(this.a, a);
    }
    
    @Override
    public void h() {
        this.b.g();
    }
    
    @g0
    @j0
    @Override
    public <D> androidx.loader.content.c<D> i(final int n, @k0 final Bundle obj, @j0 final androidx.loader.app.a.a<D> a) {
        if (this.b.f()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (androidx.loader.app.b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(obj);
                Log.v("LoaderManager", sb.toString());
            }
            final a<D> d = this.b.d(n);
            androidx.loader.content.c<D> r = null;
            if (d != null) {
                r = (androidx.loader.content.c<D>)d.r(false);
            }
            return this.j(n, obj, a, r);
        }
        throw new IllegalStateException("restartLoader must be called on the main thread");
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.d.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
    
    public static class a<D> extends k0<D> implements c.c<D>
    {
        private final int m;
        @androidx.annotation.k0
        private final Bundle n;
        @j0
        private final c<D> o;
        private y p;
        private b<D> q;
        private c<D> r;
        
        a(final int m, @androidx.annotation.k0 final Bundle n, @j0 final c<D> o, @androidx.annotation.k0 final c<D> r) {
            this.m = m;
            this.n = n;
            this.o = o;
            this.r = r;
            o.u(m, (c.c<D>)this);
        }
        
        @Override
        public void a(@j0 final c<D> c, @androidx.annotation.k0 final D n) {
            if (b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.q(n);
            }
            else {
                if (b.d) {
                    Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
                }
                this.n(n);
            }
        }
        
        @Override
        protected void l() {
            if (b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.o.y();
        }
        
        @Override
        protected void m() {
            if (b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.o.z();
        }
        
        @Override
        public void o(@j0 final l0<? super D> l0) {
            super.o(l0);
            this.p = null;
            this.q = null;
        }
        
        @Override
        public void q(final D n) {
            super.q(n);
            final c<D> r = this.r;
            if (r != null) {
                r.w();
                this.r = null;
            }
        }
        
        @g0
        c<D> r(final boolean b) {
            if (b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.o.b();
            this.o.a();
            final b<D> q = this.q;
            if (q != null) {
                this.o(q);
                if (b) {
                    q.d();
                }
            }
            this.o.B((c.c<D>)this);
            if ((q != null && !q.c()) || b) {
                this.o.w();
                return this.r;
            }
            return this.o;
        }
        
        public void s(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
            printWriter.print(s);
            printWriter.print("mId=");
            printWriter.print(this.m);
            printWriter.print(" mArgs=");
            printWriter.println(this.n);
            printWriter.print(s);
            printWriter.print("mLoader=");
            printWriter.println(this.o);
            final c<D> o = this.o;
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("  ");
            o.g(sb.toString(), fileDescriptor, printWriter, array);
            if (this.q != null) {
                printWriter.print(s);
                printWriter.print("mCallbacks=");
                printWriter.println(this.q);
                final b<D> q = this.q;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append("  ");
                q.b(sb2.toString(), printWriter);
            }
            printWriter.print(s);
            printWriter.print("mData=");
            printWriter.println(this.t().d(this.f()));
            printWriter.print(s);
            printWriter.print("mStarted=");
            printWriter.println(this.h());
        }
        
        @j0
        c<D> t() {
            return this.o;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.m);
            sb.append(" : ");
            d.a(this.o, sb);
            sb.append("}}");
            return sb.toString();
        }
        
        boolean u() {
            final boolean h = this.h();
            final boolean b = false;
            if (!h) {
                return false;
            }
            final b<D> q = this.q;
            boolean b2 = b;
            if (q != null) {
                b2 = b;
                if (!q.c()) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        void v() {
            final y p = this.p;
            final b<D> q = this.q;
            if (p != null && q != null) {
                super.o(q);
                this.j(p, q);
            }
        }
        
        @g0
        @j0
        c<D> w(@j0 final y p2, @j0 final androidx.loader.app.a.a<D> a) {
            final b q = new b<Object>((c<Object>)this.o, (androidx.loader.app.a.a<Object>)a);
            this.j(p2, (l0<? super D>)q);
            final b<D> q2 = this.q;
            if (q2 != null) {
                this.o(q2);
            }
            this.p = p2;
            this.q = (b<D>)q;
            return this.o;
        }
    }
    
    static class b<D> implements l0<D>
    {
        @j0
        private final androidx.loader.content.c<D> G;
        @j0
        private final androidx.loader.app.a.a<D> H;
        private boolean I;
        
        b(@j0 final androidx.loader.content.c<D> g, @j0 final androidx.loader.app.a.a<D> h) {
            this.I = false;
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void a(@k0 final D n) {
            if (androidx.loader.app.b.d) {
                final StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.G);
                sb.append(": ");
                sb.append(this.G.d(n));
                Log.v("LoaderManager", sb.toString());
            }
            this.H.a(this.G, n);
            this.I = true;
        }
        
        public void b(final String s, final PrintWriter printWriter) {
            printWriter.print(s);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.I);
        }
        
        boolean c() {
            return this.I;
        }
        
        @g0
        void d() {
            if (this.I) {
                if (androidx.loader.app.b.d) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.G);
                    Log.v("LoaderManager", sb.toString());
                }
                this.H.c(this.G);
            }
        }
        
        @Override
        public String toString() {
            return this.H.toString();
        }
    }
    
    static class c extends w0
    {
        private static final z0.b c;
        private n<a> a;
        private boolean b;
        
        static {
            c = new z0.b() {
                @j0
                @Override
                public <T extends w0> T a(@j0 final Class<T> clazz) {
                    return (T)new c();
                }
            };
        }
        
        c() {
            this.a = new n<a>();
            this.b = false;
        }
        
        @j0
        static c c(final c1 c1) {
            return new z0(c1, androidx.loader.app.b.c.c).a(c.class);
        }
        
        public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
            if (this.a.C() > 0) {
                printWriter.print(s);
                printWriter.println("Loaders:");
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("    ");
                final String string = sb.toString();
                for (int i = 0; i < this.a.C(); ++i) {
                    final a a = this.a.D(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(this.a.r(i));
                    printWriter.print(": ");
                    printWriter.println(a.toString());
                    a.s(string, fileDescriptor, printWriter, array);
                }
            }
        }
        
        void b() {
            this.b = false;
        }
        
         <D> a<D> d(final int n) {
            return (a<D>)this.a.j(n);
        }
        
        boolean e() {
            for (int c = this.a.C(), i = 0; i < c; ++i) {
                if (this.a.D(i).u()) {
                    return true;
                }
            }
            return false;
        }
        
        boolean f() {
            return this.b;
        }
        
        void g() {
            for (int c = this.a.C(), i = 0; i < c; ++i) {
                this.a.D(i).v();
            }
        }
        
        void h(final int n, @j0 final a a) {
            this.a.s(n, a);
        }
        
        void i(final int n) {
            this.a.v(n);
        }
        
        void j() {
            this.b = true;
        }
        
        @Override
        protected void onCleared() {
            super.onCleared();
            for (int c = this.a.C(), i = 0; i < c; ++i) {
                this.a.D(i).r(true);
            }
            this.a.b();
        }
    }
}
