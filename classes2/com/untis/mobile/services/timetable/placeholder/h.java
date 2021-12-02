// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import android.graphics.Color;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import android.content.Context;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ,\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0019\u0010\u001c\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/h;", "", "", "subjectId", "", "f", "g", "i", "j", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "useSubjectColor", "isForeignSubstitution", "isCancelledElement", "a", "c", "color", "", "factor", "e", "Lcom/untis/mobile/persistence/models/DefaultColors;", "Lcom/untis/mobile/persistence/models/DefaultColors;", "colors", "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "profileId", "Lcom/untis/mobile/services/masterdata/a;", "b", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h
{
    @e
    private final String a;
    @e
    private final a b;
    @e
    private final DefaultColors c;
    
    public h(@e final Context context, @e final String a) {
        k0.p(context, "context");
        k0.p(a, "profileId");
        this.a = a;
        this.b = com.untis.mobile.services.masterdata.b.Z.a(a);
        final DefaultColors g = com.untis.mobile.utils.a.a(context).g(a);
        k0.o(g, "appSettings(context).getColors(profileId)");
        this.c = g;
    }
    
    public final int a(@e final Period period, final boolean b, final boolean b2, final boolean b3) {
        k0.p(period, "period");
        final int n = 0;
        if (b) {
            final a b4 = this.b;
            final PeriodElement subject = period.getSubject();
            long currentId;
            if (subject == null) {
                currentId = 0L;
            }
            else {
                currentId = subject.getCurrentId();
            }
            final Subject u = b4.U(currentId);
            int customBackColor;
            if (u == null) {
                customBackColor = 0;
            }
            else {
                customBackColor = u.getCustomBackColor();
            }
            int backColor = customBackColor;
            if (customBackColor == 0) {
                if (u == null) {
                    backColor = 0;
                }
                else {
                    backColor = u.getBackColor();
                }
            }
            if (backColor != 0) {
                return backColor;
            }
        }
        final int originalBackColor = period.getOriginalBackColor();
        int n2 = 0;
        Label_0144: {
            if (period.getOriginalInnerBackColor() != -1 && period.getOriginalInnerBackColor() != 0) {
                n2 = n;
                if (period.getOriginalInnerBackColor() != -16777216) {
                    break Label_0144;
                }
            }
            n2 = 1;
        }
        int n3 = originalBackColor;
        if (period.getOriginalInnerTextColor() != period.getOriginalInnerBackColor()) {
            n3 = originalBackColor;
            if (n2 == 0) {
                n3 = period.getOriginalInnerBackColor();
            }
        }
        Label_0324: {
            DefaultColors.DefaultColor defaultColor;
            if (n3 == 0 && period.getStates().contains(PeriodState.EXAM)) {
                defaultColor = this.c.getExam();
            }
            else if (n3 == 0 && period.getStates().contains(PeriodState.IRREGULAR)) {
                defaultColor = this.c.getSubstitution();
            }
            else if (n3 == 0 && period.getStates().contains(PeriodState.BREAK_SUPERVISION)) {
                defaultColor = this.c.getBreakSupervision();
            }
            else if ((n3 == 0 && period.getStates().contains(PeriodState.CANCELLED)) || b3) {
                defaultColor = this.c.getCancelled();
            }
            else {
                if (!b2) {
                    break Label_0324;
                }
                defaultColor = this.c.getWithoutElement();
            }
            n3 = defaultColor.backColor;
        }
        int backColor2;
        if ((backColor2 = n3) == 0) {
            backColor2 = this.c.getLesson().backColor;
        }
        return backColor2;
    }
    
    public final int c(@e final Period period, final boolean b, final boolean b2, final boolean b3) {
        k0.p(period, "period");
        int n;
        if (period.getOriginalInnerTextColor() != period.getOriginalInnerBackColor()) {
            n = period.getOriginalInnerTextColor();
        }
        else {
            n = period.getOriginalTextColor();
        }
        int textColor = n;
        if (b) {
            final a b4 = this.b;
            final PeriodElement subject = period.getSubject();
            long currentId;
            if (subject == null) {
                currentId = 0L;
            }
            else {
                currentId = subject.getCurrentId();
            }
            final Subject u = b4.U(currentId);
            int customTextColor;
            if (u == null) {
                customTextColor = n;
            }
            else {
                customTextColor = u.getCustomTextColor();
            }
            if (customTextColor == n || (textColor = customTextColor) == 0) {
                if (u == null) {
                    textColor = n;
                }
                else {
                    textColor = u.getTextColor();
                }
            }
            if (textColor != n && textColor != 0) {
                return textColor;
            }
        }
        int n2 = 0;
        Label_0306: {
            DefaultColors.DefaultColor defaultColor;
            if (textColor == 0 && period.getStates().contains(PeriodState.EXAM)) {
                defaultColor = this.c.getExam();
            }
            else if (textColor == 0 && period.getStates().contains(PeriodState.IRREGULAR)) {
                defaultColor = this.c.getSubstitution();
            }
            else if (textColor == 0 && period.getStates().contains(PeriodState.BREAK_SUPERVISION)) {
                defaultColor = this.c.getBreakSupervision();
            }
            else if ((textColor == 0 && period.getStates().contains(PeriodState.CANCELLED)) || b3) {
                defaultColor = this.c.getCancelled();
            }
            else {
                if (!b2) {
                    n2 = period.getOriginalTextColor();
                    break Label_0306;
                }
                defaultColor = this.c.getWithoutElement();
            }
            n2 = defaultColor.foreColor;
        }
        int foreColor = n2;
        if (n2 == 0) {
            foreColor = this.c.getLesson().foreColor;
        }
        return foreColor;
    }
    
    public final int e(final int n, final float n2) {
        return Color.argb(Color.alpha(n), (int)(Color.red(n) * n2), (int)(Color.green(n) * n2), (int)(Color.blue(n) * n2));
    }
    
    public final int f(final long n) {
        final Subject u = this.b.U(n);
        int customBackColor;
        if (u == null) {
            customBackColor = 0;
        }
        else {
            customBackColor = u.getCustomBackColor();
        }
        return customBackColor;
    }
    
    public final int g(final long n) {
        final Subject u = this.b.U(n);
        int backColor;
        if (u == null) {
            backColor = 0;
        }
        else {
            backColor = u.getBackColor();
        }
        return backColor;
    }
    
    @e
    public final String h() {
        return this.a;
    }
    
    public final int i(final long n) {
        final Subject u = this.b.U(n);
        int customTextColor;
        if (u == null) {
            customTextColor = 0;
        }
        else {
            customTextColor = u.getCustomTextColor();
        }
        return customTextColor;
    }
    
    public final int j(final long n) {
        final Subject u = this.b.U(n);
        int textColor;
        if (u == null) {
            textColor = 0;
        }
        else {
            textColor = u.getTextColor();
        }
        return textColor;
    }
}
