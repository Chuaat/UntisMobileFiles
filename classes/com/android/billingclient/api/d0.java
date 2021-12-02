// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.a;
import android.os.Bundle;

final class d0
{
    static h a(final Bundle bundle, final String s, final String s2) {
        final h l = b0.l;
        String s3;
        if (bundle == null) {
            s3 = String.format("%s got null owned items list", s2);
        }
        else {
            final int a = com.google.android.gms.internal.play_billing.a.a(bundle, "BillingClient");
            final String h = com.google.android.gms.internal.play_billing.a.h(bundle, "BillingClient");
            final h.a c = com.android.billingclient.api.h.c();
            c.c(a);
            c.b(h);
            final h a2 = c.a();
            if (a != 0) {
                com.google.android.gms.internal.play_billing.a.k("BillingClient", String.format("%s failed. Response code: %s", s2, a));
                return a2;
            }
            if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                final ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                final ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                final ArrayList stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    s3 = String.format("Bundle returned from %s contains null SKUs list.", s2);
                }
                else if (stringArrayList2 == null) {
                    s3 = String.format("Bundle returned from %s contains null purchases list.", s2);
                }
                else {
                    if (stringArrayList3 != null) {
                        return b0.p;
                    }
                    s3 = String.format("Bundle returned from %s contains null signatures list.", s2);
                }
            }
            else {
                s3 = String.format("Bundle returned from %s doesn't contain required fields.", s2);
            }
        }
        a.k("BillingClient", s3);
        return l;
    }
}
