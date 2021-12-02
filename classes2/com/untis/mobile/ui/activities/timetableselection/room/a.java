// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J)\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/a;", "", "", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "a", "b", "freeRooms", "favorites", "c", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "f", "h", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    private List<Room> a;
    @e
    private List<Room> b;
    
    public a() {
        this(null, null, 3, null);
    }
    
    public a(@e final List<Room> a, @e final List<Room> b) {
        k0.p(a, "freeRooms");
        k0.p(b, "favorites");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final List<Room> a() {
        return this.a;
    }
    
    @e
    public final List<Room> b() {
        return this.b;
    }
    
    @e
    public final a c(@e final List<Room> list, @e final List<Room> list2) {
        k0.p(list, "freeRooms");
        k0.p(list2, "favorites");
        return new a(list, list2);
    }
    
    @e
    public final List<Room> e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return k0.g(this.a, a.a) && k0.g(this.b, a.b);
    }
    
    @e
    public final List<Room> f() {
        return this.a;
    }
    
    public final void g(@e final List<Room> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void h(@e final List<Room> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FreeRoomSelectionData(freeRooms=");
        sb.append(this.a);
        sb.append(", favorites=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
