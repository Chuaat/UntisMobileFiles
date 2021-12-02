// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.OsObjectStore;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Locale;
import io.realm.internal.Table;
import io.realm.internal.b;

class v extends t0
{
    v(final a a) {
        super(a, null);
    }
    
    private String x(final String s) {
        final int length = s.length();
        final int l = Table.L;
        if (length <= l) {
            return Table.Q(s);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", l, s.length()));
    }
    
    @Override
    public r0 e(final String s) {
        this.c(s, "Null or empty class names are not allowed");
        final String q = Table.Q(s);
        final int length = s.length();
        final int l = Table.L;
        if (length <= l) {
            final a f = super.f;
            return new u(f, this, f.J().createTable(q));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", l, s.length()));
    }
    
    @Override
    public r0 g(final String s, final String s2, final Class<?> clazz, final l... array) {
        this.c(s, "Null or empty class names are not allowed");
        r0.j(s2);
        final String x = this.x(s);
        final r0.b b = r0.u().get(clazz);
        boolean b2 = false;
        if (b != null) {
            final RealmFieldType a = b.a;
            if (a == RealmFieldType.STRING || a == RealmFieldType.INTEGER || a == RealmFieldType.OBJECT_ID) {
                final boolean c = b.c;
                if (!u.U(array, l.I)) {
                    b2 = c;
                }
                final a f = super.f;
                return new u(f, this, f.J().createTableWithPrimaryKey(x, s2, b.a, b2));
            }
        }
        throw new IllegalArgumentException(String.format("Realm doesn't support primary key field type '%s'.", clazz));
    }
    
    @Override
    public r0 h(String q) {
        this.c(q, "Null or empty class names are not allowed");
        q = Table.Q(q);
        if (!super.f.J().hasTable(q)) {
            return null;
        }
        return new u(super.f, this, super.f.J().getTable(q));
    }
    
    @Override
    public Set<r0> i() {
        final String[] tablesNames = super.f.J().getTablesNames();
        final int length = tablesNames.length;
        final LinkedHashSet set = new LinkedHashSet<r0>(length);
        for (int i = 0; i < length; ++i) {
            final r0 h = this.h(Table.A(tablesNames[i]));
            if (h != null) {
                set.add(h);
            }
        }
        return (Set<r0>)set;
    }
    
    @Override
    public void u(final String str) {
        super.f.k();
        this.c(str, "Null or empty class names are not allowed");
        final String q = Table.Q(str);
        if (OsObjectStore.b(super.f.J(), str)) {
            this.v(q);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove class because it is not in this Realm: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public r0 w(final String s, final String s2) {
        super.f.k();
        this.c(s, "Class names cannot be empty or null");
        this.c(s2, "Class names cannot be empty or null");
        final String q = Table.Q(s);
        final String q2 = Table.Q(s2);
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot rename class because it doesn't exist in this Realm: ");
        sb.append(s);
        this.b(s, sb.toString());
        if (!super.f.J().hasTable(q2)) {
            super.f.J().renameTable(q, q2);
            final Table table = super.f.J().getTable(q2);
            final r0 v = this.v(q);
            r0 r0 = null;
            Label_0156: {
                if (v != null && v.v().c0()) {
                    r0 = v;
                    if (v.l().equals(s2)) {
                        break Label_0156;
                    }
                }
                r0 = new u(super.f, this, table);
            }
            this.s(q2, r0);
            return r0;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(" cannot be renamed because the new class already exists: ");
        sb2.append(s2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
