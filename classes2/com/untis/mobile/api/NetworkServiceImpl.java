// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import android.net.NetworkRequest;
import android.os.Build$VERSION;
import android.net.NetworkRequest$Builder;
import android.net.ConnectivityManager$NetworkCallback;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.net.ConnectivityManager;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\n\u001a\u00020\t2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/api/NetworkServiceImpl;", "Lcom/untis/mobile/api/NetworkService;", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "status", "Lkotlin/j2;", "onNetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "registerOnNetworkCallback", "callback", "unregisterOnNetworkCallback", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class NetworkServiceImpl implements NetworkService
{
    @e
    private final ConnectivityManager connectivityManager;
    
    public NetworkServiceImpl(@e final ConnectivityManager connectivityManager) {
        k0.p(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
    }
    
    @e
    @Override
    public ConnectivityManager$NetworkCallback registerOnNetworkCallback(@e final l<? super Boolean, j2> l) {
        k0.p(l, "onNetworkCallback");
        final NetworkRequest build = new NetworkRequest$Builder().build();
        final NetworkServiceImpl$registerOnNetworkCallback$callback.NetworkServiceImpl$registerOnNetworkCallback$callback$1 networkServiceImpl$registerOnNetworkCallback$callback$1 = new NetworkServiceImpl$registerOnNetworkCallback$callback.NetworkServiceImpl$registerOnNetworkCallback$callback$1((l)l);
        if (Build$VERSION.SDK_INT >= 24) {
            this.connectivityManager.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)networkServiceImpl$registerOnNetworkCallback$callback$1);
        }
        else {
            this.connectivityManager.registerNetworkCallback(build, (ConnectivityManager$NetworkCallback)networkServiceImpl$registerOnNetworkCallback$callback$1);
        }
        return (ConnectivityManager$NetworkCallback)networkServiceImpl$registerOnNetworkCallback$callback$1;
    }
    
    @Override
    public void unregisterOnNetworkCallback(@e final ConnectivityManager$NetworkCallback connectivityManager$NetworkCallback) {
        k0.p(connectivityManager$NetworkCallback, "callback");
        this.connectivityManager.unregisterNetworkCallback(connectivityManager$NetworkCallback);
    }
}
