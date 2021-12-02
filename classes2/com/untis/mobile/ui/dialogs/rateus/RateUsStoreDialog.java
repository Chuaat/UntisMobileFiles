// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs.rateus;

import androidx.fragment.app.Fragment;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import android.app.Dialog;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.content.ActivityNotFoundException;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import com.untis.mobile.UntisMobileApplication;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.content.DialogInterface;
import androidx.fragment.app.d;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f" }, d2 = { "Lcom/untis/mobile/ui/dialogs/rateus/RateUsStoreDialog;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/j2;", "S", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "B", "<init>", "()V", "h0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RateUsStoreDialog extends DialogFragment
{
    @e
    public static final a h0;
    @e
    private static final String i0;
    
    static {
        h0 = new a(null);
        i0 = "youCantAlwaysGetWhatYouWant";
    }
    
    public static final /* synthetic */ String P() {
        return RateUsStoreDialog.i0;
    }
    
    private static final void Q(final d d, final DialogInterface dialogInterface, final int n) {
        k0.p(d, "$activity");
        com.untis.mobile.utils.settings.old.d.n((Context)d).a();
        dialogInterface.dismiss();
    }
    
    private static final void R(final RateUsStoreDialog rateUsStoreDialog, final d d, final DialogInterface dialogInterface, final int n) {
        k0.p(rateUsStoreDialog, "this$0");
        k0.p(d, "$activity");
        rateUsStoreDialog.S();
        com.untis.mobile.utils.settings.old.d.n((Context)d).a();
        dialogInterface.dismiss();
    }
    
    private final void S() {
        Object o;
        if ((o = UntisMobileApplication.I.b()) == null && (o = ((Fragment)this).getContext()) == null && (o = ((Fragment)this).getActivity()) == null) {
            return;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(k0.C("market://details?id=", ((Context)o).getPackageName())));
        try {
            ((Fragment)this).startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            Toast.makeText((Context)o, (CharSequence)" Sorry, Not able to open!", 0).show();
        }
    }
    
    @e
    public Dialog B(@f final Bundle bundle) {
        final d activity = ((Fragment)this).getActivity();
        if (activity != null) {
            final d$a d$a = new d$a((Context)activity, 2131951624);
            d$a.L(2131493059);
            d$a.r(2131886658, (DialogInterface$OnClickListener)new com.untis.mobile.ui.dialogs.rateus.e(activity));
            d$a.B(2131886111, (DialogInterface$OnClickListener)new com.untis.mobile.ui.dialogs.rateus.f(this, activity));
            final androidx.appcompat.app.d a = d$a.a();
            k0.o(a, "builder.create()");
            return (Dialog)a;
        }
        final Context context = ((Fragment)this).getContext();
        if (context != null) {
            return new Dialog(context);
        }
        throw new RuntimeException("no context available");
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/ui/dialogs/rateus/RateUsStoreDialog$a", "", "Lcom/untis/mobile/ui/dialogs/rateus/RateUsStoreDialog;", "b", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final String a() {
            return RateUsStoreDialog.P();
        }
        
        @e
        public final RateUsStoreDialog b() {
            return new RateUsStoreDialog();
        }
    }
}
