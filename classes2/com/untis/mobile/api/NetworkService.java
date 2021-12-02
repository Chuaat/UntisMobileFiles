// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import android.net.ConnectivityManager$NetworkCallback;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\r" }, d2 = { "Lcom/untis/mobile/api/NetworkService;", "", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "status", "Lkotlin/j2;", "onNetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "registerOnNetworkCallback", "callback", "unregisterOnNetworkCallback", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface NetworkService
{
    @e
    ConnectivityManager$NetworkCallback registerOnNetworkCallback(@e final l<? super Boolean, j2> p0);
    
    void unregisterOnNetworkCallback(@e final ConnectivityManager$NetworkCallback p0);
}
