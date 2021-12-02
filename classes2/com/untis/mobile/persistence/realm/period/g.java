// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm.period;

import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.g5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001-BI\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010)\u001a\u00020\"\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006." }, d2 = { "Lcom/untis/mobile/persistence/realm/period/g;", "Lio/realm/p0;", "", "M", "J", "s8", "()J", "y8", "(J)V", "date", "O", "x8", "D8", "timestamp", "L", "t8", "z8", "entityId", "", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "B8", "(Ljava/lang/String;)V", "key", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/period/c;", "N", "Lio/realm/l0;", "w8", "()Lio/realm/l0;", "C8", "(Lio/realm/l0;)V", "periods", "", "K", "I", "u8", "()I", "A8", "(I)V", "entityType", "<init>", "(Ljava/lang/String;IJJLio/realm/l0;J)V", "P", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class g extends p0 implements g5
{
    @e
    public static final a P;
    @io.realm.annotations.e
    @e
    private String J;
    private int K;
    private long L;
    private long M;
    @e
    private l0<c> N;
    private long O;
    
    static {
        P = new a(null);
    }
    
    public g() {
        this(null, 0, 0L, 0L, null, 0L, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public g(@e final String s, final int n, final long n2, final long n3, @e final l0<c> l0, final long n4) {
        k0.p(s, "key");
        k0.p(l0, "periods");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.q1(s);
        this.k(n);
        this.p(n2);
        this.W(n3);
        this.c1(l0);
        this.s0(n4);
    }
    
    public final void A8(final int n) {
        this.k(n);
    }
    
    public final void B8(@e final String s) {
        k0.p(s, "<set-?>");
        this.q1(s);
    }
    
    public final void C8(@e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.c1(l0);
    }
    
    public final void D8(final long n) {
        this.s0(n);
    }
    
    @Override
    public long H() {
        return this.M;
    }
    
    @Override
    public l0 J0() {
        return this.N;
    }
    
    @Override
    public void W(final long m) {
        this.M = m;
    }
    
    @Override
    public long b0() {
        return this.O;
    }
    
    @Override
    public void c1(final l0 n) {
        this.N = (l0<c>)n;
    }
    
    @Override
    public void k(final int k) {
        this.K = k;
    }
    
    @Override
    public int l() {
        return this.K;
    }
    
    @Override
    public long o() {
        return this.L;
    }
    
    @Override
    public void p(final long l) {
        this.L = l;
    }
    
    @Override
    public void q1(final String j) {
        this.J = j;
    }
    
    @Override
    public void s0(final long o) {
        this.O = o;
    }
    
    public final long s8() {
        return this.H();
    }
    
    public final long t8() {
        return this.o();
    }
    
    public final int u8() {
        return this.l();
    }
    
    @e
    public final String v8() {
        return this.z();
    }
    
    @e
    public final l0<c> w8() {
        return (l0<c>)this.J0();
    }
    
    public final long x8() {
        return this.b0();
    }
    
    public final void y8(final long n) {
        this.W(n);
    }
    
    @Override
    public String z() {
        return this.J;
    }
    
    public final void z8(final long n) {
        this.p(n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000e" }, d2 = { "com/untis/mobile/persistence/realm/period/g$a", "", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lorg/joda/time/t;", "date", "", "b", "", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final String a(final int i, final long lng, @e final String str) {
            k0.p(str, "date");
            final StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(lng);
            sb.append(str);
            return sb.toString();
        }
        
        @e
        public final String b(@e final EntityType entityType, final long n, @e final t t) {
            k0.p(entityType, "entityType");
            k0.p(t, "date");
            final int webuntisId = entityType.getWebuntisId();
            final String g4 = t.g4("yyyy-MM-dd");
            k0.o(g4, "date.toString(Constant.Time.ISO_PATTERN_DATE)");
            return this.a(webuntisId, n, g4);
        }
    }
}
