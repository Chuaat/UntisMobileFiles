// 
// Decompiled by Procyon v0.5.36
// 

package a7;

import kotlin.time.j;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import kotlin.time.d;
import java.time.Duration;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006" }, d2 = { "Ljava/time/Duration;", "Lkotlin/time/d;", "b", "(Ljava/time/Duration;)J", "a", "(J)Ljava/time/Duration;", "kotlin-stdlib-jdk8" }, k = 2, mv = { 1, 5, 1 }, pn = "kotlin.time")
@g(name = "DurationConversionsJDK8Kt")
public final class a
{
    @e1(version = "1.3")
    @f
    @j
    private static final Duration a(final long n) {
        final Duration ofSeconds = Duration.ofSeconds(d.v0(n), d.B0(n));
        k0.o((Object)ofSeconds, "toComponents { seconds, \u2026, nanoseconds.toLong()) }");
        return ofSeconds;
    }
    
    @e1(version = "1.3")
    @f
    @j
    private static final long b(final Duration duration) {
        final d.a k = d.K;
        return d.U0(k.y(duration.getSeconds()), k.u(duration.getNano()));
    }
}
