// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.p0;

@p0(28)
class h extends g
{
    MediaSessionManager h;
    
    h(final Context context) {
        super(context);
        this.h = (MediaSessionManager)context.getSystemService("media_session");
    }
    
    @Override
    public boolean a(final c c) {
        return super.a(c);
    }
    
    @p0(28)
    static final class a extends i.a
    {
        final MediaSessionManager$RemoteUserInfo d;
        
        a(final MediaSessionManager$RemoteUserInfo d) {
            super(d.getPackageName(), d.getPid(), d.getUid());
            this.d = d;
        }
        
        a(final String s, final int n, final int n2) {
            super(s, n, n2);
            this.d = new MediaSessionManager$RemoteUserInfo(s, n, n2);
        }
        
        static String c(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            return mediaSessionManager$RemoteUserInfo.getPackageName();
        }
    }
}
