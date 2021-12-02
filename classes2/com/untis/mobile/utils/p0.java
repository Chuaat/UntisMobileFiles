// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import com.untis.mobile.ui.activities.common.b;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u00100\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020&\u0012\u0006\u00104\u001a\u00020\u000b\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b5\u00106R,\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010¨\u00067" }, d2 = { "Lcom/untis/mobile/utils/p0;", "Ljava/io/Serializable;", "Ljava/lang/Class;", "Lcom/untis/mobile/ui/activities/common/b;", "M", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "m", "(Ljava/lang/Class;)V", "onClickClazz", "", "I", "g", "()I", "o", "(I)V", "smallIconId", "Landroid/os/Bundle;", "N", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "l", "(Landroid/os/Bundle;)V", "onClickBundle", "", "G", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "title", "J", "b", "j", "largeIconId", "", "K", "f", "()J", "n", "(J)V", "publishDateTime", "H", "c", "k", "message", "L", "a", "i", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIJILjava/lang/Class;Landroid/os/Bundle;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class p0 implements Serializable
{
    @e
    private String G;
    @e
    private String H;
    private int I;
    private int J;
    private long K;
    private int L;
    @f
    private Class<? extends b> M;
    @f
    private Bundle N;
    
    public p0(@e final String g, @e final String h, final int i, final int j, final long k, final int l, @f final Class<? extends b> m, @f final Bundle n) {
        k0.p(g, "title");
        k0.p(h, "message");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    public final int a() {
        return this.L;
    }
    
    public final int b() {
        return this.J;
    }
    
    @e
    public final String c() {
        return this.H;
    }
    
    @f
    public final Bundle d() {
        return this.N;
    }
    
    @f
    public final Class<? extends b> e() {
        return this.M;
    }
    
    public final long f() {
        return this.K;
    }
    
    public final int g() {
        return this.I;
    }
    
    @e
    public final String h() {
        return this.G;
    }
    
    public final void i(final int l) {
        this.L = l;
    }
    
    public final void j(final int j) {
        this.J = j;
    }
    
    public final void k(@e final String h) {
        k0.p(h, "<set-?>");
        this.H = h;
    }
    
    public final void l(@f final Bundle n) {
        this.N = n;
    }
    
    public final void m(@f final Class<? extends b> m) {
        this.M = m;
    }
    
    public final void n(final long k) {
        this.K = k;
    }
    
    public final void o(final int i) {
        this.I = i;
    }
    
    public final void p(@e final String g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
}
