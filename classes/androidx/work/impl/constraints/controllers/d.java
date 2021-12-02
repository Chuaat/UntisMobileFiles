// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.g;
import androidx.work.impl.utils.taskexecutor.a;
import android.content.Context;
import androidx.work.impl.constraints.b;

public class d extends c<b>
{
    public d(final Context context, final androidx.work.impl.utils.taskexecutor.a a) {
        super(g.c(context, a).d());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.b() == androidx.work.r.H;
    }
    
    boolean i(@j0 final b b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        if (sdk_INT >= 26) {
            boolean b3 = b2;
            if (b.a()) {
                b3 = (!b.d() && b2);
            }
            return b3;
        }
        return b.a() ^ true;
    }
}
