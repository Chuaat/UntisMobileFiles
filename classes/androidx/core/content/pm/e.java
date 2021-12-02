// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.pm;

import androidx.core.net.f;
import java.util.HashMap;
import android.annotation.SuppressLint;
import java.util.Collection;
import java.util.HashSet;
import android.net.Uri;
import java.util.Map;
import java.util.Arrays;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Parcelable;
import android.app.Person;
import android.text.TextUtils;
import android.content.pm.ShortcutInfo$Builder;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.ArrayList;
import android.content.pm.ShortcutInfo;
import java.util.List;
import androidx.annotation.j0;
import androidx.annotation.t0;
import androidx.annotation.p0;
import android.os.UserHandle;
import android.os.PersistableBundle;
import androidx.annotation.k0;
import androidx.core.content.g;
import java.util.Set;
import androidx.core.app.x;
import androidx.core.graphics.drawable.IconCompat;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

public class e
{
    private static final String A = "extraPersonCount";
    private static final String B = "extraPerson_";
    private static final String C = "extraLocusId";
    private static final String D = "extraLongLived";
    private static final String E = "extraSliceUri";
    Context a;
    String b;
    String c;
    Intent[] d;
    ComponentName e;
    CharSequence f;
    CharSequence g;
    CharSequence h;
    IconCompat i;
    boolean j;
    x[] k;
    Set<String> l;
    @k0
    g m;
    boolean n;
    int o;
    PersistableBundle p;
    long q;
    UserHandle r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;
    
    e() {
        this.x = true;
    }
    
    @p0(22)
    @t0({ t0.a.I })
    private PersistableBundle b() {
        if (this.p == null) {
            this.p = new PersistableBundle();
        }
        final x[] k = this.k;
        if (k != null && k.length > 0) {
            this.p.putInt("extraPersonCount", k.length);
            int j;
            for (int i = 0; i < this.k.length; i = j) {
                final PersistableBundle p = this.p;
                final StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                j = i + 1;
                sb.append(j);
                p.putPersistableBundle(sb.toString(), this.k[i].n());
            }
        }
        final g m = this.m;
        if (m != null) {
            this.p.putString("extraLocusId", m.a());
        }
        this.p.putBoolean("extraLongLived", this.n);
        return this.p;
    }
    
    @p0(25)
    @t0({ t0.a.I })
    static List<e> c(@j0 final Context context, @j0 final List<ShortcutInfo> list) {
        final ArrayList<e> list2 = new ArrayList<e>(list.size());
        final Iterator<ShortcutInfo> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new a(context, iterator.next()).c());
        }
        return list2;
    }
    
    @k0
    @p0(25)
    static g o(@j0 final ShortcutInfo shortcutInfo) {
        if (Build$VERSION.SDK_INT < 29) {
            return p(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return g.d(shortcutInfo.getLocusId());
    }
    
    @k0
    @p0(25)
    @t0({ t0.a.I })
    private static g p(@k0 final PersistableBundle persistableBundle) {
        final g g = null;
        if (persistableBundle == null) {
            return null;
        }
        final String string = persistableBundle.getString("extraLocusId");
        g g2;
        if (string == null) {
            g2 = g;
        }
        else {
            g2 = new g(string);
        }
        return g2;
    }
    
    @b1
    @p0(25)
    @t0({ t0.a.I })
    static boolean r(@k0 final PersistableBundle persistableBundle) {
        return persistableBundle != null && persistableBundle.containsKey("extraLongLived") && persistableBundle.getBoolean("extraLongLived");
    }
    
    @b1
    @k0
    @p0(25)
    @t0({ t0.a.I })
    static x[] t(@j0 final PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey("extraPersonCount")) {
            final int int1 = persistableBundle.getInt("extraPersonCount");
            final x[] array = new x[int1];
            int j;
            for (int i = 0; i < int1; i = j) {
                final StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                j = i + 1;
                sb.append(j);
                array[i] = x.c(persistableBundle.getPersistableBundle(sb.toString()));
            }
            return array;
        }
        return null;
    }
    
    public boolean A() {
        return this.t;
    }
    
    public boolean B() {
        return this.x;
    }
    
    public boolean C() {
        return this.w;
    }
    
    public boolean D() {
        return this.u;
    }
    
    @p0(25)
    public ShortcutInfo E() {
        final ShortcutInfo$Builder setIntents = new ShortcutInfo$Builder(this.a, this.b).setShortLabel(this.f).setIntents(this.d);
        final IconCompat i = this.i;
        if (i != null) {
            setIntents.setIcon(i.R(this.a));
        }
        if (!TextUtils.isEmpty(this.g)) {
            setIntents.setLongLabel(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            setIntents.setDisabledMessage(this.h);
        }
        final ComponentName e = this.e;
        if (e != null) {
            setIntents.setActivity(e);
        }
        final Set<String> l = this.l;
        if (l != null) {
            setIntents.setCategories((Set)l);
        }
        setIntents.setRank(this.o);
        final PersistableBundle p = this.p;
        if (p != null) {
            setIntents.setExtras(p);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            final x[] k = this.k;
            if (k != null && k.length > 0) {
                final int length = k.length;
                final Person[] persons = new Person[length];
                for (int j = 0; j < length; ++j) {
                    persons[j] = this.k[j].k();
                }
                setIntents.setPersons(persons);
            }
            final g m = this.m;
            if (m != null) {
                setIntents.setLocusId(m.c());
            }
            setIntents.setLongLived(this.n);
        }
        else {
            setIntents.setExtras(this.b());
        }
        return setIntents.build();
    }
    
    Intent a(final Intent intent) {
        final Intent[] d = this.d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)d[d.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f.toString());
        if (this.i != null) {
            Drawable loadIcon = null;
            final Drawable drawable = null;
            if (this.j) {
                final PackageManager packageManager = this.a.getPackageManager();
                final ComponentName e = this.e;
                Drawable activityIcon = drawable;
                if (e != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(e);
                    }
                    catch (PackageManager$NameNotFoundException ex) {
                        activityIcon = drawable;
                    }
                }
                if ((loadIcon = activityIcon) == null) {
                    loadIcon = this.a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.i.i(intent, loadIcon, this.a);
        }
        return intent;
    }
    
    @k0
    public ComponentName d() {
        return this.e;
    }
    
    @k0
    public Set<String> e() {
        return this.l;
    }
    
    @k0
    public CharSequence f() {
        return this.h;
    }
    
    public int g() {
        return this.z;
    }
    
    @k0
    public PersistableBundle h() {
        return this.p;
    }
    
    @t0({ t0.a.I })
    public IconCompat i() {
        return this.i;
    }
    
    @j0
    public String j() {
        return this.b;
    }
    
    @j0
    public Intent k() {
        final Intent[] d = this.d;
        return d[d.length - 1];
    }
    
    @j0
    public Intent[] l() {
        final Intent[] d = this.d;
        return Arrays.copyOf(d, d.length);
    }
    
    public long m() {
        return this.q;
    }
    
    @k0
    public g n() {
        return this.m;
    }
    
    @k0
    public CharSequence q() {
        return this.g;
    }
    
    @j0
    public String s() {
        return this.c;
    }
    
    public int u() {
        return this.o;
    }
    
    @j0
    public CharSequence v() {
        return this.f;
    }
    
    @k0
    public UserHandle w() {
        return this.r;
    }
    
    public boolean x() {
        return this.y;
    }
    
    public boolean y() {
        return this.s;
    }
    
    public boolean z() {
        return this.v;
    }
    
    public static class a
    {
        private final e a;
        private boolean b;
        private Set<String> c;
        private Map<String, Map<String, List<String>>> d;
        private Uri e;
        
        @p0(25)
        @t0({ t0.a.I })
        public a(@j0 final Context a, @j0 final ShortcutInfo shortcutInfo) {
            final e a2 = new e();
            this.a = a2;
            a2.a = a;
            a2.b = shortcutInfo.getId();
            a2.c = shortcutInfo.getPackage();
            final Intent[] intents = shortcutInfo.getIntents();
            a2.d = Arrays.copyOf(intents, intents.length);
            a2.e = shortcutInfo.getActivity();
            a2.f = shortcutInfo.getShortLabel();
            a2.g = shortcutInfo.getLongLabel();
            a2.h = shortcutInfo.getDisabledMessage();
            final int sdk_INT = Build$VERSION.SDK_INT;
            int disabledReason;
            if (sdk_INT >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
            }
            else if (shortcutInfo.isEnabled()) {
                disabledReason = 0;
            }
            else {
                disabledReason = 3;
            }
            a2.z = disabledReason;
            a2.l = (Set<String>)shortcutInfo.getCategories();
            a2.k = e.t(shortcutInfo.getExtras());
            a2.r = shortcutInfo.getUserHandle();
            a2.q = shortcutInfo.getLastChangedTimestamp();
            if (sdk_INT >= 30) {
                a2.s = shortcutInfo.isCached();
            }
            a2.t = shortcutInfo.isDynamic();
            a2.u = shortcutInfo.isPinned();
            a2.v = shortcutInfo.isDeclaredInManifest();
            a2.w = shortcutInfo.isImmutable();
            a2.x = shortcutInfo.isEnabled();
            a2.y = shortcutInfo.hasKeyFieldsOnly();
            a2.m = e.o(shortcutInfo);
            a2.o = shortcutInfo.getRank();
            a2.p = shortcutInfo.getExtras();
        }
        
        public a(@j0 final Context a, @j0 final String b) {
            final e a2 = new e();
            this.a = a2;
            a2.a = a;
            a2.b = b;
        }
        
        @t0({ t0.a.I })
        public a(@j0 final e e) {
            final e a = new e();
            this.a = a;
            a.a = e.a;
            a.b = e.b;
            a.c = e.c;
            final Intent[] d = e.d;
            a.d = Arrays.copyOf(d, d.length);
            a.e = e.e;
            a.f = e.f;
            a.g = e.g;
            a.h = e.h;
            a.z = e.z;
            a.i = e.i;
            a.j = e.j;
            a.r = e.r;
            a.q = e.q;
            a.s = e.s;
            a.t = e.t;
            a.u = e.u;
            a.v = e.v;
            a.w = e.w;
            a.x = e.x;
            a.m = e.m;
            a.n = e.n;
            a.y = e.y;
            a.o = e.o;
            final x[] k = e.k;
            if (k != null) {
                a.k = Arrays.copyOf(k, k.length);
            }
            if (e.l != null) {
                a.l = new HashSet<String>(e.l);
            }
            final PersistableBundle p = e.p;
            if (p != null) {
                a.p = p;
            }
        }
        
        @SuppressLint({ "MissingGetterMatchingBuilder" })
        @j0
        public a a(@j0 final String s) {
            if (this.c == null) {
                this.c = new HashSet<String>();
            }
            this.c.add(s);
            return this;
        }
        
        @SuppressLint({ "MissingGetterMatchingBuilder" })
        @j0
        public a b(@j0 final String s, @j0 final String s2, @j0 final List<String> list) {
            this.a(s);
            if (!list.isEmpty()) {
                if (this.d == null) {
                    this.d = new HashMap<String, Map<String, List<String>>>();
                }
                if (this.d.get(s) == null) {
                    this.d.put(s, new HashMap<String, List<String>>());
                }
                this.d.get(s).put(s2, list);
            }
            return this;
        }
        
        @SuppressLint({ "UnsafeNewApiCall" })
        @j0
        public e c() {
            if (TextUtils.isEmpty(this.a.f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            final e a = this.a;
            final Intent[] d = a.d;
            if (d != null && d.length != 0) {
                if (this.b) {
                    if (a.m == null) {
                        a.m = new g(a.b);
                    }
                    this.a.n = true;
                }
                if (this.c != null) {
                    final e a2 = this.a;
                    if (a2.l == null) {
                        a2.l = new HashSet<String>();
                    }
                    this.a.l.addAll(this.c);
                }
                if (Build$VERSION.SDK_INT >= 21) {
                    if (this.d != null) {
                        final e a3 = this.a;
                        if (a3.p == null) {
                            a3.p = new PersistableBundle();
                        }
                        for (final String str : this.d.keySet()) {
                            final Map<String, List<String>> map = this.d.get(str);
                            this.a.p.putStringArray(str, (String[])map.keySet().toArray(new String[0]));
                            for (final String str2 : map.keySet()) {
                                final List<String> list = map.get(str2);
                                final PersistableBundle p = this.a.p;
                                final StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append("/");
                                sb.append(str2);
                                final String string = sb.toString();
                                String[] array;
                                if (list == null) {
                                    array = new String[0];
                                }
                                else {
                                    array = list.toArray(new String[0]);
                                }
                                p.putStringArray(string, array);
                            }
                        }
                    }
                    if (this.e != null) {
                        final e a4 = this.a;
                        if (a4.p == null) {
                            a4.p = new PersistableBundle();
                        }
                        this.a.p.putString("extraSliceUri", androidx.core.net.f.a(this.e));
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        
        @j0
        public a d(@j0 final ComponentName e) {
            this.a.e = e;
            return this;
        }
        
        @j0
        public a e() {
            this.a.j = true;
            return this;
        }
        
        @j0
        public a f(@j0 final Set<String> l) {
            this.a.l = l;
            return this;
        }
        
        @j0
        public a g(@j0 final CharSequence h) {
            this.a.h = h;
            return this;
        }
        
        @j0
        public a h(@j0 final PersistableBundle p) {
            this.a.p = p;
            return this;
        }
        
        @j0
        public a i(final IconCompat i) {
            this.a.i = i;
            return this;
        }
        
        @j0
        public a j(@j0 final Intent intent) {
            return this.k(new Intent[] { intent });
        }
        
        @j0
        public a k(@j0 final Intent[] d) {
            this.a.d = d;
            return this;
        }
        
        @j0
        public a l() {
            this.b = true;
            return this;
        }
        
        @j0
        public a m(@k0 final g m) {
            this.a.m = m;
            return this;
        }
        
        @j0
        public a n(@j0 final CharSequence g) {
            this.a.g = g;
            return this;
        }
        
        @Deprecated
        @j0
        public a o() {
            this.a.n = true;
            return this;
        }
        
        @j0
        public a p(final boolean n) {
            this.a.n = n;
            return this;
        }
        
        @j0
        public a q(@j0 final x x) {
            return this.r(new x[] { x });
        }
        
        @j0
        public a r(@j0 final x[] k) {
            this.a.k = k;
            return this;
        }
        
        @j0
        public a s(final int o) {
            this.a.o = o;
            return this;
        }
        
        @j0
        public a t(@j0 final CharSequence f) {
            this.a.f = f;
            return this;
        }
        
        @SuppressLint({ "MissingGetterMatchingBuilder" })
        @j0
        public a u(@j0 final Uri e) {
            this.e = e;
            return this;
        }
    }
}
