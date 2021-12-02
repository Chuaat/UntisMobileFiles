// 
// Decompiled by Procyon v0.5.36
// 

package r1;

import android.content.Intent;
import br.com.goncalves.pugnotification.notification.e;
import android.app.PendingIntent;
import android.os.Bundle;

public class c implements p1.c
{
    private final Class<?> a;
    private final Bundle b;
    private final int c;
    
    public c(final Class<?> a, final Bundle b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public PendingIntent a() {
        final Intent intent = new Intent(e.d.a, (Class)this.a);
        intent.setAction("br.com.goncalves.pugnotification.action.dismiss.intent");
        intent.addFlags(536870912);
        intent.setPackage(e.d.a.getPackageName());
        final Bundle b = this.b;
        if (b != null) {
            intent.putExtras(b);
        }
        return PendingIntent.getActivity(e.d.a, this.c, intent, 134217728);
    }
}
