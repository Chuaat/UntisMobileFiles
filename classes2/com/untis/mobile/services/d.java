// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import android.util.Log;
import org.koin.core.c$a;
import android.content.Intent;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import com.untis.mobile.calendar.ui.CalendarActivity;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlin.text.s;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.utils.c0;
import android.text.TextUtils;
import com.untis.mobile.services.timetable.placeholder.h;
import android.graphics.BitmapFactory;
import java.util.Comparator;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.masterdata.Subject;
import org.joda.time.l0;
import org.joda.time.r;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import android.widget.RemoteViews;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.Iterator;
import android.text.style.ForegroundColorSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.SpannableStringBuilder;
import android.text.SpannableString;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import java.util.List;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.utils.settings.g;
import kotlin.jvm.internal.k0;
import android.graphics.Bitmap;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.masterdata.a;
import kotlin.b0;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;
import android.widget.RemoteViewsService$RemoteViewsFactory;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010q\u001a\u00020\u0011¢\u0006\u0004\b}\u0010~J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J*\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0002J6\u0010,\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0&2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002J\u0010\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002J\u0010\u00108\u001a\u00020\r2\u0006\u00105\u001a\u000204H\u0002J\u0018\u0010<\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0011H\u0002J\b\u0010=\u001a\u00020\rH\u0016J\b\u0010>\u001a\u00020\rH\u0016J\b\u0010?\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020\u0011H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010\u00052\u0006\u0010A\u001a\u00020\u0011H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010D\u001a\u00020\u0011H\u0016J\u0010\u0010E\u001a\u0002012\u0006\u0010A\u001a\u00020\u0011H\u0016J\b\u0010F\u001a\u00020\u0017H\u0016R\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u001d\u0010`\u001a\u00020[8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010LR\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00070c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010LR\u0016\u0010o\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010dR\u0018\u0010s\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010LR\u001d\u0010x\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010]\u001a\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{¨\u0006\u007f" }, d2 = { "Lcom/untis/mobile/services/d;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "holiday", "Landroid/widget/RemoteViews;", "e", "Lcom/untis/mobile/services/b;", "previousRow", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "g", "rv", "Lkotlin/j2;", "x", "t", "u", "", "backColor", "s", "r", "remoteViews", "v", "", "j", "o", "n", "p", "q", "parallel", "w", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "subject", "showSubjectColors", "showFullSubjectNames", "cancelled", "Landroid/text/SpannableString;", "i", "", "entities", "withElementColor", "isCancelled", "showLongNames", "subjectTextColor", "c", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "", "y", "", "periodId", "f", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/widget/ScheduleWidgetContext;", "m", "k", "Landroid/graphics/Bitmap;", "source", "color", "b", "onCreate", "onDataSetChanged", "onDestroy", "getCount", "position", "getViewAt", "getLoadingView", "getViewTypeCount", "getItemId", "hasStableIds", "Lcom/untis/mobile/services/classbook/a;", "N", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "S", "Landroid/graphics/Bitmap;", "mCancelledBmp", "Lcom/untis/mobile/services/masterdata/a;", "M", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "G", "Landroid/content/Context;", "R", "Lcom/untis/mobile/persistence/models/widget/ScheduleWidgetContext;", "widgetContext", "Lcom/untis/mobile/services/timetable/placeholder/k;", "O", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/utils/settings/g;", "K", "Lkotlin/b0;", "h", "()Lcom/untis/mobile/utils/settings/g;", "settings", "T", "mExamBmp", "Ljava/util/ArrayList;", "I", "Ljava/util/ArrayList;", "rows", "Lcom/untis/mobile/persistence/models/profile/Profile;", "J", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "U", "mIrregularBmp", "Q", "Ljava/lang/String;", "packageName", "H", "widgetId", "V", "mWithoutBmp", "Lcom/untis/mobile/utils/a;", "L", "d", "()Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/persistence/models/DefaultColors;", "P", "Lcom/untis/mobile/persistence/models/DefaultColors;", "defaultColors", "<init>", "(Landroid/content/Context;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements RemoteViewsService$RemoteViewsFactory, c
{
    @e
    private final Context G;
    private final int H;
    @e
    private final ArrayList<b> I;
    private Profile J;
    @e
    private final b0 K;
    @e
    private final b0 L;
    private com.untis.mobile.services.masterdata.a M;
    private com.untis.mobile.services.classbook.a N;
    private k O;
    private DefaultColors P;
    @e
    private final String Q;
    @f
    private ScheduleWidgetContext R;
    @f
    private Bitmap S;
    @f
    private Bitmap T;
    @f
    private Bitmap U;
    @f
    private Bitmap V;
    
    public d(@e final Context g, final int h) {
        k0.p(g, "context");
        this.G = g;
        this.H = h;
        this.I = new ArrayList<b>();
        this.K = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        this.L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        final String packageName = g.getPackageName();
        k0.o(packageName, "context.packageName");
        this.Q = packageName;
    }
    
    private final Bitmap b(final Bitmap bitmap, final int n) {
        final Paint paint = new Paint();
        paint.setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_ATOP));
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        k0.o(bitmap2, "bitmapResult");
        return bitmap2;
    }
    
    private final SpannableString c(final List<PeriodElement> list, final boolean b, final boolean b2, final boolean b3, final int n) {
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(this.G);
        final Profile j = this.J;
        if (j != null) {
            final DefaultColors f = a.f(j);
            k0.o(f, "appSettings(context).getColors(profile)");
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            final Iterator<PeriodElement> iterator = list.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                final PeriodElement periodElement = iterator.next();
                final com.untis.mobile.services.masterdata.a m = this.M;
                if (m == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final DisplayableEntity v = m.v(periodElement.getEntityType(), periodElement.getCurrentId());
                final com.untis.mobile.services.masterdata.a i = this.M;
                if (i == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final DisplayableEntity v2 = i.v(periodElement.getEntityType(), periodElement.getOriginalId());
                boolean b4 = true;
                final boolean b5 = b2 || (v == null && v2 != null);
                final boolean b6 = v != null && v2 != null && v.entityId() != v2.entityId();
                if (v == null || v2 != null) {
                    b4 = false;
                }
                int n3 = n2;
                if (n2 > 0) {
                    spannableStringBuilder.append((CharSequence)", ");
                    n3 = n2 + 2;
                }
                String string = "";
                String str;
                if (v != null) {
                    if (b3) {
                        str = v.getDisplayableDescription();
                    }
                    else {
                        str = v.getDisplayableTitle();
                    }
                }
                else {
                    str = "";
                }
                String str2;
                if (v2 != null) {
                    if (b3) {
                        str2 = v2.getDisplayableDescription();
                    }
                    else {
                        str2 = v2.getDisplayableTitle();
                    }
                }
                else {
                    str2 = "";
                }
                Label_0412: {
                    if (b5) {
                        if (v == null) {
                            if (v2 != null) {
                                string = str2;
                            }
                            break Label_0412;
                        }
                    }
                    else {
                        if (b6) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" (");
                            sb.append(str2);
                            sb.append(')');
                            string = sb.toString();
                            break Label_0412;
                        }
                        if (!b4) {
                            if (v == null) {
                                break Label_0412;
                            }
                        }
                    }
                    string = str;
                }
                spannableStringBuilder.append((CharSequence)string);
                Label_0672: {
                    Object o;
                    if (b5) {
                        o = new StrikethroughSpan();
                    }
                    else if (b6) {
                        spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(f.getElementChanged().backColor), n3, string.length() + n3, 256);
                        o = new ForegroundColorSpan(f.getElementChanged().foreColor);
                    }
                    else if (b4) {
                        spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(f.getSubstitution().backColor), n3, string.length() + n3, 256);
                        o = new ForegroundColorSpan(f.getSubstitution().foreColor);
                    }
                    else if (b) {
                        if (v == null) {
                            break Label_0672;
                        }
                        spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(v.getDisplayableBackColor()), n3, string.length() + n3, 256);
                        if (v.getDisplayableTextColor() != 0) {
                            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(v.getDisplayableTextColor()), n3, string.length() + n3, 256);
                        }
                        break Label_0672;
                    }
                    else {
                        if (n == 0) {
                            break Label_0672;
                        }
                        o = new ForegroundColorSpan(n);
                    }
                    spannableStringBuilder.setSpan(o, n3, string.length() + n3, 256);
                }
                n2 = n3 + string.length();
            }
            final SpannableString value = SpannableString.valueOf((CharSequence)spannableStringBuilder);
            k0.o(value, "valueOf(ssb)");
            return value;
        }
        k0.S("profile");
        throw null;
    }
    
    private final com.untis.mobile.utils.a d() {
        return this.L.getValue();
    }
    
    private final RemoteViews e(final Holiday holiday) {
        final RemoteViews remoteViews = new RemoteViews(this.Q, 2131493244);
        remoteViews.setTextViewText(2131298260, (CharSequence)com.untis.mobile.utils.time.b.e(holiday.getStart(), holiday.getEnd()));
        remoteViews.setTextViewText(2131298261, (CharSequence)holiday.getDisplayName());
        final DefaultColors p = this.P;
        if (p != null) {
            remoteViews.setInt(2131298261, "setBackgroundColor", p.getHoliday().backColor);
            return remoteViews;
        }
        k0.S("defaultColors");
        throw null;
    }
    
    private final PeriodInfo f(final long n) {
        final com.untis.mobile.services.classbook.a n2 = this.N;
        if (n2 != null) {
            PeriodInfo d;
            if ((d = n2.d(n)) == null) {
                d = new PeriodInfo(n, "", "", "", "", true, new ArrayList<DriveAttachment>());
            }
            return d;
        }
        k0.S("classbookService");
        throw null;
    }
    
    private final RemoteViews g(final b b, final Period period) {
        final Period period2 = null;
        Period c;
        if (b == null) {
            c = null;
        }
        else {
            c = b.c();
        }
        final boolean b2 = false;
        final boolean b3 = c == null || ((org.joda.time.base.e)((org.joda.time.base.d)b.b()).s().h1()).o((n0)period.getStart().h1());
        Period c2;
        if (b == null) {
            c2 = period2;
        }
        else {
            c2 = b.c();
        }
        boolean b4 = b2;
        if (c2 != null) {
            b4 = b2;
            if (((org.joda.time.base.d)b.b()).U((org.joda.time.m0)new r((l0)period.getStart(), (l0)period.getEnd()))) {
                b4 = true;
            }
        }
        int n;
        if (b3) {
            n = 2131493375;
        }
        else {
            n = 2131493374;
        }
        final RemoteViews remoteViews = new RemoteViews(this.Q, n);
        this.t(remoteViews, period);
        this.v(remoteViews, period);
        final int p2 = this.p(remoteViews, period);
        if (b3) {
            this.q(remoteViews, period);
        }
        this.w(remoteViews, period, b4);
        this.r(remoteViews, period, p2);
        this.s(remoteViews, period, p2);
        this.u(remoteViews, period);
        this.x(remoteViews, period);
        return remoteViews;
    }
    
    private final g h() {
        return this.K.getValue();
    }
    
    private final SpannableString i(final PeriodElement periodElement, final boolean b, final boolean b2, final boolean b3) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final com.untis.mobile.services.masterdata.a m = this.M;
        if (m == null) {
            k0.S("masterDataService");
            throw null;
        }
        k0.m(periodElement);
        final Subject u = m.U(periodElement.getCurrentId());
        final com.untis.mobile.services.masterdata.a i = this.M;
        if (i != null) {
            final Subject u2 = i.U(periodElement.getOriginalId());
            String str = "";
            String s;
            if (u != null) {
                if (b2) {
                    s = u.getDisplayName();
                }
                else {
                    s = u.getName();
                }
            }
            else {
                s = "";
            }
            if (u2 != null) {
                if (b2) {
                    str = u2.getDisplayName();
                }
                else {
                    str = u2.getName();
                }
            }
            spannableStringBuilder.append((CharSequence)s);
            final int n = 0;
            if (b && u != null) {
                int n2;
                if ((n2 = u.getCustomBackColor()) == 0) {
                    n2 = u.getBackColor();
                }
                if (n2 != 0) {
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(n2), 0, s.length(), 256);
                }
                int n3;
                if ((n3 = u.getCustomTextColor()) == 0) {
                    n3 = u.getTextColor();
                }
                if (n3 != 0) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n3), 0, s.length(), 256);
                }
            }
            if (b3 || s.length() == 0) {
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), 0, s.length(), 256);
            }
            if (!k0.g(s, str)) {
                int n4 = n;
                if (str.length() > 0) {
                    n4 = 1;
                }
                if (n4 != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append('(');
                    sb.append(str);
                    sb.append(')');
                    spannableStringBuilder.append((CharSequence)sb.toString());
                }
            }
            final SpannableString value = SpannableString.valueOf((CharSequence)spannableStringBuilder);
            k0.o(value, "valueOf(ssb)");
            return value;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final boolean j(final Period period) {
        if (period.getStates().contains(PeriodState.IRREGULAR)) {
            return true;
        }
        for (final PeriodElement periodElement : period.getKlassen()) {
            if (periodElement.getCurrentId() != 0L) {
                if (periodElement.getOriginalId() != 0L) {
                    if (periodElement.getCurrentId() == periodElement.getOriginalId()) {
                        continue;
                    }
                }
            }
            return true;
        }
        for (final PeriodElement periodElement2 : period.getTeachers()) {
            if (periodElement2.getCurrentId() != 0L) {
                if (periodElement2.getOriginalId() != 0L) {
                    if (periodElement2.getCurrentId() == periodElement2.getOriginalId()) {
                        continue;
                    }
                }
            }
            return true;
        }
        for (final PeriodElement periodElement3 : period.getRooms()) {
            if (periodElement3.getCurrentId() != 0L) {
                if (periodElement3.getOriginalId() != 0L) {
                    if (periodElement3.getCurrentId() == periodElement3.getOriginalId()) {
                        continue;
                    }
                }
            }
            return true;
        }
        if (period.getSubject() != null) {
            final PeriodElement subject = period.getSubject();
            k0.m(subject);
            if (subject.getCurrentId() != 0L) {
                final PeriodElement subject2 = period.getSubject();
                k0.m(subject2);
                if (subject2.getOriginalId() != 0L) {
                    final PeriodElement subject3 = period.getSubject();
                    k0.m(subject3);
                    final long currentId = subject3.getCurrentId();
                    final PeriodElement subject4 = period.getSubject();
                    k0.m(subject4);
                    if (currentId == subject4.getOriginalId()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private final void k(final Context context) {
        final ScheduleWidgetContext m = this.m(context);
        this.R = m;
        final j0 g = j0.G;
        k0.m(m);
        final String profileId = m.profileId;
        k0.o(profileId, "widgetContext!!.profileId");
        Profile l;
        if ((l = g.l(profileId)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.J = l;
        this.M = l.getMasterDataService();
        final Profile j = this.J;
        if (j == null) {
            k0.S("profile");
            throw null;
        }
        this.N = j.getClassBookService();
        final Profile i = this.J;
        if (i == null) {
            k0.S("profile");
            throw null;
        }
        this.O = i.getTimeTableService();
        final com.untis.mobile.utils.a d = this.d();
        final Profile k = this.J;
        if (k == null) {
            k0.S("profile");
            throw null;
        }
        final DefaultColors f = d.f(k);
        k0.o(f, "appSettings.getColors(profile)");
        this.P = f;
        final org.joda.time.c a2 = com.untis.mobile.utils.time.a.a().a2();
        final r r = new r((l0)a2, (l0)a2.Y0(1).Y1(23, 59, 59, 999));
        final com.untis.mobile.services.masterdata.a m2 = this.M;
        if (m2 == null) {
            k0.S("masterDataService");
            throw null;
        }
        final List<Object> l2 = v.L5((Collection<?>)m2.E());
        final Iterator<Holiday> iterator = l2.iterator();
        while (iterator.hasNext()) {
            final Holiday holiday = iterator.next();
            if (!((org.joda.time.base.d)r).F((org.joda.time.m0)new r((l0)holiday.getStart().F0(), (l0)holiday.getEnd().x0(new org.joda.time.v(23, 59))))) {
                iterator.remove();
            }
        }
        final ScheduleWidgetContext r2 = this.R;
        k0.m(r2);
        final List<Long> periodIds = r2.periodIds;
        k0.o(periodIds, "widgetContext!!.periodIds");
        final ArrayList<Period> list = new ArrayList<Period>();
        for (final Long n : periodIds) {
            final k o = this.O;
            if (o == null) {
                k0.S("timetableService");
                throw null;
            }
            k0.o(n, "it");
            final Period l3 = o.l(n);
            if (l3 == null) {
                continue;
            }
            list.add(l3);
        }
        final List<Object> l4 = v.L5((Collection<?>)list);
        if (!this.d().j1()) {
            final Iterator<Period> iterator3 = l4.iterator();
            while (iterator3.hasNext()) {
                if (iterator3.next().getStates().contains(PeriodState.CANCELLED)) {
                    iterator3.remove();
                }
            }
        }
        this.I.clear();
        final org.joda.time.c a3 = com.untis.mobile.utils.time.a.a();
        final ArrayList<Period> list2 = new ArrayList<Period>();
        for (final Period next : l4) {
            if (((org.joda.time.base.c)next.getEnd()).R((l0)a3)) {
                list2.add(next);
            }
        }
        final ArrayList<b> i2 = this.I;
        final Iterator<Object> iterator5 = list2.iterator();
        while (iterator5.hasNext()) {
            i2.add(new b(iterator5.next()));
        }
        final ArrayList<b> i3 = this.I;
        final Iterator<Holiday> iterator6 = (Iterator<Holiday>)l2.iterator();
        while (iterator6.hasNext()) {
            i3.add(new b(iterator6.next()));
        }
        v.p0(this.I, com.untis.mobile.services.c.G);
        final int n2 = 2131231191;
        final com.untis.mobile.utils.a d2 = this.d();
        final Profile j2 = this.J;
        if (j2 == null) {
            k0.S("profile");
            throw null;
        }
        int n3 = n2;
        if (d2.i1(j2)) {
            final com.untis.mobile.utils.a d3 = this.d();
            final Profile j3 = this.J;
            if (j3 == null) {
                k0.S("profile");
                throw null;
            }
            n3 = n2;
            if (!d3.I1(j3)) {
                n3 = 2131231192;
            }
        }
        final Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), n3);
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), 2131231194);
        final com.untis.mobile.utils.a d4 = this.d();
        final Profile j4 = this.J;
        if (j4 != null) {
            final DefaultColors f2 = d4.f(j4);
            k0.o(f2, "appSettings.getColors(profile)");
            k0.o(decodeResource, "sourceCancelled");
            this.S = this.b(decodeResource, androidx.core.content.d.f(context, 2131099691));
            k0.o(decodeResource2, "sourceIrregular");
            this.T = this.b(decodeResource2, f2.getExam().backColor);
            this.V = this.b(decodeResource2, f2.getWithoutElement().backColor);
            this.U = this.b(decodeResource2, androidx.core.content.d.f(context, 2131099691));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final int l(final b b, final b b2) {
        return ((org.joda.time.base.c)((org.joda.time.base.d)b.b()).b()).b((l0)((org.joda.time.base.d)b2.b()).b());
    }
    
    private final ScheduleWidgetContext m(final Context context) {
        ScheduleWidgetContext b;
        if ((b = com.untis.mobile.utils.settings.old.e.G.b(context, this.H)) == null) {
            b = new ScheduleWidgetContext();
        }
        return b;
    }
    
    private final boolean n(final Period period) {
        final ScheduleWidgetContext r = this.R;
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        if (r == null) {
            return false;
        }
        final EntityType entityType = r.entityType;
        int n;
        if (entityType == null) {
            n = -1;
        }
        else {
            n = a.a[entityType.ordinal()];
        }
        if (n == 1) {
            final List<PeriodElement> teachers = period.getTeachers();
            boolean b5;
            if (teachers instanceof Collection && teachers.isEmpty()) {
                b5 = b3;
            }
            else {
                final Iterator<Object> iterator = teachers.iterator();
                PeriodElement periodElement;
                do {
                    b5 = b3;
                    if (!iterator.hasNext()) {
                        return b5;
                    }
                    periodElement = iterator.next();
                } while (periodElement.getCurrentId() != 0L || periodElement.getOriginalId() != r.entityId);
                b5 = true;
            }
            return b5;
        }
        if (n != 2) {
            if (n == 3) {
                final List<PeriodElement> klassen = period.getKlassen();
                boolean b6;
                if (klassen instanceof Collection && klassen.isEmpty()) {
                    b6 = b;
                }
                else {
                    final Iterator<Object> iterator2 = klassen.iterator();
                    PeriodElement periodElement2;
                    do {
                        b6 = b;
                        if (!iterator2.hasNext()) {
                            return b6;
                        }
                        periodElement2 = iterator2.next();
                    } while (periodElement2.getCurrentId() != 0L || periodElement2.getOriginalId() != r.entityId);
                    b6 = true;
                }
                return b6;
            }
            if (n != 4) {
                return false;
            }
            final List<PeriodElement> rooms = period.getRooms();
            boolean b7;
            if (rooms instanceof Collection && rooms.isEmpty()) {
                b7 = b4;
            }
            else {
                final Iterator<Object> iterator3 = rooms.iterator();
                PeriodElement periodElement3;
                do {
                    b7 = b4;
                    if (!iterator3.hasNext()) {
                        return b7;
                    }
                    periodElement3 = iterator3.next();
                } while (periodElement3.getCurrentId() != 0L || periodElement3.getOriginalId() != r.entityId);
                b7 = true;
            }
            return b7;
        }
        else {
            if (period.getSubject() == null) {
                return false;
            }
            final PeriodElement subject = period.getSubject();
            final boolean b8 = subject != null && subject.getCurrentId() == 0L;
            boolean b9 = b2;
            if (b8) {
                final PeriodElement subject2 = period.getSubject();
                final boolean b10 = subject2 != null && subject2.getOriginalId() == r.entityId;
                b9 = b2;
                if (b10) {
                    b9 = true;
                }
            }
            return b9;
        }
    }
    
    private final boolean o(final Period period) {
        final ScheduleWidgetContext r = this.R;
        final boolean b = false;
        if (r == null) {
            return false;
        }
        if (r.entityType != EntityType.TEACHER) {
            return false;
        }
        final List<PeriodElement> teachers = period.getTeachers();
        boolean b2;
        if (teachers instanceof Collection && teachers.isEmpty()) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator = teachers.iterator();
            PeriodElement periodElement;
            do {
                b2 = b;
                if (!iterator.hasNext()) {
                    return b2;
                }
                periodElement = iterator.next();
            } while (periodElement.getOriginalId() != r.entityId || periodElement.getCurrentId() == periodElement.getOriginalId());
            b2 = true;
        }
        return b2;
    }
    
    private final int p(final RemoteViews remoteViews, final Period period) {
        final boolean n = this.n(period);
        final boolean o = this.o(period);
        final Context g = this.G;
        final Profile j = this.J;
        if (j == null) {
            k0.S("profile");
            throw null;
        }
        final h h = new h(g, j.getUniqueId());
        final com.untis.mobile.utils.a d = this.d();
        final Profile i = this.J;
        if (i != null) {
            final int a = h.a(period, d.I1(i), o, n);
            remoteViews.setInt(2131298728, "setBackgroundColor", a);
            return a;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void q(final RemoteViews remoteViews, final Period period) {
        remoteViews.setTextViewText(2131298719, (CharSequence)((org.joda.time.base.a)period.getStart()).g4("E, dd.MM.yyyy"));
    }
    
    private final void r(final RemoteViews remoteViews, final Period period, final int n) {
        final boolean contains = period.getStates().contains(PeriodState.CANCELLED);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(this.G);
        final Profile j = this.J;
        if (j == null) {
            k0.S("profile");
            throw null;
        }
        int n2 = 0;
        Label_0128: {
            if (a.I1(j) && period.getSubject() != null) {
                final com.untis.mobile.services.masterdata.a m = this.M;
                if (m == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final PeriodElement subject = period.getSubject();
                k0.m(subject);
                final Subject u = m.U(subject.getCurrentId());
                if (u != null) {
                    n2 = u.getCustomTextColor();
                    if (n2 == 0) {
                        n2 = u.getTextColor();
                    }
                    break Label_0128;
                }
            }
            n2 = 0;
        }
        Object o = new SpannableString((CharSequence)"");
        final boolean empty = period.getRooms().isEmpty();
        final int n3 = 1;
        if (empty ^ true) {
            final List<PeriodElement> rooms = period.getRooms();
            final com.untis.mobile.utils.a d = this.d();
            final Profile i = this.J;
            if (i == null) {
                k0.S("profile");
                throw null;
            }
            o = this.c(rooms, d.p1(i), contains, false, n2);
        }
        SpannableString k = new SpannableString((CharSequence)"");
        if (period.getSubject() != null) {
            final PeriodElement subject2 = period.getSubject();
            final com.untis.mobile.utils.a d2 = this.d();
            final Profile l = this.J;
            if (l == null) {
                k0.S("profile");
                throw null;
            }
            boolean b = false;
            Label_0314: {
                if (!d2.p1(l)) {
                    final com.untis.mobile.utils.a d3 = this.d();
                    final Profile j2 = this.J;
                    if (j2 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    if (!d3.I1(j2)) {
                        b = false;
                        break Label_0314;
                    }
                }
                b = true;
            }
            k = this.i(subject2, b, this.d().q1(), contains);
        }
        remoteViews.setViewVisibility(2131298732, 0);
        final String string = ((SpannableString)o).toString();
        k0.o(string, "roomSpStr.toString()");
        Label_0635: {
            if (string.length() > 0) {
                final com.untis.mobile.utils.a d4 = this.d();
                final Profile j3 = this.J;
                if (j3 == null) {
                    k0.S("profile");
                    throw null;
                }
                if (d4.B1(j3)) {
                    final String string2 = k.toString();
                    k0.o(string2, "subjectSpStr.toString()");
                    if (string2.length() > 0) {
                        o = TextUtils.concat(new CharSequence[] { (CharSequence)k, (CharSequence)new SpannableString((CharSequence)" - "), (CharSequence)o });
                        break Label_0635;
                    }
                }
            }
            final String string3 = ((SpannableString)o).toString();
            k0.o(string3, "roomSpStr.toString()");
            if (string3.length() > 0) {
                final com.untis.mobile.utils.a d5 = this.d();
                final Profile j4 = this.J;
                if (j4 == null) {
                    k0.S("profile");
                    throw null;
                }
                if (d5.B1(j4)) {
                    break Label_0635;
                }
            }
            final String string4 = k.toString();
            k0.o(string4, "subjectSpStr.toString()");
            if (string4.length() > 0) {
                o = k;
            }
            else {
                remoteViews.setViewVisibility(2131298732, 8);
                o = null;
            }
        }
        remoteViews.setTextViewText(2131298732, (CharSequence)o);
        final List<PeriodElement> klassen = period.getKlassen();
        final com.untis.mobile.utils.a d6 = this.d();
        final Profile j5 = this.J;
        if (j5 == null) {
            k0.S("profile");
            throw null;
        }
        final SpannableString c = this.c(klassen, d6.p1(j5), contains, false, n2);
        if (((CharSequence)c).length() > 0) {
            remoteViews.setTextViewText(2131298717, (CharSequence)c);
            remoteViews.setViewVisibility(2131298717, 0);
        }
        else {
            remoteViews.setViewVisibility(2131298717, 8);
        }
        final List<PeriodElement> teachers = period.getTeachers();
        final com.untis.mobile.utils.a d7 = this.d();
        final Profile j6 = this.J;
        if (j6 != null) {
            final SpannableString c2 = this.c(teachers, d7.p1(j6), contains, this.d().r1(), n2);
            if (((CharSequence)c2).length() > 0) {
                remoteViews.setTextViewText(2131298729, (CharSequence)c2);
                remoteViews.setViewVisibility(2131298729, 0);
            }
            else {
                remoteViews.setViewVisibility(2131298729, 8);
            }
            final PeriodInfo f = this.f(period.getId());
            final String y = this.y(f);
            if (y.length() > 0) {
                remoteViews.setViewVisibility(2131298724, 0);
                int n4;
                if (f.getLocal().length() > 0) {
                    n4 = n3;
                }
                else {
                    n4 = 0;
                }
                if (n4 != 0) {
                    remoteViews.setViewVisibility(2131298725, 8);
                    remoteViews.setViewVisibility(2131298726, 0);
                }
                else {
                    remoteViews.setViewVisibility(2131298725, 0);
                    remoteViews.setViewVisibility(2131298726, 8);
                }
                remoteViews.setTextViewText(2131298727, (CharSequence)y);
            }
            else {
                remoteViews.setViewVisibility(2131298724, 8);
            }
            if (c0.j(n)) {
                remoteViews.setTextColor(2131298727, androidx.core.content.d.f(this.G, 2131099861));
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void s(final RemoteViews remoteViews, final Period period, final int n) {
        final com.untis.mobile.services.classbook.a n2 = this.N;
        if (n2 != null) {
            final List<HomeWork> b0 = n2.b0(period.getId());
            final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
            final Iterator<Object> iterator = b0.iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                final boolean b2 = true;
                if (!hasNext) {
                    break;
                }
                final HomeWork next = iterator.next();
                final HomeWork homeWork = next;
                final t h1 = homeWork.getStart().h1();
                final t h2 = homeWork.getEnd().h1();
                final t h3 = period.getStart().h1();
                final t h4 = period.getEnd().h1();
                int n3 = 0;
                Label_0173: {
                    if (!((org.joda.time.base.e)h2).o((n0)h3)) {
                        if (!((org.joda.time.base.e)h1).m((n0)h4)) {
                            n3 = (b2 ? 1 : 0);
                            if (!((org.joda.time.base.e)h1).o((n0)h3)) {
                                break Label_0173;
                            }
                            n3 = (b2 ? 1 : 0);
                            if (!((org.joda.time.base.e)h2).m((n0)h4)) {
                                break Label_0173;
                            }
                        }
                    }
                    n3 = 0;
                }
                if (n3 == 0) {
                    continue;
                }
                list.add(next);
            }
            final int size = list.size();
            Label_0428: {
                Label_0205: {
                    if (size != 0) {
                        if (size == 1) {
                            final HomeWork homeWork2 = list.get(0);
                            final boolean completedStatus = homeWork2.getCompletedStatus();
                            final String text = homeWork2.getText();
                            final boolean local = homeWork2.getLocal();
                            remoteViews.setTextViewText(2131298723, (CharSequence)text);
                            int n4;
                            if (completedStatus && local) {
                                n4 = 2131230902;
                            }
                            else if (!completedStatus && local) {
                                n4 = 2131230901;
                            }
                            else if (completedStatus) {
                                n4 = 2131230900;
                            }
                            else {
                                n4 = 2131230899;
                            }
                            remoteViews.setImageViewResource(2131298721, n4);
                        }
                        else {
                            if (size <= 1) {
                                break Label_0205;
                            }
                            final Iterator<Object> iterator2 = list.iterator();
                            int n5 = 0;
                            while (iterator2.hasNext()) {
                                if (iterator2.next().getCompletedStatus()) {
                                    ++n5;
                                }
                            }
                            final String string = this.G.getString(2131886296);
                            k0.o(string, "context.getString(R.string.homework_manyHomeworks_text)");
                            remoteViews.setTextViewText(2131298723, (CharSequence)s.k2(string, "{0}", String.valueOf(size - n5), false, 4, (Object)null));
                        }
                        remoteViews.setViewVisibility(2131298722, 0);
                        break Label_0428;
                    }
                }
                remoteViews.setViewVisibility(2131298722, 8);
            }
            if (c0.j(n)) {
                remoteViews.setTextColor(2131298723, androidx.core.content.d.f(this.G, 2131099861));
            }
            return;
        }
        k0.S("classbookService");
        throw null;
    }
    
    private final void t(final RemoteViews remoteViews, final Period period) {
        int n;
        if (period.getStates().contains(PeriodState.OFFICE_HOUR_REGISTRATION)) {
            n = 0;
        }
        else {
            n = 8;
        }
        remoteViews.setViewVisibility(2131298716, n);
    }
    
    private final void u(final RemoteViews remoteViews, final Period period) {
        final ScheduleWidgetContext r = this.R;
        if (r == null) {
            return;
        }
        final ArrayList<Long> list = new ArrayList<Long>();
        list.add(period.getId());
        final EntityType entityType = r.entityType;
        k0.o(entityType, "widgetContext.entityType");
        final TimeTableEntity timeTableEntity = new TimeTableEntity(entityType, r.entityId, false, 0, 0L, "");
        final com.untis.mobile.b g = com.untis.mobile.b.G;
        final Profile j = this.J;
        if (j != null) {
            Intent intent;
            if (g.b(j)) {
                final CalendarActivity.a h = CalendarActivity.H;
                final Context g2 = this.G;
                final Profile i = this.J;
                if (i == null) {
                    k0.S("profile");
                    throw null;
                }
                final String uniqueId = i.getUniqueId();
                final EntityType entityType2 = r.entityType;
                k0.o(entityType2, "widgetContext.entityType");
                intent = h.b(g2, uniqueId, entityType2, r.entityId, list, period.getId(), period.getStart(), period.getEnd());
            }
            else {
                final PeriodDetailActivity.a w = PeriodDetailActivity.W;
                final Context g3 = this.G;
                final Profile k = this.J;
                if (k == null) {
                    k0.S("profile");
                    throw null;
                }
                intent = PeriodDetailActivity.a.c(w, g3, k.getUniqueId(), timeTableEntity, list, period.getId(), null, 32, null);
            }
            remoteViews.setOnClickFillInIntent(2131298728, intent);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void v(final RemoteViews remoteViews, final Period period) {
        final com.untis.mobile.utils.a d = this.d();
        final Profile j = this.J;
        final Bitmap bitmap = null;
        if (j != null) {
            Bitmap bitmap2 = null;
            Label_0170: {
                if (d.I1(j)) {
                    if (!period.getStates().contains(PeriodState.CANCELLED)) {
                        if (period.getStates().contains(PeriodState.EXAM)) {
                            bitmap2 = this.T;
                            break Label_0170;
                        }
                        if (this.o(period)) {
                            bitmap2 = this.V;
                            break Label_0170;
                        }
                        bitmap2 = bitmap;
                        if (this.j(period)) {
                            bitmap2 = this.U;
                        }
                        break Label_0170;
                    }
                }
                else {
                    bitmap2 = bitmap;
                    if (!period.getStates().contains(PeriodState.CANCELLED)) {
                        break Label_0170;
                    }
                    final com.untis.mobile.utils.a d2 = this.d();
                    final Profile i = this.J;
                    if (i == null) {
                        k0.S("profile");
                        throw null;
                    }
                    bitmap2 = bitmap;
                    if (!d2.i1(i)) {
                        break Label_0170;
                    }
                }
                bitmap2 = this.S;
            }
            remoteViews.setImageViewBitmap(2131298731, bitmap2);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void w(final RemoteViews remoteViews, final Period period, final boolean b) {
        final String g4 = ((org.joda.time.base.a)period.getStart()).g4("H:mm");
        String g5 = ((org.joda.time.base.a)period.getEnd()).g4("H:mm");
        if (!b) {
            remoteViews.setTextViewText(2131298730, (CharSequence)g4);
        }
        else {
            g5 = "";
            remoteViews.setTextViewText(2131298730, (CharSequence)"");
        }
        remoteViews.setTextViewText(2131298720, (CharSequence)g5);
    }
    
    private final void x(final RemoteViews remoteViews, final Period period) {
        remoteViews.setViewVisibility(2131298733, com.untis.mobile.utils.extension.h.U(period.isOnlinePeriod(), 0, 1, null));
    }
    
    private final String y(final PeriodInfo periodInfo) {
        final int length = periodInfo.getLocal().length();
        final int n = 1;
        final boolean b = length > 0;
        String c = "";
        if (b) {
            c = k0.C("", periodInfo.getLocal());
        }
        final boolean b2 = periodInfo.getSubstitution().length() > 0;
        String c2 = c;
        if (b2) {
            c2 = k0.C(c, periodInfo.getSubstitution());
        }
        final boolean b3 = c2.length() == 0;
        String c3 = c2;
        if (b3) {
            final boolean b4 = periodInfo.getInfo().length() > 0;
            c3 = c2;
            if (b4) {
                c3 = k0.C(c2, periodInfo.getInfo());
            }
        }
        final boolean b5 = c3.length() == 0;
        String c4 = c3;
        if (b5) {
            int n2;
            if (periodInfo.getLesson().length() > 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            c4 = c3;
            if (n2 != 0) {
                c4 = k0.C(c3, periodInfo.getLesson());
            }
        }
        return c4;
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @f
    public RemoteViews getLoadingView() {
        return null;
    }
    
    @f
    public RemoteViews getViewAt(final int index) {
        final int size = this.I.size();
        RemoteViews remoteViews2;
        final RemoteViews remoteViews = remoteViews2 = null;
        if (size != 0) {
            if (this.I.size() <= index) {
                remoteViews2 = remoteViews;
            }
            else {
                final b value = this.I.get(index);
                k0.o(value, "rows[position]");
                final b b = value;
                b b2;
                if (index > 0) {
                    b2 = this.I.get(index - 1);
                }
                else {
                    b2 = null;
                }
                if (b.a() != null) {
                    final Holiday a = b.a();
                    k0.m(a);
                    remoteViews2 = this.e(a);
                }
                else {
                    remoteViews2 = remoteViews;
                    if (b.c() != null) {
                        final Period c = b.c();
                        k0.m(c);
                        remoteViews2 = this.g(b2, c);
                    }
                }
            }
        }
        return remoteViews2;
    }
    
    public int getViewTypeCount() {
        return 8;
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    public void onCreate() {
    }
    
    public void onDataSetChanged() {
        Log.d("untis_log", "ScheduleWidgetService onDataSetChanged");
        this.k(this.G);
        com.untis.mobile.services.widget.c.G.a(this.H);
    }
    
    public void onDestroy() {
    }
}
