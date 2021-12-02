// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k0;
import kotlin.internal.f;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0019\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0010H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0012H\u0087\b\u001a\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0087\b\u001a\u0013\u0010\u0016\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0010H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0012H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0087\b\u001a\t\u0010 \u001a\u00020\u0002H\u0087\b\u001a\b\u0010\"\u001a\u0004\u0018\u00010!¨\u0006#" }, d2 = { "", "message", "Lkotlin/j2;", "g", "", "e", "", "f", "", "a", "", "h", "", "b", "", "i", "", "d", "", "c", "", "j", "r", "p", "q", "l", "s", "m", "t", "o", "n", "u", "k", "", "v", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "ConsoleKt")
public final class d
{
    @f
    private static final void a(final byte b) {
        System.out.print((Object)b);
    }
    
    @f
    private static final void b(final char c) {
        System.out.print(c);
    }
    
    @f
    private static final void c(final double d) {
        System.out.print(d);
    }
    
    @f
    private static final void d(final float f) {
        System.out.print(f);
    }
    
    @f
    private static final void e(final int i) {
        System.out.print(i);
    }
    
    @f
    private static final void f(final long l) {
        System.out.print(l);
    }
    
    @f
    private static final void g(final Object obj) {
        System.out.print(obj);
    }
    
    @f
    private static final void h(final short s) {
        System.out.print((Object)s);
    }
    
    @f
    private static final void i(final boolean b) {
        System.out.print(b);
    }
    
    @f
    private static final void j(final char[] s) {
        System.out.print(s);
    }
    
    @f
    private static final void k() {
        System.out.println();
    }
    
    @f
    private static final void l(final byte b) {
        System.out.println((Object)b);
    }
    
    @f
    private static final void m(final char x) {
        System.out.println(x);
    }
    
    @f
    private static final void n(final double x) {
        System.out.println(x);
    }
    
    @f
    private static final void o(final float x) {
        System.out.println(x);
    }
    
    @f
    private static final void p(final int x) {
        System.out.println(x);
    }
    
    @f
    private static final void q(final long x) {
        System.out.println(x);
    }
    
    @f
    private static final void r(final Object x) {
        System.out.println(x);
    }
    
    @f
    private static final void s(final short s) {
        System.out.println((Object)s);
    }
    
    @f
    private static final void t(final boolean x) {
        System.out.println(x);
    }
    
    @f
    private static final void u(final char[] x) {
        System.out.println(x);
    }
    
    @org.jetbrains.annotations.f
    public static final String v() {
        final t i = t.i;
        final InputStream in = System.in;
        k0.o(in, "System.`in`");
        final Charset defaultCharset = Charset.defaultCharset();
        k0.o(defaultCharset, "Charset.defaultCharset()");
        return i.f(in, defaultCharset);
    }
}
