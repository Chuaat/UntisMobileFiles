// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.util.Log;
import android.os.Bundle;
import com.google.android.gms.tasks.n;

abstract class v<T>
{
    final int a;
    final n<T> b;
    final int c;
    final Bundle d;
    
    v(final int a, final int c, final Bundle d) {
        this.b = new n<T>();
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    abstract void a(final Bundle p0);
    
    final void b(final u obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 14 + value2.length());
            sb.append("Failing ");
            sb.append(value);
            sb.append(" with ");
            sb.append(value2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.b(obj);
    }
    
    final void c(final T obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 16 + value2.length());
            sb.append("Finishing ");
            sb.append(value);
            sb.append(" with ");
            sb.append(value2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.c(obj);
    }
    
    abstract boolean d();
    
    @Override
    public String toString() {
        final int c = this.c;
        final int a = this.a;
        final boolean d = this.d();
        final StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(c);
        sb.append(" id=");
        sb.append(a);
        sb.append(" oneWay=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
