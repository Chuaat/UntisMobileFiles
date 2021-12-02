// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

class y
{
    private boolean a;
    private final Handler b;
    
    y() {
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new a());
    }
    
    void a(final v<?> v, final boolean b) {
        synchronized (this) {
            if (!this.a && !b) {
                this.a = true;
                v.a();
                this.a = false;
            }
            else {
                this.b.obtainMessage(1, (Object)v).sendToTarget();
            }
        }
    }
    
    private static final class a implements Handler$Callback
    {
        static final int c = 1;
        
        a() {
        }
        
        public boolean handleMessage(final Message message) {
            if (message.what == 1) {
                ((v)message.obj).a();
                return true;
            }
            return false;
        }
    }
}
