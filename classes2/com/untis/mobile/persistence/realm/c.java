// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.c1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/persistence/realm/c;", "Lio/realm/p0;", "", "L", "I", "s8", "()I", "v8", "(I)V", "background", "J", "t8", "w8", "schoolColorTypeId", "K", "u8", "x8", "text", "<init>", "(III)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements c1
{
    @e
    private int J;
    private int K;
    private int L;
    
    public c() {
        this(0, 0, 0, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final int n, final int n2, final int n3) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.c3(n);
        this.m7(n2);
        this.P3(n3);
    }
    
    @Override
    public int K7() {
        return this.J;
    }
    
    @Override
    public void P3(final int l) {
        this.L = l;
    }
    
    @Override
    public void c3(final int j) {
        this.J = j;
    }
    
    @Override
    public int f() {
        return this.K;
    }
    
    @Override
    public void m7(final int k) {
        this.K = k;
    }
    
    public final int s8() {
        return this.t3();
    }
    
    @Override
    public int t3() {
        return this.L;
    }
    
    public final int t8() {
        return this.K7();
    }
    
    public final int u8() {
        return this.f();
    }
    
    public final void v8(final int n) {
        this.P3(n);
    }
    
    public final void w8(final int n) {
        this.c3(n);
    }
    
    public final void x8(final int n) {
        this.m7(n);
    }
}
