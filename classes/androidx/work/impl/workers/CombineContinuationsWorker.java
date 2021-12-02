// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.Worker;

@t0({ t0.a.H })
public class CombineContinuationsWorker extends Worker
{
    public CombineContinuationsWorker(@j0 final Context context, @j0 final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @j0
    @Override
    public ListenableWorker.a doWork() {
        return ListenableWorker.a.e(this.getInputData());
    }
}
