// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import kotlin.collections.t0;
import n6.a;
import kotlin.j2;
import n6.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.SparseIntArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0086\b\u00f8\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\"\u0018\u0010\u001e\u001a\u00020\u0001*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f" }, d2 = { "Landroid/util/SparseIntArray;", "", "key", "", "a", "value", "Lkotlin/j2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "d", "Lkotlin/collections/t0;", "j", "o", "g", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class t
{
    public static final boolean a(@e final SparseIntArray sparseIntArray, final int n) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(n) >= 0;
    }
    
    public static final boolean b(@e final SparseIntArray sparseIntArray, final int n) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(n) >= 0;
    }
    
    public static final boolean c(@e final SparseIntArray sparseIntArray, final int n) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(n) >= 0;
    }
    
    public static final void d(@e final SparseIntArray sparseIntArray, @e final p<? super Integer, ? super Integer, j2> p2) {
        k0.p((Object)sparseIntArray, "<this>");
        k0.p((Object)p2, "action");
        final int size = sparseIntArray.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                p2.invoke((Object)sparseIntArray.keyAt(n), (Object)sparseIntArray.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final int e(@e final SparseIntArray sparseIntArray, final int n, final int n2) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.get(n, n2);
    }
    
    public static final int f(@e final SparseIntArray sparseIntArray, int n, @e final a<Integer> a) {
        k0.p((Object)sparseIntArray, "<this>");
        k0.p((Object)a, "defaultValue");
        n = sparseIntArray.indexOfKey(n);
        if (n >= 0) {
            n = sparseIntArray.valueAt(n);
        }
        else {
            n = ((Number)a.invoke()).intValue();
        }
        return n;
    }
    
    public static final int g(@e final SparseIntArray sparseIntArray) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.size();
    }
    
    public static final boolean h(@e final SparseIntArray sparseIntArray) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }
    
    public static final boolean i(@e final SparseIntArray sparseIntArray) {
        k0.p((Object)sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }
    
    @e
    public static final t0 j(@e final SparseIntArray sparseIntArray) {
        k0.p((Object)sparseIntArray, "<this>");
        return new t0() {
            private int G;
            
            public int b() {
                return sparseIntArray.keyAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseIntArray.size();
            }
        };
    }
    
    @e
    public static final SparseIntArray k(@e final SparseIntArray sparseIntArray, @e final SparseIntArray sparseIntArray2) {
        k0.p((Object)sparseIntArray, "<this>");
        k0.p((Object)sparseIntArray2, "other");
        final SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }
    
    public static final void l(@e final SparseIntArray sparseIntArray, @e final SparseIntArray sparseIntArray2) {
        k0.p((Object)sparseIntArray, "<this>");
        k0.p((Object)sparseIntArray2, "other");
        final int size = sparseIntArray2.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                sparseIntArray.put(sparseIntArray2.keyAt(n), sparseIntArray2.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final boolean m(@e final SparseIntArray sparseIntArray, int indexOfKey, final int n) {
        k0.p((Object)sparseIntArray, "<this>");
        indexOfKey = sparseIntArray.indexOfKey(indexOfKey);
        if (indexOfKey >= 0 && n == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }
    
    public static final void n(@e final SparseIntArray sparseIntArray, final int n, final int n2) {
        k0.p((Object)sparseIntArray, "<this>");
        sparseIntArray.put(n, n2);
    }
    
    @e
    public static final t0 o(@e final SparseIntArray sparseIntArray) {
        k0.p((Object)sparseIntArray, "<this>");
        return new t0() {
            private int G;
            
            public int b() {
                return sparseIntArray.valueAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseIntArray.size();
            }
        };
    }
}
