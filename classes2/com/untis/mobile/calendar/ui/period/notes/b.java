// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.notes;

import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/notes/b;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "", "a", "information", "b", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements l
{
    @e
    public static final a b;
    @e
    private final String a;
    
    static {
        b = new a(null);
    }
    
    public b(@e final String a) {
        k0.p(a, "information");
        this.a = a;
    }
    
    @k
    @e
    public static final b fromBundle(@e final Bundle bundle) {
        return com.untis.mobile.calendar.ui.period.notes.b.b.a(bundle);
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    @e
    public final b b(@e final String s) {
        k0.p(s, "information");
        return new b(s);
    }
    
    @e
    public final String d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        bundle.putString("information", this.a);
        return bundle;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof b && k0.g(this.a, ((b)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodLessonInfoFragmentArgs(information=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/notes/b$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/notes/b;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final b a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (!bundle.containsKey("information")) {
                throw new IllegalArgumentException("Required argument \"information\" is missing and does not have an android:defaultValue");
            }
            final String string = bundle.getString("information");
            if (string != null) {
                return new b(string);
            }
            throw new IllegalArgumentException("Argument \"information\" is marked as non-null but was passed a null value.");
        }
    }
}
