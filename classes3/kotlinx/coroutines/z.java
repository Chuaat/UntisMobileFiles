// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import n6.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;
import kotlinx.coroutines.selects.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0001\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00148P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#" }, d2 = { "Lkotlinx/coroutines/z;", "T", "Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/selects/d;", "j", "()Ljava/lang/Object;", "x", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/j2;", "i", "(Lkotlinx/coroutines/selects/f;Ln6/p;)V", "value", "", "(Ljava/lang/Object;)Z", "", "exception", "f", "o", "()Lkotlinx/coroutines/selects/d;", "onAwait", "C0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/k2;", "parent", "<init>", "(Lkotlinx/coroutines/k2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class z<T> extends s2 implements y<T>, d<T>
{
    public z(@f final k2 k2) {
        super(true);
        this.I0(k2);
    }
    
    @Override
    public boolean C0() {
        return true;
    }
    
    @Override
    public boolean T(final T t) {
        return this.Q0(t);
    }
    
    @Override
    public boolean f(@e final Throwable t) {
        return this.Q0(new d0(t, false, 2, null));
    }
    
    @Override
    public <R> void i(@e final kotlinx.coroutines.selects.f<? super R> f, @e final p<? super T, ? super kotlin.coroutines.d<? super R>, ?> p2) {
        this.d1((kotlinx.coroutines.selects.f<? super Object>)f, (n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
    }
    
    @Override
    public T j() {
        return (T)this.w0();
    }
    
    @e
    @Override
    public d<T> o() {
        return this;
    }
    
    @f
    @Override
    public Object x(@e final kotlin.coroutines.d<? super T> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof z$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (z$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ z I;
                
                @f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.x((kotlin.coroutines.d<? super T>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Object g2;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            g2 = g;
        }
        else {
            c1.n(g);
            d3.H = 1;
            if ((g2 = this.g0((kotlin.coroutines.d<Object>)d3)) == h2) {
                return h2;
            }
        }
        return g2;
    }
}
