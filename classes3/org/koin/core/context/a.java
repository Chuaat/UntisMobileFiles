// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.context;

import kotlin.j2;
import k7.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.k;
import org.jetbrains.annotations.f;
import org.koin.core.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lorg/koin/core/context/a;", "", "Lorg/koin/core/b;", "a", "c", "koinApplication", "Lkotlin/j2;", "e", "f", "Lorg/koin/core/b;", "b", "()Lorg/koin/core/b;", "d", "(Lorg/koin/core/b;)V", "app", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @f
    private static b a;
    public static final a b;
    
    static {
        b = new a();
    }
    
    private a() {
    }
    
    @k
    @e
    public static final b a() {
        final b a = org.koin.core.context.a.a;
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }
    
    @k
    @f
    public static final b c() {
        return org.koin.core.context.a.a;
    }
    
    @k
    public static final void e(@e final b a) {
        k0.q((Object)a, "koinApplication");
        if (a.a == null) {
            a.a = a;
            return;
        }
        throw new d("A Koin Application has already been started");
    }
    
    @k
    public static final void f() {
        synchronized (org.koin.core.context.a.b) {
            final b a = org.koin.core.context.a.a;
            if (a != null) {
                a.d();
            }
            org.koin.core.context.a.a = null;
            final j2 a2 = j2.a;
        }
    }
    
    @f
    public final b b() {
        return org.koin.core.context.a.a;
    }
    
    public final void d(@f final b a) {
        a.a = a;
    }
}
