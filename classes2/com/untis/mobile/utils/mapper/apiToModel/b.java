// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import java.util.Iterator;
import java.util.List;
import org.joda.time.c;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.classbook.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/b;", "", "", "id", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWorkStatus;", "a", "periodId", "Lcom/untis/mobile/api/common/classreg/UMHomeWork;", "umHomeWork", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "b", "J", "entityId", "Lcom/untis/mobile/services/classbook/a;", "c", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "profileId", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    private final EntityType a;
    private final long b;
    @e
    private final a c;
    
    public b(@e final String s, @e final EntityType a, final long b) {
        k0.p(s, "profileId");
        k0.p(a, "entityType");
        this.a = a;
        this.b = b;
        this.c = com.untis.mobile.services.classbook.k0.a0.a(s);
    }
    
    private final HomeWorkStatus a(final long n) {
        final HomeWork u = this.c.U(n);
        HomeWorkStatus status;
        if (u == null) {
            status = null;
        }
        else {
            status = u.getStatus();
        }
        HomeWorkStatus no_STATEMENT = status;
        if (status == null) {
            no_STATEMENT = HomeWorkStatus.NO_STATEMENT;
        }
        return no_STATEMENT;
    }
    
    @e
    public final HomeWork b(final long n, @e final UMHomeWork umHomeWork) {
        k0.p(umHomeWork, "umHomeWork");
        final long id = umHomeWork.id;
        final long lessonId = umHomeWork.lessonId;
        final c f0 = com.untis.mobile.utils.mapper.common.b.d(umHomeWork.startDate).F0();
        k0.o(f0, "isoStringToLocalDate(umHomeWork.startDate).toDateTimeAtStartOfDay()");
        final c v0 = com.untis.mobile.utils.mapper.common.b.d(umHomeWork.endDate).F0().S0(1).v0(1);
        k0.o(v0, "isoStringToLocalDate(umHomeWork.endDate).toDateTimeAtStartOfDay().plusDays(1).minusMinutes(1)");
        String text = umHomeWork.text;
        if (text == null) {
            text = "";
        }
        String remark = umHomeWork.remark;
        if (remark == null) {
            remark = "";
        }
        final boolean completed = umHomeWork.completed;
        final EntityType a = this.a;
        final long b = this.b;
        final HomeWorkStatus a2 = this.a(umHomeWork.id);
        final List<UMDriveFileDescriptor> attachments = umHomeWork.attachments;
        List<DriveAttachment> list;
        if (attachments == null) {
            list = null;
        }
        else {
            final ArrayList list2 = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
            for (final UMDriveFileDescriptor umDriveFileDescriptor : attachments) {
                final f a3 = f.a;
                k0.o(umDriveFileDescriptor, "attachment");
                list2.add(a3.i(umDriveFileDescriptor));
            }
            list = (List<DriveAttachment>)list2;
        }
        if (list == null) {
            list = new ArrayList<DriveAttachment>();
        }
        return new HomeWork(id, lessonId, f0, v0, text, remark, completed, a, b, n, false, a2, true, list);
    }
}
