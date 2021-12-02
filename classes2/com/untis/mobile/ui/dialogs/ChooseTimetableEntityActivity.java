// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import android.widget.FrameLayout;
import android.app.Activity;
import android.content.Intent;
import org.jetbrains.annotations.f;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.Iterator;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import java.util.Collection;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.t;
import java.util.ArrayList;
import java.util.Objects;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.utils.e0;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import android.widget.ListView;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import android.widget.TextView;
import com.untis.mobile.c;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00032\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&¨\u0006*" }, d2 = { "Lcom/untis/mobile/ui/dialogs/ChooseTimetableEntityActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "K", "B", "A", "F", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "v", "H", "t", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "u", "x", "w", "y", "Landroid/os/Bundle;", "save", "z", "C", "", "entityId", "D", "onCreate", "Lcom/untis/mobile/services/timetable/placeholder/k;", "J", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/masterdata/a;", "I", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/EntityType;", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ChooseTimetableEntityActivity extends com.untis.mobile.ui.activities.common.b
{
    @e
    public static final a K;
    @e
    private static final String L = "kalimari";
    @e
    private static final String M = "ringe";
    @e
    private static final String N = "ene";
    @e
    private static final String O = "mene";
    @e
    private static final String P = "muh";
    private Profile G;
    @e
    private EntityType H;
    private com.untis.mobile.services.masterdata.a I;
    private k J;
    
    static {
        K = new a(null);
    }
    
    public ChooseTimetableEntityActivity() {
        this.H = EntityType.NONE;
    }
    
    private final void A() {
        this.y();
        if (this.H != EntityType.NONE) {
            this.F();
            this.x();
        }
        else {
            this.H();
            this.w();
        }
    }
    
    private final void B() {
        this.A();
    }
    
    private final void C(final EntityType h) {
        this.H = h;
        this.B();
    }
    
    private final void D(final EntityType entityType, final long n) {
        final a k = ChooseTimetableEntityActivity.K;
        final Profile g = this.G;
        if (g != null) {
            ((Activity)this).setResult(-1, k.f(g, entityType, n));
            ((Activity)this).finish();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    static /* synthetic */ void E(final ChooseTimetableEntityActivity chooseTimetableEntityActivity, EntityType h, final long n, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            h = chooseTimetableEntityActivity.H;
        }
        chooseTimetableEntityActivity.D(h, n);
    }
    
    private final void F() {
        ((FrameLayout)this.findViewById(c.i.J3)).setVisibility(0);
        ((TextView)this.findViewById(c.i.K3)).setText((CharSequence)h.v((Context)this, this.H));
        final List<DisplayableEntity> v = this.v(this.H);
        final int i3 = c.i.I3;
        ((ListView)this.findViewById(i3)).setAdapter((ListAdapter)new com.untis.mobile.ui.dialogs.e((Context)this, v, false));
        ((ListView)this.findViewById(i3)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.dialogs.b(this));
        final e0.a a = e0.a;
        final ListView listView = (ListView)this.findViewById(i3);
        k0.o(listView, "activity_choose_timetable_entity_details");
        a.a(listView);
    }
    
    private static final void G(final ChooseTimetableEntityActivity chooseTimetableEntityActivity, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(chooseTimetableEntityActivity, "this$0");
        E(chooseTimetableEntityActivity, null, n2, 1, null);
    }
    
    private final void H() {
        final Profile g = this.G;
        if (g != null) {
            final List<DisplayableEntity> u = this.u(g);
            final CardView cardView = (CardView)this.findViewById(c.i.M3);
            int visibility;
            if (u.isEmpty() ^ true) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((FrameLayout)cardView).setVisibility(visibility);
            final int l3 = c.i.L3;
            ((ListView)this.findViewById(l3)).setAdapter((ListAdapter)new com.untis.mobile.ui.dialogs.e((Context)this, u, true));
            ((ListView)this.findViewById(l3)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.dialogs.c(this));
            final e0.a a = e0.a;
            final ListView listView = (ListView)this.findViewById(l3);
            k0.o(listView, "activity_choose_timetable_entity_favorites");
            a.a(listView);
            final List<DisplayableEntity> t = this.t();
            ((FrameLayout)this.findViewById(c.i.Q3)).setVisibility(0);
            final int p3 = c.i.P3;
            ((ListView)this.findViewById(p3)).setAdapter((ListAdapter)new com.untis.mobile.ui.dialogs.e((Context)this, t, true));
            ((ListView)this.findViewById(p3)).setOnItemClickListener((AdapterView$OnItemClickListener)new d(this));
            final ListView listView2 = (ListView)this.findViewById(p3);
            k0.o(listView2, "activity_choose_timetable_entity_ttentities");
            a.a(listView2);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void I(final ChooseTimetableEntityActivity chooseTimetableEntityActivity, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(chooseTimetableEntityActivity, "this$0");
        final ListAdapter adapter = ((ListView)chooseTimetableEntityActivity.findViewById(c.i.L3)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.dialogs.DisplayableEntityAdapter");
        final com.untis.mobile.ui.dialogs.e e = (com.untis.mobile.ui.dialogs.e)adapter;
        chooseTimetableEntityActivity.D(e.b(n).entityType(), e.b(n).entityId());
    }
    
    private static final void J(final ChooseTimetableEntityActivity chooseTimetableEntityActivity, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(chooseTimetableEntityActivity, "this$0");
        final ListAdapter adapter = ((ListView)chooseTimetableEntityActivity.findViewById(c.i.P3)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.dialogs.DisplayableEntityAdapter");
        chooseTimetableEntityActivity.C(((com.untis.mobile.ui.dialogs.e)adapter).b(n).entityType());
    }
    
    private final void K() {
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886586);
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.Y(true);
        }
    }
    
    private final List<DisplayableEntity> t() {
        final ArrayList<com.untis.mobile.ui.dialogs.k> list = (ArrayList<com.untis.mobile.ui.dialogs.k>)new ArrayList<DisplayableEntity>();
        final com.untis.mobile.services.masterdata.a i = this.I;
        if (i == null) {
            k0.S("masterDataService");
            throw null;
        }
        final List<Klasse> f = i.f(true);
        if (f.isEmpty() ^ true) {
            final String string = ((Activity)this).getString(2131886680);
            k0.o(string, "getString(R.string.shared_classes_text)");
            final EntityType class1 = EntityType.CLASS;
            final long n = class1.getWebuntisId();
            final StringBuilder sb = new StringBuilder();
            sb.append(f.size());
            sb.append(' ');
            sb.append(string);
            list.add(new com.untis.mobile.ui.dialogs.k(n, class1, string, sb.toString()));
        }
        final com.untis.mobile.services.masterdata.a j = this.I;
        if (j == null) {
            k0.S("masterDataService");
            throw null;
        }
        final List n2 = com.untis.mobile.services.masterdata.a.a.n(j, true, null, 2, null);
        if (n2.isEmpty() ^ true) {
            final String string2 = ((Activity)this).getString(2131886783);
            k0.o(string2, "getString(R.string.shared_teachers_text)");
            final EntityType teacher = EntityType.TEACHER;
            final long n3 = teacher.getWebuntisId();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(n2.size());
            sb2.append(' ');
            sb2.append(string2);
            list.add(new com.untis.mobile.ui.dialogs.k(n3, teacher, string2, sb2.toString()));
        }
        final com.untis.mobile.services.masterdata.a k = this.I;
        if (k == null) {
            k0.S("masterDataService");
            throw null;
        }
        final List<Subject> x = k.x(true);
        if (x.isEmpty() ^ true) {
            final String string3 = ((Activity)this).getString(2131886781);
            k0.o(string3, "getString(R.string.shared_subjects_text)");
            final EntityType subject = EntityType.SUBJECT;
            final long n4 = subject.getWebuntisId();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(x.size());
            sb3.append(' ');
            sb3.append(string3);
            list.add(new com.untis.mobile.ui.dialogs.k(n4, subject, string3, sb3.toString()));
        }
        final com.untis.mobile.services.masterdata.a l = this.I;
        if (l != null) {
            final List<Room> m = l.m(true);
            if (m.isEmpty() ^ true) {
                final String string4 = ((Activity)this).getString(2131886767);
                k0.o(string4, "getString(R.string.shared_rooms_text)");
                final EntityType room = EntityType.ROOM;
                final long n5 = room.getWebuntisId();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(m.size());
                sb4.append(' ');
                sb4.append(string4);
                list.add(new com.untis.mobile.ui.dialogs.k(n5, room, string4, sb4.toString()));
            }
            return (List<DisplayableEntity>)list;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final List<DisplayableEntity> u(final Profile profile) {
        final ArrayList<com.untis.mobile.ui.dialogs.k> list = (ArrayList<com.untis.mobile.ui.dialogs.k>)new ArrayList<Object>();
        if (profile.hasEntity() && profile.getEntityType().isTimetableEntity()) {
            list.add(new com.untis.mobile.ui.dialogs.k(profile));
        }
        if (profile.getEntityType().isParentRole() && (profile.getUserChildren().isEmpty() ^ true)) {
            final Set<Child> userChildren = profile.getUserChildren();
            final ArrayList<com.untis.mobile.ui.dialogs.k> c = new ArrayList<com.untis.mobile.ui.dialogs.k>();
            for (final Child child : userChildren) {
                final com.untis.mobile.services.masterdata.a i = this.I;
                if (i == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final Student v = i.V(child.getId());
                if (v == null) {
                    continue;
                }
                c.add((com.untis.mobile.ui.dialogs.k)v);
            }
            list.addAll((Collection<?>)c);
        }
        final k j = this.J;
        if (j != null) {
            final List<TimeTableEntity> t = j.t();
            final ArrayList<TimeTableEntity> list2 = new ArrayList<TimeTableEntity>();
            for (final TimeTableEntity next : t) {
                if (next.getFavorite()) {
                    list2.add(next);
                }
            }
            if (list2.isEmpty() ^ true) {
                final ArrayList<com.untis.mobile.ui.dialogs.k> c2 = new ArrayList<com.untis.mobile.ui.dialogs.k>();
                for (final TimeTableEntity timeTableEntity : list2) {
                    final com.untis.mobile.services.masterdata.a k = this.I;
                    if (k == null) {
                        k0.S("masterDataService");
                        throw null;
                    }
                    final DisplayableEntity v2 = k.v(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
                    if (v2 == null) {
                        continue;
                    }
                    c2.add((com.untis.mobile.ui.dialogs.k)v2);
                }
                list.addAll((Collection<?>)c2);
            }
            return (List<DisplayableEntity>)list;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    private final List<DisplayableEntity> v(final EntityType entityType) {
        final int n = b.a[entityType.ordinal()];
        Object o;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        o = v.E();
                    }
                    else {
                        final com.untis.mobile.services.masterdata.a i = this.I;
                        if (i == null) {
                            k0.S("masterDataService");
                            throw null;
                        }
                        o = i.x(true);
                    }
                }
                else {
                    final com.untis.mobile.services.masterdata.a j = this.I;
                    if (j == null) {
                        k0.S("masterDataService");
                        throw null;
                    }
                    o = j.m(true);
                }
            }
            else {
                final com.untis.mobile.services.masterdata.a k = this.I;
                if (k == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                o = com.untis.mobile.services.masterdata.a.a.n(k, true, null, 2, null);
            }
        }
        else {
            final com.untis.mobile.services.masterdata.a l = this.I;
            if (l == null) {
                k0.S("masterDataService");
                throw null;
            }
            o = l.f(true);
        }
        return (List<DisplayableEntity>)o;
    }
    
    private final void w() {
        ((FrameLayout)this.findViewById(c.i.J3)).setVisibility(8);
    }
    
    private final void x() {
        ((FrameLayout)this.findViewById(c.i.M3)).setVisibility(8);
        ((FrameLayout)this.findViewById(c.i.Q3)).setVisibility(8);
    }
    
    private final void y() {
        ((FrameLayout)this.findViewById(c.i.O3)).setVisibility(8);
    }
    
    private final void z(final Bundle bundle) {
        final j0 g = j0.G;
        String s = "";
        if (bundle != null) {
            final String string = bundle.getString("kalimari");
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
        final EntityType.Companion companion = EntityType.Companion;
        Integer value;
        if (bundle == null) {
            value = null;
        }
        else {
            value = bundle.getInt("ringe");
        }
        this.H = companion.findBy(value);
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.I = g3.getMasterDataService();
        final Profile g4 = this.G;
        if (g4 != null) {
            this.J = g4.getTimeTableService();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.z(extras);
        this.setContentView(2131492903);
        this.B();
        this.K();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a" }, d2 = { "com/untis/mobile/ui/dialogs/ChooseTimetableEntityActivity$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Landroid/content/Intent;", "a", "", "entityId", "f", "data", "d", "c", "", "e", "BUNDLE_ENTITY_TYPE", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "DATA_ENTITY_ID", "DATA_ENTITY_TYPE", "DATA_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final Profile profile, @e final EntityType entityType) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            k0.p(entityType, "entityType");
            final Intent intent = new Intent(context, (Class)ChooseTimetableEntityActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("kalimari", profile.getUniqueId());
            bundle.putInt("ringe", entityType.getWebuntisId());
            intent.putExtras(bundle);
            return intent;
        }
        
        public final long c(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getLongExtra("mene", 0L);
        }
        
        @e
        public final EntityType d(@e final Intent intent) {
            k0.p(intent, "data");
            return EntityType.Companion.findBy(intent.getIntExtra("ene", EntityType.NONE.getWebuntisId()));
        }
        
        @e
        public final String e(@e final Intent intent) {
            k0.p(intent, "data");
            String stringExtra;
            if ((stringExtra = intent.getStringExtra("muh")) == null) {
                stringExtra = "";
            }
            return stringExtra;
        }
        
        @e
        public final Intent f(@e final Profile profile, @e final EntityType entityType, final long n) {
            k0.p(profile, "profile");
            k0.p(entityType, "entityType");
            final Intent intent = new Intent();
            intent.putExtra("muh", profile.getUniqueId());
            intent.putExtra("ene", entityType.getWebuntisId());
            intent.putExtra("mene", n);
            return intent;
        }
    }
}
