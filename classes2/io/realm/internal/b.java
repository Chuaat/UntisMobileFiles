// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Iterator;
import io.realm.exceptions.RealmException;
import java.util.Locale;
import c6.g;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import io.realm.n0;
import java.util.Map;

public final class b
{
    private final Map<Class<? extends n0>, c> a;
    private final Map<String, c> b;
    private final q c;
    private final OsSchemaInfo d;
    
    public b(final q c, final OsSchemaInfo d) {
        this.a = new ConcurrentHashMap<Class<? extends n0>, c>();
        this.b = new HashMap<String, c>();
        this.c = c;
        this.d = d;
    }
    
    @g
    public c a(final Class<? extends n0> clazz) {
        c c;
        if ((c = this.a.get(clazz)) == null) {
            c = this.c.c(clazz, this.d);
            this.a.put(clazz, c);
        }
        return c;
    }
    
    @g
    public c b(final String anObject) {
        c a;
        final c c = a = this.b.get(anObject);
        Label_0090: {
            if (c == null) {
                final Iterator<Class<? extends n0>> iterator = this.c.j().iterator();
                Class<? extends n0> clazz;
                do {
                    a = c;
                    if (!iterator.hasNext()) {
                        break Label_0090;
                    }
                    clazz = iterator.next();
                } while (!this.c.l(clazz).equals(anObject));
                a = this.a(clazz);
                this.b.put(anObject, a);
            }
        }
        if (a != null) {
            return a;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", anObject));
    }
    
    public void c() {
        for (final Map.Entry<Class<? extends n0>, c> entry : this.a.entrySet()) {
            entry.getValue().e(this.c.c(entry.getKey(), this.d));
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ColumnIndices[");
        final Iterator<Map.Entry<Class<? extends n0>, c>> iterator = this.a.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Class<? extends n0>, c> entry = iterator.next();
            if (n != 0) {
                sb.append(",");
            }
            sb.append(entry.getKey().getSimpleName());
            sb.append("->");
            sb.append(entry.getValue());
            n = 1;
        }
        sb.append("]");
        return sb.toString();
    }
}
