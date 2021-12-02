// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import java.util.Iterator;
import kotlin.collections.u0;
import n6.a;
import kotlin.j2;
import n6.p;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.LongSparseArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b\u001a/\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0087\b\u00f8\u0001\u0000\u001a\u0018\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\"$\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'" }, d2 = { "T", "Landroid/util/LongSparseArray;", "", "key", "", "a", "value", "Lkotlin/j2;", "n", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/LongSparseArray;JLn6/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "d", "Lkotlin/collections/u0;", "j", "", "o", "", "g", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class g
{
    @p0(16)
    public static final <T> boolean a(@e final LongSparseArray<T> longSparseArray, final long n) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.indexOfKey(n) >= 0;
    }
    
    @p0(16)
    public static final <T> boolean b(@e final LongSparseArray<T> longSparseArray, final long n) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.indexOfKey(n) >= 0;
    }
    
    @p0(16)
    public static final <T> boolean c(@e final LongSparseArray<T> longSparseArray, final T t) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.indexOfValue((Object)t) >= 0;
    }
    
    @p0(16)
    public static final <T> void d(@e final LongSparseArray<T> longSparseArray, @e final p<? super Long, ? super T, j2> p2) {
        k0.p((Object)longSparseArray, "<this>");
        k0.p((Object)p2, "action");
        final int size = longSparseArray.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                p2.invoke((Object)longSparseArray.keyAt(n), longSparseArray.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    @p0(16)
    public static final <T> T e(@e final LongSparseArray<T> longSparseArray, final long n, T t) {
        k0.p((Object)longSparseArray, "<this>");
        final Object value = longSparseArray.get(n);
        if (value != null) {
            t = (T)value;
        }
        return t;
    }
    
    @p0(16)
    public static final <T> T f(@e final LongSparseArray<T> longSparseArray, final long n, @e final a<? extends T> a) {
        k0.p((Object)longSparseArray, "<this>");
        k0.p((Object)a, "defaultValue");
        Object o;
        if ((o = longSparseArray.get(n)) == null) {
            o = a.invoke();
        }
        return (T)o;
    }
    
    @p0(16)
    public static final <T> int g(@e final LongSparseArray<T> longSparseArray) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.size();
    }
    
    @p0(16)
    public static final <T> boolean h(@e final LongSparseArray<T> longSparseArray) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }
    
    @p0(16)
    public static final <T> boolean i(@e final LongSparseArray<T> longSparseArray) {
        k0.p((Object)longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }
    
    @p0(16)
    @e
    public static final <T> u0 j(@e final LongSparseArray<T> longSparseArray) {
        k0.p((Object)longSparseArray, "<this>");
        return new u0() {
            private int G;
            
            public long b() {
                return longSparseArray.keyAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < longSparseArray.size();
            }
        };
    }
    
    @p0(16)
    @e
    public static final <T> LongSparseArray<T> k(@e final LongSparseArray<T> longSparseArray, @e final LongSparseArray<T> longSparseArray2) {
        k0.p((Object)longSparseArray, "<this>");
        k0.p((Object)longSparseArray2, "other");
        final LongSparseArray longSparseArray3 = new LongSparseArray(longSparseArray.size() + longSparseArray2.size());
        l((android.util.LongSparseArray<Object>)longSparseArray3, (android.util.LongSparseArray<Object>)longSparseArray);
        l((android.util.LongSparseArray<Object>)longSparseArray3, (android.util.LongSparseArray<Object>)longSparseArray2);
        return (LongSparseArray<T>)longSparseArray3;
    }
    
    @p0(16)
    public static final <T> void l(@e final LongSparseArray<T> longSparseArray, @e final LongSparseArray<T> longSparseArray2) {
        k0.p((Object)longSparseArray, "<this>");
        k0.p((Object)longSparseArray2, "other");
        final int size = longSparseArray2.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                longSparseArray.put(longSparseArray2.keyAt(n), longSparseArray2.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    @p0(16)
    public static final <T> boolean m(@e final LongSparseArray<T> longSparseArray, final long n, final T t) {
        k0.p((Object)longSparseArray, "<this>");
        final int indexOfKey = longSparseArray.indexOfKey(n);
        if (indexOfKey >= 0 && k0.g((Object)t, longSparseArray.valueAt(indexOfKey))) {
            longSparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }
    
    @p0(16)
    public static final <T> void n(@e final LongSparseArray<T> longSparseArray, final long n, final T t) {
        k0.p((Object)longSparseArray, "<this>");
        longSparseArray.put(n, (Object)t);
    }
    
    @p0(16)
    @e
    public static final <T> Iterator<T> o(@e final LongSparseArray<T> longSparseArray) {
        k0.p((Object)longSparseArray, "<this>");
        return new Iterator<T>() {
            private int G;
            
            public final int a() {
                return this.G;
            }
            
            public final void b(final int g) {
                this.G = g;
            }
            
            @Override
            public boolean hasNext() {
                return this.G < longSparseArray.size();
            }
            
            @Override
            public T next() {
                return (T)longSparseArray.valueAt(this.G++);
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
