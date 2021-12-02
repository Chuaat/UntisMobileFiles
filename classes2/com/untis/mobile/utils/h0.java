// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.joda.time.r;
import org.joda.time.c;
import java.util.ArrayList;
import java.util.List;
import io.realm.p0;
import io.realm.l0;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlotState;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.EntityType;

public class h0
{
    @j0
    public static EntityType a(@k0 EntityType none) {
        if (none == null) {
            none = EntityType.NONE;
        }
        return none;
    }
    
    @j0
    public static HomeWorkStatus b(@k0 HomeWorkStatus no_STATEMENT) {
        if (no_STATEMENT == null) {
            no_STATEMENT = HomeWorkStatus.NO_STATEMENT;
        }
        return no_STATEMENT;
    }
    
    @j0
    public static Student c(@k0 Student student) {
        if (student == null) {
            student = new Student(0L, "???", "", new t(0L), 0L);
        }
        return student;
    }
    
    @j0
    public static OfficeHourTimeSlotState d(@k0 OfficeHourTimeSlotState other) {
        if (other == null) {
            other = OfficeHourTimeSlotState.OTHER;
        }
        return other;
    }
    
    @j0
    public static <T extends p0> l0<T> e(@k0 l0<T> l0) {
        if (l0 == null) {
            l0 = new l0<T>();
        }
        return l0;
    }
    
    @j0
    public static String f(@k0 String s) {
        if (s == null) {
            s = "";
        }
        return s;
    }
    
    @j0
    public static <T> List<T> g(@k0 List<T> list) {
        if (list == null) {
            list = new ArrayList<T>();
        }
        return list;
    }
    
    @j0
    public static c h(@k0 c c) {
        if (c == null) {
            c = new c(Long.MIN_VALUE);
        }
        return c;
    }
    
    @j0
    public static r i(@k0 r r) {
        if (r == null) {
            r = new r(Long.MIN_VALUE, Long.MAX_VALUE);
        }
        return r;
    }
    
    @j0
    public static t j(@k0 t t) {
        if (t == null) {
            t = new t(Long.MIN_VALUE);
        }
        return t;
    }
}
