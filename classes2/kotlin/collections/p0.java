// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import n6.q;
import n6.p;
import kotlin.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k0;
import java.util.Map;
import n6.r;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\b\u00f8\u0001\u0000\u001a¹\u0001\u0010\u0012\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00142K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0016H\u0087\b\u00f8\u0001\u0000\u001a\u00da\u0001\u0010\u0018\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00142K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0081\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0014H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0095\u0001\u0010\u001d\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u00032\u0006\u0010\u001a\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0014H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0016H\u0087\b\u00f8\u0001\u0000\u001a¦\u0001\u0010!\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aK\u0010$\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00020#0\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0007¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&" }, d2 = { "T", "K", "R", "Lkotlin/collections/m0;", "Lkotlin/Function4;", "Lkotlin/t0;", "name", "key", "accumulator", "element", "", "first", "operation", "", "c", "", "M", "destination", "d", "(Lkotlin/collections/m0;Ljava/util/Map;Ln6/r;)Ljava/util/Map;", "Lkotlin/Function2;", "initialValueSelector", "Lkotlin/Function3;", "g", "i", "(Lkotlin/collections/m0;Ljava/util/Map;Ln6/p;Ln6/q;)Ljava/util/Map;", "initialValue", "f", "(Lkotlin/collections/m0;Ljava/lang/Object;Ln6/p;)Ljava/util/Map;", "h", "(Lkotlin/collections/m0;Ljava/util/Map;Ljava/lang/Object;Ln6/p;)Ljava/util/Map;", "S", "j", "k", "(Lkotlin/collections/m0;Ljava/util/Map;Ln6/q;)Ljava/util/Map;", "", "e", "(Lkotlin/collections/m0;Ljava/util/Map;)Ljava/util/Map;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/GroupingKt")
class p0 extends o0
{
    public p0() {
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R> Map<K, R> c(@e final m0<T, ? extends K> m0, @e final r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> r) {
        k0.p(m0, "$this$aggregate");
        k0.p(r, "operation");
        final LinkedHashMap<Object, Object> linkedHashMap = (LinkedHashMap<Object, Object>)new LinkedHashMap<K, Object>();
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            final Object value = linkedHashMap.get(a);
            linkedHashMap.put(a, r.I(a, (Object)value, next, Boolean.valueOf(value == null && !linkedHashMap.containsKey(a))));
        }
        return (Map<K, R>)linkedHashMap;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R, M extends Map<? super K, R>> M d(@e final m0<T, ? extends K> m0, @e final M i, @e final r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> r) {
        k0.p(m0, "$this$aggregateTo");
        k0.p(i, "destination");
        k0.p(r, "operation");
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            final R value = ((Map<K, R>)i).get(a);
            i.put((Object)a, (R)r.I(a, value, next, value == null && !i.containsKey(a)));
        }
        return i;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, M extends Map<? super K, Integer>> M e(@e final m0<T, ? extends K> m0, @e final M i) {
        k0.p(m0, "$this$eachCountTo");
        k0.p(i, "destination");
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final K a = (K)m0.a(b.next());
            Integer n = ((Map<K, Integer>)i).get(a);
            if (n == null && !i.containsKey(a)) {
                n = 0;
            }
            i.put((Object)a, Integer.valueOf(n.intValue() + 1));
        }
        return i;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R> Map<K, R> f(@e final m0<T, ? extends K> m0, final R r, @e final p<? super R, ? super T, ? extends R> p3) {
        k0.p(m0, "$this$fold");
        k0.p(p3, "operation");
        final LinkedHashMap<K, Object> linkedHashMap = new LinkedHashMap<K, Object>();
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            Object value = linkedHashMap.get(a);
            if (value == null && !linkedHashMap.containsKey(a)) {
                value = r;
            }
            linkedHashMap.put(a, p3.invoke((Object)value, next));
        }
        return (Map<K, R>)linkedHashMap;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R> Map<K, R> g(@e final m0<T, ? extends K> m0, @e final p<? super K, ? super T, ? extends R> p3, @e final q<? super K, ? super R, ? super T, ? extends R> q) {
        k0.p(m0, "$this$fold");
        k0.p(p3, "initialValueSelector");
        k0.p(q, "operation");
        final LinkedHashMap<K, Object> linkedHashMap = new LinkedHashMap<K, Object>();
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            Object o = linkedHashMap.get(a);
            if (o == null && !linkedHashMap.containsKey(a)) {
                o = p3.invoke(a, next);
            }
            linkedHashMap.put(a, q.invoke(a, (Object)o, next));
        }
        return (Map<K, R>)linkedHashMap;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R, M extends Map<? super K, R>> M h(@e final m0<T, ? extends K> m0, @e final M i, final R r, @e final p<? super R, ? super T, ? extends R> p4) {
        k0.p(m0, "$this$foldTo");
        k0.p(i, "destination");
        k0.p(p4, "operation");
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            R value = ((Map<K, R>)i).get(a);
            if (value == null && !i.containsKey(a)) {
                value = r;
            }
            i.put((Object)a, (R)p4.invoke(value, next));
        }
        return i;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T, K, R, M extends Map<? super K, R>> M i(@e final m0<T, ? extends K> m0, @e final M i, @e final p<? super K, ? super T, ? extends R> p4, @e final q<? super K, ? super R, ? super T, ? extends R> q) {
        k0.p(m0, "$this$foldTo");
        k0.p(i, "destination");
        k0.p(p4, "initialValueSelector");
        k0.p(q, "operation");
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            final T next = b.next();
            final K a = (K)m0.a(next);
            R r = ((Map<K, R>)i).get(a);
            if (r == null && !i.containsKey(a)) {
                r = (R)p4.invoke(a, next);
            }
            i.put((Object)a, (R)q.invoke(a, r, next));
        }
        return i;
    }
    
    @e1(version = "1.1")
    @e
    public static final <S, T extends S, K> Map<K, S> j(@e final m0<T, ? extends K> m0, @e final q<? super K, ? super S, ? super T, ? extends S> q) {
        k0.p(m0, "$this$reduce");
        k0.p(q, "operation");
        final LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            S n = b.next();
            final K a = (K)m0.a((T)n);
            final Object value = linkedHashMap.get(a);
            if (value != null || linkedHashMap.containsKey(a)) {
                n = (S)q.invoke(a, (Object)value, (T)n);
            }
            linkedHashMap.put(a, n);
        }
        return (Map<K, S>)linkedHashMap;
    }
    
    @e1(version = "1.1")
    @e
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@e final m0<T, ? extends K> m0, @e final M i, @e final q<? super K, ? super S, ? super T, ? extends S> q) {
        k0.p(m0, "$this$reduceTo");
        k0.p(i, "destination");
        k0.p(q, "operation");
        final Iterator<T> b = m0.b();
        while (b.hasNext()) {
            S n = b.next();
            final K a = (K)m0.a((T)n);
            final S value = ((Map<K, S>)i).get(a);
            if (value != null || i.containsKey(a)) {
                n = (S)q.invoke(a, value, (T)n);
            }
            i.put((Object)a, n);
        }
        return i;
    }
}
