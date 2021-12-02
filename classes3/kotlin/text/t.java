// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.q;
import kotlin.o2;
import java.util.Objects;
import kotlin.e1;
import org.jetbrains.annotations.f;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\n\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0087\b\u001a\u001f\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a;\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017" }, d2 = { "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "T", "", "value", "", "startIndex", "endIndex", "f", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "a", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "c", "e", "", "d", "element", "Lkotlin/Function1;", "transform", "Lkotlin/j2;", "b", "(Ljava/lang/Appendable;Ljava/lang/Object;Ln6/l;)V", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class t
{
    public t() {
    }
    
    @e
    public static final <T extends Appendable> T a(@e final T t, @e final CharSequence... array) {
        k0.p((Object)t, "$this$append");
        k0.p((Object)array, "value");
        for (int length = array.length, i = 0; i < length; ++i) {
            t.append(array[i]);
        }
        return t;
    }
    
    public static <T> void b(@e final Appendable appendable, T invoke, @f final l<? super T, ? extends CharSequence> l) {
        k0.p((Object)appendable, "$this$appendElement");
        CharSequence value = null;
        Label_0023: {
            if (l != null) {
                invoke = (T)l.invoke((Object)invoke);
            }
            else if (invoke != null && !(invoke instanceof CharSequence)) {
                if (invoke instanceof Character) {
                    appendable.append((char)invoke);
                    return;
                }
                value = String.valueOf(invoke);
                break Label_0023;
            }
            value = (CharSequence)invoke;
        }
        appendable.append(value);
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable c(Appendable append) {
        append = append.append('\n');
        k0.o((Object)append, "append('\\n')");
        return append;
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable d(Appendable appendable, final char c) {
        appendable = appendable.append(c);
        k0.o((Object)appendable, "append(value)");
        appendable = appendable.append('\n');
        k0.o((Object)appendable, "append('\\n')");
        return appendable;
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable e(Appendable appendable, final CharSequence charSequence) {
        appendable = appendable.append(charSequence);
        k0.o((Object)appendable, "append(value)");
        appendable = appendable.append('\n');
        k0.o((Object)appendable, "append('\\n')");
        return appendable;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final <T extends Appendable> T f(@e final T t, @e final CharSequence charSequence, final int n, final int n2) {
        k0.p((Object)t, "$this$appendRange");
        k0.p((Object)charSequence, "value");
        final Appendable append = t.append(charSequence, n, n2);
        Objects.requireNonNull(append, "null cannot be cast to non-null type T");
        return (T)append;
    }
}
