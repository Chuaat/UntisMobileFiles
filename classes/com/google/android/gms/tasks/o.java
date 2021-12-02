// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import com.google.android.gms.internal.tasks.b;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class o
{
    public static final Executor a;
    static final Executor b;
    
    static {
        a = new a();
        b = new k0();
    }
    
    private o() {
    }
    
    private static final class a implements Executor
    {
        private final Handler G;
        
        public a() {
            this.G = new b(Looper.getMainLooper());
        }
        
        @Override
        public final void execute(@j0 final Runnable runnable) {
            this.G.post(runnable);
        }
    }
}
