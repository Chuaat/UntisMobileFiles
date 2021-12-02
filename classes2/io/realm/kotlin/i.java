// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import java.util.Date;
import kotlin.jvm.internal.k0;
import io.realm.n0;
import org.jetbrains.annotations.e;
import io.realm.RealmQuery;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0005¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0005¢\u0006\u0004\b\u0018\u0010\u0019\u001aA\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0005¢\u0006\u0004\b\u001b\u0010\u001c\u001aA\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001aA\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u0005¢\u0006\u0004\b!\u0010\"¨\u0006#" }, d2 = { "Lio/realm/n0;", "T", "Lio/realm/RealmQuery;", "", "propertyName", "", "value", "Lio/realm/e;", "casing", "h", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/String;Lio/realm/e;)Lio/realm/RealmQuery;", "", "b", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Byte;)Lio/realm/RealmQuery;", "", "g", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Short;)Lio/realm/RealmQuery;", "", "e", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Integer;)Lio/realm/RealmQuery;", "", "f", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Long;)Lio/realm/RealmQuery;", "", "c", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Double;)Lio/realm/RealmQuery;", "", "d", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Float;)Lio/realm/RealmQuery;", "", "a", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Boolean;)Lio/realm/RealmQuery;", "Ljava/util/Date;", "i", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/util/Date;)Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class i
{
    @e
    public static final <T extends n0> RealmQuery<T> a(@e final RealmQuery<T> realmQuery, @e final String s, @e final Boolean[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> y0 = realmQuery.y0(s, array);
        k0.h(y0, "this.`in`(propertyName, value)");
        return y0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> b(@e final RealmQuery<T> realmQuery, @e final String s, @e final Byte[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> z0 = realmQuery.z0(s, array);
        k0.h(z0, "this.`in`(propertyName, value)");
        return z0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> c(@e final RealmQuery<T> realmQuery, @e final String s, @e final Double[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> a0 = realmQuery.A0(s, array);
        k0.h(a0, "this.`in`(propertyName, value)");
        return a0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> d(@e final RealmQuery<T> realmQuery, @e final String s, @e final Float[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> b0 = realmQuery.B0(s, array);
        k0.h(b0, "this.`in`(propertyName, value)");
        return b0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> e(@e final RealmQuery<T> realmQuery, @e final String s, @e final Integer[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> c0 = realmQuery.C0(s, array);
        k0.h(c0, "this.`in`(propertyName, value)");
        return c0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> f(@e final RealmQuery<T> realmQuery, @e final String s, @e final Long[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> d0 = realmQuery.D0(s, array);
        k0.h(d0, "this.`in`(propertyName, value)");
        return d0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> g(@e final RealmQuery<T> realmQuery, @e final String s, @e final Short[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> e0 = realmQuery.E0(s, array);
        k0.h(e0, "this.`in`(propertyName, value)");
        return e0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> h(@e final RealmQuery<T> realmQuery, @e final String s, @e final String[] array, @e final io.realm.e e) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        k0.q(e, "casing");
        final RealmQuery<T> g0 = realmQuery.G0(s, array, e);
        k0.h(g0, "this.`in`(propertyName, value, casing)");
        return g0;
    }
    
    @e
    public static final <T extends n0> RealmQuery<T> i(@e final RealmQuery<T> realmQuery, @e final String s, @e final Date[] array) {
        k0.q(realmQuery, "$this$oneOf");
        k0.q(s, "propertyName");
        k0.q(array, "value");
        final RealmQuery<T> h0 = realmQuery.H0(s, array);
        k0.h(h0, "this.`in`(propertyName, value)");
        return h0;
    }
}
