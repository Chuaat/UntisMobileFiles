// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lkotlin/text/r;", "", "Lkotlin/text/o;", "a", "Lkotlin/text/o;", "value", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class r
{
    @d
    @e
    public static final o a;
    @e
    public static final r b;
    
    static {
        b = new r();
        final StringBuilder sb = new StringBuilder();
        sb.append("[eE][+-]?");
        sb.append("(\\p{Digit}+)");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("(0[xX]");
        sb2.append("(\\p{XDigit}+)");
        sb2.append("(\\.)?)|");
        sb2.append("(0[xX]");
        sb2.append("(\\p{XDigit}+)");
        sb2.append("?(\\.)");
        sb2.append("(\\p{XDigit}+)");
        sb2.append(')');
        final String string2 = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append('(');
        sb3.append("(\\p{Digit}+)");
        sb3.append("(\\.)?(");
        sb3.append("(\\p{Digit}+)");
        sb3.append("?)(");
        sb3.append(string);
        sb3.append(")?)|");
        sb3.append("(\\.(");
        sb3.append("(\\p{Digit}+)");
        sb3.append(")(");
        sb3.append(string);
        sb3.append(")?)|");
        sb3.append("((");
        sb3.append(string2);
        sb3.append(")[pP][+-]?");
        sb3.append("(\\p{Digit}+)");
        sb3.append(')');
        final String string3 = sb3.toString();
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb4.append(string3);
        sb4.append(")[fFdD]?))[\\x00-\\x20]*");
        a = new o(sb4.toString());
    }
    
    private r() {
    }
}
