// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.RemoteException;
import android.os.Binder;
import android.support.v4.app.a;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.content.Intent;
import android.app.Notification;
import android.app.Service;

public abstract class v extends Service
{
    public abstract void a(final String p0, final int p1, final String p2);
    
    public abstract void b(final String p0);
    
    void c(final int i, final String s) {
        final String[] packagesForUid = this.getPackageManager().getPackagesForUid(i);
        for (int length = packagesForUid.length, j = 0; j < length; ++j) {
            if (packagesForUid[j].equals(s)) {
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationSideChannelService: Uid ");
        sb.append(i);
        sb.append(" is not authorized for package ");
        sb.append(s);
        throw new SecurityException(sb.toString());
    }
    
    public abstract void d(final String p0, final int p1, final String p2, final Notification p3);
    
    public IBinder onBind(final Intent intent) {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")) {
            return null;
        }
        if (Build$VERSION.SDK_INT > 19) {
            return null;
        }
        return (IBinder)new a();
    }
    
    private class a extends b
    {
        a() {
        }
        
        public void F0(final String s) {
            v.this.c(Binder.getCallingUid(), s);
            final long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                v.this.b(s);
            }
            finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        
        public void m2(final String s, final int n, final String s2, final Notification notification) throws RemoteException {
            v.this.c(Binder.getCallingUid(), s);
            final long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                v.this.d(s, n, s2, notification);
            }
            finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        
        public void y1(final String s, final int n, final String s2) throws RemoteException {
            v.this.c(Binder.getCallingUid(), s);
            final long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                v.this.a(s, n, s2);
            }
            finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
