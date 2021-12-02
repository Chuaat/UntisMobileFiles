// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui;

import android.app.Activity;
import kotlin.jvm.internal.k0;
import android.content.Intent;
import android.content.Context;
import androidx.core.view.t0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/MessagesActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/j2;", "switchProfileIfNeeded", "onCreate", "<init>", "()V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesActivity extends b
{
    @e
    private static final String ARGUMENT_PROFILE_ID = "profile_id";
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private final void switchProfileIfNeeded(Bundle extras) {
        Bundle bundle = extras;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
            if ((bundle = extras) == null) {
                return;
            }
        }
        final String string = bundle.getString("profile_id");
        if (string == null) {
            return;
        }
        final j0 g = j0.G;
        final Profile l = g.l(string);
        if (l == null) {
            return;
        }
        g.h(l);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        t0.c(((Activity)this).getWindow(), false);
        super.onCreate(bundle);
        this.switchProfileIfNeeded(bundle);
        this.setContentView(2131493295);
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f" }, d2 = { "Lcom/untis/mobile/messages/ui/MessagesActivity$Companion;", "", "Landroid/content/Context;", "context", "", "profileId", "Landroid/content/Intent;", "newInstance", "ARGUMENT_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final Intent newInstance(@e final Context context, @f final String s) {
            k0.p(context, "context");
            final Intent intent = new Intent(context, (Class)MessagesActivity.class);
            intent.putExtra("profile_id", s);
            return intent;
        }
    }
}
