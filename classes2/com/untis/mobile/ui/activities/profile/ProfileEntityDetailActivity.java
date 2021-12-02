// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.content.Intent;
import android.view.MenuItem;
import java.util.Iterator;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.c;
import java.util.List;
import android.content.Context;
import com.untis.mobile.persistence.models.Displayable;
import java.util.Collection;
import kotlin.collections.v;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import com.untis.mobile.persistence.models.Entity;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.w;
import android.os.Parcelable;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0014R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/ProfileEntityDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/persistence/models/Entity;", "entity", "Lkotlin/j2;", "u", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "outState", "onSaveInstanceState", "", "G", "Ljava/lang/String;", "profileId", "Ljava/util/ArrayList;", "Landroid/os/Parcelable;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "entities", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ProfileEntityDetailActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "herman";
    @e
    private static final String K = "elise";
    @e
    private static final String L = "george";
    private String G;
    @e
    private final ArrayList<Parcelable> H;
    
    static {
        I = new a(null);
    }
    
    public ProfileEntityDetailActivity() {
        this.H = new ArrayList<Parcelable>();
    }
    
    private static final void s(final ProfileEntityDetailActivity profileEntityDetailActivity, final s0 s0, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(profileEntityDetailActivity, "this$0");
        k0.p(s0, "$adapter");
        profileEntityDetailActivity.u((Entity)s0.c(n));
    }
    
    private static final void t(final ProfileEntityDetailActivity profileEntityDetailActivity, final View view) {
        k0.p(profileEntityDetailActivity, "this$0");
        ((ComponentActivity)profileEntityDetailActivity).onBackPressed();
    }
    
    private final void u(final Entity entity) {
        ((Activity)this).setResult(-1, ProfileEntityDetailActivity.I.b(entity.entityId()));
        ((Activity)this).finish();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras = bundle;
        }
        final String s = "";
        String string;
        if (extras == null || (string = extras.getString("herman", "")) == null) {
            string = "";
        }
        this.G = string;
        final ArrayList<Parcelable> h = this.H;
        Bundle extras2;
        if ((extras2 = bundle) == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        ArrayList<? extends Parcelable> parcelableArrayList;
        if (extras2 == null) {
            parcelableArrayList = null;
        }
        else {
            parcelableArrayList = (ArrayList<? extends Parcelable>)extras2.getParcelableArrayList("elise");
        }
        List<? extends Parcelable> e = parcelableArrayList;
        if (parcelableArrayList == null) {
            e = v.E();
        }
        h.addAll(e);
        this.setContentView(2131492948);
        final ArrayList<Parcelable> h2 = this.H;
        final ArrayList list = new ArrayList<Displayable>(v.Y((Iterable<?>)h2, 10));
        final Iterator<Object> iterator = h2.iterator();
        while (iterator.hasNext()) {
            list.add((Displayable)iterator.next());
        }
        final s0 adapter = new s0((Context)this, (List<? extends Displayable>)list);
        final int e2 = c.i.e9;
        ((ListView)this.findViewById(e2)).setAdapter((ListAdapter)adapter);
        ((ListView)this.findViewById(e2)).setOnItemClickListener((AdapterView$OnItemClickListener)new q0(this, adapter));
        if (this.H.isEmpty() ^ true) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(c.i.f9);
            String string2 = null;
            Label_0344: {
                int n;
                if (this.H.get(0) instanceof Klasse) {
                    n = 2131886680;
                }
                else if (this.H.get(0) instanceof Room) {
                    n = 2131886767;
                }
                else if (this.H.get(0) instanceof Subject) {
                    n = 2131886781;
                }
                else {
                    string2 = s;
                    if (!(this.H.get(0) instanceof Teacher)) {
                        break Label_0344;
                    }
                    n = 2131886783;
                }
                string2 = ((Activity)this).getString(n);
            }
            ((TextView)appCompatTextView).setText((CharSequence)string2);
        }
        ((ImageView)this.findViewById(c.i.d9)).setOnClickListener((View$OnClickListener)new p0(this));
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
            bundle.putParcelableArrayList("elise", (ArrayList)this.H);
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\r\u001a\u00020\f\"\u0010\b\u0000\u0010\u0005*\u00020\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0019" }, d2 = { "com/untis/mobile/ui/activities/profile/ProfileEntityDetailActivity$a", "", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/Entity;", "Lcom/untis/mobile/persistence/models/Displayable;", "ENTITY", "Landroid/content/Context;", "context", "", "profileId", "", "entities", "Landroid/content/Intent;", "c", "data", "", "a", "entityId", "b", "BUNDLE_ENTITIES", "Ljava/lang/String;", "BUNDLE_ENTITY_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final long a(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getLongExtra("george", 0L);
        }
        
        @e
        public final Intent b(final long n) {
            final Intent intent = new Intent();
            intent.putExtra("george", n);
            return intent;
        }
        
        @e
        public final <ENTITY extends android.os.Parcelable> Intent c(@e final Context context, @e final String s, @e final List<? extends ENTITY> c) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(c, "entities");
            final Intent intent = new Intent(context, (Class)ProfileEntityDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("herman", s);
            bundle.putParcelableArrayList("elise", new ArrayList((Collection<? extends E>)c));
            intent.putExtras(bundle);
            return intent;
        }
    }
}
