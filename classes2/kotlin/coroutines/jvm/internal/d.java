// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0012" }, d2 = { "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "intercepted", "Lkotlin/j2;", "releaseIntercepted", "Lkotlin/coroutines/g;", "_context", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "completion", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class d extends a
{
    private final g _context;
    private transient kotlin.coroutines.d<Object> intercepted;
    
    public d(@f final kotlin.coroutines.d<Object> d) {
        g context;
        if (d != null) {
            context = d.getContext();
        }
        else {
            context = null;
        }
        this(d, context);
    }
    
    public d(@f final kotlin.coroutines.d<Object> d, @f final g context) {
        super(d);
        this._context = context;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g getContext() {
        final g context = this._context;
        k0.m(context);
        return context;
    }
    
    @org.jetbrains.annotations.e
    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d<Object> intercepted = this.intercepted;
        if (intercepted == null) {
            final kotlin.coroutines.e e = this.getContext().get((g.c<kotlin.coroutines.e>)kotlin.coroutines.e.q);
            Label_0049: {
                if (e != null) {
                    intercepted = e.n(this);
                    if (intercepted != null) {
                        break Label_0049;
                    }
                }
                intercepted = this;
            }
            this.intercepted = intercepted;
        }
        return intercepted;
    }
    
    @Override
    protected void releaseIntercepted() {
        final kotlin.coroutines.d<Object> intercepted = this.intercepted;
        if (intercepted != null && intercepted != this) {
            final kotlin.coroutines.e value = this.getContext().get((g.c<kotlin.coroutines.e>)kotlin.coroutines.e.q);
            k0.m(value);
            value.h(intercepted);
        }
        this.intercepted = c.G;
    }
}
