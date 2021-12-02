// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.z0;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.o2;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0014\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u001a!\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\n\u001a-\u0010\f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001d\u0010\r\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b\u001a%\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0087\b\u001a7\u0010\u0012\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0087\b\u001a-\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0087\b\u001a-\u0010\u0015\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0087\b\u001a5\u0010\u0016\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0087\b\u001a5\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0087\b\u001a\u001f\u0010\u0019\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b\u001a\u001d\u0010\u001b\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001cH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001eH\u0087\b\u001a\u001d\u0010!\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020 H\u0087\b\u001a\u001d\u0010#\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\"H\u0087\b\u001a\u001d\u0010%\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020$H\u0087\b\u001a\u0014\u0010(\u001a\u00060&j\u0002`'*\u00060&j\u0002`'H\u0007\u001a\u001f\u0010)\u001a\u00060&j\u0002`'*\u00060&j\u0002`'2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H\u0087\b\u001a\u001d\u0010*\u001a\u00060&j\u0002`'*\u00060&j\u0002`'2\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u0014\u0010+\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007\u001a\u001f\u0010,\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001f\u0010-\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H\u0087\b\u001a\u001f\u0010.\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0087\b\u001a\u001f\u00100\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010/H\u0087\b\u001a%\u00101\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b\u001a\u001d\u00102\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001d\u00103\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a\u001d\u00105\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u000204H\u0087\b\u001a\u001d\u00106\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0087\b\u001a\u001d\u00107\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001cH\u0087\b\u001a\u001d\u00108\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u001eH\u0087\b\u001a\u001d\u00109\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020 H\u0087\b\u001a\u001d\u0010:\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\"H\u0087\b\u001a\u001d\u0010;\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020$H\u0087\b¨\u0006<" }, d2 = { "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Y", "", "index", "", "value", "Lkotlin/j2;", "d0", "startIndex", "endIndex", "", "e0", "Z", "a0", "", "destination", "destinationOffset", "f0", "F", "", "E", "c0", "b0", "Ljava/lang/StringBuffer;", "B", "C", "z", "", "D", "", "w", "", "A", "", "y", "", "x", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "G", "I", "H", "J", "T", "Q", "S", "", "R", "U", "X", "L", "", "W", "O", "V", "K", "P", "N", "M", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class x extends w
{
    public x() {
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder A(final StringBuilder sb, final long lng) {
        sb.append(lng);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder B(final StringBuilder sb, final StringBuffer sb2) {
        sb.append(sb2);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder C(final StringBuilder sb, final StringBuilder s) {
        sb.append((CharSequence)s);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder D(final StringBuilder sb, final short i) {
        sb.append(i);
        k0.o((Object)sb, "append(value.toInt())");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder E(final StringBuilder sb, final CharSequence s, final int start, final int end) {
        sb.append(s, start, end);
        k0.o((Object)sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder F(final StringBuilder sb, final char[] str, final int offset, final int n) {
        sb.append(str, offset, n - offset);
        k0.o((Object)sb, "this.append(value, start\u2026x, endIndex - startIndex)");
        return sb;
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine()", imports = {}))
    @e
    public static final Appendable G(@e Appendable append) {
        k0.p((Object)append, "$this$appendln");
        append = append.append(f0.a);
        k0.o((Object)append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final Appendable H(Appendable append, final char c) {
        append = append.append(c);
        k0.o((Object)append, "append(value)");
        return G(append);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final Appendable I(Appendable append, final CharSequence charSequence) {
        append = append.append(charSequence);
        k0.o((Object)append, "append(value)");
        return G(append);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine()", imports = {}))
    @e
    public static final StringBuilder J(@e final StringBuilder sb) {
        k0.p((Object)sb, "$this$appendln");
        sb.append(f0.a);
        k0.o((Object)sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder K(final StringBuilder sb, final byte i) {
        sb.append(i);
        k0.o((Object)sb, "append(value.toInt())");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder L(final StringBuilder sb, final char c) {
        sb.append(c);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder M(final StringBuilder sb, final double d) {
        sb.append(d);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder N(final StringBuilder sb, final float f) {
        sb.append(f);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder O(final StringBuilder sb, final int i) {
        sb.append(i);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder P(final StringBuilder sb, final long lng) {
        sb.append(lng);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder Q(final StringBuilder sb, final CharSequence s) {
        sb.append(s);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder R(final StringBuilder sb, final Object obj) {
        sb.append(obj);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder S(final StringBuilder sb, final String str) {
        sb.append(str);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder T(final StringBuilder sb, final StringBuffer sb2) {
        sb.append(sb2);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder U(final StringBuilder sb, final StringBuilder s) {
        sb.append((CharSequence)s);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder V(final StringBuilder sb, final short i) {
        sb.append(i);
        k0.o((Object)sb, "append(value.toInt())");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder W(final StringBuilder sb, final boolean b) {
        sb.append(b);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @i(level = k.G, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @z0(expression = "appendLine(value)", imports = {}))
    @f
    private static final StringBuilder X(final StringBuilder sb, final char[] str) {
        sb.append(str);
        k0.o((Object)sb, "append(value)");
        return J(sb);
    }
    
    @e1(version = "1.3")
    @e
    public static final StringBuilder Y(@e final StringBuilder sb) {
        k0.p((Object)sb, "$this$clear");
        sb.setLength(0);
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder Z(StringBuilder deleteChar, final int index) {
        deleteChar = deleteChar.deleteCharAt(index);
        k0.o((Object)deleteChar, "this.deleteCharAt(index)");
        return deleteChar;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder a0(StringBuilder delete, final int start, final int end) {
        delete = delete.delete(start, end);
        k0.o((Object)delete, "this.delete(startIndex, endIndex)");
        return delete;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder b0(StringBuilder insert, final int dstOffset, final CharSequence s, final int start, final int end) {
        insert = insert.insert(dstOffset, s, start, end);
        k0.o((Object)insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder c0(StringBuilder insert, final int index, final char[] str, final int offset, final int n) {
        insert = insert.insert(index, str, offset, n - offset);
        k0.o((Object)insert, "this.insert(index, value\u2026x, endIndex - startIndex)");
        return insert;
    }
    
    @f
    private static final void d0(final StringBuilder sb, final int n, final char c) {
        k0.p((Object)sb, "$this$set");
        sb.setCharAt(n, c);
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final StringBuilder e0(StringBuilder replace, final int start, final int end, final String str) {
        replace = replace.replace(start, end, str);
        k0.o((Object)replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }
    
    @e1(version = "1.4")
    @f
    @o2(markerClass = { q.class })
    private static final void f0(final StringBuilder sb, final char[] array, final int n, final int n2, final int n3) {
        sb.getChars(n2, n3, array, n);
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder w(final StringBuilder sb, final byte i) {
        sb.append(i);
        k0.o((Object)sb, "append(value.toInt())");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder x(final StringBuilder sb, final double d) {
        sb.append(d);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder y(final StringBuilder sb, final float f) {
        sb.append(f);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @e1(version = "1.4")
    @f
    private static final StringBuilder z(final StringBuilder sb, final int i) {
        sb.append(i);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
}
