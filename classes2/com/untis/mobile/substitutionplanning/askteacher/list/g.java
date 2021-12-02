// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.list;

import com.untis.mobile.api.websocket.WsTopic;
import com.untis.mobile.api.websocket.OnWsEventListener;
import rx.functions.b;
import rx.android.schedulers.a;
import androidx.lifecycle.LiveData;
import android.util.Log;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.AskTeacherViewDto;
import androidx.lifecycle.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.api.websocket.WebUntisWebSocket;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.api.k;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/list/g;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/j2;", "e", "f", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherViewDto;", "c", "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "listener", "j", "k", "Lcom/untis/mobile/persistence/models/profile/Profile;", "d", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "i", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "Lcom/untis/mobile/substitutionplanning/api/k;", "a", "Lcom/untis/mobile/substitutionplanning/api/k;", "service", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/k0;", "askTeacherViewDto", "Lcom/untis/mobile/api/websocket/WebUntisWebSocket;", "b", "Lcom/untis/mobile/api/websocket/WebUntisWebSocket;", "wuWebSocket", "<init>", "(Lcom/untis/mobile/substitutionplanning/api/k;Lcom/untis/mobile/api/websocket/WebUntisWebSocket;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g extends w0
{
    @e
    private final k a;
    @e
    private final WebUntisWebSocket b;
    public Profile c;
    @e
    private final k0<AskTeacherViewDto> d;
    
    public g(@e final k a, @e final WebUntisWebSocket b) {
        kotlin.jvm.internal.k0.p(a, "service");
        kotlin.jvm.internal.k0.p(b, "wuWebSocket");
        this.a = a;
        this.b = b;
        this.d = (k0<AskTeacherViewDto>)new k0();
    }
    
    private static final void g(final g g, final AskTeacherViewDto askTeacherViewDto) {
        kotlin.jvm.internal.k0.p(g, "this$0");
        g.d.q((Object)askTeacherViewDto);
    }
    
    private static final void h(final g g, final Throwable t) {
        kotlin.jvm.internal.k0.p(g, "this$0");
        g.d.q((Object)new AskTeacherViewDto(v.E()));
        Log.e("untis_log", "error on loading ask teacher view dto", t);
    }
    
    @e
    public final LiveData<AskTeacherViewDto> c() {
        return (LiveData<AskTeacherViewDto>)this.d;
    }
    
    @e
    public final Profile d() {
        final Profile c = this.c;
        if (c != null) {
            return c;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void e(@e final Profile profile) {
        kotlin.jvm.internal.k0.p(profile, "profile");
        this.i(profile);
    }
    
    public final void f() {
        k.z(this.a, this.d(), false, 2, null).Q3(rx.android.schedulers.a.c()).C5((b)new com.untis.mobile.substitutionplanning.askteacher.list.e(this), (b)new f(this));
    }
    
    public final void i(@e final Profile c) {
        kotlin.jvm.internal.k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void j(@e final OnWsEventListener onWsEventListener) {
        kotlin.jvm.internal.k0.p(onWsEventListener, "listener");
        this.b.start(this.d());
        this.b.subscribe(WsTopic.SUBSTITUTION_REQUESTS, onWsEventListener);
    }
    
    public final void k() {
        this.b.unsubscribe(WsTopic.SUBSTITUTION_REQUESTS);
        this.b.stop();
    }
}
