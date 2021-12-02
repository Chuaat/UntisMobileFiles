// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.internal.base.p;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import android.os.Looper;
import androidx.annotation.k0;
import f2.a;

@f2.a
public final class n<L>
{
    private final c a;
    @k0
    private volatile L b;
    @k0
    private volatile a<L> c;
    
    @f2.a
    n(@j0 final Looper looper, @j0 final L l, @j0 final String s) {
        this.a = new c(looper);
        this.b = x.l(l, "Listener must not be null");
        this.c = new a<L>(l, x.g(s));
    }
    
    @f2.a
    public final void a() {
        this.b = null;
        this.c = null;
    }
    
    @RecentlyNullable
    @f2.a
    public final a<L> b() {
        return this.c;
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean c() {
        return this.b != null;
    }
    
    @f2.a
    public final void d(@RecentlyNonNull final b<? super L> b) {
        x.l(b, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, (Object)b));
    }
    
    @f2.a
    final void e(final b<? super L> b) {
        final L b2 = this.b;
        if (b2 == null) {
            b.b();
            return;
        }
        try {
            b.a(b2);
        }
        catch (RuntimeException ex) {
            b.b();
            throw ex;
        }
    }
    
    @f2.a
    public static final class a<L>
    {
        private final L a;
        private final String b;
        
        @f2.a
        a(final L a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @RecentlyNonNull
        @f2.a
        @Override
        public final boolean equals(@k0 final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b.equals(a.b);
        }
        
        @RecentlyNonNull
        @f2.a
        @Override
        public final int hashCode() {
            return System.identityHashCode(this.a) * 31 + this.b.hashCode();
        }
    }
    
    @f2.a
    public interface b<L>
    {
        @f2.a
        void a(@RecentlyNonNull final L p0);
        
        @f2.a
        void b();
    }
    
    private final class c extends p
    {
        public c(final Looper looper) {
            super(looper);
        }
        
        public final void handleMessage(final Message message) {
            final int what = message.what;
            boolean b = true;
            if (what != 1) {
                b = false;
            }
            x.a(b);
            n.this.e((b<? super L>)message.obj);
        }
    }
}
