// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.collections.d;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.m0;
import java.util.Collection;
import kotlin.collections.v;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.collections.a;
import kotlin.jvm.internal.k0;
import java.util.regex.Matcher;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0016\u0010\u0006\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0018R\u001c\u0010\u001e\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006#" }, d2 = { "Lkotlin/text/n;", "Lkotlin/text/m;", "next", "", "getValue", "()Ljava/lang/String;", "value", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Ljava/util/regex/Matcher;", "c", "Ljava/util/regex/Matcher;", "matcher", "", "b", "()Ljava/util/List;", "groupValues", "", "d", "Ljava/lang/CharSequence;", "input", "Lkotlin/ranges/k;", "()Lkotlin/ranges/k;", "range", "Lkotlin/text/k;", "a", "Lkotlin/text/k;", "()Lkotlin/text/k;", "groups", "Ljava/util/List;", "groupValues_", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class n implements m
{
    @e
    private final k a;
    private List<String> b;
    private final Matcher c;
    private final CharSequence d;
    
    public n(@e final Matcher c, @e final CharSequence d) {
        k0.p((Object)c, "matcher");
        k0.p((Object)d, "input");
        this.c = c;
        this.d = d;
        this.a = new l() {
            public int b() {
                return n.this.f().groupCount() + 1;
            }
            
            public final /* bridge */ boolean contains(final Object o) {
                return (o == null || o instanceof j) && this.f((j)o);
            }
            
            public /* bridge */ boolean f(final j j) {
                return super.contains((Object)j);
            }
            
            @f
            public j get(final int n) {
                final kotlin.ranges.k e = p.e(n.this.f(), n);
                j j;
                if (e.v() >= 0) {
                    final String group = n.this.f().group(n);
                    k0.o((Object)group, "matchResult.group(index)");
                    j = new j(group, e);
                }
                else {
                    j = null;
                }
                return j;
            }
            
            public boolean isEmpty() {
                return false;
            }
            
            @e
            public Iterator<j> iterator() {
                return kotlin.sequences.p.d1((kotlin.sequences.m<?>)v.n1((Iterable)v.F((Collection)this)), (n6.l<? super Object, ? extends j>)new n6.l<Integer, j>() {
                    final /* synthetic */ n$b G;
                    
                    @f
                    public final j a(final int n) {
                        return this.G.get(n);
                    }
                }).iterator();
            }
            
            @f
            public j j(@e final String s) {
                k0.p((Object)s, "name");
                return kotlin.internal.l.a.c(n.this.f(), s);
            }
        };
    }
    
    private final MatchResult f() {
        return this.c;
    }
    
    @e
    @Override
    public b a() {
        return m.a.a(this);
    }
    
    @e
    @Override
    public List<String> b() {
        if (this.b == null) {
            this.b = (List<String>)new d<String>() {
                public int b() {
                    return n.this.f().groupCount() + 1;
                }
                
                public final /* bridge */ boolean contains(final Object o) {
                    return o instanceof String && this.f((String)o);
                }
                
                public /* bridge */ boolean f(final String s) {
                    return super.contains((Object)s);
                }
                
                @e
                public String h(final int n) {
                    String group = n.this.f().group(n);
                    if (group == null) {
                        group = "";
                    }
                    return group;
                }
                
                public /* bridge */ int i(final String s) {
                    return super.indexOf((Object)s);
                }
                
                public final /* bridge */ int indexOf(final Object o) {
                    if (o instanceof String) {
                        return this.i((String)o);
                    }
                    return -1;
                }
                
                public /* bridge */ int k(final String s) {
                    return super.lastIndexOf((Object)s);
                }
                
                public final /* bridge */ int lastIndexOf(final Object o) {
                    if (o instanceof String) {
                        return this.k((String)o);
                    }
                    return -1;
                }
            };
        }
        final List<String> b = this.b;
        k0.m((Object)b);
        return b;
    }
    
    @e
    @Override
    public k c() {
        return this.a;
    }
    
    @e
    @Override
    public kotlin.ranges.k d() {
        return p.d(this.f());
    }
    
    @e
    @Override
    public String getValue() {
        final String group = this.f().group();
        k0.o((Object)group, "matchResult.group()");
        return group;
    }
    
    @f
    @Override
    public m next() {
        final int end = this.f().end();
        int n;
        if (this.f().end() == this.f().start()) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int n2 = end + n;
        m a;
        if (n2 <= this.d.length()) {
            final Matcher matcher = this.c.pattern().matcher(this.d);
            k0.o((Object)matcher, "matcher.pattern().matcher(input)");
            a = p.a(matcher, n2, this.d);
        }
        else {
            a = null;
        }
        return a;
    }
}
