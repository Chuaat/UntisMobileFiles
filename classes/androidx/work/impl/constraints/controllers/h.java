// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.r;
import androidx.work.impl.constraints.trackers.d;
import androidx.work.impl.constraints.trackers.g;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;

public class h extends c<Boolean>
{
    public h(@j0 final Context context, @j0 final androidx.work.impl.utils.taskexecutor.a a) {
        super(g.c(context, a).e());
    }
    
    @Override
    boolean b(@j0 final r r) {
        return r.j.i();
    }
    
    boolean i(@j0 final Boolean b) {
        return b ^ true;
    }
}
