// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.instance;

import n6.l;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import org.koin.core.definition.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u001d\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013" }, d2 = { "Lorg/koin/core/instance/e;", "T", "Lorg/koin/core/instance/a;", "Lorg/koin/core/instance/c;", "context", "", "e", "Lkotlin/j2;", "f", "a", "c", "(Lorg/koin/core/instance/c;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "value", "Lorg/koin/core/definition/b;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/b;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class e<T> extends a<T>
{
    private T d;
    
    public e(@org.jetbrains.annotations.e final b<T> b) {
        k0.q((Object)b, "beanDefinition");
        super(b);
    }
    
    @Override
    public void a() {
        final n6.l<T, j2> f = this.d().f();
        if (f != null) {
            final j2 j2 = (j2)f.invoke((Object)this.d);
        }
        this.d = null;
    }
    
    @Override
    public <T> T c(@org.jetbrains.annotations.e final c c) {
        k0.q((Object)c, "context");
        if (this.d == null) {
            this.d = this.b(c);
        }
        Object d;
        if (!((d = this.d) instanceof Object)) {
            d = null;
        }
        if (d != null) {
            return (T)d;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }
    
    @Override
    public boolean e(@org.jetbrains.annotations.e final c c) {
        k0.q((Object)c, "context");
        return this.d != null;
    }
    
    @Override
    public void f(@org.jetbrains.annotations.e final c c) {
        k0.q((Object)c, "context");
    }
}
