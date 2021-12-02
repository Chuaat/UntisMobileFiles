// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.d;
import androidx.work.impl.constraints.trackers.g;
import androidx.work.impl.utils.taskexecutor.a;
import android.content.Context;
import androidx.work.q;
import androidx.work.impl.constraints.b;

public class f extends c<b>
{
    private static final String e;
    
    static {
        e = q.f("NetworkNotRoamingCtrlr");
    }
    
    public f(final Context context, final androidx.work.impl.utils.taskexecutor.a a) {
        super(g.c(context, a).d());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.b() == androidx.work.r.J;
    }
    
    boolean i(@j0 final b b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        if (sdk_INT < 24) {
            q.c().a(f.e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return b.a() ^ true;
        }
        boolean b3 = b2;
        if (b.a()) {
            b3 = (!b.c() && b2);
        }
        return b3;
    }
}
