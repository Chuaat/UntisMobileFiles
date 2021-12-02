// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.w;
import com.untis.mobile.api.common.UMPerson;
import org.joda.time.c;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.utils.mapper.common.b;
import kotlin.jvm.internal.k0;
import w4.g;
import com.untis.mobile.api.common.masterdata.UMStudent;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/f0;", "", "Lw4/g;", "realmStudent", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "e", "Lcom/untis/mobile/api/common/masterdata/UMStudent;", "umStudent", "a", "student", "b", "d", "Lcom/untis/mobile/api/common/UMPerson;", "umPerson", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f0
{
    @e
    public static final f0 a;
    
    static {
        a = new f0();
    }
    
    private f0() {
    }
    
    @e
    public final g a(@e final UMStudent umStudent) {
        k0.p(umStudent, "umStudent");
        final long id = umStudent.id;
        String firstName = umStudent.firstName;
        if (firstName == null) {
            firstName = "";
        }
        String lastName = umStudent.lastName;
        if (lastName == null) {
            lastName = "";
        }
        return new g(id, firstName, lastName, ((org.joda.time.base.g)b.d(umStudent.birthDate).F0()).n(), umStudent.klasseId);
    }
    
    @e
    public final g b(@e final Student student) {
        k0.p(student, "student");
        final long id = student.getId();
        final String firstName = student.getFirstName();
        final String lastName = student.getLastName();
        final t birthday = student.getBirthday();
        long longValue = 0L;
        long n = 0L;
        Label_0065: {
            if (birthday != null) {
                final c f0 = birthday.F0();
                if (f0 != null) {
                    n = ((org.joda.time.base.g)f0).n();
                    break Label_0065;
                }
            }
            n = 0L;
        }
        final Long klasse = student.getKlasse();
        if (klasse != null) {
            longValue = klasse;
        }
        return new g(id, firstName, lastName, n, longValue);
    }
    
    @e
    public final Student c(@e final UMPerson umPerson) {
        k0.p(umPerson, "umPerson");
        final long id = umPerson.id;
        String firstName = umPerson.firstName;
        if (firstName == null) {
            firstName = "";
        }
        String lastName;
        if ((lastName = umPerson.lastName) == null) {
            lastName = "";
        }
        return new Student(id, firstName, lastName, null, null, 24, null);
    }
    
    @e
    public final Student d(@e final UMStudent umStudent) {
        k0.p(umStudent, "umStudent");
        final long id = umStudent.id;
        String firstName = umStudent.firstName;
        if (firstName == null) {
            firstName = "";
        }
        String lastName = umStudent.lastName;
        if (lastName == null) {
            lastName = "";
        }
        return new Student(id, firstName, lastName, b.d(umStudent.birthDate), umStudent.klasseId);
    }
    
    @e
    public final Student e(@e final g g) {
        k0.p(g, "realmStudent");
        return new Student(g.u8(), g.t8(), g.w8(), new t(g.s8()), g.v8());
    }
}
