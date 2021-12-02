// 
// Decompiled by Procyon v0.5.36
// 

package z6;

import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.text.l;
import kotlin.jvm.internal.k0;
import kotlin.text.j;
import org.jetbrains.annotations.e;
import kotlin.text.k;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\u0002¨\u0006\u0005" }, d2 = { "Lkotlin/text/k;", "", "name", "Lkotlin/text/j;", "a", "kotlin-stdlib-jdk8" }, k = 2, mv = { 1, 5, 1 }, pn = "kotlin.text")
@g(name = "RegexExtensionsJDK8Kt")
public final class a
{
    @e1(version = "1.2")
    @f
    public static final j a(@e final k k, @e final String s) {
        k0.p((Object)k, "$this$get");
        k0.p((Object)s, "name");
        k i = k;
        if (!(k instanceof l)) {
            i = null;
        }
        final l l = (l)i;
        if (l != null) {
            return l.j(s);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
