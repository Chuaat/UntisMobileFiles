// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import x2.a;
import androidx.annotation.c1;
import androidx.annotation.Keep;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.impl.utils.futures.c;

public abstract class Worker extends ListenableWorker
{
    androidx.work.impl.utils.futures.c<ListenableWorker.a> mFuture;
    
    @SuppressLint({ "BanKeepAnnotation" })
    @Keep
    public Worker(@j0 final Context context, @j0 final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @c1
    @j0
    public abstract ListenableWorker.a doWork();
    
    @j0
    @Override
    public final a<ListenableWorker.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.v();
        this.getBackgroundExecutor().execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Worker.this.mFuture.q(Worker.this.doWork());
                }
                finally {
                    final Throwable t;
                    Worker.this.mFuture.r(t);
                }
            }
        });
        return this.mFuture;
    }
}
