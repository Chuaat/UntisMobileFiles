// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import androidx.lifecycle.l0;
import java.util.List;
import kotlin.j2;
import n6.l;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Room;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/FreeRoomSelectionPageFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/ui/activities/timetableselection/room/a;", "data", "Lkotlin/j2;", "y", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "room", "w", "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class FreeRoomSelectionPageFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public FreeRoomSelectionPageFragment() {
        this.G = d0.c((n6.a<?>)new n6.a<z>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final z invoke() {
                return (z)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(z.class), null, this.I, null);
            }
        });
    }
    
    private final z u() {
        return this.G.getValue();
    }
    
    private static final void v(final FreeRoomSelectionPageFragment freeRoomSelectionPageFragment, final View view, final com.untis.mobile.ui.activities.timetableselection.room.a a) {
        k0.p(freeRoomSelectionPageFragment, "this$0");
        k0.p(view, "$view");
        k0.o(a, "it");
        freeRoomSelectionPageFragment.y(view, a);
    }
    
    private final void w(final Room room) {
        this.u().r(room);
    }
    
    private final void x(final Room room) {
        this.u().o(room);
    }
    
    private final void y(final View view, final com.untis.mobile.ui.activities.timetableselection.room.a a) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(2131297693)).getAdapter();
        h h;
        if (adapter instanceof h) {
            h = (h)adapter;
        }
        else {
            h = null;
        }
        if (h == null) {
            return;
        }
        h.p(a.f(), a.e());
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493105, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((RecyclerView)inflate.findViewById(2131297693)).setAdapter((RecyclerView$h)new h(null, null, new l<Room, j2>() {
            public final void a(@e final Room room) {
                k0.p(room, "it");
                FreeRoomSelectionPageFragment.this.x(room);
            }
        }, new l<Room, j2>() {
            public final void a(@e final Room room) {
                k0.p(room, "it");
                FreeRoomSelectionPageFragment.this.w(room);
            }
        }, 3, null));
        this.u().i().j(this.getViewLifecycleOwner(), (l0)new b(this, inflate));
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "com/untis/mobile/ui/activities/timetableselection/room/FreeRoomSelectionPageFragment$a", "", "Lcom/untis/mobile/ui/activities/timetableselection/room/FreeRoomSelectionPageFragment;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final FreeRoomSelectionPageFragment a() {
            return new FreeRoomSelectionPageFragment();
        }
    }
}
