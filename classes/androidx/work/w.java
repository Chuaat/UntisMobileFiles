// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.work.impl.model.r;
import android.os.Build$VERSION;
import androidx.annotation.p0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import androidx.annotation.j0;
import android.annotation.SuppressLint;

public final class w extends f0
{
    @SuppressLint({ "MinMaxConstant" })
    public static final long g = 900000L;
    @SuppressLint({ "MinMaxConstant" })
    public static final long h = 300000L;
    
    w(final a a) {
        super(a.b, a.c, a.d);
    }
    
    public static final class a extends f0.a<a, w>
    {
        public a(@j0 final Class<? extends ListenableWorker> clazz, final long duration, @j0 final TimeUnit timeUnit) {
            super(clazz);
            super.c.f(timeUnit.toMillis(duration));
        }
        
        public a(@j0 final Class<? extends ListenableWorker> clazz, final long duration, @j0 final TimeUnit timeUnit, final long duration2, @j0 final TimeUnit timeUnit2) {
            super(clazz);
            super.c.g(timeUnit.toMillis(duration), timeUnit2.toMillis(duration2));
        }
        
        @p0(26)
        public a(@j0 final Class<? extends ListenableWorker> clazz, @j0 final Duration duration) {
            super(clazz);
            super.c.f(duration.toMillis());
        }
        
        @p0(26)
        public a(@j0 final Class<? extends ListenableWorker> clazz, @j0 final Duration duration, @j0 final Duration duration2) {
            super(clazz);
            super.c.g(duration.toMillis(), duration2.toMillis());
        }
        
        @j0
        w q() {
            if (super.a && Build$VERSION.SDK_INT >= 23 && super.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            final r c = super.c;
            if (c.q && Build$VERSION.SDK_INT >= 23 && c.j.h()) {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            return new w(this);
        }
        
        @j0
        a r() {
            return this;
        }
    }
}
