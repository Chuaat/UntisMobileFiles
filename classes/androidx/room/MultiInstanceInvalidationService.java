// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.k0;
import android.os.IBinder;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.HashMap;
import androidx.annotation.t0;
import android.app.Service;

@t0({ t0.a.I })
public class MultiInstanceInvalidationService extends Service
{
    int G;
    final HashMap<Integer, String> H;
    final RemoteCallbackList<a1> I;
    private final b1.b J;
    
    public MultiInstanceInvalidationService() {
        this.G = 0;
        this.H = new HashMap<Integer, String>();
        this.I = new RemoteCallbackList<a1>() {
            public void a(final a1 a1, final Object o) {
                MultiInstanceInvalidationService.this.H.remove((int)o);
            }
        };
        this.J = new b1.b() {
            public int I0(final a1 a1, final String value) {
                if (value == null) {
                    return 0;
                }
                synchronized (MultiInstanceInvalidationService.this.I) {
                    final MultiInstanceInvalidationService i = MultiInstanceInvalidationService.this;
                    final int j = i.G + 1;
                    i.G = j;
                    if (i.I.register((IInterface)a1, (Object)j)) {
                        MultiInstanceInvalidationService.this.H.put(j, value);
                        return j;
                    }
                    final MultiInstanceInvalidationService k = MultiInstanceInvalidationService.this;
                    --k.G;
                    return 0;
                }
            }
            
            public void l2(final int i, final String[] array) {
                synchronized (MultiInstanceInvalidationService.this.I) {
                    final String s = MultiInstanceInvalidationService.this.H.get(i);
                    if (s == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    final int beginBroadcast = MultiInstanceInvalidationService.this.I.beginBroadcast();
                    int j = 0;
                    while (j < beginBroadcast) {
                        try {
                            final int intValue = (int)MultiInstanceInvalidationService.this.I.getBroadcastCookie(j);
                            final String anObject = MultiInstanceInvalidationService.this.H.get(intValue);
                            if (i != intValue) {
                                if (s.equals(anObject)) {
                                    try {
                                        ((a1)MultiInstanceInvalidationService.this.I.getBroadcastItem(j)).t0(array);
                                    }
                                    catch (RemoteException ex) {
                                        Log.w("ROOM", "Error invoking a remote callback", (Throwable)ex);
                                    }
                                }
                            }
                            ++j;
                            continue;
                        }
                        finally {
                            MultiInstanceInvalidationService.this.I.finishBroadcast();
                        }
                        break;
                    }
                    MultiInstanceInvalidationService.this.I.finishBroadcast();
                }
            }
            
            public void p2(final a1 a1, final int i) {
                synchronized (MultiInstanceInvalidationService.this.I) {
                    MultiInstanceInvalidationService.this.I.unregister((IInterface)a1);
                    MultiInstanceInvalidationService.this.H.remove(i);
                }
            }
        };
    }
    
    @k0
    public IBinder onBind(final Intent intent) {
        return (IBinder)this.J;
    }
}
