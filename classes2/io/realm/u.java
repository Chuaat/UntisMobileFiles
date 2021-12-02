// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.Util;
import io.realm.internal.r;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsResults;
import io.realm.internal.core.DescriptorOrdering;
import java.util.Locale;
import io.realm.internal.OsObjectStore;
import java.util.Date;
import io.realm.internal.c;
import io.realm.internal.Table;

class u extends r0
{
    u(final io.realm.a a, final t0 t0, final Table table) {
        super(a, t0, table, new a(table));
    }
    
    private void N(final String s, final l[] array) {
        if (array != null) {
            final boolean b = false;
            boolean b2 = false;
            int n = b ? 1 : 0;
            try {
                if (array.length > 0) {
                    n = (b ? 1 : 0);
                    if (U(array, l.G)) {
                        n = (b ? 1 : 0);
                        this.d(s);
                        b2 = true;
                    }
                    n = (b2 ? 1 : 0);
                    if (U(array, l.H)) {
                        n = (b2 ? 1 : 0);
                        this.e(s);
                    }
                }
            }
            catch (Exception ex) {
                final long m = this.m(s);
                if (n != 0) {
                    super.c.g0(m);
                }
                throw (RuntimeException)ex;
            }
        }
    }
    
    private void O() {
        if (!super.b.I.y()) {
            return;
        }
        throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
    }
    
    private void P(final String s) {
        if (s != null && !s.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Null or empty class names are not allowed");
    }
    
    private void Q(final String str) {
        if (super.c.C(str) == -1L) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field already exists in '");
        sb.append(this.l());
        sb.append("': ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void R(final String s, final RealmFieldType realmFieldType) {
        final int n = u$a.a[realmFieldType.ordinal()];
        if (n == 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Boolean fields cannot be marked as primary keys: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n != 2) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Date fields cannot be marked as primary keys: ");
        sb2.append(s);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    private void S(final String s, final Class<?> clazz) {
        if (clazz == Boolean.TYPE || clazz == Boolean.class) {
            this.R(s, RealmFieldType.BOOLEAN);
        }
        if (clazz == Date.class) {
            this.R(s, RealmFieldType.DATE);
        }
    }
    
    private void T(final String s) {
        r0.j(s);
        this.Q(s);
    }
    
    static boolean U(final l[] array, final l l) {
        if (array != null) {
            if (array.length != 0) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (array[i] == l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public r0 E(final String str) {
        super.b.k();
        r0.j(str);
        if (this.w(str)) {
            final long m = this.m(str);
            final String l = this.l();
            if (str.equals(OsObjectStore.c(super.b.K, l))) {
                OsObjectStore.e(super.b.K, l, str);
            }
            super.c.f0(m);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" does not exist.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public r0 F(final String str) {
        super.b.k();
        r0.j(str);
        this.i(str);
        final long m = this.m(str);
        if (super.c.U(m)) {
            super.c.g0(m);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field is not indexed: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public r0 G() {
        super.b.k();
        final String c = OsObjectStore.c(super.b.K, this.l());
        if (c != null) {
            final long c2 = super.c.C(c);
            if (super.c.U(c2)) {
                super.c.g0(c2);
            }
            OsObjectStore.e(super.b.K, this.l(), null);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.l());
        sb.append(" doesn't have a primary key.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public r0 H(final String s, final String s2) {
        super.b.k();
        r0.j(s);
        this.i(s);
        r0.j(s2);
        this.Q(s2);
        super.c.h0(this.m(s), s2);
        return this;
    }
    
    @Override
    public r0 I(final String str) {
        super.b.k();
        this.P(str);
        final String q = Table.Q(str);
        final int length = str.length();
        final int l = Table.L;
        if (length > l) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: '%2$s' (%3$d)", l, str, str.length()));
        }
        if (!super.b.K.hasTable(q)) {
            final String m = super.c.M();
            final String z = super.c.z();
            final String c = OsObjectStore.c(super.b.K, z);
            if (c != null) {
                OsObjectStore.e(super.b.K, z, null);
            }
            super.b.K.renameTable(m, q);
            if (c != null) {
                try {
                    OsObjectStore.e(super.b.K, str, c);
                }
                catch (Exception ex) {
                    super.b.K.renameTable(super.c.M(), m);
                    throw ex;
                }
            }
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Class already exists: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public r0 K(final String s, final boolean b) {
        this.L(s, b ^ true);
        return this;
    }
    
    @Override
    public r0 L(final String s, final boolean b) {
        final long c = super.c.C(s);
        final boolean d = this.D(s);
        final RealmFieldType f = super.c.F(c);
        if (f == RealmFieldType.OBJECT) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot modify the required state for RealmObject references: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString());
        }
        if (f == RealmFieldType.LIST) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot modify the required state for RealmList references: ");
            sb2.append(s);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (b && d) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Field is already required: ");
            sb3.append(s);
            throw new IllegalStateException(sb3.toString());
        }
        if (!b && !d) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Field is already nullable: ");
            sb4.append(s);
            throw new IllegalStateException(sb4.toString());
        }
        if (b) {
            try {
                super.c.g(c);
                return this;
            }
            catch (IllegalArgumentException ex) {
                if (ex.getMessage().contains("Attempted to insert null into non-nullable column")) {
                    throw new IllegalStateException(String.format("The primary key field '%s' has 'null' values stored.", s));
                }
                throw ex;
            }
        }
        super.c.h(c);
        return this;
    }
    
    @Override
    public r0 M(final c c) {
        if (c != null) {
            final OsResults m = OsResults.l(super.b.K, super.c.y0(), new DescriptorOrdering()).m();
            final long c2 = m.c0();
            if (c2 > 2147483647L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Too many results to iterate: ");
                sb.append(c2);
                throw new UnsupportedOperationException(sb.toString());
            }
            for (int n = (int)m.c0(), i = 0; i < n; ++i) {
                final k k = new k(super.b, new CheckedRow(m.v(i)));
                if (k.T()) {
                    c.a(k);
                }
            }
        }
        return this;
    }
    
    @Override
    public r0 c(final String str, final Class<?> clazz, final l... array) {
        final b b = r0.e.get(clazz);
        final boolean b2 = false;
        if (b == null) {
            if (r0.f.containsKey(clazz)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Use addRealmObjectField() instead to add fields that link to other RealmObjects: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            if (n0.class.isAssignableFrom(clazz)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, clazz));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, clazz));
        }
        else {
            if (U(array, l.H)) {
                this.O();
                this.S(str, clazz);
            }
            this.T(str);
            boolean c = b.c;
            if (U(array, l.I)) {
                c = b2;
            }
            final long b3 = super.c.b(b.a, str, c);
            try {
                this.N(str, array);
                return this;
            }
            catch (Exception ex) {
                super.c.f0(b3);
                throw ex;
            }
        }
    }
    
    @Override
    public r0 d(final String str) {
        r0.j(str);
        this.i(str);
        final long m = this.m(str);
        if (!super.c.U(m)) {
            super.c.d(m);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" already has an index.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public r0 e(final String s) {
        this.O();
        r0.j(s);
        this.i(s);
        final String c = OsObjectStore.c(super.b.K, this.l());
        if (c == null) {
            final long m = this.m(s);
            final RealmFieldType q = this.q(s);
            this.R(s, q);
            if (q != RealmFieldType.STRING && !super.c.U(m)) {
                super.c.d(m);
            }
            OsObjectStore.e(super.b.K, this.l(), s);
            return this;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", c));
    }
    
    @Override
    public r0 f(final String s, final r0 r0) {
        r0.j(s);
        this.Q(s);
        super.c.c(RealmFieldType.LIST, s, super.b.K.getTable(Table.Q(r0.l())));
        return this;
    }
    
    @Override
    public r0 g(final String str, final Class<?> clazz) {
        r0.j(str);
        this.Q(str);
        final b b = r0.e.get(clazz);
        if (b != null) {
            super.c.b(b.b, str, b.c);
            return this;
        }
        if (!clazz.equals(r0.class) && !n0.class.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException(String.format(Locale.US, "RealmList does not support lists with this type: %s(%s)", str, clazz));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public r0 h(final String s, final r0 r0) {
        r0.j(s);
        this.Q(s);
        super.c.c(RealmFieldType.OBJECT, s, super.b.K.getTable(Table.Q(r0.l())));
        return this;
    }
    
    @Override
    io.realm.internal.fields.c o(final String s, final RealmFieldType... array) {
        return io.realm.internal.fields.c.d((io.realm.internal.fields.c.a)this.t(), this.v(), s, array);
    }
    
    @Override
    String s(final String s) {
        final String z = super.c.K(this.m(s)).z();
        if (!Util.k(z)) {
            return z;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", s));
    }
}
