// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import c7.a;
import kotlin.coroutines.intrinsics.b;
import n6.p;
import kotlin.coroutines.g;
import kotlin.j2;
import kotlin.Metadata;
import kotlinx.coroutines.selects.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010!\u001a\u00020 \u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014¢\u0006\u0002\b%\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010'J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016JX\u0010\u0018\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0013\u001a\u00028\u00002(\u0010\u0017\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006(" }, d2 = { "Lkotlinx/coroutines/channels/a0;", "E", "Lkotlinx/coroutines/channels/d;", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/l0;", "Lkotlin/j2;", "w1", "element", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "", "cause", "I", "R", "Lkotlinx/coroutines/selects/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "P", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Ln6/p;)V", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "K", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/o;", "channel", "Lkotlinx/coroutines/channels/f;", "Lkotlin/s;", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/o;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class a0<E> extends d<E> implements e<E, l0<? super E>>
{
    private kotlin.coroutines.d<? super j2> K;
    
    public a0(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final o<E> o, @org.jetbrains.annotations.e final n6.p<? super f<E>, ? super kotlin.coroutines.d<? super j2>, ?> p3) {
        super(g, o, false);
        this.K = (kotlin.coroutines.d<? super j2>)b.c((n6.p)p3, (Object)this, (kotlin.coroutines.d)this);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e<E, l0<E>> A() {
        return (e<E, l0<E>>)this;
    }
    
    @Override
    public boolean I(@org.jetbrains.annotations.f final Throwable t) {
        final boolean i = super.I(t);
        this.start();
        return i;
    }
    
    @Override
    public <R> void P(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, final E e, @org.jetbrains.annotations.e final n6.p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> p3) {
        this.start();
        super.A().P((kotlinx.coroutines.selects.f<? super Object>)f, e, (n6.p<? super l0<E>, ? super kotlin.coroutines.d<? super Object>, ?>)p3);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object U(final E e, @org.jetbrains.annotations.e final kotlin.coroutines.d<? super j2> d) {
        this.start();
        final Object u = super.U(e, d);
        if (u == b.h()) {
            return u;
        }
        return j2.a;
    }
    
    @Override
    public boolean offer(final E e) {
        this.start();
        return super.offer(e);
    }
    
    @Override
    protected void w1() {
        a.b(this.K, (kotlin.coroutines.d<?>)this);
    }
}
