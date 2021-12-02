// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.auto.value.AutoValue$Builder;
import java.util.Objects;
import java.util.HashMap;
import androidx.annotation.p0;
import android.app.job.JobInfo$Builder;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import com.google.android.datatransport.e;
import java.util.Map;
import com.google.android.datatransport.runtime.time.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g
{
    private static final long a = 86400000L;
    private static final long b = 30000L;
    private static final long c = 1000L;
    private static final long d = 10000L;
    
    private long a(int n, final long n2) {
        --n;
        long n3;
        if (n2 > 1L) {
            n3 = n2;
        }
        else {
            n3 = 2L;
        }
        return (long)(Math.pow(3.0, n) * n2 * Math.max(1.0, Math.log(10000.0) / Math.log((double)(n3 * n))));
    }
    
    public static a b() {
        return new a();
    }
    
    static g d(final com.google.android.datatransport.runtime.time.a a, final Map<e, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(a, map);
    }
    
    public static g f(final com.google.android.datatransport.runtime.time.a a) {
        return b().a(e.G, g.b.a().b(30000L).d(86400000L).a()).a(e.I, g.b.a().b(1000L).d(86400000L).a()).a(e.H, g.b.a().b(86400000L).d(86400000L).c(j(g.c.G, g.c.H)).a()).c(a).b();
    }
    
    private static <T> Set<T> j(final T... a) {
        return Collections.unmodifiableSet((Set<? extends T>)new HashSet<T>((Collection<? extends T>)Arrays.asList(a)));
    }
    
    @p0(api = 21)
    private void k(final JobInfo$Builder jobInfo$Builder, final Set<c> set) {
        if (set.contains(g.c.G)) {
            jobInfo$Builder.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder.setRequiredNetworkType(1);
        }
        if (set.contains(g.c.I)) {
            jobInfo$Builder.setRequiresCharging(true);
        }
        if (set.contains(g.c.H)) {
            jobInfo$Builder.setRequiresDeviceIdle(true);
        }
    }
    
    @p0(api = 21)
    public JobInfo$Builder c(final JobInfo$Builder jobInfo$Builder, final e e, final long n, final int n2) {
        jobInfo$Builder.setMinimumLatency(this.h(e, n, n2));
        this.k(jobInfo$Builder, this.i().get(e).c());
        return jobInfo$Builder;
    }
    
    abstract com.google.android.datatransport.runtime.time.a e();
    
    public Set<c> g(final e e) {
        return this.i().get(e).c();
    }
    
    public long h(final e e, final long n, final int n2) {
        final long a = this.e().a();
        final b b = this.i().get(e);
        return Math.min(Math.max(this.a(n2, b.b()), n - a), b.d());
    }
    
    abstract Map<e, b> i();
    
    public static class a
    {
        private com.google.android.datatransport.runtime.time.a a;
        private Map<e, b> b;
        
        public a() {
            this.b = new HashMap<e, b>();
        }
        
        public a a(final e e, final b b) {
            this.b.put(e, b);
            return this;
        }
        
        public g b() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            if (this.b.keySet().size() >= e.values().length) {
                final Map<e, b> b = this.b;
                this.b = new HashMap<e, b>();
                return g.d(this.a, b);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }
        
        public a c(final com.google.android.datatransport.runtime.time.a a) {
            this.a = a;
            return this;
        }
    }
    
    @AutoValue
    public abstract static class b
    {
        public static a a() {
            return new d.b().c(Collections.emptySet());
        }
        
        abstract long b();
        
        abstract Set<c> c();
        
        abstract long d();
        
        @AutoValue$Builder
        public abstract static class a
        {
            public abstract b a();
            
            public abstract a b(final long p0);
            
            public abstract a c(final Set<c> p0);
            
            public abstract a d(final long p0);
        }
    }
    
    public enum c
    {
        G, 
        H, 
        I;
    }
}
