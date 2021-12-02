// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNullable;
import android.os.DeadObjectException;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import androidx.annotation.j0;
import android.os.RemoteException;
import androidx.annotation.b1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.k;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import com.google.android.gms.common.api.t;
import f2.a;

@f2.a
public class e
{
    @f2.a
    public abstract static class a<R extends t, A extends com.google.android.gms.common.api.a.b> extends BasePendingResult<R> implements e.b<R>
    {
        @f2.a
        private final com.google.android.gms.common.api.a.c<A> q;
        @k0
        @f2.a
        private final com.google.android.gms.common.api.a<?> r;
        
        @Deprecated
        @f2.a
        protected a(@RecentlyNonNull final com.google.android.gms.common.api.a.c<A> c, @RecentlyNonNull final k k) {
            super(x.l(k, "GoogleApiClient must not be null"));
            this.q = (com.google.android.gms.common.api.a.c<A>)x.k((com.google.android.gms.common.api.a.c)c);
            this.r = null;
        }
        
        @f2.a
        protected a(@RecentlyNonNull final com.google.android.gms.common.api.a<?> r, @RecentlyNonNull final k k) {
            super(x.l(k, "GoogleApiClient must not be null"));
            x.l(r, "Api must not be null");
            this.q = (com.google.android.gms.common.api.a.c<A>)r.c();
            this.r = r;
        }
        
        @b1
        @f2.a
        protected a(@RecentlyNonNull final BasePendingResult.a<R> a) {
            super((BasePendingResult.a)a);
            this.q = (com.google.android.gms.common.api.a.c<A>)new com.google.android.gms.common.api.a.c();
            this.r = null;
        }
        
        @f2.a
        private void D(@j0 final RemoteException ex) {
            this.a(new Status(8, ex.getLocalizedMessage(), null));
        }
        
        @RecentlyNonNull
        @f2.a
        public final com.google.android.gms.common.api.a.c<A> A() {
            return this.q;
        }
        
        @f2.a
        protected void B(@RecentlyNonNull final R r) {
        }
        
        @f2.a
        public final void C(@RecentlyNonNull final A a) throws DeadObjectException {
            try {
                this.y(a);
            }
            catch (RemoteException ex) {
                this.D(ex);
            }
            catch (DeadObjectException ex2) {
                this.D((RemoteException)ex2);
                throw ex2;
            }
        }
        
        @f2.a
        @Override
        public final void a(@RecentlyNonNull final Status status) {
            x.b(status.j3() ^ true, "Failed result must not be success");
            final t k = this.k(status);
            this.o((R)k);
            this.B((R)k);
        }
        
        @f2.a
        protected abstract void y(@RecentlyNonNull final A p0) throws RemoteException;
        
        @RecentlyNullable
        @f2.a
        public final com.google.android.gms.common.api.a<?> z() {
            return this.r;
        }
    }
    
    @f2.a
    public interface b<R>
    {
        @f2.a
        void a(@RecentlyNonNull final Status p0);
        
        @f2.a
        void b(@RecentlyNonNull final R p0);
    }
}
