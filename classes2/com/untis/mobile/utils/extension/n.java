// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import java.util.Iterator;
import com.untis.mobile.utils.billing.f;
import java.util.ArrayList;
import com.untis.mobile.utils.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import android.content.Context;
import com.untis.mobile.services.billing.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/services/billing/b;", "Landroid/content/Context;", "context", "Lkotlin/j2;", "c", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class n
{
    public static final void c(@e final b b, @e final Context context) {
        k0.p(b, "<this>");
        k0.p(context, "context");
        b.a().C5((rx.functions.b)new l(context, b), (rx.functions.b)new m(b));
    }
    
    private static final void d(final Context context, final b b, final List list) {
        k0.p(context, "$context");
        k0.p(b, "$this_checkForPremiumAndUpdate");
        final a a = com.untis.mobile.utils.a.a(context);
        a.r0(false);
        a.s0(false);
        a.u0(false);
        a.t0(false);
        a.g1(false);
        k0.o(list, "purchases");
        final ArrayList<f> list2 = new ArrayList<f>();
        final Iterator<Object> iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b2 = true;
            if (!hasNext) {
                break;
            }
            final f next = iterator.next();
            if (next.f() != 0) {
                b2 = false;
            }
            if (!b2) {
                continue;
            }
            list2.add(next);
        }
        for (final f f : list2) {
            final String i = f.i();
            if (i != null) {
                Label_0383: {
                    switch (i.hashCode()) {
                        default: {
                            continue;
                        }
                        case 1500718020: {
                            if (!i.equals("product_id_homework")) {
                                continue;
                            }
                            a.s0(true);
                            continue;
                        }
                        case 284580103: {
                            if (!i.equals("subscription_premium_year")) {
                                continue;
                            }
                            break;
                        }
                        case 221276918: {
                            if (!i.equals("subscription_premium_month")) {
                                continue;
                            }
                            break Label_0383;
                        }
                        case 18924763: {
                            if (!i.equals("product_id_widgets")) {
                                continue;
                            }
                            a.u0(true);
                            continue;
                        }
                        case 18747182: {
                            if (!i.equals("product_id_tt_settings")) {
                                continue;
                            }
                            a.t0(true);
                            continue;
                        }
                        case -1396424965: {
                            if (!i.equals("subscription_premium_year_3")) {
                                continue;
                            }
                            break;
                        }
                        case -1639865213: {
                            if (!i.equals("product_id_premium")) {
                                continue;
                            }
                            break Label_0383;
                        }
                        case -2101243607: {
                            if (!i.equals("subscription_premium_month_2")) {
                                continue;
                            }
                            break Label_0383;
                        }
                    }
                    a.r0(true);
                    a.g1(f.k());
                    continue;
                }
                a.r0(true);
            }
        }
        b.onDestroy();
    }
    
    private static final void e(final b b, final Throwable t) {
        k0.p(b, "$this_checkForPremiumAndUpdate");
        b.onDestroy();
    }
}
