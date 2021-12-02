// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.f9;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import com.google.android.gms.internal.measurement.n5;
import java.util.Collection;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.c5;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.u4;
import androidx.annotation.c1;
import android.text.TextUtils;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.t4;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.BitSet;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.x4;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.y4;
import java.util.List;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.ra;

public final class ba extends p9
{
    ba(final z9 z9) {
        super(z9);
    }
    
    static <Builder extends ra> Builder A(final Builder builder, final byte[] array) throws u9 {
        final v8 b = v8.b();
        if (b != null) {
            return (Builder)builder.v5(array, b);
        }
        return (Builder)builder.Q4(array);
    }
    
    static List<y4> E(final Bundle[] array) {
        final ArrayList<y4> list = new ArrayList<y4>();
        for (final Bundle bundle : array) {
            if (bundle != null) {
                final x4 a = y4.A();
                for (final String s : bundle.keySet()) {
                    final x4 a2 = y4.A();
                    a2.F(s);
                    final Object value = bundle.get(s);
                    if (value instanceof Long) {
                        a2.E((long)value);
                    }
                    else if (value instanceof String) {
                        a2.H((String)value);
                    }
                    else {
                        if (!(value instanceof Double)) {
                            continue;
                        }
                        a2.D((double)value);
                    }
                    a.x(a2);
                }
                if (a.v() > 0) {
                    list.add(((f9<y4, BuilderType>)a).n());
                }
            }
        }
        return list;
    }
    
    static List<Long> H(final BitSet set) {
        final int initialCapacity = (set.length() + 63) / 64;
        final ArrayList list = new ArrayList<Long>(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            long l = 0L;
            long n;
            for (int j = 0; j < 64; ++j, l = n) {
                final int bitIndex = i * 64 + j;
                if (bitIndex >= set.length()) {
                    break;
                }
                n = l;
                if (set.get(bitIndex)) {
                    n = (l | 1L << j);
                }
            }
            list.add(l);
        }
        return (List<Long>)list;
    }
    
    static Map<String, Object> I(final Bundle bundle, final boolean b) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String s : bundle.keySet()) {
            final Object value = bundle.get(s);
            if (!(value instanceof Bundle[]) && !(value instanceof ArrayList) && !(value instanceof Bundle)) {
                if (value == null) {
                    continue;
                }
                hashMap.put(s, value);
            }
            else {
                if (!b) {
                    continue;
                }
                final ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
                if (value instanceof Parcelable[]) {
                    for (final Parcelable parcelable : (Parcelable[])value) {
                        if (parcelable instanceof Bundle) {
                            list.add(I((Bundle)parcelable, false));
                        }
                    }
                }
                else if (value instanceof ArrayList) {
                    final ArrayList<Bundle> list2 = (ArrayList<Bundle>)value;
                    for (int size = list2.size(), j = 0; j < size; ++j) {
                        final Object value2 = list2.get(j);
                        if (value2 instanceof Bundle) {
                            list.add(I((Bundle)value2, false));
                        }
                    }
                }
                else if (value instanceof Bundle) {
                    list.add(I((Bundle)value, false));
                }
                hashMap.put(s, list);
            }
        }
        return hashMap;
    }
    
    static boolean M(final List<Long> list, final int n) {
        return n < list.size() * 64 && (1L << n % 64 & (long)list.get(n / 64)) != 0x0L;
    }
    
    static boolean O(final String s) {
        return s != null && s.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && s.length() <= 310;
    }
    
    static final void j(final t4 t4, final String s, final Object o) {
        final List<y4> o2 = t4.O();
        int i = 0;
        while (true) {
            while (i < o2.size()) {
                if (s.equals(o2.get(i).C())) {
                    final x4 a = y4.A();
                    a.F(s);
                    if (o instanceof Long) {
                        a.E((long)o);
                    }
                    else if (o instanceof String) {
                        a.H((String)o);
                    }
                    else if (o instanceof Double) {
                        a.D((double)o);
                    }
                    else if (o instanceof Bundle[]) {
                        a.w(E((Bundle[])o));
                    }
                    if (i >= 0) {
                        t4.F(i, a);
                        return;
                    }
                    t4.A(a);
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    @c1
    static final boolean k(final u u, final na na) {
        x.k(u);
        x.k(na);
        return !TextUtils.isEmpty((CharSequence)na.H) || !TextUtils.isEmpty((CharSequence)na.W);
    }
    
    static final y4 l(final u4 u4, final String anObject) {
        for (final y4 y4 : u4.E()) {
            if (y4.C().equals(anObject)) {
                return y4;
            }
        }
        return null;
    }
    
    static final Object m(final u4 u4, final String s) {
        final y4 l = l(u4, s);
        if (l != null) {
            if (l.T()) {
                return l.D();
            }
            if (l.R()) {
                return l.z();
            }
            if (l.P()) {
                return l.v();
            }
            if (l.x() > 0) {
                final List<y4> e = l.E();
                final ArrayList<Bundle> list = new ArrayList<Bundle>();
                for (final y4 y4 : e) {
                    if (y4 != null) {
                        final Bundle bundle = new Bundle();
                        for (final y4 y5 : y4.E()) {
                            if (y5.T()) {
                                bundle.putString(y5.C(), y5.D());
                            }
                            else if (y5.R()) {
                                bundle.putLong(y5.C(), y5.z());
                            }
                            else {
                                if (!y5.P()) {
                                    continue;
                                }
                                bundle.putDouble(y5.C(), y5.v());
                            }
                        }
                        if (bundle.isEmpty()) {
                            continue;
                        }
                        list.add(bundle);
                    }
                }
                return list.toArray(new Bundle[list.size()]);
            }
        }
        return null;
    }
    
    private final void n(final StringBuilder sb, int n, final List<y4> list) {
        if (list == null) {
            return;
        }
        ++n;
        for (final y4 y4 : list) {
            if (y4 != null) {
                p(sb, n);
                sb.append("param {\n");
                final boolean s = y4.S();
                final Object o = null;
                String o2;
                if (s) {
                    o2 = super.a.A().o(y4.C());
                }
                else {
                    o2 = null;
                }
                s(sb, n, "name", o2);
                String d;
                if (y4.T()) {
                    d = y4.D();
                }
                else {
                    d = null;
                }
                s(sb, n, "string_value", d);
                Long value;
                if (y4.R()) {
                    value = y4.z();
                }
                else {
                    value = null;
                }
                s(sb, n, "int_value", value);
                Object value2 = o;
                if (y4.P()) {
                    value2 = y4.v();
                }
                s(sb, n, "double_value", value2);
                if (y4.x() > 0) {
                    this.n(sb, n, y4.E());
                }
                p(sb, n);
                sb.append("}\n");
            }
        }
    }
    
    private final void o(final StringBuilder sb, final int n, final q3 q3) {
        if (q3 == null) {
            return;
        }
        p(sb, n);
        sb.append("filter {\n");
        if (q3.D()) {
            s(sb, n, "complement", q3.C());
        }
        if (q3.F()) {
            s(sb, n, "param_name", super.a.A().o(q3.A()));
        }
        if (q3.G()) {
            final int n2 = n + 1;
            final c4 z = q3.z();
            if (z != null) {
                p(sb, n2);
                sb.append("string_filter {\n");
                if (z.E()) {
                    String s = null;
                    switch (z.F()) {
                        default: {
                            s = "IN_LIST";
                            break;
                        }
                        case 6: {
                            s = "EXACT";
                            break;
                        }
                        case 5: {
                            s = "PARTIAL";
                            break;
                        }
                        case 4: {
                            s = "ENDS_WITH";
                            break;
                        }
                        case 3: {
                            s = "BEGINS_WITH";
                            break;
                        }
                        case 2: {
                            s = "REGEXP";
                            break;
                        }
                        case 1: {
                            s = "UNKNOWN_MATCH_TYPE";
                            break;
                        }
                    }
                    s(sb, n2, "match_type", s);
                }
                if (z.D()) {
                    s(sb, n2, "expression", z.z());
                }
                if (z.C()) {
                    s(sb, n2, "case_sensitive", z.B());
                }
                if (z.v() > 0) {
                    p(sb, n2 + 1);
                    sb.append("expression_list {\n");
                    for (final String str : z.A()) {
                        p(sb, n2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                p(sb, n2);
                sb.append("}\n");
            }
        }
        if (q3.E()) {
            t(sb, n + 1, "number_filter", q3.x());
        }
        p(sb, n);
        sb.append("}\n");
    }
    
    private static final void p(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
    }
    
    private static final String q(final boolean b, final boolean b2, final boolean b3) {
        final StringBuilder sb = new StringBuilder();
        if (b) {
            sb.append("Dynamic ");
        }
        if (b2) {
            sb.append("Sequence ");
        }
        if (b3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }
    
    private static final void r(final StringBuilder sb, int n, final String str, final k5 k5) {
        if (k5 == null) {
            return;
        }
        p(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (k5.w() != 0) {
            p(sb, 4);
            sb.append("results: ");
            final Iterator<Long> iterator = k5.G().iterator();
            n = 0;
            while (iterator.hasNext()) {
                final Long obj = iterator.next();
                if (n != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
                ++n;
            }
            sb.append('\n');
        }
        if (k5.z() != 0) {
            p(sb, 4);
            sb.append("status: ");
            final Iterator<Long> iterator2 = k5.I().iterator();
            n = 0;
            while (iterator2.hasNext()) {
                final Long obj2 = iterator2.next();
                if (n != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
                ++n;
            }
            sb.append('\n');
        }
        if (k5.v() != 0) {
            p(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            final Iterator<s4> iterator3 = k5.F().iterator();
            n = 0;
            while (iterator3.hasNext()) {
                final s4 s4 = iterator3.next();
                if (n != 0) {
                    sb.append(", ");
                }
                Integer value;
                if (s4.D()) {
                    value = s4.v();
                }
                else {
                    value = null;
                }
                sb.append(value);
                sb.append(":");
                Long value2;
                if (s4.C()) {
                    value2 = s4.w();
                }
                else {
                    value2 = null;
                }
                sb.append(value2);
                ++n;
            }
            sb.append("}\n");
        }
        if (k5.x() != 0) {
            p(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            final Iterator<m5> iterator4 = k5.H().iterator();
            n = 0;
            while (iterator4.hasNext()) {
                final m5 m5 = iterator4.next();
                if (n != 0) {
                    sb.append(", ");
                }
                Integer value3;
                if (m5.E()) {
                    value3 = m5.w();
                }
                else {
                    value3 = null;
                }
                sb.append(value3);
                sb.append(": [");
                final Iterator<Long> iterator5 = m5.B().iterator();
                int n2 = 0;
                while (iterator5.hasNext()) {
                    final long longValue = iterator5.next();
                    if (n2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    ++n2;
                }
                sb.append("]");
                ++n;
            }
            sb.append("}\n");
        }
        p(sb, 3);
        sb.append("}\n");
    }
    
    private static final void s(final StringBuilder sb, final int n, final String str, final Object obj) {
        if (obj == null) {
            return;
        }
        p(sb, n + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }
    
    private static final void t(final StringBuilder sb, final int n, String str, final v3 v3) {
        if (v3 == null) {
            return;
        }
        p(sb, n);
        sb.append(str);
        sb.append(" {\n");
        if (v3.C()) {
            final int h = v3.H();
            if (h != 1) {
                if (h != 2) {
                    if (h != 3) {
                        if (h != 4) {
                            str = "BETWEEN";
                        }
                        else {
                            str = "EQUAL";
                        }
                    }
                    else {
                        str = "GREATER_THAN";
                    }
                }
                else {
                    str = "LESS_THAN";
                }
            }
            else {
                str = "UNKNOWN_COMPARISON_TYPE";
            }
            s(sb, n, "comparison_type", str);
        }
        if (v3.E()) {
            s(sb, n, "match_as_float", v3.B());
        }
        if (v3.D()) {
            s(sb, n, "comparison_value", v3.x());
        }
        if (v3.G()) {
            s(sb, n, "min_comparison_value", v3.A());
        }
        if (v3.F()) {
            s(sb, n, "max_comparison_value", v3.z());
        }
        p(sb, n);
        sb.append("}\n");
    }
    
    static int u(final d5 d5, final String s) {
        for (int i = 0; i < d5.q0(); ++i) {
            if (s.equals(d5.k0(i).B())) {
                return i;
            }
        }
        return -1;
    }
    
    static Bundle w(final Map<String, Object> map, final boolean b) {
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            final Long value = map.get(s);
            String string;
            if (value == null) {
                string = null;
            }
            else {
                if (value instanceof Long) {
                    bundle.putLong(s, (long)value);
                    continue;
                }
                if (value instanceof Double) {
                    bundle.putDouble(s, (double)value);
                    continue;
                }
                if (value instanceof ArrayList) {
                    if (b) {
                        final ArrayList<Map> list = (ArrayList<Map>)value;
                        final ArrayList<Bundle> list2 = new ArrayList<Bundle>();
                        for (int size = list.size(), i = 0; i < size; ++i) {
                            list2.add(w(list.get(i), false));
                        }
                        bundle.putParcelableArrayList(s, (ArrayList)list2);
                        continue;
                    }
                    continue;
                }
                else {
                    string = value.toString();
                }
            }
            bundle.putString(s, string);
        }
        return bundle;
    }
    
    static u y(final b b) {
        final Bundle w = w(b.e(), true);
        String string = null;
        Label_0043: {
            if (w.containsKey("_o")) {
                final Object value = w.get("_o");
                if (value != null) {
                    string = value.toString();
                    break Label_0043;
                }
            }
            string = "app";
        }
        String s;
        if ((s = x5.b(b.d())) == null) {
            s = b.d();
        }
        return new u(s, new s(w), string, b.a());
    }
    
    final String B(final c5 c5) {
        if (c5 == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (final e5 e5 : c5.z()) {
            if (e5 != null) {
                p(sb, 1);
                sb.append("bundle {\n");
                if (e5.h1()) {
                    s(sb, 1, "protocol_version", e5.p1());
                }
                s(sb, 1, "platform", e5.G());
                if (e5.d1()) {
                    s(sb, 1, "gmp_version", e5.y1());
                }
                if (e5.n1()) {
                    s(sb, 1, "uploading_gmp_version", e5.D1());
                }
                if (e5.b1()) {
                    s(sb, 1, "dynamite_version", e5.w1());
                }
                if (e5.v0()) {
                    s(sb, 1, "config_version", e5.u1());
                }
                s(sb, 1, "gmp_app_id", e5.D());
                s(sb, 1, "admob_app_id", e5.I1());
                s(sb, 1, "app_id", e5.J1());
                s(sb, 1, "app_version", e5.w());
                if (e5.t0()) {
                    s(sb, 1, "app_version_major", e5.W());
                }
                s(sb, 1, "firebase_instance_id", e5.B());
                if (e5.a1()) {
                    s(sb, 1, "dev_cert_hash", e5.v1());
                }
                s(sb, 1, "app_store", e5.v());
                if (e5.m1()) {
                    s(sb, 1, "upload_timestamp_millis", e5.C1());
                }
                if (e5.k1()) {
                    s(sb, 1, "start_timestamp_millis", e5.B1());
                }
                if (e5.c1()) {
                    s(sb, 1, "end_timestamp_millis", e5.x1());
                }
                if (e5.g1()) {
                    s(sb, 1, "previous_bundle_start_timestamp_millis", e5.A1());
                }
                if (e5.f1()) {
                    s(sb, 1, "previous_bundle_end_timestamp_millis", e5.z1());
                }
                s(sb, 1, "app_instance_id", e5.K1());
                s(sb, 1, "resettable_device_id", e5.H());
                s(sb, 1, "ds_id", e5.A());
                if (e5.e1()) {
                    s(sb, 1, "limited_ad_tracking", e5.q0());
                }
                s(sb, 1, "os_version", e5.F());
                s(sb, 1, "device_model", e5.z());
                s(sb, 1, "user_default_language", e5.I());
                if (e5.l1()) {
                    s(sb, 1, "time_zone_offset_minutes", e5.r1());
                }
                if (e5.u0()) {
                    s(sb, 1, "bundle_sequential_index", e5.X0());
                }
                if (e5.j1()) {
                    s(sb, 1, "service_upload", e5.r0());
                }
                s(sb, 1, "health_monitor", e5.E());
                if (!super.a.w().y(null, a3.p0) && e5.s0() && e5.t1() != 0L) {
                    s(sb, 1, "android_id", e5.t1());
                }
                if (e5.i1()) {
                    s(sb, 1, "retry_counter", e5.q1());
                }
                if (e5.w0()) {
                    s(sb, 1, "consent_signals", e5.x());
                }
                final List<o5> l = e5.L();
                if (l != null) {
                    for (final o5 o5 : l) {
                        if (o5 != null) {
                            p(sb, 2);
                            sb.append("user_property {\n");
                            Long value;
                            if (o5.N()) {
                                value = o5.x();
                            }
                            else {
                                value = null;
                            }
                            s(sb, 2, "set_timestamp_millis", value);
                            s(sb, 2, "name", super.a.A().p(o5.B()));
                            s(sb, 2, "string_value", o5.C());
                            Long value2;
                            if (o5.M()) {
                                value2 = o5.w();
                            }
                            else {
                                value2 = null;
                            }
                            s(sb, 2, "int_value", value2);
                            Double value3;
                            if (o5.L()) {
                                value3 = o5.v();
                            }
                            else {
                                value3 = null;
                            }
                            s(sb, 2, "double_value", value3);
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                final List<q4> j = e5.J();
                if (j != null) {
                    for (final q4 q4 : j) {
                        if (q4 != null) {
                            p(sb, 2);
                            sb.append("audience_membership {\n");
                            if (q4.G()) {
                                s(sb, 2, "audience_id", q4.v());
                            }
                            if (q4.H()) {
                                s(sb, 2, "new_audience", q4.F());
                            }
                            r(sb, 2, "current_data", q4.z());
                            if (q4.I()) {
                                r(sb, 2, "previous_data", q4.A());
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                final List<u4> k = e5.K();
                if (k != null) {
                    for (final u4 u4 : k) {
                        if (u4 != null) {
                            p(sb, 2);
                            sb.append("event {\n");
                            s(sb, 2, "name", super.a.A().n(u4.D()));
                            if (u4.P()) {
                                s(sb, 2, "timestamp_millis", u4.z());
                            }
                            if (u4.O()) {
                                s(sb, 2, "previous_timestamp_millis", u4.x());
                            }
                            if (u4.N()) {
                                s(sb, 2, "count", u4.v());
                            }
                            if (u4.w() != 0) {
                                this.n(sb, 2, u4.E());
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                p(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
    
    final String C(final o3 o3) {
        if (o3 == null) {
            return "null";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (o3.K()) {
            s(sb, 0, "filter_id", o3.w());
        }
        s(sb, 0, "event_name", super.a.A().n(o3.C()));
        final String q = q(o3.G(), o3.H(), o3.I());
        if (!q.isEmpty()) {
            s(sb, 0, "filter_type", q);
        }
        if (o3.J()) {
            t(sb, 1, "event_count_filter", o3.B());
        }
        if (o3.v() > 0) {
            sb.append("  filters {\n");
            final Iterator<q3> iterator = o3.D().iterator();
            while (iterator.hasNext()) {
                this.o(sb, 2, iterator.next());
            }
        }
        p(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }
    
    final String D(final x3 x3) {
        if (x3 == null) {
            return "null";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (x3.F()) {
            s(sb, 0, "filter_id", x3.v());
        }
        s(sb, 0, "property_name", super.a.A().p(x3.A()));
        final String q = q(x3.C(), x3.D(), x3.E());
        if (!q.isEmpty()) {
            s(sb, 0, "filter_type", q);
        }
        this.o(sb, 1, x3.w());
        sb.append("}\n");
        return sb.toString();
    }
    
    final List<Long> G(final List<Long> c, final List<Integer> list) {
        final ArrayList<Long> list2 = new ArrayList<Long>(c);
        for (final Integer n : list) {
            if (n < 0) {
                super.a.c().t().b("Ignoring negative bit index to be cleared", n);
            }
            else {
                final int n2 = n / 64;
                if (n2 >= list2.size()) {
                    super.a.c().t().c("Ignoring bit index greater than bitSet size", n, list2.size());
                }
                else {
                    list2.set(n2, (long)list2.get(n2) & ~(1L << n % 64));
                }
            }
        }
        int size = list2.size();
        int n3;
        for (int index = list2.size() - 1; index >= 0 && list2.get(index) == 0L; index = n3) {
            n3 = index - 1;
            size = index;
        }
        return list2.subList(0, size);
    }
    
    final void J(final x4 x4, final Object o) {
        x.k(o);
        x4.C();
        x4.A();
        x4.z();
        x4.B();
        if (o instanceof String) {
            x4.H((String)o);
            return;
        }
        if (o instanceof Long) {
            x4.E((long)o);
            return;
        }
        if (o instanceof Double) {
            x4.D((double)o);
            return;
        }
        if (o instanceof Bundle[]) {
            x4.w(E((Bundle[])o));
            return;
        }
        super.a.c().o().b("Ignoring invalid (type) event param value", o);
    }
    
    final void K(final n5 n5, final Object o) {
        x.k(o);
        n5.x();
        n5.w();
        n5.v();
        if (o instanceof String) {
            n5.D((String)o);
            return;
        }
        if (o instanceof Long) {
            n5.A((long)o);
            return;
        }
        if (o instanceof Double) {
            n5.z((double)o);
            return;
        }
        super.a.c().o().b("Ignoring invalid (type) user attribute value", o);
    }
    
    final boolean N(final long n, final long n2) {
        return n == 0L || n2 <= 0L || Math.abs(super.a.F().a() - n) > n2;
    }
    
    final byte[] P(byte[] byteArray) throws IOException {
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
            gzipOutputStream.write(byteArray);
            gzipOutputStream.close();
            out.close();
            byteArray = out.toByteArray();
            return byteArray;
        }
        catch (IOException ex) {
            super.a.c().o().b("Failed to gzip content", ex);
            throw ex;
        }
    }
    
    @Override
    protected final boolean i() {
        return false;
    }
    
    @c1
    final long v(final byte[] input) {
        x.k(input);
        super.a.M().e();
        final MessageDigest p = ga.p("MD5");
        if (p == null) {
            super.a.c().o().a("Failed to get MD5");
            return 0L;
        }
        return ga.q0(p.digest(input));
    }
    
    final <T extends Parcelable> T x(final byte[] array, final Parcelable$Creator<T> parcelable$Creator) {
        if (array == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(obtain);
                obtain.recycle();
                return (T)parcelable;
            }
            finally {}
        }
        catch (h2.b.a a) {
            super.a.c().o().a("Failed to load parcelable from buffer");
            obtain.recycle();
            return null;
        }
        obtain.recycle();
    }
    
    final u4 z(final p p) {
        final t4 a = u4.A();
        a.I(p.e);
        final r r = new r(p.f);
        while (r.hasNext()) {
            final String a2 = r.a();
            final x4 a3 = y4.A();
            a3.F(a2);
            final Object j2 = p.f.j2(a2);
            x.k(j2);
            this.J(a3, j2);
            a.A(a3);
        }
        return ((f9<u4, BuilderType>)a).n();
    }
}
