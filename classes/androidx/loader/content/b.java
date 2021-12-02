// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.content;

import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.core.os.n;
import android.database.ContentObserver;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Context;
import android.net.Uri;
import android.database.Cursor;

public class b extends a<Cursor>
{
    final a r;
    Uri s;
    String[] t;
    String u;
    String[] v;
    String w;
    Cursor x;
    androidx.core.os.c y;
    
    public b(@j0 final Context context) {
        super(context);
        this.r = new a();
    }
    
    public b(@j0 final Context context, @j0 final Uri s, @k0 final String[] t, @k0 final String u, @k0 final String[] v, @k0 final String w) {
        super(context);
        this.r = new a();
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
    }
    
    @Override
    public void D() {
        super.D();
        synchronized (this) {
            final androidx.core.os.c y = this.y;
            if (y != null) {
                y.a();
            }
        }
    }
    
    public void N(final Cursor x) {
        if (this.l()) {
            if (x != null) {
                x.close();
            }
            return;
        }
        final Cursor x2 = this.x;
        this.x = x;
        if (this.m()) {
            super.f(x);
        }
        if (x2 != null && x2 != x && !x2.isClosed()) {
            x2.close();
        }
    }
    
    @k0
    public String[] O() {
        return this.t;
    }
    
    @k0
    public String P() {
        return this.u;
    }
    
    @k0
    public String[] Q() {
        return this.v;
    }
    
    @k0
    public String R() {
        return this.w;
    }
    
    @j0
    public Uri S() {
        return this.s;
    }
    
    public Cursor T() {
        synchronized (this) {
            if (!this.H()) {
                this.y = new androidx.core.os.c();
                // monitorexit(this)
                try {
                    final Cursor a = androidx.core.content.b.a(this.i().getContentResolver(), this.s, this.t, this.u, this.v, this.w, this.y);
                    if (a != null) {
                        try {
                            a.getCount();
                            a.registerContentObserver((ContentObserver)this.r);
                        }
                        catch (RuntimeException ex) {
                            a.close();
                            throw ex;
                        }
                    }
                    synchronized (this) {
                        this.y = null;
                        return a;
                    }
                }
                finally {
                    synchronized (this) {
                        this.y = null;
                    }
                }
            }
            throw new n();
        }
    }
    
    public void U(final Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
    
    public void V(@k0 final String[] t) {
        this.t = t;
    }
    
    public void W(@k0 final String u) {
        this.u = u;
    }
    
    public void X(@k0 final String[] v) {
        this.v = v;
    }
    
    public void Y(@k0 final String w) {
        this.w = w;
    }
    
    public void Z(@j0 final Uri s) {
        this.s = s;
    }
    
    @Deprecated
    @Override
    public void g(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.g(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("mUri=");
        printWriter.println(this.s);
        printWriter.print(s);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(s);
        printWriter.print("mSelection=");
        printWriter.println(this.u);
        printWriter.print(s);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.v));
        printWriter.print(s);
        printWriter.print("mSortOrder=");
        printWriter.println(this.w);
        printWriter.print(s);
        printWriter.print("mCursor=");
        printWriter.println(this.x);
        printWriter.print(s);
        printWriter.print("mContentChanged=");
        printWriter.println(super.h);
    }
    
    @Override
    protected void r() {
        super.r();
        this.t();
        final Cursor x = this.x;
        if (x != null && !x.isClosed()) {
            this.x.close();
        }
        this.x = null;
    }
    
    @Override
    protected void s() {
        final Cursor x = this.x;
        if (x != null) {
            this.N(x);
        }
        if (this.A() || this.x == null) {
            this.h();
        }
    }
    
    @Override
    protected void t() {
        this.b();
    }
}
