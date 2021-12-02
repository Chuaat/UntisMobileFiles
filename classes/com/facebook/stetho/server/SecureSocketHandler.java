// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import java.io.IOException;
import android.net.Credentials;
import com.facebook.stetho.common.LogUtil;
import android.net.LocalSocket;
import android.content.Context;

public abstract class SecureSocketHandler implements SocketHandler
{
    private final Context mContext;
    
    public SecureSocketHandler(final Context mContext) {
        this.mContext = mContext;
    }
    
    private static void enforcePermission(final Context context, final LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        final Credentials peerCredentials = localSocket.getPeerCredentials();
        final int uid = peerCredentials.getUid();
        final int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.v("Got request from uid=%d, pid=%d", uid, pid);
        }
        if (context.checkPermission("android.permission.DUMP", pid, uid) == 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Peer pid=");
        sb.append(pid);
        sb.append(", uid=");
        sb.append(uid);
        sb.append(" does not have ");
        sb.append("android.permission.DUMP");
        throw new PeerAuthorizationException(sb.toString());
    }
    
    @Override
    public final void onAccepted(final LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            this.onSecured(localSocket);
        }
        catch (PeerAuthorizationException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unauthorized request: ");
            sb.append(ex.getMessage());
            LogUtil.e(sb.toString());
        }
    }
    
    protected abstract void onSecured(final LocalSocket p0) throws IOException;
}
