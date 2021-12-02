// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.android;

import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.l1;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.w2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t" }, d2 = { "Lkotlinx/coroutines/android/b;", "Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/c1;", "W", "()Lkotlinx/coroutines/android/b;", "immediate", "<init>", "()V", "Lkotlinx/coroutines/android/a;", "kotlinx-coroutines-android" }, k = 1, mv = { 1, 4, 2 })
public abstract class b extends w2 implements c1
{
    private b() {
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        return c1.a.b(this, n, runnable, g);
    }
    
    @f
    @Override
    public Object F(final long n, @e final d<? super j2> d) {
        return c1.a.a(this, n, d);
    }
    
    @e
    public abstract b W();
}
