// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.qrcodereader;

import android.widget.ImageView;
import android.app.Dialog;
import androidx.activity.ComponentActivity;
import android.net.Uri;
import android.os.Parcelable;
import com.untis.mobile.ui.activities.profile.v0;
import com.google.android.gms.vision.a$a;
import android.view.SurfaceHolder;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import android.content.Intent;
import android.util.SparseArray;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import android.content.DialogInterface;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import com.untis.mobile.utils.s;
import com.google.android.gms.vision.b$a;
import android.app.Activity;
import com.untis.mobile.c;
import android.view.SurfaceView;
import android.content.Context;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.google.android.gms.vision.barcode.a;
import com.google.android.gms.vision.b$b;
import android.view.SurfaceHolder$Callback;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061" }, d2 = { "Lcom/untis/mobile/ui/activities/qrcodereader/ScanQrCodeActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/view/SurfaceHolder$Callback;", "Lcom/google/android/gms/vision/b$b;", "Lcom/google/android/gms/vision/barcode/a;", "Lkotlin/j2;", "u", "Landroid/os/Bundle;", "save", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "format", "width", "height", "surfaceChanged", "surfaceDestroyed", "Lcom/google/android/gms/vision/b$a;", "detections", "o", "release", "", "I", "Z", "openDialog", "J", "startCameraOnStart", "Lcom/google/android/gms/vision/b;", "H", "Lcom/google/android/gms/vision/b;", "barCodeDetector", "Lcom/google/android/gms/vision/a;", "G", "Lcom/google/android/gms/vision/a;", "cameraSource", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ScanQrCodeActivity extends b implements SurfaceHolder$Callback, b$b<com.google.android.gms.vision.barcode.a>
{
    @e
    public static final a K;
    @e
    private static final String L = "qr_code_data";
    @f
    private com.google.android.gms.vision.a G;
    @f
    private com.google.android.gms.vision.b<com.google.android.gms.vision.barcode.a> H;
    private boolean I;
    private boolean J;
    
    static {
        K = new a(null);
    }
    
    public static final /* synthetic */ boolean r(final ScanQrCodeActivity scanQrCodeActivity) {
        return scanQrCodeActivity.I;
    }
    
    public static final /* synthetic */ void s(final ScanQrCodeActivity scanQrCodeActivity, final boolean i) {
        scanQrCodeActivity.I = i;
    }
    
    private static final void t(final ScanQrCodeActivity scanQrCodeActivity, final View view) {
        k0.p(scanQrCodeActivity, "this$0");
        ((ComponentActivity)scanQrCodeActivity).onBackPressed();
    }
    
    private final void u() {
        try {
            if (d.a((Context)this, "android.permission.CAMERA") == 0) {
                final com.google.android.gms.vision.a g = this.G;
                if (g != null) {
                    g.e(((SurfaceView)this.findViewById(c.i.t9)).getHolder());
                }
            }
            else {
                androidx.core.app.a.D((Activity)this, new String[] { "android.permission.CAMERA" }, 1600);
            }
        }
        catch (Exception ex) {
            timber.log.b.g((Throwable)ex, "error on update camera", new Object[0]);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void o(@f final b$a<com.google.android.gms.vision.barcode.a> b$a) {
        if (b$a == null) {
            return;
        }
        final SparseArray b = b$a.b();
        if (b.size() > 0) {
            final Intent intent = null;
            Intent d = null;
            Label_0116: {
                s s;
                n6.a<j2> a;
                l<j2, j2> l;
                try {
                    final a k = ScanQrCodeActivity.K;
                    final String i = ((com.google.android.gms.vision.barcode.a)b.valueAt(0)).I;
                    k0.o(i, "barCodes.valueAt(0).displayValue");
                    d = k.d(i);
                    break Label_0116;
                }
                catch (Exception ex) {
                    timber.log.b.g((Throwable)ex, "unknown error on scan qr code result", new Object[0]);
                    d = intent;
                    break Label_0116;
                }
                catch (m5.a a2) {
                    s = com.untis.mobile.utils.s.a;
                    a = ScanQrCodeActivity$d.G;
                    l = new l<j2, j2>() {
                        final /* synthetic */ ScanQrCodeActivity G;
                        
                        private static final void g(final DialogInterface dialogInterface, final int n) {
                            dialogInterface.cancel();
                        }
                        
                        private static final void i(final ScanQrCodeActivity scanQrCodeActivity, final DialogInterface dialogInterface) {
                            k0.p(scanQrCodeActivity, "this$0");
                            ScanQrCodeActivity.s(scanQrCodeActivity, false);
                        }
                        
                        public final void c(@e final j2 j2) {
                            k0.p(j2, "it");
                            if (!ScanQrCodeActivity.r(this.G)) {
                                ((Dialog)new d$a((Context)this.G).m(2131886718).r(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.qrcodereader.e.G).x((DialogInterface$OnCancelListener)new com.untis.mobile.ui.activities.qrcodereader.d(this.G)).a()).show();
                                ScanQrCodeActivity.s(this.G, true);
                            }
                        }
                    };
                }
                catch (m5.b b2) {
                    s = com.untis.mobile.utils.s.a;
                    a = ScanQrCodeActivity$b.G;
                    l = new l<j2, j2>() {
                        final /* synthetic */ ScanQrCodeActivity G;
                        
                        private static final void g(final DialogInterface dialogInterface, final int n) {
                            dialogInterface.cancel();
                        }
                        
                        private static final void i(final ScanQrCodeActivity scanQrCodeActivity, final DialogInterface dialogInterface) {
                            k0.p(scanQrCodeActivity, "this$0");
                            ScanQrCodeActivity.s(scanQrCodeActivity, false);
                        }
                        
                        public final void c(@e final j2 j2) {
                            k0.p(j2, "it");
                            if (!ScanQrCodeActivity.r(this.G)) {
                                ((Dialog)new d$a((Context)this.G).m(2131886130).r(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.qrcodereader.c.G).x((DialogInterface$OnCancelListener)new com.untis.mobile.ui.activities.qrcodereader.b(this.G)).a()).show();
                                ScanQrCodeActivity.s(this.G, true);
                            }
                        }
                    };
                }
                s.J((n6.a<?>)a, (l<? super Object, j2>)l);
                d = intent;
            }
            if (d != null) {
                ((Activity)this).setResult(-1, d);
                ((Activity)this).finish();
            }
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492950);
        if (d.a((Context)this, "android.permission.CAMERA") != 0) {
            androidx.core.app.a.D((Activity)this, new String[] { "android.permission.CAMERA" }, 1600);
        }
        else {
            this.J = true;
        }
        ((SurfaceView)this.findViewById(c.i.t9)).getHolder().addCallback((SurfaceHolder$Callback)this);
        ((ImageView)this.findViewById(c.i.s9)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.qrcodereader.a(this));
    }
    
    public void onRequestPermissionsResult(int n, @e final String[] array, @e final int[] array2) {
        k0.p(array, "permissions");
        k0.p(array2, "grantResults");
        super.onRequestPermissionsResult(n, array, array2);
        if (n == 1600) {
            if (array2.length == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if ((n ^ 0x1) != 0x0 && array2[0] == 0) {
                this.u();
            }
            else {
                ((Activity)this).finish();
            }
        }
    }
    
    public void release() {
    }
    
    public void surfaceChanged(@e final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        k0.p(surfaceHolder, "holder");
    }
    
    public void surfaceCreated(@e final SurfaceHolder surfaceHolder) {
        k0.p(surfaceHolder, "holder");
        final com.google.android.gms.vision.barcode.b a = new com.google.android.gms.vision.barcode.b$a((Context)this).b(256).a();
        this.H = (com.google.android.gms.vision.b<com.google.android.gms.vision.barcode.a>)a;
        if (a != null) {
            ((com.google.android.gms.vision.b)a).f((b$b)this);
        }
        final com.google.android.gms.vision.b<com.google.android.gms.vision.barcode.a> h = this.H;
        if (h != null) {
            this.G = new a$a((Context)this, (com.google.android.gms.vision.b)h).b(true).a();
            if (this.J) {
                this.u();
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public void surfaceDestroyed(@e final SurfaceHolder surfaceHolder) {
        k0.p(surfaceHolder, "holder");
        final com.google.android.gms.vision.a g = this.G;
        if (g != null) {
            g.f();
        }
        this.H = null;
        this.G = null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "com/untis/mobile/ui/activities/qrcodereader/ScanQrCodeActivity$a", "", "Lcom/untis/mobile/ui/activities/profile/v0;", "qrCodeData", "Landroid/content/Intent;", "c", "Landroid/content/Context;", "context", "b", "", "qrCodeString", "d", "data", "a", "BUNDLE_QR_CODE_DATA", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final Intent c(final v0 v0) {
            final Intent intent = new Intent();
            intent.putExtra("qr_code_data", (Parcelable)v0);
            return intent;
        }
        
        @f
        public final v0 a(@f final Intent intent) {
            v0 v0;
            if (intent == null) {
                v0 = null;
            }
            else {
                v0 = (v0)intent.getParcelableExtra("qr_code_data");
            }
            return v0;
        }
        
        @e
        public final Intent b(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)ScanQrCodeActivity.class);
        }
        
        @e
        public final Intent d(@e String path) throws m5.b, m5.a {
            k0.p(path, "qrCodeString");
            final v0 v0 = new v0(null, null, null, null, 0L, 31, null);
            final Uri parse = Uri.parse(kotlin.text.s.k2(path, "#anonymous#", "anonymous", false, 4, (Object)null));
            final String queryParameter = parse.getQueryParameter("user");
            final String queryParameter2 = parse.getQueryParameter("key");
            final String queryParameter3 = parse.getQueryParameter("school");
            final String queryParameter4 = parse.getQueryParameter("url");
            final String queryParameter5 = parse.getQueryParameter("schoolNumber");
            path = queryParameter;
            if (k0.g(queryParameter, "anonymous")) {
                path = "#anonymous#";
            }
            Label_0173: {
                if (queryParameter3 == null || path == null || queryParameter4 == null) {
                    break Label_0173;
                }
                v0.j(path);
                if ((path = queryParameter2) == null) {
                    path = "";
                }
                v0.i(path);
                v0.g(queryParameter3);
                v0.h(queryParameter4);
                Label_0161: {
                    if (queryParameter5 == null) {
                        final long long1 = 0L;
                        break Label_0161;
                    }
                    try {
                        final long long1 = Long.parseLong(queryParameter5);
                        v0.f(long1);
                        return this.c(v0);
                        path = parse.getPath();
                        // iftrue(Label_0202:, path == null || !kotlin.text.s.V2((CharSequence)path, (CharSequence)"UntisMobile", false, 2, (Object)null))
                        throw new m5.a();
                        Label_0202: {
                            throw new m5.b();
                        }
                    }
                    catch (Exception ex) {
                        return this.c(v0);
                    }
                }
            }
        }
    }
}
