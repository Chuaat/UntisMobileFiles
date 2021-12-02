// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final e e) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(e);
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final e e) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, e);
    }
}
