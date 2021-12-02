// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api.legacy;

import org.joda.time.base.a;
import com.untis.mobile.api.dto.legacy.JsonAbsence;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.api.dto.legacy.JsonStudentPeriodState;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;

public class b extends com.untis.mobile.utils.mapper.common.b<List<StudentAbsence>, List<JsonStudentPeriodState>>
{
    private final Period a;
    private final Classbook b;
    
    private b(@k0 final Period a, @k0 final Classbook b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    private Map<Long, List<StudentAbsence>> i(@j0 final List<StudentAbsence> list) {
        final HashMap<Long, ArrayList> hashMap = (HashMap<Long, ArrayList>)new HashMap<Object, List<StudentAbsence>>();
        for (final StudentAbsence studentAbsence : list) {
            List<StudentAbsence> list2;
            if ((list2 = hashMap.get(studentAbsence.getStudent().getId())) == null) {
                list2 = new ArrayList<StudentAbsence>();
                hashMap.put(studentAbsence.getStudent().getId(), (ArrayList<StudentAbsence>)list2);
            }
            list2.add(studentAbsence);
        }
        final Classbook b = this.b;
        if (b != null) {
            for (final Long n : b.getStudents()) {
                if (hashMap.get(n) == null) {
                    hashMap.put(n, new ArrayList<StudentAbsence>());
                }
            }
        }
        return (Map<Long, List<StudentAbsence>>)hashMap;
    }
    
    @j0
    private JsonAbsence k(@j0 final StudentAbsence studentAbsence) {
        final JsonAbsence jsonAbsence = new JsonAbsence();
        jsonAbsence.id = studentAbsence.getId();
        jsonAbsence.startDate = ((a)studentAbsence.getStart()).g4("yyyy-MM-dd");
        jsonAbsence.startTime = ((a)studentAbsence.getStart()).g4("'T'HH:mm");
        jsonAbsence.endDate = ((a)studentAbsence.getEnd()).g4("yyyy-MM-dd");
        jsonAbsence.endTime = ((a)studentAbsence.getEnd()).g4("'T'HH:mm");
        long id;
        if (studentAbsence.getAbsenceReason() != null) {
            id = studentAbsence.getAbsenceReason().getId();
        }
        else {
            id = -1L;
        }
        jsonAbsence.reasonId = id;
        jsonAbsence.text = "";
        return jsonAbsence;
    }
    
    @j0
    private List<JsonAbsence> l(@j0 final List<StudentAbsence> list) {
        final ArrayList<JsonAbsence> list2 = new ArrayList<JsonAbsence>();
        final Iterator<StudentAbsence> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(this.k(iterator.next()));
        }
        return list2;
    }
    
    public static b m(@k0 final Period period, @k0 final Classbook classbook) {
        return new b(period, classbook);
    }
    
    @k0
    public List<JsonStudentPeriodState> j(@j0 final List<StudentAbsence> list) {
        final ArrayList<JsonStudentPeriodState> list2 = new ArrayList<JsonStudentPeriodState>();
        for (final Map.Entry<Long, List<StudentAbsence>> entry : this.i(list).entrySet()) {
            final long longValue = entry.getKey();
            final List<StudentAbsence> list3 = entry.getValue();
            final JsonStudentPeriodState jsonStudentPeriodState = new JsonStudentPeriodState();
            jsonStudentPeriodState.studentId = longValue;
            jsonStudentPeriodState.studentPeriodStateCollection = this.l(list3);
            list2.add(jsonStudentPeriodState);
        }
        return list2;
    }
}
