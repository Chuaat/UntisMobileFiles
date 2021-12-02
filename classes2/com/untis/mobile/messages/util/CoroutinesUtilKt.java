// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import org.jetbrains.annotations.f;
import kotlinx.coroutines.d1;
import kotlin.ranges.o;
import kotlin.c1;
import kotlin.jvm.internal.j1;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a_\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "T", "", "times", "", "initialDelayInMillis", "maxDelayInMillis", "", "factor", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "retryIO", "(IJJDLn6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class CoroutinesUtilKt
{
    @f
    public static final <T> Object retryIO(int n, long j$0, long g, double n2, @e l<? super d<? super T>, ?> l$0, @e d<? super T> coroutinesUtilKt$retryIO$1) {
        Label_0058: {
            if (coroutinesUtilKt$retryIO$1 instanceof CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1) {
                final CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1 coroutinesUtilKt$retryIO$2 = coroutinesUtilKt$retryIO$1;
                final int label = coroutinesUtilKt$retryIO$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    coroutinesUtilKt$retryIO$2.label = label + Integer.MIN_VALUE;
                    coroutinesUtilKt$retryIO$1 = coroutinesUtilKt$retryIO$2;
                    break Label_0058;
                }
            }
            coroutinesUtilKt$retryIO$1 = new CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1((d)coroutinesUtilKt$retryIO$1);
        }
        Object l$2 = coroutinesUtilKt$retryIO$1.result;
        Object h = b.h();
        final int label2 = coroutinesUtilKt$retryIO$1.label;
        while (true) {
            int n3 = 0;
            j1.g l$3 = null;
            Label_0408: {
                Label_0291: {
                    Label_0251: {
                        if (label2 == 0) {
                            break Label_0251;
                        }
                        if (label2 == 1) {
                            n3 = coroutinesUtilKt$retryIO$1.I$1;
                            n = coroutinesUtilKt$retryIO$1.I$0;
                            n2 = coroutinesUtilKt$retryIO$1.D$0;
                            j$0 = coroutinesUtilKt$retryIO$1.J$0;
                            l$3 = (j1.g)coroutinesUtilKt$retryIO$1.L$1;
                            l$0 = coroutinesUtilKt$retryIO$1.L$0;
                            try {
                                c1.n(l$2);
                                return l$2;
                            }
                            catch (Exception ex) {
                                break Label_0408;
                            }
                            break Label_0251;
                        }
                        Object o;
                        CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1 coroutinesUtilKt$retryIO$3;
                        if (label2 != 2) {
                            if (label2 == 3) {
                                c1.n(l$2);
                                return l$2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            n3 = coroutinesUtilKt$retryIO$1.I$1;
                            n = coroutinesUtilKt$retryIO$1.I$0;
                            n2 = coroutinesUtilKt$retryIO$1.D$0;
                            j$0 = coroutinesUtilKt$retryIO$1.J$0;
                            l$3 = (j1.g)coroutinesUtilKt$retryIO$1.L$1;
                            l$0 = coroutinesUtilKt$retryIO$1.L$0;
                            c1.n(l$2);
                            o = h;
                            coroutinesUtilKt$retryIO$3 = coroutinesUtilKt$retryIO$1;
                        }
                        coroutinesUtilKt$retryIO$1 = coroutinesUtilKt$retryIO$3;
                        h = l$3;
                        final Object o2 = o;
                        ((j1.g)h).G = kotlin.ranges.o.v((long)(((j1.g)h).G * n2), j$0);
                        final int n4 = n + 1;
                        l$2 = l$0;
                        l$0 = o2;
                        n = n3;
                        n3 = n4;
                        break Label_0291;
                    }
                    c1.n(l$2);
                    final j1.g g2 = new j1.g();
                    g2.G = j$0;
                    l$2 = l$0;
                    l$0 = h;
                    --n;
                    n3 = 0;
                    j$0 = g;
                    h = g2;
                }
                if (n3 >= n) {
                    coroutinesUtilKt$retryIO$1.L$0 = null;
                    coroutinesUtilKt$retryIO$1.L$1 = null;
                    coroutinesUtilKt$retryIO$1.label = 3;
                    if ((l$2 = ((l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, Object>>>)l$2).invoke(coroutinesUtilKt$retryIO$1)) == l$0) {
                        return l$0;
                    }
                    return l$2;
                }
                kotlin.coroutines.jvm.internal.b.f(n3).intValue();
                try {
                    coroutinesUtilKt$retryIO$1.L$0 = l$2;
                    coroutinesUtilKt$retryIO$1.L$1 = h;
                    coroutinesUtilKt$retryIO$1.J$0 = j$0;
                    coroutinesUtilKt$retryIO$1.D$0 = n2;
                    coroutinesUtilKt$retryIO$1.I$0 = n3;
                    coroutinesUtilKt$retryIO$1.I$1 = n;
                    coroutinesUtilKt$retryIO$1.label = 1;
                    if ((l$2 = ((l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, Object>>>)l$2).invoke(coroutinesUtilKt$retryIO$1)) == l$0) {
                        return l$0;
                    }
                    return l$2;
                }
                catch (Exception ex2) {
                    final int n5 = n3;
                    final l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, Object>>> l = (l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, l<CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1, Object>>>)l$0;
                    n3 = n;
                    l$0 = l$2;
                    l$3 = (j1.g)h;
                    n = n5;
                    h = l;
                }
            }
            g = l$3.G;
            coroutinesUtilKt$retryIO$1.L$0 = l$0;
            coroutinesUtilKt$retryIO$1.L$1 = l$3;
            coroutinesUtilKt$retryIO$1.J$0 = j$0;
            coroutinesUtilKt$retryIO$1.D$0 = n2;
            coroutinesUtilKt$retryIO$1.I$0 = n;
            coroutinesUtilKt$retryIO$1.I$1 = n3;
            coroutinesUtilKt$retryIO$1.label = 2;
            CoroutinesUtilKt$retryIO.CoroutinesUtilKt$retryIO$1 coroutinesUtilKt$retryIO$3 = coroutinesUtilKt$retryIO$1;
            Object o = h;
            if (d1.b(g, (d)coroutinesUtilKt$retryIO$1) == h) {
                return h;
            }
            continue;
        }
    }
}
