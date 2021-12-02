// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.FrameLayout;
import java.util.Collection;
import java.util.Objects;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import android.widget.BaseAdapter;
import android.content.Context;
import kotlin.text.s;
import com.untis.mobile.ui.adapters.h;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.View;
import com.untis.mobile.ui.adapters.j;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 82\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b6\u00107J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0006\u0010\u0014\u001a\u00020\u0005R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:" }, d2 = { "Lcom/untis/mobile/ui/fragments/InfoCenterThingsToDoChildFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "Lcom/untis/mobile/ui/adapters/j$a;", "thingsToDo", "Lkotlin/j2;", "s", "r", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "t", "outState", "onSaveInstanceState", "u", "I", "Ljava/util/List;", "Landroid/widget/TextView;", "N", "Landroid/widget/TextView;", "text", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroidx/cardview/widget/CardView;", "M", "Landroidx/cardview/widget/CardView;", "cardView", "Lcom/untis/mobile/services/masterdata/a;", "O", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/widget/ListView;", "K", "Landroid/widget/ListView;", "listView", "Lcom/untis/mobile/persistence/models/profile/Child;", "H", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "Landroid/widget/ListAdapter;", "L", "Landroid/widget/ListAdapter;", "adapter", "J", "Landroid/view/View;", "root", "<init>", "()V", "P", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterThingsToDoChildFragment extends UmFragment
{
    @e
    public static final a P;
    @e
    private static final String Q = "child";
    @e
    private static final String R = "thingstodo";
    @e
    private static final String S = "hercules";
    private Profile G;
    @f
    private Child H;
    @f
    private List<? extends j.a> I;
    @f
    private View J;
    @f
    private ListView K;
    @f
    private ListAdapter L;
    @f
    private CardView M;
    @f
    private TextView N;
    private com.untis.mobile.services.masterdata.a O;
    
    static {
        P = new a(null);
    }
    
    private final List<j.a> r(final List<? extends j.a> i) {
        if (this.I == null && (this.I = i) == null) {
            return null;
        }
        if (this.H == null) {
            return (List<j.a>)this.I;
        }
        final ArrayList<j.a> list = new ArrayList<j.a>();
        if (i != null) {
            for (final j.a e : i) {
                final com.untis.mobile.services.masterdata.a o = this.O;
                if (o == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final Long h = e.h();
                k0.o(h, "todo.studentId");
                final Student v = o.V(h.longValue());
                if (v != null) {
                    final long id = v.getId();
                    final Child h2 = this.H;
                    boolean b = false;
                    if (h2 != null) {
                        if (id == h2.getId()) {
                            b = true;
                        }
                    }
                    if (!b) {
                        continue;
                    }
                }
                list.add(e);
            }
        }
        return list;
    }
    
    private final void s(final List<? extends j.a> list) {
        final List<j.a> r = this.r(list);
        this.I = r;
        BaseAdapter l;
        if (r == null) {
            final Context context = this.getContext();
            k0.m(context);
            l = new com.untis.mobile.ui.adapters.a(context, 10);
        }
        else {
            final b b = (b)this.getActivity();
            k0.m(b);
            final FragmentManager fragmentManager = this.getFragmentManager();
            final Child h = this.H;
            final List<? extends j.a> i = this.I;
            k0.m(i);
            l = new h(b, fragmentManager, h, (List<j.a>)i);
        }
        this.L = (ListAdapter)l;
        final ListView k = this.K;
        k0.m(k);
        k.setAdapter(this.L);
        final Context context2 = this.getContext();
        k0.m(context2);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(context2);
        final Profile g = this.G;
        if (g != null) {
            if (!a.J(g)) {
                final ListView j = this.K;
                k0.m(j);
                j.setVisibility(8);
            }
            else {
                final List<? extends j.a> m = this.I;
                if (m != null) {
                    k0.m(m);
                    if (m.isEmpty()) {
                        final ListView k2 = this.K;
                        k0.m(k2);
                        k2.setVisibility(8);
                        final CardView m2 = this.M;
                        k0.m(m2);
                        ((FrameLayout)m2).setVisibility(0);
                        TextView textView;
                        String text;
                        if (this.H != null) {
                            textView = this.N;
                            k0.m(textView);
                            final String string = this.getString(2131886323);
                            k0.o(string, "getString(R.string.infocenter_noEventsForX_text)");
                            final StringBuilder sb = new StringBuilder();
                            final Child h2 = this.H;
                            k0.m(h2);
                            sb.append(h2.getFirstName());
                            sb.append(' ');
                            final Child h3 = this.H;
                            k0.m(h3);
                            sb.append(h3.getLastName());
                            text = s.k2(string, "{0}", sb.toString(), false, 4, (Object)null);
                        }
                        else {
                            textView = this.N;
                            k0.m(textView);
                            text = this.getString(2131886328);
                        }
                        textView.setText((CharSequence)text);
                        final TextView n = this.N;
                        k0.m(n);
                        n.setVisibility(0);
                        return;
                    }
                }
                final ListView k3 = this.K;
                k0.m(k3);
                k3.setVisibility(0);
            }
            final CardView m3 = this.M;
            k0.m(m3);
            ((FrameLayout)m3).setVisibility(8);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        final String s = null;
        List<? extends j.a> parcelableArrayList;
        if (arguments == null) {
            parcelableArrayList = null;
        }
        else {
            parcelableArrayList = (List<? extends j.a>)arguments.getParcelableArrayList("thingstodo");
        }
        this.I = parcelableArrayList;
        Child h;
        if (arguments == null) {
            h = null;
        }
        else {
            h = (Child)arguments.getParcelable("child");
        }
        this.H = h;
        String string;
        if (arguments == null) {
            string = s;
        }
        else {
            string = arguments.getString("hercules", "");
        }
        if (string == null) {
            throw new IllegalStateException("no valid profile id");
        }
        final Profile l = j0.G.l(string);
        if (l != null) {
            this.G = l;
            this.O = l.getMasterDataService();
            return;
        }
        throw new IllegalStateException("no valid profile");
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493109, viewGroup, false);
        k0.m(this.J = inflate);
        this.K = (ListView)inflate.findViewById(2131297702);
        final View j = this.J;
        k0.m(j);
        this.M = (CardView)j.findViewById(2131297704);
        final View i = this.J;
        k0.m(i);
        this.N = (TextView)i.findViewById(2131297703);
        if (bundle != null) {
            this.I = (List<? extends j.a>)bundle.getParcelableArrayList("thingstodo");
        }
        this.s(this.I);
        return this.J;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("thingstodo", (ArrayList)this.I);
        bundle.putParcelable("child", (Parcelable)this.H);
        final Profile g = this.G;
        if (g != null) {
            bundle.putString("hercules", g.getUniqueId());
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    public final void t() {
        final ListAdapter l = this.L;
        if (l != null && l instanceof h) {
            Objects.requireNonNull(l, "null cannot be cast to non-null type com.untis.mobile.ui.adapters.InfoCenterThingsToDoListAdapter");
            ((h)l).notifyDataSetChanged();
        }
    }
    
    public final void u() {
        final ListAdapter l = this.L;
        if (l != null && l instanceof h) {
            Objects.requireNonNull(l, "null cannot be cast to non-null type com.untis.mobile.ui.adapters.InfoCenterThingsToDoListAdapter");
            ((h)l).notifyDataSetChanged();
            final ListAdapter i = this.L;
            Objects.requireNonNull(i, "null cannot be cast to non-null type com.untis.mobile.ui.adapters.InfoCenterThingsToDoListAdapter");
            ((h)i).notifyDataSetInvalidated();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012" }, d2 = { "com/untis/mobile/ui/fragments/InfoCenterThingsToDoChildFragment$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "", "Lcom/untis/mobile/ui/adapters/j$a;", "thingsToDo", "Lcom/untis/mobile/ui/fragments/InfoCenterThingsToDoChildFragment;", "a", "", "BUNDLE_CHILD", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "BUNDLE_THINGS", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final InfoCenterThingsToDoChildFragment a(@e final Profile profile, @f final Child child, @f final List<? extends j.a> c) {
            k0.p(profile, "profile");
            final InfoCenterThingsToDoChildFragment infoCenterThingsToDoChildFragment = new InfoCenterThingsToDoChildFragment();
            final Bundle arguments = new Bundle();
            final ArrayList list = new ArrayList();
            if (c != null) {
                list.addAll(c);
            }
            arguments.putParcelableArrayList("thingstodo", list);
            arguments.putString("hercules", profile.getUniqueId());
            arguments.putParcelable("child", (Parcelable)child);
            infoCenterThingsToDoChildFragment.setArguments(arguments);
            return infoCenterThingsToDoChildFragment;
        }
    }
}
