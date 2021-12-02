// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.ImageButton;
import android.content.Context;
import android.view.View$OnClickListener;
import androidx.core.content.d;
import android.widget.TextView$OnEditorActionListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.EditText;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.infocenter.w;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import androidx.fragment.app.FragmentManager;
import android.widget.Toast;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.annotation.j0;
import android.view.KeyEvent;
import rx.functions.b;
import androidx.annotation.k0;
import android.util.Log;
import com.untis.mobile.utils.u0;
import com.untis.mobile.ui.dialogs.ValidationErrorDialog;
import com.untis.mobile.services.masterdata.a;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ClassTeacherExcuseFragment extends UmFragment
{
    public static final String N = "ctef_jumanji";
    private static final String O = "profile_id";
    private static final String P = "absence";
    private Profile G;
    private StudentAbsence H;
    private View I;
    private TextView J;
    private ProgressBar K;
    private a L;
    private com.untis.mobile.services.infocenter.a M;
    
    private void B(@k0 final View view) {
        if (this.H.getExcuse() != null) {
            if (this.H.getExcuse().getExcuseStatus() != null) {
                this.K.setVisibility(0);
                this.M.x(this.H).C5((b)new o(this), (b)new p(this));
            }
        }
    }
    
    @j0
    public static ClassTeacherExcuseFragment w(@j0 final Profile profile, @j0 final StudentAbsence studentAbsence) {
        final ClassTeacherExcuseFragment classTeacherExcuseFragment = new ClassTeacherExcuseFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        arguments.putParcelable("absence", (Parcelable)studentAbsence);
        classTeacherExcuseFragment.setArguments(arguments);
        return classTeacherExcuseFragment;
    }
    
    public void C(@j0 final ExcuseStatus excuseStatus) {
        if (this.H.getExcuse() != null) {
            this.H.getExcuse().setExcuseStatus(excuseStatus);
            this.J.setText((CharSequence)excuseStatus.getDisplayName());
        }
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
            final StudentAbsence h = (StudentAbsence)arguments.getParcelable("absence");
            this.H = h;
            if (h.getExcuse() == null) {
                this.H.setExcuse(new Excuse());
            }
        }
        this.L = this.G.getMasterDataService();
        this.M = new w(this.G.getUniqueId());
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        (this.I = layoutInflater.inflate(2131493078, viewGroup, false)).setId(2131298713);
        this.I.findViewById(2131297537).setVisibility(8);
        final EditText editText = (EditText)this.I.findViewById(2131297536);
        final View viewById = this.I.findViewById(2131297531);
        this.J = (TextView)this.I.findViewById(2131297532);
        final FloatingActionButton floatingActionButton = (FloatingActionButton)this.I.findViewById(2131297533);
        this.K = (ProgressBar)this.I.findViewById(2131297534);
        ((TextView)this.I.findViewById(2131297535)).setText((CharSequence)this.H.getStudent().getDisplayName());
        ((TextView)this.I.findViewById(2131297538)).setText((CharSequence)com.untis.mobile.utils.time.b.c(this.H.getStart(), this.H.getEnd()));
        final TextView textView = (TextView)this.I.findViewById(2131297530);
        String text;
        if (this.H.getAbsenceReason() != null) {
            text = this.H.getAbsenceReason().getDisplayName();
        }
        else {
            text = this.getString(2131886745);
        }
        textView.setText((CharSequence)text);
        editText.setText((CharSequence)this.H.getExcuse().getText());
        editText.setOnEditorActionListener((TextView$OnEditorActionListener)new n(this));
        if (this.L.X().size() > 0) {
            TextView textView2;
            Context context;
            int n;
            if (this.H.getExcuse() != null && this.H.getExcuse().getExcuseStatus() != null) {
                this.J.setText((CharSequence)this.H.getExcuse().getExcuseStatus().getDisplayName());
                textView2 = this.J;
                context = this.getContext();
                if (this.H.getExcuse().getExcuseStatus().getExcused()) {
                    n = 2131099701;
                }
                else {
                    n = 2131099700;
                }
            }
            else {
                this.J.setText(2131886745);
                textView2 = this.J;
                context = this.getContext();
                n = 2131099970;
            }
            textView2.setTextColor(d.f(context, n));
            viewById.setOnClickListener((View$OnClickListener)new m(this));
        }
        else {
            viewById.setVisibility(8);
        }
        ((ImageButton)floatingActionButton).setOnClickListener((View$OnClickListener)new l(this));
        return this.I;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile_id", this.G.getUniqueId());
        bundle.putParcelable("absence", (Parcelable)this.H);
    }
}
