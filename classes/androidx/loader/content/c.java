// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.content;

import android.os.Handler;
import android.database.ContentObserver;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.core.util.d;
import androidx.annotation.k0;
import androidx.annotation.g0;
import androidx.annotation.j0;
import android.content.Context;

public class c<D>
{
    int a;
    c<D> b;
    b<D> c;
    Context d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    
    public c(@j0 final Context context) {
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = false;
        this.d = context.getApplicationContext();
    }
    
    public boolean A() {
        final boolean h = this.h;
        this.h = false;
        this.i |= h;
        return h;
    }
    
    @g0
    public void B(@j0 final c<D> c) {
        final c<D> b = this.b;
        if (b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (b == c) {
            this.b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    
    @g0
    public void C(@j0 final b<D> b) {
        final b<D> c = this.c;
        if (c == null) {
            throw new IllegalStateException("No listener register");
        }
        if (c == b) {
            this.c = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    
    @g0
    public void a() {
        this.f = true;
        this.n();
    }
    
    @g0
    public boolean b() {
        return this.o();
    }
    
    public void c() {
        this.i = false;
    }
    
    @j0
    public String d(@k0 final D n) {
        final StringBuilder sb = new StringBuilder(64);
        androidx.core.util.d.a(n, sb);
        sb.append("}");
        return sb.toString();
    }
    
    @g0
    public void e() {
        final b<D> c = this.c;
        if (c != null) {
            c.a(this);
        }
    }
    
    @g0
    public void f(@k0 final D n) {
        final c<D> b = this.b;
        if (b != null) {
            b.a(this, n);
        }
    }
    
    @Deprecated
    public void g(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(s);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(s);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }
    
    @g0
    public void h() {
        this.q();
    }
    
    @j0
    public Context i() {
        return this.d;
    }
    
    public int j() {
        return this.a;
    }
    
    public boolean k() {
        return this.f;
    }
    
    public boolean l() {
        return this.g;
    }
    
    public boolean m() {
        return this.e;
    }
    
    @g0
    protected void n() {
    }
    
    @g0
    protected boolean o() {
        return false;
    }
    
    @g0
    public void p() {
        if (this.e) {
            this.h();
        }
        else {
            this.h = true;
        }
    }
    
    @g0
    protected void q() {
    }
    
    @g0
    protected void r() {
    }
    
    @g0
    protected void s() {
    }
    
    @g0
    protected void t() {
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        androidx.core.util.d.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    @g0
    public void u(final int a, @j0 final c<D> b) {
        if (this.b == null) {
            this.b = b;
            this.a = a;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
    
    @g0
    public void v(@j0 final b<D> c) {
        if (this.c == null) {
            this.c = c;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
    
    @g0
    public void w() {
        this.r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }
    
    public void x() {
        if (this.i) {
            this.p();
        }
    }
    
    @g0
    public final void y() {
        this.e = true;
        this.g = false;
        this.f = false;
        this.s();
    }
    
    @g0
    public void z() {
        this.e = false;
        this.t();
    }
    
    public final class a extends ContentObserver
    {
        public a() {
            super(new Handler());
        }
        
        public boolean deliverSelfNotifications() {
            return true;
        }
        
        public void onChange(final boolean b) {
            androidx.loader.content.c.this.p();
        }
    }
    
    public interface b<D>
    {
        void a(@j0 final c<D> p0);
    }
    
    public interface c<D>
    {
        void a(@j0 final androidx.loader.content.c<D> p0, @k0 final D p1);
    }
}
