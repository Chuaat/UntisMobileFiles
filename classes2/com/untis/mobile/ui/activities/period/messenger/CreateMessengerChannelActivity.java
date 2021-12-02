// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period.messenger;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import android.content.Intent;
import android.content.Context;
import androidx.appcompat.app.a;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/ui/activities/period/messenger/CreateMessengerChannelActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "r", "Landroid/os/Bundle;", "arguments", "q", "save", "onCreate", "onResume", "outState", "onSaveInstanceState", "", "H", "Ljava/lang/Long;", "lessonId", "", "G", "Ljava/lang/String;", "profileId", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CreateMessengerChannelActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "a";
    @e
    private static final String K = "b";
    @f
    private String G;
    @f
    private Long H;
    
    static {
        I = new a(null);
    }
    
    private final void q(final Bundle bundle) {
        final Long n = null;
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = bundle.getString("a");
        }
        this.G = string;
        Long value;
        if (bundle == null) {
            value = n;
        }
        else {
            value = bundle.getLong("b");
        }
        this.H = value;
    }
    
    private final void r() {
        final String g = this.G;
        if (g == null) {
            return;
        }
        final Long h = this.H;
        if (h == null) {
            return;
        }
        final long longValue = h;
        final a0 r = ((d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.E(((ViewGroup)this.findViewById(c.i.w4)).getId(), (Fragment)CreateMessengerChannelFragment.I.c(g, longValue), "create-messenger-channel-fragment");
        r.r();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492906);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.q(extras);
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886440);
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.Y(true);
        }
        this.r();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("a", this.G);
        final Long h = this.H;
        long longValue;
        if (h == null) {
            longValue = 0L;
        }
        else {
            longValue = h;
        }
        bundle.putLong("b", longValue);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/activities/period/messenger/CreateMessengerChannelActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "lessonId", "Landroid/content/Intent;", "a", "BUNDLE_LESSON_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)CreateMessengerChannelActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("a", s);
            bundle.putLong("b", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
