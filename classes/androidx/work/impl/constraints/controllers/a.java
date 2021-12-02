// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import androidx.annotation.j0;
import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.d;
import androidx.work.impl.constraints.trackers.g;
import android.content.Context;

public class a extends c<Boolean>
{
    public a(final Context context, final androidx.work.impl.utils.taskexecutor.a a) {
        super(g.c(context, a).a());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.g();
    }
    
    boolean i(@j0 final Boolean b) {
        return b ^ true;
    }
}
