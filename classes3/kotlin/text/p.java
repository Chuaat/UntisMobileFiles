// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.Iterator;
import kotlin.ranges.o;
import java.util.Collections;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import n6.l;
import java.util.EnumSet;
import kotlin.jvm.internal.k0;
import kotlin.ranges.k;
import java.util.regex.MatchResult;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0014\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0082\b\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¨\u0006\u0015" }, d2 = { "", "Lkotlin/text/i;", "", "l", "", "T", "value", "", "h", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/m;", "g", "i", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/k;", "j", "groupIndex", "k", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class p
{
    private static final m g(final Matcher matcher, final int start, final CharSequence charSequence) {
        m m;
        if (!matcher.find(start)) {
            m = null;
        }
        else {
            m = new n(matcher, charSequence);
        }
        return m;
    }
    
    private static final m i(final Matcher matcher, final CharSequence charSequence) {
        m m;
        if (!matcher.matches()) {
            m = null;
        }
        else {
            m = new n(matcher, charSequence);
        }
        return m;
    }
    
    private static final k j(final MatchResult matchResult) {
        return o.n1(matchResult.start(), matchResult.end());
    }
    
    private static final k k(final MatchResult matchResult, final int n) {
        return o.n1(matchResult.start(n), matchResult.end(n));
    }
    
    private static final int l(final Iterable<? extends i> iterable) {
        final Iterator<? extends i> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n |= ((i)iterator.next()).getValue();
        }
        return n;
    }
}
