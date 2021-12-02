// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option;

import com.untis.mobile.persistence.models.profile.Right;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.f;
import kotlin.h0;
import kotlin.jvm.internal.k0;
import android.graphics.drawable.Drawable;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\r" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/a;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/utils/a;", "settings", "", "c", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @f
    public static final Drawable a(@e final com.untis.mobile.dashboard.ui.option.a a, @e final Context context) {
        k0.p(a, "<this>");
        k0.p(context, "context");
        int n = 0;
        switch (d.a.a[a.ordinal()]) {
            default: {
                throw new h0();
            }
            case 8: {
                n = 2131231137;
                break;
            }
            case 7: {
                n = 2131231092;
                break;
            }
            case 6: {
                n = 2131231167;
                break;
            }
            case 5: {
                n = 2131231098;
                break;
            }
            case 4: {
                n = 2131231069;
                break;
            }
            case 3: {
                n = 2131231126;
                break;
            }
            case 1:
            case 2: {
                return androidx.core.content.d.i(context, 2131231158);
            }
        }
        return androidx.core.content.d.i(context, n);
    }
    
    @e
    public static final String b(@e final com.untis.mobile.dashboard.ui.option.a a, @e final Context context) {
        k0.p(a, "<this>");
        k0.p(context, "context");
        String s = null;
        String s2 = null;
        switch (d.a.a[a.ordinal()]) {
            default: {
                throw new h0();
            }
            case 8: {
                s = context.getString(2131886487);
                s2 = "context.getString(R.string.parentDay_title)";
                break;
            }
            case 7: {
                s = context.getString(2131886205);
                s2 = "context.getString(R.string.classLead_title)";
                break;
            }
            case 6: {
                s = context.getString(2131886478);
                s2 = "context.getString(R.string.myEvents_title)";
                break;
            }
            case 5: {
                s = context.getString(2131886254);
                s2 = "context.getString(R.string.contactHours_title)";
                break;
            }
            case 4: {
                s = context.getString(2131886843);
                s2 = "context.getString(R.string.teacherAbsence_addAbsence_title)";
                break;
            }
            case 3: {
                s = context.getString(2131886852);
                s2 = "context.getString(R.string.teacherAbsences_title)";
                break;
            }
            case 2: {
                s = context.getString(2131886160);
                s2 = "context.getString(R.string.askTeacher_substitionRequests_title)";
                break;
            }
            case 1: {
                s = context.getString(2131886837);
                s2 = "context.getString(R.string.substitutionPlanning_title)";
                break;
            }
        }
        k0.o(s, s2);
        return s;
    }
    
    public static final boolean c(@e final com.untis.mobile.dashboard.ui.option.a a, @e final Profile profile, @e final com.untis.mobile.utils.a a2) {
        k0.p(a, "<this>");
        k0.p(profile, "profile");
        k0.p(a2, "settings");
        final boolean i = a2.I(profile);
        final int n = d.a.a[a.ordinal()];
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        boolean b5 = b3;
        switch (n) {
            default: {
                throw new h0();
            }
            case 8: {
                if (profile.hasAnyRole(EntityType.TEACHER)) {
                    return profile.hasAnyRight(Right.READ_PARENTSDAY);
                }
                boolean b6 = b4;
                if (profile.hasAnyRight(Right.READ_PARENTSDAY)) {
                    b6 = b4;
                    if (i) {
                        b6 = true;
                    }
                }
                return b6;
            }
            case 7: {
                b5 = b3;
                if (!profile.hasAnyRole(EntityType.TEACHER)) {
                    return b5;
                }
                b5 = b3;
                if (!profile.hasAnyRight(Right.CLASSREGISTER)) {
                    return b5;
                }
                b5 = b3;
                if (!(profile.getUserClasses().isEmpty() ^ true)) {
                    return b5;
                }
                b5 = b3;
                if (i) {
                    b5 = true;
                    return b5;
                }
                return b5;
            }
            case 6: {
                return a2.J(profile) || i;
            }
            case 4: {
                if (profile.hasAnyRole(EntityType.TEACHER) && profile.hasAnyRight(Right.TEACHER_ABSENCE_CREATE)) {
                    return true;
                }
                if (!profile.getEntityType().isParentRole()) {
                    final boolean b7 = b;
                    if (!profile.getEntityType().isStudentRole()) {
                        return b7;
                    }
                }
                boolean b7 = b;
                if (profile.hasAnyRight(Right.WRITE_OWN_ABSENCE, Right.WRITE_OWN_ABSENCE_REASON)) {
                    b7 = true;
                }
                return b7;
            }
            case 3: {
                if (profile.hasAnyRole(EntityType.TEACHER) && profile.hasAnyRight(Right.TEACHER_ABSENCE_READ)) {
                    return true;
                }
                if (!profile.getEntityType().isParentRole()) {
                    final boolean b8 = b2;
                    if (!profile.getEntityType().isStudentRole()) {
                        return b8;
                    }
                }
                boolean b8 = b2;
                if (profile.hasAnyRight(Right.READ_MY_ABSENCES)) {
                    b8 = true;
                }
                return b8;
            }
            case 1: {
                return b5;
            }
            case 5: {
                b5 = profile.hasAnyRight(Right.READ_OFFICE_HOUR);
                return b5;
            }
            case 2: {
                b5 = profile.hasAnyRight(Right.SUBSTITUTION_ASK_TEACHER_READ);
                return b5;
            }
        }
    }
}
