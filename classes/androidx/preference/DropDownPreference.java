// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.widget.SpinnerAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.util.AttributeSet;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Context;

public class DropDownPreference extends ListPreference
{
    private final Context L0;
    private final ArrayAdapter M0;
    private Spinner N0;
    private final AdapterView$OnItemSelectedListener O0;
    
    public DropDownPreference(final Context context) {
        this(context, null);
    }
    
    public DropDownPreference(final Context context, final AttributeSet set) {
        this(context, set, o.b.B1);
    }
    
    public DropDownPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public DropDownPreference(final Context l0, final AttributeSet set, final int n, final int n2) {
        super(l0, set, n, n2);
        this.O0 = (AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                if (n >= 0) {
                    final String string = DropDownPreference.this.I2()[n].toString();
                    if (!string.equals(DropDownPreference.this.J2()) && DropDownPreference.this.d(string)) {
                        DropDownPreference.this.R2(string);
                    }
                }
            }
            
            public void onNothingSelected(final AdapterView<?> adapterView) {
            }
        };
        this.L0 = l0;
        this.M0 = this.U2();
        this.W2();
    }
    
    private int V2(final String obj) {
        final CharSequence[] i2 = this.I2();
        if (obj != null && i2 != null) {
            for (int j = i2.length - 1; j >= 0; --j) {
                if (i2[j].equals(obj)) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    private void W2() {
        this.M0.clear();
        if (this.G2() != null) {
            final CharSequence[] g2 = this.G2();
            for (int length = g2.length, i = 0; i < length; ++i) {
                this.M0.add((Object)g2[i].toString());
            }
        }
    }
    
    @Override
    public void G0(final n n) {
        (this.N0 = (Spinner)n.itemView.findViewById(o.g.u1)).setAdapter((SpinnerAdapter)this.M0);
        this.N0.setOnItemSelectedListener(this.O0);
        this.N0.setSelection(this.V2(this.J2()));
        super.G0(n);
    }
    
    @Override
    protected void I0() {
        this.N0.performClick();
    }
    
    @Override
    public void N2(@j0 final CharSequence[] array) {
        super.N2(array);
        this.W2();
    }
    
    @Override
    public void T2(final int n) {
        this.R2(this.I2()[n].toString());
    }
    
    protected ArrayAdapter U2() {
        return new ArrayAdapter(this.L0, 17367049);
    }
    
    @Override
    protected void z0() {
        super.z0();
        final ArrayAdapter m0 = this.M0;
        if (m0 != null) {
            m0.notifyDataSetChanged();
        }
    }
}
