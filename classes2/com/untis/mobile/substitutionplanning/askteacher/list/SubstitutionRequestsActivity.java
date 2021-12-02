// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.list;

import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.view.ViewGroup;
import com.untis.mobile.api.websocket.WsEventType;
import com.untis.mobile.utils.s;
import android.util.Log;
import com.untis.mobile.api.websocket.WsEvent;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.substitutionplanning.askteacher.detail.SubstitutionRequestDetailActivity;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import android.view.View;
import com.untis.mobile.substitutionplanning.model.AskTeacherViewDto;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDto;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.websocket.OnWsEventListener;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0014J\"\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0005H\u0014R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006+" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/list/SubstitutionRequestsActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "dto", "Lkotlin/j2;", "y", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherViewDto;", "C", "", "substitutionRequests", "B", "", "visibility", "A", "Landroid/os/Bundle;", "arguments", "v", "z", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/untis/mobile/api/websocket/WsEvent;", "wsEvent", "onWsEvent", "code", "onClosingWs", "onPause", "Lcom/untis/mobile/substitutionplanning/askteacher/list/g;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/substitutionplanning/askteacher/list/g;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SubstitutionRequestsActivity extends com.untis.mobile.ui.activities.common.b implements OnWsEventListener
{
    @e
    public static final a H;
    private static final int I = 1001;
    @e
    private static final String J = "profile_id";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public SubstitutionRequestsActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final g invoke() {
                return (g)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(g.class), null, null);
            }
        });
    }
    
    private final void A(final boolean b) {
        ((ViewGroup)this.findViewById(c.i.vc)).setVisibility(h.U(b, 0, 1, null));
        ((ViewGroup)this.findViewById(c.i.uc)).setVisibility(h.U(b ^ true, 0, 1, null));
    }
    
    private final void B(final List<SubstitutionRequestDto> list) {
        final RecyclerView$h adapter = ((RecyclerView)this.findViewById(c.i.uc)).getAdapter();
        com.untis.mobile.substitutionplanning.askteacher.list.b b;
        if (adapter instanceof com.untis.mobile.substitutionplanning.askteacher.list.b) {
            b = (com.untis.mobile.substitutionplanning.askteacher.list.b)adapter;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.t(list);
        }
    }
    
    private final void C(final AskTeacherViewDto askTeacherViewDto) {
        if (askTeacherViewDto != null) {
            final List<SubstitutionRequestDto> substitutionRequests = askTeacherViewDto.getSubstitutionRequests();
            if (substitutionRequests != null && !substitutionRequests.isEmpty()) {
                this.A(false);
                this.B(askTeacherViewDto.getSubstitutionRequests());
                return;
            }
        }
        this.A(true);
    }
    
    private final g u() {
        return this.G.getValue();
    }
    
    private final void v(final Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = bundle.getString("profile_id");
        }
        final j0 g = j0.G;
        String s = string;
        if (string == null) {
            s = "";
        }
        Profile profile;
        if ((profile = g.l(s)) == null && (profile = g.n()) == null) {
            return;
        }
        this.u().e(profile);
    }
    
    private static final void w(final SubstitutionRequestsActivity substitutionRequestsActivity, final View view) {
        k0.p(substitutionRequestsActivity, "this$0");
        ((ComponentActivity)substitutionRequestsActivity).onBackPressed();
    }
    
    private static final void x(final SubstitutionRequestsActivity substitutionRequestsActivity, final AskTeacherViewDto askTeacherViewDto) {
        k0.p(substitutionRequestsActivity, "this$0");
        substitutionRequestsActivity.C(askTeacherViewDto);
    }
    
    private final void y(final SubstitutionRequestDto substitutionRequestDto) {
        ((ComponentActivity)this).startActivityForResult(SubstitutionRequestDetailActivity.H.a((Context)this, this.u().d().getUniqueId(), substitutionRequestDto), 1001);
    }
    
    private final void z() {
        this.u().f();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        if (n == 1001) {
            if (n2 == -1) {
                this.u().f();
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    public void onClosingWs(final int n) {
        if (n == 1001) {
            this.u().j(this);
        }
    }
    
    @Override
    protected void onCreate(@f Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492964);
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        if (extras != null) {
            bundle = extras;
        }
        this.v(bundle);
        final int uc = c.i.uc;
        ((RecyclerView)this.findViewById(uc)).setAdapter((RecyclerView$h)new com.untis.mobile.substitutionplanning.askteacher.list.b((Context)this, null, new l<SubstitutionRequestDto, j2>() {
            public final void a(@e final SubstitutionRequestDto substitutionRequestDto) {
                k0.p(substitutionRequestDto, "it");
                SubstitutionRequestsActivity.this.y(substitutionRequestDto);
            }
        }, 2, null));
        ((RecyclerView)this.findViewById(uc)).setLayoutManager((RecyclerView$p)new LinearLayoutManager((Context)this));
        ((ImageButton)this.findViewById(c.i.qc)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.list.c(this));
        this.u().c().j((y)this, (l0)new d(this));
        this.u().f();
        this.u().j(this);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (((Activity)this).isFinishing()) {
            this.u().k();
        }
    }
    
    @Override
    public void onWsEvent(@e final WsEvent wsEvent) {
        k0.p(wsEvent, "wsEvent");
        final StringBuilder sb = new StringBuilder();
        sb.append("websocket event: type ");
        sb.append(wsEvent.getType());
        sb.append(", topic ");
        sb.append(wsEvent.getTopic());
        Log.d("untis_log", sb.toString());
        final WsEventType wsEventType = wsEvent.getWsEventType();
        int n;
        if (wsEventType == null) {
            n = -1;
        }
        else {
            n = b.a[wsEventType.ordinal()];
        }
        if (n == 1) {
            s.a.N(new n6.a<j2>() {
                public final void invoke() {
                    SubstitutionRequestsActivity.this.z();
                }
            });
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "com/untis/mobile/substitutionplanning/askteacher/list/SubstitutionRequestsActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Landroid/content/Intent;", "a", "ARGUMENT_PROFILE_ID", "Ljava/lang/String;", "", "REQUEST_DETAIL", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)SubstitutionRequestsActivity.class);
            intent.putExtra("profile_id", s);
            return intent;
        }
    }
}
