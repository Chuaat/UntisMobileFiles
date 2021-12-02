// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.streams.jdk8;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.Spliterators;
import java.util.Spliterator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import kotlin.e1;
import java.util.PrimitiveIterator;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.sequences.m;
import org.jetbrains.annotations.e;
import java.util.stream.DoubleStream;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002*\u00020\u0004H\u0007\u001a\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002*\u00020\u0007H\u0007\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002*\u00020\nH\u0007\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e*\u00020\u0004H\u0007\u001a\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e*\u00020\u0007H\u0007\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e*\u00020\nH\u0007¨\u0006\u0013" }, d2 = { "T", "Ljava/util/stream/Stream;", "Lkotlin/sequences/m;", "d", "Ljava/util/stream/IntStream;", "", "b", "Ljava/util/stream/LongStream;", "", "c", "Ljava/util/stream/DoubleStream;", "", "a", "e", "", "i", "g", "h", "f", "kotlin-stdlib-jdk8" }, k = 2, mv = { 1, 5, 1 }, pn = "kotlin.streams")
@g(name = "StreamsKt")
public final class a
{
    @e1(version = "1.2")
    @e
    public static final m<Double> a(@e final DoubleStream doubleStream) {
        k0.p((Object)doubleStream, "$this$asSequence");
        return new m<Double>() {
            @e
            @Override
            public Iterator<Double> iterator() {
                final PrimitiveIterator.OfDouble iterator = doubleStream.iterator();
                k0.o((Object)iterator, "iterator()");
                return iterator;
            }
        };
    }
    
    @e1(version = "1.2")
    @e
    public static final m<Integer> b(@e final IntStream intStream) {
        k0.p((Object)intStream, "$this$asSequence");
        return new m<Integer>() {
            @e
            @Override
            public Iterator<Integer> iterator() {
                final PrimitiveIterator.OfInt iterator = intStream.iterator();
                k0.o((Object)iterator, "iterator()");
                return iterator;
            }
        };
    }
    
    @e1(version = "1.2")
    @e
    public static final m<Long> c(@e final LongStream longStream) {
        k0.p((Object)longStream, "$this$asSequence");
        return new m<Long>() {
            @e
            @Override
            public Iterator<Long> iterator() {
                final PrimitiveIterator.OfLong iterator = longStream.iterator();
                k0.o((Object)iterator, "iterator()");
                return iterator;
            }
        };
    }
    
    @e1(version = "1.2")
    @e
    public static final <T> m<T> d(@e final Stream<T> stream) {
        k0.p((Object)stream, "$this$asSequence");
        return new m<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                final Iterator iterator = stream.iterator();
                k0.o((Object)iterator, "iterator()");
                return (Iterator<T>)iterator;
            }
        };
    }
    
    @e1(version = "1.2")
    @e
    public static final <T> Stream<T> e(@e final m<? extends T> m) {
        k0.p((Object)m, "$this$asStream");
        final Stream<T> stream = StreamSupport.stream((Supplier<? extends Spliterator<T>>)new Supplier<Spliterator<T>>() {
            public final Spliterator<T> a() {
                return Spliterators.spliteratorUnknownSize(m.iterator(), 16);
            }
        }, 16, false);
        k0.o((Object)stream, "StreamSupport.stream({ S\u2026literator.ORDERED, false)");
        return stream;
    }
    
    @e1(version = "1.2")
    @e
    public static final List<Double> f(@e final DoubleStream doubleStream) {
        k0.p((Object)doubleStream, "$this$toList");
        final double[] array = doubleStream.toArray();
        k0.o((Object)array, "toArray()");
        return (List<Double>)kotlin.collections.m.p(array);
    }
    
    @e1(version = "1.2")
    @e
    public static final List<Integer> g(@e final IntStream intStream) {
        k0.p((Object)intStream, "$this$toList");
        final int[] array = intStream.toArray();
        k0.o((Object)array, "toArray()");
        return (List<Integer>)kotlin.collections.m.r(array);
    }
    
    @e1(version = "1.2")
    @e
    public static final List<Long> h(@e final LongStream longStream) {
        k0.p((Object)longStream, "$this$toList");
        final long[] array = longStream.toArray();
        k0.o((Object)array, "toArray()");
        return (List<Long>)kotlin.collections.m.s(array);
    }
    
    @e1(version = "1.2")
    @e
    public static final <T> List<T> i(@e final Stream<T> stream) {
        k0.p((Object)stream, "$this$toList");
        final List<T> collect = stream.collect((Collector<? super T, ?, List<T>>)Collectors.toList());
        k0.o((Object)collect, "collect(Collectors.toList<T>())");
        return collect;
    }
}
