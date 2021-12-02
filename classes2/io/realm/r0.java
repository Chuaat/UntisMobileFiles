// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import c6.h;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Locale;
import io.realm.internal.OsObjectStore;
import java.util.Collections;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import java.util.Date;
import java.util.HashMap;
import io.realm.internal.c;
import io.realm.internal.Table;
import java.util.Map;

public abstract class r0
{
    static final Map<Class<?>, b> e;
    static final Map<Class<?>, b> f;
    final t0 a;
    final io.realm.a b;
    final Table c;
    final io.realm.internal.c d;
    
    static {
        final HashMap<Class<String>, b> m = new HashMap<Class<String>, b>();
        m.put(String.class, new b(RealmFieldType.STRING, RealmFieldType.STRING_LIST, true));
        final Class<Short> type = Short.TYPE;
        final RealmFieldType integer = RealmFieldType.INTEGER;
        final RealmFieldType integer_LIST = RealmFieldType.INTEGER_LIST;
        m.put((Class<String>)type, new b(integer, integer_LIST, false));
        m.put((Class<String>)Short.class, new b(integer, integer_LIST, true));
        m.put((Class<String>)Integer.TYPE, new b(integer, integer_LIST, false));
        m.put((Class<String>)Integer.class, new b(integer, integer_LIST, true));
        m.put((Class<String>)Long.TYPE, new b(integer, integer_LIST, false));
        m.put((Class<String>)Long.class, new b(integer, integer_LIST, true));
        final Class<Float> type2 = Float.TYPE;
        final RealmFieldType float1 = RealmFieldType.FLOAT;
        final RealmFieldType float_LIST = RealmFieldType.FLOAT_LIST;
        m.put((Class<String>)type2, new b(float1, float_LIST, false));
        m.put((Class<String>)Float.class, new b(float1, float_LIST, true));
        final Class<Double> type3 = Double.TYPE;
        final RealmFieldType double1 = RealmFieldType.DOUBLE;
        final RealmFieldType double_LIST = RealmFieldType.DOUBLE_LIST;
        m.put((Class<String>)type3, new b(double1, double_LIST, false));
        m.put((Class<String>)Double.class, new b(double1, double_LIST, true));
        final Class<Boolean> type4 = Boolean.TYPE;
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        final RealmFieldType boolean_LIST = RealmFieldType.BOOLEAN_LIST;
        m.put((Class<String>)type4, new b(boolean1, boolean_LIST, false));
        m.put((Class<String>)Boolean.class, new b(boolean1, boolean_LIST, true));
        m.put((Class<String>)Byte.TYPE, new b(integer, integer_LIST, false));
        m.put((Class<String>)Byte.class, new b(integer, integer_LIST, true));
        m.put((Class<String>)byte[].class, new b(RealmFieldType.BINARY, RealmFieldType.BINARY_LIST, true));
        m.put((Class<String>)Date.class, new b(RealmFieldType.DATE, RealmFieldType.DATE_LIST, true));
        m.put((Class<String>)ObjectId.class, new b(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_LIST, true));
        m.put((Class<String>)Decimal128.class, new b(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_LIST, true));
        e = Collections.unmodifiableMap((Map<?, ?>)m);
        final HashMap<Class<?>, b> i = new HashMap<Class<?>, b>();
        i.put(p0.class, new b(RealmFieldType.OBJECT, null, false));
        i.put(l0.class, new b(RealmFieldType.LIST, null, false));
        f = Collections.unmodifiableMap((Map<?, ?>)i);
    }
    
    r0(final io.realm.a b, final t0 a, final Table c, final io.realm.internal.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    static void j(final String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if (s.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        if (s.length() <= 63) {
            return;
        }
        throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
    }
    
    static final Map<Class<?>, b> u() {
        return r0.e;
    }
    
    public boolean A(final String s) {
        return this.c.W(this.m(s));
    }
    
    public boolean B(final String s) {
        this.i(s);
        return s.equals(OsObjectStore.c(this.b.K, this.l()));
    }
    
    boolean C(final RealmFieldType realmFieldType) {
        return realmFieldType == RealmFieldType.OBJECT || realmFieldType == RealmFieldType.LIST;
    }
    
    public boolean D(final String s) {
        return this.c.W(this.m(s)) ^ true;
    }
    
    public abstract r0 E(final String p0);
    
    public abstract r0 F(final String p0);
    
    public abstract r0 G();
    
    public abstract r0 H(final String p0, final String p1);
    
    public abstract r0 I(final String p0);
    
    public void J(final boolean b) {
        if (this.y()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: ");
            sb.append(this.l());
            throw new IllegalStateException(sb.toString());
        }
        if (!this.c.n0(b) && b) {
            throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
        }
    }
    
    public abstract r0 K(final String p0, final boolean p1);
    
    public abstract r0 L(final String p0, final boolean p1);
    
    public abstract r0 M(final c p0);
    
    r0 a(final String s, final RealmFieldType realmFieldType, final r0 r0) {
        this.c.c(realmFieldType, s, this.b.J().getTable(Table.Q(r0.l())));
        return this;
    }
    
    r0 b(final String s, final RealmFieldType realmFieldType, final boolean b, final boolean b2, final boolean b3) {
        final long b4 = this.c.b(realmFieldType, s, b3 ^ true);
        if (b2) {
            this.c.d(b4);
        }
        if (b) {
            OsObjectStore.e(this.b.K, this.l(), s);
        }
        return this;
    }
    
    public abstract r0 c(final String p0, final Class<?> p1, final l... p2);
    
    public abstract r0 d(final String p0);
    
    public abstract r0 e(final String p0);
    
    public abstract r0 f(final String p0, final r0 p1);
    
    public abstract r0 g(final String p0, final Class<?> p1);
    
    public abstract r0 h(final String p0, final r0 p1);
    
    void i(final String str) {
        if (this.c.C(str) != -1L) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field name doesn't exist on object '");
        sb.append(this.l());
        sb.append("': ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    long k(final String str) {
        final long g = this.d.g(str);
        if (g >= 0L) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field does not exist: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public String l() {
        return this.c.z();
    }
    
    long m(final String s) {
        final long c = this.c.C(s);
        if (c != -1L) {
            return c;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", s, this.l()));
    }
    
    long n(final String s) {
        return this.d.g(s);
    }
    
    abstract io.realm.internal.fields.c o(final String p0, final RealmFieldType... p1);
    
    public Set<String> p() {
        final LinkedHashSet<String> set = new LinkedHashSet<String>((int)this.c.B());
        final String[] e = this.c.E();
        for (int length = e.length, i = 0; i < length; ++i) {
            set.add(e[i]);
        }
        return set;
    }
    
    public RealmFieldType q(final String s) {
        return this.c.F(this.m(s));
    }
    
    public String r() {
        final String c = OsObjectStore.c(this.b.K, this.l());
        if (c != null) {
            return c;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.l());
        sb.append(" doesn't have a primary key.");
        throw new IllegalStateException(sb.toString());
    }
    
    abstract String s(final String p0);
    
    protected final u0 t() {
        return new u0(this.a);
    }
    
    Table v() {
        return this.c;
    }
    
    public boolean w(final String s) {
        return this.c.C(s) != -1L;
    }
    
    public boolean x(final String s) {
        j(s);
        this.i(s);
        final Table c = this.c;
        return c.U(c.C(s));
    }
    
    public boolean y() {
        return OsObjectStore.c(this.b.K, this.l()) != null;
    }
    
    public boolean z() {
        return this.c.X();
    }
    
    static final class a extends c
    {
        private final Table e;
        
        a(final Table e) {
            super(null, false);
            this.e = e;
        }
        
        @Override
        protected c c(final boolean b) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
        
        @Override
        protected void d(final c c, final c c2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }
        
        @Override
        public void e(final c c) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
        
        @Override
        public b f(final String s) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }
        
        @Override
        public long g(final String s) {
            return this.e.C(s);
        }
    }
    
    static final class b
    {
        final RealmFieldType a;
        final RealmFieldType b;
        final boolean c;
        
        b(final RealmFieldType a, @h final RealmFieldType b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface c
    {
        void a(final k p0);
    }
}
