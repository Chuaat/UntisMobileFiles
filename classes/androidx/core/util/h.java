// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.util.LruCache;
import kotlin.j2;
import n6.r;
import n6.l;
import org.jetbrains.annotations.e;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u00fb\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016" }, d2 = { "", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/j2;", "onEntryRemoved", "Landroid/util/LruCache;", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final <K, V> LruCache<K, V> a(final int n, @e final p<? super K, ? super V, Integer> p4, @e final l<? super K, ? extends V> l, @e final r<? super Boolean, ? super K, ? super V, ? super V, j2> r) {
        k0.p((Object)p4, "sizeOf");
        k0.p((Object)l, "create");
        k0.p((Object)r, "onEntryRemoved");
        return new LruCache<K, V>() {
            final /* synthetic */ p<K, V, Integer> a;
            final /* synthetic */ l<K, V> b;
            final /* synthetic */ r<Boolean, K, V, V, j2> c;
            
            @f
            protected V create(@e final K k) {
                k0.p((Object)k, "key");
                return (V)this.b.invoke((Object)k);
            }
            
            protected void entryRemoved(final boolean b, @e final K k, @e final V v, @f final V v2) {
                k0.p((Object)k, "key");
                k0.p((Object)v, "oldValue");
                this.c.I((Object)b, (Object)k, (Object)v, (Object)v2);
            }
            
            protected int sizeOf(@e final K k, @e final V v) {
                k0.p((Object)k, "key");
                k0.p((Object)v, "value");
                return ((Number)this.a.invoke((Object)k, (Object)v)).intValue();
            }
        };
    }
}
