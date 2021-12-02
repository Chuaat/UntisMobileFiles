// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.s6;
import java.util.Map;
import android.content.Context;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import com.google.android.gms.common.util.d0;

@d0
public final class a3
{
    public static final z2<Long> A;
    public static final z2<Boolean> A0;
    public static final z2<Long> B;
    public static final z2<Boolean> B0;
    public static final z2<Long> C;
    public static final z2<Boolean> C0;
    public static final z2<Integer> D;
    public static final z2<Long> E;
    public static final z2<Integer> F;
    public static final z2<Integer> G;
    public static final z2<Integer> H;
    public static final z2<Integer> I;
    public static final z2<Integer> J;
    public static final z2<Long> K;
    public static final z2<Boolean> L;
    public static final z2<String> M;
    public static final z2<Long> N;
    public static final z2<Integer> O;
    public static final z2<Double> P;
    public static final z2<Integer> Q;
    public static final z2<Integer> R;
    public static final z2<Long> S;
    public static final z2<Boolean> T;
    public static final z2<Boolean> U;
    public static final z2<Boolean> V;
    public static final z2<Boolean> W;
    public static final z2<Boolean> X;
    public static final z2<Boolean> Y;
    public static final z2<Boolean> Z;
    private static final List<z2<?>> a;
    public static final z2<Boolean> a0;
    private static final Set<z2<?>> b;
    public static final z2<Boolean> b0;
    public static final z2<Long> c;
    public static final z2<Boolean> c0;
    public static final z2<Long> d;
    public static final z2<Boolean> d0;
    public static final z2<Long> e;
    public static final z2<Boolean> e0;
    public static final z2<String> f;
    public static final z2<Boolean> f0;
    public static final z2<String> g;
    public static final z2<Boolean> g0;
    public static final z2<Integer> h;
    public static final z2<Boolean> h0;
    public static final z2<Integer> i;
    public static final z2<Boolean> i0;
    public static final z2<Integer> j;
    public static final z2<Boolean> j0;
    public static final z2<Integer> k;
    public static final z2<Boolean> k0;
    public static final z2<Integer> l;
    public static final z2<Boolean> l0;
    public static final z2<Integer> m;
    public static final z2<Boolean> m0;
    public static final z2<Integer> n;
    public static final z2<Boolean> n0;
    public static final z2<Integer> o;
    public static final z2<Boolean> o0;
    public static final z2<Integer> p;
    public static final z2<Boolean> p0;
    public static final z2<Integer> q;
    public static final z2<Integer> q0;
    public static final z2<String> r;
    public static final z2<Boolean> r0;
    public static final z2<Long> s;
    public static final z2<Boolean> s0;
    public static final z2<Long> t;
    public static final z2<Boolean> t0;
    public static final z2<Long> u;
    public static final z2<Boolean> u0;
    public static final z2<Long> v;
    public static final z2<Boolean> v0;
    public static final z2<Long> w;
    public static final z2<Boolean> w0;
    public static final z2<Long> x;
    public static final z2<Boolean> x0;
    public static final z2<Long> y;
    public static final z2<Boolean> y0;
    public static final z2<Long> z;
    public static final z2<Boolean> z0;
    
    static {
        a = Collections.synchronizedList(new ArrayList<z2<?>>());
        b = Collections.synchronizedSet(new HashSet<z2<?>>());
        final Long value = 10000L;
        c = a("measurement.ad_id_cache_time", value, value, com.google.android.gms.measurement.internal.w.a);
        final Long value2 = 86400000L;
        d = a("measurement.monitoring.sample_period_millis", value2, value2, com.google.android.gms.measurement.internal.i0.a);
        final Long value3 = 3600000L;
        e = a("measurement.config.cache_time", value2, value3, com.google.android.gms.measurement.internal.z.a);
        f = a("measurement.config.url_scheme", "https", "https", com.google.android.gms.measurement.internal.m0.a);
        g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", com.google.android.gms.measurement.internal.y0.a);
        final Integer value4 = 100;
        h = a("measurement.upload.max_bundles", value4, value4, l1.a);
        final Integer value5 = 65536;
        i = a("measurement.upload.max_batch_size", value5, value5, x1.a);
        j = a("measurement.upload.max_bundle_size", value5, value5, k2.a);
        final Integer value6 = 1000;
        k = a("measurement.upload.max_events_per_bundle", value6, value6, r2.a);
        final Integer value7 = 100000;
        l = a("measurement.upload.max_events_per_day", value7, value7, s2.a);
        m = a("measurement.upload.max_error_events_per_day", value6, value6, com.google.android.gms.measurement.internal.t0.a);
        final Integer value8 = 50000;
        n = a("measurement.upload.max_public_events_per_day", value8, value8, f1.a);
        final Integer value9 = 10000;
        o = a("measurement.upload.max_conversions_per_day", value9, value9, q1.a);
        final Integer value10 = 10;
        p = a("measurement.upload.max_realtime_events_per_day", value10, value10, b2.a);
        q = a("measurement.store.max_stored_events_per_app", value7, value7, n2.a);
        r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", t2.a);
        final Long value11 = 43200000L;
        s = a("measurement.upload.backoff_period", value11, value11, u2.a);
        t = a("measurement.upload.window_interval", value3, value3, v2.a);
        u = a("measurement.upload.interval", value3, value3, com.google.android.gms.measurement.internal.x.a);
        v = a("measurement.upload.realtime_upload_interval", value, value, com.google.android.gms.measurement.internal.y.a);
        final Long value12 = 1000L;
        w = a("measurement.upload.debug_upload_interval", value12, value12, com.google.android.gms.measurement.internal.a0.a);
        final Long value13 = 500L;
        x = a("measurement.upload.minimum_delay", value13, value13, com.google.android.gms.measurement.internal.c0.a);
        final Long value14 = 60000L;
        y = a("measurement.alarm_manager.minimum_interval", value14, value14, com.google.android.gms.measurement.internal.d0.a);
        z = a("measurement.upload.stale_data_deletion_interval", value2, value2, com.google.android.gms.measurement.internal.e0.a);
        final Long value15 = 604800000L;
        A = a("measurement.upload.refresh_blacklisted_config_interval", value15, value15, com.google.android.gms.measurement.internal.f0.a);
        final Long value16 = 15000L;
        B = a("measurement.upload.initial_upload_delay_time", value16, value16, com.google.android.gms.measurement.internal.g0.a);
        final Long value17 = 1800000L;
        C = a("measurement.upload.retry_time", value17, value17, com.google.android.gms.measurement.internal.h0.a);
        final Integer value18 = 6;
        D = a("measurement.upload.retry_count", value18, value18, com.google.android.gms.measurement.internal.j0.a);
        final Long value19 = 2419200000L;
        E = a("measurement.upload.max_queue_time", value19, value19, com.google.android.gms.measurement.internal.k0.a);
        final Integer value20 = 4;
        F = a("measurement.lifetimevalue.max_currency_tracked", value20, value20, com.google.android.gms.measurement.internal.l0.a);
        final Integer value21 = 200;
        G = a("measurement.audience.filter_result_max_count", value21, value21, com.google.android.gms.measurement.internal.n0.a);
        final Integer value22 = 25;
        H = a("measurement.upload.max_public_user_properties", value22, value22, null);
        final Integer value23 = 500;
        I = a("measurement.upload.max_event_name_cardinality", value23, value23, null);
        J = a("measurement.upload.max_public_event_params", value22, value22, null);
        final Long value24 = 5000L;
        K = a("measurement.service_client.idle_disconnect_millis", value24, value24, com.google.android.gms.measurement.internal.o0.a);
        final Boolean false = Boolean.FALSE;
        L = a("measurement.test.boolean_flag", false, false, com.google.android.gms.measurement.internal.p0.a);
        M = a("measurement.test.string_flag", "---", "---", com.google.android.gms.measurement.internal.q0.a);
        final Long value25 = -1L;
        N = a("measurement.test.long_flag", value25, value25, com.google.android.gms.measurement.internal.r0.a);
        final Integer value26 = -2;
        O = a("measurement.test.int_flag", value26, value26, com.google.android.gms.measurement.internal.s0.a);
        final Double value27 = -3.0;
        P = a("measurement.test.double_flag", value27, value27, com.google.android.gms.measurement.internal.u0.a);
        final Integer value28 = 50;
        Q = a("measurement.experiment.max_ids", value28, value28, com.google.android.gms.measurement.internal.v0.a);
        R = a("measurement.max_bundles_per_iteration", value4, value4, com.google.android.gms.measurement.internal.w0.a);
        S = a("measurement.sdk.attribution.cache.ttl", value15, value15, com.google.android.gms.measurement.internal.x0.a);
        T = a("measurement.validation.internal_limits_internal_event_params", false, false, com.google.android.gms.measurement.internal.z0.a);
        final Boolean true = Boolean.TRUE;
        U = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, a1.a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", false, false, b1.a);
        W = a("measurement.collection.log_event_and_bundle_v2", true, true, d1.a);
        X = a("measurement.quality.checksum", false, false, null);
        Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, e1.a);
        Z = a("measurement.audience.refresh_event_count_filters_timestamp", false, false, g1.a);
        a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, h1.a);
        b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, i1.a);
        c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, j1.a);
        d0 = a("measurement.sdk.collection.enable_extend_user_property_size", true, true, k1.a);
        e0 = a("measurement.upload.file_lock_state_check", true, true, m1.a);
        f0 = a("measurement.ga.ga_app_id", false, false, n1.a);
        g0 = a("measurement.lifecycle.app_in_background_parameter", false, false, o1.a);
        h0 = a("measurement.integration.disable_firebase_instance_id", false, false, p1.a);
        i0 = a("measurement.lifecycle.app_backgrounded_engagement", false, false, r1.a);
        j0 = a("measurement.collection.service.update_with_analytics_fix", false, false, s1.a);
        k0 = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, t1.a);
        l0 = a("measurement.client.sessions.check_on_reset_and_enable2", true, true, u1.a);
        m0 = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, v1.a);
        n0 = a("measurement.upload.file_truncate_fix", false, false, w1.a);
        o0 = a("measurement.collection.synthetic_data_mitigation", false, false, y1.a);
        p0 = a("measurement.androidId.delete_feature", true, true, z1.a);
        final Integer value29 = 203600;
        q0 = a("measurement.service.storage_consent_support_version", value29, value29, a2.a);
        r0 = a("measurement.client.properties.non_null_origin", true, true, c2.a);
        s0 = a("measurement.client.click_identifier_control.dev", false, false, e2.a);
        t0 = a("measurement.service.click_identifier_control", false, false, f2.a);
        u0 = a("measurement.client.reject_blank_user_id", true, true, g2.a);
        v0 = a("measurement.config.persist_last_modified", true, true, h2.a);
        w0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", true, true, i2.a);
        x0 = a("measurement.module.pixie.ees", false, false, j2.a);
        y0 = a("measurement.euid.client.dev", false, false, l2.a);
        z0 = a("measurement.euid.service", false, false, m2.a);
        A0 = a("measurement.adid_zero.service", false, false, o2.a);
        B0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", true, true, p2.a);
        C0 = a("measurement.service.refactor.package_side_screen", true, true, q2.a);
    }
    
    @d0
    static <V> z2<V> a(final String s, final V v, final V v2, final w2<V> w2) {
        final z2<Object> z2 = new z2<Object>(s, v, v2, w2, null);
        a3.a.add(z2);
        return (z2<V>)z2;
    }
    
    public static Map<String, String> c(final Context context) {
        final i6 b = i6.b(context.getContentResolver(), s6.a("com.google.android.gms.measurement"));
        Map<String, String> map;
        if (b == null) {
            map = Collections.emptyMap();
        }
        else {
            map = b.c();
        }
        return map;
    }
}
