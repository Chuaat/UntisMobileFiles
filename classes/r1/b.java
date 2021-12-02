// 
// Decompiled by Procyon v0.5.36
// 

package r1;

import br.com.goncalves.pugnotification.notification.e;
import android.content.Intent;
import android.app.PendingIntent;
import android.os.Bundle;
import p1.c;

public class b implements c
{
    private final Bundle a;
    private final int b;
    
    public b(final Bundle a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public PendingIntent a() {
        final Intent intent = new Intent("br.com.goncalves.pugnotification.action.click.intent");
        intent.addFlags(536870912);
        intent.setPackage(e.d.a.getPackageName());
        final Bundle a = this.a;
        if (a != null) {
            intent.putExtras(a);
        }
        return PendingIntent.getBroadcast(e.d.a, this.b, intent, 134217728);
    }
}
