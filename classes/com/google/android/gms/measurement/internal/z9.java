// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.q7;
import java.util.concurrent.Future;
import com.google.android.gms.internal.measurement.j9;
import java.io.FileNotFoundException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.util.Pair;
import android.os.Build;
import android.os.Parcelable;
import android.content.ContentValues;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.content.Intent;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.math.BigInteger;
import java.util.Locale;
import android.os.Bundle;
import java.util.Collections;
import com.google.android.gms.internal.measurement.nf;
import java.net.MalformedURLException;
import androidx.collection.a;
import java.net.URL;
import com.google.android.gms.internal.measurement.bf;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import java.io.IOException;
import java.nio.ByteBuffer;
import android.database.Cursor;
import com.google.android.gms.internal.measurement.oc;
import com.google.android.gms.common.util.g;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.i4;
import java.security.SecureRandom;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.ta;
import com.google.android.gms.internal.measurement.ra;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.e5;
import java.util.Collection;
import java.util.ArrayList;
import android.util.Log;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.wrappers.c;
import androidx.annotation.c1;
import com.google.android.gms.internal.measurement.fe;
import android.text.TextUtils;
import androidx.annotation.j0;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.measurement.y4;
import com.google.android.gms.internal.measurement.t4;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.common.internal.x;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import com.google.android.gms.common.util.d0;
import java.util.Map;

public final class z9 implements v5
{
    private static volatile z9 C;
    private final Map<String, h> A;
    private final fa B;
    private final q4 a;
    private final t3 b;
    private k c;
    private v3 d;
    private n9 e;
    private xa f;
    private final ba g;
    private k7 h;
    private v8 i;
    private final q9 j;
    private g4 k;
    private final z4 l;
    private boolean m;
    private boolean n;
    @d0
    long o;
    private List<Runnable> p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private FileLock v;
    private FileChannel w;
    private List<Long> x;
    private List<Long> y;
    private long z;
    
    z9(final aa aa, final z4 z4) {
        this.m = false;
        this.B = new w9(this);
        com.google.android.gms.common.internal.x.k(aa);
        this.l = z4.E(aa.a, null, null);
        this.z = -1L;
        this.j = new q9(this);
        final ba g = new ba(this);
        g.g();
        this.g = g;
        final t3 b = new t3(this);
        b.g();
        this.b = b;
        final q4 a = new q4(this);
        a.g();
        this.a = a;
        this.A = new HashMap<String, h>();
        this.b().w(new r9(this, aa));
    }
    
    @d0
    static final void A(final t4 t4, final int n, final String s) {
        final List<y4> o = t4.O();
        for (int i = 0; i < o.size(); ++i) {
            if ("_err".equals(o.get(i).C())) {
                return;
            }
        }
        final x4 a = y4.A();
        a.F("_err");
        a.E(n);
        final y4 y4 = ((f9<y4, BuilderType>)a).n();
        final x4 a2 = com.google.android.gms.internal.measurement.y4.A();
        a2.F("_ev");
        a2.H(s);
        final y4 y5 = ((f9<y4, BuilderType>)a2).n();
        t4.B(y4);
        t4.B(y5);
    }
    
    @d0
    static final void B(final t4 t4, @j0 final String s) {
        final List<y4> o = t4.O();
        for (int i = 0; i < o.size(); ++i) {
            if (s.equals(o.get(i).C())) {
                t4.D(i);
                return;
            }
        }
    }
    
    @c1
    private final na D(final String s) {
        final k c = this.c;
        P(c);
        final h5 s2 = c.S(s);
        Object w;
        String s3;
        l3 n;
        if (s2 != null && !TextUtils.isEmpty((CharSequence)s2.h0())) {
            final Boolean e = this.E(s2);
            if (e == null || e) {
                final String k0 = s2.k0();
                final String h0 = s2.h0();
                final long m = s2.M();
                final String g0 = s2.g0();
                final long x = s2.X();
                final long u = s2.U();
                final boolean i = s2.K();
                final String i2 = s2.i0();
                final long a = s2.A();
                final boolean j = s2.J();
                final String c2 = s2.c0();
                final Boolean b0 = s2.b0();
                final long v = s2.V();
                final List<String> c3 = s2.c();
                fe.b();
                String j2;
                if (this.S().y(s, a3.f0)) {
                    j2 = s2.j0();
                }
                else {
                    j2 = null;
                }
                return new na(s, k0, h0, m, g0, x, u, null, i, false, i2, a, 0L, 0, j, false, c2, b0, v, c3, j2, this.T(s).i());
            }
            final l3 o = this.c().o();
            w = n3.w(s);
            s3 = "App version does not match; dropping. appId";
            n = o;
        }
        else {
            n = this.c().n();
            final String s4 = "No app data available; dropping";
            w = s;
            s3 = s4;
        }
        n.b(s3, w);
        return null;
    }
    
    @c1
    private final Boolean E(final h5 h5) {
        try {
            if (h5.M() != -2147483648L) {
                if (h5.M() == com.google.android.gms.common.wrappers.c.a(this.l.X()).e(h5.e0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            }
            else {
                final String versionName = com.google.android.gms.common.wrappers.c.a(this.l.X()).e(h5.e0(), 0).versionName;
                final String h6 = h5.h0();
                if (h6 != null && h6.equals(versionName)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    @c1
    private final void G() {
        this.b().e();
        if (this.s || this.t || this.u) {
            this.c().s().d("Not stopping services. fetch, network, upload", this.s, this.t, this.u);
            return;
        }
        this.c().s().a("Stopping uploading service(s)");
        final List<Runnable> p = this.p;
        if (p == null) {
            return;
        }
        final Iterator<Runnable> iterator = p.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
        com.google.android.gms.common.internal.x.k(this.p).clear();
    }
    
    @d0
    private final void H(final d5 d5, final long l, final boolean b) {
        String s;
        if (!b) {
            s = "_lte";
        }
        else {
            s = "_se";
        }
        final k c = this.c;
        P(c);
        final ea z = c.Z(d5.l0(), s);
        ea ea;
        if (z != null && z.e != null) {
            ea = new ea(d5.l0(), "auto", s, this.F().a(), (long)z.e + l);
        }
        else {
            ea = new ea(d5.l0(), "auto", s, this.F().a(), l);
        }
        final n5 z2 = o5.z();
        z2.B(s);
        z2.C(this.F().a());
        z2.A((long)ea.e);
        final o5 o5 = ((f9<o5, BuilderType>)z2).n();
        final int u = ba.u(d5, s);
        if (u >= 0) {
            d5.i0(u, o5);
        }
        else {
            d5.A0(o5);
        }
        if (l > 0L) {
            final k c2 = this.c;
            P(c2);
            c2.w(ea);
            String s2;
            if (!b) {
                s2 = "lifetime";
            }
            else {
                s2 = "session-scoped";
            }
            this.c().s().c("Updated engagement user property. scope, value", s2, ea.e);
        }
    }
    
    private final void I(final t4 t4, final t4 t5) {
        com.google.android.gms.common.internal.x.a("_e".equals(t4.N()));
        P(this.g);
        final y4 l = ba.l(((f9<u4, BuilderType>)t4).n(), "_et");
        if (l != null && l.R()) {
            if (l.z() > 0L) {
                final long z = l.z();
                P(this.g);
                final y4 i = ba.l(((f9<u4, BuilderType>)t5).n(), "_et");
                long j = z;
                if (i != null) {
                    j = z;
                    if (i.z() > 0L) {
                        j = z + i.z();
                    }
                }
                P(this.g);
                ba.j(t5, "_et", j);
                P(this.g);
                ba.j(t4, "_fr", 1L);
            }
        }
    }
    
    @c1
    private final void J() {
        this.b().e();
        this.d();
        if (this.o > 0L) {
            final long l = 3600000L - Math.abs(this.F().d() - this.o);
            if (l > 0L) {
                this.c().s().b("Upload has been suspended. Will update scheduling later in approximately ms", l);
                this.Y().c();
                final n9 e = this.e;
                P(e);
                e.j();
                return;
            }
            this.o = 0L;
        }
        if (!this.l.o() || !this.N()) {
            this.c().s().a("Nothing to upload or uploading impossible");
            this.Y().c();
            final n9 e2 = this.e;
            P(e2);
            e2.j();
            return;
        }
        final long a = this.F().a();
        this.S();
        final long max = Math.max(0L, a3.B.a(null));
        final k c = this.c;
        P(c);
        final boolean r = c.r();
        int n2;
        final int n = n2 = 1;
        if (!r) {
            final k c2 = this.c;
            P(c2);
            if (c2.q()) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        z2<Long> z2;
        if (n2 != 0) {
            final String r2 = this.S().r();
            if (!TextUtils.isEmpty((CharSequence)r2) && !".none.".equals(r2)) {
                this.S();
                z2 = a3.w;
            }
            else {
                this.S();
                z2 = a3.v;
            }
        }
        else {
            this.S();
            z2 = a3.u;
        }
        final long max2 = Math.max(0L, z2.a(null));
        final long a2 = this.i.i.a();
        final long a3 = this.i.j.a();
        final k c3 = this.c;
        P(c3);
        final long n3 = c3.N();
        final k c4 = this.c;
        P(c4);
        final long max3 = Math.max(n3, c4.O());
        long a5 = 0L;
        Label_0570: {
            if (max3 != 0L) {
                final long a4 = a - Math.abs(max3 - a);
                final long abs = Math.abs(a2 - a);
                final long b = a - Math.abs(a3 - a);
                final long max4 = Math.max(a - abs, b);
                long n5;
                final long n4 = n5 = a4 + max;
                if (n2 != 0) {
                    n5 = n4;
                    if (max4 > 0L) {
                        n5 = Math.min(a4, max4) + max2;
                    }
                }
                final ba g = this.g;
                P(g);
                if (!g.N(max4, max2)) {
                    n5 = max4 + max2;
                }
                a5 = n5;
                if (b == 0L) {
                    break Label_0570;
                }
                a5 = n5;
                if (b < a4) {
                    break Label_0570;
                }
                int n6 = 0;
                while (true) {
                    this.S();
                    if (n6 >= Math.min(20, Math.max(0, com.google.android.gms.measurement.internal.a3.D.a(null)))) {
                        break;
                    }
                    this.S();
                    n5 = (a5 = n5 + Math.max(0L, com.google.android.gms.measurement.internal.a3.C.a(null)) * (1L << n6));
                    if (n5 > b) {
                        break Label_0570;
                    }
                    ++n6;
                }
            }
            a5 = 0L;
        }
        if (a5 == 0L) {
            this.c().s().a("Next upload time is 0");
            this.Y().c();
            final n9 e3 = this.e;
            P(e3);
            e3.j();
            return;
        }
        final t3 b2 = this.b;
        P(b2);
        if (b2.k()) {
            final long a6 = this.i.h.a();
            this.S();
            final long max5 = Math.max(0L, com.google.android.gms.measurement.internal.a3.s.a(null));
            final ba g2 = this.g;
            P(g2);
            long max6 = a5;
            if (!g2.N(a6, max5)) {
                max6 = Math.max(a5, a6 + max5);
            }
            this.Y().c();
            long max7;
            if ((max7 = max6 - this.F().a()) <= 0L) {
                this.S();
                max7 = Math.max(0L, com.google.android.gms.measurement.internal.a3.x.a(null));
                this.i.i.b(this.F().a());
            }
            this.c().s().b("Upload scheduled in approximately ms", max7);
            final n9 e4 = this.e;
            P(e4);
            e4.k(max7);
            return;
        }
        this.c().s().a("No network");
        this.Y().b();
        final n9 e5 = this.e;
        P(e5);
        e5.j();
    }
    
    private final boolean K(final na na) {
        fe.b();
        if (this.S().y(na.G, a3.f0)) {
            return !TextUtils.isEmpty((CharSequence)na.H) || !TextUtils.isEmpty((CharSequence)na.a0) || !TextUtils.isEmpty((CharSequence)na.W);
        }
        return !TextUtils.isEmpty((CharSequence)na.H) || !TextUtils.isEmpty((CharSequence)na.W);
    }
    
    @c1
    private final boolean M(String c, long n) {
        final String s = "_sc";
        final String s2 = "_sn";
        final String s3 = "_npa";
        String s4 = "_ai";
        final k c2 = this.c;
        P(c2);
        c2.g0();
        try {
            final y9 y9 = new y9(this, null);
            final k c3 = this.c;
            P(c3);
            c3.G(null, n, this.z, y9);
            final List<u4> c4 = y9.c;
            if (c4 != null && !c4.isEmpty()) {
                Object o = ((j9<MessageType, d5>)y9.a).p();
                ((d5)o).E0();
                final boolean y10 = this.S().y(y9.a.J1(), a3.V);
                ra ra;
                ta ta = ra = null;
                int n2 = -1;
                int n3 = 0;
                int n4 = -1;
                n = 0L;
                int n5 = 0;
                boolean b = false;
                while (true) {
                    final int size = y9.c.size();
                    final String s5 = "_et";
                    if (n3 >= size) {
                        break;
                    }
                    final t4 t4 = ((j9<MessageType, t4>)y9.c.get(n3)).p();
                    final q4 a = this.a;
                    P(a);
                    d5 d5;
                    ra ra2;
                    String s7;
                    if (a.u(y9.a.J1(), t4.N())) {
                        this.c().t().c("Dropping blocked raw event. appId", com.google.android.gms.measurement.internal.n3.w(y9.a.J1()), this.l.A().n(t4.N()));
                        final q4 a2 = this.a;
                        P(a2);
                        if (!a2.s(y9.a.J1())) {
                            final q4 a3 = this.a;
                            P(a3);
                            if (!a3.v(y9.a.J1())) {
                                if (!"_err".equals(t4.N())) {
                                    this.g0().x(this.B, y9.a.J1(), 11, "_ev", t4.N(), 0);
                                }
                            }
                        }
                        final String s6 = s4;
                        d5 = (d5)o;
                        ra2 = ra;
                        s7 = s6;
                    }
                    else {
                        String s8 = s4;
                        if (t4.N().equals(x5.a(s4))) {
                            t4.E(s4);
                            this.c().s().a("Renaming ad_impression to _ai");
                            s8 = s4;
                            if (Log.isLoggable(this.c().z(), 5)) {
                                int n6 = 0;
                                while (true) {
                                    s8 = s4;
                                    if (n6 >= t4.v()) {
                                        break;
                                    }
                                    if ("ad_platform".equals(t4.L(n6).C()) && !TextUtils.isEmpty((CharSequence)t4.L(n6).D()) && "admob".equalsIgnoreCase(t4.L(n6).D())) {
                                        this.c().u().a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    ++n6;
                                }
                            }
                        }
                        final String s9 = s8;
                        final q4 a4 = this.a;
                        P(a4);
                        final boolean t5 = a4.t(y9.a.J1(), t4.N());
                        String s10 = null;
                        boolean b2 = false;
                        boolean b3 = false;
                        Label_1482: {
                            if (!t5) {
                                P(this.g);
                                final String n7 = t4.N();
                                com.google.android.gms.common.internal.x.g(n7);
                                final int hashCode = n7.hashCode();
                                int n8 = 0;
                                Label_0693: {
                                    if (hashCode != 94660) {
                                        if (hashCode != 95025) {
                                            if (hashCode == 95027) {
                                                if (n7.equals("_ui")) {
                                                    n8 = 1;
                                                    break Label_0693;
                                                }
                                            }
                                        }
                                        else if (n7.equals("_ug")) {
                                            n8 = 2;
                                            break Label_0693;
                                        }
                                    }
                                    else if (n7.equals("_in")) {
                                        n8 = 0;
                                        break Label_0693;
                                    }
                                    n8 = -1;
                                }
                                if (n8 != 0 && n8 != 1 && n8 != 2) {
                                    s10 = "_et";
                                    b2 = false;
                                    b3 = b;
                                    break Label_1482;
                                }
                            }
                            int i = 0;
                            int n9 = 0;
                            boolean b4 = false;
                            final String s11 = s5;
                            while (i < t4.v()) {
                                int n10;
                                if ("_c".equals(t4.L(i).C())) {
                                    final x4 x4 = ((j9<MessageType, x4>)t4.L(i)).p();
                                    x4.E(1L);
                                    t4.H(i, ((f9<y4, BuilderType>)x4).n());
                                    n10 = 1;
                                }
                                else {
                                    n10 = n9;
                                    if ("_r".equals(t4.L(i).C())) {
                                        final x4 x5 = ((j9<MessageType, x4>)t4.L(i)).p();
                                        x5.E(1L);
                                        t4.H(i, ((f9<y4, BuilderType>)x5).n());
                                        b4 = true;
                                        n10 = n9;
                                    }
                                }
                                ++i;
                                n9 = n10;
                            }
                            if (n9 == 0 && t5) {
                                this.c().s().b("Marking event as conversion", this.l.A().n(t4.N()));
                                final x4 a5 = y4.A();
                                a5.F("_c");
                                a5.E(1L);
                                t4.A(a5);
                            }
                            if (!b4) {
                                this.c().s().b("Marking event as real-time", this.l.A().n(t4.N()));
                                final x4 a6 = y4.A();
                                a6.F("_r");
                                a6.E(1L);
                                t4.A(a6);
                            }
                            final k c5 = this.c;
                            P(c5);
                            if (c5.U(this.C(), y9.a.J1(), false, false, false, false, true).e > this.S().l(y9.a.J1(), a3.p)) {
                                B(t4, "_r");
                            }
                            else {
                                b = true;
                            }
                            b2 = t5;
                            b3 = b;
                            s10 = s11;
                            if (ga.V(t4.N())) {
                                b2 = t5;
                                b3 = b;
                                s10 = s11;
                                if (t5) {
                                    final k c6 = this.c;
                                    P(c6);
                                    b2 = t5;
                                    b3 = b;
                                    s10 = s11;
                                    if (c6.U(this.C(), y9.a.J1(), false, false, true, false, false).c > this.S().l(y9.a.J1(), a3.o)) {
                                        this.c().t().b("Too many conversions. Not logging as conversion. appId", com.google.android.gms.measurement.internal.n3.w(y9.a.J1()));
                                        ta ta2 = null;
                                        int j = 0;
                                        boolean b5 = false;
                                        int n11 = -1;
                                        while (j < t4.v()) {
                                            final y4 l = t4.L(j);
                                            ta ta3;
                                            int n12;
                                            if ("_c".equals(l.C())) {
                                                ta3 = ((j9<MessageType, x4>)l).p();
                                                n12 = j;
                                            }
                                            else {
                                                ta3 = ta2;
                                                n12 = n11;
                                                if ("_err".equals(l.C())) {
                                                    b5 = true;
                                                    n12 = n11;
                                                    ta3 = ta2;
                                                }
                                            }
                                            ++j;
                                            ta2 = ta3;
                                            n11 = n12;
                                        }
                                        ta ta4 = ta2;
                                        if (b5) {
                                            if (ta2 != null) {
                                                t4.D(n11);
                                                b2 = t5;
                                                b3 = b;
                                                s10 = s11;
                                                break Label_1482;
                                            }
                                            ta4 = null;
                                        }
                                        if (ta4 != null) {
                                            final x4 x6 = ((f9<j9<MessageType, BuilderType>, x4>)ta4).s();
                                            x6.F("_err");
                                            x6.E(10L);
                                            t4.H(n11, ((f9<y4, BuilderType>)x6).n());
                                            b2 = t5;
                                            b3 = b;
                                            s10 = s11;
                                        }
                                        else {
                                            this.c().o().b("Did not find conversion parameter. appId", com.google.android.gms.measurement.internal.n3.w(y9.a.J1()));
                                            s10 = s11;
                                            b3 = b;
                                            b2 = t5;
                                        }
                                    }
                                }
                            }
                        }
                        d5 = (d5)o;
                        final long n13 = n;
                        Label_1818: {
                            if (b2) {
                                final ArrayList list = new ArrayList<y4>(t4.O());
                                int k = 0;
                                int n14 = -1;
                                int n15 = -1;
                                while (k < list.size()) {
                                    int n16;
                                    if ("value".equals(((y4)list.get(k)).C())) {
                                        n16 = k;
                                    }
                                    else {
                                        n16 = n14;
                                        if ("currency".equals(((y4)list.get(k)).C())) {
                                            n15 = k;
                                            n16 = n14;
                                        }
                                    }
                                    ++k;
                                    n14 = n16;
                                }
                                if (n14 != -1) {
                                    if (!((y4)list.get(n14)).R() && !((y4)list.get(n14)).P()) {
                                        this.c().u().a("Value must be specified with a numeric type.");
                                        t4.D(n14);
                                        B(t4, "_c");
                                        A(t4, 18, "value");
                                    }
                                    else {
                                        Label_1776: {
                                            if (n15 != -1) {
                                                final String d6 = list.get(n15).D();
                                                if (d6.length() == 3) {
                                                    int codePoint;
                                                    for (int index = 0; index < d6.length(); index += Character.charCount(codePoint)) {
                                                        codePoint = d6.codePointAt(index);
                                                        if (!Character.isLetter(codePoint)) {
                                                            break Label_1776;
                                                        }
                                                    }
                                                    break Label_1818;
                                                }
                                            }
                                        }
                                        this.c().u().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        t4.D(n14);
                                        B(t4, "_c");
                                        A(t4, 19, "currency");
                                    }
                                }
                            }
                        }
                        ta ta5 = null;
                        ra ra4 = null;
                        Label_2529: {
                            if ("_e".equals(t4.N())) {
                                P(this.g);
                                ra ra3;
                                if (ba.l(((f9<u4, BuilderType>)t4).n(), "_fr") == null) {
                                    if (ra != null && Math.abs(((t4)ra).x() - t4.x()) <= 1000L) {
                                        final t4 t6 = ((f9<MessageType, t4>)ra).s();
                                        if (this.O(t4, t6)) {
                                            d5.N(n2, t6);
                                            ta = null;
                                            ra = null;
                                        }
                                        else {
                                            ta = t4;
                                            n4 = n5;
                                        }
                                        ra3 = ra;
                                    }
                                    else {
                                        ta = t4;
                                        n4 = n5;
                                        ra3 = ra;
                                    }
                                }
                                else {
                                    ra3 = ra;
                                }
                                ta5 = ta;
                                ra4 = ra3;
                            }
                            else {
                                final d5 d7 = d5;
                                int n17;
                                ra ra6;
                                ra ra7;
                                if ("_vs".equals(t4.N())) {
                                    P(this.g);
                                    if (ba.l(((f9<u4, BuilderType>)t4).n(), s10) == null) {
                                        if (ta != null && Math.abs(((t4)ta).x() - t4.x()) <= 1000L) {
                                            final t4 t7 = ((f9<MessageType, t4>)ta).s();
                                            ra ra5;
                                            if (this.O(t7, t4)) {
                                                d7.N(n4, t7);
                                                ra5 = null;
                                                ta = null;
                                            }
                                            else {
                                                ra5 = t4;
                                                n2 = n5;
                                            }
                                            n17 = n2;
                                            ra6 = (ra)ta;
                                            ra7 = ra5;
                                        }
                                        else {
                                            ra7 = t4;
                                            n17 = n5;
                                            ra6 = (ra)ta;
                                        }
                                    }
                                    else {
                                        n17 = n2;
                                        ra6 = (ra)ta;
                                        ra7 = ra;
                                    }
                                }
                                else {
                                    final int n18 = n4;
                                    n17 = n2;
                                    ra6 = (ra)ta;
                                    ra7 = ra;
                                    if (this.S().y(y9.a.J1(), a3.i0)) {
                                        n17 = n2;
                                        ra6 = (ra)ta;
                                        ra7 = ra;
                                        if ("_ab".equals(t4.N())) {
                                            P(this.g);
                                            n17 = n2;
                                            ra6 = (ra)ta;
                                            ra7 = ra;
                                            if (ba.l(((f9<u4, BuilderType>)t4).n(), s10) == null) {
                                                n17 = n2;
                                                ra6 = (ra)ta;
                                                ra7 = ra;
                                                if (ta != null) {
                                                    n17 = n2;
                                                    ra6 = (ra)ta;
                                                    ra7 = ra;
                                                    if (Math.abs(((t4)ta).x() - t4.x()) <= 4000L) {
                                                        final t4 t8 = ((f9<MessageType, t4>)ta).s();
                                                        this.I(t8, t4);
                                                        com.google.android.gms.common.internal.x.a("_e".equals(t8.N()));
                                                        P(this.g);
                                                        final u4 u4 = ((f9<u4, BuilderType>)t8).n();
                                                        final String s12 = s2;
                                                        final y4 m = ba.l(u4, s12);
                                                        P(this.g);
                                                        final u4 u5 = ((f9<u4, BuilderType>)t8).n();
                                                        final String s13 = s;
                                                        final y4 l2 = ba.l(u5, s13);
                                                        P(this.g);
                                                        final y4 l3 = ba.l(((f9<u4, BuilderType>)t8).n(), "_si");
                                                        String d8;
                                                        if (m != null) {
                                                            d8 = m.D();
                                                        }
                                                        else {
                                                            d8 = "";
                                                        }
                                                        if (!TextUtils.isEmpty((CharSequence)d8)) {
                                                            P(this.g);
                                                            ba.j(t4, s12, d8);
                                                        }
                                                        String d9;
                                                        if (l2 != null) {
                                                            d9 = l2.D();
                                                        }
                                                        else {
                                                            d9 = "";
                                                        }
                                                        if (!TextUtils.isEmpty((CharSequence)d9)) {
                                                            P(this.g);
                                                            ba.j(t4, s13, d9);
                                                        }
                                                        if (l3 != null) {
                                                            P(this.g);
                                                            ba.j(t4, "_si", l3.z());
                                                        }
                                                        d7.N(n18, t8);
                                                        final f9<MessageType, t4> f9 = null;
                                                        ra4 = ra;
                                                        ta5 = f9;
                                                        n4 = n18;
                                                        break Label_2529;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                n2 = n17;
                                ta5 = ra6;
                                ra4 = ra7;
                            }
                        }
                        n = n13;
                        Label_2674: {
                            if (!y10) {
                                n = n13;
                                if ("_e".equals(t4.N())) {
                                    l3 l4;
                                    String s14;
                                    Object o2;
                                    if (t4.v() == 0) {
                                        l4 = this.c().t();
                                        s14 = "Engagement event does not contain any parameters. appId";
                                        o2 = com.google.android.gms.measurement.internal.n3.w(y9.a.J1());
                                    }
                                    else {
                                        P(this.g);
                                        final Long n19 = (Long)ba.m(((f9<u4, BuilderType>)t4).n(), s10);
                                        if (n19 != null) {
                                            n = n13 + n19;
                                            break Label_2674;
                                        }
                                        l4 = this.c().t();
                                        s14 = "Engagement event does not include duration. appId";
                                        o2 = com.google.android.gms.measurement.internal.n3.w(y9.a.J1());
                                    }
                                    l4.b(s14, o2);
                                    n = n13;
                                }
                            }
                        }
                        y9.c.set(n3, ((f9<u4, BuilderType>)t4).n());
                        ++n5;
                        d5.y0(t4);
                        s7 = s9;
                        b = b3;
                        ra2 = ra4;
                        ta = ta5;
                    }
                    ++n3;
                    final d5 d10 = d5;
                    s4 = s7;
                    o = d10;
                    ra = ra2;
                }
                c = (String)o;
                if (y10) {
                    final int n20 = 0;
                    int n23;
                    int n24;
                    long n25;
                    for (int n21 = n5, n22 = n20; n22 < n21; n22 = n24 + 1, n21 = n23, n = n25) {
                        final u4 t9 = ((d5)c).t0(n22);
                        if ("_e".equals(t9.D())) {
                            P(this.g);
                            if (ba.l(t9, "_fr") != null) {
                                ((d5)c).L0(n22);
                                n23 = n21 - 1;
                                n24 = n22 - 1;
                                n25 = n;
                                continue;
                            }
                        }
                        P(this.g);
                        final y4 l5 = ba.l(t9, "_et");
                        n24 = n22;
                        n23 = n21;
                        n25 = n;
                        if (l5 != null) {
                            Long value;
                            if (l5.R()) {
                                value = l5.z();
                            }
                            else {
                                value = null;
                            }
                            n24 = n22;
                            n23 = n21;
                            n25 = n;
                            if (value != null) {
                                n24 = n22;
                                n23 = n21;
                                n25 = n;
                                if (value > 0L) {
                                    n25 = n + value;
                                    n23 = n21;
                                    n24 = n22;
                                }
                            }
                        }
                    }
                }
                this.H((d5)c, n, false);
                final Iterator<u4> iterator = ((d5)c).o0().iterator();
                while (iterator.hasNext()) {
                    if ("_s".equals(iterator.next().D())) {
                        final k c7 = this.c;
                        P(c7);
                        c7.j(((d5)c).l0(), "_se");
                        break;
                    }
                }
                if (ba.u((d5)c, "_sid") >= 0) {
                    this.H((d5)c, n, true);
                }
                else {
                    final int u6 = ba.u((d5)c, "_se");
                    if (u6 >= 0) {
                        ((d5)c).M0(u6);
                        this.c().o().b("Session engagement user property is in the bundle without session ID. appId", com.google.android.gms.measurement.internal.n3.w(y9.a.J1()));
                    }
                }
                final ba g = this.g;
                P(g);
                g.a.c().s().a("Checking account type status for ad personalization signals");
                final q4 a7 = g.b.a;
                P(a7);
                Label_3335: {
                    if (a7.q(((d5)c).l0())) {
                        final k c8 = g.b.c;
                        P(c8);
                        final h5 s15 = c8.S(((d5)c).l0());
                        if (s15 != null && s15.J() && g.a.x().p()) {
                            g.a.c().n().a("Turning off ad personalization due to account type");
                            final n5 z = o5.z();
                            z.B(s3);
                            z.C(g.a.x().l());
                            z.A(1L);
                            final o5 o3 = ((f9<o5, BuilderType>)z).n();
                            for (int n26 = 0; n26 < ((d5)c).q0(); ++n26) {
                                if (s3.equals(((d5)c).k0(n26).B())) {
                                    ((d5)c).i0(n26, o3);
                                    break Label_3335;
                                }
                            }
                            ((d5)c).A0(o3);
                        }
                    }
                }
                ((d5)c).e0(Long.MAX_VALUE);
                ((d5)c).L(Long.MIN_VALUE);
                for (int n27 = 0; n27 < ((d5)c).Z(); ++n27) {
                    final u4 t10 = ((d5)c).t0(n27);
                    if (t10.z() < ((d5)c).s0()) {
                        ((d5)c).e0(t10.z());
                    }
                    if (t10.z() > ((d5)c).r0()) {
                        ((d5)c).L(t10.z());
                    }
                }
                ((d5)c).K0();
                ((d5)c).C0();
                final xa f10 = this.f;
                P(f10);
                ((d5)c).u0(f10.j(((d5)c).l0(), ((d5)c).o0(), ((d5)c).p0(), ((d5)c).s0(), ((d5)c).r0()));
                String s18;
                y9 y13;
                if (this.S().C(y9.a.J1())) {
                    final HashMap<Object, q> hashMap = new HashMap<Object, q>();
                    final ArrayList<u4> list2 = new ArrayList<u4>();
                    final SecureRandom q = this.g0().q();
                    int n28 = 0;
                    final y9 y11 = y9;
                    while (n28 < ((d5)c).Z()) {
                        final t4 t11 = ((j9<MessageType, t4>)((d5)c).t0(n28)).p();
                        Label_4644: {
                            if (t11.N().equals("_ep")) {
                                P(this.g);
                                final String s16 = (String)ba.m(((f9<u4, BuilderType>)t11).n(), "_en");
                                q q2;
                                if ((q2 = hashMap.get(s16)) == null) {
                                    final k c9 = this.c;
                                    P(c9);
                                    final q w = c9.W(y11.a.J1(), com.google.android.gms.common.internal.x.k(s16));
                                    if ((q2 = w) != null) {
                                        hashMap.put(s16, w);
                                        q2 = w;
                                    }
                                }
                                if (q2 != null && q2.i == null) {
                                    final Long j2 = q2.j;
                                    if (j2 != null && j2 > 1L) {
                                        P(this.g);
                                        ba.j(t11, "_sr", q2.j);
                                    }
                                    final Boolean k2 = q2.k;
                                    if (k2 != null && k2) {
                                        P(this.g);
                                        ba.j(t11, "_efs", 1L);
                                    }
                                    list2.add(((f9<u4, BuilderType>)t11).n());
                                }
                            }
                            else {
                                final q4 a8 = this.a;
                                P(a8);
                                final String j3 = y11.a.J1();
                                final String a9 = a8.a(j3, "measurement.account.time_zone_offset_minutes");
                                Label_3893: {
                                    if (!TextUtils.isEmpty((CharSequence)a9)) {
                                        try {
                                            n = Long.parseLong(a9);
                                            break Label_3893;
                                        }
                                        catch (NumberFormatException ex) {
                                            a8.a.c().t().c("Unable to parse timezone offset. appId", com.google.android.gms.measurement.internal.n3.w(j3), ex);
                                        }
                                    }
                                    n = 0L;
                                }
                                final long s17 = this.g0().s0(t11.x(), n);
                                final u4 u7 = ((f9<u4, BuilderType>)t11).n();
                                int j4 = 0;
                                Label_4037: {
                                    if (!TextUtils.isEmpty((CharSequence)"_dbg")) {
                                        for (final y4 y12 : u7.E()) {
                                            if ("_dbg".equals(y12.C())) {
                                                if (!Long.valueOf(1L).equals(y12.z())) {
                                                    break;
                                                }
                                                j4 = 1;
                                                break Label_4037;
                                            }
                                        }
                                    }
                                    final q4 a10 = this.a;
                                    P(a10);
                                    j4 = a10.j(y11.a.J1(), t11.N());
                                }
                                if (j4 <= 0) {
                                    this.c().t().c("Sample rate must be positive. event, rate", t11.N(), j4);
                                    list2.add(((f9<u4, BuilderType>)t11).n());
                                }
                                else {
                                    q q3;
                                    if ((q3 = hashMap.get(t11.N())) == null) {
                                        final k c10 = this.c;
                                        P(c10);
                                        if ((q3 = c10.W(y11.a.J1(), t11.N())) == null) {
                                            this.c().t().c("Event being bundled has no eventAggregate. appId, eventName", y11.a.J1(), t11.N());
                                            q3 = new q(y11.a.J1(), t11.N(), 1L, 1L, 1L, t11.x(), 0L, null, null, null, null);
                                        }
                                    }
                                    P(this.g);
                                    final Long n29 = (Long)ba.m(((f9<u4, BuilderType>)t11).n(), "_eid");
                                    final Boolean value2 = n29 != null;
                                    if (j4 != 1) {
                                        if (q.nextInt(j4) == 0) {
                                            P(this.g);
                                            final Long value3 = (Long)j4;
                                            ba.j(t11, "_sr", value3);
                                            list2.add(((f9<u4, BuilderType>)t11).n());
                                            q a11 = q3;
                                            if (value2) {
                                                a11 = q3.a(null, value3, null);
                                            }
                                            hashMap.put(t11.N(), a11.b(t11.x(), s17));
                                        }
                                        else {
                                            final Long h = q3.h;
                                            if (h != null) {
                                                n = h;
                                            }
                                            else {
                                                n = this.g0().s0(t11.w(), n);
                                            }
                                            if (n != s17) {
                                                P(this.g);
                                                ba.j(t11, "_efs", 1L);
                                                P(this.g);
                                                final Long value4 = (Long)j4;
                                                ba.j(t11, "_sr", value4);
                                                list2.add(((f9<u4, BuilderType>)t11).n());
                                                if (value2) {
                                                    q3 = q3.a(null, value4, Boolean.TRUE);
                                                }
                                                hashMap.put(t11.N(), q3.b(t11.x(), s17));
                                            }
                                            else if (value2) {
                                                hashMap.put(t11.N(), q3.a(n29, null, null));
                                            }
                                        }
                                        ((d5)c).N(n28, t11);
                                        break Label_4644;
                                    }
                                    list2.add(((f9<u4, BuilderType>)t11).n());
                                    if (value2 && (q3.i != null || q3.j != null || q3.k != null)) {
                                        hashMap.put(t11.N(), q3.a(null, null, null));
                                    }
                                }
                            }
                            ((d5)c).N(n28, t11);
                        }
                        ++n28;
                    }
                    s18 = c;
                    if (list2.size() < ((d5)s18).Z()) {
                        ((d5)s18).E0();
                        ((d5)s18).v0(list2);
                    }
                    for (final Map.Entry<String, q> entry : hashMap.entrySet()) {
                        final k c11 = this.c;
                        P(c11);
                        c11.n(entry.getValue());
                    }
                    y13 = y11;
                }
                else {
                    s18 = c;
                    y13 = y9;
                }
                final String j5 = y13.a.J1();
                final k c12 = this.c;
                P(c12);
                final h5 s19 = c12.S(j5);
                if (s19 == null) {
                    this.c().o().b("Bundling raw events w/o app info. appId", com.google.android.gms.measurement.internal.n3.w(y13.a.J1()));
                }
                else if (((d5)s18).Z() > 0) {
                    n = s19.Y();
                    if (n != 0L) {
                        ((d5)s18).X(n);
                    }
                    else {
                        ((d5)s18).H0();
                    }
                    final long a12 = s19.a0();
                    if (a12 != 0L) {
                        n = a12;
                    }
                    if (n != 0L) {
                        ((d5)s18).Y(n);
                    }
                    else {
                        ((d5)s18).I0();
                    }
                    s19.e();
                    ((d5)s18).B((int)s19.Z());
                    s19.E(((d5)s18).s0());
                    s19.C(((d5)s18).r0());
                    final String d11 = s19.d0();
                    if (d11 != null) {
                        ((d5)s18).S(d11);
                    }
                    else {
                        ((d5)s18).F0();
                    }
                    final k c13 = this.c;
                    P(c13);
                    c13.m(s19);
                }
                if (((d5)s18).Z() > 0) {
                    this.l.L();
                    final q4 a13 = this.a;
                    P(a13);
                    final i4 l6 = a13.l(y13.a.J1());
                    if (l6 != null && l6.L()) {
                        ((d5)s18).D(l6.x());
                    }
                    else if (TextUtils.isEmpty((CharSequence)y13.a.D())) {
                        ((d5)s18).D(-1L);
                    }
                    else {
                        this.c().t().b("Did not find measurement config or missing version info. appId", com.google.android.gms.measurement.internal.n3.w(y13.a.J1()));
                    }
                    final k c14 = this.c;
                    P(c14);
                    c14.s(((f9<e5, BuilderType>)s18).n(), b);
                }
                final k c15 = this.c;
                P(c15);
                final List<Long> b6 = y13.b;
                com.google.android.gms.common.internal.x.k(b6);
                c15.e();
                c15.f();
                final StringBuilder sb = new StringBuilder("rowid in (");
                for (int n30 = 0; n30 < b6.size(); ++n30) {
                    if (n30 != 0) {
                        sb.append(",");
                    }
                    sb.append((long)b6.get(n30));
                }
                sb.append(")");
                final int delete = c15.Q().delete("raw_events", sb.toString(), (String[])null);
                if (delete != b6.size()) {
                    c15.a.c().o().c("Deleted fewer rows from raw events table than expected", delete, b6.size());
                }
                c = (String)this.c;
                P((p9)c);
                final SQLiteDatabase q4 = ((k)c).Q();
                try {
                    q4.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", (Object[])new String[] { j5, j5 });
                }
                catch (SQLiteException ex2) {
                    ((t5)c).a.c().o().c("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.n3.w(j5), ex2);
                }
                final k c16 = this.c;
                P(c16);
                c16.l();
                return true;
            }
            final k c17 = this.c;
            P(c17);
            c17.l();
            return false;
        }
        finally {
            final k c18 = this.c;
            P(c18);
            c18.h0();
        }
    }
    
    private final boolean N() {
        this.b().e();
        this.d();
        final k c = this.c;
        P(c);
        if (!c.p()) {
            final k c2 = this.c;
            P(c2);
            if (TextUtils.isEmpty((CharSequence)c2.b0())) {
                return false;
            }
        }
        return true;
    }
    
    private final boolean O(final t4 t4, final t4 t5) {
        com.google.android.gms.common.internal.x.a("_e".equals(t4.N()));
        P(this.g);
        final y4 l = ba.l(((f9<u4, BuilderType>)t4).n(), "_sc");
        String d = null;
        Object d2;
        if (l == null) {
            d2 = null;
        }
        else {
            d2 = l.D();
        }
        P(this.g);
        final y4 i = ba.l(((f9<u4, BuilderType>)t5).n(), "_pc");
        if (i != null) {
            d = i.D();
        }
        if (d != null && d.equals(d2)) {
            this.I(t4, t5);
            return true;
        }
        return false;
    }
    
    private static final p9 P(final p9 p) {
        if (p == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (p.h()) {
            return p;
        }
        final String value = String.valueOf(p.getClass());
        final StringBuilder sb = new StringBuilder(value.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public static z9 e0(final Context context) {
        x.k(context);
        x.k(context.getApplicationContext());
        if (z9.C == null) {
            synchronized (z9.class) {
                if (z9.C == null) {
                    z9.C = new z9(x.k(new aa(context)), null);
                }
            }
        }
        return z9.C;
    }
    
    final long C() {
        final long a = this.F().a();
        final v8 i = this.i;
        i.f();
        i.e();
        long a2;
        if ((a2 = i.k.a()) == 0L) {
            a2 = i.a.M().q().nextInt(86400000) + 1L;
            i.k.b(a2);
        }
        return (a + a2) / 1000L / 60L / 60L / 24L;
    }
    
    @Override
    public final g F() {
        return com.google.android.gms.common.internal.x.k(this.l).F();
    }
    
    @Override
    public final b L() {
        throw null;
    }
    
    @c1
    final h5 Q(final na na) {
        this.b().e();
        this.d();
        com.google.android.gms.common.internal.x.k(na);
        com.google.android.gms.common.internal.x.g(na.G);
        final k c = this.c;
        P(c);
        final h5 s = c.S(na.G);
        final h c2 = this.T(na.G).c(com.google.android.gms.measurement.internal.h.b(na.b0));
        String l;
        if (c2.j()) {
            l = this.i.l(na.G);
        }
        else {
            l = "";
        }
        h5 h6;
        if (s == null) {
            final h5 h5 = new h5(this.l, na.G);
            if (c2.k()) {
                h5.i(this.h0(c2));
            }
            h6 = h5;
            if (c2.j()) {
                h5.H(l);
                h6 = h5;
            }
        }
        else if (c2.j() && l != null && !l.equals(s.b())) {
            s.H(l);
            s.i(this.h0(c2));
            oc.b();
            h6 = s;
            if (this.S().y(null, a3.A0)) {
                h6 = s;
                if (!"00000000-0000-0000-0000-000000000000".equals(this.i.k(na.G, c2).first)) {
                    final k c3 = this.c;
                    P(c3);
                    h6 = s;
                    if (c3.Z(na.G, "_id") != null) {
                        final k c4 = this.c;
                        P(c4);
                        h6 = s;
                        if (c4.Z(na.G, "_lair") == null) {
                            final ea ea = new ea(na.G, "auto", "_lair", this.F().a(), 1L);
                            final k c5 = this.c;
                            P(c5);
                            c5.w(ea);
                            h6 = s;
                        }
                    }
                }
            }
        }
        else {
            h6 = s;
            if (TextUtils.isEmpty((CharSequence)s.f0())) {
                h6 = s;
                if (c2.k()) {
                    s.i(this.h0(c2));
                    h6 = s;
                }
            }
        }
        h6.y(na.H);
        h6.f(na.W);
        fe.b();
        if (this.S().y(h6.e0(), a3.f0)) {
            h6.x(na.a0);
        }
        if (!TextUtils.isEmpty((CharSequence)na.Q)) {
            h6.w(na.Q);
        }
        final long k = na.K;
        if (k != 0L) {
            h6.z(k);
        }
        if (!TextUtils.isEmpty((CharSequence)na.I)) {
            h6.k(na.I);
        }
        h6.l(na.P);
        final String j = na.J;
        if (j != null) {
            h6.j(j);
        }
        h6.t(na.L);
        h6.F(na.N);
        if (!TextUtils.isEmpty((CharSequence)na.M)) {
            h6.B(na.M);
        }
        if (!this.S().y(null, a3.p0)) {
            h6.h(na.R);
        }
        h6.g(na.U);
        h6.G(na.X);
        h6.u(na.Y);
        if (h6.L()) {
            final k c6 = this.c;
            P(c6);
            c6.m(h6);
        }
        return h6;
    }
    
    public final xa R() {
        final xa f = this.f;
        P(f);
        return f;
    }
    
    public final com.google.android.gms.measurement.internal.g S() {
        return com.google.android.gms.common.internal.x.k(this.l).w();
    }
    
    @c1
    final h T(final String s) {
        this.b().e();
        this.d();
        Object o;
        if ((o = this.A.get(s)) == null) {
            final k c = this.c;
            P(c);
            com.google.android.gms.common.internal.x.k(s);
            c.e();
            c.f();
            final SQLiteDatabase q = c.Q();
            o = null;
            try {
                try {
                    final Cursor cursor = (Cursor)(o = q.rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[] { s }));
                    if (cursor.moveToFirst()) {
                        o = cursor;
                        final String string = cursor.getString(0);
                        cursor.close();
                        o = string;
                    }
                    else {
                        cursor.close();
                        o = "G1";
                    }
                    o = com.google.android.gms.measurement.internal.h.b((String)o);
                    this.v(s, (h)o);
                }
                finally {
                    if (o != null) {
                        ((Cursor)o).close();
                    }
                }
            }
            catch (SQLiteException ex) {}
        }
        return (h)o;
    }
    
    public final k U() {
        final k c = this.c;
        P(c);
        return c;
    }
    
    public final i3 V() {
        return this.l.A();
    }
    
    public final t3 W() {
        final t3 b = this.b;
        P(b);
        return b;
    }
    
    @Override
    public final Context X() {
        return this.l.X();
    }
    
    public final v3 Y() {
        final v3 d = this.d;
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }
    
    public final q4 Z() {
        final q4 a = this.a;
        P(a);
        return a;
    }
    
    @c1
    @d0
    final void a() {
        this.b().e();
        this.d();
        if (!this.n) {
            this.n = true;
            if (this.z()) {
                final FileChannel w = this.w;
                this.b().e();
                final int n = 0;
                int int1;
                if (w != null && w.isOpen()) {
                    final ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        w.position(0L);
                        final int read = w.read(allocate);
                        if (read != 4) {
                            int1 = n;
                            if (read != -1) {
                                this.c().t().b("Unexpected data length. Bytes read", read);
                                int1 = n;
                            }
                        }
                        else {
                            allocate.flip();
                            int1 = allocate.getInt();
                        }
                    }
                    catch (IOException ex) {
                        this.c().o().b("Failed to read from channel", ex);
                        int1 = n;
                    }
                }
                else {
                    this.c().o().a("Bad channel to read from");
                    int1 = n;
                }
                final int m = this.l.y().m();
                this.b().e();
                l3 l3 = null;
                Integer n2 = null;
                Integer n3 = null;
                String s = null;
                Label_0215: {
                    if (int1 > m) {
                        l3 = this.c().o();
                        n2 = int1;
                        n3 = m;
                        s = "Panic: can't downgrade version. Previous, current version";
                    }
                    else {
                        if (int1 >= m) {
                            return;
                        }
                        final FileChannel w2 = this.w;
                        this.b().e();
                        Label_0408: {
                            if (w2 != null) {
                                if (w2.isOpen()) {
                                    final ByteBuffer allocate2 = ByteBuffer.allocate(4);
                                    allocate2.putInt(m);
                                    allocate2.flip();
                                    try {
                                        w2.truncate(0L);
                                        if (this.S().y(null, a3.n0) && Build$VERSION.SDK_INT <= 19) {
                                            w2.position(0L);
                                        }
                                        w2.write(allocate2);
                                        w2.force(true);
                                        if (w2.size() != 4L) {
                                            this.c().o().b("Error writing to channel. Bytes written", w2.size());
                                        }
                                        l3 = this.c().s();
                                        n2 = int1;
                                        n3 = m;
                                        s = "Storage version upgraded. Previous, current version";
                                        break Label_0215;
                                    }
                                    catch (IOException ex2) {
                                        this.c().o().b("Failed to write to channel", ex2);
                                        break Label_0408;
                                    }
                                }
                            }
                            this.c().o().a("Bad channel to read from");
                        }
                        l3 = this.c().o();
                        n2 = int1;
                        n3 = m;
                        s = "Storage version upgrade failed. Previous, current version";
                    }
                }
                l3.c(s, n2, n3);
            }
        }
    }
    
    @Override
    public final w4 b() {
        return com.google.android.gms.common.internal.x.k(this.l).b();
    }
    
    final z4 b0() {
        return this.l;
    }
    
    @Override
    public final n3 c() {
        return com.google.android.gms.common.internal.x.k(this.l).c();
    }
    
    public final k7 c0() {
        final k7 h = this.h;
        P(h);
        return h;
    }
    
    final void d() {
        if (this.m) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }
    
    public final v8 d0() {
        return this.i;
    }
    
    @c1
    final void e(final h5 h5) {
        this.b().e();
        fe.b();
        final com.google.android.gms.measurement.internal.g s = this.S();
        final String e0 = h5.e0();
        final z2<Boolean> f0 = a3.f0;
        if (s.y(e0, f0)) {
            if (TextUtils.isEmpty((CharSequence)h5.k0()) && TextUtils.isEmpty((CharSequence)h5.j0())) {
                if (TextUtils.isEmpty((CharSequence)h5.c0())) {
                    this.j(com.google.android.gms.common.internal.x.k(h5.e0()), 204, null, null, null);
                    return;
                }
            }
        }
        else if (TextUtils.isEmpty((CharSequence)h5.k0()) && TextUtils.isEmpty((CharSequence)h5.c0())) {
            this.j(com.google.android.gms.common.internal.x.k(h5.e0()), 204, null, null, null);
            return;
        }
        final q9 j = this.j;
        final Uri$Builder uri$Builder = new Uri$Builder();
        String obj;
        if (TextUtils.isEmpty((CharSequence)(obj = h5.k0()))) {
            fe.b();
            if (!j.a.w().y(h5.e0(), f0) || TextUtils.isEmpty((CharSequence)(obj = h5.j0()))) {
                obj = h5.c0();
            }
        }
        final z2<String> f2 = a3.f;
        final Map<String, String> map = null;
        final Uri$Builder encodedAuthority = uri$Builder.scheme((String)f2.a(null)).encodedAuthority((String)a3.g.a(null));
        final String value = String.valueOf(obj);
        String concat;
        if (value.length() != 0) {
            concat = "config/app/".concat(value);
        }
        else {
            concat = new String("config/app/");
        }
        final Uri$Builder appendQueryParameter = encodedAuthority.path(concat).appendQueryParameter("app_instance_id", h5.f0()).appendQueryParameter("platform", "android");
        j.a.w().n();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(42097L));
        bf.b();
        if (j.a.w().y(h5.e0(), a3.x0)) {
            uri$Builder.appendQueryParameter("runtime_version", "0");
        }
        final String string = uri$Builder.build().toString();
        try {
            final String s2 = com.google.android.gms.common.internal.x.k(h5.e0());
            final URL url = new URL(string);
            this.c().s().b("Fetching remote configuration", s2);
            final q4 a = this.a;
            P(a);
            final i4 l = a.l(s2);
            final q4 a2 = this.a;
            P(a2);
            final String m = a2.m(s2);
            Map<String, String> map2 = map;
            if (l != null) {
                map2 = map;
                if (!TextUtils.isEmpty((CharSequence)m)) {
                    map2 = new a<String, String>();
                    map2.put("If-Modified-Since", m);
                }
            }
            this.s = true;
            final t3 b = this.b;
            P(b);
            final t9 t9 = new t9(this);
            b.e();
            b.f();
            com.google.android.gms.common.internal.x.k(url);
            com.google.android.gms.common.internal.x.k(t9);
            b.a.b().v(new s3(s2, url, null, map2, t9));
        }
        catch (MalformedURLException ex) {
            this.c().o().c("Failed to parse config URL. Not fetching. appId", n3.w(h5.e0()), string);
        }
    }
    
    @c1
    final void f(u u, final na na) {
        com.google.android.gms.common.internal.x.k(na);
        com.google.android.gms.common.internal.x.g(na.G);
        this.b().e();
        this.d();
        final String g = na.G;
        u a = u;
        final long j = a.J;
        nf.b();
        if (this.S().y(null, a3.C0)) {
            final o3 b = o3.b(u);
            this.b().e();
            ga.u(null, b.d, false);
            a = b.a();
        }
        P(this.g);
        if (!ba.k(a, na)) {
            return;
        }
        if (!na.N) {
            this.Q(na);
            return;
        }
        final List<String> z = na.Z;
        if (z != null) {
            if (!z.contains(a.G)) {
                this.c().n().d("Dropping non-safelisted event. appId, event name, origin", g, a.G, a.I);
                return;
            }
            final Bundle g2 = a.H.g1();
            g2.putLong("ga_safelisted", 1L);
            u = new u(a.G, new s(g2), a.I, a.J);
        }
        else {
            u = a;
        }
        final k c = this.c;
        P(c);
        c.g0();
        try {
            final k c2 = this.c;
            P(c2);
            com.google.android.gms.common.internal.x.g(g);
            c2.e();
            c2.f();
            final long n = lcmp(j, 0L);
            List<com.google.android.gms.measurement.internal.c> list;
            if (n < 0) {
                c2.a.c().t().c("Invalid time querying timed out conditional properties", n3.w(g), j);
                list = Collections.emptyList();
            }
            else {
                list = c2.d0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { g, String.valueOf(j) });
            }
            for (final com.google.android.gms.measurement.internal.c c3 : list) {
                if (c3 != null) {
                    this.c().s().d("User property timed out", c3.G, this.l.A().p(c3.I.H), c3.I.M());
                    final u m = c3.M;
                    if (m != null) {
                        this.y(new u(m, j), na);
                    }
                    final k c4 = this.c;
                    P(c4);
                    c4.I(g, c3.I.H);
                }
            }
            final k c5 = this.c;
            P(c5);
            com.google.android.gms.common.internal.x.g(g);
            c5.e();
            c5.f();
            Object o;
            if (n < 0) {
                c5.a.c().t().c("Invalid time querying expired conditional properties", n3.w(g), j);
                o = Collections.emptyList();
            }
            else {
                o = c5.d0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { g, String.valueOf(j) });
            }
            final ArrayList list2 = new ArrayList<u>(((List)o).size());
            for (final com.google.android.gms.measurement.internal.c c6 : o) {
                if (c6 != null) {
                    this.c().s().d("User property expired", c6.G, this.l.A().p(c6.I.H), c6.I.M());
                    final k c7 = this.c;
                    P(c7);
                    c7.j(g, c6.I.H);
                    final u q = c6.Q;
                    if (q != null) {
                        list2.add(q);
                    }
                    final k c8 = this.c;
                    P(c8);
                    c8.I(g, c6.I.H);
                }
            }
            final Iterator<u> iterator3 = (Iterator<u>)list2.iterator();
            while (iterator3.hasNext()) {
                this.y(new u(iterator3.next(), j), na);
            }
            final k c9 = this.c;
            P(c9);
            final String g3 = u.G;
            com.google.android.gms.common.internal.x.g(g);
            com.google.android.gms.common.internal.x.g(g3);
            c9.e();
            c9.f();
            Object o2;
            if (n < 0) {
                c9.a.c().t().d("Invalid time querying triggered conditional properties", n3.w(g), c9.a.A().n(g3), j);
                o2 = Collections.emptyList();
            }
            else {
                o2 = c9.d0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { g, g3, String.valueOf(j) });
            }
            final ArrayList list3 = new ArrayList<u>(((List)o2).size());
            for (final com.google.android.gms.measurement.internal.c c10 : o2) {
                if (c10 != null) {
                    final ca i = c10.I;
                    final ea ea = new ea(com.google.android.gms.common.internal.x.k(c10.G), c10.H, i.H, j, com.google.android.gms.common.internal.x.k(i.M()));
                    final k c11 = this.c;
                    P(c11);
                    l3 l3;
                    String s;
                    Object o3;
                    String s2;
                    Object o4;
                    if (c11.w(ea)) {
                        l3 = this.c().s();
                        s = "User property triggered";
                        o3 = c10.G;
                        s2 = this.l.A().p(ea.c);
                        o4 = ea.e;
                    }
                    else {
                        l3 = this.c().o();
                        s = "Too many active user properties, ignoring";
                        o3 = n3.w(c10.G);
                        s2 = this.l.A().p(ea.c);
                        o4 = ea.e;
                    }
                    l3.d(s, o3, s2, o4);
                    final u o5 = c10.O;
                    if (o5 != null) {
                        list3.add(o5);
                    }
                    c10.I = new ca(ea);
                    c10.K = true;
                    final k c12 = this.c;
                    P(c12);
                    c12.v(c10);
                }
            }
            this.y(u, na);
            final Iterator<u> iterator5 = (Iterator<u>)list3.iterator();
            while (iterator5.hasNext()) {
                u = iterator5.next();
                this.y(new u(u, j), na);
            }
            final k c13 = this.c;
            P(c13);
            c13.l();
        }
        finally {
            final k c14 = this.c;
            P(c14);
            c14.h0();
        }
    }
    
    public final ba f0() {
        final ba g = this.g;
        P(g);
        return g;
    }
    
    @c1
    final void g(final u u, final String s) {
        final k c = this.c;
        P(c);
        final h5 s2 = c.S(s);
        if (s2 != null && !TextUtils.isEmpty((CharSequence)s2.h0())) {
            final Boolean e = this.E(s2);
            if (e == null) {
                if (!"_ui".equals(u.G)) {
                    this.c().t().b("Could not find package. appId", n3.w(s));
                }
            }
            else if (!e) {
                this.c().o().b("App version does not match; dropping event. appId", n3.w(s));
                return;
            }
            final String k0 = s2.k0();
            final String h0 = s2.h0();
            final long m = s2.M();
            final String g0 = s2.g0();
            final long x = s2.X();
            final long u2 = s2.U();
            final boolean i = s2.K();
            final String i2 = s2.i0();
            final long a = s2.A();
            final boolean j = s2.J();
            final String c2 = s2.c0();
            final Boolean b0 = s2.b0();
            final long v = s2.V();
            final List<String> c3 = s2.c();
            fe.b();
            String j2;
            if (this.S().y(s2.e0(), a3.f0)) {
                j2 = s2.j0();
            }
            else {
                j2 = null;
            }
            this.h(u, new na(s, k0, h0, m, g0, x, u2, null, i, false, i2, a, 0L, 0, j, false, c2, b0, v, c3, j2, this.T(s).i()));
            return;
        }
        this.c().n().b("No app data available; dropping event", s);
    }
    
    public final ga g0() {
        return com.google.android.gms.common.internal.x.k(this.l).M();
    }
    
    @c1
    final void h(u a, final na na) {
        com.google.android.gms.common.internal.x.g(na.G);
        final o3 b = o3.b(a);
        final ga g0 = this.g0();
        final Bundle d = b.d;
        final k c = this.c;
        P(c);
        g0.v(d, c.R(na.G));
        this.g0().w(b, this.S().k(na.G));
        a = b.a();
        if ("_cmp".equals(a.G)) {
            if ("referrer API v2".equals(a.H.N2("_cis"))) {
                final String n2 = a.H.N2("gclid");
                if (!TextUtils.isEmpty((CharSequence)n2)) {
                    this.w(new ca("_lgclid", a.J, n2, "auto"), na);
                }
            }
        }
        this.f(a, na);
    }
    
    @c1
    final String h0(final h h) {
        if (h.k()) {
            final byte[] array = new byte[16];
            this.g0().q().nextBytes(array);
            return String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        return null;
    }
    
    final void i() {
        ++this.r;
    }
    
    final String i0(final na na) {
        Object p = this.b().p((Callable<String>)new u9(this, na));
        try {
            p = ((Future<String>)p).get(30000L, TimeUnit.MILLISECONDS);
            return (String)p;
        }
        catch (ExecutionException p) {}
        catch (InterruptedException p) {}
        catch (TimeoutException ex) {}
        this.c().o().c("Failed to get app instance id. appId", n3.w(na.G), p);
        return null;
    }
    
    @c1
    @d0
    final void j(final String s, int n, final Throwable t, final byte[] array, final Map<String, List<String>> map) {
        this.b().e();
        this.d();
        com.google.android.gms.common.internal.x.g(s);
        byte[] array2 = array;
        Label_0030: {
            if (array != null) {
                break Label_0030;
            }
            try {
                array2 = new byte[0];
                final l3 s2 = this.c().s();
                final Integer value = array2.length;
                s2.b("onConfigFetched. Response size", value);
                final k c = this.c;
                P(c);
                c.g0();
                try {
                    final k c2 = this.c;
                    P(c2);
                    final h5 s3 = c2.S(s);
                    int n2 = n;
                    Label_0148: {
                        int n3 = 0;
                        Label_0142: {
                            if (n != 200 && (n2 = n) != 204) {
                                if ((n3 = n) != 304) {
                                    break Label_0142;
                                }
                                n2 = 304;
                            }
                            n3 = n2;
                            if (t == null) {
                                n = 1;
                                break Label_0148;
                            }
                        }
                        n = 0;
                        n2 = n3;
                    }
                    Label_0598: {
                        if (s3 == null) {
                            this.c().t().b("App does not exist in onConfigFetched. appId", n3.w(s));
                            break Label_0598;
                        }
                        if (n == 0 && n2 != 404) {
                            s3.v(this.F().a());
                            final k c3 = this.c;
                            P(c3);
                            c3.m(s3);
                            this.c().s().c("Fetching config failed. code, error", n2, t);
                            final q4 a = this.a;
                            P(a);
                            a.o(s);
                            this.i.j.b(this.F().a());
                            if (n2 == 503 || n2 == 429) {
                                this.i.h.b(this.F().a());
                            }
                        }
                        else {
                            List<String> list;
                            if (map != null) {
                                list = map.get("Last-Modified");
                            }
                            else {
                                list = null;
                            }
                            String s4;
                            if (list != null && list.size() > 0) {
                                s4 = list.get(0);
                            }
                            else {
                                s4 = null;
                            }
                            if (n2 != 404 && n2 != 304) {
                                final q4 a2 = this.a;
                                P(a2);
                                if (!a2.w(s, array2, s4)) {
                                    return;
                                }
                            }
                            else {
                                final q4 a3 = this.a;
                                P(a3);
                                if (a3.l(s) == null) {
                                    final q4 a4 = this.a;
                                    P(a4);
                                    if (!a4.w(s, null, null)) {
                                        final k k = this.c;
                                        P(k);
                                        return;
                                    }
                                }
                            }
                            s3.m(this.F().a());
                            final k c4 = this.c;
                            P(c4);
                            c4.m(s3);
                            if (n2 == 404) {
                                this.c().u().b("Config not found. Using empty config. appId", s);
                            }
                            else {
                                this.c().s().c("Successfully fetched config. Got network response. code, size", n2, value);
                            }
                            final t3 b = this.b;
                            P(b);
                            if (b.k() && this.N()) {
                                this.x();
                                break Label_0598;
                            }
                        }
                        this.J();
                        break Label_0598;
                    }
                    final k c5 = this.c;
                    P(c5);
                    c5.l();
                    final k k = this.c;
                    P(k);
                }
                finally {
                    final k c6 = this.c;
                    P(c6);
                    c6.h0();
                }
            }
            finally {
                this.s = false;
                this.G();
            }
        }
    }
    
    final void k(final boolean b) {
        this.J();
    }
    
    @c1
    final void k0(final Runnable runnable) {
        this.b().e();
        if (this.p == null) {
            this.p = new ArrayList<Runnable>();
        }
        this.p.add(runnable);
    }
    
    @c1
    @d0
    final void l(final int n, Throwable t, byte[] iterator, String c) {
        this.b().e();
        this.d();
        byte[] array = iterator;
        Label_0023: {
            if (iterator != null) {
                break Label_0023;
            }
            try {
                array = new byte[0];
                final List<Long> list = com.google.android.gms.common.internal.x.k(this.x);
                this.x = null;
                int j = 0;
                Label_0456: {
                    int i;
                    if ((i = n) != 200) {
                        if ((j = n) != 204) {
                            break Label_0456;
                        }
                        i = 204;
                    }
                    j = i;
                    if (t == null) {
                        try {
                            this.i.i.b(this.F().a());
                            this.i.j.b(0L);
                            this.J();
                            this.c().s().c("Successful upload. Got network response. code, size", i, array.length);
                            final k c2 = this.c;
                            P(c2);
                            c2.g0();
                            try {
                                iterator = (byte[])(Object)list.iterator();
                                while (((Iterator)(Object)iterator).hasNext()) {
                                    t = (Throwable)Long.valueOf(((Iterator<Long>)(Object)iterator).next());
                                    try {
                                        c = (String)this.c;
                                        P((p9)c);
                                        final long longValue = (long)t;
                                        ((t5)c).e();
                                        ((p9)c).f();
                                        final SQLiteDatabase q = ((k)c).Q();
                                        try {
                                            if (q.delete("queue", "rowid=?", new String[] { String.valueOf(longValue) }) == 1) {
                                                continue;
                                            }
                                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                                        }
                                        catch (SQLiteException ex) {
                                            ((t5)c).a.c().o().b("Failed to delete a bundle in a queue table", ex);
                                            throw ex;
                                        }
                                    }
                                    catch (SQLiteException ex2) {
                                        final List<Long> y = this.y;
                                        if (y != null && y.contains(t)) {
                                            continue;
                                        }
                                        throw ex2;
                                    }
                                    break;
                                }
                                final k c3 = this.c;
                                P(c3);
                                c3.l();
                                final k c4 = this.c;
                                P(c4);
                                c4.h0();
                                this.y = null;
                                final t3 b = this.b;
                                P(b);
                                if (b.k() && this.N()) {
                                    this.x();
                                }
                                else {
                                    this.z = -1L;
                                    this.J();
                                }
                                this.o = 0L;
                            }
                            finally {
                                final k c5 = this.c;
                                P(c5);
                                c5.h0();
                            }
                        }
                        catch (SQLiteException ex3) {
                            this.c().o().b("Database error while trying to delete uploaded bundles", ex3);
                            this.o = this.F().d();
                            this.c().s().b("Disable upload, time", this.o);
                            return;
                        }
                    }
                }
                this.c().s().c("Network upload failed. Will retry later. code, error", j, t);
                this.i.j.b(this.F().a());
                if (j == 503 || j == 429) {
                    this.i.h.b(this.F().a());
                }
                final k c6 = this.c;
                P(c6);
                c6.i0(list);
                this.J();
            }
            finally {
                this.t = false;
                this.G();
            }
        }
    }
    
    @c1
    final void m(final na na) {
        this.b().e();
        this.d();
        com.google.android.gms.common.internal.x.k(na);
        com.google.android.gms.common.internal.x.g(na.G);
        if (this.K(na)) {
            final k c = this.c;
            P(c);
            final h5 s = c.S(na.G);
            if (s != null && TextUtils.isEmpty((CharSequence)s.k0()) && !TextUtils.isEmpty((CharSequence)na.H)) {
                s.m(0L);
                final k c2 = this.c;
                P(c2);
                c2.m(s);
                final q4 a = this.a;
                P(a);
                a.p(na.G);
            }
            if (!na.N) {
                this.Q(na);
                return;
            }
            long n;
            if ((n = na.S) == 0L) {
                n = this.F().a();
            }
            this.l.x().o();
            int t;
            final int i = t = na.T;
            if (i != 0 && (t = i) != 1) {
                this.c().t().c("Incorrect app type, assuming installed app. appId, appType", n3.w(na.G), i);
                t = 0;
            }
            final k c3 = this.c;
            P(c3);
            c3.g0();
            try {
                final k c4 = this.c;
                P(c4);
                final ea z = c4.Z(na.G, "_npa");
                if (z == null || "auto".equals(z.b)) {
                    final Boolean x = na.X;
                    if (x != null) {
                        long l;
                        if (!x) {
                            l = 0L;
                        }
                        else {
                            l = 1L;
                        }
                        final ca ca = new ca("_npa", n, l, "auto");
                        if (z == null || !z.e.equals(ca.J)) {
                            this.w(ca, na);
                        }
                    }
                    else if (z != null) {
                        this.q(new ca("_npa", n, null, "auto"), na);
                    }
                }
                final k c5 = this.c;
                P(c5);
                final h5 s2 = c5.S(com.google.android.gms.common.internal.x.k(na.G));
                h5 h5;
                if ((h5 = s2) != null) {
                    h5 = s2;
                    if (this.g0().b0(na.H, s2.k0(), na.W, s2.c0())) {
                        this.c().t().b("New GMP App Id passed in. Removing cached database data. appId", n3.w(s2.e0()));
                        final k c6 = this.c;
                        P(c6);
                        final String e0 = s2.e0();
                        c6.f();
                        c6.e();
                        com.google.android.gms.common.internal.x.g(e0);
                        try {
                            final SQLiteDatabase q = c6.Q();
                            final String[] array = { e0 };
                            final int j = q.delete("events", "app_id=?", array) + q.delete("user_attributes", "app_id=?", array) + q.delete("conditional_properties", "app_id=?", array) + q.delete("apps", "app_id=?", array) + q.delete("raw_events", "app_id=?", array) + q.delete("raw_events_metadata", "app_id=?", array) + q.delete("event_filters", "app_id=?", array) + q.delete("property_filters", "app_id=?", array) + q.delete("audience_filter_values", "app_id=?", array) + q.delete("consent_settings", "app_id=?", array);
                            if (j > 0) {
                                c6.a.c().s().c("Deleted application data. app, records", e0, j);
                            }
                        }
                        catch (SQLiteException ex) {
                            c6.a.c().o().c("Error deleting application data. appId, error", n3.w(e0), ex);
                        }
                        h5 = null;
                    }
                }
                if (h5 != null) {
                    final boolean b = h5.M() != -2147483648L && h5.M() != na.P;
                    final String h6 = h5.h0();
                    if ((h5.M() == -2147483648L && h6 != null && !h6.equals(na.I)) | b) {
                        final Bundle bundle = new Bundle();
                        bundle.putString("_pv", h6);
                        this.f(new u("_au", new s(bundle), "auto", n), na);
                    }
                }
                this.Q(na);
                q q2;
                boolean b2;
                if (t == 0) {
                    final k c7 = this.c;
                    P(c7);
                    q2 = c7.W(na.G, "_f");
                    b2 = false;
                }
                else {
                    final k c8 = this.c;
                    P(c8);
                    q2 = c8.W(na.G, "_v");
                    b2 = true;
                }
                Label_2086: {
                    u u;
                    if (q2 == null) {
                        final long n2 = (n / 3600000L + 1L) * 3600000L;
                        String s8;
                        if (!b2) {
                            this.w(new ca("_fot", n, n2, "auto"), na);
                            this.b().e();
                            final g4 g4 = com.google.android.gms.common.internal.x.k(this.k);
                            final String g5 = na.G;
                            Label_1363: {
                                l3 l2;
                                String s3;
                                if (g5 != null && !g5.isEmpty()) {
                                    g4.a.b().e();
                                    if (!g4.a()) {
                                        l2 = g4.a.c().r();
                                        s3 = "Install Referrer Reporter is not available";
                                    }
                                    else {
                                        final e4 e2 = new e4(g4, g5);
                                        g4.a.b().e();
                                        final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                        final PackageManager packageManager = g4.a.X().getPackageManager();
                                        if (packageManager == null) {
                                            l2 = g4.a.c().v();
                                            s3 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                                        }
                                        else {
                                            final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                                final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                if (serviceInfo == null) {
                                                    break Label_1363;
                                                }
                                                final String packageName = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(packageName) && g4.a()) {
                                                    final Intent intent2 = new Intent(intent);
                                                    try {
                                                        final boolean a2 = com.google.android.gms.common.stats.a.b().a(g4.a.X(), intent2, (ServiceConnection)e2, 1);
                                                        final l3 s4 = g4.a.c().s();
                                                        String s5;
                                                        if (!a2) {
                                                            s5 = "not available";
                                                        }
                                                        else {
                                                            s5 = "available";
                                                        }
                                                        s4.b("Install Referrer Service is", s5);
                                                    }
                                                    catch (RuntimeException ex2) {
                                                        g4.a.c().o().b("Exception occurred while binding to Install Referrer Service", ex2.getMessage());
                                                    }
                                                    break Label_1363;
                                                }
                                                l2 = g4.a.c().t();
                                                s3 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                            }
                                            else {
                                                l2 = g4.a.c().r();
                                                s3 = "Play Service for fetching Install Referrer is unavailable on device";
                                            }
                                        }
                                    }
                                }
                                else {
                                    l2 = g4.a.c().v();
                                    s3 = "Install Referrer Reporter was called with invalid app package name";
                                }
                                l2.a(s3);
                            }
                            this.b().e();
                            this.d();
                            final Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", 1L);
                            if (na.V) {
                                bundle2.putLong("_dac", 1L);
                            }
                            final String s6 = com.google.android.gms.common.internal.x.k(na.G);
                            final k c9 = this.c;
                            P(c9);
                            com.google.android.gms.common.internal.x.g(s6);
                            c9.e();
                            c9.f();
                            final long m = c9.M(s6, "first_open_count");
                            if (this.l.X().getPackageManager() == null) {
                                this.c().o().b("PackageManager is null, first open report might be inaccurate. appId", n3.w(s6));
                            }
                            else {
                                PackageInfo e3;
                                try {
                                    e3 = com.google.android.gms.common.wrappers.c.a(this.l.X()).e(s6, 0);
                                }
                                catch (PackageManager$NameNotFoundException ex3) {
                                    this.c().o().c("Package info is null, first open report might be inaccurate. appId", n3.w(s6), ex3);
                                    e3 = null;
                                }
                                final String s7 = "_sysu";
                                if (e3 != null) {
                                    final long firstInstallTime = e3.firstInstallTime;
                                    if (firstInstallTime != 0L) {
                                        boolean b3;
                                        if (firstInstallTime != e3.lastUpdateTime) {
                                            Label_1637: {
                                                if (this.S().y(null, a3.j0)) {
                                                    if (m != 0L) {
                                                        break Label_1637;
                                                    }
                                                }
                                                bundle2.putLong("_uwa", 1L);
                                            }
                                            b3 = false;
                                        }
                                        else {
                                            b3 = true;
                                        }
                                        long k;
                                        if (!b3) {
                                            k = 0L;
                                        }
                                        else {
                                            k = 1L;
                                        }
                                        this.w(new ca("_fi", n, k, "auto"), na);
                                    }
                                }
                                ApplicationInfo c10;
                                try {
                                    c10 = com.google.android.gms.common.wrappers.c.a(this.l.X()).c(s6, 0);
                                }
                                catch (PackageManager$NameNotFoundException ex4) {
                                    this.c().o().c("Application info is null, first open report might be inaccurate. appId", n3.w(s6), ex4);
                                    c10 = null;
                                }
                                if (c10 != null) {
                                    if ((c10.flags & 0x1) != 0x0) {
                                        bundle2.putLong("_sys", 1L);
                                    }
                                    if ((c10.flags & 0x80) != 0x0) {
                                        bundle2.putLong(s7, 1L);
                                    }
                                }
                            }
                            if (m >= 0L) {
                                bundle2.putLong("_pfo", m);
                            }
                            this.h(new u("_f", new s(bundle2), "auto", n), na);
                            s8 = "_et";
                        }
                        else {
                            this.w(new ca("_fvt", n, n2, "auto"), na);
                            this.b().e();
                            this.d();
                            final Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            s8 = "_et";
                            bundle3.putLong(s8, 1L);
                            if (na.V) {
                                bundle3.putLong("_dac", 1L);
                            }
                            this.h(new u("_v", new s(bundle3), "auto", n), na);
                        }
                        if (this.S().y(na.G, a3.V)) {
                            break Label_2086;
                        }
                        final Bundle bundle4 = new Bundle();
                        bundle4.putLong(s8, 1L);
                        bundle4.putLong("_fr", 1L);
                        u = new u("_e", new s(bundle4), "auto", n);
                    }
                    else {
                        if (!na.O) {
                            break Label_2086;
                        }
                        u = new u("_cd", new s(new Bundle()), "auto", n);
                    }
                    this.h(u, na);
                }
                final k c11 = this.c;
                P(c11);
                c11.l();
            }
            finally {
                final k c12 = this.c;
                P(c12);
                c12.h0();
            }
        }
    }
    
    final void n() {
        ++this.q;
    }
    
    @c1
    final void o(final com.google.android.gms.measurement.internal.c c) {
        final na d = this.D(com.google.android.gms.common.internal.x.k(c.G));
        if (d != null) {
            this.p(c, d);
        }
    }
    
    @c1
    final void p(final com.google.android.gms.measurement.internal.c c, final na na) {
        com.google.android.gms.common.internal.x.k(c);
        com.google.android.gms.common.internal.x.g(c.G);
        com.google.android.gms.common.internal.x.k(c.I);
        com.google.android.gms.common.internal.x.g(c.I.H);
        this.b().e();
        this.d();
        if (!this.K(na)) {
            return;
        }
        if (na.N) {
            final k c2 = this.c;
            P(c2);
            c2.g0();
            try {
                this.Q(na);
                final String s = com.google.android.gms.common.internal.x.k(c.G);
                final k c3 = this.c;
                P(c3);
                final com.google.android.gms.measurement.internal.c t = c3.T(s, c.I.H);
                if (t != null) {
                    this.c().n().c("Removing conditional user property", c.G, this.l.A().p(c.I.H));
                    final k c4 = this.c;
                    P(c4);
                    c4.I(s, c.I.H);
                    if (t.K) {
                        final k c5 = this.c;
                        P(c5);
                        c5.j(s, c.I.H);
                    }
                    final u q = c.Q;
                    if (q != null) {
                        final s h = q.H;
                        Bundle g1;
                        if (h != null) {
                            g1 = h.g1();
                        }
                        else {
                            g1 = null;
                        }
                        this.y(com.google.android.gms.common.internal.x.k(this.g0().w0(s, com.google.android.gms.common.internal.x.k(c.Q).G, g1, t.H, c.Q.J, true, true)), na);
                    }
                }
                else {
                    this.c().t().c("Conditional user property doesn't exist", n3.w(c.G), this.l.A().p(c.I.H));
                }
                final k c6 = this.c;
                P(c6);
                c6.l();
                return;
            }
            finally {
                final k c7 = this.c;
                P(c7);
                c7.h0();
            }
        }
        this.Q(na);
    }
    
    @c1
    final void q(final ca ca, final na na) {
        this.b().e();
        this.d();
        if (!this.K(na)) {
            return;
        }
        if (!na.N) {
            this.Q(na);
            return;
        }
        if ("_npa".equals(ca.H) && na.X != null) {
            this.c().n().a("Falling back to manifest metadata value for ad personalization");
            final long a = this.F().a();
            long l;
            if (!na.X) {
                l = 0L;
            }
            else {
                l = 1L;
            }
            this.w(new ca("_npa", a, l, "auto"), na);
            return;
        }
        this.c().n().b("Removing user property", this.l.A().p(ca.H));
        final k c = this.c;
        P(c);
        c.g0();
        try {
            this.Q(na);
            final k c2 = this.c;
            P(c2);
            c2.j(com.google.android.gms.common.internal.x.k(na.G), ca.H);
            final k c3 = this.c;
            P(c3);
            c3.l();
            this.c().n().b("User property removed", this.l.A().p(ca.H));
        }
        finally {
            final k c4 = this.c;
            P(c4);
            c4.h0();
        }
    }
    
    @c1
    @d0
    final void r(final na na) {
        if (this.x != null) {
            (this.y = new ArrayList<Long>()).addAll(this.x);
        }
        final k c = this.c;
        P(c);
        final String s = com.google.android.gms.common.internal.x.k(na.G);
        com.google.android.gms.common.internal.x.g(s);
        c.e();
        c.f();
        try {
            final SQLiteDatabase q = c.Q();
            final String[] array = { s };
            final int i = q.delete("apps", "app_id=?", array) + q.delete("events", "app_id=?", array) + q.delete("user_attributes", "app_id=?", array) + q.delete("conditional_properties", "app_id=?", array) + q.delete("raw_events", "app_id=?", array) + q.delete("raw_events_metadata", "app_id=?", array) + q.delete("queue", "app_id=?", array) + q.delete("audience_filter_values", "app_id=?", array) + q.delete("main_event_params", "app_id=?", array) + q.delete("default_event_params", "app_id=?", array);
            if (i > 0) {
                c.a.c().s().c("Reset analytics data. app, records", s, i);
            }
        }
        catch (SQLiteException ex) {
            c.a.c().o().c("Error resetting analytics data. appId, error", n3.w(s), ex);
        }
        if (na.N) {
            this.m(na);
        }
    }
    
    @c1
    protected final void s() {
        this.b().e();
        final k c = this.c;
        P(c);
        c.j0();
        if (this.i.i.a() == 0L) {
            this.i.i.b(this.F().a());
        }
        this.J();
    }
    
    @c1
    final void t(final com.google.android.gms.measurement.internal.c c) {
        final na d = this.D(com.google.android.gms.common.internal.x.k(c.G));
        if (d != null) {
            this.u(c, d);
        }
    }
    
    @c1
    final void u(com.google.android.gms.measurement.internal.c t, final na na) {
        com.google.android.gms.common.internal.x.k(t);
        com.google.android.gms.common.internal.x.g(t.G);
        com.google.android.gms.common.internal.x.k(t.H);
        com.google.android.gms.common.internal.x.k(t.I);
        com.google.android.gms.common.internal.x.g(t.I.H);
        this.b().e();
        this.d();
        if (!this.K(na)) {
            return;
        }
        if (!na.N) {
            this.Q(na);
            return;
        }
        final com.google.android.gms.measurement.internal.c c = new com.google.android.gms.measurement.internal.c(t);
        boolean b = false;
        c.K = false;
        final k c2 = this.c;
        P(c2);
        c2.g0();
        try {
            final k c3 = this.c;
            P(c3);
            t = c3.T(com.google.android.gms.common.internal.x.k(c.G), c.I.H);
            if (t != null && !t.H.equals(c.H)) {
                this.c().t().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.l.A().p(c.I.H), c.H, t.H);
            }
            if (t != null && t.K) {
                c.H = t.H;
                c.J = t.J;
                c.N = t.N;
                c.L = t.L;
                c.O = t.O;
                c.K = true;
                final ca i = c.I;
                c.I = new ca(i.H, t.I.I, i.M(), t.I.L);
            }
            else if (TextUtils.isEmpty((CharSequence)c.L)) {
                final ca j = c.I;
                c.I = new ca(j.H, c.J, j.M(), c.I.L);
                c.K = true;
                b = true;
            }
            if (c.K) {
                final ca k = c.I;
                final ea ea = new ea(com.google.android.gms.common.internal.x.k(c.G), c.H, k.H, k.I, com.google.android.gms.common.internal.x.k(k.M()));
                final k c4 = this.c;
                P(c4);
                l3 l3;
                String s;
                Object o;
                String s2;
                Object o2;
                if (c4.w(ea)) {
                    l3 = this.c().n();
                    s = "User property updated immediately";
                    o = c.G;
                    s2 = this.l.A().p(ea.c);
                    o2 = ea.e;
                }
                else {
                    l3 = this.c().o();
                    s = "(2)Too many active user properties, ignoring";
                    o = n3.w(c.G);
                    s2 = this.l.A().p(ea.c);
                    o2 = ea.e;
                }
                l3.d(s, o, s2, o2);
                if (b) {
                    final u o3 = c.O;
                    if (o3 != null) {
                        this.y(new u(o3, c.J), na);
                    }
                }
            }
            final k c5 = this.c;
            P(c5);
            l3 l4;
            String s3;
            Object o4;
            String s4;
            Object o5;
            if (c5.v(c)) {
                l4 = this.c().n();
                s3 = "Conditional property added";
                o4 = c.G;
                s4 = this.l.A().p(c.I.H);
                o5 = c.I.M();
            }
            else {
                l4 = this.c().o();
                s3 = "Too many conditional properties, ignoring";
                o4 = n3.w(c.G);
                s4 = this.l.A().p(c.I.H);
                o5 = c.I.M();
            }
            l4.d(s3, o4, s4, o5);
            final k c6 = this.c;
            P(c6);
            c6.l();
        }
        finally {
            final k c7 = this.c;
            P(c7);
            c7.h0();
        }
    }
    
    @c1
    final void v(final String s, final h h) {
        this.b().e();
        this.d();
        this.A.put(s, h);
        final k c = this.c;
        P(c);
        com.google.android.gms.common.internal.x.k(s);
        com.google.android.gms.common.internal.x.k(h);
        c.e();
        c.f();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("consent_state", h.i());
        try {
            if (c.Q().insertWithOnConflict("consent_settings", (String)null, contentValues, 5) == -1L) {
                c.a.c().o().b("Failed to insert/update consent setting (got -1). appId", n3.w(s));
            }
        }
        catch (SQLiteException ex) {
            c.a.c().o().c("Error storing consent setting. appId, error", n3.w(s), ex);
        }
    }
    
    @c1
    final void w(final ca ca, final na na) {
        this.b().e();
        this.d();
        if (!this.K(na)) {
            return;
        }
        if (!na.N) {
            this.Q(na);
            return;
        }
        final int n0 = this.g0().n0(ca.H);
        final ga g0 = this.g0();
        final String h = ca.H;
        if (n0 != 0) {
            this.S();
            final String n2 = g0.n(h, 24, true);
            final String h2 = ca.H;
            int length;
            if (h2 != null) {
                length = h2.length();
            }
            else {
                length = 0;
            }
            this.g0().x(this.B, na.G, n0, "_ev", n2, length);
            return;
        }
        final int j0 = g0.j0(h, ca.M());
        if (j0 != 0) {
            final ga g2 = this.g0();
            final String h3 = ca.H;
            this.S();
            final String n3 = g2.n(h3, 24, true);
            final Object m = ca.M();
            int length2;
            if (m != null && (m instanceof String || m instanceof CharSequence)) {
                length2 = String.valueOf(m).length();
            }
            else {
                length2 = 0;
            }
            this.g0().x(this.B, na.G, j0, "_ev", n3, length2);
            return;
        }
        final Object i = this.g0().m(ca.H, ca.M());
        if (i == null) {
            return;
        }
        if ("_sid".equals(ca.H)) {
            final long k = ca.I;
            final String l = ca.L;
            final String s = com.google.android.gms.common.internal.x.k(na.G);
            final k c = this.c;
            P(c);
            final ea z = c.Z(s, "_sno");
            long l2 = 0L;
            Label_0429: {
                if (z != null) {
                    final Object e = z.e;
                    if (e instanceof Long) {
                        l2 = (long)e;
                        break Label_0429;
                    }
                }
                if (z != null) {
                    this.c().t().b("Retrieved last session number from database does not contain a valid (long) value", z.e);
                }
                final k c2 = this.c;
                P(c2);
                final q w = c2.W(s, "_s");
                if (w != null) {
                    l2 = w.c;
                    this.c().s().b("Backfill the session number. Last used session number", l2);
                }
                else {
                    l2 = 0L;
                }
            }
            this.w(new ca("_sno", k, l2 + 1L, l), na);
        }
        final ea ea = new ea(com.google.android.gms.common.internal.x.k(na.G), com.google.android.gms.common.internal.x.k(ca.L), ca.H, ca.I, i);
        this.c().s().c("Setting user property", this.l.A().p(ea.c), i);
        final k c3 = this.c;
        P(c3);
        c3.g0();
        try {
            oc.b();
            if (this.l.w().y(null, a3.A0) && "_id".equals(ea.c)) {
                final k c4 = this.c;
                P(c4);
                c4.j(na.G, "_lair");
            }
            this.Q(na);
            final k c5 = this.c;
            P(c5);
            final boolean w2 = c5.w(ea);
            final k c6 = this.c;
            P(c6);
            c6.l();
            if (!w2) {
                this.c().o().c("Too many unique user properties are set. Ignoring user property", this.l.A().p(ea.c), ea.e);
                this.g0().x(this.B, na.G, 9, null, null, 0);
            }
        }
        finally {
            final k c7 = this.c;
            P(c7);
            c7.h0();
        }
    }
    
    @c1
    final void x() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/measurement/internal/z9.b:()Lcom/google/android/gms/measurement/internal/w4;
        //     4: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     7: aload_0        
        //     8: invokevirtual   com/google/android/gms/measurement/internal/z9.d:()V
        //    11: aload_0        
        //    12: iconst_1       
        //    13: putfield        com/google/android/gms/measurement/internal/z9.u:Z
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/measurement/internal/z9.l:Lcom/google/android/gms/measurement/internal/z4;
        //    20: invokevirtual   com/google/android/gms/measurement/internal/z4.L:()Lcom/google/android/gms/measurement/internal/b;
        //    23: pop            
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/measurement/internal/z9.l:Lcom/google/android/gms/measurement/internal/z4;
        //    28: invokevirtual   com/google/android/gms/measurement/internal/z4.J:()Lcom/google/android/gms/measurement/internal/u8;
        //    31: invokevirtual   com/google/android/gms/measurement/internal/u8.H:()Ljava/lang/Boolean;
        //    34: astore_1       
        //    35: aload_1        
        //    36: ifnonnull       66
        //    39: aload_0        
        //    40: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    43: invokevirtual   com/google/android/gms/measurement/internal/n3.t:()Lcom/google/android/gms/measurement/internal/l3;
        //    46: astore_1       
        //    47: ldc_w           "Upload data called on the client side before use of service was decided"
        //    50: astore_2       
        //    51: aload_1        
        //    52: aload_2        
        //    53: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        com/google/android/gms/measurement/internal/z9.u:Z
        //    61: aload_0        
        //    62: invokespecial   com/google/android/gms/measurement/internal/z9.G:()V
        //    65: return         
        //    66: aload_1        
        //    67: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    70: ifeq            88
        //    73: aload_0        
        //    74: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    77: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    80: astore_1       
        //    81: ldc_w           "Upload called in the client side when service should be used"
        //    84: astore_2       
        //    85: goto            51
        //    88: aload_0        
        //    89: getfield        com/google/android/gms/measurement/internal/z9.o:J
        //    92: lconst_0       
        //    93: lcmp           
        //    94: ifle            104
        //    97: aload_0        
        //    98: invokespecial   com/google/android/gms/measurement/internal/z9.J:()V
        //   101: goto            56
        //   104: aload_0        
        //   105: invokevirtual   com/google/android/gms/measurement/internal/z9.b:()Lcom/google/android/gms/measurement/internal/w4;
        //   108: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //   111: aload_0        
        //   112: getfield        com/google/android/gms/measurement/internal/z9.x:Ljava/util/List;
        //   115: ifnull          133
        //   118: aload_0        
        //   119: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   122: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   125: astore_1       
        //   126: ldc_w           "Uploading requested multiple times"
        //   129: astore_2       
        //   130: goto            51
        //   133: aload_0        
        //   134: getfield        com/google/android/gms/measurement/internal/z9.b:Lcom/google/android/gms/measurement/internal/t3;
        //   137: astore_1       
        //   138: aload_1        
        //   139: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //   142: pop            
        //   143: aload_1        
        //   144: invokevirtual   com/google/android/gms/measurement/internal/t3.k:()Z
        //   147: ifne            166
        //   150: aload_0        
        //   151: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   154: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   157: ldc_w           "Network not connected, ignoring upload request"
        //   160: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   163: goto            97
        //   166: aload_0        
        //   167: invokevirtual   com/google/android/gms/measurement/internal/z9.F:()Lcom/google/android/gms/common/util/g;
        //   170: invokeinterface com/google/android/gms/common/util/g.a:()J
        //   175: lstore_3       
        //   176: aload_0        
        //   177: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //   180: astore_1       
        //   181: getstatic       com/google/android/gms/measurement/internal/a3.R:Lcom/google/android/gms/measurement/internal/z2;
        //   184: astore          5
        //   186: aconst_null    
        //   187: astore          6
        //   189: aconst_null    
        //   190: astore          7
        //   192: aconst_null    
        //   193: astore          8
        //   195: aconst_null    
        //   196: astore_2       
        //   197: aload_1        
        //   198: aconst_null    
        //   199: aload           5
        //   201: invokevirtual   com/google/android/gms/measurement/internal/g.l:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)I
        //   204: istore          9
        //   206: aload_0        
        //   207: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //   210: pop            
        //   211: invokestatic    com/google/android/gms/measurement/internal/g.G:()J
        //   214: lstore          10
        //   216: iconst_0       
        //   217: istore          12
        //   219: iload           12
        //   221: iload           9
        //   223: if_icmpge       244
        //   226: aload_0        
        //   227: aconst_null    
        //   228: lload_3        
        //   229: lload           10
        //   231: lsub           
        //   232: invokespecial   com/google/android/gms/measurement/internal/z9.M:(Ljava/lang/String;J)Z
        //   235: ifeq            244
        //   238: iinc            12, 1
        //   241: goto            219
        //   244: aload_0        
        //   245: getfield        com/google/android/gms/measurement/internal/z9.i:Lcom/google/android/gms/measurement/internal/v8;
        //   248: getfield        com/google/android/gms/measurement/internal/v8.i:Lcom/google/android/gms/measurement/internal/y3;
        //   251: invokevirtual   com/google/android/gms/measurement/internal/y3.a:()J
        //   254: lstore          10
        //   256: lload           10
        //   258: lconst_0       
        //   259: lcmp           
        //   260: ifeq            286
        //   263: aload_0        
        //   264: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   267: invokevirtual   com/google/android/gms/measurement/internal/n3.n:()Lcom/google/android/gms/measurement/internal/l3;
        //   270: ldc_w           "Uploading events. Elapsed time since last upload attempt (ms)"
        //   273: lload_3        
        //   274: lload           10
        //   276: lsub           
        //   277: invokestatic    java/lang/Math.abs:(J)J
        //   280: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   283: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   286: aload_0        
        //   287: getfield        com/google/android/gms/measurement/internal/z9.c:Lcom/google/android/gms/measurement/internal/k;
        //   290: astore_1       
        //   291: aload_1        
        //   292: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //   295: pop            
        //   296: aload_1        
        //   297: invokevirtual   com/google/android/gms/measurement/internal/k.b0:()Ljava/lang/String;
        //   300: astore          13
        //   302: aload           13
        //   304: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   307: istore          14
        //   309: ldc2_w          -1
        //   312: lstore          10
        //   314: iload           14
        //   316: ifne            2028
        //   319: aload_0        
        //   320: getfield        com/google/android/gms/measurement/internal/z9.z:J
        //   323: ldc2_w          -1
        //   326: lcmp           
        //   327: ifne            468
        //   330: aload_0        
        //   331: getfield        com/google/android/gms/measurement/internal/z9.c:Lcom/google/android/gms/measurement/internal/k;
        //   334: astore          6
        //   336: aload           6
        //   338: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //   341: pop            
        //   342: aload           6
        //   344: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   347: ldc_w           "select rowid from raw_events order by rowid desc limit 1;"
        //   350: aconst_null    
        //   351: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   354: astore_1       
        //   355: aload_1        
        //   356: astore_2       
        //   357: aload_1        
        //   358: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   363: istore          14
        //   365: iload           14
        //   367: ifne            383
        //   370: aload_1        
        //   371: invokeinterface android/database/Cursor.close:()V
        //   376: lload           10
        //   378: lstore          15
        //   380: goto            446
        //   383: aload_1        
        //   384: astore_2       
        //   385: aload_1        
        //   386: iconst_0       
        //   387: invokeinterface android/database/Cursor.getLong:(I)J
        //   392: lstore          15
        //   394: lload           15
        //   396: lstore          10
        //   398: goto            370
        //   401: astore          8
        //   403: goto            414
        //   406: astore_1       
        //   407: goto            456
        //   410: astore          8
        //   412: aconst_null    
        //   413: astore_1       
        //   414: aload_1        
        //   415: astore_2       
        //   416: aload           6
        //   418: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   421: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   424: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   427: ldc_w           "Error querying raw events"
        //   430: aload           8
        //   432: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   435: lload           10
        //   437: lstore          15
        //   439: aload_1        
        //   440: ifnull          446
        //   443: goto            370
        //   446: aload_0        
        //   447: lload           15
        //   449: putfield        com/google/android/gms/measurement/internal/z9.z:J
        //   452: goto            468
        //   455: astore_1       
        //   456: aload_2        
        //   457: ifnull          466
        //   460: aload_2        
        //   461: invokeinterface android/database/Cursor.close:()V
        //   466: aload_1        
        //   467: athrow         
        //   468: aload_0        
        //   469: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //   472: aload           13
        //   474: getstatic       com/google/android/gms/measurement/internal/a3.h:Lcom/google/android/gms/measurement/internal/z2;
        //   477: invokevirtual   com/google/android/gms/measurement/internal/g.l:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)I
        //   480: istore          12
        //   482: iconst_0       
        //   483: aload_0        
        //   484: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //   487: aload           13
        //   489: getstatic       com/google/android/gms/measurement/internal/a3.i:Lcom/google/android/gms/measurement/internal/z2;
        //   492: invokevirtual   com/google/android/gms/measurement/internal/g.l:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)I
        //   495: invokestatic    java/lang/Math.max:(II)I
        //   498: istore          9
        //   500: aload_0        
        //   501: getfield        com/google/android/gms/measurement/internal/z9.c:Lcom/google/android/gms/measurement/internal/k;
        //   504: astore          17
        //   506: aload           17
        //   508: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //   511: pop            
        //   512: aload           17
        //   514: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //   517: aload           17
        //   519: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //   522: iload           12
        //   524: ifle            533
        //   527: iconst_1       
        //   528: istore          14
        //   530: goto            536
        //   533: iconst_0       
        //   534: istore          14
        //   536: iload           14
        //   538: invokestatic    com/google/android/gms/common/internal/x.a:(Z)V
        //   541: iload           9
        //   543: ifle            552
        //   546: iconst_1       
        //   547: istore          14
        //   549: goto            555
        //   552: iconst_0       
        //   553: istore          14
        //   555: iload           14
        //   557: invokestatic    com/google/android/gms/common/internal/x.a:(Z)V
        //   560: aload           13
        //   562: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //   565: pop            
        //   566: aload           17
        //   568: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   571: ldc_w           "queue"
        //   574: iconst_3       
        //   575: anewarray       Ljava/lang/String;
        //   578: dup            
        //   579: iconst_0       
        //   580: ldc_w           "rowid"
        //   583: aastore        
        //   584: dup            
        //   585: iconst_1       
        //   586: ldc_w           "data"
        //   589: aastore        
        //   590: dup            
        //   591: iconst_2       
        //   592: ldc_w           "retry_count"
        //   595: aastore        
        //   596: ldc_w           "app_id=?"
        //   599: iconst_1       
        //   600: anewarray       Ljava/lang/String;
        //   603: dup            
        //   604: iconst_0       
        //   605: aload           13
        //   607: aastore        
        //   608: aconst_null    
        //   609: aconst_null    
        //   610: ldc_w           "rowid"
        //   613: iload           12
        //   615: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   618: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   621: astore          6
        //   623: lload_3        
        //   624: lstore          10
        //   626: aload           6
        //   628: astore_1       
        //   629: aload           6
        //   631: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   636: ifne            664
        //   639: lload_3        
        //   640: lstore          10
        //   642: aload           6
        //   644: astore_1       
        //   645: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   648: astore_2       
        //   649: aload           6
        //   651: invokeinterface android/database/Cursor.close:()V
        //   656: aload_2        
        //   657: astore_1       
        //   658: lload_3        
        //   659: lstore          10
        //   661: goto            1259
        //   664: lload_3        
        //   665: lstore          10
        //   667: aload           6
        //   669: astore_1       
        //   670: new             Ljava/util/ArrayList;
        //   673: astore          18
        //   675: lload_3        
        //   676: lstore          10
        //   678: aload           6
        //   680: astore_1       
        //   681: aload           18
        //   683: invokespecial   java/util/ArrayList.<init>:()V
        //   686: iconst_0       
        //   687: istore          12
        //   689: lload_3        
        //   690: lstore          10
        //   692: aload           6
        //   694: astore_1       
        //   695: aload           6
        //   697: iconst_0       
        //   698: invokeinterface android/database/Cursor.getLong:(I)J
        //   703: lstore          15
        //   705: lload_3        
        //   706: lstore          10
        //   708: aload           6
        //   710: astore_1       
        //   711: aload           6
        //   713: iconst_1       
        //   714: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   719: astore          7
        //   721: lload_3        
        //   722: lstore          10
        //   724: aload           6
        //   726: astore_1       
        //   727: aload           17
        //   729: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   732: getfield        com/google/android/gms/measurement/internal/z9.g:Lcom/google/android/gms/measurement/internal/ba;
        //   735: astore          8
        //   737: lload_3        
        //   738: lstore          10
        //   740: aload           6
        //   742: astore_1       
        //   743: aload           8
        //   745: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //   748: pop            
        //   749: lload_3        
        //   750: lstore          10
        //   752: aload           6
        //   754: astore_1       
        //   755: new             Ljava/io/ByteArrayInputStream;
        //   758: astore_2       
        //   759: lload_3        
        //   760: lstore          10
        //   762: aload           6
        //   764: astore_1       
        //   765: aload_2        
        //   766: aload           7
        //   768: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   771: lload_3        
        //   772: lstore          10
        //   774: aload           6
        //   776: astore_1       
        //   777: new             Ljava/util/zip/GZIPInputStream;
        //   780: astore          19
        //   782: lload_3        
        //   783: lstore          10
        //   785: aload           6
        //   787: astore_1       
        //   788: aload           19
        //   790: aload_2        
        //   791: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   794: lload_3        
        //   795: lstore          10
        //   797: aload           6
        //   799: astore_1       
        //   800: new             Ljava/io/ByteArrayOutputStream;
        //   803: astore          5
        //   805: lload_3        
        //   806: lstore          10
        //   808: aload           6
        //   810: astore_1       
        //   811: aload           5
        //   813: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   816: lload_3        
        //   817: lstore          10
        //   819: aload           6
        //   821: astore_1       
        //   822: sipush          1024
        //   825: newarray        B
        //   827: astore          7
        //   829: aload           6
        //   831: astore_1       
        //   832: aload           19
        //   834: aload           7
        //   836: invokevirtual   java/util/zip/GZIPInputStream.read:([B)I
        //   839: istore          20
        //   841: iload           20
        //   843: ifgt            1037
        //   846: aload           6
        //   848: astore_1       
        //   849: aload           19
        //   851: invokevirtual   java/util/zip/GZIPInputStream.close:()V
        //   854: aload           6
        //   856: astore_1       
        //   857: aload_2        
        //   858: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   861: aload           6
        //   863: astore_1       
        //   864: aload           5
        //   866: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   869: astore_2       
        //   870: aload           6
        //   872: astore_1       
        //   873: aload           18
        //   875: invokeinterface java/util/List.isEmpty:()Z
        //   880: ifne            903
        //   883: aload           6
        //   885: astore_1       
        //   886: aload_2        
        //   887: arraylength    
        //   888: istore          20
        //   890: iload           20
        //   892: iload           12
        //   894: iadd           
        //   895: iload           9
        //   897: if_icmple       903
        //   900: goto            1159
        //   903: aload           6
        //   905: astore_1       
        //   906: invokestatic    com/google/android/gms/internal/measurement/e5.F1:()Lcom/google/android/gms/internal/measurement/d5;
        //   909: aload_2        
        //   910: invokestatic    com/google/android/gms/measurement/internal/ba.A:(Lcom/google/android/gms/internal/measurement/ra;[B)Lcom/google/android/gms/internal/measurement/ra;
        //   913: checkcast       Lcom/google/android/gms/internal/measurement/d5;
        //   916: astore          8
        //   918: aload           6
        //   920: astore_1       
        //   921: aload           6
        //   923: iconst_2       
        //   924: invokeinterface android/database/Cursor.isNull:(I)Z
        //   929: ifne            949
        //   932: aload           6
        //   934: astore_1       
        //   935: aload           8
        //   937: aload           6
        //   939: iconst_2       
        //   940: invokeinterface android/database/Cursor.getInt:(I)I
        //   945: invokevirtual   com/google/android/gms/internal/measurement/d5.c0:(I)Lcom/google/android/gms/internal/measurement/d5;
        //   948: pop            
        //   949: aload           6
        //   951: astore_1       
        //   952: iload           12
        //   954: aload_2        
        //   955: arraylength    
        //   956: iadd           
        //   957: istore          12
        //   959: aload           6
        //   961: astore_1       
        //   962: aload           18
        //   964: aload           8
        //   966: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   969: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //   972: lload           15
        //   974: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   977: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   980: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   985: pop            
        //   986: goto            1129
        //   989: astore          8
        //   991: aload           6
        //   993: astore_1       
        //   994: aload           17
        //   996: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   999: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1002: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1005: astore          7
        //  1007: ldc_w           "Failed to merge queued bundle. appId"
        //  1010: astore_2       
        //  1011: aload           6
        //  1013: astore_1       
        //  1014: aload           13
        //  1016: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1019: astore          5
        //  1021: aload           6
        //  1023: astore_1       
        //  1024: aload           7
        //  1026: aload_2        
        //  1027: aload           5
        //  1029: aload           8
        //  1031: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1034: goto            1129
        //  1037: aload           6
        //  1039: astore_1       
        //  1040: aload           5
        //  1042: aload           7
        //  1044: iconst_0       
        //  1045: iload           20
        //  1047: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //  1050: goto            829
        //  1053: astore_2       
        //  1054: goto            1058
        //  1057: astore_2       
        //  1058: aload           6
        //  1060: astore_1       
        //  1061: aload           8
        //  1063: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1066: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1069: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1072: ldc_w           "Failed to ungzip content"
        //  1075: aload_2        
        //  1076: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1079: aload           6
        //  1081: astore_1       
        //  1082: aload_2        
        //  1083: athrow         
        //  1084: astore_2       
        //  1085: goto            1089
        //  1088: astore_2       
        //  1089: aload           6
        //  1091: astore_1       
        //  1092: aload           17
        //  1094: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1097: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1100: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1103: astore          7
        //  1105: ldc_w           "Failed to unzip queued bundle. appId"
        //  1108: astore          19
        //  1110: aload           6
        //  1112: astore_1       
        //  1113: aload           13
        //  1115: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1118: astore          5
        //  1120: aload_2        
        //  1121: astore          8
        //  1123: aload           19
        //  1125: astore_2       
        //  1126: goto            1021
        //  1129: aload           6
        //  1131: astore_1       
        //  1132: aload           6
        //  1134: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1139: istore          14
        //  1141: iload           14
        //  1143: ifeq            1159
        //  1146: iload           12
        //  1148: iload           9
        //  1150: if_icmple       1156
        //  1153: goto            1159
        //  1156: goto            689
        //  1159: aload           6
        //  1161: invokeinterface android/database/Cursor.close:()V
        //  1166: aload           18
        //  1168: astore_1       
        //  1169: lload_3        
        //  1170: lstore          10
        //  1172: goto            1259
        //  1175: astore          8
        //  1177: aload           6
        //  1179: astore_2       
        //  1180: goto            1204
        //  1183: astore          8
        //  1185: lload           10
        //  1187: lstore_3       
        //  1188: aload           6
        //  1190: astore_2       
        //  1191: goto            1204
        //  1194: astore_2       
        //  1195: aconst_null    
        //  1196: astore_1       
        //  1197: goto            2016
        //  1200: astore          8
        //  1202: aconst_null    
        //  1203: astore_2       
        //  1204: aload_2        
        //  1205: astore_1       
        //  1206: aload           17
        //  1208: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1211: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1214: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1217: ldc_w           "Error querying bundles. appId"
        //  1220: aload           13
        //  1222: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1225: aload           8
        //  1227: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1230: aload_2        
        //  1231: astore_1       
        //  1232: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1235: astore          8
        //  1237: aload           8
        //  1239: astore_1       
        //  1240: lload_3        
        //  1241: lstore          10
        //  1243: aload_2        
        //  1244: ifnull          1259
        //  1247: aload_2        
        //  1248: invokeinterface android/database/Cursor.close:()V
        //  1253: lload_3        
        //  1254: lstore          10
        //  1256: aload           8
        //  1258: astore_1       
        //  1259: aload_1        
        //  1260: invokeinterface java/util/List.isEmpty:()Z
        //  1265: ifne            2234
        //  1268: aload_1        
        //  1269: astore_2       
        //  1270: aload_0        
        //  1271: aload           13
        //  1273: invokevirtual   com/google/android/gms/measurement/internal/z9.T:(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h;
        //  1276: invokevirtual   com/google/android/gms/measurement/internal/h.j:()Z
        //  1279: ifeq            1424
        //  1282: aload_1        
        //  1283: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1288: astore          8
        //  1290: aload           8
        //  1292: invokeinterface java/util/Iterator.hasNext:()Z
        //  1297: ifeq            1336
        //  1300: aload           8
        //  1302: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1307: checkcast       Landroid/util/Pair;
        //  1310: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1313: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //  1316: astore_2       
        //  1317: aload_2        
        //  1318: invokevirtual   com/google/android/gms/internal/measurement/e5.H:()Ljava/lang/String;
        //  1321: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1324: ifne            1290
        //  1327: aload_2        
        //  1328: invokevirtual   com/google/android/gms/internal/measurement/e5.H:()Ljava/lang/String;
        //  1331: astore          8
        //  1333: goto            1339
        //  1336: aconst_null    
        //  1337: astore          8
        //  1339: aload_1        
        //  1340: astore_2       
        //  1341: aload           8
        //  1343: ifnull          1424
        //  1346: iconst_0       
        //  1347: istore          12
        //  1349: aload_1        
        //  1350: astore_2       
        //  1351: iload           12
        //  1353: aload_1        
        //  1354: invokeinterface java/util/List.size:()I
        //  1359: if_icmpge       1424
        //  1362: aload_1        
        //  1363: iload           12
        //  1365: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1370: checkcast       Landroid/util/Pair;
        //  1373: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1376: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //  1379: astore_2       
        //  1380: aload_2        
        //  1381: invokevirtual   com/google/android/gms/internal/measurement/e5.H:()Ljava/lang/String;
        //  1384: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1387: ifeq            1393
        //  1390: goto            1418
        //  1393: aload_2        
        //  1394: invokevirtual   com/google/android/gms/internal/measurement/e5.H:()Ljava/lang/String;
        //  1397: aload           8
        //  1399: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1402: ifne            1418
        //  1405: aload_1        
        //  1406: iconst_0       
        //  1407: iload           12
        //  1409: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //  1414: astore_2       
        //  1415: goto            1424
        //  1418: iinc            12, 1
        //  1421: goto            1349
        //  1424: invokestatic    com/google/android/gms/internal/measurement/c5.v:()Lcom/google/android/gms/internal/measurement/b5;
        //  1427: astore          8
        //  1429: aload_2        
        //  1430: invokeinterface java/util/List.size:()I
        //  1435: istore          20
        //  1437: new             Ljava/util/ArrayList;
        //  1440: astore          5
        //  1442: aload           5
        //  1444: aload_2        
        //  1445: invokeinterface java/util/List.size:()I
        //  1450: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1453: aload_0        
        //  1454: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //  1457: aload           13
        //  1459: invokevirtual   com/google/android/gms/measurement/internal/g.z:(Ljava/lang/String;)Z
        //  1462: ifeq            1483
        //  1465: aload_0        
        //  1466: aload           13
        //  1468: invokevirtual   com/google/android/gms/measurement/internal/z9.T:(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h;
        //  1471: invokevirtual   com/google/android/gms/measurement/internal/h.j:()Z
        //  1474: ifeq            1483
        //  1477: iconst_1       
        //  1478: istore          12
        //  1480: goto            1486
        //  1483: iconst_0       
        //  1484: istore          12
        //  1486: aload_0        
        //  1487: aload           13
        //  1489: invokevirtual   com/google/android/gms/measurement/internal/z9.T:(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h;
        //  1492: invokevirtual   com/google/android/gms/measurement/internal/h.j:()Z
        //  1495: istore          21
        //  1497: aload_0        
        //  1498: aload           13
        //  1500: invokevirtual   com/google/android/gms/measurement/internal/z9.T:(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h;
        //  1503: invokevirtual   com/google/android/gms/measurement/internal/h.k:()Z
        //  1506: istore          14
        //  1508: iconst_0       
        //  1509: istore          9
        //  1511: iload           9
        //  1513: iload           20
        //  1515: if_icmpge       1703
        //  1518: aload_2        
        //  1519: iload           9
        //  1521: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1526: checkcast       Landroid/util/Pair;
        //  1529: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1532: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //  1535: invokevirtual   com/google/android/gms/internal/measurement/j9.p:()Lcom/google/android/gms/internal/measurement/f9;
        //  1538: checkcast       Lcom/google/android/gms/internal/measurement/d5;
        //  1541: astore_1       
        //  1542: aload           5
        //  1544: aload_2        
        //  1545: iload           9
        //  1547: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1552: checkcast       Landroid/util/Pair;
        //  1555: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1558: checkcast       Ljava/lang/Long;
        //  1561: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1566: pop            
        //  1567: aload_0        
        //  1568: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //  1571: invokevirtual   com/google/android/gms/measurement/internal/g.n:()J
        //  1574: pop2           
        //  1575: aload_1        
        //  1576: ldc2_w          42097
        //  1579: invokevirtual   com/google/android/gms/internal/measurement/d5.h0:(J)Lcom/google/android/gms/internal/measurement/d5;
        //  1582: pop            
        //  1583: aload_1        
        //  1584: lload           10
        //  1586: invokevirtual   com/google/android/gms/internal/measurement/d5.g0:(J)Lcom/google/android/gms/internal/measurement/d5;
        //  1589: pop            
        //  1590: aload_0        
        //  1591: getfield        com/google/android/gms/measurement/internal/z9.l:Lcom/google/android/gms/measurement/internal/z4;
        //  1594: invokevirtual   com/google/android/gms/measurement/internal/z4.L:()Lcom/google/android/gms/measurement/internal/b;
        //  1597: pop            
        //  1598: aload_1        
        //  1599: iconst_0       
        //  1600: invokevirtual   com/google/android/gms/internal/measurement/d5.d0:(Z)Lcom/google/android/gms/internal/measurement/d5;
        //  1603: pop            
        //  1604: iload           12
        //  1606: ifne            1614
        //  1609: aload_1        
        //  1610: invokevirtual   com/google/android/gms/internal/measurement/d5.D0:()Lcom/google/android/gms/internal/measurement/d5;
        //  1613: pop            
        //  1614: iload           21
        //  1616: ifne            1629
        //  1619: aload_1        
        //  1620: invokevirtual   com/google/android/gms/internal/measurement/d5.J0:()Lcom/google/android/gms/internal/measurement/d5;
        //  1623: pop            
        //  1624: aload_1        
        //  1625: invokevirtual   com/google/android/gms/internal/measurement/d5.G0:()Lcom/google/android/gms/internal/measurement/d5;
        //  1628: pop            
        //  1629: iload           14
        //  1631: ifne            1639
        //  1634: aload_1        
        //  1635: invokevirtual   com/google/android/gms/internal/measurement/d5.B0:()Lcom/google/android/gms/internal/measurement/d5;
        //  1638: pop            
        //  1639: aload_0        
        //  1640: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //  1643: aload           13
        //  1645: getstatic       com/google/android/gms/measurement/internal/a3.X:Lcom/google/android/gms/measurement/internal/z2;
        //  1648: invokevirtual   com/google/android/gms/measurement/internal/g.y:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)Z
        //  1651: ifeq            1690
        //  1654: aload_1        
        //  1655: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //  1658: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //  1661: invokevirtual   com/google/android/gms/internal/measurement/q7.i:()[B
        //  1664: astore          6
        //  1666: aload_0        
        //  1667: getfield        com/google/android/gms/measurement/internal/z9.g:Lcom/google/android/gms/measurement/internal/ba;
        //  1670: astore          7
        //  1672: aload           7
        //  1674: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  1677: pop            
        //  1678: aload_1        
        //  1679: aload           7
        //  1681: aload           6
        //  1683: invokevirtual   com/google/android/gms/measurement/internal/ba.v:([B)J
        //  1686: invokevirtual   com/google/android/gms/internal/measurement/d5.C:(J)Lcom/google/android/gms/internal/measurement/d5;
        //  1689: pop            
        //  1690: aload           8
        //  1692: aload_1        
        //  1693: invokevirtual   com/google/android/gms/internal/measurement/b5.v:(Lcom/google/android/gms/internal/measurement/d5;)Lcom/google/android/gms/internal/measurement/b5;
        //  1696: pop            
        //  1697: iinc            9, 1
        //  1700: goto            1511
        //  1703: aload_0        
        //  1704: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1707: invokevirtual   com/google/android/gms/measurement/internal/n3.z:()Ljava/lang/String;
        //  1710: iconst_2       
        //  1711: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1714: ifeq            1743
        //  1717: aload_0        
        //  1718: getfield        com/google/android/gms/measurement/internal/z9.g:Lcom/google/android/gms/measurement/internal/ba;
        //  1721: astore_1       
        //  1722: aload_1        
        //  1723: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  1726: pop            
        //  1727: aload_1        
        //  1728: aload           8
        //  1730: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //  1733: checkcast       Lcom/google/android/gms/internal/measurement/c5;
        //  1736: invokevirtual   com/google/android/gms/measurement/internal/ba.B:(Lcom/google/android/gms/internal/measurement/c5;)Ljava/lang/String;
        //  1739: astore_1       
        //  1740: goto            1745
        //  1743: aconst_null    
        //  1744: astore_1       
        //  1745: aload_0        
        //  1746: getfield        com/google/android/gms/measurement/internal/z9.g:Lcom/google/android/gms/measurement/internal/ba;
        //  1749: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  1752: pop            
        //  1753: aload           8
        //  1755: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //  1758: checkcast       Lcom/google/android/gms/internal/measurement/c5;
        //  1761: invokevirtual   com/google/android/gms/internal/measurement/q7.i:()[B
        //  1764: astore          18
        //  1766: aload_0        
        //  1767: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //  1770: pop            
        //  1771: getstatic       com/google/android/gms/measurement/internal/a3.r:Lcom/google/android/gms/measurement/internal/z2;
        //  1774: aconst_null    
        //  1775: invokevirtual   com/google/android/gms/measurement/internal/z2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1778: checkcast       Ljava/lang/String;
        //  1781: astore          6
        //  1783: new             Ljava/net/URL;
        //  1786: astore          7
        //  1788: aload           7
        //  1790: aload           6
        //  1792: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //  1795: aload           5
        //  1797: invokeinterface java/util/List.isEmpty:()Z
        //  1802: iconst_1       
        //  1803: ixor           
        //  1804: invokestatic    com/google/android/gms/common/internal/x.a:(Z)V
        //  1807: aload_0        
        //  1808: getfield        com/google/android/gms/measurement/internal/z9.x:Ljava/util/List;
        //  1811: ifnull          1830
        //  1814: aload_0        
        //  1815: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1818: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1821: ldc_w           "Set uploading progress before finishing the previous upload"
        //  1824: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //  1827: goto            1845
        //  1830: new             Ljava/util/ArrayList;
        //  1833: astore_2       
        //  1834: aload_2        
        //  1835: aload           5
        //  1837: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  1840: aload_0        
        //  1841: aload_2        
        //  1842: putfield        com/google/android/gms/measurement/internal/z9.x:Ljava/util/List;
        //  1845: aload_0        
        //  1846: getfield        com/google/android/gms/measurement/internal/z9.i:Lcom/google/android/gms/measurement/internal/v8;
        //  1849: getfield        com/google/android/gms/measurement/internal/v8.j:Lcom/google/android/gms/measurement/internal/y3;
        //  1852: lload           10
        //  1854: invokevirtual   com/google/android/gms/measurement/internal/y3.b:(J)V
        //  1857: ldc_w           "?"
        //  1860: astore_2       
        //  1861: iload           20
        //  1863: ifle            1876
        //  1866: aload           8
        //  1868: iconst_0       
        //  1869: invokevirtual   com/google/android/gms/internal/measurement/b5.w:(I)Lcom/google/android/gms/internal/measurement/e5;
        //  1872: invokevirtual   com/google/android/gms/internal/measurement/e5.J1:()Ljava/lang/String;
        //  1875: astore_2       
        //  1876: aload_0        
        //  1877: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1880: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //  1883: ldc_w           "Uploading data. app, uncompressed size, data"
        //  1886: aload_2        
        //  1887: aload           18
        //  1889: arraylength    
        //  1890: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1893: aload_1        
        //  1894: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1897: aload_0        
        //  1898: iconst_1       
        //  1899: putfield        com/google/android/gms/measurement/internal/z9.t:Z
        //  1902: aload_0        
        //  1903: getfield        com/google/android/gms/measurement/internal/z9.b:Lcom/google/android/gms/measurement/internal/t3;
        //  1906: astore          5
        //  1908: aload           5
        //  1910: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  1913: pop            
        //  1914: new             Lcom/google/android/gms/measurement/internal/s9;
        //  1917: astore          8
        //  1919: aload           8
        //  1921: aload_0        
        //  1922: aload           13
        //  1924: invokespecial   com/google/android/gms/measurement/internal/s9.<init>:(Lcom/google/android/gms/measurement/internal/z9;Ljava/lang/String;)V
        //  1927: aload           5
        //  1929: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //  1932: aload           5
        //  1934: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //  1937: aload           7
        //  1939: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1942: pop            
        //  1943: aload           18
        //  1945: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1948: pop            
        //  1949: aload           8
        //  1951: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1954: pop            
        //  1955: aload           5
        //  1957: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1960: invokevirtual   com/google/android/gms/measurement/internal/z4.b:()Lcom/google/android/gms/measurement/internal/w4;
        //  1963: astore_2       
        //  1964: new             Lcom/google/android/gms/measurement/internal/s3;
        //  1967: astore_1       
        //  1968: aload_1        
        //  1969: aload           5
        //  1971: aload           13
        //  1973: aload           7
        //  1975: aload           18
        //  1977: aconst_null    
        //  1978: aload           8
        //  1980: invokespecial   com/google/android/gms/measurement/internal/s3.<init>:(Lcom/google/android/gms/measurement/internal/t3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/p3;)V
        //  1983: aload_2        
        //  1984: aload_1        
        //  1985: invokevirtual   com/google/android/gms/measurement/internal/w4.v:(Ljava/lang/Runnable;)V
        //  1988: goto            2234
        //  1991: astore_1       
        //  1992: aload_0        
        //  1993: invokevirtual   com/google/android/gms/measurement/internal/z9.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1996: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1999: ldc_w           "Failed to parse upload URL. Not uploading. appId"
        //  2002: aload           13
        //  2004: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  2007: aload           6
        //  2009: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  2012: goto            2234
        //  2015: astore_2       
        //  2016: aload_1        
        //  2017: ifnull          2026
        //  2020: aload_1        
        //  2021: invokeinterface android/database/Cursor.close:()V
        //  2026: aload_2        
        //  2027: athrow         
        //  2028: aload_0        
        //  2029: ldc2_w          -1
        //  2032: putfield        com/google/android/gms/measurement/internal/z9.z:J
        //  2035: aload_0        
        //  2036: getfield        com/google/android/gms/measurement/internal/z9.c:Lcom/google/android/gms/measurement/internal/k;
        //  2039: astore          5
        //  2041: aload           5
        //  2043: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  2046: pop            
        //  2047: aload_0        
        //  2048: invokevirtual   com/google/android/gms/measurement/internal/z9.S:()Lcom/google/android/gms/measurement/internal/g;
        //  2051: pop            
        //  2052: invokestatic    com/google/android/gms/measurement/internal/g.G:()J
        //  2055: lstore          10
        //  2057: aload           5
        //  2059: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //  2062: aload           5
        //  2064: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //  2067: aload           5
        //  2069: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //  2072: ldc_w           "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
        //  2075: iconst_1       
        //  2076: anewarray       Ljava/lang/String;
        //  2079: dup            
        //  2080: iconst_0       
        //  2081: lload_3        
        //  2082: lload           10
        //  2084: lsub           
        //  2085: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  2088: aastore        
        //  2089: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //  2092: astore_1       
        //  2093: aload_1        
        //  2094: astore_2       
        //  2095: aload_1        
        //  2096: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  2101: ifne            2135
        //  2104: aload_1        
        //  2105: astore_2       
        //  2106: aload           5
        //  2108: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  2111: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  2114: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //  2117: ldc_w           "No expired configs for apps with pending events"
        //  2120: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //  2123: aload           6
        //  2125: astore_2       
        //  2126: aload_1        
        //  2127: invokeinterface android/database/Cursor.close:()V
        //  2132: goto            2202
        //  2135: aload_1        
        //  2136: astore_2       
        //  2137: aload_1        
        //  2138: iconst_0       
        //  2139: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  2144: astore          8
        //  2146: aload           8
        //  2148: astore_2       
        //  2149: goto            2126
        //  2152: astore          8
        //  2154: goto            2168
        //  2157: astore_1       
        //  2158: aload           8
        //  2160: astore_2       
        //  2161: goto            2243
        //  2164: astore          8
        //  2166: aconst_null    
        //  2167: astore_1       
        //  2168: aload_1        
        //  2169: astore_2       
        //  2170: aload           5
        //  2172: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  2175: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  2178: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  2181: ldc_w           "Error selecting expired configs"
        //  2184: aload           8
        //  2186: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2189: aload           7
        //  2191: astore_2       
        //  2192: aload_1        
        //  2193: ifnull          2202
        //  2196: aload           6
        //  2198: astore_2       
        //  2199: goto            2126
        //  2202: aload_2        
        //  2203: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2206: ifne            2234
        //  2209: aload_0        
        //  2210: getfield        com/google/android/gms/measurement/internal/z9.c:Lcom/google/android/gms/measurement/internal/k;
        //  2213: astore_1       
        //  2214: aload_1        
        //  2215: invokestatic    com/google/android/gms/measurement/internal/z9.P:(Lcom/google/android/gms/measurement/internal/p9;)Lcom/google/android/gms/measurement/internal/p9;
        //  2218: pop            
        //  2219: aload_1        
        //  2220: aload_2        
        //  2221: invokevirtual   com/google/android/gms/measurement/internal/k.S:(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h5;
        //  2224: astore_1       
        //  2225: aload_1        
        //  2226: ifnull          2234
        //  2229: aload_0        
        //  2230: aload_1        
        //  2231: invokevirtual   com/google/android/gms/measurement/internal/z9.e:(Lcom/google/android/gms/measurement/internal/h5;)V
        //  2234: aload_0        
        //  2235: iconst_0       
        //  2236: putfield        com/google/android/gms/measurement/internal/z9.u:Z
        //  2239: goto            61
        //  2242: astore_1       
        //  2243: aload_2        
        //  2244: ifnull          2253
        //  2247: aload_2        
        //  2248: invokeinterface android/database/Cursor.close:()V
        //  2253: aload_1        
        //  2254: athrow         
        //  2255: astore_1       
        //  2256: aload_0        
        //  2257: iconst_0       
        //  2258: putfield        com/google/android/gms/measurement/internal/z9.u:Z
        //  2261: aload_0        
        //  2262: invokespecial   com/google/android/gms/measurement/internal/z9.G:()V
        //  2265: aload_1        
        //  2266: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  16     35     2255   2267   Any
        //  39     47     2255   2267   Any
        //  51     56     2255   2267   Any
        //  66     81     2255   2267   Any
        //  88     97     2255   2267   Any
        //  97     101    2255   2267   Any
        //  104    126    2255   2267   Any
        //  133    163    2255   2267   Any
        //  166    186    2255   2267   Any
        //  197    216    2255   2267   Any
        //  226    238    2255   2267   Any
        //  244    256    2255   2267   Any
        //  263    286    2255   2267   Any
        //  286    309    2255   2267   Any
        //  319    342    2255   2267   Any
        //  342    355    410    414    Landroid/database/sqlite/SQLiteException;
        //  342    355    406    410    Any
        //  357    365    401    406    Landroid/database/sqlite/SQLiteException;
        //  357    365    455    456    Any
        //  370    376    2255   2267   Any
        //  385    394    401    406    Landroid/database/sqlite/SQLiteException;
        //  385    394    455    456    Any
        //  416    435    455    456    Any
        //  446    452    2255   2267   Any
        //  460    466    2255   2267   Any
        //  466    468    2255   2267   Any
        //  468    522    2255   2267   Any
        //  536    541    2255   2267   Any
        //  555    566    2255   2267   Any
        //  566    623    1200   1204   Landroid/database/sqlite/SQLiteException;
        //  566    623    1194   1200   Any
        //  629    639    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  629    639    2015   2016   Any
        //  645    649    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  645    649    2015   2016   Any
        //  649    656    2255   2267   Any
        //  670    675    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  670    675    2015   2016   Any
        //  681    686    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  681    686    2015   2016   Any
        //  695    705    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  695    705    2015   2016   Any
        //  711    721    1088   1089   Ljava/io/IOException;
        //  711    721    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  711    721    2015   2016   Any
        //  727    737    1088   1089   Ljava/io/IOException;
        //  727    737    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  727    737    2015   2016   Any
        //  743    749    1088   1089   Ljava/io/IOException;
        //  743    749    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  743    749    2015   2016   Any
        //  755    759    1057   1058   Ljava/io/IOException;
        //  755    759    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  755    759    2015   2016   Any
        //  765    771    1057   1058   Ljava/io/IOException;
        //  765    771    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  765    771    2015   2016   Any
        //  777    782    1057   1058   Ljava/io/IOException;
        //  777    782    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  777    782    2015   2016   Any
        //  788    794    1057   1058   Ljava/io/IOException;
        //  788    794    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  788    794    2015   2016   Any
        //  800    805    1057   1058   Ljava/io/IOException;
        //  800    805    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  800    805    2015   2016   Any
        //  811    816    1057   1058   Ljava/io/IOException;
        //  811    816    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  811    816    2015   2016   Any
        //  822    829    1057   1058   Ljava/io/IOException;
        //  822    829    1183   1194   Landroid/database/sqlite/SQLiteException;
        //  822    829    2015   2016   Any
        //  832    841    1053   1057   Ljava/io/IOException;
        //  832    841    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  832    841    2015   2016   Any
        //  849    854    1053   1057   Ljava/io/IOException;
        //  849    854    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  849    854    2015   2016   Any
        //  857    861    1053   1057   Ljava/io/IOException;
        //  857    861    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  857    861    2015   2016   Any
        //  864    870    1053   1057   Ljava/io/IOException;
        //  864    870    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  864    870    2015   2016   Any
        //  873    883    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  873    883    2015   2016   Any
        //  886    890    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  886    890    2015   2016   Any
        //  906    918    989    1021   Ljava/io/IOException;
        //  906    918    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  906    918    2015   2016   Any
        //  921    932    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  921    932    2015   2016   Any
        //  935    949    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  935    949    2015   2016   Any
        //  952    959    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  952    959    2015   2016   Any
        //  962    986    1175   1183   Landroid/database/sqlite/SQLiteException;
        //  962    986    2015   2016   Any
        //  994    1007   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  994    1007   2015   2016   Any
        //  1014   1021   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1014   1021   2015   2016   Any
        //  1024   1034   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1024   1034   2015   2016   Any
        //  1040   1050   1053   1057   Ljava/io/IOException;
        //  1040   1050   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1040   1050   2015   2016   Any
        //  1061   1079   1084   1088   Ljava/io/IOException;
        //  1061   1079   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1061   1079   2015   2016   Any
        //  1082   1084   1084   1088   Ljava/io/IOException;
        //  1082   1084   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1082   1084   2015   2016   Any
        //  1092   1105   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1092   1105   2015   2016   Any
        //  1113   1120   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1113   1120   2015   2016   Any
        //  1132   1141   1175   1183   Landroid/database/sqlite/SQLiteException;
        //  1132   1141   2015   2016   Any
        //  1159   1166   2255   2267   Any
        //  1206   1230   2015   2016   Any
        //  1232   1237   2015   2016   Any
        //  1247   1253   2255   2267   Any
        //  1259   1268   2255   2267   Any
        //  1270   1290   2255   2267   Any
        //  1290   1333   2255   2267   Any
        //  1351   1390   2255   2267   Any
        //  1393   1415   2255   2267   Any
        //  1424   1477   2255   2267   Any
        //  1486   1508   2255   2267   Any
        //  1518   1604   2255   2267   Any
        //  1609   1614   2255   2267   Any
        //  1619   1629   2255   2267   Any
        //  1634   1639   2255   2267   Any
        //  1639   1690   2255   2267   Any
        //  1690   1697   2255   2267   Any
        //  1703   1740   2255   2267   Any
        //  1745   1783   2255   2267   Any
        //  1783   1827   1991   2015   Ljava/net/MalformedURLException;
        //  1783   1827   2255   2267   Any
        //  1830   1845   1991   2015   Ljava/net/MalformedURLException;
        //  1830   1845   2255   2267   Any
        //  1845   1857   1991   2015   Ljava/net/MalformedURLException;
        //  1845   1857   2255   2267   Any
        //  1866   1876   1991   2015   Ljava/net/MalformedURLException;
        //  1866   1876   2255   2267   Any
        //  1876   1988   1991   2015   Ljava/net/MalformedURLException;
        //  1876   1988   2255   2267   Any
        //  1992   2012   2255   2267   Any
        //  2020   2026   2255   2267   Any
        //  2026   2028   2255   2267   Any
        //  2028   2067   2255   2267   Any
        //  2067   2093   2164   2168   Landroid/database/sqlite/SQLiteException;
        //  2067   2093   2157   2164   Any
        //  2095   2104   2152   2157   Landroid/database/sqlite/SQLiteException;
        //  2095   2104   2242   2243   Any
        //  2106   2123   2152   2157   Landroid/database/sqlite/SQLiteException;
        //  2106   2123   2242   2243   Any
        //  2126   2132   2255   2267   Any
        //  2137   2146   2152   2157   Landroid/database/sqlite/SQLiteException;
        //  2137   2146   2242   2243   Any
        //  2170   2189   2242   2243   Any
        //  2202   2225   2255   2267   Any
        //  2229   2234   2255   2267   Any
        //  2247   2253   2255   2267   Any
        //  2253   2255   2255   2267   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0370:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @c1
    final void y(u ex, na na) {
        com.google.android.gms.common.internal.x.k(na);
        com.google.android.gms.common.internal.x.g(na.G);
        final long nanoTime = System.nanoTime();
        this.b().e();
        this.d();
        final String g = na.G;
        P(this.g);
        if (!ba.k((u)ex, na)) {
            return;
        }
        if (na.N) {
            final q4 a = this.a;
            P(a);
            if (a.u(g, ((u)ex).G)) {
                this.c().t().c("Dropping blocked event. appId", n3.w(g), this.l.A().n(((u)ex).G));
                final q4 a2 = this.a;
                P(a2);
                if (!a2.s(g)) {
                    final q4 a3 = this.a;
                    P(a3);
                    if (!a3.v(g)) {
                        if (!"_err".equals(((u)ex).G)) {
                            this.g0().x(this.B, g, 11, "_ev", ((u)ex).G, 0);
                        }
                        return;
                    }
                }
                final k c = this.c;
                P(c);
                final h5 s = c.S(g);
                if (s != null) {
                    final long abs = Math.abs(this.F().a() - Math.max(s.W(), s.N()));
                    this.S();
                    if (abs > a3.A.a(null)) {
                        this.c().n().a("Fetching config for blocked app");
                        this.e(s);
                    }
                }
                return;
            }
            final o3 b = o3.b((u)ex);
            this.g0().w(b, this.S().k(g));
            final u a4 = b.a();
            if (Log.isLoggable(this.c().z(), 2)) {
                final l3 s2 = this.c().s();
                final i3 a5 = this.l.A();
                String s3;
                if (!a5.q()) {
                    s3 = a4.toString();
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("origin=");
                    sb.append(a4.I);
                    sb.append(",name=");
                    sb.append(a5.n(a4.G));
                    sb.append(",params=");
                    final s h = a4.H;
                    String str;
                    if (h == null) {
                        str = null;
                    }
                    else if (!a5.q()) {
                        str = h.toString();
                    }
                    else {
                        str = a5.m(h.g1());
                    }
                    sb.append(str);
                    s3 = sb.toString();
                }
                s2.b("Logging event", s3);
            }
            final k c2 = this.c;
            P(c2);
            c2.g0();
            try {
                this.Q(na);
                oc.b();
                if (!this.S().y(null, a3.A0) && this.S().y(null, a3.B0)) {
                    final k c3 = this.c;
                    P(c3);
                    c3.j(na.G, "_lair");
                }
                boolean b2 = "ecommerce_purchase".equals(a4.G) || "purchase".equals(a4.G) || "refund".equals(a4.G);
                String s5 = null;
            Label_1252:
                while (true) {
                    Label_0657: {
                        if ("_iap".equals(a4.G)) {
                            break Label_0657;
                        }
                        if (b2) {
                            b2 = true;
                            break Label_0657;
                        }
                        final String s4 = "_err";
                        s5 = s4;
                        break Label_1252;
                    }
                    final String n2 = a4.H.N2("currency");
                    long l;
                    if (b2) {
                        double n3 = a4.H.q1("value") * 1000000.0;
                        if (n3 == 0.0) {
                            n3 = a4.H.Q1("value") * 1000000.0;
                        }
                        if (n3 > 9.223372036854776E18 || n3 < -9.223372036854776E18) {
                            this.c().t().c("Data lost. Currency value is too big. appId", com.google.android.gms.measurement.internal.n3.w(g), n3);
                            final k c4 = this.c;
                            P(c4);
                            c4.l();
                            return;
                        }
                        final long n4 = l = Math.round(n3);
                        if ("refund".equals(a4.G)) {
                            l = -n4;
                        }
                    }
                    else {
                        l = a4.H.Q1("value");
                    }
                    if (!TextUtils.isEmpty((CharSequence)n2)) {
                        final String upperCase = n2.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            if (upperCase.length() != 0) {
                                ex = (SQLiteException)"_ltv_".concat(upperCase);
                            }
                            else {
                                ex = (SQLiteException)new String("_ltv_");
                            }
                            final k c5 = this.c;
                            P(c5);
                            Object o = c5.Z(g, (String)ex);
                            ea ea = null;
                            String s6 = null;
                            Label_1159: {
                                if (o != null) {
                                    o = ((ea)o).e;
                                    if (o instanceof Long) {
                                        ea = new ea(g, a4.I, (String)ex, this.F().a(), (long)o + l);
                                        s6 = "_err";
                                        break Label_1159;
                                    }
                                }
                                final k c6 = this.c;
                                P(c6);
                                final int i = this.S().l(g, a3.F);
                                com.google.android.gms.common.internal.x.g(g);
                                c6.e();
                                c6.f();
                                try {
                                    o = c6.Q();
                                    try {
                                        ((SQLiteDatabase)o).execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", (Object[])new String[] { g, g, String.valueOf(i - 1) });
                                    }
                                    catch (SQLiteException o) {}
                                }
                                catch (SQLiteException ex5) {}
                                c6.a.c().o().c("Error pruning currencies. appId", n3.w(g), o);
                                ea = new(com.google.android.gms.measurement.internal.ea.class);
                                final String j = a4.I;
                                final long a6 = this.F().a();
                                final String s7 = "_err";
                                new ea(g, j, (String)ex, a6, l);
                                s6 = s7;
                            }
                            final k c7 = this.c;
                            P(c7);
                            s5 = s6;
                            if (!c7.w(ea)) {
                                this.c().o().d("Too many unique user properties are set. Ignoring user property. appId", n3.w(g), this.l.A().p(ea.c), ea.e);
                                this.g0().x(this.B, g, 9, null, null, 0);
                                s5 = s6;
                            }
                            break Label_1252;
                        }
                    }
                    final String s4 = "_err";
                    continue;
                }
                final boolean v = ga.V(a4.G);
                final boolean equals = s5.equals(a4.G);
                this.g0();
                final s h2 = a4.H;
                long n5;
                if (h2 == null) {
                    n5 = 0L;
                }
                else {
                    final r r = new r(h2);
                    long n6 = 0L;
                    while (true) {
                        n5 = n6;
                        if (!r.hasNext()) {
                            break;
                        }
                        final Object j2 = h2.j2(r.a());
                        if (!(j2 instanceof Parcelable[])) {
                            continue;
                        }
                        n6 += ((Parcelable[])j2).length;
                    }
                }
                final k c8 = this.c;
                P(c8);
                ex = (SQLiteException)c8.V(this.C(), g, n5 + 1L, true, v, false, equals, false);
                final long b3 = ((i)ex).b;
                this.S();
                final long n7 = b3 - a3.l.a(null);
                if (n7 > 0L) {
                    if (n7 % 1000L == 1L) {
                        this.c().o().c("Data loss. Too many events logged. appId, count", n3.w(g), ((i)ex).b);
                    }
                    final k c9 = this.c;
                    P(c9);
                    c9.l();
                    return;
                }
                if (v) {
                    final long a7 = ((i)ex).a;
                    this.S();
                    final long n8 = a7 - a3.n.a(null);
                    if (n8 > 0L) {
                        if (n8 % 1000L == 1L) {
                            this.c().o().c("Data loss. Too many public events logged. appId, count", n3.w(g), ((i)ex).a);
                        }
                        this.g0().x(this.B, g, 16, "_ev", a4.G, 0);
                        final k c10 = this.c;
                        P(c10);
                        c10.l();
                        return;
                    }
                }
                if (equals) {
                    final long n9 = ((i)ex).d - Math.max(0, Math.min(1000000, this.S().l(na.G, a3.m)));
                    if (n9 > 0L) {
                        if (n9 == 1L) {
                            this.c().o().c("Too many error events logged. appId, count", n3.w(g), ((i)ex).d);
                        }
                        final k c11 = this.c;
                        P(c11);
                        c11.l();
                        return;
                    }
                }
                final Bundle g2 = a4.H.g1();
                this.g0().y(g2, "_o", a4.I);
                if (this.g0().R(g)) {
                    final ga g3 = this.g0();
                    ex = (SQLiteException)Long.valueOf(1L);
                    g3.y(g2, "_dbg", ex);
                    this.g0().y(g2, "_r", ex);
                }
                if ("_s".equals(a4.G)) {
                    final k c12 = this.c;
                    P(c12);
                    ex = (SQLiteException)c12.Z(na.G, "_sno");
                    if (ex != null && ((ea)ex).e instanceof Long) {
                        this.g0().y(g2, "_sno", ((ea)ex).e);
                    }
                }
                final k c13 = this.c;
                P(c13);
                com.google.android.gms.common.internal.x.g(g);
                c13.e();
                c13.f();
                try {
                    ex = (SQLiteException)c13.Q();
                    final int min = Math.min(1000000, c13.a.w().l(g, a3.q));
                    try {
                        final long k = ((SQLiteDatabase)ex).delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { g, String.valueOf(Math.max(0, min)) });
                    }
                    catch (SQLiteException ex) {}
                }
                catch (SQLiteException ex6) {}
                c13.a.c().o().c("Error deleting over the limit events. appId", n3.w(g), ex);
                final long k = 0L;
                if (k > 0L) {
                    this.c().t().c("Data lost. Too many events stored on disk, deleted. appId", n3.w(g), k);
                }
                ex = (SQLiteException)new p(this.l, a4.I, g, a4.G, a4.J, 0L, g2);
                final k c14 = this.c;
                P(c14);
                final q w = c14.W(g, ((p)ex).b);
                q c16;
                if (w == null) {
                    final k c15 = this.c;
                    P(c15);
                    if (c15.P(g) >= this.S().i(g) && v) {
                        this.c().o().d("Too many event names used, ignoring event. appId, name, supported count", n3.w(g), this.l.A().n(((p)ex).b), this.S().i(g));
                        this.g0().x(this.B, g, 8, null, null, 0);
                        return;
                    }
                    c16 = new q(g, ((p)ex).b, 0L, 0L, 0L, ((p)ex).d, 0L, null, null, null, null);
                }
                else {
                    ex = (SQLiteException)((p)ex).a(this.l, w.f);
                    c16 = w.c(((p)ex).d);
                }
                final k c17 = this.c;
                P(c17);
                c17.n(c16);
                this.b().e();
                this.d();
                com.google.android.gms.common.internal.x.k(ex);
                com.google.android.gms.common.internal.x.k(na);
                com.google.android.gms.common.internal.x.g(((p)ex).a);
                com.google.android.gms.common.internal.x.a(((p)ex).a.equals(na.G));
                final d5 f1 = e5.F1();
                f1.a0(1);
                f1.V("android");
                if (!TextUtils.isEmpty((CharSequence)na.G)) {
                    f1.v(na.G);
                }
                if (!TextUtils.isEmpty((CharSequence)na.J)) {
                    f1.x(na.J);
                }
                if (!TextUtils.isEmpty((CharSequence)na.I)) {
                    f1.z(na.I);
                }
                final long p = na.P;
                if (p != -2147483648L) {
                    f1.A((int)p);
                }
                f1.R(na.K);
                if (!TextUtils.isEmpty((CharSequence)na.H)) {
                    f1.Q(na.H);
                }
                f1.E(this.T(com.google.android.gms.common.internal.x.k(na.G)).c(com.google.android.gms.measurement.internal.h.b(na.b0)).i());
                fe.b();
                Label_2625: {
                    String s8;
                    if (this.S().y(na.G, a3.f0)) {
                        if (TextUtils.isEmpty((CharSequence)f1.n0()) && !TextUtils.isEmpty((CharSequence)na.a0)) {
                            f1.P(na.a0);
                        }
                        if (!TextUtils.isEmpty((CharSequence)f1.n0()) || !TextUtils.isEmpty((CharSequence)f1.m0()) || TextUtils.isEmpty((CharSequence)na.W)) {
                            break Label_2625;
                        }
                        s8 = na.W;
                    }
                    else {
                        if (!TextUtils.isEmpty((CharSequence)f1.n0()) || TextUtils.isEmpty((CharSequence)na.W)) {
                            break Label_2625;
                        }
                        s8 = na.W;
                    }
                    f1.N0(s8);
                }
                final long m = na.L;
                if (m != 0L) {
                    f1.F(m);
                }
                f1.J(na.Y);
                final ba g4 = this.g;
                P(g4);
                final Map<String, String> c18 = a3.c(g4.b.l.X());
                Iterable<? extends Integer> iterable = null;
                Label_2902: {
                    if (c18 != null) {
                        if (c18.size() != 0) {
                            final ArrayList<Integer> list = new ArrayList<Integer>();
                            final int intValue = a3.Q.a(null);
                            for (final Map.Entry<String, String> entry : c18.entrySet()) {
                                if (entry.getKey().startsWith("measurement.id.")) {
                                    try {
                                        final int int1 = Integer.parseInt(entry.getValue());
                                        if (int1 == 0) {
                                            continue;
                                        }
                                        list.add(int1);
                                        if (list.size() < intValue) {
                                            continue;
                                        }
                                        g4.a.c().t().b("Too many experiment IDs. Number of IDs", list.size());
                                    }
                                    catch (NumberFormatException ex2) {
                                        g4.a.c().t().b("Experiment ID NumberFormatException", ex2);
                                        continue;
                                    }
                                    break;
                                }
                            }
                            iterable = list;
                            if (list.size() != 0) {
                                break Label_2902;
                            }
                        }
                    }
                    iterable = null;
                }
                if (iterable != null) {
                    f1.w0(iterable);
                }
                final h c19 = this.T(com.google.android.gms.common.internal.x.k(na.G)).c(com.google.android.gms.measurement.internal.h.b(na.b0));
                if (c19.j()) {
                    final Pair<String, Boolean> k2 = this.i.k(na.G, c19);
                    if (!TextUtils.isEmpty((CharSequence)k2.first) && na.U) {
                        f1.b0((String)k2.first);
                        final Object second = k2.second;
                        if (second != null) {
                            f1.T((boolean)second);
                        }
                    }
                }
                this.l.x().h();
                f1.H(Build.MODEL);
                this.l.x().h();
                f1.U(Build$VERSION.RELEASE);
                f1.f0((int)this.l.x().m());
                f1.j0(this.l.x().n());
                final com.google.android.gms.measurement.internal.g s9 = this.S();
                final z2<Boolean> p2 = a3.p0;
                if (!s9.y(null, p2)) {
                    f1.O0(na.R);
                }
                if (this.l.l()) {
                    f1.l0();
                    if (!TextUtils.isEmpty((CharSequence)null)) {
                        f1.I(null);
                    }
                }
                final k c20 = this.c;
                P(c20);
                h5 s10;
                if ((s10 = c20.S(na.G)) == null) {
                    s10 = new h5(this.l, na.G);
                    s10.i(this.h0(c19));
                    s10.w(na.Q);
                    s10.y(na.H);
                    if (c19.j()) {
                        s10.H(this.i.l(na.G));
                    }
                    s10.D(0L);
                    s10.E(0L);
                    s10.C(0L);
                    s10.k(na.I);
                    s10.l(na.P);
                    s10.j(na.J);
                    s10.z(na.K);
                    s10.t(na.L);
                    s10.F(na.N);
                    if (!this.S().y(null, p2)) {
                        s10.h(na.R);
                    }
                    s10.u(na.Y);
                    final k c21 = this.c;
                    P(c21);
                    c21.m(s10);
                }
                if (c19.k() && !TextUtils.isEmpty((CharSequence)s10.f0())) {
                    f1.w(com.google.android.gms.common.internal.x.k(s10.f0()));
                }
                if (!TextUtils.isEmpty((CharSequence)s10.i0())) {
                    f1.O(com.google.android.gms.common.internal.x.k(s10.i0()));
                }
                final k c22 = this.c;
                P(c22);
                final List<ea> e0 = c22.e0(na.G);
                for (int n10 = 0; n10 < e0.size(); ++n10) {
                    final n5 z = o5.z();
                    z.B(e0.get(n10).c);
                    z.C(e0.get(n10).d);
                    final ba g5 = this.g;
                    P(g5);
                    g5.K(z, e0.get(n10).e);
                    f1.z0(z);
                }
                Label_4129: {
                    try {
                        na = (na)this.c;
                        P((p9)na);
                        Object o2 = ((f9<e5, BuilderType>)f1).n();
                        ((t5)na).e();
                        ((p9)na).f();
                        com.google.android.gms.common.internal.x.k(o2);
                        com.google.android.gms.common.internal.x.g(((e5)o2).J1());
                        final byte[] i2 = ((q7)o2).i();
                        final ba g6 = ((o9)na).b.g;
                        P(g6);
                        final long v2 = g6.v(i2);
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", ((e5)o2).J1());
                        contentValues.put("metadata_fingerprint", Long.valueOf(v2));
                        contentValues.put("metadata", i2);
                        try {
                            ((k)na).Q().insertWithOnConflict("raw_events_metadata", (String)null, contentValues, 4);
                            na = (na)this.c;
                            P((p9)na);
                            o2 = ((p)ex).f;
                            final r r2 = new r((s)o2);
                            while (true) {
                                while (true) {
                                    while (r2.hasNext()) {
                                        if ("_r".equals(r2.a())) {
                                            final int i3 = 1;
                                            ((t5)na).e();
                                            ((p9)na).f();
                                            com.google.android.gms.common.internal.x.k(ex);
                                            com.google.android.gms.common.internal.x.g(((p)ex).a);
                                            o2 = ((o9)na).b.g;
                                            P((p9)o2);
                                            final byte[] i4 = ((ba)o2).z((p)ex).i();
                                            o2 = new ContentValues();
                                            ((ContentValues)o2).put("app_id", ((p)ex).a);
                                            ((ContentValues)o2).put("name", ((p)ex).b);
                                            ((ContentValues)o2).put("timestamp", Long.valueOf(((p)ex).d));
                                            ((ContentValues)o2).put("metadata_fingerprint", Long.valueOf(v2));
                                            ((ContentValues)o2).put("data", i4);
                                            ((ContentValues)o2).put("realtime", Integer.valueOf(i3));
                                            try {
                                                if (((k)na).Q().insert("raw_events", (String)null, (ContentValues)o2) == -1L) {
                                                    ((t5)na).a.c().o().b("Failed to insert raw event (got -1). appId", n3.w(((p)ex).a));
                                                }
                                                else {
                                                    this.o = 0L;
                                                }
                                            }
                                            catch (SQLiteException o2) {
                                                ((t5)na).a.c().o().c("Error storing raw event. appId", n3.w(((p)ex).a), o2);
                                            }
                                            break Label_4129;
                                        }
                                    }
                                    o2 = this.a;
                                    P((p9)o2);
                                    final boolean t = ((q4)o2).t(((p)ex).a, ((p)ex).b);
                                    o2 = this.c;
                                    P((p9)o2);
                                    o2 = ((k)o2).U(this.C(), ((p)ex).a, false, false, false, false, false);
                                    if (t && ((i)o2).e < this.S().l(((p)ex).a, a3.p)) {
                                        continue;
                                    }
                                    break;
                                }
                                final int i3 = 0;
                                continue;
                            }
                        }
                        catch (SQLiteException ex3) {
                            ((t5)na).a.c().o().c("Error storing raw event metadata. appId", n3.w(((e5)o2).J1()), ex3);
                            throw ex3;
                        }
                    }
                    catch (IOException ex4) {
                        this.c().o().c("Data loss. Failed to insert raw event metadata. appId", n3.w(f1.l0()), ex4);
                    }
                }
                final k c23 = this.c;
                P(c23);
                c23.l();
                final k c24 = this.c;
                P(c24);
                c24.h0();
                this.J();
                this.c().s().b("Background event processing time, ms", (System.nanoTime() - nanoTime + 500000L) / 1000000L);
                return;
            }
            finally {
                final k c25 = this.c;
                P(c25);
                c25.h0();
            }
        }
        this.Q(na);
    }
    
    @c1
    @d0
    final boolean z() {
        this.b().e();
        if (this.S().y(null, a3.e0)) {
            final FileLock v = this.v;
            if (v != null) {
                if (v.isValid()) {
                    this.c().s().a("Storage concurrent access okay");
                    return true;
                }
            }
        }
        this.c.a.w();
        final File file = new File(this.l.X().getFilesDir(), "google_app_measurement.db");
        l3 l3;
        String s;
        try {
            final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            this.w = channel;
            final FileLock tryLock = channel.tryLock();
            this.v = tryLock;
            if (tryLock != null) {
                this.c().s().a("Storage concurrent access okay");
                return true;
            }
            this.c().o().a("Storage concurrent data access panic");
            return false;
        }
        catch (OverlappingFileLockException ex) {
            l3 = this.c().t();
            s = "Storage lock already acquired";
        }
        catch (IOException ex) {
            l3 = this.c().o();
            s = "Failed to access storage lock file";
        }
        catch (FileNotFoundException ex) {
            l3 = this.c().o();
            s = "Failed to acquire storage lock";
        }
        final OverlappingFileLockException ex;
        l3.b(s, ex);
        return false;
    }
}
