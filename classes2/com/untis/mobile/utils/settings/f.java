// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0010\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/utils/settings/f;", "VALUE", "", "", "c", "Z", "()Z", "secure", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "aliasKey", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class f<VALUE>
{
    @e
    private final String a;
    private final VALUE b;
    private final boolean c;
    
    public f(@e final String a, final VALUE b, final boolean c) {
        k0.p(a, "aliasKey");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    public final VALUE b() {
        return this.b;
    }
    
    public final boolean c() {
        return this.c;
    }
}
