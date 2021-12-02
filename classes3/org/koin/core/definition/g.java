// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.definition;

import kotlin.p1;
import org.jetbrains.annotations.f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00c2\u0003J&\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0019" }, d2 = { "Lorg/koin/core/definition/g;", "", "", "", "a", "T", "key", "value", "Lkotlin/j2;", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "d", "data", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class g
{
    private final Map<String, Object> a;
    
    public g() {
        this(null, 1, null);
    }
    
    public g(@e final Map<String, Object> a) {
        k0.q((Object)a, "data");
        this.a = a;
    }
    
    private final Map<String, Object> a() {
        return this.a;
    }
    
    @e
    public final g b(@e final Map<String, Object> map) {
        k0.q((Object)map, "data");
        return new g(map);
    }
    
    public final <T> T d(@e final String str) {
        k0.q((Object)str, "key");
        Object value;
        if (!((value = this.a.get(str)) instanceof Object)) {
            value = null;
        }
        if (value != null) {
            return (T)value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("missing property for '");
        sb.append(str);
        sb.append('\'');
        throw new k7.e(sb.toString());
    }
    
    @f
    public final <T> T e(@e final String s) {
        k0.q((Object)s, "key");
        Object value;
        if (!((value = this.a.get(s)) instanceof Object)) {
            value = null;
        }
        return (T)value;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof g && k0.g((Object)this.a, (Object)((g)o).a));
    }
    
    public final <T> void f(@e final String s, final T t) {
        k0.q((Object)s, "key");
        final Map<String, Object> a = this.a;
        if (t != null) {
            a.put(s, t);
            return;
        }
        throw new p1("null cannot be cast to non-null type kotlin.Any");
    }
    
    @Override
    public int hashCode() {
        final Map<String, Object> a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Properties(data=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
