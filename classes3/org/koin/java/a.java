// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.java;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import kotlin.reflect.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import m6.h;
import m6.k;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007JK\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0013\u001a\u00028\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0007¨\u0006\u0019" }, d2 = { "Lorg/koin/java/a;", "", "T", "Ljava/lang/Class;", "clazz", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "k", "f", "(Ljava/lang/Class;Ll7/a;Ln6/a;)Ljava/lang/Object;", "P", "S", "primary", "secondary", "b", "(Ljava/lang/Class;Ljava/lang/Class;Ln6/a;)Ljava/lang/Object;", "Lorg/koin/core/a;", "h", "<init>", "()V", "koin-java" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    @k
    @h
    @e
    public static final <P, S> S a(@e final Class<P> clazz, @e final Class<S> clazz2) {
        return (S)c(clazz, clazz2, null, 4, null);
    }
    
    @k
    @h
    @e
    public static final <P, S> S b(@e final Class<P> clazz, @e final Class<S> clazz2, @f final n6.a<org.koin.core.parameter.a> a) {
        k0.q((Object)clazz, "primary");
        k0.q((Object)clazz2, "secondary");
        return h().a((d<?>)m6.a.g((Class)clazz), (d<?>)m6.a.g((Class)clazz2), a);
    }
    
    @k
    @h
    @e
    public static /* synthetic */ Object c(final Class clazz, final Class clazz2, n6.a a, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            a = null;
        }
        return b((Class<Object>)clazz, (Class<Object>)clazz2, (n6.a<org.koin.core.parameter.a>)a);
    }
    
    @k
    @h
    @e
    public static final <T> T d(@e final Class<T> clazz) {
        return (T)g(clazz, null, null, 6, null);
    }
    
    @k
    @h
    @e
    public static final <T> T e(@e final Class<T> clazz, @f final l7.a a) {
        return (T)g(clazz, a, null, 4, null);
    }
    
    @k
    @h
    @e
    public static final <T> T f(@e final Class<T> clazz, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)clazz, "clazz");
        final d g = m6.a.g((Class)clazz);
        Object o = h().l((d<?>)g, a, a2);
        if (o == null) {
            o = h().l((d<?>)g, a, a2);
        }
        return (T)o;
    }
    
    @k
    @h
    @e
    public static /* synthetic */ Object g(final Class clazz, l7.a a, n6.a a2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            a = null;
        }
        if ((n & 0x4) != 0x0) {
            a2 = null;
        }
        return f((Class<Object>)clazz, a, (n6.a<org.koin.core.parameter.a>)a2);
    }
    
    @k
    @e
    public static final org.koin.core.a h() {
        return org.koin.core.context.a.a().j();
    }
    
    @k
    @h
    @e
    public static final <T> b0<T> i(@e final Class<T> clazz) {
        return (b0<T>)l(clazz, null, null, 6, null);
    }
    
    @k
    @h
    @e
    public static final <T> b0<T> j(@e final Class<T> clazz, @f final l7.a a) {
        return (b0<T>)l(clazz, a, null, 4, null);
    }
    
    @k
    @h
    @e
    public static final <T> b0<T> k(@e final Class<T> clazz, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)clazz, "clazz");
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            @e
            public final T invoke() {
                return org.koin.java.a.f(clazz, a, a2);
            }
        });
    }
    
    @k
    @h
    @e
    public static /* synthetic */ b0 l(final Class clazz, l7.a a, n6.a a2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            a = null;
        }
        if ((n & 0x4) != 0x0) {
            a2 = null;
        }
        return k((Class<Object>)clazz, a, (n6.a<org.koin.core.parameter.a>)a2);
    }
}
