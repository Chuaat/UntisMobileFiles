// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.fields;

import java.util.Locale;
import java.util.Collection;
import java.util.Arrays;
import io.realm.internal.Table;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import io.realm.RealmFieldType;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class c
{
    private static final Pattern h;
    public static final Set<RealmFieldType> i;
    public static final Set<RealmFieldType> j;
    public static final Set<RealmFieldType> k;
    public static final Set<RealmFieldType> l;
    public static final Set<RealmFieldType> m;
    private final List<String> a;
    private final Set<RealmFieldType> b;
    private final Set<RealmFieldType> c;
    private String d;
    private RealmFieldType e;
    private long[] f;
    private long[] g;
    
    static {
        h = Pattern.compile("\\.");
        final HashSet<RealmFieldType> s = new HashSet<RealmFieldType>(3);
        final RealmFieldType object = RealmFieldType.OBJECT;
        s.add(object);
        final RealmFieldType list = RealmFieldType.LIST;
        s.add(list);
        s.add(RealmFieldType.LINKING_OBJECTS);
        i = Collections.unmodifiableSet((Set<?>)s);
        final HashSet<RealmFieldType> s2 = new HashSet<RealmFieldType>(2);
        s2.add(object);
        s2.add(list);
        j = Collections.unmodifiableSet((Set<?>)s2);
        final HashSet<RealmFieldType> s3 = new HashSet<RealmFieldType>(1);
        s3.add(list);
        k = Collections.unmodifiableSet((Set<?>)s3);
        final HashSet<RealmFieldType> s4 = new HashSet<RealmFieldType>(1);
        s4.add(object);
        l = Collections.unmodifiableSet((Set<?>)s4);
        m = Collections.emptySet();
    }
    
    protected c(final String s, final Set<RealmFieldType> b, final Set<RealmFieldType> c) {
        final List<String> j = this.j(s);
        this.a = j;
        if (j.size() > 0) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("Invalid query: Empty field descriptor");
    }
    
    private void b() {
        if (this.e == null) {
            this.a(this.a);
        }
    }
    
    public static c c(final a a, final Table table, final String s, Set<RealmFieldType> set, final Set<RealmFieldType> set2) {
        c c;
        if (a != null && a.b()) {
            final String z = table.z();
            if (set == null) {
                set = io.realm.internal.fields.c.i;
            }
            c = new io.realm.internal.fields.a(a, z, s, set, set2);
        }
        else {
            if (set == null) {
                set = io.realm.internal.fields.c.j;
            }
            c = new b(table, s, set, set2);
        }
        return c;
    }
    
    public static c d(final a a, final Table table, final String s, final RealmFieldType... a2) {
        return c(a, table, s, null, new HashSet<RealmFieldType>(Arrays.asList(a2)));
    }
    
    private List<String> j(final String s) {
        if (s == null || s.equals("")) {
            throw new IllegalArgumentException("Invalid query: field name is empty");
        }
        final int lastIndex = s.lastIndexOf(".");
        if (lastIndex == s.length() - 1) {
            throw new IllegalArgumentException("Invalid query: field name must not end with a period ('.')");
        }
        if (lastIndex > -1) {
            return Arrays.asList(io.realm.internal.fields.c.h.split(s));
        }
        return Collections.singletonList(s);
    }
    
    private void l(final String s, final String s2, final RealmFieldType realmFieldType, final Set<RealmFieldType> set) {
        if (set.contains(realmFieldType)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' in class '%s' is of invalid type '%s'.", s2, s, realmFieldType.toString()));
    }
    
    protected abstract void a(final List<String> p0);
    
    public final long[] e() {
        this.b();
        final long[] f = this.f;
        return Arrays.copyOf(f, f.length);
    }
    
    public final String f() {
        this.b();
        return this.d;
    }
    
    public final RealmFieldType g() {
        this.b();
        return this.e;
    }
    
    public final long[] h() {
        this.b();
        final long[] g = this.g;
        return Arrays.copyOf(g, g.length);
    }
    
    public final int i() {
        return this.a.size();
    }
    
    protected final void k(final String s, final String d, final RealmFieldType e, final long[] f, final long[] g) {
        final Set<RealmFieldType> c = this.c;
        if (c != null && c.size() > 0) {
            this.l(s, d, e, this.c);
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    protected final void m(final String s, final String s2, final RealmFieldType realmFieldType) {
        this.l(s, s2, realmFieldType, this.b);
    }
    
    public interface a
    {
        io.realm.internal.c a(final String p0);
        
        boolean b();
        
        long c(final String p0);
    }
}
