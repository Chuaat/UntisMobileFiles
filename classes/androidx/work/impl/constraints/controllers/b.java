// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import androidx.annotation.j0;
import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.d;
import androidx.work.impl.constraints.trackers.g;
import androidx.work.impl.utils.taskexecutor.a;
import android.content.Context;

public class b extends c<Boolean>
{
    public b(final Context context, final androidx.work.impl.utils.taskexecutor.a a) {
        super(g.c(context, a).b());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.f();
    }
    
    boolean i(@j0 final Boolean b) {
        return b ^ true;
    }
}
