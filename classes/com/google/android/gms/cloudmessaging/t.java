// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import androidx.annotation.k0;
import android.os.Messenger;

final class t
{
    @k0
    private final Messenger a;
    @k0
    private final f b;
    
    t(final IBinder binder) throws RemoteException {
        final String interfaceDescriptor = binder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(binder);
            this.b = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new f(binder);
            this.a = null;
            return;
        }
        final String value = String.valueOf(interfaceDescriptor);
        String concat;
        if (value.length() != 0) {
            concat = "Invalid interface descriptor: ".concat(value);
        }
        else {
            concat = new String("Invalid interface descriptor: ");
        }
        Log.w("MessengerIpcClient", concat);
        throw new RemoteException();
    }
    
    final void a(final Message message) throws RemoteException {
        final Messenger a = this.a;
        if (a != null) {
            a.send(message);
            return;
        }
        final f b = this.b;
        if (b != null) {
            b.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
