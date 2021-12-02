// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.detail;

import com.untis.mobile.substitutionplanning.model.SubjectRefDto;
import org.joda.time.l0;
import org.joda.time.r;
import org.joda.time.c;
import com.untis.mobile.utils.d0;
import android.text.SpannableString;
import com.untis.mobile.substitutionplanning.model.RestDtoExtensionKt;
import android.text.Spannable;
import android.content.Context;
import org.jetbrains.annotations.f;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import retrofit2.t;
import rx.g;
import kotlin.jvm.internal.k0;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDto;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.api.k;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bJ\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/detail/l;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "dto", "Lkotlin/j2;", "i", "Lrx/g;", "Lretrofit2/t;", "Ljava/lang/Void;", "b", "a", "Landroid/content/Context;", "context", "Landroid/text/Spannable;", "c", "", "g", "f", "h", "d", "e", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "Lcom/untis/mobile/substitutionplanning/api/k;", "Lcom/untis/mobile/substitutionplanning/api/k;", "service", "<init>", "(Lcom/untis/mobile/substitutionplanning/api/k;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l extends w0
{
    @e
    private final k a;
    private Profile b;
    private SubstitutionRequestDto c;
    
    public l(@e final k a) {
        k0.p(a, "service");
        this.a = a;
    }
    
    @f
    public final g<t<Void>> a() {
        final SubstitutionRequestDto c = this.c;
        if (c == null) {
            k0.S("dto");
            throw null;
        }
        final PeriodConflictDto periodConflict = c.getPeriodConflict();
        Long id;
        if (periodConflict == null) {
            id = null;
        }
        else {
            id = periodConflict.getId();
        }
        Long n = id;
        if (id == null) {
            final SubstitutionRequestDto c2 = this.c;
            if (c2 == null) {
                k0.S("dto");
                throw null;
            }
            final PeriodDto period = c2.getPeriod();
            Long value;
            if (period == null) {
                value = null;
            }
            else {
                value = period.getWuId();
            }
            n = value;
            if (value == null) {
                return null;
            }
        }
        final long longValue = n;
        final k a = this.a;
        final Profile b = this.b;
        if (b != null) {
            return (g<t<Void>>)k.k(a, b, longValue, false, 4, null);
        }
        k0.S("profile");
        throw null;
    }
    
    @f
    public final g<t<Void>> b() {
        final SubstitutionRequestDto c = this.c;
        if (c == null) {
            k0.S("dto");
            throw null;
        }
        final PeriodConflictDto periodConflict = c.getPeriodConflict();
        Long id;
        if (periodConflict == null) {
            id = null;
        }
        else {
            id = periodConflict.getId();
        }
        Long n = id;
        if (id == null) {
            final SubstitutionRequestDto c2 = this.c;
            if (c2 == null) {
                k0.S("dto");
                throw null;
            }
            final PeriodDto period = c2.getPeriod();
            Long value;
            if (period == null) {
                value = null;
            }
            else {
                value = period.getWuId();
            }
            n = value;
            if (value == null) {
                return null;
            }
        }
        final long longValue = n;
        final k a = this.a;
        final Profile b = this.b;
        if (b != null) {
            return (g<t<Void>>)k.o(a, b, longValue, false, 4, null);
        }
        k0.S("profile");
        throw null;
    }
    
    @e
    public final Spannable c(@e final Context context) {
        k0.p(context, "context");
        final SubstitutionRequestDto c = this.c;
        final Spannable spannable = null;
        if (c != null) {
            final PeriodConflictDto periodConflict = c.getPeriodConflict();
            Spannable displayableClasses;
            if (periodConflict == null) {
                displayableClasses = null;
            }
            else {
                displayableClasses = RestDtoExtensionKt.getDisplayableClasses(periodConflict, context);
            }
            Object o = displayableClasses;
            if (displayableClasses == null) {
                final SubstitutionRequestDto c2 = this.c;
                if (c2 == null) {
                    k0.S("dto");
                    throw null;
                }
                final PeriodDto period = c2.getPeriod();
                Spannable displayableClasses2;
                if (period == null) {
                    displayableClasses2 = spannable;
                }
                else {
                    displayableClasses2 = RestDtoExtensionKt.getDisplayableClasses(period, context);
                }
                if (displayableClasses2 == null) {
                    o = new SpannableString((CharSequence)"");
                }
                else {
                    o = displayableClasses2;
                }
            }
            return (Spannable)o;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String d() {
        final SubstitutionRequestDto c = this.c;
        final String s = null;
        if (c != null) {
            final PeriodConflictDto periodConflict = c.getPeriodConflict();
            String startDateTime;
            if (periodConflict == null) {
                startDateTime = null;
            }
            else {
                startDateTime = periodConflict.getStartDateTime();
            }
            String s2 = startDateTime;
            if (startDateTime == null) {
                final SubstitutionRequestDto c2 = this.c;
                if (c2 == null) {
                    k0.S("dto");
                    throw null;
                }
                final PeriodDto period = c2.getPeriod();
                String l;
                if (period == null) {
                    l = s;
                }
                else {
                    final String startDateTime2 = period.getStartDateTime();
                    if (startDateTime2 == null) {
                        l = s;
                    }
                    else {
                        final c j = d0.j(startDateTime2);
                        if (j == null) {
                            l = s;
                        }
                        else {
                            l = d0.l(j);
                        }
                    }
                }
                if (l == null) {
                    return "";
                }
                s2 = l;
            }
            return s2;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String e() {
        final SubstitutionRequestDto c = this.c;
        final l0 l0 = null;
        if (c == null) {
            k0.S("dto");
            throw null;
        }
        final PeriodConflictDto periodConflict = c.getPeriodConflict();
        String startDateTime;
        if (periodConflict == null) {
            startDateTime = null;
        }
        else {
            startDateTime = periodConflict.getStartDateTime();
        }
        String startDateTime2 = startDateTime;
        if (startDateTime == null) {
            final SubstitutionRequestDto c2 = this.c;
            if (c2 == null) {
                k0.S("dto");
                throw null;
            }
            final PeriodDto period = c2.getPeriod();
            if (period == null) {
                startDateTime2 = null;
            }
            else {
                startDateTime2 = period.getStartDateTime();
            }
        }
        Object j;
        if (startDateTime2 == null) {
            j = null;
        }
        else {
            j = d0.j(startDateTime2);
        }
        if (j == null) {
            return "";
        }
        final SubstitutionRequestDto c3 = this.c;
        if (c3 == null) {
            k0.S("dto");
            throw null;
        }
        final PeriodConflictDto periodConflict2 = c3.getPeriodConflict();
        String endDateTime;
        if (periodConflict2 == null) {
            endDateTime = null;
        }
        else {
            endDateTime = periodConflict2.getEndDateTime();
        }
        String endDateTime2 = endDateTime;
        if (endDateTime == null) {
            final SubstitutionRequestDto c4 = this.c;
            if (c4 == null) {
                k0.S("dto");
                throw null;
            }
            final PeriodDto period2 = c4.getPeriod();
            if (period2 == null) {
                endDateTime2 = null;
            }
            else {
                endDateTime2 = period2.getEndDateTime();
            }
        }
        Object i;
        if (endDateTime2 == null) {
            i = l0;
        }
        else {
            i = d0.j(endDateTime2);
        }
        if (i == null) {
            return "";
        }
        return d0.s(new r((l0)j, (l0)i));
    }
    
    @e
    public final Spannable f() {
        final SubstitutionRequestDto c = this.c;
        final Spannable spannable = null;
        if (c != null) {
            final PeriodConflictDto periodConflict = c.getPeriodConflict();
            Spannable displayableRooms;
            if (periodConflict == null) {
                displayableRooms = null;
            }
            else {
                displayableRooms = RestDtoExtensionKt.getDisplayableRooms(periodConflict);
            }
            Object o = displayableRooms;
            if (displayableRooms == null) {
                final SubstitutionRequestDto c2 = this.c;
                if (c2 == null) {
                    k0.S("dto");
                    throw null;
                }
                final PeriodDto period = c2.getPeriod();
                Spannable displayableRooms2;
                if (period == null) {
                    displayableRooms2 = spannable;
                }
                else {
                    displayableRooms2 = RestDtoExtensionKt.getDisplayableRooms(period);
                }
                if (displayableRooms2 == null) {
                    o = new SpannableString((CharSequence)"");
                }
                else {
                    o = displayableRooms2;
                }
            }
            return (Spannable)o;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String g() {
        final SubstitutionRequestDto c = this.c;
        if (c != null) {
            final PeriodConflictDto periodConflict = c.getPeriodConflict();
            String displayName = null;
            Label_0040: {
                if (periodConflict != null) {
                    final SubjectRefDto subject = periodConflict.getSubject();
                    if (subject != null) {
                        displayName = subject.getDisplayName();
                        break Label_0040;
                    }
                }
                displayName = null;
            }
            String displayName2 = displayName;
            if (displayName == null) {
                final SubstitutionRequestDto c2 = this.c;
                if (c2 == null) {
                    k0.S("dto");
                    throw null;
                }
                final PeriodDto period = c2.getPeriod();
                if (period != null) {
                    final SubjectRefDto subject2 = period.getSubject();
                    if (subject2 != null) {
                        if ((displayName2 = subject2.getDisplayName()) != null) {
                            return displayName2;
                        }
                    }
                }
                displayName2 = "";
            }
            return displayName2;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final Spannable h() {
        final SubstitutionRequestDto c = this.c;
        final Spannable spannable = null;
        if (c != null) {
            final PeriodConflictDto periodConflict = c.getPeriodConflict();
            Spannable displayableTeacher$default;
            if (periodConflict == null) {
                displayableTeacher$default = null;
            }
            else {
                displayableTeacher$default = RestDtoExtensionKt.getDisplayableTeacher$default(periodConflict, false, 1, null);
            }
            Object o = displayableTeacher$default;
            if (displayableTeacher$default == null) {
                final SubstitutionRequestDto c2 = this.c;
                if (c2 == null) {
                    k0.S("dto");
                    throw null;
                }
                final PeriodDto period = c2.getPeriod();
                Spannable displayableTeacher;
                if (period == null) {
                    displayableTeacher = spannable;
                }
                else {
                    displayableTeacher = RestDtoExtensionKt.getDisplayableTeacher(period);
                }
                if (displayableTeacher == null) {
                    o = new SpannableString((CharSequence)"");
                }
                else {
                    o = displayableTeacher;
                }
            }
            return (Spannable)o;
        }
        k0.S("dto");
        throw null;
    }
    
    public final void i(@e final Profile b, @e final SubstitutionRequestDto c) {
        k0.p(b, "profile");
        k0.p(c, "dto");
        this.b = b;
        this.c = c;
    }
}
