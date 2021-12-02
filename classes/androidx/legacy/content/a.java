// 
// Decompiled by Procyon v0.5.36
// 

package androidx.legacy.content;

import android.os.PowerManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.content.Intent;
import android.os.PowerManager$WakeLock;
import android.util.SparseArray;
import android.content.BroadcastReceiver;

@Deprecated
public abstract class a extends BroadcastReceiver
{
    private static final String G = "androidx.contentpager.content.wakelockid";
    private static final SparseArray<PowerManager$WakeLock> H;
    private static int I;
    
    static {
        H = new SparseArray();
        a.I = 1;
    }
    
    public static boolean b(Intent h) {
        final int intExtra = h.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        h = (Intent)a.H;
        synchronized (h) {
            final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((SparseArray)h).get(intExtra);
            if (powerManager$WakeLock != null) {
                powerManager$WakeLock.release();
                ((SparseArray)h).remove(intExtra);
                return true;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }
    
    public static ComponentName c(final Context context, final Intent intent) {
        final SparseArray<PowerManager$WakeLock> h = a.H;
        synchronized (h) {
            final int i = a.I;
            if ((a.I = i + 1) <= 0) {
                a.I = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            final ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            final PowerManager powerManager = (PowerManager)context.getSystemService("power");
            final StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, sb.toString());
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(60000L);
            h.put(i, (Object)wakeLock);
            return startService;
        }
    }
}
