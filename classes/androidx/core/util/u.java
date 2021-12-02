// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import kotlin.collections.u0;
import kotlin.collections.t0;
import n6.a;
import kotlin.j2;
import n6.p;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.SparseLongArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0087\b\u001a&\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0087\b\u00f8\u0001\u0000\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0087\b\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0007\u001aH\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0087\b\u00f8\u0001\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0007\u001a\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0007\"\u0018\u0010 \u001a\u00020\u0001*\u00020\u00008\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!" }, d2 = { "Landroid/util/SparseLongArray;", "", "key", "", "a", "", "value", "Lkotlin/j2;", "n", "other", "k", "b", "c", "defaultValue", "e", "Lkotlin/Function0;", "f", "h", "i", "m", "l", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "action", "d", "Lkotlin/collections/t0;", "j", "Lkotlin/collections/u0;", "o", "g", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class u
{
    @p0(18)
    public static final boolean a(@e final SparseLongArray sparseLongArray, final int n) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(n) >= 0;
    }
    
    @p0(18)
    public static final boolean b(@e final SparseLongArray sparseLongArray, final int n) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(n) >= 0;
    }
    
    @p0(18)
    public static final boolean c(@e final SparseLongArray sparseLongArray, final long n) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(n) >= 0;
    }
    
    @p0(18)
    public static final void d(@e final SparseLongArray sparseLongArray, @e final p<? super Integer, ? super Long, j2> p2) {
        k0.p((Object)sparseLongArray, "<this>");
        k0.p((Object)p2, "action");
        final int size = sparseLongArray.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                p2.invoke((Object)sparseLongArray.keyAt(n), (Object)sparseLongArray.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    @p0(18)
    public static final long e(@e final SparseLongArray sparseLongArray, final int n, final long n2) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.get(n, n2);
    }
    
    @p0(18)
    public static final long f(@e final SparseLongArray sparseLongArray, int indexOfKey, @e final a<Long> a) {
        k0.p((Object)sparseLongArray, "<this>");
        k0.p((Object)a, "defaultValue");
        indexOfKey = sparseLongArray.indexOfKey(indexOfKey);
        long n;
        if (indexOfKey >= 0) {
            n = sparseLongArray.valueAt(indexOfKey);
        }
        else {
            n = ((Number)a.invoke()).longValue();
        }
        return n;
    }
    
    @p0(18)
    public static final int g(@e final SparseLongArray sparseLongArray) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.size();
    }
    
    @p0(18)
    public static final boolean h(@e final SparseLongArray sparseLongArray) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }
    
    @p0(18)
    public static final boolean i(@e final SparseLongArray sparseLongArray) {
        k0.p((Object)sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }
    
    @p0(18)
    @e
    public static final t0 j(@e final SparseLongArray sparseLongArray) {
        k0.p((Object)sparseLongArray, "<this>");
        return new t0() {
            private int G;
            
            public int b() {
                return sparseLongArray.keyAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseLongArray.size();
            }
        };
    }
    
    @p0(18)
    @e
    public static final SparseLongArray k(@e final SparseLongArray sparseLongArray, @e final SparseLongArray sparseLongArray2) {
        k0.p((Object)sparseLongArray, "<this>");
        k0.p((Object)sparseLongArray2, "other");
        final SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }
    
    @p0(18)
    public static final void l(@e final SparseLongArray sparseLongArray, @e final SparseLongArray sparseLongArray2) {
        k0.p((Object)sparseLongArray, "<this>");
        k0.p((Object)sparseLongArray2, "other");
        final int size = sparseLongArray2.size();
        if (size > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                sparseLongArray.put(sparseLongArray2.keyAt(n), sparseLongArray2.valueAt(n));
                if (n2 >= size) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    @p0(18)
    public static final boolean m(@e final SparseLongArray sparseLongArray, int indexOfKey, final long n) {
        k0.p((Object)sparseLongArray, "<this>");
        indexOfKey = sparseLongArray.indexOfKey(indexOfKey);
        if (indexOfKey >= 0 && n == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }
    
    @p0(18)
    public static final void n(@e final SparseLongArray sparseLongArray, final int n, final long n2) {
        k0.p((Object)sparseLongArray, "<this>");
        sparseLongArray.put(n, n2);
    }
    
    @p0(18)
    @e
    public static final u0 o(@e final SparseLongArray sparseLongArray) {
        k0.p((Object)sparseLongArray, "<this>");
        return new u0() {
            private int G;
            
            public long b() {
                return sparseLongArray.valueAt(this.G++);
            }
            
            public final int c() {
                return this.G;
            }
            
            public final void d(final int g) {
                this.G = g;
            }
            
            public boolean hasNext() {
                return this.G < sparseLongArray.size();
            }
        };
    }
}
