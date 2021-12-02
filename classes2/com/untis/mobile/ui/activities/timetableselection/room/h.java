// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.List;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0012\u0012!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\"\u0010\u0011\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR4\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R4\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006'" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/activities/timetableselection/room/w;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "m", "holder", "position", "Lkotlin/j2;", "l", "getItemCount", "", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "rooms", "favoriteRooms", "p", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "room", "onRoom", "Ln6/l;", "j", "()Ln6/l;", "onFavoriteRoom", "i", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "n", "(Ljava/util/List;)V", "a", "k", "o", "<init>", "(Ljava/util/List;Ljava/util/List;Ln6/l;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends RecyclerView$h<w>
{
    @e
    private List<Room> a;
    @e
    private List<Room> b;
    @e
    private final l<Room, j2> c;
    @e
    private final l<Room, j2> d;
    
    public h(@e final List<Room> a, @e final List<Room> b, @e final l<? super Room, j2> c, @e final l<? super Room, j2> d) {
        k0.p(a, "rooms");
        k0.p(b, "favoriteRooms");
        k0.p(c, "onRoom");
        k0.p(d, "onFavoriteRoom");
        this.a = a;
        this.b = b;
        this.c = (l<Room, j2>)c;
        this.d = (l<Room, j2>)d;
    }
    
    public int getItemCount() {
        return this.a.size();
    }
    
    @e
    public final List<Room> h() {
        return this.b;
    }
    
    @e
    public final l<Room, j2> i() {
        return this.d;
    }
    
    @e
    public final l<Room, j2> j() {
        return this.c;
    }
    
    @e
    public final List<Room> k() {
        return this.a;
    }
    
    public void l(@e final w w, int n) {
        k0.p(w, "holder");
        final Room room = this.a.get(n);
        final List<Room> b = this.b;
        final boolean b2 = b instanceof Collection;
        boolean b3 = true;
        Label_0108: {
            if (!b2 || !b.isEmpty()) {
                final Iterator<Object> iterator = b.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getId() == room.getId()) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        break Label_0108;
                    }
                }
            }
            b3 = false;
        }
        w.c(room, b3, this.c, this.d);
    }
    
    @e
    public w m(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493243, viewGroup, false);
        k0.o(inflate, "from(parent.context).inflate(R.layout.item_room_selection, parent, false)");
        return new w(inflate);
    }
    
    public final void n(@e final List<Room> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void o(@e final List<Room> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void p(@e final List<Room> a, @e final List<Room> b) {
        k0.p(a, "rooms");
        k0.p(b, "favoriteRooms");
        this.a = a;
        this.b = b;
        this.notifyDataSetChanged();
    }
}
