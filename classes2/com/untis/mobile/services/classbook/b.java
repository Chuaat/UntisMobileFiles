// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.classbook;

import java.util.Objects;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u001c\u0010\u000e¨\u0006 " }, d2 = { "Lcom/untis/mobile/services/classbook/b;", "", "other", "", "equals", "", "hashCode", "", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "students", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "c", "f", "events", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "a", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "()Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "g", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;)V", "klasse", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "e", "absences", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    private Klasse a;
    @e
    private List<Student> b;
    @e
    private List<Event> c;
    @e
    private List<StudentAbsence> d;
    
    public b() {
        this(null, null, null, null, 15, null);
    }
    
    public b(@e final Klasse a, @e final List<Student> b, @e final List<Event> c, @e final List<StudentAbsence> d) {
        k0.p(a, "klasse");
        k0.p(b, "students");
        k0.p(c, "events");
        k0.p(d, "absences");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @e
    public final List<StudentAbsence> a() {
        return this.d;
    }
    
    @e
    public final List<Event> b() {
        return this.c;
    }
    
    @e
    public final Klasse c() {
        return this.a;
    }
    
    @e
    public final List<Student> d() {
        return this.b;
    }
    
    public final void e(@e final List<StudentAbsence> d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(b.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.services.classbook.TeacherClassRegData");
        return k0.g(this.a, ((b)obj).a);
    }
    
    public final void f(@e final List<Event> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void g(@e final Klasse a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void h(@e final List<Student> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
