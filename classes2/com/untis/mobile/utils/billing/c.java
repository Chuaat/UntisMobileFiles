// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import android.util.Log;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.app.Activity;
import android.content.Intent;
import com.android.vending.billing.IInAppBillingService$Stub;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.Iterator;
import java.util.Collection;
import android.os.RemoteException;
import org.json.JSONException;
import java.util.ArrayList;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.Handler;
import java.util.List;
import android.content.ServiceConnection;
import com.android.vending.billing.IInAppBillingService;
import android.content.Context;

public class c
{
    public static final int A = -1000;
    public static final int B = -1001;
    public static final int C = -1002;
    public static final int D = -1003;
    public static final int E = -1004;
    public static final int F = -1005;
    public static final int G = -1006;
    public static final int H = -1007;
    public static final int I = -1008;
    public static final int J = -1009;
    public static final int K = -1010;
    public static final int L = -1011;
    public static final String M = "RESPONSE_CODE";
    public static final String N = "DETAILS_LIST";
    public static final String O = "BUY_INTENT";
    public static final String P = "INAPP_PURCHASE_DATA";
    public static final String Q = "INAPP_DATA_SIGNATURE";
    public static final String R = "INAPP_PURCHASE_ITEM_LIST";
    public static final String S = "INAPP_PURCHASE_DATA_LIST";
    public static final String T = "INAPP_DATA_SIGNATURE_LIST";
    public static final String U = "INAPP_CONTINUATION_TOKEN";
    public static final String V = "inapp";
    public static final String W = "subs";
    public static final String X = "ITEM_ID_LIST";
    public static final String Y = "ITEM_TYPE_LIST";
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;
    public static final int x = 6;
    public static final int y = 7;
    public static final int z = 8;
    boolean a;
    String b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    private final Object i;
    String j;
    Context k;
    IInAppBillingService l;
    ServiceConnection m;
    int n;
    String o;
    String p;
    g q;
    
    public c(final Context k, final String p2) {
        this.a = false;
        this.b = "IabHelper";
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = new Object();
        this.j = "";
        this.p = null;
        this.k = k;
        this.p = p2;
        this.v("IAB helper created.");
    }
    
    private void a() {
        if (!this.d) {
            return;
        }
        throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
    }
    
    public static String o(final int n) {
        final String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        final String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        StringBuilder sb;
        String str;
        if (n <= -1000) {
            final int n2 = -1000 - n;
            if (n2 >= 0 && n2 < split2.length) {
                return split2[n2];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(n));
            str = ":Unknown IAB Helper Error";
        }
        else {
            if (n >= 0 && n < split.length) {
                return split[n];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(n));
            str = ":Unknown";
        }
        sb.append(str);
        return sb.toString();
    }
    
    public void A(final i i) throws d {
        this.B(false, null, null, i);
    }
    
    public void B(final boolean b, final List<String> list, final List<String> list2, final i i) throws d {
        final Handler handler = new Handler();
        this.a();
        this.b("queryInventory");
        this.l("refresh inventory");
        new Thread(new Runnable() {
            @Override
            public void run() {
                com.untis.mobile.utils.billing.d a = new com.untis.mobile.utils.billing.d(0, "Inventory refresh successful.");
                com.untis.mobile.utils.billing.e z;
                try {
                    z = com.untis.mobile.utils.billing.c.this.z(b, list, list2);
                }
                catch (b b) {
                    a = b.a();
                    z = null;
                }
                com.untis.mobile.utils.billing.c.this.k();
                if (!com.untis.mobile.utils.billing.c.this.d && i != null) {
                    handler.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            i.a(a, z);
                        }
                    });
                }
            }
        }).start();
    }
    
    int C(final com.untis.mobile.utils.billing.e e, final String str) throws JSONException, RemoteException {
        final StringBuilder sb = new StringBuilder();
        sb.append("Querying owned items, item type: ");
        sb.append(str);
        this.v(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Package name: ");
        sb2.append(this.k.getPackageName());
        this.v(sb2.toString());
        final IInAppBillingService l = this.l;
        final int n = -1003;
        if (l == null) {
            return -1003;
        }
        String str2 = null;
        int n2 = 0;
        String string;
        int n3;
        do {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Calling getPurchases with continuation token: ");
            sb3.append(str2);
            this.v(sb3.toString());
            final Bundle purchases = this.l.getPurchases(3, this.k.getPackageName(), str, str2);
            final int m = this.m(purchases);
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Owned items response: ");
            sb4.append(String.valueOf(m));
            this.v(sb4.toString());
            if (m != 0) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("getPurchases() failed: ");
                sb5.append(o(m));
                this.v(sb5.toString());
                return m;
            }
            if (!purchases.containsKey("INAPP_PURCHASE_ITEM_LIST") || !purchases.containsKey("INAPP_PURCHASE_DATA_LIST") || !purchases.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                this.w("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            }
            final ArrayList stringArrayList = purchases.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            final ArrayList stringArrayList2 = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            final ArrayList stringArrayList3 = purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            int i = 0;
            n3 = n2;
            while (i < stringArrayList2.size()) {
                final String s = stringArrayList2.get(i);
                final String str3 = stringArrayList3.get(i);
                final String str4 = stringArrayList.get(i);
                if (com.untis.mobile.utils.billing.g.c(this.p, s, str3)) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("Sku is owned: ");
                    sb6.append(str4);
                    this.v(sb6.toString());
                    final com.untis.mobile.utils.billing.f f = new com.untis.mobile.utils.billing.f(str, s, str3);
                    if (TextUtils.isEmpty((CharSequence)f.j())) {
                        this.x("BUG: empty/null token!");
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append("Purchase data: ");
                        sb7.append(s);
                        this.v(sb7.toString());
                    }
                    e.a(f);
                }
                else {
                    this.x("Purchase signature verification **FAILED**. Not adding item.");
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append("   Purchase data: ");
                    sb8.append(s);
                    this.v(sb8.toString());
                    final StringBuilder sb9 = new StringBuilder();
                    sb9.append("   Signature: ");
                    sb9.append(str3);
                    this.v(sb9.toString());
                    n3 = 1;
                }
                ++i;
            }
            string = purchases.getString("INAPP_CONTINUATION_TOKEN");
            final StringBuilder sb10 = new StringBuilder();
            sb10.append("Continuation token: ");
            sb10.append(string);
            this.v(sb10.toString());
            str2 = string;
            n2 = n3;
        } while (!TextUtils.isEmpty((CharSequence)string));
        int n4;
        if (n3 != 0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        return n4;
    }
    
    int D(final String s, final com.untis.mobile.utils.billing.e e, final List<String> list) throws RemoteException, JSONException {
        this.v("Querying SKU details.");
        final ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(e.e(s));
        if (list != null) {
            for (final String s2 : list) {
                if (!list2.contains(s2)) {
                    list2.add(s2);
                }
            }
        }
        if (list2.size() == 0) {
            this.v("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        final ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>();
        final int n = list2.size() / 20;
        final int n2 = list2.size() % 20;
        for (int i = 0; i < n; ++i) {
            final ArrayList<String> e2 = new ArrayList<String>();
            final int fromIndex = i * 20;
            final Iterator<String> iterator2 = list2.subList(fromIndex, fromIndex + 20).iterator();
            while (iterator2.hasNext()) {
                e2.add(iterator2.next());
            }
            list3.add(e2);
        }
        if (n2 != 0) {
            final ArrayList<String> e3 = new ArrayList<String>();
            final int fromIndex2 = n * 20;
            final Iterator<String> iterator3 = list2.subList(fromIndex2, n2 + fromIndex2).iterator();
            while (iterator3.hasNext()) {
                e3.add(iterator3.next());
            }
            list3.add(e3);
        }
        for (final ArrayList<String> list4 : list3) {
            final Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList)list4);
            final Bundle skuDetails = this.l.getSkuDetails(3, this.k.getPackageName(), s, bundle);
            if (!skuDetails.containsKey("DETAILS_LIST")) {
                final int m = this.m(skuDetails);
                if (m != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("getSkuDetails() failed: ");
                    sb.append(o(m));
                    this.v(sb.toString());
                    return m;
                }
                this.w("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
            else {
                final Iterator iterator5 = skuDetails.getStringArrayList("DETAILS_LIST").iterator();
                while (iterator5.hasNext()) {
                    final com.untis.mobile.utils.billing.h obj = new com.untis.mobile.utils.billing.h(s, iterator5.next());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Got sku details: ");
                    sb2.append(obj);
                    this.v(sb2.toString());
                    e.b(obj);
                }
            }
        }
        return 0;
    }
    
    public void E(final h h) {
        this.a();
        if (!this.c) {
            this.v("Starting in-app billing setup.");
            this.m = (ServiceConnection)new ServiceConnection() {
                public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                    final c d = com.untis.mobile.utils.billing.c.this;
                    if (d.d) {
                        return;
                    }
                    d.v("Billing service connected.");
                    com.untis.mobile.utils.billing.c.this.l = IInAppBillingService$Stub.asInterface(binder);
                    final String packageName = com.untis.mobile.utils.billing.c.this.k.getPackageName();
                    try {
                        com.untis.mobile.utils.billing.c.this.v("Checking for in-app billing 3 support.");
                        final int billingSupported = com.untis.mobile.utils.billing.c.this.l.isBillingSupported(3, packageName, "inapp");
                        if (billingSupported != 0) {
                            final h c = h;
                            if (c != null) {
                                c.a(new com.untis.mobile.utils.billing.d(billingSupported, "Error checking for billing v3 support."));
                            }
                            final c d2 = com.untis.mobile.utils.billing.c.this;
                            d2.f = false;
                            d2.g = false;
                            return;
                        }
                        final c d3 = com.untis.mobile.utils.billing.c.this;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("In-app billing version 3 supported for ");
                        sb.append(packageName);
                        d3.v(sb.toString());
                        if (com.untis.mobile.utils.billing.c.this.l.isBillingSupported(5, packageName, "subs") == 0) {
                            com.untis.mobile.utils.billing.c.this.v("Subscription re-signup AVAILABLE.");
                            com.untis.mobile.utils.billing.c.this.g = true;
                        }
                        else {
                            com.untis.mobile.utils.billing.c.this.v("Subscription re-signup not available.");
                            com.untis.mobile.utils.billing.c.this.g = false;
                        }
                        final c d4 = com.untis.mobile.utils.billing.c.this;
                        if (d4.g) {
                            d4.f = true;
                        }
                        else {
                            final int billingSupported2 = d4.l.isBillingSupported(3, packageName, "subs");
                            if (billingSupported2 == 0) {
                                com.untis.mobile.utils.billing.c.this.v("Subscriptions AVAILABLE.");
                                com.untis.mobile.utils.billing.c.this.f = true;
                            }
                            else {
                                final c d5 = com.untis.mobile.utils.billing.c.this;
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Subscriptions NOT AVAILABLE. Response: ");
                                sb2.append(billingSupported2);
                                d5.v(sb2.toString());
                                final c d6 = com.untis.mobile.utils.billing.c.this;
                                d6.f = false;
                                d6.g = false;
                            }
                        }
                        com.untis.mobile.utils.billing.c.this.c = true;
                        final h c2 = h;
                        if (c2 != null) {
                            c2.a(new com.untis.mobile.utils.billing.d(0, "Setup successful."));
                        }
                    }
                    catch (RemoteException ex) {
                        final h c3 = h;
                        if (c3 != null) {
                            c3.a(new com.untis.mobile.utils.billing.d(-1001, "RemoteException while setting up in-app billing."));
                        }
                        ex.printStackTrace();
                    }
                }
                
                public void onServiceDisconnected(final ComponentName componentName) {
                    com.untis.mobile.utils.billing.c.this.v("Billing service disconnected.");
                    com.untis.mobile.utils.billing.c.this.l = null;
                }
            };
            final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            final List queryIntentServices = this.k.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.k.bindService(intent, this.m, 1);
            }
            else if (h != null) {
                h.a(new com.untis.mobile.utils.billing.d(3, "Billing service unavailable on device."));
            }
            return;
        }
        throw new IllegalStateException("IAB helper is already set up.");
    }
    
    public boolean F() {
        this.a();
        return this.f;
    }
    
    void b(final String s) {
        if (this.c) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal state for operation (");
        sb.append(s);
        sb.append("): IAB helper is not set up.");
        this.w(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("IAB helper is not set up. Can't perform operation: ");
        sb2.append(s);
        throw new IllegalStateException(sb2.toString());
    }
    
    void c(final com.untis.mobile.utils.billing.f f) throws b {
        this.a();
        this.b("consume");
        if (f.a.equals("inapp")) {
            try {
                final String j = f.j();
                final String i = f.i();
                if (j == null || j.equals("")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't consume ");
                    sb.append(i);
                    sb.append(". No token.");
                    this.w(sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("PurchaseInfo is missing token for sku: ");
                    sb2.append(i);
                    sb2.append(" ");
                    sb2.append(f);
                    throw new b(-1007, sb2.toString());
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Consuming sku: ");
                sb3.append(i);
                sb3.append(", token: ");
                sb3.append(j);
                this.v(sb3.toString());
                final int consumePurchase = this.l.consumePurchase(3, this.k.getPackageName(), j);
                if (consumePurchase == 0) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Successfully consumed sku: ");
                    sb4.append(i);
                    this.v(sb4.toString());
                    return;
                }
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("Error consuming consuming sku ");
                sb5.append(i);
                sb5.append(". ");
                sb5.append(o(consumePurchase));
                this.v(sb5.toString());
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("Error consuming sku ");
                sb6.append(i);
                throw new b(consumePurchase, sb6.toString());
            }
            catch (RemoteException ex) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("Remote exception while consuming. PurchaseInfo: ");
                sb7.append(f);
                throw new b(-1001, sb7.toString(), (Exception)ex);
            }
        }
        final StringBuilder sb8 = new StringBuilder();
        sb8.append("Items of type '");
        sb8.append(f.a);
        sb8.append("' can't be consumed.");
        throw new b(-1010, sb8.toString());
    }
    
    public void d(final com.untis.mobile.utils.billing.f f, final e e) throws d {
        this.a();
        this.b("consume");
        final ArrayList<com.untis.mobile.utils.billing.f> list = new ArrayList<com.untis.mobile.utils.billing.f>();
        list.add(f);
        this.f(list, e, null);
    }
    
    public void e(final List<com.untis.mobile.utils.billing.f> list, final f f) throws d {
        this.a();
        this.b("consume");
        this.f(list, null, f);
    }
    
    void f(final List<com.untis.mobile.utils.billing.f> list, final e e, final f f) throws d {
        final Handler handler = new Handler();
        this.l("consume");
        new Thread(new Runnable() {
            @Override
            public void run() {
                final ArrayList<com.untis.mobile.utils.billing.d> list = new ArrayList<com.untis.mobile.utils.billing.d>();
                for (final com.untis.mobile.utils.billing.f f : list) {
                    try {
                        com.untis.mobile.utils.billing.c.this.c(f);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Successful consume of sku ");
                        sb.append(f.i());
                        list.add(new com.untis.mobile.utils.billing.d(0, sb.toString()));
                    }
                    catch (b b) {
                        list.add(b.a());
                    }
                }
                com.untis.mobile.utils.billing.c.this.k();
                if (!com.untis.mobile.utils.billing.c.this.d && e != null) {
                    handler.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            final Runnable h = Runnable.this;
                            e.a((com.untis.mobile.utils.billing.f)list.get(0), list.get(0));
                        }
                    });
                }
                if (!com.untis.mobile.utils.billing.c.this.d && f != null) {
                    handler.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            final Runnable h = Runnable.this;
                            f.a(list, list);
                        }
                    });
                }
            }
        }).start();
    }
    
    public void g() throws d {
        Object o = this.i;
        synchronized (o) {
            if (!this.h) {
                // monitorexit(o)
                this.v("Disposing.");
                this.c = false;
                if (this.m != null) {
                    this.v("Unbinding from service.");
                    o = this.k;
                    if (o != null) {
                        ((Context)o).unbindService(this.m);
                    }
                }
                this.d = true;
                this.k = null;
                this.m = null;
                this.l = null;
                this.q = null;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't dispose because an async operation (");
            sb.append(this.j);
            sb.append(") is in progress.");
            throw new d(sb.toString());
        }
    }
    
    public void h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/untis/mobile/utils/billing/c.i:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/untis/mobile/utils/billing/c.h:Z
        //    11: ifeq            29
        //    14: aload_0        
        //    15: ldc_w           "Will dispose after async operation finishes."
        //    18: invokevirtual   com/untis/mobile/utils/billing/c.v:(Ljava/lang/String;)V
        //    21: aload_0        
        //    22: iconst_1       
        //    23: putfield        com/untis/mobile/utils/billing/c.e:Z
        //    26: goto            33
        //    29: aload_0        
        //    30: invokevirtual   com/untis/mobile/utils/billing/c.g:()V
        //    33: aload_1        
        //    34: monitorexit    
        //    35: return         
        //    36: astore_2       
        //    37: aload_1        
        //    38: monitorexit    
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_2       
        //    42: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      26     36     41     Any
        //  29     33     41     45     Lcom/untis/mobile/utils/billing/c$d;
        //  29     33     36     41     Any
        //  33     35     36     41     Any
        //  37     39     36     41     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void i(final boolean a) {
        this.a();
        this.a = a;
    }
    
    public void j(final boolean a, final String b) {
        this.a();
        this.a = a;
        this.b = b;
    }
    
    void k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: new             Ljava/lang/StringBuilder;
        //    10: astore_2       
        //    11: aload_2        
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: aload_2        
        //    16: ldc_w           "Ending async operation: "
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: pop            
        //    23: aload_2        
        //    24: aload_0        
        //    25: getfield        com/untis/mobile/utils/billing/c.j:Ljava/lang/String;
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: pop            
        //    32: aload_0        
        //    33: aload_2        
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokevirtual   com/untis/mobile/utils/billing/c.v:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: ldc             ""
        //    43: putfield        com/untis/mobile/utils/billing/c.j:Ljava/lang/String;
        //    46: aload_0        
        //    47: iconst_0       
        //    48: putfield        com/untis/mobile/utils/billing/c.h:Z
        //    51: aload_0        
        //    52: getfield        com/untis/mobile/utils/billing/c.e:Z
        //    55: istore_3       
        //    56: iload_3        
        //    57: ifeq            64
        //    60: aload_0        
        //    61: invokevirtual   com/untis/mobile/utils/billing/c.g:()V
        //    64: aload_1        
        //    65: monitorexit    
        //    66: return         
        //    67: astore_2       
        //    68: aload_1        
        //    69: monitorexit    
        //    70: aload_2        
        //    71: athrow         
        //    72: astore_2       
        //    73: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      56     67     72     Any
        //  60     64     72     76     Lcom/untis/mobile/utils/billing/c$d;
        //  60     64     67     72     Any
        //  64     66     67     72     Any
        //  68     70     67     72     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void l(final String str) throws d {
        synchronized (this.i) {
            if (!this.h) {
                this.j = str;
                this.h = true;
                final StringBuilder sb = new StringBuilder();
                sb.append("Starting async operation: ");
                sb.append(str);
                this.v(sb.toString());
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't start async operation (");
            sb2.append(str);
            sb2.append(") because another async operation (");
            sb2.append(this.j);
            sb2.append(") is in progress.");
            throw new d(sb2.toString());
        }
    }
    
    int m(final Bundle bundle) {
        final Object value = bundle.get("RESPONSE_CODE");
        if (value == null) {
            this.v("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (value instanceof Integer) {
            return (int)value;
        }
        if (value instanceof Long) {
            return (int)(long)value;
        }
        this.w("Unexpected type for bundle response code.");
        this.w(((Long)value).getClass().getName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected type for bundle response code: ");
        sb.append(((Long)value).getClass().getName());
        throw new RuntimeException(sb.toString());
    }
    
    int n(final Intent intent) {
        final Object value = intent.getExtras().get("RESPONSE_CODE");
        if (value == null) {
            this.w("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (value instanceof Integer) {
            return (int)value;
        }
        if (value instanceof Long) {
            return (int)(long)value;
        }
        this.w("Unexpected type for intent response code.");
        this.w(((Long)value).getClass().getName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected type for intent response code: ");
        sb.append(((Long)value).getClass().getName());
        throw new RuntimeException(sb.toString());
    }
    
    public boolean p(int n, final int i, final Intent intent) {
        if (n != this.n) {
            return false;
        }
        this.a();
        this.b("handleActivityResult");
        this.k();
        if (intent == null) {
            this.w("Null data in IAB activity result.");
            final com.untis.mobile.utils.billing.d d = new com.untis.mobile.utils.billing.d(-1002, "Null data in IAB result");
            final g q = this.q;
            if (q != null) {
                q.a(d, null);
            }
            return true;
        }
        n = this.n(intent);
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i == -1 && n == 0) {
            this.v("Successful resultcode from purchase activity.");
            final StringBuilder sb = new StringBuilder();
            sb.append("Purchase data: ");
            sb.append(stringExtra);
            this.v(sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Data signature: ");
            sb2.append(stringExtra2);
            this.v(sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Extras: ");
            sb3.append(intent.getExtras());
            this.v(sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Expected item type: ");
            sb4.append(this.o);
            this.v(sb4.toString());
            if (stringExtra != null) {
                if (stringExtra2 != null) {
                    try {
                        final com.untis.mobile.utils.billing.f f = new com.untis.mobile.utils.billing.f(this.o, stringExtra, stringExtra2);
                        final String j = f.i();
                        if (!com.untis.mobile.utils.billing.g.c(this.p, stringExtra, stringExtra2)) {
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("Purchase signature verification FAILED for sku ");
                            sb5.append(j);
                            this.w(sb5.toString());
                            final StringBuilder sb6 = new StringBuilder();
                            sb6.append("Signature verification failed for sku ");
                            sb6.append(j);
                            final com.untis.mobile.utils.billing.d d2 = new com.untis.mobile.utils.billing.d(-1003, sb6.toString());
                            final g q2 = this.q;
                            if (q2 != null) {
                                q2.a(d2, f);
                            }
                            return true;
                        }
                        this.v("Purchase signature successfully verified.");
                        final g q3 = this.q;
                        if (q3 != null) {
                            q3.a(new com.untis.mobile.utils.billing.d(0, "Success"), f);
                            return true;
                        }
                        return true;
                    }
                    catch (JSONException ex) {
                        this.w("Failed to parse purchase data.");
                        ex.printStackTrace();
                        final com.untis.mobile.utils.billing.d d3 = new com.untis.mobile.utils.billing.d(-1002, "Failed to parse purchase data.");
                        final g q4 = this.q;
                        if (q4 != null) {
                            q4.a(d3, null);
                        }
                        return true;
                    }
                }
            }
            this.w("BUG: either purchaseData or dataSignature is null.");
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Extras: ");
            sb7.append(intent.getExtras().toString());
            this.v(sb7.toString());
            final com.untis.mobile.utils.billing.d d4 = new com.untis.mobile.utils.billing.d(-1008, "IAB returned null purchaseData or dataSignature");
            final g q5 = this.q;
            if (q5 != null) {
                q5.a(d4, null);
            }
            return true;
        }
        com.untis.mobile.utils.billing.d d5;
        g g;
        if (i == -1) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("Result code was OK but in-app billing response was not OK: ");
            sb8.append(o(n));
            this.v(sb8.toString());
            if (this.q == null) {
                return true;
            }
            d5 = new com.untis.mobile.utils.billing.d(n, "Problem purchashing item.");
            g = this.q;
        }
        else if (i == 0) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("Purchase canceled - Response: ");
            sb8.append(o(n));
            this.v(sb8.toString());
            d5 = new com.untis.mobile.utils.billing.d(-1005, "User canceled.");
            g = this.q;
            if (g == null) {
                return true;
            }
        }
        else {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("Purchase failed. Result code: ");
            sb8.append(Integer.toString(i));
            sb8.append(". Response: ");
            sb8.append(o(n));
            this.w(sb8.toString());
            d5 = new com.untis.mobile.utils.billing.d(-1006, "Unknown purchase response.");
            g = this.q;
            if (g == null) {
                return true;
            }
        }
        g.a(d5, null);
        return true;
    }
    
    public void q(final Activity activity, final String s, final int n, final g g) throws d {
        this.r(activity, s, n, g, "");
    }
    
    public void r(final Activity activity, final String s, final int n, final g g, final String s2) throws d {
        this.s(activity, s, "inapp", null, n, g, s2);
    }
    
    public void s(final Activity activity, final String s, final String s2, final List<String> list, final int n, final g q, final String s3) throws d {
        this.a();
        this.b("launchPurchaseFlow");
        this.l("launchPurchaseFlow");
        if (s2.equals("subs") && !this.f) {
            final com.untis.mobile.utils.billing.d d = new com.untis.mobile.utils.billing.d(-1009, "Subscriptions are not available.");
            this.k();
            if (q != null) {
                q.a(d, null);
            }
            return;
        }
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("Constructing buy intent for ");
            sb.append(s);
            sb.append(", item type: ");
            sb.append(s2);
            this.v(sb.toString());
            Bundle bundle;
            if (list != null && !list.isEmpty()) {
                if (!this.g) {
                    final com.untis.mobile.utils.billing.d d2 = new com.untis.mobile.utils.billing.d(-1011, "Subscription updates are not available.");
                    this.k();
                    if (q != null) {
                        q.a(d2, null);
                    }
                    return;
                }
                bundle = this.l.getBuyIntentToReplaceSkus(5, this.k.getPackageName(), (List)list, s, s2, s3);
            }
            else {
                bundle = this.l.getBuyIntent(3, this.k.getPackageName(), s, s2, s3);
            }
            final int m = this.m(bundle);
            if (m != 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to buy item, Error response: ");
                sb2.append(o(m));
                this.w(sb2.toString());
                this.k();
                final com.untis.mobile.utils.billing.d d3 = new com.untis.mobile.utils.billing.d(m, "Unable to buy item");
                if (q != null) {
                    q.a(d3, null);
                }
                return;
            }
            final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("BUY_INTENT");
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Launching buy intent for ");
            sb3.append(s);
            sb3.append(". Request code: ");
            sb3.append(n);
            this.v(sb3.toString());
            this.n = n;
            this.q = q;
            this.o = s2;
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), n, new Intent(), (int)0, (int)0, (int)0);
        }
        catch (RemoteException ex) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("RemoteException while launching purchase flow for sku ");
            sb4.append(s);
            this.w(sb4.toString());
            ex.printStackTrace();
            this.k();
            final com.untis.mobile.utils.billing.d d4 = new com.untis.mobile.utils.billing.d(-1001, "Remote exception while starting purchase flow");
            if (q != null) {}
        }
        catch (IntentSender$SendIntentException ex2) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("SendIntentException while launching purchase flow for sku ");
            sb5.append(s);
            this.w(sb5.toString());
            ex2.printStackTrace();
            this.k();
            final com.untis.mobile.utils.billing.d d4 = new com.untis.mobile.utils.billing.d(-1004, "Failed to send intent.");
            if (q != null) {
                goto Label_0494;
            }
        }
    }
    
    public void t(final Activity activity, final String s, final int n, final g g) throws d {
        this.u(activity, s, n, g, "");
    }
    
    public void u(final Activity activity, final String s, final int n, final g g, final String s2) throws d {
        this.s(activity, s, "subs", null, n, g, s2);
    }
    
    void v(final String s) {
        if (this.a) {
            Log.d(this.b, s);
        }
    }
    
    void w(final String str) {
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("In-app billing error: ");
        sb.append(str);
        Log.e(b, sb.toString());
    }
    
    void x(final String str) {
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("In-app billing warning: ");
        sb.append(str);
        Log.w(b, sb.toString());
    }
    
    public com.untis.mobile.utils.billing.e y() throws b {
        return this.z(false, null, null);
    }
    
    public com.untis.mobile.utils.billing.e z(final boolean b, final List<String> list, final List<String> list2) throws b {
        this.a();
        this.b("queryInventory");
        try {
            final com.untis.mobile.utils.billing.e e = new com.untis.mobile.utils.billing.e();
            final int c = this.C(e, "inapp");
            if (c == 0) {
                if (b) {
                    final int d = this.D("inapp", e, list);
                    if (d != 0) {
                        throw new b(d, "Error refreshing inventory (querying prices of items).");
                    }
                }
                if (this.f) {
                    final int c2 = this.C(e, "subs");
                    if (c2 != 0) {
                        throw new b(c2, "Error refreshing inventory (querying owned subscriptions).");
                    }
                    if (b) {
                        final int d2 = this.D("subs", e, list2);
                        if (d2 != 0) {
                            throw new b(d2, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                }
                return e;
            }
            throw new b(c, "Error refreshing inventory (querying owned items).");
        }
        catch (JSONException ex) {
            throw new b(-1002, "Error parsing JSON response while refreshing inventory.", (Exception)ex);
        }
        catch (RemoteException ex2) {
            throw new b(-1001, "Remote exception while refreshing inventory.", (Exception)ex2);
        }
    }
    
    public static class d extends Exception
    {
        public d(final String message) {
            super(message);
        }
    }
    
    public interface e
    {
        void a(final com.untis.mobile.utils.billing.f p0, final com.untis.mobile.utils.billing.d p1);
    }
    
    public interface f
    {
        void a(final List<com.untis.mobile.utils.billing.f> p0, final List<com.untis.mobile.utils.billing.d> p1);
    }
    
    public interface g
    {
        void a(final com.untis.mobile.utils.billing.d p0, final com.untis.mobile.utils.billing.f p1);
    }
    
    public interface h
    {
        void a(final com.untis.mobile.utils.billing.d p0);
    }
    
    public interface i
    {
        void a(final com.untis.mobile.utils.billing.d p0, final com.untis.mobile.utils.billing.e p1);
    }
}
