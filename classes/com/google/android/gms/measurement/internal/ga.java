// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.net.Uri;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import com.google.android.gms.common.h;
import java.net.MalformedURLException;
import java.net.URL;
import android.os.Parcel;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.io.Serializable;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.fe;
import java.util.Collection;
import java.util.TreeSet;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.i1;
import androidx.annotation.c1;
import java.util.Iterator;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import android.os.Parcelable;
import com.google.android.gms.common.util.d0;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.internal.x;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicLong;
import java.security.SecureRandom;
import java.util.regex.Pattern;

public final class ga extends u5
{
    private static final String[] g;
    private static final String[] h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    private static final Pattern n;
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private Integer f;
    
    static {
        g = new String[] { "firebase_", "google_", "ga_" };
        h = new String[] { "_err" };
        i = Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");
        j = Pattern.compile("^(gmail|googlemail)\\.");
        k = Pattern.compile("[\\s-()/.]+");
        l = Pattern.compile("^\\+\\d{11,15}$");
        m = Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");
        n = Pattern.compile("\\s+");
    }
    
    ga(final z4 z4) {
        super(z4);
        this.f = null;
        this.d = new AtomicLong(0L);
    }
    
    static boolean U(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("_");
    }
    
    static boolean V(final String s) {
        x.g(s);
        return s.charAt(0) != '_' || s.equals("_ep");
    }
    
    static boolean W(final Context context) {
        x.k(context);
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    static boolean Y(final Context context, final boolean b) {
        x.k(context);
        String s;
        if (Build$VERSION.SDK_INT >= 24) {
            s = "com.google.android.gms.measurement.AppMeasurementJobService";
        }
        else {
            s = "com.google.android.gms.measurement.AppMeasurementService";
        }
        return i0(context, s);
    }
    
    static boolean Z(final String s, final String anObject) {
        return (s == null && anObject == null) || (s != null && s.equals(anObject));
    }
    
    public static boolean a0(final String anObject) {
        return !ga.h[0].equals(anObject);
    }
    
    static final boolean d0(final Bundle bundle, final int n) {
        if (bundle.getLong("_err") == 0L) {
            bundle.putLong("_err", (long)n);
            return true;
        }
        return false;
    }
    
    @d0
    static final boolean e0(final String s) {
        x.k(s);
        return s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }
    
    private final int f0(final String anObject) {
        if ("_ldl".equals(anObject)) {
            super.a.w();
            return 2048;
        }
        if ("_id".equals(anObject)) {
            super.a.w();
            return 256;
        }
        if (super.a.w().y(null, a3.d0) && "_lgclid".equals(anObject)) {
            super.a.w();
            return 100;
        }
        super.a.w();
        return 36;
    }
    
    private final Object g0(int i, final Object obj, final boolean b, final boolean b2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long || obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return obj;
        }
        if (obj instanceof Byte) {
            return obj;
        }
        if (obj instanceof Short) {
            return obj;
        }
        if (obj instanceof Boolean) {
            long l;
            if (!(boolean)obj) {
                l = 0L;
            }
            else {
                l = 1L;
            }
            return l;
        }
        if (obj instanceof Float) {
            return obj;
        }
        if (obj instanceof String || obj instanceof Character || obj instanceof CharSequence) {
            return this.n(String.valueOf(obj), i, b);
        }
        if (b2 && (obj instanceof Bundle[] || obj instanceof Parcelable[])) {
            final ArrayList<Bundle> list = new ArrayList<Bundle>();
            final Parcelable[] array = (Parcelable[])obj;
            int length;
            Parcelable parcelable;
            Bundle u0;
            for (length = array.length, i = 0; i < length; ++i) {
                parcelable = array[i];
                if (parcelable instanceof Bundle) {
                    u0 = this.u0((Bundle)parcelable);
                    if (!u0.isEmpty()) {
                        list.add(u0);
                    }
                }
            }
            return list.toArray(new Bundle[list.size()]);
        }
        return null;
    }
    
    private static boolean h0(final String s, final String[] array) {
        x.k(array);
        for (int length = array.length, i = 0; i < length; ++i) {
            if (Z(s, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean i0(final Context context, final String s) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, s), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    static MessageDigest p(final String s) {
        int n = 0;
    Label_0023_Outer:
        while (true) {
            Label_0029: {
                if (n >= 2) {
                    break Label_0029;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        if (instance == null) {
                            ++n;
                            continue Label_0023_Outer;
                        }
                        return instance;
                        return null;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @d0
    static long q0(final byte[] array) {
        x.k(array);
        int length = array.length;
        int n = 0;
        x.q(length > 0);
        --length;
        long n2 = 0L;
        while (length >= 0 && length >= array.length - 8) {
            n2 += ((long)array[length] & 0xFFL) << n;
            n += 8;
            --length;
        }
        return n2;
    }
    
    public static ArrayList<Bundle> r(final List<c> list) {
        if (list == null) {
            return new ArrayList<Bundle>(0);
        }
        final ArrayList<Bundle> list2 = new ArrayList<Bundle>(list.size());
        for (final c c : list) {
            final Bundle e = new Bundle();
            e.putString("app_id", c.G);
            e.putString("origin", c.H);
            e.putLong("creation_timestamp", c.J);
            e.putString("name", c.I.H);
            w5.b(e, c.I.M());
            e.putBoolean("active", c.K);
            final String l = c.L;
            if (l != null) {
                e.putString("trigger_event_name", l);
            }
            final u m = c.M;
            if (m != null) {
                e.putString("timed_out_event_name", m.G);
                final s h = c.M.H;
                if (h != null) {
                    e.putBundle("timed_out_event_params", h.g1());
                }
            }
            e.putLong("trigger_timeout", c.N);
            final u o = c.O;
            if (o != null) {
                e.putString("triggered_event_name", o.G);
                final s h2 = c.O.H;
                if (h2 != null) {
                    e.putBundle("triggered_event_params", h2.g1());
                }
            }
            e.putLong("triggered_timestamp", c.I.I);
            e.putLong("time_to_live", c.P);
            final u q = c.Q;
            if (q != null) {
                e.putString("expired_event_name", q.G);
                final s h3 = c.Q.H;
                if (h3 != null) {
                    e.putBundle("expired_event_params", h3.g1());
                }
            }
            list2.add(e);
        }
        return list2;
    }
    
    @c1
    public static void u(final m7 m7, final Bundle bundle, final boolean b) {
        boolean b2 = b;
        if (bundle != null) {
            b2 = b;
            if (m7 != null) {
                if (!bundle.containsKey("_sc") || b) {
                    final String a = m7.a;
                    if (a != null) {
                        bundle.putString("_sn", a);
                    }
                    else {
                        bundle.remove("_sn");
                    }
                    final String b3 = m7.b;
                    if (b3 != null) {
                        bundle.putString("_sc", b3);
                    }
                    else {
                        bundle.remove("_sc");
                    }
                    bundle.putLong("_si", m7.c);
                    return;
                }
                b2 = false;
            }
        }
        if (bundle != null && m7 == null && b2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }
    
    public final void A(final i1 i1, final ArrayList<Bundle> list) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", (ArrayList)list);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning bundle list to wrapper", ex);
        }
    }
    
    public final void B(final i1 i1, final Bundle bundle) {
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning bundle value to wrapper", ex);
        }
    }
    
    public final void C(final i1 i1, final byte[] array) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("r", array);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning byte array to wrapper", ex);
        }
    }
    
    public final void D(final i1 i1, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("r", n);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning int value to wrapper", ex);
        }
    }
    
    public final void E(final i1 i1, final long n) {
        final Bundle bundle = new Bundle();
        bundle.putLong("r", n);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning long value to wrapper", ex);
        }
    }
    
    public final void G(final i1 i1, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("r", s);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning string value to wrapper", ex);
        }
    }
    
    final void H(final String s, final String s2, final String s3, final Bundle bundle, final List<String> list, final boolean b) {
        if (bundle == null) {
            return;
        }
        super.a.w();
        final Iterator<String> iterator = (Iterator<String>)new TreeSet<Object>(bundle.keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String anObject = iterator.next();
            int l0;
            if (list != null && list.contains(anObject)) {
                l0 = 0;
            }
            else {
                int m0;
                if (!b) {
                    m0 = this.m0(anObject);
                }
                else {
                    m0 = 0;
                }
                l0 = m0;
                if (m0 == 0) {
                    l0 = this.l0(anObject);
                }
            }
            if (l0 != 0) {
                String s4;
                if (l0 == 3) {
                    s4 = anObject;
                }
                else {
                    s4 = null;
                }
                this.t(bundle, l0, anObject, anObject, s4);
                bundle.remove(anObject);
            }
            else {
                int n2;
                if (this.S(bundle.get(anObject))) {
                    super.a.c().u().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s2, s3, anObject);
                    n2 = 22;
                }
                else {
                    n2 = this.N(s, s2, anObject, bundle.get(anObject), bundle, list, b, false);
                }
                if (n2 != 0 && !"_ev".equals(anObject)) {
                    this.t(bundle, n2, anObject, anObject, bundle.get(anObject));
                }
                else {
                    if (!V(anObject) || h0(anObject, y5.d)) {
                        continue;
                    }
                    final int n3 = n + 1;
                    if ((n = n3) <= 0) {
                        continue;
                    }
                    super.a.c().p().c("Item cannot contain custom parameters", super.a.A().n(s2), super.a.A().m(bundle));
                    d0(bundle, 23);
                    n = n3;
                }
                bundle.remove(anObject);
            }
        }
    }
    
    final boolean I(final String s, final String s2, final String s3) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            if (!e0(s)) {
                if (super.a.n()) {
                    super.a.c().p().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", n3.w(s));
                }
                return false;
            }
        }
        else {
            fe.b();
            if (!super.a.w().y(null, a3.f0) || TextUtils.isEmpty((CharSequence)s3)) {
                if (TextUtils.isEmpty((CharSequence)s2)) {
                    if (super.a.n()) {
                        super.a.c().p().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                    }
                    return false;
                }
                if (!e0(s2)) {
                    super.a.c().p().b("Invalid admob_app_id. Analytics disabled.", n3.w(s2));
                    return false;
                }
            }
        }
        return true;
    }
    
    final boolean J(final String s, final int i, final String s2) {
        if (s2 == null) {
            super.a.c().p().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.codePointCount(0, s2.length()) > i) {
            super.a.c().p().d("Name is too long. Type, maximum supported length, name", s, i, s2);
            return false;
        }
        return true;
    }
    
    final boolean K(final String s, final String[] array, final String[] array2, final String s2) {
        if (s2 == null) {
            super.a.c().p().b("Name is required and can't be null. Type", s);
            return false;
        }
        x.k(s2);
        final String[] g = ga.g;
        for (int i = 0; i < 3; ++i) {
            if (s2.startsWith(g[i])) {
                super.a.c().p().c("Name starts with reserved prefix. Type, name", s, s2);
                return false;
            }
        }
        if (array != null && h0(s2, array) && (array2 == null || !h0(s2, array2))) {
            super.a.c().p().c("Name is reserved. Type, name", s, s2);
            return false;
        }
        return true;
    }
    
    final boolean M(final String s, final String s2, final int n, final Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean)) {
            if (!(obj instanceof Double)) {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    return false;
                }
                final String value = String.valueOf(obj);
                if (value.codePointCount(0, value.length()) > n) {
                    super.a.c().u().d("Value is too long; discarded. Value kind, name, value length", s, s2, value.length());
                    return false;
                }
            }
        }
        return true;
    }
    
    @c1
    final int N(String class1, final String s, final String s2, final Object o, final Bundle bundle, final List<String> list, final boolean b, final boolean b2) {
        this.e();
        int n = 0;
        Label_0273: {
            Label_0270: {
                if (this.S(o)) {
                    if (!b2) {
                        return 21;
                    }
                    if (!h0(s2, y5.c)) {
                        return 20;
                    }
                    final u8 j = super.a.J();
                    j.e();
                    j.f();
                    if (j.y()) {
                        if (j.a.M().o0() < 200900) {
                            return 25;
                        }
                    }
                    super.a.w();
                    final boolean b3 = o instanceof Parcelable[];
                    int i;
                    if (b3) {
                        i = ((Parcelable[])o).length;
                    }
                    else {
                        if (!(o instanceof ArrayList)) {
                            break Label_0270;
                        }
                        i = ((ArrayList)o).size();
                    }
                    if (i > 200) {
                        super.a.c().u().d("Parameter array is too long; discarded. Value kind, name, array length", "param", s2, i);
                        super.a.w();
                        if (b3) {
                            final Parcelable[] original = (Parcelable[])o;
                            if (original.length > 200) {
                                bundle.putParcelableArray(s2, (Parcelable[])Arrays.copyOf(original, 200));
                            }
                        }
                        else if (o instanceof ArrayList) {
                            final ArrayList list2 = (ArrayList)o;
                            if (list2.size() > 200) {
                                bundle.putParcelableArrayList(s2, new ArrayList(list2.subList(0, 200)));
                            }
                        }
                        n = 17;
                        break Label_0273;
                    }
                }
            }
            n = 0;
        }
        int n2;
        if ((super.a.w().y(class1, a3.T) && U(s)) || U(s2)) {
            super.a.w();
            n2 = 256;
        }
        else {
            super.a.w();
            n2 = 100;
        }
        if (this.M("param", s2, n2, o)) {
            return n;
        }
        if (b2) {
            if (!(o instanceof Bundle)) {
                l3 l3 = null;
                Serializable class2 = null;
                Label_0449: {
                    if (o instanceof Parcelable[]) {
                        for (final Parcelable parcelable : (Parcelable[])o) {
                            if (!(parcelable instanceof Bundle)) {
                                l3 = super.a.c().u();
                                class2 = parcelable.getClass();
                                class1 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                                break Label_0449;
                            }
                            this.H(class1, s, s2, (Bundle)parcelable, list, b);
                        }
                        return n;
                    }
                    if (o instanceof ArrayList) {
                        final ArrayList list3 = (ArrayList)o;
                        for (int size = list3.size(), n3 = 0; n3 < size; ++n3) {
                            final Object value = list3.get(n3);
                            if (!(value instanceof Bundle)) {
                                l3 = super.a.c().u();
                                if (value != null) {
                                    class1 = (String)((Bundle)value).getClass();
                                }
                                else {
                                    class1 = "null";
                                }
                                final String s3 = "All ArrayList elements must be of type Bundle. Value type, name";
                                class2 = class1;
                                class1 = s3;
                                break Label_0449;
                            }
                            this.H(class1, s, s2, (Bundle)value, list, b);
                        }
                        return n;
                    }
                    return 4;
                }
                l3.c(class1, class2, s2);
                return 4;
            }
            this.H(class1, s, s2, (Bundle)o, list, b);
            return n;
        }
        return 4;
    }
    
    final boolean O(final String s, final String s2) {
        if (s2 == null) {
            super.a.c().p().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.length() == 0) {
            super.a.c().p().b("Name is required and can't be empty. Type", s);
            return false;
        }
        int codePoint2;
        final int codePoint = codePoint2 = s2.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            if (codePoint != 95) {
                super.a.c().p().c("Name must start with a letter or _ (underscore). Type, name", s, s2);
                return false;
            }
            codePoint2 = 95;
        }
        int codePoint3;
        for (int length = s2.length(), i = Character.charCount(codePoint2); i < length; i += Character.charCount(codePoint3)) {
            codePoint3 = s2.codePointAt(i);
            if (codePoint3 != 95 && !Character.isLetterOrDigit(codePoint3)) {
                super.a.c().p().c("Name must consist of letters, digits or _ (underscores). Type, name", s, s2);
                return false;
            }
        }
        return true;
    }
    
    final boolean P(final String s, final String s2) {
        if (s2 == null) {
            super.a.c().p().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.length() == 0) {
            super.a.c().p().b("Name is required and can't be empty. Type", s);
            return false;
        }
        final int codePoint = s2.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            super.a.c().p().c("Name must start with a letter. Type, name", s, s2);
            return false;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                super.a.c().p().c("Name must consist of letters, digits or _ (underscores). Type, name", s, s2);
                return false;
            }
        }
        return true;
    }
    
    @c1
    final boolean Q(final String s) {
        this.e();
        if (com.google.android.gms.common.wrappers.c.a(super.a.X()).a(s) == 0) {
            return true;
        }
        super.a.c().n().b("Permission not granted", s);
        return false;
    }
    
    final boolean R(final String anObject) {
        if (TextUtils.isEmpty((CharSequence)anObject)) {
            return false;
        }
        final String r = super.a.w().r();
        super.a.L();
        return r.equals(anObject);
    }
    
    final boolean S(final Object o) {
        return o instanceof Parcelable[] || o instanceof ArrayList || o instanceof Bundle;
    }
    
    @d0
    final boolean T(final Context context, String s) {
        final X500Principal o = new X500Principal("CN=Android Debug,O=Android,C=US");
        l3 l3;
        try {
            final PackageInfo e = com.google.android.gms.common.wrappers.c.a(context).e(s, 64);
            if (e == null) {
                return true;
            }
            final Signature[] signatures = e.signatures;
            if (signatures != null && signatures.length > 0) {
                return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()))).getSubjectX500Principal().equals(o);
            }
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            l3 = super.a.c().o();
            s = "Package name not found";
        }
        catch (CertificateException ex) {
            l3 = super.a.c().o();
            s = "Error obtaining certificate";
        }
        final PackageManager$NameNotFoundException ex;
        l3.b(s, ex);
        return true;
    }
    
    final boolean b0(final String s, final String anObject, final String s2, final String anObject2) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final boolean empty2 = TextUtils.isEmpty((CharSequence)anObject);
        if (!empty && !empty2) {
            x.k(s);
            return !s.equals(anObject);
        }
        if (empty && empty2) {
            if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)anObject2)) {
                return !s2.equals(anObject2);
            }
            return !TextUtils.isEmpty((CharSequence)anObject2);
        }
        else {
            if (!empty) {
                return !TextUtils.isEmpty((CharSequence)anObject2) && (TextUtils.isEmpty((CharSequence)s2) || !s2.equals(anObject2));
            }
            return TextUtils.isEmpty((CharSequence)s2) || !s2.equals(anObject2);
        }
    }
    
    final byte[] c0(final Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        }
        finally {
            obtain.recycle();
        }
    }
    
    @c1
    @Override
    protected final void f() {
        this.e();
        final SecureRandom secureRandom = new SecureRandom();
        long newValue;
        if ((newValue = secureRandom.nextLong()) == 0L) {
            final long n = newValue = secureRandom.nextLong();
            if (n == 0L) {
                super.a.c().t().a("Utils falling back to Random for random id");
                newValue = n;
            }
        }
        this.d.set(newValue);
    }
    
    @Override
    protected final boolean g() {
        return true;
    }
    
    final int j0(final String anObject, final Object o) {
        int n;
        String s;
        if ("_ldl".equals(anObject)) {
            n = this.f0(anObject);
            s = "user property referrer";
        }
        else {
            n = this.f0(anObject);
            s = "user property";
        }
        if (this.M(s, anObject, n, o)) {
            return 0;
        }
        return 7;
    }
    
    final int k0(final String s) {
        if (!this.O("event", s)) {
            return 2;
        }
        if (!this.K("event", x5.a, x5.b, s)) {
            return 13;
        }
        super.a.w();
        if (!this.J("event", 40, s)) {
            return 2;
        }
        return 0;
    }
    
    final Object l(final String anObject, final Object o) {
        final boolean equals = "_ev".equals(anObject);
        int n = 256;
        if (equals) {
            super.a.w();
            return this.g0(256, o, true, true);
        }
        if (U(anObject)) {
            super.a.w();
        }
        else {
            super.a.w();
            n = 100;
        }
        return this.g0(n, o, false, true);
    }
    
    final int l0(final String s) {
        if (!this.O("event param", s)) {
            return 3;
        }
        if (!this.K("event param", null, null, s)) {
            return 14;
        }
        super.a.w();
        if (!this.J("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    final Object m(final String anObject, final Object o) {
        final boolean equals = "_ldl".equals(anObject);
        final int f0 = this.f0(anObject);
        if (equals) {
            return this.g0(f0, o, true, false);
        }
        return this.g0(f0, o, false, false);
    }
    
    final int m0(final String s) {
        if (!this.P("event param", s)) {
            return 3;
        }
        if (!this.K("event param", null, null, s)) {
            return 14;
        }
        super.a.w();
        if (!this.J("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    public final String n(final String s, final int codePointOffset, final boolean b) {
        if (s == null) {
            return null;
        }
        if (s.codePointCount(0, s.length()) <= codePointOffset) {
            return s;
        }
        if (b) {
            return String.valueOf(s.substring(0, s.offsetByCodePoints(0, codePointOffset))).concat("...");
        }
        return null;
    }
    
    final int n0(final String s) {
        if (!this.O("user property", s)) {
            return 6;
        }
        if (!this.K("user property", z5.a, null, s)) {
            return 15;
        }
        super.a.w();
        if (!this.J("user property", 24, s)) {
            return 6;
        }
        return 0;
    }
    
    public final URL o(final long n, String ex, String spec, final long l) {
        try {
            x.g(spec);
            x.g((String)ex);
            final String s = spec = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 42097L, this.o0()), spec, ex, l);
            if (((String)ex).equals(super.a.w().s())) {
                spec = s.concat("&ddl_test=1");
            }
            ex = (IllegalArgumentException)new URL(spec);
            return (URL)ex;
        }
        catch (IllegalArgumentException ex) {}
        catch (MalformedURLException ex2) {}
        super.a.c().o().b("Failed to create BOW URL for Deferred Deep Link. exception", ex.getMessage());
        return null;
    }
    
    @EnsuresNonNull({ "this.apkVersion" })
    public final int o0() {
        if (this.f == null) {
            this.f = com.google.android.gms.common.h.i().b(super.a.X()) / 1000;
        }
        return this.f;
    }
    
    public final int p0(final int n) {
        return com.google.android.gms.common.h.i().k(super.a.X(), 12451000);
    }
    
    @EnsuresNonNull({ "this.secureRandom" })
    @c1
    final SecureRandom q() {
        this.e();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }
    
    public final long r0() {
        final long value = this.d.get();
        final AtomicLong d = this.d;
        // monitorenter(d)
        if (value == 0L) {
            try {
                final long nextLong = new Random(System.nanoTime() ^ super.a.F().a()).nextLong();
                final int e = this.e + 1;
                this.e = e;
                final long n = e;
                // monitorexit(d)
                return nextLong + n;
            }
            finally {
            }
            // monitorexit(d)
        }
        try {
            this.d.compareAndSet(-1L, 1L);
            return this.d.getAndIncrement();
        }
        finally {
        }
        // monitorexit(d)
    }
    
    @c1
    final void s(final Bundle bundle, final long n) {
        final long long1 = bundle.getLong("_et");
        if (long1 != 0L) {
            super.a.c().t().b("Params already contained engagement", long1);
        }
        bundle.putLong("_et", n + long1);
    }
    
    public final long s0(final long n, final long n2) {
        return (n + n2 * 60000L) / 86400000L;
    }
    
    final void t(final Bundle bundle, final int n, final String s, final String s2, final Object obj) {
        if (d0(bundle, n)) {
            super.a.w();
            bundle.putString("_ev", this.n(s, 40, true));
            if (obj != null) {
                x.k(bundle);
                if (obj instanceof String || obj instanceof CharSequence) {
                    bundle.putLong("_el", (long)String.valueOf(obj).length());
                }
            }
        }
    }
    
    final Bundle t0(final Uri uri) {
        if (uri != null) {
            try {
                String queryParameter;
                String queryParameter2;
                String queryParameter3;
                String queryParameter4;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                }
                else {
                    final String s = queryParameter2 = null;
                    queryParameter4 = (queryParameter3 = queryParameter2);
                    queryParameter = s;
                }
                if (TextUtils.isEmpty((CharSequence)queryParameter) && TextUtils.isEmpty((CharSequence)queryParameter2) && TextUtils.isEmpty((CharSequence)queryParameter3) && TextUtils.isEmpty((CharSequence)queryParameter4)) {
                    return null;
                }
                final Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                final String queryParameter5 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty((CharSequence)queryParameter5)) {
                    bundle.putString("term", queryParameter5);
                }
                final String queryParameter6 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty((CharSequence)queryParameter6)) {
                    bundle.putString("content", queryParameter6);
                }
                final String queryParameter7 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter7)) {
                    bundle.putString("aclid", queryParameter7);
                }
                final String queryParameter8 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty((CharSequence)queryParameter8)) {
                    bundle.putString("cp1", queryParameter8);
                }
                final String queryParameter9 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter9)) {
                    bundle.putString("anid", queryParameter9);
                }
                return bundle;
            }
            catch (UnsupportedOperationException ex) {
                super.a.c().t().b("Install referrer url isn't a hierarchical URI", ex);
            }
        }
        return null;
    }
    
    final Bundle u0(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (final String s : bundle.keySet()) {
                final Object l = this.l(s, bundle.get(s));
                if (l == null) {
                    super.a.c().u().b("Param value can't be null", super.a.A().o(s));
                }
                else {
                    this.y(bundle2, s, l);
                }
            }
        }
        return bundle2;
    }
    
    final void v(final Bundle bundle, final Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (final String s : bundle2.keySet()) {
            if (!bundle.containsKey(s)) {
                super.a.M().y(bundle, s, bundle2.get(s));
            }
        }
    }
    
    final Bundle v0(final String s, final String s2, final Bundle bundle, final List<String> list, final boolean b) {
        final boolean h0 = h0(s2, x5.d);
        Bundle bundle3;
        if (bundle != null) {
            final Bundle bundle2 = new Bundle(bundle);
            final int j = super.a.w().j();
            final Iterator<String> iterator = (Iterator<String>)new TreeSet<Object>(bundle.keySet()).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final String s3 = iterator.next();
                int l0;
                if (list != null && list.contains(s3)) {
                    l0 = 0;
                }
                else {
                    int m0;
                    if (!b) {
                        m0 = this.m0(s3);
                    }
                    else {
                        m0 = 0;
                    }
                    l0 = m0;
                    if (m0 == 0) {
                        l0 = this.l0(s3);
                    }
                }
                int n2 = 0;
                Label_0435: {
                    if (l0 != 0) {
                        String s4;
                        if (l0 == 3) {
                            s4 = s3;
                        }
                        else {
                            s4 = null;
                        }
                        this.t(bundle2, l0, s3, s3, s4);
                        bundle2.remove(s3);
                        n2 = n;
                    }
                    else {
                        final Object value = bundle.get(s3);
                        final int i = j;
                        final int n3 = this.N(s, s2, s3, value, bundle2, list, b, h0);
                        if (n3 == 17) {
                            this.t(bundle2, 17, s3, s3, Boolean.FALSE);
                        }
                        else if (n3 != 0) {
                            final String anObject = s3;
                            if (!"_ev".equals(anObject)) {
                                String s5;
                                if (n3 == 21) {
                                    s5 = s2;
                                }
                                else {
                                    s5 = anObject;
                                }
                                this.t(bundle2, n3, s5, anObject, bundle.get(anObject));
                                bundle2.remove(anObject);
                                n2 = n;
                                break Label_0435;
                            }
                        }
                        n2 = n;
                        if (V(s3)) {
                            n2 = n + 1;
                            if (n2 > i) {
                                final StringBuilder sb = new StringBuilder(48);
                                sb.append("Event can't contain more than ");
                                sb.append(i);
                                sb.append(" params");
                                super.a.c().p().c(sb.toString(), super.a.A().n(s2), super.a.A().m(bundle));
                                d0(bundle2, 5);
                                bundle2.remove(s3);
                            }
                        }
                    }
                }
                n = n2;
            }
            bundle3 = bundle2;
        }
        else {
            bundle3 = null;
        }
        return bundle3;
    }
    
    final void w(final o3 o3, final int i) {
        final Iterator<String> iterator = new TreeSet<String>(o3.d.keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (V(s)) {
                final int n2 = n + 1;
                if ((n = n2) <= i) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                super.a.c().p().c(sb.toString(), super.a.A().n(o3.a), super.a.A().m(o3.d));
                d0(o3.d, 5);
                o3.d.remove(s);
                n = n2;
            }
        }
    }
    
    final u w0(final String s, final String s2, Bundle bundle, final String s3, final long n, final boolean b, final boolean b2) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        if (this.k0(s2) == 0) {
            Bundle bundle2;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", s3);
            Bundle bundle3;
            bundle = (bundle3 = this.v0(s, s2, bundle2, com.google.android.gms.common.util.h.c("_o"), true));
            if (b) {
                bundle3 = this.u0(bundle);
            }
            x.k(bundle3);
            return new u(s2, new s(bundle3), s3, n);
        }
        super.a.c().o().b("Invalid conditional property event name", super.a.A().p(s2));
        throw new IllegalArgumentException();
    }
    
    final void x(final fa fa, final String s, final int n, final String s2, final String s3, final int n2) {
        final Bundle bundle = new Bundle();
        d0(bundle, n);
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3)) {
            bundle.putString(s2, s3);
        }
        if (n == 6 || n == 7 || n == 2) {
            bundle.putLong("_el", (long)n2);
        }
        fa.a(s, "_err", bundle);
    }
    
    final void y(final Bundle bundle, final String s, final Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(s, (long)obj);
            return;
        }
        if (obj instanceof String) {
            bundle.putString(s, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(s, (double)obj);
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(s, (Parcelable[])obj);
            return;
        }
        if (s != null) {
            String simpleName;
            if (obj != null) {
                simpleName = obj.getClass().getSimpleName();
            }
            else {
                simpleName = null;
            }
            super.a.c().u().c("Not putting event parameter. Invalid value type. name, type", super.a.A().o(s), simpleName);
        }
    }
    
    public final void z(final i1 i1, final boolean b) {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("r", b);
        try {
            i1.G(bundle);
        }
        catch (RemoteException ex) {
            super.a.c().t().b("Error returning boolean value to wrapper", ex);
        }
    }
}
