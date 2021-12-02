// 
// Decompiled by Procyon v0.5.36
// 

package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.k0;
import androidx.loader.content.c;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.g0;
import androidx.lifecycle.d1;
import androidx.annotation.j0;

public abstract class a
{
    public static void c(final boolean d) {
        b.d = d;
    }
    
    @j0
    public static <T extends y> a d(@j0 final T t) {
        return new b((y)t, ((d1)t).getViewModelStore());
    }
    
    @g0
    public abstract void a(final int p0);
    
    @Deprecated
    public abstract void b(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3);
    
    @k0
    public abstract <D> c<D> e(final int p0);
    
    public boolean f() {
        return false;
    }
    
    @g0
    @j0
    public abstract <D> c<D> g(final int p0, @k0 final Bundle p1, @j0 final a<D> p2);
    
    public abstract void h();
    
    @g0
    @j0
    public abstract <D> c<D> i(final int p0, @k0 final Bundle p1, @j0 final a<D> p2);
    
    public interface a<D>
    {
        @g0
        void a(@j0 final c<D> p0, final D p1);
        
        @g0
        @j0
        c<D> b(final int p0, @k0 final Bundle p1);
        
        @g0
        void c(@j0 final c<D> p0);
    }
}
