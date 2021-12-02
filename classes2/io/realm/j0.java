// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Collections;
import c6.g;
import io.realm.rx.c;
import java.lang.annotation.Annotation;
import io.realm.annotations.RealmModule;
import io.realm.internal.o;
import android.content.Context;
import java.util.HashSet;
import io.realm.internal.Util;
import java.util.Arrays;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import io.realm.exceptions.RealmException;
import java.util.Locale;
import java.util.Iterator;
import java.util.Collection;
import io.realm.internal.modules.b;
import java.util.Set;
import c6.h;
import z5.a;
import io.realm.rx.d;
import io.realm.internal.OsRealmConfig;
import java.io.File;
import io.realm.internal.q;

public class j0
{
    public static final String t = "default.realm";
    private static final Object u;
    protected static final q v;
    private final File a;
    private final String b;
    private final String c;
    private final String d;
    private final byte[] e;
    private final long f;
    private final m0 g;
    private final boolean h;
    private final OsRealmConfig.c i;
    private final q j;
    private final d k;
    private final z5.a l;
    private final f0.d m;
    private final boolean n;
    private final CompactOnLaunchCallback o;
    private final long p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    
    static {
        final Object o = u = f0.k2();
        q l;
        if (o != null) {
            l = l(o.getClass().getCanonicalName());
            if (!l.t()) {
                throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
            }
        }
        else {
            l = null;
        }
        v = l;
    }
    
    protected j0(final File file, @h final String d, @h final byte[] e, final long f, @h final m0 g, final boolean h, final OsRealmConfig.c i, final q j, @h final d k, @h final z5.a l, @h final f0.d m, final boolean n, @h final CompactOnLaunchCallback o, final boolean s, final long p17, final boolean q, final boolean r) {
        this.a = file.getParentFile();
        this.b = file.getName();
        this.c = file.getAbsolutePath();
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.s = s;
        this.p = p17;
        this.q = q;
        this.r = r;
    }
    
    protected static q b(final Set<Object> set, final Set<Class<? extends n0>> set2) {
        if (set2.size() > 0) {
            return new b(j0.v, set2);
        }
        if (set.size() == 1) {
            return l(set.iterator().next().getClass().getCanonicalName());
        }
        final q[] array = new q[set.size()];
        int n = 0;
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            array[n] = l(iterator.next().getClass().getCanonicalName());
            ++n;
        }
        return new io.realm.internal.modules.a(array);
    }
    
    protected static j0 c(final String pathname, @h final byte[] array, final q q) {
        return new j0(new File(pathname), null, array, 0L, null, false, OsRealmConfig.c.H, q, null, null, null, true, null, true, Long.MAX_VALUE, false, true);
    }
    
    private static q l(String format) {
        final String[] split = format.split("\\.");
        format = split[split.length - 1];
        format = String.format(Locale.US, "io.realm.%s%s", format, "Mediator");
        try {
            final Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (q)constructor.newInstance(new Object[0]);
        }
        catch (IllegalAccessException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not create an instance of ");
            sb.append(format);
            throw new RealmException(sb.toString(), ex);
        }
        catch (InstantiationException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not create an instance of ");
            sb2.append(format);
            throw new RealmException(sb2.toString(), ex2);
        }
        catch (InvocationTargetException ex3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not create an instance of ");
            sb3.append(format);
            throw new RealmException(sb3.toString(), ex3);
        }
        catch (ClassNotFoundException ex4) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Could not find ");
            sb4.append(format);
            throw new RealmException(sb4.toString(), ex4);
        }
    }
    
    public boolean A() {
        return this.h;
    }
    
    String d() {
        return this.d;
    }
    
    public CompactOnLaunchCallback e() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final j0 j0 = (j0)o;
        if (this.f != j0.f) {
            return false;
        }
        if (this.h != j0.h) {
            return false;
        }
        if (this.n != j0.n) {
            return false;
        }
        if (this.s != j0.s) {
            return false;
        }
        final File a = this.a;
        Label_0117: {
            if (a != null) {
                if (a.equals(j0.a)) {
                    break Label_0117;
                }
            }
            else if (j0.a == null) {
                break Label_0117;
            }
            return false;
        }
        final String b2 = this.b;
        Label_0149: {
            if (b2 != null) {
                if (b2.equals(j0.b)) {
                    break Label_0149;
                }
            }
            else if (j0.b == null) {
                break Label_0149;
            }
            return false;
        }
        if (!this.c.equals(j0.c)) {
            return false;
        }
        final String d = this.d;
        Label_0197: {
            if (d != null) {
                if (d.equals(j0.d)) {
                    break Label_0197;
                }
            }
            else if (j0.d == null) {
                break Label_0197;
            }
            return false;
        }
        if (!Arrays.equals(this.e, j0.e)) {
            return false;
        }
        final m0 g = this.g;
        Label_0245: {
            if (g != null) {
                if (g.equals(j0.g)) {
                    break Label_0245;
                }
            }
            else if (j0.g == null) {
                break Label_0245;
            }
            return false;
        }
        if (this.i != j0.i) {
            return false;
        }
        if (!this.j.equals(j0.j)) {
            return false;
        }
        final d k = this.k;
        Label_0306: {
            if (k != null) {
                if (k.equals(j0.k)) {
                    break Label_0306;
                }
            }
            else if (j0.k == null) {
                break Label_0306;
            }
            return false;
        }
        final f0.d m = this.m;
        Label_0338: {
            if (m != null) {
                if (m.equals(j0.m)) {
                    break Label_0338;
                }
            }
            else if (j0.m == null) {
                break Label_0338;
            }
            return false;
        }
        final CompactOnLaunchCallback o2 = this.o;
        Label_0370: {
            if (o2 != null) {
                if (o2.equals(j0.o)) {
                    break Label_0370;
                }
            }
            else if (j0.o == null) {
                break Label_0370;
            }
            return false;
        }
        if (this.p != j0.p) {
            b = false;
        }
        return b;
    }
    
    public OsRealmConfig.c f() {
        return this.i;
    }
    
    public byte[] g() {
        final byte[] e = this.e;
        byte[] copy;
        if (e == null) {
            copy = null;
        }
        else {
            copy = Arrays.copyOf(e, e.length);
        }
        return copy;
    }
    
    public z5.a h() {
        final z5.a l = this.l;
        if (l != null) {
            return l;
        }
        throw new UnsupportedOperationException("The coroutines framework is missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/Kotlin/kotlinx.coroutines#android for more details");
    }
    
    @Override
    public int hashCode() {
        final File a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int hashCode4 = this.c.hashCode();
        final String d = this.d;
        int hashCode5;
        if (d != null) {
            hashCode5 = d.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int hashCode6 = Arrays.hashCode(this.e);
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final m0 g = this.g;
        int hashCode7;
        if (g != null) {
            hashCode7 = g.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int h = this.h ? 1 : 0;
        final int hashCode8 = this.i.hashCode();
        final int hashCode9 = this.j.hashCode();
        final d k = this.k;
        int hashCode10;
        if (k != null) {
            hashCode10 = k.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final f0.d m = this.m;
        int hashCode11;
        if (m != null) {
            hashCode11 = m.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final int n2 = this.n ? 1 : 0;
        final CompactOnLaunchCallback o = this.o;
        if (o != null) {
            hashCode = o.hashCode();
        }
        final int s = this.s ? 1 : 0;
        final long p = this.p;
        return ((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n) * 31 + hashCode7) * 31 + h) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + n2) * 31 + hashCode) * 31 + s) * 31 + (int)(p ^ p >>> 32);
    }
    
    protected f0.d i() {
        return this.m;
    }
    
    public long j() {
        return this.p;
    }
    
    public m0 k() {
        return this.g;
    }
    
    public String m() {
        return this.c;
    }
    
    public File n() {
        return this.a;
    }
    
    public String o() {
        return this.b;
    }
    
    public Set<Class<? extends n0>> p() {
        return this.j.j();
    }
    
    public d q() {
        final d k = this.k;
        if (k != null) {
            return k;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://realm.io/docs/java/latest/#rxjava for more details.");
    }
    
    protected q r() {
        return this.j;
    }
    
    public long s() {
        return this.f;
    }
    
    boolean t() {
        return Util.k(this.d) ^ true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        final File a = this.a;
        String string;
        if (a != null) {
            string = a.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.b);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.c);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        int i;
        if (this.e == null) {
            i = 0;
        }
        else {
            i = 64;
        }
        sb.append(i);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.f));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.g);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.h);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.i);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.j);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.n);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.o);
        sb.append("\n");
        sb.append("maxNumberOfActiveVersions: ");
        sb.append(this.p);
        return sb.toString();
    }
    
    public boolean u() {
        return this.r;
    }
    
    public boolean v() {
        return this.q;
    }
    
    public boolean w() {
        return this.n;
    }
    
    public boolean x() {
        return this.s;
    }
    
    protected boolean y() {
        return false;
    }
    
    protected boolean z() {
        return new File(this.c).exists();
    }
    
    public static class a
    {
        private File a;
        private String b;
        private String c;
        private byte[] d;
        private long e;
        private m0 f;
        private boolean g;
        private OsRealmConfig.c h;
        private HashSet<Object> i;
        private HashSet<Class<? extends n0>> j;
        @h
        private d k;
        @h
        private z5.a l;
        private f0.d m;
        private boolean n;
        private CompactOnLaunchCallback o;
        private long p;
        private boolean q;
        private boolean r;
        
        public a() {
            this(io.realm.a.T);
        }
        
        a(final Context context) {
            this.i = new HashSet<Object>();
            this.j = new HashSet<Class<? extends n0>>();
            this.p = Long.MAX_VALUE;
            if (context != null) {
                o.c(context);
                this.o(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }
        
        private void f(final Object o) {
            if (o.getClass().isAnnotationPresent(RealmModule.class)) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(o.getClass().getCanonicalName());
            sb.append(" is not a RealmModule. Add @RealmModule to the class definition.");
            throw new IllegalArgumentException(sb.toString());
        }
        
        private void o(final Context context) {
            this.a = context.getFilesDir();
            this.b = "default.realm";
            this.d = null;
            this.e = 0L;
            this.f = null;
            this.g = false;
            this.h = OsRealmConfig.c.H;
            this.n = false;
            this.o = null;
            if (j0.u != null) {
                this.i.add(j0.u);
            }
            this.q = false;
            this.r = true;
        }
        
        public final a a(final Object e) {
            if (e != null) {
                this.f(e);
                this.i.add(e);
            }
            return this;
        }
        
        public a b(final boolean r) {
            this.r = r;
            return this;
        }
        
        public a c(final boolean q) {
            this.q = q;
            return this;
        }
        
        public a d(final String c) {
            if (Util.k(c)) {
                throw new IllegalArgumentException("A non-empty asset file path must be provided");
            }
            if (this.h == OsRealmConfig.c.I) {
                throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
            }
            if (!this.g) {
                this.c = c;
                return this;
            }
            throw new IllegalStateException("Realm cannot use an asset file when previously configured to clear its schema in migration by calling deleteRealmIfMigrationNeeded().");
        }
        
        public j0 e() {
            if (this.n) {
                if (this.m != null) {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
                if (this.c == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                }
                if (this.g) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                }
                if (this.o != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.k == null && Util.m()) {
                this.k = new c(true);
            }
            if (this.l == null && Util.j()) {
                this.l = new z5.b(Boolean.TRUE);
            }
            return new j0(new File(this.a, this.b), this.c, this.d, this.e, this.f, this.g, this.h, j0.b(this.i, this.j), this.k, this.l, this.m, this.n, this.o, false, this.p, this.q, this.r);
        }
        
        public a g() {
            return this.h(new io.realm.h());
        }
        
        public a h(final CompactOnLaunchCallback o) {
            if (o != null) {
                this.o = o;
                return this;
            }
            throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
        }
        
        public a i() {
            final String c = this.c;
            if (c != null && c.length() != 0) {
                throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
            }
            this.g = true;
            return this;
        }
        
        public a j(final File a) {
            if (a == null) {
                throw new IllegalArgumentException("Non-null 'dir' required.");
            }
            if (a.isFile()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("'dir' is a file, not a directory: ");
                sb.append(a.getAbsolutePath());
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            if (!a.exists() && !a.mkdirs()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not create the specified directory: ");
                sb2.append(a.getAbsolutePath());
                sb2.append(".");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (a.canWrite()) {
                this.a = a;
                return this;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Realm directory is not writable: ");
            sb3.append(a.getAbsolutePath());
            sb3.append(".");
            throw new IllegalArgumentException(sb3.toString());
        }
        
        public a k(final byte[] original) {
            if (original == null) {
                throw new IllegalArgumentException("A non-null key must be provided");
            }
            if (original.length == 64) {
                this.d = Arrays.copyOf(original, original.length);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "The provided key must be %s bytes. Yours was: %s", 64, original.length));
        }
        
        public a l(@g final z5.a l) {
            if (l != null) {
                this.l = l;
                return this;
            }
            throw new IllegalArgumentException("The provided Flow factory must not be null.");
        }
        
        public a m() {
            if (Util.k(this.c)) {
                this.h = OsRealmConfig.c.I;
                return this;
            }
            throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
        }
        
        public a n(final f0.d m) {
            this.m = m;
            return this;
        }
        
        public a p(final long n) {
            if (n >= 1L) {
                this.p = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Only positive numbers above 0 are allowed. Yours was: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public a q(final m0 f) {
            if (f != null) {
                this.f = f;
                return this;
            }
            throw new IllegalArgumentException("A non-null migration must be provided");
        }
        
        public a r(final Object o, final Object... array) {
            this.i.clear();
            this.a(o);
            if (array != null) {
                for (int i = 0; i < array.length; ++i) {
                    this.a(array[i]);
                }
            }
            return this;
        }
        
        public a s(final String b) {
            if (b != null && !b.isEmpty()) {
                this.b = b;
                return this;
            }
            throw new IllegalArgumentException("A non-empty filename must be provided");
        }
        
        public a t() {
            this.n = true;
            return this;
        }
        
        public a u(@g final d k) {
            if (k != null) {
                this.k = k;
                return this;
            }
            throw new IllegalArgumentException("The provided Rx Observable factory must not be null.");
        }
        
        final a v(final Class<? extends n0> e, final Class<? extends n0>... elements) {
            if (e != null) {
                this.i.clear();
                this.i.add(j0.v);
                this.j.add(e);
                if (elements != null) {
                    Collections.addAll(this.j, elements);
                }
                return this;
            }
            throw new IllegalArgumentException("A non-null class must be provided");
        }
        
        public a w(final long n) {
            if (n >= 0L) {
                this.e = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Realm schema version numbers must be 0 (zero) or higher. Yours was: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
