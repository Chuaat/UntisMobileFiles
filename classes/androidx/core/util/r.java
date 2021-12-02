// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import java.util.Iterator;
import kotlin.collections.t0;
import n6.a;
import kotlin.j2;
import n6.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.SparseArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\b\u00f8\u0001\u0000\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"$\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&" }, d2 = { "T", "Landroid/util/SparseArray;", "", "key", "", "a", "value", "Lkotlin/j2;", "n", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "k", "b", "c", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "e", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "f", "(Landroid/util/SparseArray;ILn6/a;)Ljava/lang/Object;", "h", "i", "m", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "l", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "d", "Lkotlin/collections/t0;", "j", "", "o", "g", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class r
{
    public static final <T> boolean a(@e final SparseArray<T> sparseArray, final int n) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.indexOfKey(n) >= 0;
    }
    
    public static final <T> boolean b(@e final SparseArray<T> sparseArray, final int n) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.indexOfKey(n) >= 0;
    }
    
    public static final <T> boolean c(@e final SparseArray<T> sparseArray, final T t) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.indexOfValue((Object)t) >= 0;
    }
    
    public static final <T> void d(@e final SparseArray<T> sparseArray, @e final p<? super Integer, ? super T, j2> p2) {
        k0.p((Object)sparseArray, "<this>");
        k0.p((Object)p2, "action");
        final int size = sparseArray.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                p2.invoke((Object)sparseArray.keyAt(n), sparseArray.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final <T> T e(@e final SparseArray<T> sparseArray, final int n, final T t) {
        k0.p((Object)sparseArray, "<this>");
        Object value = sparseArray.get(n);
        if (value == null) {
            value = t;
        }
        return (T)value;
    }
    
    public static final <T> T f(@e final SparseArray<T> sparseArray, final int n, @e final a<? extends T> a) {
        k0.p((Object)sparseArray, "<this>");
        k0.p((Object)a, "defaultValue");
        Object o;
        if ((o = sparseArray.get(n)) == null) {
            o = a.invoke();
        }
        return (T)o;
    }
    
    public static final <T> int g(@e final SparseArray<T> sparseArray) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.size();
    }
    
    public static final <T> boolean h(@e final SparseArray<T> sparseArray) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.size() == 0;
    }
    
    public static final <T> boolean i(@e final SparseArray<T> sparseArray) {
        k0.p((Object)sparseArray, "<this>");
        return sparseArray.size() != 0;
    }
    
    @e
    public static final <T> t0 j(@e final SparseArray<T> sparseArray) {
        k0.p((Object)sparseArray, "<this>");
        return new t0() {
            private int G;
            
            public int b() {
                return sparseArray.keyAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseArray.size();
            }
        };
    }
    
    @e
    public static final <T> SparseArray<T> k(@e final SparseArray<T> sparseArray, @e final SparseArray<T> sparseArray2) {
        k0.p((Object)sparseArray, "<this>");
        k0.p((Object)sparseArray2, "other");
        final SparseArray sparseArray3 = new SparseArray(sparseArray.size() + sparseArray2.size());
        l((android.util.SparseArray<Object>)sparseArray3, (android.util.SparseArray<Object>)sparseArray);
        l((android.util.SparseArray<Object>)sparseArray3, (android.util.SparseArray<Object>)sparseArray2);
        return (SparseArray<T>)sparseArray3;
    }
    
    public static final <T> void l(@e final SparseArray<T> sparseArray, @e final SparseArray<T> sparseArray2) {
        k0.p((Object)sparseArray, "<this>");
        k0.p((Object)sparseArray2, "other");
        final int size = sparseArray2.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                sparseArray.put(sparseArray2.keyAt(n), sparseArray2.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final <T> boolean m(@e final SparseArray<T> sparseArray, int indexOfKey, final T t) {
        k0.p((Object)sparseArray, "<this>");
        indexOfKey = sparseArray.indexOfKey(indexOfKey);
        if (indexOfKey >= 0 && k0.g((Object)t, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }
    
    public static final <T> void n(@e final SparseArray<T> sparseArray, final int n, final T t) {
        k0.p((Object)sparseArray, "<this>");
        sparseArray.put(n, (Object)t);
    }
    
    @e
    public static final <T> Iterator<T> o(@e final SparseArray<T> sparseArray) {
        k0.p((Object)sparseArray, "<this>");
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
                return this.G < sparseArray.size();
            }
            
            @Override
            public T next() {
                return (T)sparseArray.valueAt(this.G++);
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
