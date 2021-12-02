// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.j2;
import n6.l;
import kotlin.e1;
import org.jetbrains.annotations.e;
import kotlin.internal.f;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u001a6\u0010\n\u001a\u00020\t2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a>\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a1\u0010\u0010\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000e\"\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0012\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0087\b\u001a\u001f\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0087\b\u001a\u001f\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0087\b\u001a\u001f\u0010\u0018\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u001bH\u0087\b\u001a\u001d\u0010\u001e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000f\u001a\u00020\u001dH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f" }, d2 = { "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "obj", "h0", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "", "s0", "", "capacity", "r0", "", "value", "j0", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "i0", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "k0", "", "m0", "o0", "n0", "", "q0", "", "l0", "", "p0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class y extends x
{
    public y() {
    }
    
    @i(level = k.G, message = "Use append(value: Any?) instead", replaceWith = @z0(expression = "append(value = obj)", imports = {}))
    @f
    private static final StringBuilder h0(final StringBuilder sb, final Object obj) {
        sb.append(obj);
        k0.o((Object)sb, "this.append(obj)");
        return sb;
    }
    
    @e
    public static final StringBuilder i0(@e final StringBuilder sb, @e final Object... array) {
        k0.p((Object)sb, "$this$append");
        k0.p((Object)array, "value");
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(array[i]);
        }
        return sb;
    }
    
    @e
    public static StringBuilder j0(@e final StringBuilder sb, @e final String... array) {
        k0.p((Object)sb, "$this$append");
        k0.p((Object)array, "value");
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(array[i]);
        }
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder k0(final StringBuilder sb) {
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder l0(final StringBuilder sb, final char c) {
        sb.append(c);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder m0(final StringBuilder sb, final CharSequence s) {
        sb.append(s);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder n0(final StringBuilder sb, final Object obj) {
        sb.append(obj);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder o0(final StringBuilder sb, final String str) {
        sb.append(str);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder p0(final StringBuilder sb, final boolean b) {
        sb.append(b);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder q0(final StringBuilder sb, final char[] str) {
        sb.append(str);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.1")
    @f
    private static final String r0(final int capacity, final l<? super StringBuilder, j2> l) {
        final StringBuilder sb = new StringBuilder(capacity);
        l.invoke((Object)sb);
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder(capacity).\u2026builderAction).toString()");
        return string;
    }
    
    @f
    private static final String s0(final l<? super StringBuilder, j2> l) {
        final StringBuilder sb = new StringBuilder();
        l.invoke((Object)sb);
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
