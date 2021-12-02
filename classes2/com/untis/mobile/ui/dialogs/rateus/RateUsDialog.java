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
import kotlin.jvm.internal.k0;
import android.content.DialogInterface;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n" }, d2 = { "Lcom/untis/mobile/ui/dialogs/rateus/RateUsDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "save", "Landroid/app/Dialog;", "B", "<init>", "()V", "h0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RateUsDialog extends DialogFragment
{
    @e
    public static final a h0;
    @e
    public static final String i0 = "notEveryOneCanBeAHero";
    
    static {
        h0 = new a(null);
    }
    
    private static final void P(final RateUsDialog rateUsDialog, final DialogInterface dialogInterface, final int n) {
        k0.p(rateUsDialog, "this$0");
        RateUsContactDialog.h0.a().L(((Fragment)rateUsDialog).getParentFragmentManager(), "allTheWayDownToDowntown");
        dialogInterface.dismiss();
    }
    
    private static final void Q(final RateUsDialog rateUsDialog, final DialogInterface dialogInterface, final int n) {
        k0.p(rateUsDialog, "this$0");
        final RateUsStoreDialog.a h0 = RateUsStoreDialog.h0;
        h0.b().L(((Fragment)rateUsDialog).getParentFragmentManager(), h0.a());
        dialogInterface.dismiss();
    }
    
    @e
    public Dialog B(@f final Bundle bundle) {
        final androidx.appcompat.app.d a = new d$a(((Fragment)this).requireContext(), 2131951624).L(2131493057).r(2131886659, (DialogInterface$OnClickListener)new d(this)).B(2131886668, (DialogInterface$OnClickListener)new c(this)).a();
        k0.o(a, "Builder(requireContext(), R.style.AppDialogTheme)\n                .setView(R.layout.dialog_rate_us)\n                .setNegativeButton(R.string.shared_alert_no_button) { dialog, _ ->\n                    RateUsContactDialog.rateUsContactDialog().show(parentFragmentManager, RateUsContactDialog.TAG)\n                    dialog.dismiss()\n                }\n                .setPositiveButton(R.string.shared_alert_yes_button) { dialog, _ ->\n                    RateUsStoreDialog.rateUsStoreDialog().show(parentFragmentManager, RateUsStoreDialog.TAG)\n                    dialog.dismiss()\n                }\n                .create()");
        return (Dialog)a;
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "com/untis/mobile/ui/dialogs/rateus/RateUsDialog$a", "", "Lcom/untis/mobile/ui/dialogs/rateus/RateUsDialog;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final RateUsDialog a() {
            return new RateUsDialog();
        }
    }
}
