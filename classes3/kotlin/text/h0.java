// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\bQ\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010RR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0016\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0016\u00104\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0016\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0016\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0004R\u0016\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0016\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0016\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0016\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0004R\u0016\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0004R\u0016\u0010F\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0004R\u0016\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0016\u0010J\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0004R\u0016\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0016\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0016\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\u0004¨\u0006S" }, d2 = { "Lkotlin/text/h0;", "", "", "j", "C", "section", "a", "quote", "q", "paragraph", "v", "leftSingleQuote", "J", "almostEqual", "B", "dagger", "o", "degree", "e", "greater", "p", "plusMinus", "L", "lessOrEqual", "t", "ndash", "doubleDagger", "b", "dollar", "d", "less", "f", "nbsp", "i", "pound", "k", "copyright", "r", "middleDot", "w", "rightSingleQuote", "l", "leftGuillemete", "u", "mdash", "F", "prime", "H", "euro", "I", "tm", "M", "greaterOrEqual", "z", "rightDoubleQuote", "c", "amp", "K", "notEqual", "g", "times", "G", "doublePrime", "A", "lowDoubleQuote", "E", "ellipsis", "h", "cent", "s", "half", "D", "bullet", "m", "rightGuillemete", "x", "lowSingleQuote", "n", "registered", "y", "leftDoubleQuote", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class h0
{
    public static final char A = '\u201e';
    public static final char B = '\u2020';
    public static final char C = '\u2021';
    public static final char D = '\u2022';
    public static final char E = '\u2026';
    public static final char F = '\u2032';
    public static final char G = '\u2033';
    public static final char H = '\u20ac';
    public static final char I = '\u2122';
    public static final char J = '\u2248';
    public static final char K = '\u2260';
    public static final char L = '\u2264';
    public static final char M = '\u2265';
    @e
    public static final h0 N;
    public static final char a = '\"';
    public static final char b = '$';
    public static final char c = '&';
    public static final char d = '<';
    public static final char e = '>';
    public static final char f = ' ';
    public static final char g = '\u00d7';
    public static final char h = '¢';
    public static final char i = '£';
    public static final char j = '§';
    public static final char k = '©';
    public static final char l = '«';
    public static final char m = '»';
    public static final char n = '®';
    public static final char o = '°';
    public static final char p = '±';
    public static final char q = '¶';
    public static final char r = '·';
    public static final char s = '½';
    public static final char t = '\u2013';
    public static final char u = '\u2014';
    public static final char v = '\u2018';
    public static final char w = '\u2019';
    public static final char x = '\u201a';
    public static final char y = '\u201c';
    public static final char z = '\u201d';
    
    static {
        N = new h0();
    }
    
    private h0() {
    }
}
