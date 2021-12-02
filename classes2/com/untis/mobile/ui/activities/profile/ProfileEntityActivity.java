// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageView;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.LinearLayout;
import com.untis.mobile.c;
import org.joda.time.t;
import java.util.Comparator;
import kotlin.collections.v;
import android.os.Bundle;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.content.Intent;
import android.os.Parcelable;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.View;
import java.util.List;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.Displayable;
import com.untis.mobile.utils.comparator.a;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0010H\u0014J\"\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/ProfileEntityActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klassen", "Lkotlin/j2;", "z", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teachers", "L", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subjects", "K", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "rooms", "J", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "G", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "H", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ProfileEntityActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "herman";
    private String G;
    @e
    private EntityType H;
    
    static {
        I = new a(null);
    }
    
    public ProfileEntityActivity() {
        this.H = EntityType.NONE;
    }
    
    private static final int A(final Klasse klasse, final Klasse klasse2) {
        return com.untis.mobile.utils.comparator.a.G.a(klasse, klasse2);
    }
    
    private static final int B(final Teacher teacher, final Teacher teacher2) {
        return com.untis.mobile.utils.comparator.a.G.a(teacher, teacher2);
    }
    
    private static final int C(final Subject subject, final Subject subject2) {
        return com.untis.mobile.utils.comparator.a.G.a(subject, subject2);
    }
    
    private static final int D(final Room room, final Room room2) {
        return com.untis.mobile.utils.comparator.a.G.a(room, room2);
    }
    
    private static final void E(final ProfileEntityActivity profileEntityActivity, final List list, final View view) {
        k0.p(profileEntityActivity, "this$0");
        k0.p(list, "$klassen");
        profileEntityActivity.z(list);
    }
    
    private static final void F(final ProfileEntityActivity profileEntityActivity, final List list, final View view) {
        k0.p(profileEntityActivity, "this$0");
        k0.p(list, "$teachers");
        profileEntityActivity.L(list);
    }
    
    private static final void G(final ProfileEntityActivity profileEntityActivity, final List list, final View view) {
        k0.p(profileEntityActivity, "this$0");
        k0.p(list, "$subjects");
        profileEntityActivity.K(list);
    }
    
    private static final void H(final ProfileEntityActivity profileEntityActivity, final List list, final View view) {
        k0.p(profileEntityActivity, "this$0");
        k0.p(list, "$rooms");
        profileEntityActivity.J(list);
    }
    
    private static final void I(final ProfileEntityActivity profileEntityActivity, final View view) {
        k0.p(profileEntityActivity, "this$0");
        ((ComponentActivity)profileEntityActivity).onBackPressed();
    }
    
    private final void J(final List<Room> list) {
        final ProfileEntityDetailActivity.a i = ProfileEntityDetailActivity.I;
        final String g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.c((Context)this, g, (List<? extends Parcelable>)list), 400);
            this.H = EntityType.ROOM;
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    private final void K(final List<Subject> list) {
        final ProfileEntityDetailActivity.a i = ProfileEntityDetailActivity.I;
        final String g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.c((Context)this, g, (List<? extends Parcelable>)list), 400);
            this.H = EntityType.SUBJECT;
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    private final void L(final List<Teacher> list) {
        final ProfileEntityDetailActivity.a i = ProfileEntityDetailActivity.I;
        final String g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.c((Context)this, g, (List<? extends Parcelable>)list), 400);
            this.H = EntityType.TEACHER;
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    private final void z(final List<Klasse> list) {
        final ProfileEntityDetailActivity.a i = ProfileEntityDetailActivity.I;
        final String g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.c((Context)this, g, (List<? extends Parcelable>)list), 400);
            this.H = EntityType.CLASS;
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 400) {
            if (b && intent != null) {
                final long a = ProfileEntityDetailActivity.I.a(intent);
                final j0 g = j0.G;
                final String g2 = this.G;
                if (g2 == null) {
                    k0.S("profileId");
                    throw null;
                }
                final Profile l = g.l(g2);
                if (l == null) {
                    return;
                }
                l.setUserCustomEntityId(a);
                l.setUserCustomEntityType(this.H);
                l.setUserHasTimeTableAccess(true);
                g.d(l);
                ((Activity)this).setResult(-1);
                ((Activity)this).finish();
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        String g = "";
        if (extras != null) {
            final String string = extras.getString("herman", "");
            if (string != null) {
                g = string;
            }
        }
        this.G = g;
        this.setContentView(2131492947);
        final com.untis.mobile.services.masterdata.b.a z = com.untis.mobile.services.masterdata.b.Z;
        final String g2 = this.G;
        if (g2 != null) {
            final com.untis.mobile.services.masterdata.a a = z.a(g2);
            final List<Object> h5 = v.h5((Iterable<?>)a.f(true), (Comparator<? super Object>)l0.G);
            final List<Object> h6 = v.h5((Iterable<?>)com.untis.mobile.services.masterdata.a.a.n(a, true, null, 2, null), (Comparator<? super Object>)o0.G);
            final List<Object> h7 = v.h5((Iterable<?>)a.x(true), (Comparator<? super Object>)n0.G);
            final List<Object> h8 = v.h5((Iterable<?>)a.m(true), (Comparator<? super Object>)m0.G);
            final boolean empty = h5.isEmpty();
            final boolean empty2 = h6.isEmpty();
            final boolean empty3 = h7.isEmpty();
            final boolean empty4 = h8.isEmpty();
            final int b9 = c.i.b9;
            final LinearLayout linearLayout = (LinearLayout)this.findViewById(b9);
            final int n = 8;
            int visibility;
            if (empty) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            linearLayout.setVisibility(visibility);
            ((ImageView)this.findViewById(c.i.c9)).setVisibility(((LinearLayout)this.findViewById(b9)).getVisibility());
            ((LinearLayout)this.findViewById(b9)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.k0(this, h5));
            final int k9 = c.i.k9;
            final LinearLayout linearLayout2 = (LinearLayout)this.findViewById(k9);
            int visibility2;
            if (empty2) {
                visibility2 = 8;
            }
            else {
                visibility2 = 0;
            }
            linearLayout2.setVisibility(visibility2);
            ((ImageView)this.findViewById(c.i.l9)).setVisibility(((LinearLayout)this.findViewById(k9)).getVisibility());
            ((LinearLayout)this.findViewById(k9)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.j0(this, h6));
            final int i9 = c.i.i9;
            final LinearLayout linearLayout3 = (LinearLayout)this.findViewById(i9);
            int visibility3;
            if (empty3) {
                visibility3 = 8;
            }
            else {
                visibility3 = 0;
            }
            linearLayout3.setVisibility(visibility3);
            ((ImageView)this.findViewById(c.i.j9)).setVisibility(((LinearLayout)this.findViewById(i9)).getVisibility());
            ((LinearLayout)this.findViewById(i9)).setOnClickListener((View$OnClickListener)new i0(this, h7));
            final int h9 = c.i.h9;
            final LinearLayout linearLayout4 = (LinearLayout)this.findViewById(h9);
            int visibility4;
            if (empty4) {
                visibility4 = n;
            }
            else {
                visibility4 = 0;
            }
            linearLayout4.setVisibility(visibility4);
            ((LinearLayout)this.findViewById(h9)).setOnClickListener((View$OnClickListener)new h0(this, h8));
            ((ImageView)this.findViewById(c.i.a9)).setOnClickListener((View$OnClickListener)new g0(this));
            if (!empty && empty2 && empty3 && empty4) {
                this.z((List<Klasse>)h5);
            }
            else if (empty && !empty2 && empty3 && empty4) {
                this.L((List<Teacher>)h6);
            }
            else if (empty && empty2 && !empty3 && empty4) {
                this.K((List<Subject>)h7);
            }
            else if (empty && empty2 && empty3 && !empty4) {
                this.J((List<Room>)h8);
            }
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final String g = this.G;
        if (g != null) {
            bundle.putString("herman", g);
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f" }, d2 = { "com/untis/mobile/ui/activities/profile/ProfileEntityActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Landroid/content/Intent;", "a", "BUNDLE_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)ProfileEntityActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("herman", s);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
