// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.android.logger;

import android.util.Log;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import org.koin.core.logger.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\f" }, d2 = { "Lorg/koin/android/logger/b;", "Lorg/koin/core/logger/c;", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lkotlin/j2;", "h", "Lorg/koin/core/logger/b;", "level", "f", "<init>", "(Lorg/koin/core/logger/b;)V", "koin-android_release" }, k = 1, mv = { 1, 4, 0 })
public final class b extends c
{
    public b() {
        this(null, 1, null);
    }
    
    public b(@e final org.koin.core.logger.b b) {
        k0.q((Object)b, "level");
        super(b);
    }
    
    private final void h(final String s) {
        final int n = org.koin.android.logger.a.a[this.c().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    Log.e("[Koin]", s);
                }
            }
            else {
                Log.i("[Koin]", s);
            }
        }
        else {
            Log.d("[Koin]", s);
        }
    }
    
    @Override
    public void f(@e final org.koin.core.logger.b o, @e final String s) {
        k0.q((Object)o, "level");
        k0.q((Object)s, "msg");
        if (this.c().compareTo(o) <= 0) {
            this.h(s);
        }
    }
}
