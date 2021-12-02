// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import kotlin.s0;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.Pair;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b\u001a,\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0087\n¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\b\u001a1\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¨\u0006\u000f" }, d2 = { "F", "S", "Landroidx/core/util/j;", "b", "(Landroidx/core/util/j;)Ljava/lang/Object;", "d", "Lkotlin/s0;", "h", "f", "Landroid/util/Pair;", "a", "(Landroid/util/Pair;)Ljava/lang/Object;", "c", "g", "e", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    @SuppressLint({ "UnknownNullness" })
    public static final <F, S> F a(@e final Pair<F, S> pair) {
        k0.p((Object)pair, "<this>");
        return (F)pair.first;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public static final <F, S> F b(@e final j<F, S> j) {
        k0.p((Object)j, "<this>");
        return j.a;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public static final <F, S> S c(@e final Pair<F, S> pair) {
        k0.p((Object)pair, "<this>");
        return (S)pair.second;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public static final <F, S> S d(@e final j<F, S> j) {
        k0.p((Object)j, "<this>");
        return j.b;
    }
    
    @e
    public static final <F, S> Pair<F, S> e(@e final s0<? extends F, ? extends S> s0) {
        k0.p((Object)s0, "<this>");
        return (Pair<F, S>)new Pair(s0.e(), s0.f());
    }
    
    @e
    public static final <F, S> j<F, S> f(@e final s0<? extends F, ? extends S> s0) {
        k0.p((Object)s0, "<this>");
        return new j<F, S>((F)s0.e(), (S)s0.f());
    }
    
    @e
    public static final <F, S> s0<F, S> g(@e final Pair<F, S> pair) {
        k0.p((Object)pair, "<this>");
        return (s0<F, S>)new s0(pair.first, pair.second);
    }
    
    @e
    public static final <F, S> s0<F, S> h(@e final j<F, S> j) {
        k0.p((Object)j, "<this>");
        return (s0<F, S>)new s0((Object)j.a, (Object)j.b);
    }
}
