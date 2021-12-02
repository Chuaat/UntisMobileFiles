// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs.validation;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import y3.b;
import kotlin.collections.v;
import y3.a;
import java.util.List;
import android.os.Bundle;
import android.view.View;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.w;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/ui/dialogs/validation/ApiValidationExceptionDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "args", "", "Ly3/a;", "P", "savedInstanceState", "Lkotlin/j2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "<init>", "()V", "h0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ApiValidationExceptionDialog extends DialogFragment
{
    @e
    public static final a h0;
    @e
    private static final String i0 = "api-validation-exception-dialog";
    @e
    private static final String j0 = "errors_json";
    private static final Gson k0;
    
    static {
        h0 = new a(null);
        k0 = new GsonBuilder().create();
    }
    
    public static final /* synthetic */ Gson O() {
        return ApiValidationExceptionDialog.k0;
    }
    
    private final List<y3.a> P(final Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = bundle.getString("errors_json");
        }
        if (string == null) {
            return v.E();
        }
        List<y3.a> list;
        try {
            final Gson k0 = ApiValidationExceptionDialog.k0;
            new b(null, 1, null);
            list = k0.fromJson(string, b.class).a();
        }
        catch (Exception ex) {
            list = v.E();
        }
        return list;
    }
    
    private static final void Q(final ApiValidationExceptionDialog apiValidationExceptionDialog, final View view) {
        kotlin.jvm.internal.k0.p(apiValidationExceptionDialog, "this$0");
        apiValidationExceptionDialog.u();
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.I(0, 2131952204);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493030, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((TextView)inflate.findViewById(c.i.fl)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.dialogs.validation.b(this));
        Bundle arguments;
        if ((arguments = bundle) == null) {
            arguments = ((Fragment)this).getArguments();
        }
        final List<y3.a> p3 = this.P(arguments);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.gl);
        final Context requireContext = ((Fragment)this).requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.ui.dialogs.validation.a(requireContext, p3));
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001e\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "com/untis/mobile/ui/dialogs/validation/ApiValidationExceptionDialog$a", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "Ly3/a;", "errors", "Lkotlin/j2;", "a", "", "ARGUMENTS_ERRORS_JSON", "Ljava/lang/String;", "TAG", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final void a(@e final FragmentManager fragmentManager, @e final List<y3.a> list) {
            kotlin.jvm.internal.k0.p(fragmentManager, "fragmentManager");
            kotlin.jvm.internal.k0.p(list, "errors");
            final ApiValidationExceptionDialog apiValidationExceptionDialog = new ApiValidationExceptionDialog();
            h.e((Fragment)apiValidationExceptionDialog, new l<Bundle, j2>() {
                public final void a(@e final Bundle bundle) {
                    kotlin.jvm.internal.k0.p(bundle, "$this$arguments");
                    bundle.putString("errors_json", ApiValidationExceptionDialog.O().toJson(new b(list)));
                }
            });
            apiValidationExceptionDialog.L(fragmentManager, "api-validation-exception-dialog");
        }
    }
}
