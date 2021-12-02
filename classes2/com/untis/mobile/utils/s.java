// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import java.util.concurrent.TimeUnit;
import rx.functions.b;
import rx.schedulers.c;
import java.util.concurrent.Callable;
import rx.g;
import kotlin.j2;
import android.util.Log;
import n6.l;
import kotlin.jvm.internal.k0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005J\u0014\u0010\f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003J\u0014\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003J=\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0005J=\u0010\u0010\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0005J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003J\u0014\u0010\u0012\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/utils/s;", "", "ResultFromCallback", "Lkotlin/Function0;", "callback", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "result", "Lkotlin/j2;", "task", "y", "x", "u", "resultFromCallback", "F", "J", "N", "r", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s
{
    @e
    public static final s a;
    
    static {
        a = new s();
    }
    
    private s() {
    }
    
    private static final Object A(final a a) {
        k0.p(a, "$callback");
        return a.invoke();
    }
    
    private static final void B(final l l, final Object o) {
        k0.p(l, "$task");
        l.invoke(o);
    }
    
    private static final void C(final Throwable t) {
        Log.e("untis_log", "error on Async.newThread", t);
    }
    
    private static final void D(final a a, final Boolean b) {
        k0.p(a, "$task");
        a.invoke();
    }
    
    private static final void E(final Throwable t) {
        Log.e("untis_log", "error on newThread ", t);
    }
    
    private static final Object G(final a a) {
        k0.p(a, "$callback");
        return a.invoke();
    }
    
    private static final void H(final l l, final Object o) {
        k0.p(l, "$task");
        l.invoke(o);
    }
    
    private static final void I(final Throwable t) {
        Log.e("untis_log", "error on startAsyncProcessFromCallback ", t);
    }
    
    private static final Object K(final a a) {
        k0.p(a, "$callback");
        return a.invoke();
    }
    
    private static final void L(final l l, final Object o) {
        k0.p(l, "$task");
        l.invoke(o);
    }
    
    private static final void M(final Throwable t) {
        Log.e("untis_log", "error on startAsyncProcessFromCallbackOnMainThread ", t);
    }
    
    private static final void O(final a a, final Boolean b) {
        k0.p(a, "$task");
        a.invoke();
    }
    
    private static final void P(final Throwable t) {
        Log.e("untis_log", "error on startOnMainThread ", t);
    }
    
    private static final void s(final a a, final Long n) {
        k0.p(a, "$task");
        a.invoke();
    }
    
    private static final void t(final Throwable t) {
        Log.e("untis_log", "error on delayed task", t);
    }
    
    private static final void v(final a a, final Boolean b) {
        k0.p(a, "$task");
        a.invoke();
    }
    
    private static final void w(final Throwable t) {
        Log.e("untis_log", "error on Async.io", t);
    }
    
    public final <ResultFromCallback> void F(@e final a<? extends ResultFromCallback> a, @e final l<? super ResultFromCallback, j2> l) {
        k0.p(a, "callback");
        k0.p(l, "task");
        g.H2((Callable)new k(a)).E5(c.f()).C5((b)new p(l), (b)h.G);
    }
    
    public final <ResultFromCallback> void J(@e final a<? extends ResultFromCallback> a, @e final l<? super ResultFromCallback, j2> l) {
        k0.p(a, "callback");
        k0.p(l, "task");
        g.H2((Callable)new com.untis.mobile.utils.b(a)).E5(c.f()).Q3(rx.android.schedulers.a.c()).C5((b)new r(l), (b)d.G);
    }
    
    public final void N(@e final a<j2> a) {
        k0.p(a, "task");
        g.U2((Object)Boolean.TRUE).E5(rx.android.schedulers.a.c()).C5((b)new n(a), (b)com.untis.mobile.utils.g.G);
    }
    
    public final void r(@e final a<j2> a) {
        k0.p(a, "task");
        g.w6(500L, TimeUnit.MILLISECONDS).E5(c.f()).C5((b)new o(a), (b)f.G);
    }
    
    public final void u(@e final a<j2> a) {
        k0.p(a, "task");
        g.U2((Object)Boolean.TRUE).E5(c.e()).C5((b)new com.untis.mobile.utils.l(a), (b)com.untis.mobile.utils.c.G);
    }
    
    public final void x(@e final a<j2> a) {
        k0.p(a, "task");
        g.U2((Object)Boolean.TRUE).E5(c.f()).C5((b)new m(a), (b)i.G);
    }
    
    public final <ResultFromCallback> void y(@e final a<? extends ResultFromCallback> a, @e final l<? super ResultFromCallback, j2> l) {
        k0.p(a, "callback");
        k0.p(l, "task");
        g.H2((Callable)new j(a)).E5(c.f()).Q3(rx.android.schedulers.a.c()).C5((b)new q(l), (b)com.untis.mobile.utils.e.G);
    }
}
