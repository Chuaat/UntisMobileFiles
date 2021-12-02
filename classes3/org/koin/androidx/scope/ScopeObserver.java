// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.scope;

import androidx.lifecycle.m0;
import org.koin.core.b;
import kotlin.jvm.internal.k0;
import org.koin.core.scope.a;
import org.jetbrains.annotations.e;
import androidx.lifecycle.s$b;
import kotlin.Metadata;
import org.koin.core.c;
import androidx.lifecycle.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "Lorg/koin/androidx/scope/ScopeObserver;", "Landroidx/lifecycle/x;", "Lorg/koin/core/c;", "Lkotlin/j2;", "onStop", "onDestroy", "Lorg/koin/core/scope/a;", "I", "Lorg/koin/core/scope/a;", "i", "()Lorg/koin/core/scope/a;", "scope", "", "H", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "target", "Landroidx/lifecycle/s$b;", "G", "Landroidx/lifecycle/s$b;", "e", "()Landroidx/lifecycle/s$b;", "event", "<init>", "(Landroidx/lifecycle/s$b;Ljava/lang/Object;Lorg/koin/core/scope/a;)V", "koin-androidx-scope_release" }, k = 1, mv = { 1, 4, 0 })
public final class ScopeObserver implements x, c
{
    @e
    private final s$b G;
    @e
    private final Object H;
    @e
    private final org.koin.core.scope.a I;
    
    public ScopeObserver(@e final s$b g, @e final Object h, @e final org.koin.core.scope.a i) {
        k0.q((Object)g, "event");
        k0.q(h, "target");
        k0.q((Object)i, "scope");
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @e
    public final s$b e() {
        return this.G;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return a.a(this);
    }
    
    @e
    public final org.koin.core.scope.a i() {
        return this.I;
    }
    
    @e
    public final Object j() {
        return this.H;
    }
    
    @m0(s$b.ON_DESTROY)
    public final void onDestroy() {
        if (this.G == s$b.ON_DESTROY) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.H);
            sb.append(" received ON_DESTROY");
            b.a(sb.toString());
            this.I.e();
        }
    }
    
    @m0(s$b.ON_STOP)
    public final void onStop() {
        if (this.G == s$b.ON_STOP) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.H);
            sb.append(" received ON_STOP");
            b.a(sb.toString());
            this.I.e();
        }
    }
}
