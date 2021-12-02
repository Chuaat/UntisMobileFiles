// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.masterdata.UMRoom;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/c0;", "", "Lw4/e;", "realmRoom", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "d", "Lcom/untis/mobile/api/common/masterdata/UMRoom;", "umRoom", "a", "c", "room", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c0
{
    @e
    public static final c0 a;
    
    static {
        a = new c0();
    }
    
    private c0() {
    }
    
    @e
    public final w4.e a(@e final UMRoom umRoom) {
        k0.p(umRoom, "umRoom");
        final long id = umRoom.id;
        String name = umRoom.name;
        if (name == null) {
            name = "";
        }
        String longName = umRoom.longName;
        if (longName == null) {
            longName = "";
        }
        return new w4.e(id, name, longName, b.a(umRoom.foreColor), b.a(umRoom.backColor), umRoom.active, umRoom.displayAllowed);
    }
    
    @e
    public final w4.e b(@e final Room room) {
        k0.p(room, "room");
        return new w4.e(room.getId(), room.getName(), room.getLongName(), room.getTextColor(), room.getBackColor(), room.getActive(), room.getDisplayable());
    }
    
    @e
    public final Room c(@e final UMRoom umRoom) {
        k0.p(umRoom, "umRoom");
        final long id = umRoom.id;
        String name = umRoom.name;
        if (name == null) {
            name = "";
        }
        String longName = umRoom.longName;
        if (longName == null) {
            longName = "";
        }
        return new Room(id, name, longName, b.a(umRoom.foreColor), b.a(umRoom.backColor), umRoom.active, umRoom.displayAllowed);
    }
    
    @e
    public final Room d(@e final w4.e e) {
        k0.p(e, "realmRoom");
        return new Room(e.v8(), e.x8(), e.w8(), e.y8(), e.t8(), e.s8(), e.u8());
    }
}
