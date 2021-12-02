// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.e1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/realm/e;", "Lio/realm/p0;", "", "J", "Ljava/lang/String;", "s8", "()Ljava/lang/String;", "t8", "(Ljava/lang/String;)V", "value", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class e extends p0 implements e1
{
    @org.jetbrains.annotations.e
    private String J;
    
    public e() {
        this(null, 1, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public e(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "value");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.w3(s);
    }
    
    @Override
    public String l0() {
        return this.J;
    }
    
    @org.jetbrains.annotations.e
    public final String s8() {
        return this.l0();
    }
    
    public final void t8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.w3(s);
    }
    
    @Override
    public void w3(final String j) {
        this.J = j;
    }
}
