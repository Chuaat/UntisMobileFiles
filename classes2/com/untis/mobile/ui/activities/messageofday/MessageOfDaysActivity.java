// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.messageofday;

import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.untis.mobile.UntisMobileApplication;
import android.content.Intent;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.ListView;
import com.untis.mobile.c;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import android.view.View;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.messages.a;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/ui/activities/messageofday/MessageOfDaysActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "messages", "Lkotlin/j2;", "t", "r", "Landroid/os/Bundle;", "save", "onCreate", "outState", "onSaveInstanceState", "Lcom/untis/mobile/services/messages/a;", "H", "Lcom/untis/mobile/services/messages/a;", "messageService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageOfDaysActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "julius";
    private Profile G;
    private com.untis.mobile.services.messages.a H;
    
    static {
        I = new a(null);
    }
    
    private final List<MessageOfDay> r() {
        final com.untis.mobile.services.messages.a h = this.H;
        if (h != null) {
            return h.l(false);
        }
        k0.S("messageService");
        throw null;
    }
    
    private static final void s(final MessageOfDaysActivity messageOfDaysActivity, final View view) {
        k0.p(messageOfDaysActivity, "this$0");
        ((ComponentActivity)messageOfDaysActivity).onBackPressed();
    }
    
    private final void t(final List<MessageOfDay> list) {
        for (final MessageOfDay messageOfDay : list) {
            messageOfDay.setRead(true);
            final com.untis.mobile.services.messages.a h = this.H;
            if (h == null) {
                k0.S("messageService");
                throw null;
            }
            h.m(messageOfDay);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492931);
        final j0 g = j0.G;
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        String s = "";
        if (extras != null) {
            final String string = extras.getString("julius", "");
            if (string != null) {
                s = string;
            }
        }
        Profile g2;
        if ((g2 = g.l(s)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        final Profile g3 = this.G;
        if (g3 != null) {
            this.H = new com.untis.mobile.services.messages.e(g3.getUniqueId());
            final List<MessageOfDay> r = this.r();
            this.t(r);
            final int o7 = c.i.o7;
            ((ListView)this.findViewById(o7)).setAdapter((ListAdapter)new com.untis.mobile.ui.activities.messageofday.b((Context)this, r));
            ((ListView)this.findViewById(o7)).setEmptyView((View)this.findViewById(c.i.q7));
            ((TextView)this.findViewById(c.i.r7)).setText((CharSequence)com.untis.mobile.utils.time.a.b().g4("dd.MM.yyyy"));
            ((ImageView)this.findViewById(c.i.p7)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.messageofday.c(this));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g != null) {
            bundle.putString("julius", g.getUniqueId());
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "com/untis/mobile/ui/activities/messageofday/MessageOfDaysActivity$a", "", "", "profileId", "Landroid/content/Intent;", "a", "BUNDLE_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final String s) {
            k0.p(s, "profileId");
            final Intent intent = new Intent((Context)UntisMobileApplication.I.b(), (Class)MessageOfDaysActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("julius", s);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
