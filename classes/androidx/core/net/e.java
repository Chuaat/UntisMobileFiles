// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.net;

import java.net.SocketException;
import java.net.Socket;
import android.os.ParcelFileDescriptor;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import java.net.DatagramSocket;
import android.net.TrafficStats;

public final class e
{
    private e() {
    }
    
    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }
    
    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }
    
    @Deprecated
    public static void c(final int n) {
        TrafficStats.incrementOperationCount(n);
    }
    
    @Deprecated
    public static void d(final int n, final int n2) {
        TrafficStats.incrementOperationCount(n, n2);
    }
    
    @Deprecated
    public static void e(final int threadStatsTag) {
        TrafficStats.setThreadStatsTag(threadStatsTag);
    }
    
    public static void f(@j0 final DatagramSocket datagramSocket) throws SocketException {
        if (Build$VERSION.SDK_INT >= 24) {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }
        else {
            final ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.tagSocket((Socket)new b(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }
    }
    
    @Deprecated
    public static void g(final Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }
    
    public static void h(@j0 final DatagramSocket datagramSocket) throws SocketException {
        if (Build$VERSION.SDK_INT >= 24) {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
        else {
            final ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
            TrafficStats.untagSocket((Socket)new b(datagramSocket, fromDatagramSocket.getFileDescriptor()));
            fromDatagramSocket.detachFd();
        }
    }
    
    @Deprecated
    public static void i(final Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
