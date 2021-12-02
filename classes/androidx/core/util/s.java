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
import android.util.SparseBooleanArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0086\b\u00f8\u0001\u0000\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aH\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u00f8\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\"\u0018\u0010\u001f\u001a\u00020\u0001*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 " }, d2 = { "Landroid/util/SparseBooleanArray;", "", "key", "", "a", "value", "Lkotlin/j2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "d", "Lkotlin/collections/t0;", "j", "Lkotlin/collections/s;", "o", "g", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class s
{
    public static final boolean a(@e final SparseBooleanArray sparseBooleanArray, final int n) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(n) >= 0;
    }
    
    public static final boolean b(@e final SparseBooleanArray sparseBooleanArray, final int n) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(n) >= 0;
    }
    
    public static final boolean c(@e final SparseBooleanArray sparseBooleanArray, final boolean b) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(b) >= 0;
    }
    
    public static final void d(@e final SparseBooleanArray sparseBooleanArray, @e final p<? super Integer, ? super Boolean, j2> p2) {
        k0.p((Object)sparseBooleanArray, "<this>");
        k0.p((Object)p2, "action");
        final int size = sparseBooleanArray.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                p2.invoke((Object)sparseBooleanArray.keyAt(n), (Object)sparseBooleanArray.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final boolean e(@e final SparseBooleanArray sparseBooleanArray, final int n, final boolean b) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(n, b);
    }
    
    public static final boolean f(@e final SparseBooleanArray sparseBooleanArray, int indexOfKey, @e final a<Boolean> a) {
        k0.p((Object)sparseBooleanArray, "<this>");
        k0.p((Object)a, "defaultValue");
        indexOfKey = sparseBooleanArray.indexOfKey(indexOfKey);
        boolean b;
        if (indexOfKey >= 0) {
            b = sparseBooleanArray.valueAt(indexOfKey);
        }
        else {
            b = (boolean)a.invoke();
        }
        return b;
    }
    
    public static final int g(@e final SparseBooleanArray sparseBooleanArray) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }
    
    public static final boolean h(@e final SparseBooleanArray sparseBooleanArray) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }
    
    public static final boolean i(@e final SparseBooleanArray sparseBooleanArray) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }
    
    @e
    public static final t0 j(@e final SparseBooleanArray sparseBooleanArray) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return new t0() {
            private int G;
            
            public int b() {
                return sparseBooleanArray.keyAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseBooleanArray.size();
            }
        };
    }
    
    @e
    public static final SparseBooleanArray k(@e final SparseBooleanArray sparseBooleanArray, @e final SparseBooleanArray sparseBooleanArray2) {
        k0.p((Object)sparseBooleanArray, "<this>");
        k0.p((Object)sparseBooleanArray2, "other");
        final SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }
    
    public static final void l(@e final SparseBooleanArray sparseBooleanArray, @e final SparseBooleanArray sparseBooleanArray2) {
        k0.p((Object)sparseBooleanArray, "<this>");
        k0.p((Object)sparseBooleanArray2, "other");
        final int size = sparseBooleanArray2.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                sparseBooleanArray.put(sparseBooleanArray2.keyAt(n), sparseBooleanArray2.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final boolean m(@e final SparseBooleanArray sparseBooleanArray, final int n, final boolean b) {
        k0.p((Object)sparseBooleanArray, "<this>");
        final int indexOfKey = sparseBooleanArray.indexOfKey(n);
        if (indexOfKey >= 0 && b == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(n);
            return true;
        }
        return false;
    }
    
    public static final void n(@e final SparseBooleanArray sparseBooleanArray, final int n, final boolean b) {
        k0.p((Object)sparseBooleanArray, "<this>");
        sparseBooleanArray.put(n, b);
    }
    
    @e
    public static final kotlin.collections.s o(@e final SparseBooleanArray sparseBooleanArray) {
        k0.p((Object)sparseBooleanArray, "<this>");
        return new kotlin.collections.s() {
            private int G;
            
            public boolean b() {
                return sparseBooleanArray.valueAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseBooleanArray.size();
            }
        };
    }
}
