// 
// Decompiled by Procyon v0.5.36
// 

package c5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import io.realm.l0;
import kotlin.Metadata;
import io.realm.a6;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b<\b\u0016\u0018\u00002\u00020\u0001B»\u0002\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010U\u001a\u00020(\u0012\b\b\u0002\u0010R\u001a\u00020(\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010j\u001a\u00020\u0002\u0012\b\b\u0002\u0010[\u001a\u000209\u0012\b\b\u0002\u0010^\u001a\u000209\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010g\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010L\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020\u0002\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0019\u0012\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u0002050\u0019\u0012\b\b\u0002\u0010p\u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010C\u001a\u00020!\u0012\b\b\u0002\u0010m\u001a\u00020!\u0012\b\b\u0002\u0010/\u001a\u00020\u000f\u0012\b\b\u0002\u0010I\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010@\u001a\u00020\u000f\u0012\b\b\u0002\u00102\u001a\u00020\u000f\u0012\b\b\u0002\u0010d\u001a\u000209\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\b\b\u0002\u0010X\u001a\u00020\u000f¢\u0006\u0004\bs\u0010tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0011\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010\u0015R(\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0011\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\"\u0010C\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010#\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R(\u0010F\u001a\b\u0012\u0004\u0012\u0002050\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001c\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\"\u0010I\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0011\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u0010\u0015R\"\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\"\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\bR\"\u0010R\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010*\u001a\u0004\bS\u0010,\"\u0004\bT\u0010.R\"\u0010U\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010*\u001a\u0004\bV\u0010,\"\u0004\bW\u0010.R\"\u0010X\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\u0011\u001a\u0004\bY\u0010\u0013\"\u0004\bZ\u0010\u0015R\"\u0010[\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010;\u001a\u0004\b\\\u0010=\"\u0004\b]\u0010?R\"\u0010^\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010;\u001a\u0004\b_\u0010=\"\u0004\b`\u0010?R\"\u0010a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\"\u0010d\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010;\u001a\u0004\be\u0010=\"\u0004\bf\u0010?R\"\u0010g\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\bR\"\u0010j\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\u0004\u001a\u0004\bk\u0010\u0006\"\u0004\bl\u0010\bR\"\u0010m\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010#\u001a\u0004\bn\u0010%\"\u0004\bo\u0010'R\"\u0010p\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010#\u001a\u0004\bq\u0010%\"\u0004\br\u0010'¨\u0006u" }, d2 = { "Lc5/c;", "Lio/realm/p0;", "", "backColor", "I", "s8", "()I", "V8", "(I)V", "textColorCustom", "Q8", "u9", "backColorSubject", "u8", "X8", "", "exam", "Z", "y8", "()Z", "b9", "(Z)V", "startMinute", "L8", "p9", "Lio/realm/l0;", "Lc5/b;", "elements", "Lio/realm/l0;", "w8", "()Lio/realm/l0;", "Z8", "(Lio/realm/l0;)V", "", "local", "Ljava/lang/String;", "K8", "()Ljava/lang/String;", "n9", "(Ljava/lang/String;)V", "", "id", "J", "F8", "()J", "i9", "(J)V", "hasOfficeHourRegistration", "z8", "c9", "hide", "A8", "d9", "Lcom/untis/mobile/persistence/realm/e;", "homeWorks", "D8", "g9", "", "hideWidthX", "F", "C8", "()F", "f9", "(F)V", "irregular", "H8", "k9", "lesson", "I8", "l9", "homeWorksLocal", "E8", "h9", "cancelled", "v8", "Y8", "textColorSubject", "R8", "v9", "totalX", "S8", "w9", "subjectId", "N8", "r9", "lessonId", "J8", "m9", "isOnlinePeriod", "U8", "o9", "startX", "M8", "q9", "widthX", "T8", "x9", "backColorCustom", "t8", "W8", "hideStartX", "B8", "e9", "textColor", "P8", "t9", "endMinute", "x8", "a9", "substitution", "O8", "s9", "info", "G8", "j9", "<init>", "(JJJIIFFILio/realm/l0;IIIIIILio/realm/l0;Lio/realm/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZFFZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements a6
{
    private long J;
    private long K;
    private long L;
    private int M;
    private int N;
    private float O;
    private float P;
    private int Q;
    @e
    private l0<b> R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    @e
    private l0<com.untis.mobile.persistence.realm.e> Y;
    @e
    private l0<com.untis.mobile.persistence.realm.e> Z;
    @e
    private String a0;
    @e
    private String b0;
    @e
    private String c0;
    @e
    private String d0;
    private boolean e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private boolean i0;
    private float j0;
    private float k0;
    private boolean l0;
    
    public c() {
        this(0L, 0L, 0L, 0, 0, 0.0f, 0.0f, 0, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, false, false, false, false, false, 0.0f, 0.0f, false, 536870911, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, final long n2, final long n3, final int n4, final int n5, final float n6, final float n7, final int n8, @e final l0<b> l0, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, @e final l0<com.untis.mobile.persistence.realm.e> l2, @e final l0<com.untis.mobile.persistence.realm.e> l3, @e final String s, @e final String s2, @e final String s3, @e final String s4, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final float n15, final float n16, final boolean b6) {
        kotlin.jvm.internal.k0.p(l0, "elements");
        kotlin.jvm.internal.k0.p(l2, "homeWorks");
        kotlin.jvm.internal.k0.p(l3, "homeWorksLocal");
        kotlin.jvm.internal.k0.p(s, "info");
        kotlin.jvm.internal.k0.p(s2, "local");
        kotlin.jvm.internal.k0.p(s3, "lesson");
        kotlin.jvm.internal.k0.p(s4, "substitution");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.G(n2);
        this.u0(n3);
        this.u7(n4);
        this.t5(n5);
        this.K2(n6);
        this.M7(n7);
        this.S5(n8);
        this.J7(l0);
        this.q(n9);
        this.w(n10);
        this.F2(n11);
        this.N7(n12);
        this.a4(n13);
        this.o6(n14);
        this.m1(l2);
        this.c7(l3);
        this.Z0(s);
        this.S0(s2);
        this.P0(s3);
        this.G1(s4);
        this.Z1(b);
        this.y1(b2);
        this.I5(b3);
        this.E3(b4);
        this.K4(b5);
        this.i3(n15);
        this.y5(n16);
        this.H1(b6);
    }
    
    public final boolean A8() {
        return this.x6();
    }
    
    public final float B8() {
        return this.a7();
    }
    
    @Override
    public long C() {
        return this.K;
    }
    
    public final float C8() {
        return this.l4();
    }
    
    @e
    public final l0<com.untis.mobile.persistence.realm.e> D8() {
        return (l0<com.untis.mobile.persistence.realm.e>)this.p1();
    }
    
    @Override
    public void E3(final boolean h0) {
        this.h0 = h0;
    }
    
    @Override
    public int E4() {
        return this.Q;
    }
    
    @e
    public final l0<com.untis.mobile.persistence.realm.e> E8() {
        return (l0<com.untis.mobile.persistence.realm.e>)this.b2();
    }
    
    @Override
    public void F2(final int u) {
        this.U = u;
    }
    
    public final long F8() {
        return this.a();
    }
    
    @Override
    public void G(final long k) {
        this.K = k;
    }
    
    @Override
    public void G1(final String d0) {
        this.d0 = d0;
    }
    
    @Override
    public int G5() {
        return this.V;
    }
    
    @e
    public final String G8() {
        return this.H0();
    }
    
    @Override
    public String H0() {
        return this.a0;
    }
    
    @Override
    public void H1(final boolean l0) {
        this.l0 = l0;
    }
    
    public final boolean H8() {
        return this.y2();
    }
    
    @Override
    public void I5(final boolean g0) {
        this.g0 = g0;
    }
    
    @e
    public final String I8() {
        return this.i1();
    }
    
    @Override
    public void J7(final l0 r) {
        this.R = (l0<b>)r;
    }
    
    public final long J8() {
        return this.C();
    }
    
    @Override
    public String K0() {
        return this.d0;
    }
    
    @Override
    public void K2(final float o) {
        this.O = o;
    }
    
    @Override
    public void K4(final boolean i0) {
        this.i0 = i0;
    }
    
    @Override
    public boolean K6() {
        return this.e0;
    }
    
    @e
    public final String K8() {
        return this.g0();
    }
    
    public final int L8() {
        return this.j2();
    }
    
    @Override
    public void M7(final float p) {
        this.P = p;
    }
    
    public final float M8() {
        return this.x5();
    }
    
    @Override
    public void N7(final int v) {
        this.V = v;
    }
    
    public final long N8() {
        return this.a0();
    }
    
    @Override
    public boolean O0() {
        return this.l0;
    }
    
    @e
    public final String O8() {
        return this.K0();
    }
    
    @Override
    public void P0(final String c0) {
        this.c0 = c0;
    }
    
    @Override
    public boolean P2() {
        return this.g0;
    }
    
    public final int P8() {
        return this.r();
    }
    
    public final int Q8() {
        return this.V4();
    }
    
    public final int R8() {
        return this.c4();
    }
    
    @Override
    public void S0(final String b0) {
        this.b0 = b0;
    }
    
    @Override
    public void S5(final int q) {
        this.Q = q;
    }
    
    public final int S8() {
        return this.E4();
    }
    
    public final float T8() {
        return this.g2();
    }
    
    public final boolean U8() {
        return this.O0();
    }
    
    @Override
    public int V4() {
        return this.W;
    }
    
    public final void V8(final int n) {
        this.w(n);
    }
    
    public final void W8(final int n) {
        this.o6(n);
    }
    
    public final void X8(final int n) {
        this.N7(n);
    }
    
    public final void Y8(final boolean b) {
        this.y1(b);
    }
    
    @Override
    public void Z0(final String a0) {
        this.a0 = a0;
    }
    
    @Override
    public void Z1(final boolean e0) {
        this.e0 = e0;
    }
    
    public final void Z8(@e final l0<b> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.J7(l0);
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public long a0() {
        return this.L;
    }
    
    @Override
    public void a4(final int w) {
        this.W = w;
    }
    
    @Override
    public float a7() {
        return this.j0;
    }
    
    public final void a9(final int n) {
        this.t5(n);
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public l0 b2() {
        return this.Z;
    }
    
    public final void b9(final boolean b) {
        this.I5(b);
    }
    
    @Override
    public int c4() {
        return this.U;
    }
    
    @Override
    public void c7(final l0 z) {
        this.Z = (l0<com.untis.mobile.persistence.realm.e>)z;
    }
    
    public final void c9(final boolean b) {
        this.Z1(b);
    }
    
    public final void d9(final boolean b) {
        this.K4(b);
    }
    
    public final void e9(final float n) {
        this.i3(n);
    }
    
    public final void f9(final float n) {
        this.y5(n);
    }
    
    @Override
    public String g0() {
        return this.b0;
    }
    
    @Override
    public float g2() {
        return this.P;
    }
    
    public final void g9(@e final l0<com.untis.mobile.persistence.realm.e> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.m1(l0);
    }
    
    public final void h9(@e final l0<com.untis.mobile.persistence.realm.e> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.c7(l0);
    }
    
    @Override
    public String i1() {
        return this.c0;
    }
    
    @Override
    public void i3(final float j0) {
        this.j0 = j0;
    }
    
    @Override
    public int i4() {
        return this.N;
    }
    
    public final void i9(final long n) {
        this.b(n);
    }
    
    @Override
    public int j2() {
        return this.M;
    }
    
    @Override
    public int j5() {
        return this.X;
    }
    
    public final void j9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.Z0(s);
    }
    
    @Override
    public boolean k1() {
        return this.f0;
    }
    
    public final void k9(final boolean b) {
        this.E3(b);
    }
    
    @Override
    public float l4() {
        return this.k0;
    }
    
    public final void l9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.P0(s);
    }
    
    @Override
    public void m1(final l0 y) {
        this.Y = (l0<com.untis.mobile.persistence.realm.e>)y;
    }
    
    public final void m9(final long n) {
        this.G(n);
    }
    
    public final void n9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.S0(s);
    }
    
    @Override
    public l0 o5() {
        return this.R;
    }
    
    @Override
    public void o6(final int x) {
        this.X = x;
    }
    
    public final void o9(final boolean b) {
        this.H1(b);
    }
    
    @Override
    public l0 p1() {
        return this.Y;
    }
    
    public final void p9(final int n) {
        this.u7(n);
    }
    
    @Override
    public void q(final int s) {
        this.S = s;
    }
    
    public final void q9(final float n) {
        this.K2(n);
    }
    
    @Override
    public int r() {
        return this.S;
    }
    
    public final void r9(final long n) {
        this.u0(n);
    }
    
    public final int s8() {
        return this.u();
    }
    
    public final void s9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.G1(s);
    }
    
    @Override
    public void t5(final int n) {
        this.N = n;
    }
    
    public final int t8() {
        return this.j5();
    }
    
    public final void t9(final int n) {
        this.q(n);
    }
    
    @Override
    public int u() {
        return this.T;
    }
    
    @Override
    public void u0(final long l) {
        this.L = l;
    }
    
    @Override
    public void u7(final int m) {
        this.M = m;
    }
    
    public final int u8() {
        return this.G5();
    }
    
    public final void u9(final int n) {
        this.a4(n);
    }
    
    public final boolean v8() {
        return this.k1();
    }
    
    public final void v9(final int n) {
        this.F2(n);
    }
    
    @Override
    public void w(final int t) {
        this.T = t;
    }
    
    @e
    public final l0<b> w8() {
        return (l0<b>)this.o5();
    }
    
    public final void w9(final int n) {
        this.S5(n);
    }
    
    @Override
    public float x5() {
        return this.O;
    }
    
    @Override
    public boolean x6() {
        return this.i0;
    }
    
    public final int x8() {
        return this.i4();
    }
    
    public final void x9(final float n) {
        this.M7(n);
    }
    
    @Override
    public void y1(final boolean f0) {
        this.f0 = f0;
    }
    
    @Override
    public boolean y2() {
        return this.h0;
    }
    
    @Override
    public void y5(final float k0) {
        this.k0 = k0;
    }
    
    public final boolean y8() {
        return this.P2();
    }
    
    public final boolean z8() {
        return this.K6();
    }
}
