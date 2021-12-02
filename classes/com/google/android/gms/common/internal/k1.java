// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

final class k1 implements Handler$Callback
{
    private final /* synthetic */ j1 c;
    
    private k1(final j1 c) {
        this.c = c;
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                return false;
            }
            synchronized (this.c.d) {
                final m.a a = (m.a)message.obj;
                final l1 l1 = this.c.d.get(a);
                if (l1 != null && l1.f() == 3) {
                    final String value = String.valueOf(a);
                    final StringBuilder sb = new StringBuilder(value.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(value);
                    Log.e("GmsClientSupervisor", sb.toString(), (Throwable)new Exception());
                    ComponentName componentName;
                    if ((componentName = l1.j()) == null) {
                        componentName = a.c();
                    }
                    ComponentName componentName2;
                    if ((componentName2 = componentName) == null) {
                        componentName2 = new ComponentName((String)x.k(a.b()), "unknown");
                    }
                    l1.onServiceDisconnected(componentName2);
                }
                return true;
            }
        }
        synchronized (this.c.d) {
            final m.a a2 = (m.a)message.obj;
            final l1 l2 = this.c.d.get(a2);
            if (l2 != null && l2.h()) {
                if (l2.d()) {
                    l2.g("GmsClientSupervisor");
                }
                this.c.d.remove(a2);
            }
            return true;
        }
    }
}
