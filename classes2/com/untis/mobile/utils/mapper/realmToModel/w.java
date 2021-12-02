// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.jetbrains.annotations.f;
import com.untis.mobile.utils.mapper.common.b;
import io.realm.l0;
import n4.a;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.api.common.timetable.UMPeriodText;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/w;", "", "", "periodId", "Lcom/untis/mobile/api/common/timetable/UMPeriodText;", "umPeriodText", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "a", "Ln4/a;", "realmPeriodInfo", "b", "periodInfo", "c", "Lkotlin/j2;", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w
{
    @e
    public static final w a;
    
    static {
        a = new w();
    }
    
    private w() {
    }
    
    @e
    public final PeriodInfo a(final long n, @e final UMPeriodText umPeriodText) {
        k0.p(umPeriodText, "umPeriodText");
        String info = umPeriodText.info;
        if (info == null) {
            info = "";
        }
        String substitution = umPeriodText.substitution;
        if (substitution == null) {
            substitution = "";
        }
        String lesson = umPeriodText.lesson;
        if (lesson == null) {
            lesson = "";
        }
        final List<UMDriveFileDescriptor> attachments = umPeriodText.attachments;
        ArrayList list;
        if (attachments == null) {
            list = null;
        }
        else {
            final h a = h.a;
            list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
            final Iterator<Object> iterator = attachments.iterator();
            while (iterator.hasNext()) {
                list.add(a.a(iterator.next()));
            }
        }
        ArrayList<DriveAttachment> list2;
        if ((list2 = (ArrayList<DriveAttachment>)list) == null) {
            list2 = new ArrayList<DriveAttachment>();
        }
        return new PeriodInfo(n, info, substitution, lesson, null, true, list2, 16, null);
    }
    
    @e
    public final PeriodInfo b(@e final a a) {
        k0.p(a, "realmPeriodInfo");
        final long t8 = a.t8();
        final String u8 = a.u8();
        final String x8 = a.x8();
        final String v8 = a.v8();
        final String w8 = a.w8();
        final boolean y8 = a.y8();
        final l0<o4.a> s8 = a.s8();
        final h a2 = h.a;
        final ArrayList list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)s8, 10));
        final Iterator<Object> iterator = s8.iterator();
        while (iterator.hasNext()) {
            list.add(a2.b(iterator.next()));
        }
        return new PeriodInfo(t8, u8, x8, v8, w8, y8, (List<DriveAttachment>)list);
    }
    
    @e
    public final a c(@e final PeriodInfo periodInfo) {
        k0.p(periodInfo, "periodInfo");
        final long id = periodInfo.getId();
        final String info = periodInfo.getInfo();
        final String substitution = periodInfo.getSubstitution();
        final String lesson = periodInfo.getLesson();
        final String local = periodInfo.getLocal();
        final boolean sync = periodInfo.getSync();
        final List<DriveAttachment> driveAttachments = periodInfo.getDriveAttachments();
        final h a = h.a;
        final ArrayList list = new ArrayList<o4.a>(v.Y((Iterable<?>)driveAttachments, 10));
        final Iterator<Object> iterator = driveAttachments.iterator();
        while (iterator.hasNext()) {
            list.add(a.d(iterator.next()));
        }
        final l0<o4.a> h = b.h((List<o4.a>)list);
        k0.o(h, "toRealmList(periodInfo.driveAttachments.map(DriveAttachmentMapper::toRealmDriveAttachment))");
        return new a(id, info, substitution, lesson, local, sync, h);
    }
    
    public final void d(@e final PeriodInfo periodInfo, @f final UMPeriodText umPeriodText) {
        k0.p(periodInfo, "periodInfo");
        if (umPeriodText == null) {
            return;
        }
        final String info = umPeriodText.info;
        final String s = "";
        String info2;
        if ((info2 = info) == null) {
            info2 = "";
        }
        periodInfo.setInfo(info2);
        String lesson;
        if ((lesson = umPeriodText.lesson) == null) {
            lesson = "";
        }
        periodInfo.setLesson(lesson);
        String substitution = umPeriodText.substitution;
        if (substitution == null) {
            substitution = s;
        }
        periodInfo.setSubstitution(substitution);
        final List<UMDriveFileDescriptor> attachments = umPeriodText.attachments;
        ArrayList<DriveAttachment> list;
        if (attachments == null) {
            list = null;
        }
        else {
            list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
            for (final UMDriveFileDescriptor umDriveFileDescriptor : attachments) {
                final h a = h.a;
                k0.o(umDriveFileDescriptor, "it");
                list.add(a.a(umDriveFileDescriptor));
            }
        }
        ArrayList<DriveAttachment> driveAttachments;
        if ((driveAttachments = list) == null) {
            driveAttachments = new ArrayList<DriveAttachment>();
        }
        periodInfo.setDriveAttachments(driveAttachments);
        periodInfo.setSync(true);
    }
}
