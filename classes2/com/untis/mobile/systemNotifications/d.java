// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import org.koin.core.c$a;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "Lcom/untis/mobile/systemNotifications/d;", "Lorg/koin/core/c;", "Lcom/untis/mobile/systemNotifications/b;", "G", "Lkotlin/b0;", "a", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements c
{
    @e
    private final b0 G;
    
    public d() {
        this.G = d0.c((a<?>)new a<b>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final b invoke() {
                return (b)this.G.t(k1.d(b.class), null, null);
            }
        });
    }
    
    @e
    public final b a() {
        return this.G.getValue();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
