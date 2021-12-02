// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import com.untis.mobile.utils.mapper.common.b;
import java.util.Iterator;
import io.realm.l0;
import java.util.List;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import kotlin.collections.v;
import org.joda.time.c;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import v4.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/r;", "", "Lv4/a;", "realmLessonTopic", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "a", "lessonTopic", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class r
{
    @e
    public static final r a;
    
    static {
        a = new r();
    }
    
    private r() {
    }
    
    @e
    public final LessonTopic a(@e final a a) {
        k0.p(a, "realmLessonTopic");
        final long u8 = a.u8();
        final String x8 = a.x8();
        final c c = new c(a.v8());
        final c c2 = new c(a.t8());
        final l0<o4.a> s8 = a.s8();
        final h a2 = h.a;
        final ArrayList list = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)s8, 10));
        final Iterator<Object> iterator = s8.iterator();
        while (iterator.hasNext()) {
            list.add(a2.b(iterator.next()));
        }
        return new LessonTopic(u8, x8, c, c2, (List<DriveAttachment>)list, a.w8());
    }
    
    @e
    public final a b(@e final LessonTopic lessonTopic) {
        k0.p(lessonTopic, "lessonTopic");
        final long periodId = lessonTopic.getPeriodId();
        final String text = lessonTopic.getText();
        final long n = ((g)lessonTopic.getStart()).n();
        final long n2 = ((g)lessonTopic.getEnd()).n();
        final List<DriveAttachment> attachments = lessonTopic.getAttachments();
        final h a = h.a;
        final ArrayList list = new ArrayList<o4.a>(v.Y((Iterable<?>)attachments, 10));
        final Iterator<Object> iterator = attachments.iterator();
        while (iterator.hasNext()) {
            list.add(a.d(iterator.next()));
        }
        final l0<o4.a> h = b.h((List<o4.a>)list);
        k0.o(h, "toRealmList(lessonTopic.attachments.map(::toRealmDriveAttachment))");
        return new a(periodId, text, n, n2, h, lessonTopic.getSynced());
    }
}
