// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import io.realm.l0;
import m4.a;
import java.util.Iterator;
import org.joda.time.c;
import java.util.List;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/p;", "", "Lm4/a;", "realmHomeWork", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "b", "", "periodId", "Lcom/untis/mobile/api/common/classreg/UMHomeWork;", "umHomeWork", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "a", "homeWork", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class p
{
    @e
    public static final p a;
    
    static {
        a = new p();
    }
    
    private p() {
    }
    
    @e
    public final HomeWork a(final long n, @e final UMHomeWork umHomeWork, @e final EntityType entityType, final long n2) {
        k0.p(umHomeWork, "umHomeWork");
        k0.p(entityType, "entityType");
        final long id = umHomeWork.id;
        final long lessonId = umHomeWork.lessonId;
        final c c = b.c(umHomeWork.startDate);
        k0.o(c, "isoStringToDateTime(umHomeWork.startDate)");
        final c c2 = b.c(umHomeWork.endDate);
        k0.o(c2, "isoStringToDateTime(umHomeWork.endDate)");
        String text = umHomeWork.text;
        if (text == null) {
            text = "";
        }
        String remark = umHomeWork.remark;
        if (remark == null) {
            remark = "";
        }
        final boolean completed = umHomeWork.completed;
        final HomeWorkStatus no_STATEMENT = HomeWorkStatus.NO_STATEMENT;
        final List<UMDriveFileDescriptor> attachments = umHomeWork.attachments;
        k0.o(attachments, "umHomeWork.attachments");
        final h a = h.a;
        final ArrayList list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
        final Iterator<Object> iterator = attachments.iterator();
        while (iterator.hasNext()) {
            list.add(a.a(iterator.next()));
        }
        return new HomeWork(id, lessonId, c, c2, text, remark, completed, entityType, n2, n, false, no_STATEMENT, true, (List<DriveAttachment>)list);
    }
    
    @e
    public final HomeWork b(@e final a a) {
        k0.p(a, "realmHomeWork");
        final long x8 = a.x8();
        final long y8 = a.y8();
        final c c = new c(a.D8());
        final c c2 = new c(a.u8());
        final String g8 = a.G8();
        final String c3 = a.C8();
        final boolean s8 = a.s8();
        final EntityType by = EntityType.Companion.findBy(a.w8());
        final long v8 = a.v8();
        final long b8 = a.B8();
        final boolean z8 = a.z8();
        final HomeWorkStatus fromValue = HomeWorkStatus.Companion.fromValue(a.E8());
        final boolean f8 = a.F8();
        final l0<o4.a> t8 = a.t8();
        final ArrayList list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)t8, 10));
        for (final o4.a a2 : t8) {
            list.add(new DriveAttachment(a2.s8(), a2.t8(), a2.u8()));
        }
        return new HomeWork(x8, y8, c, c2, g8, c3, s8, by, v8, b8, z8, fromValue, f8, (List<DriveAttachment>)list);
    }
    
    @e
    public final a d(@e final HomeWork homeWork) {
        k0.p(homeWork, "homeWork");
        final long id = homeWork.getId();
        final long lessonId = homeWork.getLessonId();
        final long n = ((g)homeWork.getStart()).n();
        final long n2 = ((g)homeWork.getEnd()).n();
        final String text = homeWork.getText();
        final String remark = homeWork.getRemark();
        final boolean completed = homeWork.getCompleted();
        final int webuntisId = homeWork.getEntityType().getWebuntisId();
        final long entityId = homeWork.getEntityId();
        final boolean synced = homeWork.getSynced();
        final int value = homeWork.getStatus().getValue();
        final List<DriveAttachment> driveAttachments = homeWork.getDriveAttachments();
        final ArrayList list = new ArrayList<o4.a>(v.Y((Iterable<?>)driveAttachments, 10));
        final Iterator<Object> iterator = driveAttachments.iterator();
        while (iterator.hasNext()) {
            list.add(h.a.d(iterator.next()));
        }
        final l0<o4.a> h = b.h((List<o4.a>)list);
        k0.o(h, "toRealmList(homeWork.driveAttachments.map { DriveAttachmentMapper.toRealmDriveAttachment(it) })");
        return new a(id, lessonId, n, n2, text, remark, completed, webuntisId, entityId, synced, value, h, homeWork.getLocal(), homeWork.getPeriodId());
    }
}
