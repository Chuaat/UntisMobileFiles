// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import kotlin.c1;
import kotlin.b1;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.Metadata;
import java.io.Serializable;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R#\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c" }, d2 = { "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/coroutines/d;", "getCompletion", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class a implements d<Object>, e, Serializable
{
    @f
    private final d<Object> completion;
    
    public a(@f final d<Object> completion) {
        this.completion = completion;
    }
    
    @org.jetbrains.annotations.e
    public d<j2> create(@f final Object o, @org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    @org.jetbrains.annotations.e
    public d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }
    
    @f
    @Override
    public e getCallerFrame() {
        Object completion;
        if (!((completion = this.completion) instanceof e)) {
            completion = null;
        }
        return (e)completion;
    }
    
    @f
    public final d<Object> getCompletion() {
        return this.completion;
    }
    
    @f
    @Override
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }
    
    @f
    protected abstract Object invokeSuspend(@org.jetbrains.annotations.e final Object p0);
    
    protected void releaseIntercepted() {
    }
    
    @Override
    public final void resumeWith(@org.jetbrains.annotations.e Object o) {
        a a = this;
        d<Object> completion;
        while (true) {
            h.b(a);
            completion = a.completion;
            k0.m(completion);
            try {
                final Object invokeSuspend = a.invokeSuspend(o);
                if (invokeSuspend == b.h()) {
                    return;
                }
                final b1.a h = b1.H;
                o = b1.b(invokeSuspend);
            }
            finally {
                final b1.a h2 = b1.H;
                final Throwable t;
                o = b1.b(c1.a(t));
            }
            a.releaseIntercepted();
            if (!(completion instanceof a)) {
                break;
            }
            a = (a)completion;
        }
        completion.resumeWith(o);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable obj = this.getStackTraceElement();
        if (obj == null) {
            obj = this.getClass().getName();
        }
        sb.append(obj);
        return sb.toString();
    }
}
