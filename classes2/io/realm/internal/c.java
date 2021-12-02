// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Iterator;
import java.util.Objects;
import io.realm.RealmFieldType;
import c6.h;
import java.util.HashMap;
import java.util.Map;

public abstract class c
{
    private final Map<String, b> a;
    private final Map<String, b> b;
    private final Map<String, String> c;
    private final boolean d;
    
    protected c(final int n) {
        this(n, true);
    }
    
    private c(final int initialCapacity, final boolean d) {
        this.a = new HashMap<String, b>(initialCapacity);
        this.b = new HashMap<String, b>(initialCapacity);
        this.c = new HashMap<String, String>(initialCapacity);
        this.d = d;
    }
    
    protected c(@h final c c, final boolean b) {
        int size;
        if (c == null) {
            size = 0;
        }
        else {
            size = c.a.size();
        }
        this(size, b);
        if (c != null) {
            this.a.putAll(c.a);
        }
    }
    
    protected final void a(final OsSchemaInfo osSchemaInfo, final String s, final String s2, final String s3) {
        this.a.put(s, new b(osSchemaInfo.b(s2).e(s3).c(), RealmFieldType.LINKING_OBJECTS, s2));
    }
    
    protected final long b(final String s, final String s2, final OsObjectSchemaInfo osObjectSchemaInfo) {
        final Property e = osObjectSchemaInfo.e(s2);
        final b b = new b(e);
        this.a.put(s, b);
        this.b.put(s2, b);
        this.c.put(s, s2);
        return e.c();
    }
    
    protected abstract c c(final boolean p0);
    
    protected abstract void d(final c p0, final c p1);
    
    public void e(final c obj) {
        if (this.d) {
            Objects.requireNonNull(obj, "Attempt to copy null ColumnInfo");
            this.a.clear();
            this.a.putAll(obj.a);
            this.b.clear();
            this.b.putAll(obj.b);
            this.c.clear();
            this.c.putAll(obj.c);
            this.d(obj, this);
            return;
        }
        throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
    }
    
    @h
    public b f(final String s) {
        return this.a.get(s);
    }
    
    public long g(final String s) {
        final b b = this.a.get(s);
        long a;
        if (b == null) {
            a = -1L;
        }
        else {
            a = b.a;
        }
        return a;
    }
    
    public Map<String, b> h() {
        return this.a;
    }
    
    @h
    public String i(final String s) {
        return this.c.get(s);
    }
    
    public final boolean j() {
        return this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ColumnInfo[");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("mutable=");
        sb2.append(this.d);
        sb.append(sb2.toString());
        sb.append(",");
        final Map<String, b> a = this.a;
        final int n = 0;
        if (a != null) {
            sb.append("JavaFieldNames=[");
            final Iterator<Map.Entry<String, b>> iterator = this.a.entrySet().iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, b> entry = iterator.next();
                if (n2 != 0) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                n2 = 1;
            }
            sb.append("]");
        }
        if (this.b != null) {
            sb.append(", InternalFieldNames=[");
            final Iterator<Map.Entry<String, b>> iterator2 = this.b.entrySet().iterator();
            int n3 = n;
            while (iterator2.hasNext()) {
                final Map.Entry<String, b> entry2 = iterator2.next();
                if (n3 != 0) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                n3 = 1;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final class b
    {
        public final long a;
        public final RealmFieldType b;
        public final String c;
        
        private b(final long a, final RealmFieldType b, @h final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        b(final Property property) {
            this(property.c(), property.e(), property.d());
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("ColumnDetails[");
            sb.append(this.a);
            sb.append(", ");
            sb.append(this.b);
            sb.append(", ");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }
}
