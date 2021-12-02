// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.d;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import androidx.annotation.t0;
import android.content.SharedPreferences$Editor;
import androidx.annotation.k0;
import android.content.SharedPreferences;
import android.content.Context;

public class l
{
    public static final String o = "_has_set_default_values";
    private static final int p = 0;
    private static final int q = 1;
    private Context a;
    private long b;
    @k0
    private SharedPreferences c;
    @k0
    private f d;
    @k0
    private SharedPreferences$Editor e;
    private boolean f;
    private String g;
    private int h;
    private int i;
    private PreferenceScreen j;
    private d k;
    private c l;
    private a m;
    private b n;
    
    @t0({ t0.a.I })
    public l(final Context a) {
        this.b = 0L;
        this.i = 0;
        this.a = a;
        this.E(f(a));
    }
    
    public static SharedPreferences d(final Context context) {
        return context.getSharedPreferences(f(context), e());
    }
    
    private static int e() {
        return 0;
    }
    
    private static String f(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return sb.toString();
    }
    
    public static void u(final Context context, final int n, final boolean b) {
        v(context, f(context), e(), n, b);
    }
    
    public static void v(final Context context, final String s, final int n, final int n2, final boolean b) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        if (b || !sharedPreferences.getBoolean("_has_set_default_values", false)) {
            final l l = new l(context);
            l.E(s);
            l.D(n);
            l.r(context, n2, null);
            sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
        }
    }
    
    private void w(final boolean f) {
        if (!f) {
            final SharedPreferences$Editor e = this.e;
            if (e != null) {
                e.apply();
            }
        }
        this.f = f;
    }
    
    public void A(final d k) {
        this.k = k;
    }
    
    public void B(final f d) {
        this.d = d;
    }
    
    public boolean C(final PreferenceScreen j) {
        final PreferenceScreen i = this.j;
        if (j != i) {
            if (i != null) {
                i.K0();
            }
            this.j = j;
            return true;
        }
        return false;
    }
    
    public void D(final int h) {
        this.h = h;
        this.c = null;
    }
    
    public void E(final String g) {
        this.g = g;
        this.c = null;
    }
    
    public void F() {
        if (Build$VERSION.SDK_INT >= 24) {
            this.i = 0;
            this.c = null;
        }
    }
    
    public void G() {
        if (Build$VERSION.SDK_INT >= 24) {
            this.i = 1;
            this.c = null;
        }
    }
    
    boolean H() {
        return this.f ^ true;
    }
    
    public void I(final Preference preference) {
        final a m = this.m;
        if (m != null) {
            m.k(preference);
        }
    }
    
    public PreferenceScreen a(final Context context) {
        final PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.E0(this);
        return preferenceScreen;
    }
    
    @k0
    public <T extends Preference> T b(@j0 final CharSequence charSequence) {
        final PreferenceScreen j = this.j;
        if (j == null) {
            return null;
        }
        return (T)j.l2(charSequence);
    }
    
    public Context c() {
        return this.a;
    }
    
    SharedPreferences$Editor g() {
        if (this.d != null) {
            return null;
        }
        if (this.f) {
            if (this.e == null) {
                this.e = this.o().edit();
            }
            return this.e;
        }
        return this.o().edit();
    }
    
    long h() {
        synchronized (this) {
            final long b = this.b;
            this.b = 1L + b;
            return b;
        }
    }
    
    public a i() {
        return this.m;
    }
    
    public b j() {
        return this.n;
    }
    
    public c k() {
        return this.l;
    }
    
    public d l() {
        return this.k;
    }
    
    @k0
    public f m() {
        return this.d;
    }
    
    public PreferenceScreen n() {
        return this.j;
    }
    
    public SharedPreferences o() {
        if (this.m() != null) {
            return null;
        }
        if (this.c == null) {
            Context context;
            if (this.i != 1) {
                context = this.a;
            }
            else {
                context = androidx.core.content.d.b(this.a);
            }
            this.c = context.getSharedPreferences(this.g, this.h);
        }
        return this.c;
    }
    
    public int p() {
        return this.h;
    }
    
    public String q() {
        return this.g;
    }
    
    @t0({ t0.a.I })
    public PreferenceScreen r(final Context context, final int n, final PreferenceScreen preferenceScreen) {
        this.w(true);
        final PreferenceScreen preferenceScreen2 = (PreferenceScreen)new k(context, this).e(n, preferenceScreen);
        preferenceScreen2.E0(this);
        this.w(false);
        return preferenceScreen2;
    }
    
    public boolean s() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT >= 24) {
            b = (this.i == 0 && b);
        }
        return b;
    }
    
    public boolean t() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 24) {
            b = b;
            if (this.i == 1) {
                b = true;
            }
        }
        return b;
    }
    
    public void x(final a m) {
        this.m = m;
    }
    
    public void y(final b n) {
        this.n = n;
    }
    
    public void z(final c l) {
        this.l = l;
    }
    
    public interface a
    {
        void k(final Preference p0);
    }
    
    public interface b
    {
        void l(final PreferenceScreen p0);
    }
    
    public interface c
    {
        boolean m(final Preference p0);
    }
    
    public abstract static class d
    {
        public abstract boolean a(final Preference p0, final Preference p1);
        
        public abstract boolean b(final Preference p0, final Preference p1);
    }
    
    public static class e extends d
    {
        @Override
        public boolean a(final Preference preference, final Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if (preference == preference2 && preference.h2()) {
                return false;
            }
            if (!TextUtils.equals(preference.k0(), preference2.k0())) {
                return false;
            }
            if (!TextUtils.equals(preference.c0(), preference2.c0())) {
                return false;
            }
            final Drawable u = preference.u();
            final Drawable u2 = preference2.u();
            return (u == u2 || (u != null && u.equals(u2))) && preference.q0() == preference2.q0() && preference.t0() == preference2.t0() && (!(preference instanceof TwoStatePreference) || ((TwoStatePreference)preference).m2() == ((TwoStatePreference)preference2).m2()) && (!(preference instanceof DropDownPreference) || preference == preference2);
        }
        
        @Override
        public boolean b(final Preference preference, final Preference preference2) {
            return preference.v() == preference2.v();
        }
    }
}
