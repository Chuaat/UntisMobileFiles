// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Room;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003J5\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006 " }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/i;", "", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "a", "", "b", "c", "selectedRoom", "rooms", "favorites", "d", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "h", "()Lcom/untis/mobile/persistence/models/masterdata/Room;", "k", "(Lcom/untis/mobile/persistence/models/masterdata/Room;)V", "Ljava/util/List;", "f", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "g", "j", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Room;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i
{
    @f
    private Room a;
    @e
    private List<Room> b;
    @e
    private List<Room> c;
    
    public i() {
        this(null, null, null, 7, null);
    }
    
    public i(@f final Room a, @e final List<Room> b, @e final List<Room> c) {
        k0.p(b, "rooms");
        k0.p(c, "favorites");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @f
    public final Room a() {
        return this.a;
    }
    
    @e
    public final List<Room> b() {
        return this.b;
    }
    
    @e
    public final List<Room> c() {
        return this.c;
    }
    
    @e
    public final i d(@f final Room room, @e final List<Room> list, @e final List<Room> list2) {
        k0.p(list, "rooms");
        k0.p(list2, "favorites");
        return new i(room, list, list2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return k0.g(this.a, i.a) && k0.g(this.b, i.b) && k0.g(this.c, i.c);
    }
    
    @e
    public final List<Room> f() {
        return this.c;
    }
    
    @e
    public final List<Room> g() {
        return this.b;
    }
    
    @f
    public final Room h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final Room a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return (hashCode * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    public final void i(@e final List<Room> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void j(@e final List<Room> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void k(@f final Room a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomSelectionData(selectedRoom=");
        sb.append(this.a);
        sb.append(", rooms=");
        sb.append(this.b);
        sb.append(", favorites=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
