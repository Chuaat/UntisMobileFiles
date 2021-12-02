// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.HashMap;
import java.util.Date;
import java.util.Arrays;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.TreeSet;
import java.util.List;
import org.bson.types.b;
import java.util.Map;
import java.util.LinkedHashMap;

public class m extends LinkedHashMap<String, Object> implements i
{
    private static final long G = -4415279469780082174L;
    
    public m() {
    }
    
    public m(final int initialCapacity) {
        super(initialCapacity);
    }
    
    public m(final String key, final Object value) {
        this.put(key, value);
    }
    
    public m(final Map m) {
        super(m);
    }
    
    private g B() {
        return new l();
    }
    
    private int N(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).intValue();
        }
        if (o instanceof Boolean) {
            return ((boolean)o) ? 1 : 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("can't convert: ");
        sb.append(o.getClass().getName());
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static Object c(final Object o) {
        if (o instanceof i && !(o instanceof b)) {
            return d((i)o);
        }
        if (o instanceof List) {
            return g((List<Object>)o);
        }
        Object s = o;
        if (o instanceof Map) {
            s = s((Map<String, Object>)o);
        }
        return s;
    }
    
    private static m d(final i i) {
        final m m = new m();
        for (final String key : new TreeSet<String>(i.keySet())) {
            m.put(key, c(i.j(key)));
        }
        return m;
    }
    
    private static List g(final List<Object> list) {
        final ArrayList<Object> list2 = new ArrayList<Object>(list.size());
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(c(iterator.next()));
        }
        return list2;
    }
    
    private static Map<String, Object> s(final Map<String, Object> map) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (final String s : new TreeSet<String>(map.keySet())) {
            linkedHashMap.put(s, c(map.get(s)));
        }
        return (Map<String, Object>)linkedHashMap;
    }
    
    private byte[] t() {
        return this.B().c(this);
    }
    
    public int C(final String str) {
        final Object j = this.j(str);
        if (j != null) {
            return this.N(j);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no value for: ");
        sb.append(str);
        throw new NullPointerException(sb.toString());
    }
    
    public int D(final String s, final int n) {
        final Object j = this.j(s);
        if (j == null) {
            return n;
        }
        return this.N(j);
    }
    
    public long E(final String s) {
        return ((Number)this.j(s)).longValue();
    }
    
    public long F(final String s, final long n) {
        final Object j = this.j(s);
        if (j == null) {
            return n;
        }
        return ((Number)j).longValue();
    }
    
    public ObjectId H(final String s) {
        return (ObjectId)this.j(s);
    }
    
    public ObjectId I(final String s, ObjectId objectId) {
        final Object j = this.j(s);
        if (j != null) {
            objectId = (ObjectId)j;
        }
        return objectId;
    }
    
    public String J(final String s) {
        final Object j = this.j(s);
        if (j == null) {
            return null;
        }
        return j.toString();
    }
    
    public String L(final String s, final String s2) {
        final Object j = this.j(s);
        if (j == null) {
            return s2;
        }
        return j.toString();
    }
    
    public m a(final String key, final Object value) {
        this.put(key, value);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return ((LinkedHashMap<String, V>)this).keySet().equals(i.keySet()) && Arrays.equals(this.B().c(d(this)), this.B().c(d(i)));
    }
    
    @Override
    public boolean f(final String key) {
        return super.containsKey(key);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(d(this).t());
    }
    
    @Override
    public Map i() {
        return new LinkedHashMap(this);
    }
    
    @Override
    public Object j(final String key) {
        return super.get(key);
    }
    
    @Override
    public void n(final i i) {
        for (final String key : i.keySet()) {
            this.put(key, i.j(key));
        }
    }
    
    @Override
    public void putAll(final Map map) {
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey().toString(), entry.getValue());
        }
    }
    
    @Deprecated
    @Override
    public boolean q(final String s) {
        return this.f(s);
    }
    
    @Override
    public Object r(final String key) {
        return ((HashMap<K, Object>)this).remove(key);
    }
    
    public boolean u(final String s) {
        return this.v(s, false);
    }
    
    public boolean v(final String s, final boolean b) {
        final Object j = this.j(s);
        if (j == null) {
            return b;
        }
        if (j instanceof Number) {
            return ((Number)j).intValue() > 0;
        }
        if (j instanceof Boolean) {
            return (boolean)j;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("can't coerce to bool:");
        sb.append(((Boolean)j).getClass());
        throw new IllegalArgumentException(sb.toString());
    }
    
    public Date w(final String s) {
        return (Date)this.j(s);
    }
    
    public Date x(final String s, Date date) {
        final Object j = this.j(s);
        if (j != null) {
            date = (Date)j;
        }
        return date;
    }
    
    public double y(final String s) {
        return ((Number)this.j(s)).doubleValue();
    }
    
    public double z(final String s, final double n) {
        final Object j = this.j(s);
        if (j == null) {
            return n;
        }
        return ((Number)j).doubleValue();
    }
}
