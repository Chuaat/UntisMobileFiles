// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.instance;

import n6.l;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u001d\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010" }, d2 = { "Lorg/koin/core/instance/b;", "T", "Lorg/koin/core/instance/a;", "Lorg/koin/core/instance/c;", "context", "Lkotlin/j2;", "f", "", "e", "a", "c", "(Lorg/koin/core/instance/c;)Ljava/lang/Object;", "Lorg/koin/core/definition/b;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/b;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class b<T> extends a<T>
{
    public b(@e final org.koin.core.definition.b<T> b) {
        k0.q((Object)b, "beanDefinition");
        super(b);
    }
    
    @Override
    public void a() {
        final n6.l<T, j2> f = this.d().f();
        if (f != null) {
            final j2 j2 = (j2)f.invoke((Object)null);
        }
    }
    
    @Override
    public <T> T c(@e final c c) {
        k0.q((Object)c, "context");
        return this.b(c);
    }
    
    @Override
    public boolean e(@e final c c) {
        k0.q((Object)c, "context");
        return false;
    }
    
    @Override
    public void f(@e final c c) {
        k0.q((Object)c, "context");
    }
}
