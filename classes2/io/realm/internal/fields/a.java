// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.fields;

import java.lang.constant.Constable;
import java.util.Locale;
import java.util.List;
import io.realm.RealmFieldType;
import java.util.Set;

class a extends c
{
    private final c.a n;
    private final String o;
    
    a(final c.a n, final String o, final String s, final Set<RealmFieldType> set, final Set<RealmFieldType> set2) {
        super(s, set, set2);
        this.o = o;
        this.n = n;
    }
    
    @Override
    protected void a(final List<String> list) {
        final int size = list.size();
        final long[] array = new long[size];
        final long[] array2 = new long[size];
        String o = this.o;
        RealmFieldType b;
        Constable constable = b = null;
        String s;
        String c;
        for (int i = 0; i < size; ++i, o = c, constable = s) {
            s = list.get(i);
            if (s == null || s.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            final io.realm.internal.c a = this.n.a(o);
            if (a == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: class '%s' not found in this schema.", o));
            }
            final io.realm.internal.c.b f = a.f(s);
            if (f == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in class '%s'.", s, o));
            }
            b = f.b;
            c = o;
            if (i < size - 1) {
                this.m(o, s, b);
                c = f.c;
            }
            array[i] = f.a;
            long c2;
            if (b != RealmFieldType.LINKING_OBJECTS) {
                c2 = 0L;
            }
            else {
                c2 = this.n.c(f.c);
            }
            array2[i] = c2;
        }
        this.k(o, (String)constable, b, array, array2);
    }
}
