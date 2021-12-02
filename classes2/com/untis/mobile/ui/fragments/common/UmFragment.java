// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.common;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.d;
import android.view.View;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.calendar.network.error.c;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.network.error.b;
import kotlin.coroutines.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.NetworkService;
import n6.a;
import kotlin.j2;
import n6.l;
import kotlin.b0;
import org.jetbrains.annotations.f;
import android.net.ConnectivityManager$NetworkCallback;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.Metadata;
import androidx.fragment.app.Fragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J)\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0014J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u00020\u001d8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "network", "Lkotlin/j2;", "onNetworkChange", "setOnNetworkChangeListener", "Lcom/untis/mobile/ui/activities/common/b;", "getUmActivity", "Landroid/view/View;", "currentFocusedView", "hideKeyboard", "(Landroid/view/View;)Lkotlin/j2;", "showKeyboard", "", "throwable", "beforeErrorHandler", "onBackPressed", "onPause", "onResume", "Lcom/untis/mobile/api/NetworkService;", "mNetworkService$delegate", "Lkotlin/b0;", "getMNetworkService", "()Lcom/untis/mobile/api/NetworkService;", "mNetworkService", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getErrorHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroid/net/ConnectivityManager$NetworkCallback;", "mNetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class UmFragment extends Fragment
{
    @e
    private final CoroutineExceptionHandler errorHandler;
    @f
    private ConnectivityManager$NetworkCallback mNetworkCallback;
    @e
    private final b0 mNetworkService$delegate;
    @f
    private l<? super Boolean, j2> mOnNetworkChange;
    
    public UmFragment() {
        this.mNetworkService$delegate = d0.c((a<?>)new a<NetworkService>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final NetworkService invoke() {
                return (NetworkService)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(NetworkService.class), null, null);
            }
        });
        this.errorHandler = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ UmFragment G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                if (!this.G.beforeErrorHandler(t)) {
                    if (t instanceof com.untis.mobile.calendar.network.error.b) {
                        final com.untis.mobile.calendar.network.error.b b = (com.untis.mobile.calendar.network.error.b)t;
                        final FragmentManager childFragmentManager = this.G.getChildFragmentManager();
                        k0.o(childFragmentManager, "childFragmentManager");
                        com.untis.mobile.calendar.network.error.c.a(b, childFragmentManager);
                    }
                    else if (t instanceof y3.c) {
                        final y3.c c = (y3.c)t;
                        final FragmentManager childFragmentManager2 = this.G.getChildFragmentManager();
                        k0.o(childFragmentManager2, "childFragmentManager");
                        com.untis.mobile.utils.extension.f.e(c, childFragmentManager2);
                    }
                    else {
                        final Context context = this.G.getContext();
                        if (context != null) {
                            h.l(context, t);
                        }
                    }
                }
            }
        };
    }
    
    private final NetworkService getMNetworkService() {
        return this.mNetworkService$delegate.getValue();
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    protected boolean beforeErrorHandler(@e final Throwable t) {
        k0.p(t, "throwable");
        return false;
    }
    
    @e
    protected final CoroutineExceptionHandler getErrorHandler() {
        return this.errorHandler;
    }
    
    @f
    public final com.untis.mobile.ui.activities.common.b getUmActivity() {
        final d activity = this.getActivity();
        if (activity == null) {
            return null;
        }
        if (activity instanceof com.untis.mobile.ui.activities.common.b) {
            return (com.untis.mobile.ui.activities.common.b)activity;
        }
        return null;
    }
    
    @f
    public final j2 hideKeyboard(@f final View view) {
        final com.untis.mobile.ui.activities.common.b umActivity = this.getUmActivity();
        j2 a;
        if (umActivity == null) {
            a = null;
        }
        else {
            umActivity.hideKeyBoard(view);
            a = j2.a;
        }
        return a;
    }
    
    protected void onBackPressed() {
        final View view = this.getView();
        View focus;
        if (view == null) {
            focus = null;
        }
        else {
            focus = view.findFocus();
        }
        this.hideKeyboard(focus);
        final d activity = this.getActivity();
        if (activity != null) {
            ((ComponentActivity)activity).onBackPressed();
        }
    }
    
    public void onPause() {
        super.onPause();
        final ConnectivityManager$NetworkCallback mNetworkCallback = this.mNetworkCallback;
        if (mNetworkCallback != null) {
            this.getMNetworkService().unregisterOnNetworkCallback(mNetworkCallback);
            this.mNetworkCallback = null;
        }
    }
    
    public void onResume() {
        super.onResume();
        final l<? super Boolean, j2> mOnNetworkChange = this.mOnNetworkChange;
        if (mOnNetworkChange != null) {
            this.setOnNetworkChangeListener(mOnNetworkChange);
        }
    }
    
    public final void setOnNetworkChangeListener(@e final l<? super Boolean, j2> mOnNetworkChange) {
        k0.p(mOnNetworkChange, "onNetworkChange");
        this.mOnNetworkChange = mOnNetworkChange;
        final ConnectivityManager$NetworkCallback mNetworkCallback = this.mNetworkCallback;
        if (mNetworkCallback != null) {
            this.getMNetworkService().unregisterOnNetworkCallback(mNetworkCallback);
            this.mNetworkCallback = null;
        }
        this.mNetworkCallback = this.getMNetworkService().registerOnNetworkCallback(mOnNetworkChange);
    }
    
    @f
    public final j2 showKeyboard(@f final View view) {
        final com.untis.mobile.ui.activities.common.b umActivity = this.getUmActivity();
        j2 a;
        if (umActivity == null) {
            a = null;
        }
        else {
            umActivity.showKeyBoard(view);
            a = j2.a;
        }
        return a;
    }
}
