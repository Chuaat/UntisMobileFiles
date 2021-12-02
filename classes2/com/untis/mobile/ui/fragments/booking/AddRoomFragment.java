// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.booking;

import android.app.Dialog;
import android.app.Activity;
import android.os.Parcelable;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import n6.l;
import android.view.LayoutInflater;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import com.untis.mobile.c;
import android.widget.TextView;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import kotlin.text.s;
import android.view.ViewGroup;
import com.untis.mobile.persistence.models.masterdata.Room;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.utils.u0;
import android.util.Log;
import com.untis.mobile.persistence.models.booking.ValidationError;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.List;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.booking.RoomChangeSuccessData;
import android.content.DialogInterface;
import androidx.fragment.app.d;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.booking.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-" }, d2 = { "Lcom/untis/mobile/ui/fragments/booking/AddRoomFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "room", "Lkotlin/j2;", "x", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "G", "Ljava/lang/String;", "profileId", "", "J", "I", "colorAccent", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "Lcom/untis/mobile/services/timetable/placeholder/k;", "K", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/booking/a;", "L", "Lcom/untis/mobile/services/booking/a;", "bookingService", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AddRoomFragment extends UmFragment
{
    @e
    public static final a M;
    @e
    private static final String N = "oneTwo";
    @e
    private static final String O = "threeFifty";
    @e
    private static final String P = "twoThree";
    private String G;
    private Period H;
    private RoomChangeData I;
    private int J;
    private k K;
    private com.untis.mobile.services.booking.a L;
    
    static {
        M = new a(null);
    }
    
    private static final void A(final d d, final DialogInterface dialogInterface, final AddRoomFragment addRoomFragment, final RoomChangeSuccessData roomChangeSuccessData) {
        k0.p(d, "$activity");
        k0.p(addRoomFragment, "this$0");
        final List<ValidationError> validationErrors = roomChangeSuccessData.getValidationErrors();
        k0.o(validationErrors, "response.validationErrors");
        if (validationErrors.isEmpty() ^ true) {
            ValidationErrorDialog.P(roomChangeSuccessData.getValidationErrors()).L(d.getSupportFragmentManager(), "somethingcreative");
        }
        else {
            ((Activity)d).setResult(-1);
            ((Activity)d).finish();
            h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ AddRoomFragment H;
                final /* synthetic */ RoomChangeSuccessData I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ AddRoomFragment H = this.H;
                        final /* synthetic */ RoomChangeSuccessData I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((AddRoomFragment$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final k w = AddRoomFragment.w(this.H);
                        if (w == null) {
                            k0.S("timeTableService");
                            throw null;
                        }
                        final List<Period> periods = this.I.getPeriods();
                        k0.o(periods, "response.periods");
                        this.G = 1;
                        if (w.b(periods, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
        dialogInterface.dismiss();
    }
    
    private static final void B(final AddRoomFragment addRoomFragment, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(addRoomFragment, "this$0");
        Log.e("untis_log", "error on roomchange submit", t);
        u0.d(addRoomFragment.getView(), t);
        dialogInterface.dismiss();
    }
    
    private static final void C(final AddRoomFragment addRoomFragment, final com.untis.mobile.ui.fragments.booking.h h, final AdapterView adapterView, final View view, final int n, final long n2) {
        k0.p(addRoomFragment, "this$0");
        k0.p(h, "$changeRoomAdapter");
        addRoomFragment.x(h.b(n));
    }
    
    public static final /* synthetic */ k w(final AddRoomFragment addRoomFragment) {
        return addRoomFragment.K;
    }
    
    @SuppressLint({ "InflateParams" })
    private final void x(final Room room) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final View inflate = this.getLayoutInflater().inflate(2131493045, (ViewGroup)null, false);
        final String string = this.getString(2131886165);
        k0.o(string, "getString(R.string.bookRoom_alert_addRoomDetail_text)");
        final int r3 = s.r3((CharSequence)string, "{0}", 0, false, 6, (Object)null);
        final String displayableTitle = room.getDisplayableTitle();
        final SpannableString text = new SpannableString((CharSequence)s.k2(string, "{0}", displayableTitle, false, 4, (Object)null));
        text.setSpan((Object)new ForegroundColorSpan(this.J), r3, displayableTitle.length() + r3, 256);
        ((TextView)inflate.findViewById(c.i.Il)).setText((CharSequence)text);
        ((Dialog)new d$a((Context)activity, 2131951624).M(inflate).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.fragments.booking.b.G).B(2131886647, (DialogInterface$OnClickListener)new com.untis.mobile.ui.fragments.booking.a(this, room, activity)).a()).show();
    }
    
    private static final void y(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void z(final AddRoomFragment addRoomFragment, final Room room, final d d, final DialogInterface dialogInterface, final int n) {
        k0.p(addRoomFragment, "this$0");
        k0.p(room, "$room");
        k0.p(d, "$activity");
        final com.untis.mobile.services.booking.a l = addRoomFragment.L;
        if (l == null) {
            k0.S("bookingService");
            throw null;
        }
        final Period h = addRoomFragment.H;
        if (h != null) {
            com.untis.mobile.services.booking.a.a.a(l, h.getId(), room, null, 4, null).C5((rx.functions.b)new com.untis.mobile.ui.fragments.booking.d(d, dialogInterface, addRoomFragment), (rx.functions.b)new com.untis.mobile.ui.fragments.booking.e(addRoomFragment, dialogInterface));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f Bundle arguments) {
        super.onCreate(arguments);
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        this.J = androidx.core.content.d.f((Context)o, 2131099677);
        Bundle arguments2;
        if (arguments == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = arguments;
        }
        final String s = "";
        String string;
        if (arguments2 == null) {
            string = s;
        }
        else {
            string = arguments2.getString("oneTwo");
            if (string == null) {
                string = s;
            }
        }
        this.G = string;
        this.K = com.untis.mobile.services.timetable.placeholder.p.Y.a(string);
        final String g = this.G;
        if (g == null) {
            k0.S("profileId");
            throw null;
        }
        this.L = new com.untis.mobile.services.booking.e(g);
        Bundle arguments3;
        if (arguments == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = arguments;
        }
        k0.m(arguments3);
        final long long1 = arguments3.getLong("threeFifty");
        final k k = this.K;
        if (k != null) {
            Period l;
            if ((l = k.l(long1)) == null) {
                l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
            }
            this.H = l;
            if (arguments == null) {
                arguments = this.getArguments();
            }
            k0.m(arguments);
            RoomChangeData i;
            if ((i = (RoomChangeData)arguments.getParcelable("twoThree")) == null) {
                i = new RoomChangeData();
            }
            this.I = i;
            return;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493069, viewGroup, false);
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return null;
        }
        final RoomChangeData i = this.I;
        if (i != null) {
            final List<Room> availableRooms = i.getAvailableRooms();
            k0.o(availableRooms, "roomChangeData.availableRooms");
            final com.untis.mobile.ui.fragments.booking.h adapter = new com.untis.mobile.ui.fragments.booking.h((Context)o, availableRooms, true, null, 8, null);
            final int om = c.i.Om;
            ((ListView)inflate.findViewById(om)).setAdapter((ListAdapter)adapter);
            ((ListView)inflate.findViewById(om)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.fragments.booking.c(this, adapter));
            return inflate;
        }
        k0.S("roomChangeData");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final String g = this.G;
        if (g == null) {
            k0.S("profileId");
            throw null;
        }
        bundle.putString("oneTwo", g);
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        bundle.putLong("threeFifty", h.getId());
        final RoomChangeData i = this.I;
        if (i != null) {
            bundle.putParcelable("twoThree", (Parcelable)i);
            return;
        }
        k0.S("roomChangeData");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/fragments/booking/AddRoomFragment$a", "", "", "profileId", "", "periodId", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "roomChangeData", "Lcom/untis/mobile/ui/fragments/booking/AddRoomFragment;", "a", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "BUNDLE_ROOM_CHANGE_DATA", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final AddRoomFragment a(@e final String s, final long n, @e final RoomChangeData roomChangeData) {
            k0.p(s, "profileId");
            k0.p(roomChangeData, "roomChangeData");
            final AddRoomFragment addRoomFragment = new AddRoomFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("oneTwo", s);
            arguments.putLong("threeFifty", n);
            arguments.putParcelable("twoThree", (Parcelable)roomChangeData);
            addRoomFragment.setArguments(arguments);
            return addRoomFragment;
        }
    }
}
