// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin;

import java.util.Arrays;
import com.google.android.gms.common.internal.x;
import java.util.Set;
import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.internal.b;
import java.util.Iterator;
import java.util.Collections;
import androidx.annotation.RecentlyNullable;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import androidx.annotation.k0;
import android.accounts.Account;
import java.util.ArrayList;
import java.util.Comparator;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.api.Scope;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@h2.d.a(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends h2.a implements com.google.android.gms.common.api.a.d.f, ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<GoogleSignInOptions> CREATOR;
    @RecentlyNonNull
    @d0
    public static final Scope R;
    @RecentlyNonNull
    @d0
    public static final Scope S;
    @RecentlyNonNull
    @d0
    public static final Scope T;
    @RecentlyNonNull
    @d0
    public static final Scope U;
    @RecentlyNonNull
    @d0
    public static final Scope V;
    @RecentlyNonNull
    public static final GoogleSignInOptions W;
    @RecentlyNonNull
    public static final GoogleSignInOptions X;
    private static Comparator<Scope> Y;
    @d.g(id = 1)
    private final int G;
    @d.c(getter = "getScopes", id = 2)
    private final ArrayList<Scope> H;
    @k0
    @d.c(getter = "getAccount", id = 3)
    private Account I;
    @d.c(getter = "isIdTokenRequested", id = 4)
    private boolean J;
    @d.c(getter = "isServerAuthCodeRequested", id = 5)
    private final boolean K;
    @d.c(getter = "isForceCodeForRefreshToken", id = 6)
    private final boolean L;
    @k0
    @d.c(getter = "getServerClientId", id = 7)
    private String M;
    @k0
    @d.c(getter = "getHostedDomain", id = 8)
    private String N;
    @d.c(getter = "getExtensions", id = 9)
    private ArrayList<com.google.android.gms.auth.api.signin.internal.a> O;
    @k0
    @d.c(getter = "getLogSessionId", id = 10)
    private String P;
    private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> Q;
    
    static {
        R = new Scope("profile");
        S = new Scope("email");
        T = new Scope("openid");
        final Scope scope = U = new Scope("https://www.googleapis.com/auth/games_lite");
        V = new Scope("https://www.googleapis.com/auth/games");
        W = new a().d().f().b();
        X = new a().g(scope, new Scope[0]).b();
        CREATOR = (Parcelable$Creator)new e();
        GoogleSignInOptions.Y = new d();
    }
    
    @d.b
    GoogleSignInOptions(@d.e(id = 1) final int n, @d.e(id = 2) final ArrayList<Scope> list, @k0 @d.e(id = 3) final Account account, @d.e(id = 4) final boolean b, @d.e(id = 5) final boolean b2, @d.e(id = 6) final boolean b3, @k0 @d.e(id = 7) final String s, @k0 @d.e(id = 8) final String s2, @d.e(id = 9) final ArrayList<com.google.android.gms.auth.api.signin.internal.a> list2, @k0 @d.e(id = 10) final String s3) {
        this(n, list, account, b, b2, b3, s, s2, v5(list2), s3);
    }
    
    private GoogleSignInOptions(final int g, final ArrayList<Scope> h, @k0 final Account i, final boolean j, final boolean k, final boolean l, @k0 final String m, @k0 final String n, final Map<Integer, com.google.android.gms.auth.api.signin.internal.a> q, @k0 final String p10) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = new ArrayList<com.google.android.gms.auth.api.signin.internal.a>(q.values());
        this.Q = q;
        this.P = p10;
    }
    
    @RecentlyNullable
    public static GoogleSignInOptions O3(@k0 String optString) throws JSONException {
        final boolean empty = TextUtils.isEmpty((CharSequence)optString);
        String optString2 = null;
        if (empty) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(optString);
        final HashSet<Scope> c = new HashSet<Scope>();
        final JSONArray jsonArray = jsonObject.getJSONArray("scopes");
        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
            c.add(new Scope(jsonArray.getString(i)));
        }
        if (jsonObject.has("accountName")) {
            optString = jsonObject.optString("accountName");
        }
        else {
            optString = null;
        }
        Account account;
        if (!TextUtils.isEmpty((CharSequence)optString)) {
            account = new Account(optString, "com.google");
        }
        else {
            account = null;
        }
        final ArrayList list = new ArrayList<Scope>(c);
        final boolean boolean1 = jsonObject.getBoolean("idTokenRequested");
        final boolean boolean2 = jsonObject.getBoolean("serverAuthRequested");
        final boolean boolean3 = jsonObject.getBoolean("forceCodeForRefreshToken");
        String optString3;
        if (jsonObject.has("serverClientId")) {
            optString3 = jsonObject.optString("serverClientId");
        }
        else {
            optString3 = null;
        }
        if (jsonObject.has("hostedDomain")) {
            optString2 = jsonObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>)list, account, boolean1, boolean2, boolean3, optString3, optString2, new HashMap<Integer, com.google.android.gms.auth.api.signin.internal.a>(), null);
    }
    
    private final JSONObject Q5() {
        final JSONObject jsonObject = new JSONObject();
        try {
            final JSONArray jsonArray = new JSONArray();
            Collections.sort(this.H, GoogleSignInOptions.Y);
            final ArrayList<Scope> h = this.H;
            final int size = h.size();
            int index = 0;
        Block_6_Outer:
            while (true) {
                Label_0074: {
                    if (index >= size) {
                        break Label_0074;
                    }
                    final Scope value = h.get(index);
                    ++index;
                    try {
                        jsonArray.put((Object)value.M());
                        continue Block_6_Outer;
                        Label_0180: {
                            return jsonObject;
                        }
                        // iftrue(Label_0180:, TextUtils.isEmpty((CharSequence)this.N))
                        // iftrue(Label_0105:, i == null)
                        Account i = null;
                        Label_0105:Label_0159_Outer:
                        while (true) {
                            jsonObject.put("accountName", (Object)i.name);
                            break Label_0105;
                            while (true) {
                                jsonObject.put("hostedDomain", (Object)this.N);
                                return jsonObject;
                                jsonObject.put("serverClientId", (Object)this.M);
                                continue;
                            }
                            jsonObject.put("scopes", (Object)jsonArray);
                            i = this.I;
                            continue Label_0159_Outer;
                        }
                        jsonObject.put("idTokenRequested", this.J);
                        jsonObject.put("forceCodeForRefreshToken", this.L);
                        jsonObject.put("serverAuthRequested", this.K);
                    }
                    // iftrue(Label_0159:, TextUtils.isEmpty((CharSequence)this.M))
                    catch (JSONException cause) {
                        throw new RuntimeException((Throwable)cause);
                    }
                }
            }
        }
        catch (JSONException ex) {}
    }
    
    private static Map<Integer, com.google.android.gms.auth.api.signin.internal.a> v5(@k0 final List<com.google.android.gms.auth.api.signin.internal.a> list) {
        final HashMap<Integer, com.google.android.gms.auth.api.signin.internal.a> hashMap = new HashMap<Integer, com.google.android.gms.auth.api.signin.internal.a>();
        if (list == null) {
            return hashMap;
        }
        for (final com.google.android.gms.auth.api.signin.internal.a a : list) {
            hashMap.put(a.M(), a);
        }
        return hashMap;
    }
    
    @RecentlyNullable
    @f2.a
    public Account K() {
        return this.I;
    }
    
    @RecentlyNonNull
    @f2.a
    public ArrayList<com.google.android.gms.auth.api.signin.internal.a> M() {
        return this.O;
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean N2() {
        return this.L;
    }
    
    @RecentlyNonNull
    @f2.a
    public ArrayList<Scope> Q1() {
        return new ArrayList<Scope>(this.H);
    }
    
    @RecentlyNonNull
    public final String U3() {
        return this.Q5().toString();
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        try {
            final GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions)o;
            if (this.O.size() <= 0) {
                if (googleSignInOptions.O.size() <= 0) {
                    if (this.H.size() == googleSignInOptions.Q1().size()) {
                        if (this.H.containsAll(googleSignInOptions.Q1())) {
                            final Account i = this.I;
                            if (i == null) {
                                if (googleSignInOptions.K() != null) {
                                    return false;
                                }
                            }
                            else if (!i.equals((Object)googleSignInOptions.K())) {
                                return false;
                            }
                            if (TextUtils.isEmpty((CharSequence)this.M)) {
                                if (!TextUtils.isEmpty((CharSequence)googleSignInOptions.j2())) {
                                    return false;
                                }
                            }
                            else if (!this.M.equals(googleSignInOptions.j2())) {
                                return false;
                            }
                            if (this.L == googleSignInOptions.N2() && this.J == googleSignInOptions.i3() && this.K == googleSignInOptions.j3() && TextUtils.equals((CharSequence)this.P, (CharSequence)googleSignInOptions.g1())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @RecentlyNullable
    @f2.a
    public String g1() {
        return this.P;
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        final ArrayList<Comparable> list = new ArrayList<Comparable>();
        final ArrayList<Scope> h = this.H;
        final int size = h.size();
        int i = 0;
        while (i < size) {
            final Scope value = h.get(i);
            ++i;
            list.add(value.M());
        }
        Collections.sort(list);
        return new b().a(list).a(this.I).a(this.M).c(this.L).c(this.J).c(this.K).a(this.P).b();
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean i3() {
        return this.J;
    }
    
    @RecentlyNullable
    @f2.a
    public String j2() {
        return this.M;
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean j3() {
        return this.K;
    }
    
    @RecentlyNonNull
    public Scope[] q1() {
        final ArrayList<Scope> h = this.H;
        return h.toArray(new Scope[h.size()]);
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = c.a(parcel);
        c.F(parcel, 1, this.G);
        c.c0(parcel, 2, this.Q1(), false);
        c.S(parcel, 3, (Parcelable)this.K(), n, false);
        c.g(parcel, 4, this.i3());
        c.g(parcel, 5, this.j3());
        c.g(parcel, 6, this.N2());
        c.X(parcel, 7, this.j2(), false);
        c.X(parcel, 8, this.N, false);
        c.c0(parcel, 9, this.M(), false);
        c.X(parcel, 10, this.g1(), false);
        c.b(parcel, a);
    }
    
    public static final class a
    {
        private Set<Scope> a;
        private boolean b;
        private boolean c;
        private boolean d;
        @k0
        private String e;
        @k0
        private Account f;
        @k0
        private String g;
        private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> h;
        @k0
        private String i;
        
        public a() {
            this.a = new HashSet<Scope>();
            this.h = new HashMap<Integer, com.google.android.gms.auth.api.signin.internal.a>();
        }
        
        public a(@RecentlyNonNull final GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet<Scope>();
            this.h = new HashMap<Integer, com.google.android.gms.auth.api.signin.internal.a>();
            x.k(googleSignInOptions);
            this.a = new HashSet<Scope>(googleSignInOptions.H);
            this.b = googleSignInOptions.K;
            this.c = googleSignInOptions.L;
            this.d = googleSignInOptions.J;
            this.e = googleSignInOptions.M;
            this.f = googleSignInOptions.I;
            this.g = googleSignInOptions.N;
            this.h = v5(googleSignInOptions.O);
            this.i = googleSignInOptions.P;
        }
        
        private final String m(final String anObject) {
            x.g(anObject);
            final String e = this.e;
            x.b(e == null || e.equals(anObject), "two different server client ids provided");
            return anObject;
        }
        
        @RecentlyNonNull
        public final a a(@RecentlyNonNull final com.google.android.gms.auth.api.signin.a a) {
            if (!this.h.containsKey(a.a())) {
                final List<Scope> b = a.b();
                if (b != null) {
                    this.a.addAll(b);
                }
                this.h.put(a.a(), new com.google.android.gms.auth.api.signin.internal.a(a));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }
        
        @RecentlyNonNull
        public final GoogleSignInOptions b() {
            if (this.a.contains(GoogleSignInOptions.V)) {
                final Set<Scope> a = this.a;
                final Scope u = GoogleSignInOptions.U;
                if (a.contains(u)) {
                    this.a.remove(u);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                this.d();
            }
            return new GoogleSignInOptions(3, new ArrayList((Collection<? extends E>)this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
        }
        
        @RecentlyNonNull
        public final a c() {
            this.a.add(GoogleSignInOptions.S);
            return this;
        }
        
        @RecentlyNonNull
        public final a d() {
            this.a.add(GoogleSignInOptions.T);
            return this;
        }
        
        @RecentlyNonNull
        public final a e(@RecentlyNonNull final String s) {
            this.d = true;
            this.e = this.m(s);
            return this;
        }
        
        @RecentlyNonNull
        public final a f() {
            this.a.add(GoogleSignInOptions.R);
            return this;
        }
        
        @RecentlyNonNull
        public final a g(@RecentlyNonNull final Scope scope, @RecentlyNonNull final Scope... a) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(a));
            return this;
        }
        
        @RecentlyNonNull
        public final a h(@RecentlyNonNull final String s) {
            return this.i(s, false);
        }
        
        @RecentlyNonNull
        public final a i(@RecentlyNonNull final String s, @RecentlyNonNull final boolean c) {
            this.b = true;
            this.e = this.m(s);
            this.c = c;
            return this;
        }
        
        @RecentlyNonNull
        public final a j(@RecentlyNonNull final String s) {
            this.f = new Account(x.g(s), "com.google");
            return this;
        }
        
        @RecentlyNonNull
        public final a k(@RecentlyNonNull final String s) {
            this.g = x.g(s);
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public final a l(@RecentlyNonNull final String i) {
            this.i = i;
            return this;
        }
    }
}
