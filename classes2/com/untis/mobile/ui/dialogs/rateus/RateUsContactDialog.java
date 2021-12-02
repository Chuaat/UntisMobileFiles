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
import android.content.Context;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.ui.activities.SupportContactActivity;
import com.untis.mobile.utils.settings.old.d;
import kotlin.jvm.internal.k0;
import android.content.DialogInterface;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n" }, d2 = { "Lcom/untis/mobile/ui/dialogs/rateus/RateUsContactDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "save", "Landroid/app/Dialog;", "B", "<init>", "()V", "h0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RateUsContactDialog extends DialogFragment
{
    @e
    public static final a h0;
    @e
    public static final String i0 = "allTheWayDownToDowntown";
    
    static {
        h0 = new a(null);
    }
    
    private static final void P(final RateUsContactDialog rateUsContactDialog, final DialogInterface dialogInterface, final int n) {
        k0.p(rateUsContactDialog, "this$0");
        d.n(((Fragment)rateUsContactDialog).requireContext()).a();
        dialogInterface.dismiss();
    }
    
    private static final void Q(final RateUsContactDialog rateUsContactDialog, final DialogInterface dialogInterface, final int n) {
        k0.p(rateUsContactDialog, "this$0");
        d.n(((Fragment)rateUsContactDialog).requireContext()).a();
        try {
            final SupportContactActivity.a h = SupportContactActivity.H;
            final Context requireContext = ((Fragment)rateUsContactDialog).requireContext();
            k0.o(requireContext, "requireContext()");
            ((Fragment)rateUsContactDialog).startActivity(h.g(requireContext, j0.G.n()));
        }
        catch (Exception ex) {
            ((Fragment)rateUsContactDialog).startActivity(SupportContactActivity.H.f());
        }
        dialogInterface.dismiss();
    }
    
    @e
    public Dialog B(@f final Bundle bundle) {
        final androidx.appcompat.app.d a = new d$a(((Fragment)this).requireContext(), 2131951624).L(2131493058).r(2131886658, (DialogInterface$OnClickListener)new b(this)).B(2131886114, (DialogInterface$OnClickListener)new com.untis.mobile.ui.dialogs.rateus.a(this)).a();
        k0.o(a, "Builder(requireContext(), R.style.AppDialogTheme)\n                .setView(R.layout.dialog_rate_us_contact)\n                .setNegativeButton(R.string.shared_alert_noThanks_button) { dialog, _ ->\n                    infoCenterSettings(requireContext()).rateUsDone()\n                    dialog.dismiss()\n                }\n                .setPositiveButton(R.string.about_support_text) { dialog, _ ->\n                    infoCenterSettings(requireContext()).rateUsDone()\n                    try {\n                        startActivity(SupportContactActivity.supportContactBrowserIntent(requireContext(), UmProfileService.getCurrent()))\n                    } catch (e: Exception) {\n                        startActivity(SupportContactActivity.supportContactActivityIntent())\n                    }\n                    dialog.dismiss()\n                }\n                .create()");
        return (Dialog)a;
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "com/untis/mobile/ui/dialogs/rateus/RateUsContactDialog$a", "", "Lcom/untis/mobile/ui/dialogs/rateus/RateUsContactDialog;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final RateUsContactDialog a() {
            return new RateUsContactDialog();
        }
    }
}
