// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.logger;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&J\u0012\u0010\t\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005J\u0012\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005J\u0012\u0010\u000b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015" }, d2 = { "Lorg/koin/core/logger/c;", "", "Lorg/koin/core/logger/b;", "level", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lkotlin/j2;", "f", "a", "d", "b", "lvl", "", "e", "Lorg/koin/core/logger/b;", "c", "()Lorg/koin/core/logger/b;", "g", "(Lorg/koin/core/logger/b;)V", "<init>", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public abstract class c
{
    @e
    private b a;
    
    public c() {
        this(null, 1, null);
    }
    
    public c(@e final b a) {
        k0.q((Object)a, "level");
        this.a = a;
    }
    
    public final void a(@e final String s) {
        k0.q((Object)s, "msg");
        this.f(b.G, s);
    }
    
    public final void b(@e final String s) {
        k0.q((Object)s, "msg");
        this.f(b.I, s);
    }
    
    @e
    public final b c() {
        return this.a;
    }
    
    public final void d(@e final String s) {
        k0.q((Object)s, "msg");
        this.f(b.H, s);
    }
    
    public final boolean e(@e final b o) {
        k0.q((Object)o, "lvl");
        return this.a.compareTo(o) <= 0;
    }
    
    public abstract void f(@e final b p0, @e final String p1);
    
    public final void g(@e final b a) {
        k0.q((Object)a, "<set-?>");
        this.a = a;
    }
}
