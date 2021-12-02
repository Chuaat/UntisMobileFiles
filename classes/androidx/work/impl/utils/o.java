// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import java.util.Iterator;
import android.os.PowerManager;
import androidx.annotation.j0;
import android.content.Context;
import java.util.Map;
import java.util.HashMap;
import androidx.work.q;
import android.os.PowerManager$WakeLock;
import java.util.WeakHashMap;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class o
{
    private static final String a;
    private static final WeakHashMap<PowerManager$WakeLock, String> b;
    
    static {
        a = q.f("WakeLocks");
        b = new WeakHashMap<PowerManager$WakeLock, String>();
    }
    
    private o() {
    }
    
    public static void a() {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object o = androidx.work.impl.utils.o.b;
        synchronized (o) {
            hashMap.putAll((Map<?, ?>)o);
            // monitorexit(o)
            o = hashMap.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final PowerManager$WakeLock powerManager$WakeLock = ((Iterator<PowerManager$WakeLock>)o).next();
                if (powerManager$WakeLock != null && powerManager$WakeLock.isHeld()) {
                    q.c().h(androidx.work.impl.utils.o.a, String.format("WakeLock held for %s", hashMap.get(powerManager$WakeLock)), new Throwable[0]);
                }
            }
        }
    }
    
    public static PowerManager$WakeLock b(@j0 Context b, @j0 String string) {
        final PowerManager powerManager = (PowerManager)b.getApplicationContext().getSystemService("power");
        final StringBuilder sb = new StringBuilder();
        sb.append("WorkManager: ");
        sb.append(string);
        string = sb.toString();
        final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, string);
        b = (Context)o.b;
        synchronized (b) {
            ((WeakHashMap<PowerManager$WakeLock, String>)b).put(wakeLock, string);
            return wakeLock;
        }
    }
}
