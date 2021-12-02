// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import kotlin.ranges.g$a;
import kotlin.ranges.g;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.Range;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\f¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\f\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¨\u0006\u000f" }, d2 = { "", "T", "that", "Landroid/util/Range;", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;", "value", "c", "(Landroid/util/Range;Ljava/lang/Comparable;)Landroid/util/Range;", "other", "b", "a", "Lkotlin/ranges/g;", "e", "f", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class p
{
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> Range<T> a(@e final Range<T> range, @e final Range<T> range2) {
        k0.p((Object)range, "<this>");
        k0.p((Object)range2, "other");
        final Range intersect = range.intersect((Range)range2);
        k0.o((Object)intersect, "intersect(other)");
        return (Range<T>)intersect;
    }
    
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> Range<T> b(@e final Range<T> range, @e final Range<T> range2) {
        k0.p((Object)range, "<this>");
        k0.p((Object)range2, "other");
        final Range extend = range.extend((Range)range2);
        k0.o((Object)extend, "extend(other)");
        return (Range<T>)extend;
    }
    
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> Range<T> c(@e final Range<T> range, @e final T t) {
        k0.p((Object)range, "<this>");
        k0.p((Object)t, "value");
        final Range extend = range.extend((Comparable)t);
        k0.o((Object)extend, "extend(value)");
        return (Range<T>)extend;
    }
    
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> Range<T> d(@e final T t, @e final T t2) {
        k0.p((Object)t, "<this>");
        k0.p((Object)t2, "that");
        return (Range<T>)new Range((Comparable)t, (Comparable)t2);
    }
    
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> g<T> e(@e final Range<T> range) {
        k0.p((Object)range, "<this>");
        return (g<T>)new g<T>() {
            public T b() {
                return (T)range.getLower();
            }
            
            public boolean f(@e final T t) {
                return g$a.a((g)this, (Comparable)t);
            }
            
            public T i() {
                return (T)range.getUpper();
            }
            
            public boolean isEmpty() {
                return g$a.b((g)this);
            }
        };
    }
    
    @p0(21)
    @e
    public static final <T extends Comparable<? super T>> Range<T> f(@e final g<T> g) {
        k0.p((Object)g, "<this>");
        return (Range<T>)new Range(g.b(), g.i());
    }
}
