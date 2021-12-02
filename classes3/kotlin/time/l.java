// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.w;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\r" }, d2 = { "Lkotlin/Function0;", "Lkotlin/j2;", "block", "Lkotlin/time/d;", "b", "(Ln6/a;)J", "Lkotlin/time/p;", "a", "(Lkotlin/time/p;Ln6/a;)J", "T", "Lkotlin/time/r;", "d", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class l
{
    @e1(version = "1.3")
    @j
    public static final long a(@e final p p2, @e final a<j2> a) {
        k0.p((Object)p2, "$this$measureTime");
        k0.p((Object)a, "block");
        final o a2 = p2.a();
        a.invoke();
        return a2.a();
    }
    
    @e1(version = "1.3")
    @j
    public static final long b(@e final a<j2> a) {
        k0.p((Object)a, "block");
        final o a2 = p.b.c.a();
        a.invoke();
        return a2.a();
    }
    
    @e1(version = "1.3")
    @j
    @e
    public static final <T> r<T> c(@e final p p2, @e final a<? extends T> a) {
        k0.p((Object)p2, "$this$measureTimedValue");
        k0.p((Object)a, "block");
        return new r<T>(a.invoke(), p2.a().a(), null);
    }
    
    @e1(version = "1.3")
    @j
    @e
    public static final <T> r<T> d(@e final a<? extends T> a) {
        k0.p((Object)a, "block");
        return new r<T>(a.invoke(), p.b.c.a().a(), null);
    }
}
