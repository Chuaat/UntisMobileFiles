// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.instance;

import org.koin.core.parameter.b;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import org.koin.core.parameter.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0010\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0016" }, d2 = { "Lorg/koin/core/instance/c;", "", "Lorg/koin/core/a;", "b", "Lorg/koin/core/a;", "a", "()Lorg/koin/core/a;", "koin", "Lorg/koin/core/scope/a;", "c", "Lorg/koin/core/scope/a;", "()Lorg/koin/core/scope/a;", "scope", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/a;", "()Lorg/koin/core/parameter/a;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "_parameters", "<init>", "(Lorg/koin/core/a;Lorg/koin/core/scope/a;Ln6/a;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    @e
    private final a a;
    @f
    private final org.koin.core.a b;
    @f
    private final org.koin.core.scope.a c;
    private final n6.a<a> d;
    
    public c() {
        this(null, null, null, 7, null);
    }
    
    public c(@f final org.koin.core.a b, @f final org.koin.core.scope.a c, @f final n6.a<a> d) {
        this.b = b;
        this.c = c;
        this.d = d;
        a a = null;
        Label_0044: {
            if (d != null) {
                a = (a)d.invoke();
                if (a != null) {
                    break Label_0044;
                }
            }
            a = org.koin.core.parameter.b.a();
        }
        this.a = a;
    }
    
    @f
    public final org.koin.core.a a() {
        return this.b;
    }
    
    @e
    public final a b() {
        return this.a;
    }
    
    @f
    public final org.koin.core.scope.a c() {
        return this.c;
    }
}
