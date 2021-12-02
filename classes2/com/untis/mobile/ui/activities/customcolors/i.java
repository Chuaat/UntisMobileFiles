// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.customcolors;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.b2;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.k2;
import com.untis.mobile.services.timetable.placeholder.k;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/ui/activities/customcolors/i;", "", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lkotlinx/coroutines/k2;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i
{
    @e
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    @e
    public final k2 a(@e final k k) {
        k0.p(k, "timeTableService");
        return h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((i$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final k h2 = this.H;
                    this.G = 1;
                    if (h2.r(this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
}
