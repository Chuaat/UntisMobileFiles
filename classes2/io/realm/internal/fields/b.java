// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.fields;

import java.lang.constant.Constable;
import java.util.Locale;
import java.util.List;
import io.realm.RealmFieldType;
import java.util.Set;
import io.realm.internal.Table;

class b extends c
{
    private final Table n;
    
    b(final Table n, final String s, final Set<RealmFieldType> set, final Set<RealmFieldType> set2) {
        super(s, set, set2);
        this.n = n;
    }
    
    @Override
    protected void a(final List<String> list) {
        final int size = list.size();
        final long[] array = new long[size];
        Table n = this.n;
        String s = null;
        RealmFieldType f;
        Constable constable = f = null;
        String z;
        Table k;
        for (int i = 0; i < size; ++i, n = k, s = z) {
            constable = list.get(i);
            if (constable == null || ((String)constable).length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            z = n.z();
            final long c = n.C((String)constable);
            if (c < 0L) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in table '%s'.", constable, z));
            }
            f = n.F(c);
            k = n;
            if (i < size - 1) {
                this.m(z, (String)constable, f);
                k = n.K(c);
            }
            array[i] = c;
        }
        this.k(s, (String)constable, f, array, new long[size]);
    }
}
