// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import io.realm.l0;
import s4.a;
import java.util.Iterator;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.t;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.utils.mapper.realmToModel.h;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.infocenter.InfoCenterHomework;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.persistence.models.DisplayableEntity;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/e;", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "displayableEntity", "Lcom/untis/mobile/api/common/classreg/UMHomeWork;", "umHomeWork", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterHomework;", "a", "Ls4/a;", "realmInfoCenterHomework", "b", "homework", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    public static final e a;
    
    static {
        a = new e();
    }
    
    private e() {
    }
    
    @f
    public final InfoCenterHomework a(@org.jetbrains.annotations.e final DisplayableEntity displayableEntity, @f final UMHomeWork umHomeWork) {
        k0.p(displayableEntity, "displayableEntity");
        final List<DriveAttachment> list = null;
        if (umHomeWork == null) {
            return null;
        }
        final long id = umHomeWork.id;
        final long lessonId = umHomeWork.lessonId;
        final t d = b.d(umHomeWork.startDate);
        k0.o(d, "isoStringToLocalDate(umHomeWork.startDate)");
        final t d2 = b.d(umHomeWork.endDate);
        k0.o(d2, "isoStringToLocalDate(umHomeWork.endDate)");
        final String text = umHomeWork.text;
        String s = "";
        String s2;
        if ((s2 = text) == null) {
            s2 = "";
        }
        final String remark = umHomeWork.remark;
        if (remark != null) {
            s = remark;
        }
        final boolean completed = umHomeWork.completed;
        final EntityType entityType = displayableEntity.entityType();
        final long entityId = displayableEntity.entityId();
        final List<UMDriveFileDescriptor> attachments = umHomeWork.attachments;
        List<DriveAttachment> e;
        if (attachments == null) {
            e = list;
        }
        else {
            final ArrayList<DriveAttachment> list2 = new ArrayList<DriveAttachment>();
            final Iterator<Object> iterator = attachments.iterator();
            while (true) {
                e = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final UMDriveFileDescriptor umDriveFileDescriptor = iterator.next();
                final h a = h.a;
                k0.o(umDriveFileDescriptor, "it");
                final DriveAttachment a2 = a.a(umDriveFileDescriptor);
                if (a2 == null) {
                    continue;
                }
                list2.add(a2);
            }
        }
        if (e == null) {
            e = v.E();
        }
        return new InfoCenterHomework(0L, id, lessonId, d, d2, s2, s, completed, entityType, entityId, e);
    }
    
    @org.jetbrains.annotations.e
    public final InfoCenterHomework b(@org.jetbrains.annotations.e final a a) {
        k0.p(a, "realmInfoCenterHomework");
        final long y8 = a.y8();
        final long x8 = a.x8();
        final long z8 = a.z8();
        final t c0 = t.c0(a.B8());
        k0.o(c0, "parse(realmInfoCenterHomework.start)");
        final t c2 = t.c0(a.u8());
        k0.o(c2, "parse(realmInfoCenterHomework.end)");
        final String c3 = a.C8();
        final String a2 = a.A8();
        final boolean s8 = a.s8();
        final EntityType by = EntityType.Companion.findBy(a.w8());
        final long v8 = a.v8();
        final l0<o4.a> t8 = a.t8();
        final ArrayList list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)t8, 10));
        for (final o4.a a3 : t8) {
            final h a4 = h.a;
            k0.o(a3, "it");
            list.add(a4.b(a3));
        }
        return new InfoCenterHomework(y8, x8, z8, c0, c2, c3, a2, s8, by, v8, (List<DriveAttachment>)list);
    }
    
    @org.jetbrains.annotations.e
    public final a c(@org.jetbrains.annotations.e final InfoCenterHomework infoCenterHomework) {
        k0.p(infoCenterHomework, "homework");
        final long key = infoCenterHomework.getKey();
        final long id = infoCenterHomework.getId();
        final long lessonId = infoCenterHomework.getLessonId();
        final String string = infoCenterHomework.getStart().toString();
        k0.o(string, "homework.start.toString()");
        final String string2 = infoCenterHomework.getEnd().toString();
        k0.o(string2, "homework.end.toString()");
        final String text = infoCenterHomework.getText();
        final String remark = infoCenterHomework.getRemark();
        final boolean completed = infoCenterHomework.getCompleted();
        final int webuntisId = infoCenterHomework.getEntityType().getWebuntisId();
        final long entityId = infoCenterHomework.getEntityId();
        final List<DriveAttachment> attachments = infoCenterHomework.getAttachments();
        final ArrayList list = new ArrayList<o4.a>(v.Y((Iterable<?>)attachments, 10));
        final Iterator<Object> iterator = attachments.iterator();
        while (iterator.hasNext()) {
            list.add(h.a.d(iterator.next()));
        }
        final l0<o4.a> h = b.h((List<o4.a>)list);
        k0.o(h, "toRealmList(homework.attachments.map { toRealmDriveAttachment(it) })");
        return new a(key, id, lessonId, string, string2, text, remark, completed, webuntisId, entityId, h);
    }
}
