// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.definition;

import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import n6.p;
import l7.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\nH\u0086\bJZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\nH\u0086\bJZ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\nH\u0086\bJ^\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0002\b\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086\b¨\u0006\u0015" }, d2 = { "Lorg/koin/core/definition/d;", "", "T", "Ll7/a;", "qualifier", "scopeName", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Lorg/koin/core/definition/b;", "f", "d", "b", "Lorg/koin/core/definition/e;", "kind", "a", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    private final <T> b<T> a(final a a, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p4, final e e, final a a2) {
        k0.y(4, "T");
        final b<Object> b = (b<Object>)new b<T>(a, a2, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b.p(p4);
        b.r(e);
        return (b<T>)b;
    }
    
    private final <T> b<T> b(final a a, final a a2, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final e h = e.H;
        k0.y(4, "T");
        final b b = new b<T>(a, a2, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b.p(p3);
        b.r(h);
        return (b<T>)b;
    }
    
    private final <T> b<T> d(final a a, final a a2, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final e i = e.I;
        k0.y(4, "T");
        final b b = new b<T>(a, a2, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b.p(p3);
        b.r(i);
        return (b<T>)b;
    }
    
    private final <T> b<T> f(final a a, final a a2, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final e g = e.G;
        k0.y(4, "T");
        final b b = new b<T>(a, a2, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b.p(p3);
        b.r(g);
        return (b<T>)b;
    }
}
