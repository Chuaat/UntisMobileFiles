// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.p0;
import android.os.Build$VERSION;
import android.app.RemoteAction;
import androidx.core.util.n;
import androidx.annotation.j0;
import android.app.PendingIntent;
import androidx.annotation.t0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.h;

public final class RemoteActionCompat implements h
{
    @t0({ t0.a.H })
    public IconCompat a;
    @t0({ t0.a.H })
    public CharSequence b;
    @t0({ t0.a.H })
    public CharSequence c;
    @t0({ t0.a.H })
    public PendingIntent d;
    @t0({ t0.a.H })
    public boolean e;
    @t0({ t0.a.H })
    public boolean f;
    
    @t0({ t0.a.H })
    public RemoteActionCompat() {
    }
    
    public RemoteActionCompat(@j0 final RemoteActionCompat remoteActionCompat) {
        n.g(remoteActionCompat);
        this.a = remoteActionCompat.a;
        this.b = remoteActionCompat.b;
        this.c = remoteActionCompat.c;
        this.d = remoteActionCompat.d;
        this.e = remoteActionCompat.e;
        this.f = remoteActionCompat.f;
    }
    
    public RemoteActionCompat(@j0 final IconCompat iconCompat, @j0 final CharSequence charSequence, @j0 final CharSequence charSequence2, @j0 final PendingIntent pendingIntent) {
        this.a = n.g(iconCompat);
        this.b = n.g(charSequence);
        this.c = n.g(charSequence2);
        this.d = n.g(pendingIntent);
        this.e = true;
        this.f = true;
    }
    
    @j0
    @p0(26)
    public static RemoteActionCompat g(@j0 final RemoteAction remoteAction) {
        n.g(remoteAction);
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.m(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.m(remoteAction.isEnabled());
        if (Build$VERSION.SDK_INT >= 28) {
            remoteActionCompat.n(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }
    
    @j0
    public PendingIntent h() {
        return this.d;
    }
    
    @j0
    public CharSequence i() {
        return this.c;
    }
    
    @j0
    public IconCompat j() {
        return this.a;
    }
    
    @j0
    public CharSequence k() {
        return this.b;
    }
    
    public boolean l() {
        return this.e;
    }
    
    public void m(final boolean e) {
        this.e = e;
    }
    
    public void n(final boolean f) {
        this.f = f;
    }
    
    public boolean o() {
        return this.f;
    }
    
    @j0
    @p0(26)
    public RemoteAction p() {
        final RemoteAction remoteAction = new RemoteAction(this.a.Q(), this.b, this.c, this.d);
        remoteAction.setEnabled(this.l());
        if (Build$VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(this.o());
        }
        return remoteAction;
    }
}
