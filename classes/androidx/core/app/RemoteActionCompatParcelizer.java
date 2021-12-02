// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.Parcelable;
import androidx.versionedparcelable.h;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final e e) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = e.h0(remoteActionCompat.a, 1);
        remoteActionCompat.b = e.w(remoteActionCompat.b, 2);
        remoteActionCompat.c = e.w(remoteActionCompat.c, 3);
        remoteActionCompat.d = e.W(remoteActionCompat.d, 4);
        remoteActionCompat.e = e.m(remoteActionCompat.e, 5);
        remoteActionCompat.f = e.m(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final e e) {
        e.j0(false, false);
        e.m1(remoteActionCompat.a, 1);
        e.z0(remoteActionCompat.b, 2);
        e.z0(remoteActionCompat.c, 3);
        e.X0((Parcelable)remoteActionCompat.d, 4);
        e.n0(remoteActionCompat.e, 5);
        e.n0(remoteActionCompat.f, 6);
    }
}
