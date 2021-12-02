// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.d;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.impl.constraints.b;

public class g extends c<b>
{
    public g(@j0 final Context context, @j0 final androidx.work.impl.utils.taskexecutor.a a) {
        super(androidx.work.impl.constraints.trackers.g.c(context, a).d());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.b() == androidx.work.r.I;
    }
    
    boolean i(@j0 final b b) {
        return !b.a() || b.b();
    }
}
