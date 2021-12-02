// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday.detail;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Student;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import android.util.LongSparseArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0018\u0010\u000fR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "", "", "a", "Z", "e", "()Z", "i", "(Z)V", "isTeacher", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "Landroid/util/LongSparseArray;", "()Landroid/util/LongSparseArray;", "f", "(Landroid/util/LongSparseArray;)V", "rooms", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "c", "b", "g", "students", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "d", "h", "subjects", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "j", "teachers", "<init>", "(ZLandroid/util/LongSparseArray;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    private boolean a;
    @e
    private LongSparseArray<Teacher> b;
    @e
    private LongSparseArray<Student> c;
    @e
    private LongSparseArray<Subject> d;
    @e
    private LongSparseArray<Room> e;
    
    public c(final boolean a, @e final LongSparseArray<Teacher> b, @e final LongSparseArray<Student> c, @e final LongSparseArray<Subject> d, @e final LongSparseArray<Room> e) {
        k0.p(b, "teachers");
        k0.p(c, "students");
        k0.p(d, "subjects");
        k0.p(e, "rooms");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @e
    public final LongSparseArray<Room> a() {
        return this.e;
    }
    
    @e
    public final LongSparseArray<Student> b() {
        return this.c;
    }
    
    @e
    public final LongSparseArray<Subject> c() {
        return this.d;
    }
    
    @e
    public final LongSparseArray<Teacher> d() {
        return this.b;
    }
    
    public final boolean e() {
        return this.a;
    }
    
    public final void f(@e final LongSparseArray<Room> e) {
        k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void g(@e final LongSparseArray<Student> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void h(@e final LongSparseArray<Subject> d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void i(final boolean a) {
        this.a = a;
    }
    
    public final void j(@e final LongSparseArray<Teacher> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
}
