// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNullable;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import android.text.TextUtils;
import android.accounts.Account;
import java.util.HashSet;
import com.google.android.gms.common.util.k;
import java.util.Set;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import android.net.Uri;
import androidx.annotation.k0;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.util.g;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@h2.d.a(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends a implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<GoogleSignInAccount> CREATOR;
    @d0
    private static com.google.android.gms.common.util.g T;
    @g(id = 1)
    private final int G;
    @k0
    @c(getter = "getId", id = 2)
    private String H;
    @k0
    @c(getter = "getIdToken", id = 3)
    private String I;
    @k0
    @c(getter = "getEmail", id = 4)
    private String J;
    @k0
    @c(getter = "getDisplayName", id = 5)
    private String K;
    @k0
    @c(getter = "getPhotoUrl", id = 6)
    private Uri L;
    @k0
    @c(getter = "getServerAuthCode", id = 7)
    private String M;
    @c(getter = "getExpirationTimeSecs", id = 8)
    private long N;
    @c(getter = "getObfuscatedIdentifier", id = 9)
    private String O;
    @c(id = 10)
    private List<Scope> P;
    @k0
    @c(getter = "getGivenName", id = 11)
    private String Q;
    @k0
    @c(getter = "getFamilyName", id = 12)
    private String R;
    private Set<Scope> S;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.auth.api.signin.c();
        GoogleSignInAccount.T = k.e();
    }
    
    @b
    GoogleSignInAccount(@e(id = 1) final int g, @k0 @e(id = 2) final String h, @k0 @e(id = 3) final String i, @k0 @e(id = 4) final String j, @k0 @e(id = 5) final String k, @k0 @e(id = 6) final Uri l, @k0 @e(id = 7) final String m, @e(id = 8) final long n, @e(id = 9) final String o, @e(id = 10) final List<Scope> p12, @k0 @e(id = 11) final String q, @k0 @e(id = 12) final String r) {
        this.S = new HashSet<Scope>();
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p12;
        this.Q = q;
        this.R = r;
    }
    
    @RecentlyNonNull
    @f2.a
    public static GoogleSignInAccount M() {
        final Account account = new Account("<<default account>>", "com.google");
        return S5(null, null, account.name, null, null, null, null, 0L, account.name, new HashSet<Scope>());
    }
    
    @RecentlyNullable
    public static GoogleSignInAccount R5(@k0 String m) throws JSONException {
        final boolean empty = TextUtils.isEmpty((CharSequence)m);
        final String s = null;
        if (empty) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject(m);
        m = jsonObject.optString("photoUrl");
        Uri parse;
        if (!TextUtils.isEmpty((CharSequence)m)) {
            parse = Uri.parse(m);
        }
        else {
            parse = null;
        }
        final long long1 = Long.parseLong(jsonObject.getString("expirationTime"));
        final HashSet<Scope> set = new HashSet<Scope>();
        final JSONArray jsonArray = jsonObject.getJSONArray("grantedScopes");
        for (int length = jsonArray.length(), i = 0; i < length; ++i) {
            set.add(new Scope(jsonArray.getString(i)));
        }
        final String optString = jsonObject.optString("id");
        String optString2;
        if (jsonObject.has("tokenId")) {
            optString2 = jsonObject.optString("tokenId");
        }
        else {
            optString2 = null;
        }
        String optString3;
        if (jsonObject.has("email")) {
            optString3 = jsonObject.optString("email");
        }
        else {
            optString3 = null;
        }
        String optString4;
        if (jsonObject.has("displayName")) {
            optString4 = jsonObject.optString("displayName");
        }
        else {
            optString4 = null;
        }
        String optString5;
        if (jsonObject.has("givenName")) {
            optString5 = jsonObject.optString("givenName");
        }
        else {
            optString5 = null;
        }
        String optString6;
        if (jsonObject.has("familyName")) {
            optString6 = jsonObject.optString("familyName");
        }
        else {
            optString6 = null;
        }
        final GoogleSignInAccount s2 = S5(optString, optString2, optString3, optString4, optString5, optString6, parse, long1, jsonObject.getString("obfuscatedIdentifier"), set);
        m = s;
        if (jsonObject.has("serverAuthCode")) {
            m = jsonObject.optString("serverAuthCode");
        }
        s2.M = m;
        return s2;
    }
    
    private static GoogleSignInAccount S5(@k0 final String s, @k0 final String s2, @k0 final String s3, @k0 final String s4, @k0 final String s5, @k0 final String s6, @k0 final Uri uri, @k0 Long value, @j0 final String s7, @j0 final Set<Scope> set) {
        if (value == null) {
            value = GoogleSignInAccount.T.a() / 1000L;
        }
        return new GoogleSignInAccount(3, s, s2, s3, s4, uri, null, value, x.g(s7), new ArrayList<Scope>(x.k(set)), s5, s6);
    }
    
    private final JSONObject V5() {
        final JSONObject jsonObject = new JSONObject();
        try {
            if (this.i3() != null) {
                jsonObject.put("id", (Object)this.i3());
            }
            if (this.j3() != null) {
                jsonObject.put("tokenId", (Object)this.j3());
            }
            if (this.q1() != null) {
                jsonObject.put("email", (Object)this.q1());
            }
            if (this.g1() != null) {
                jsonObject.put("displayName", (Object)this.g1());
            }
            if (this.j2() != null) {
                jsonObject.put("givenName", (Object)this.j2());
            }
            if (this.Q1() != null) {
                jsonObject.put("familyName", (Object)this.Q1());
            }
            final Uri o3 = this.O3();
            if (o3 != null) {
                jsonObject.put("photoUrl", (Object)o3.toString());
            }
            if (this.Q4() != null) {
                jsonObject.put("serverAuthCode", (Object)this.Q4());
            }
            jsonObject.put("expirationTime", this.N);
            jsonObject.put("obfuscatedIdentifier", (Object)this.O);
            final JSONArray jsonArray = new JSONArray();
            final List<Scope> p = this.P;
            final Scope[] a = p.toArray(new Scope[p.size()]);
            Arrays.sort(a, com.google.android.gms.auth.api.signin.b.G);
            for (int length = a.length, i = 0; i < length; ++i) {
                jsonArray.put((Object)a[i].M());
            }
            jsonObject.put("grantedScopes", (Object)jsonArray);
            return jsonObject;
        }
        catch (JSONException cause) {
            throw new RuntimeException((Throwable)cause);
        }
    }
    
    @RecentlyNullable
    public Account K() {
        if (this.J == null) {
            return null;
        }
        return new Account(this.J, "com.google");
    }
    
    @j0
    public Set<Scope> N2() {
        return new HashSet<Scope>(this.P);
    }
    
    @RecentlyNullable
    public Uri O3() {
        return this.L;
    }
    
    @RecentlyNullable
    public String Q1() {
        return this.R;
    }
    
    @RecentlyNullable
    public String Q4() {
        return this.M;
    }
    
    @j0
    public final String T5() {
        return this.O;
    }
    
    @j0
    @f2.a
    public Set<Scope> U3() {
        final HashSet<Object> set = (HashSet<Object>)new HashSet<Scope>(this.P);
        set.addAll(this.S);
        return (Set<Scope>)set;
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean U4() {
        return GoogleSignInAccount.T.a() / 1000L >= this.N - 300L;
    }
    
    @RecentlyNonNull
    public final String U5() {
        final JSONObject v5 = this.V5();
        v5.remove("serverAuthCode");
        return v5.toString();
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoogleSignInAccount)) {
            return false;
        }
        final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)o;
        return googleSignInAccount.O.equals(this.O) && googleSignInAccount.U3().equals(this.U3());
    }
    
    @RecentlyNullable
    public String g1() {
        return this.K;
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        return (this.O.hashCode() + 527) * 31 + this.U3().hashCode();
    }
    
    @RecentlyNullable
    public String i3() {
        return this.H;
    }
    
    @RecentlyNullable
    public String j2() {
        return this.Q;
    }
    
    @RecentlyNullable
    public String j3() {
        return this.I;
    }
    
    @RecentlyNullable
    public String q1() {
        return this.J;
    }
    
    @RecentlyNonNull
    @f2.a
    public GoogleSignInAccount v5(@RecentlyNonNull final Scope... elements) {
        if (elements != null) {
            Collections.addAll(this.S, elements);
        }
        return this;
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.i3(), false);
        h2.c.X(parcel, 3, this.j3(), false);
        h2.c.X(parcel, 4, this.q1(), false);
        h2.c.X(parcel, 5, this.g1(), false);
        h2.c.S(parcel, 6, (Parcelable)this.O3(), n, false);
        h2.c.X(parcel, 7, this.Q4(), false);
        h2.c.K(parcel, 8, this.N);
        h2.c.X(parcel, 9, this.O, false);
        h2.c.c0(parcel, 10, this.P, false);
        h2.c.X(parcel, 11, this.j2(), false);
        h2.c.X(parcel, 12, this.Q1(), false);
        h2.c.b(parcel, a);
    }
}
