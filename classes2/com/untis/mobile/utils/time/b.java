// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.time;

import org.joda.time.base.d;
import org.joda.time.v;
import org.joda.time.t;
import org.joda.time.r;
import org.joda.time.c;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.Iterator;
import com.untis.mobile.persistence.models.parentday.ParentDayStudent;
import java.util.List;
import androidx.annotation.j0;
import com.untis.mobile.services.masterdata.a;

public class b
{
    @j0
    public static String a(@j0 final a a, @j0 final List<ParentDayStudent> list) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<ParentDayStudent> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Student v = a.V(iterator.next().getStudentId());
            if (v == null) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(v.getDisplayName());
        }
        return sb.toString();
    }
    
    @j0
    public static String b(@j0 final List<Subject> list) {
        final StringBuilder sb = new StringBuilder();
        for (final Subject subject : list) {
            if (subject == null) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(subject.getDisplayName());
        }
        return sb.toString();
    }
    
    @j0
    public static String c(@j0 final c c, @j0 final c c2) {
        if (((org.joda.time.base.a)c).k2() != ((org.joda.time.base.a)c2).k2()) {
            return String.format("%s - %s", ((org.joda.time.base.a)c).g4("H:mm, dd.MM.yyyy"), ((org.joda.time.base.a)c2).g4("H:mm, dd.MM.yyyy"));
        }
        if (((org.joda.time.base.a)c).f3() != ((org.joda.time.base.a)c2).f3()) {
            return String.format("%s - %s", ((org.joda.time.base.a)c).g4("H:mm, dd.MM."), ((org.joda.time.base.a)c2).g4("H:mm, dd.MM.yyyy"));
        }
        if (((org.joda.time.base.a)c).X3() == ((org.joda.time.base.a)c2).X3()) {
            return String.format("%s - %s", ((org.joda.time.base.a)c).g4("H:mm"), ((org.joda.time.base.a)c2).g4("H:mm, dd.MM.yyyy"));
        }
        return String.format("%s - %s", ((org.joda.time.base.a)c).g4("H:mm, dd."), ((org.joda.time.base.a)c2).g4("H:mm, dd.MM.yyyy"));
    }
    
    @j0
    public static String d(@j0 final r r) {
        return c(((d)r).b(), ((d)r).s());
    }
    
    @j0
    public static String e(@j0 final t t, @j0 final t t2) {
        if (t.k2() != t2.k2()) {
            return String.format("%s - %s", t.g4("dd.MM.yyyy"), t2.g4("dd.MM.yyyy"));
        }
        if (t.f3() != t2.f3()) {
            return String.format("%s - %s", t.g4("dd.MM."), t2.g4("dd.MM.yyyy"));
        }
        if (t.X3() == t2.X3()) {
            return t.g4("dd.MM.yyyy");
        }
        return String.format("%s - %s", t.g4("dd."), t2.g4("dd.MM.yyyy"));
    }
    
    @j0
    public static String f(@j0 final v v, @j0 final v v2) {
        return String.format("%s - %s", v.g4("H:mm"), v2.g4("H:mm"));
    }
}
