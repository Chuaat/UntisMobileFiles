// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import android.content.DialogInterface$OnClickListener;
import kotlin.jvm.internal.k0;
import android.app.AlertDialog$Builder;
import kotlin.j2;
import org.jetbrains.annotations.e;
import android.content.Context;
import android.content.DialogInterface;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u000e" }, d2 = { "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lkotlin/t0;", "name", "dialog", "Lkotlin/j2;", "onPositiveClick", "onNegativeClick", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "type", "Landroid/app/AlertDialog$Builder;", "getDeleteOrRevokeMessageAlertDialog", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class UiUtilsKt
{
    @e
    public static final AlertDialog$Builder getDeleteOrRevokeMessageAlertDialog(@e final Context context, @e final l<? super DialogInterface, j2> l, @e final l<? super DialogInterface, j2> i, @e final AlertDialogTypes alertDialogTypes) {
        k0.p(context, "context");
        k0.p(l, "onPositiveClick");
        k0.p(i, "onNegativeClick");
        k0.p(alertDialogTypes, "type");
        final AlertDialogTypes revoke = AlertDialogTypes.REVOKE;
        int title;
        if (alertDialogTypes == revoke) {
            title = 2131886386;
        }
        else {
            title = 2131886384;
        }
        int message;
        if (alertDialogTypes == revoke) {
            message = 2131886404;
        }
        else {
            message = 2131886387;
        }
        int n;
        if (alertDialogTypes == revoke) {
            n = 2131886385;
        }
        else {
            n = 2131886383;
        }
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(title);
        alertDialog$Builder.setMessage(message);
        alertDialog$Builder.setCancelable(false);
        alertDialog$Builder.setPositiveButton(n, (DialogInterface$OnClickListener)new b(l));
        alertDialog$Builder.setNegativeButton(2131886382, (DialogInterface$OnClickListener)new a(i));
        return alertDialog$Builder;
    }
    
    private static final void getDeleteOrRevokeMessageAlertDialog$lambda-0(final l l, final DialogInterface dialogInterface, final int n) {
        k0.p(l, "$onPositiveClick");
        k0.o(dialogInterface, "dialog");
        l.invoke(dialogInterface);
    }
    
    private static final void getDeleteOrRevokeMessageAlertDialog$lambda-1(final l l, final DialogInterface dialogInterface, final int n) {
        k0.p(l, "$onNegativeClick");
        k0.o(dialogInterface, "dialog");
        l.invoke(dialogInterface);
    }
}
