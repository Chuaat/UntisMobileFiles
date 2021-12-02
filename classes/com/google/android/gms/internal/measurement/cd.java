// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class cd implements bd
{
    public static final c7<Long> A;
    public static final c7<Long> B;
    public static final c7<Long> C;
    public static final c7<Long> D;
    public static final c7<Long> E;
    public static final c7<Long> F;
    public static final c7<Long> G;
    public static final c7<Long> H;
    public static final c7<Long> I;
    public static final c7<Long> J;
    public static final c7<String> K;
    public static final c7<Long> L;
    public static final c7<Long> a;
    public static final c7<Long> b;
    public static final c7<Long> c;
    public static final c7<String> d;
    public static final c7<String> e;
    public static final c7<String> f;
    public static final c7<Long> g;
    public static final c7<Long> h;
    public static final c7<Long> i;
    public static final c7<Long> j;
    public static final c7<Long> k;
    public static final c7<Long> l;
    public static final c7<Long> m;
    public static final c7<Long> n;
    public static final c7<Long> o;
    public static final c7<Long> p;
    public static final c7<Long> q;
    public static final c7<Long> r;
    public static final c7<String> s;
    public static final c7<Long> t;
    public static final c7<Long> u;
    public static final c7<Long> v;
    public static final c7<Long> w;
    public static final c7<Long> x;
    public static final c7<Long> y;
    public static final c7<Long> z;
    
    static {
        final z6 z2 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z2.c("measurement.ad_id_cache_time", 10000L);
        b = z2.c("measurement.max_bundles_per_iteration", 100L);
        c = z2.c("measurement.config.cache_time", 86400000L);
        d = z2.d("measurement.log_tag", "FA");
        e = z2.d("measurement.config.url_authority", "app-measurement.com");
        f = z2.d("measurement.config.url_scheme", "https");
        g = z2.c("measurement.upload.debug_upload_interval", 1000L);
        h = z2.c("measurement.lifetimevalue.max_currency_tracked", 4L);
        i = z2.c("measurement.store.max_stored_events_per_app", 100000L);
        j = z2.c("measurement.experiment.max_ids", 50L);
        k = z2.c("measurement.audience.filter_result_max_count", 200L);
        l = z2.c("measurement.alarm_manager.minimum_interval", 60000L);
        m = z2.c("measurement.upload.minimum_delay", 500L);
        n = z2.c("measurement.monitoring.sample_period_millis", 86400000L);
        o = z2.c("measurement.upload.realtime_upload_interval", 10000L);
        p = z2.c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        q = z2.c("measurement.config.cache_time.service", 3600000L);
        r = z2.c("measurement.service_client.idle_disconnect_millis", 5000L);
        s = z2.d("measurement.log_tag.service", "FA-SVC");
        t = z2.c("measurement.upload.stale_data_deletion_interval", 86400000L);
        u = z2.c("measurement.sdk.attribution.cache.ttl", 604800000L);
        v = z2.c("measurement.upload.backoff_period", 43200000L);
        w = z2.c("measurement.upload.initial_upload_delay_time", 15000L);
        x = z2.c("measurement.upload.interval", 3600000L);
        y = z2.c("measurement.upload.max_bundle_size", 65536L);
        z = z2.c("measurement.upload.max_bundles", 100L);
        A = z2.c("measurement.upload.max_conversions_per_day", 500L);
        B = z2.c("measurement.upload.max_error_events_per_day", 1000L);
        C = z2.c("measurement.upload.max_events_per_bundle", 1000L);
        D = z2.c("measurement.upload.max_events_per_day", 100000L);
        E = z2.c("measurement.upload.max_public_events_per_day", 50000L);
        F = z2.c("measurement.upload.max_queue_time", 2419200000L);
        G = z2.c("measurement.upload.max_realtime_events_per_day", 10L);
        H = z2.c("measurement.upload.max_batch_size", 65536L);
        I = z2.c("measurement.upload.retry_count", 6L);
        J = z2.c("measurement.upload.retry_time", 1800000L);
        K = z2.d("measurement.upload.url", "https://app-measurement.com/a");
        L = z2.c("measurement.upload.window_interval", 3600000L);
    }
    
    @Override
    public final long A() {
        return cd.G.b();
    }
    
    @Override
    public final long B() {
        return cd.H.b();
    }
    
    @Override
    public final String C() {
        return cd.f.b();
    }
    
    @Override
    public final String D() {
        return cd.K.b();
    }
    
    @Override
    public final long E() {
        return cd.F.b();
    }
    
    @Override
    public final long Q() {
        return cd.z.b();
    }
    
    @Override
    public final long V() {
        return cd.A.b();
    }
    
    @Override
    public final long a() {
        return cd.c.b();
    }
    
    @Override
    public final long b() {
        return cd.x.b();
    }
    
    @Override
    public final long c() {
        return cd.g.b();
    }
    
    @Override
    public final long d() {
        return cd.y.b();
    }
    
    @Override
    public final long e() {
        return cd.h.b();
    }
    
    @Override
    public final long f() {
        return cd.L.b();
    }
    
    @Override
    public final long g() {
        return cd.k.b();
    }
    
    @Override
    public final long h() {
        return cd.D.b();
    }
    
    @Override
    public final long i() {
        return cd.n.b();
    }
    
    @Override
    public final long j() {
        return cd.u.b();
    }
    
    @Override
    public final long k() {
        return cd.l.b();
    }
    
    @Override
    public final long l() {
        return cd.w.b();
    }
    
    @Override
    public final long m() {
        return cd.j.b();
    }
    
    @Override
    public final long n() {
        return cd.v.b();
    }
    
    @Override
    public final long o() {
        return cd.i.b();
    }
    
    @Override
    public final long p() {
        return cd.o.b();
    }
    
    @Override
    public final long q() {
        return cd.p.b();
    }
    
    @Override
    public final long r() {
        return cd.m.b();
    }
    
    @Override
    public final long s() {
        return cd.r.b();
    }
    
    @Override
    public final long t() {
        return cd.t.b();
    }
    
    @Override
    public final long u() {
        return cd.E.b();
    }
    
    @Override
    public final String v() {
        return cd.e.b();
    }
    
    @Override
    public final long w() {
        return cd.B.b();
    }
    
    @Override
    public final long x() {
        return cd.I.b();
    }
    
    @Override
    public final long y() {
        return cd.J.b();
    }
    
    @Override
    public final long z() {
        return cd.C.b();
    }
    
    @Override
    public final long zza() {
        return cd.a.b();
    }
    
    @Override
    public final long zzb() {
        return cd.b.b();
    }
}
