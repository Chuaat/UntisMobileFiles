// 
// Decompiled by Procyon v0.5.36
// 

package j6;

import kotlin.ranges.k;
import java.util.regex.Matcher;
import kotlin.jvm.internal.k0;
import kotlin.text.j;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.e;
import kotlin.random.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f" }, d2 = { "Lj6/a;", "Li6/a;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/j;", "c", "Lkotlin/random/f;", "b", "<init>", "()V", "kotlin-stdlib-jdk8" }, k = 1, mv = { 1, 5, 1 })
public class a extends i6.a
{
    @e
    @Override
    public f b() {
        return new q6.a();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public j c(@e MatchResult matchResult, @e final String name) {
        k0.p(matchResult, "matchResult");
        k0.p(name, "name");
        final boolean b = matchResult instanceof Matcher;
        final j j = null;
        if (!b) {
            matchResult = null;
        }
        final Matcher matcher = (Matcher)matchResult;
        if (matcher != null) {
            final kotlin.ranges.k k = new kotlin.ranges.k(matcher.start(name), matcher.end(name) - 1);
            j i = j;
            if (k.v() >= 0) {
                final String group = matcher.group(name);
                k0.o(group, "matcher.group(name)");
                i = new j(group, k);
            }
            return i;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
