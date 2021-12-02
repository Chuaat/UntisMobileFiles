// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.parameter;

import java.util.NoSuchElementException;
import k7.g;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\bB!\b\u0000\u0012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0013\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\bJ\u0016\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\tJ\u0016\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0016\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002H\u0086\u0002¢\u0006\u0004\b\f\u0010\tJ\u0016\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\tJ\u001e\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R#\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0004\u0010\u0015¨\u0006\u0019" }, d2 = { "Lorg/koin/core/parameter/a;", "", "T", "", "i", "f", "(I)Ljava/lang/Object;", "g", "a", "()Ljava/lang/Object;", "b", "c", "d", "e", "h", "l", "", "j", "k", "", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "values", "<init>", "([Ljava/lang/Object;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    public static final int b = 5;
    public static final a c;
    @e
    private final Object[] a;
    
    static {
        c = new a(null);
    }
    
    public a(@e final Object... a) {
        k0.q((Object)a, "values");
        this.a = a;
    }
    
    private final <T> T f(final int i) {
        final Object[] a = this.a;
        if (a.length > i) {
            return (T)a[i];
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't get parameter value #");
        sb.append(i);
        sb.append(" from ");
        sb.append(this);
        throw new g(sb.toString());
    }
    
    private final <T> Object g() {
        for (final Object o : this.i()) {
            k0.y(3, "T");
            if (o instanceof Object) {
                return o;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
    
    public final <T> T a() {
        return this.f(0);
    }
    
    public final <T> T b() {
        return this.f(1);
    }
    
    public final <T> T c() {
        return this.f(2);
    }
    
    public final <T> T d() {
        return this.f(3);
    }
    
    public final <T> T e() {
        return this.f(4);
    }
    
    public final <T> T h(final int n) {
        return (T)this.a[n];
    }
    
    @e
    public final Object[] i() {
        return this.a;
    }
    
    public final boolean j() {
        return this.l() == 0;
    }
    
    public final boolean k() {
        return this.j() ^ true;
    }
    
    public final int l() {
        return this.a.length;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "org/koin/core/parameter/a$a", "", "", "MAX_PARAMS", "I", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
