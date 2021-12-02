// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import com.untis.mobile.ui.dialogs.validation.ApiValidationExceptionDialog;
import androidx.fragment.app.FragmentManager;
import y3.c;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import retrofit2.j;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000b" }, d2 = { "", "", "a", "c", "b", "d", "Ly3/c;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/j2;", "e", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class f
{
    public static final boolean a(@e final Throwable t) {
        k0.p(t, "<this>");
        return t instanceof j && ((j)t).a() == 401;
    }
    
    public static final boolean b(@e final Throwable t) {
        k0.p(t, "<this>");
        return t instanceof j && ((j)t).a() == 403;
    }
    
    public static final boolean c(@e final Throwable t) {
        k0.p(t, "<this>");
        return t instanceof j && ((j)t).a() == 409;
    }
    
    public static final boolean d(@e Throwable t) {
        k0.p(t, "<this>");
        final Throwable cause = t.getCause();
        if (cause != null) {
            t = cause;
        }
        final boolean b = t instanceof JsonRpcError;
        boolean b2 = true;
        if (!b || !((JsonRpcError)t).isAnyOf(JsonRpcErrorType.NoRight)) {
            b2 = false;
        }
        return b2;
    }
    
    public static final void e(@e final c c, @e final FragmentManager fragmentManager) {
        k0.p(c, "<this>");
        k0.p(fragmentManager, "fragmentManager");
        ApiValidationExceptionDialog.h0.a(fragmentManager, c.a());
    }
}
