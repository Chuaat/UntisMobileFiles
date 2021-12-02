// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.p0;
import android.view.textclassifier.TextClassificationManager;
import androidx.core.util.n;
import androidx.annotation.k0;
import android.view.textclassifier.TextClassifier;
import androidx.annotation.j0;
import android.widget.TextView;

final class v
{
    @j0
    private TextView a;
    @k0
    private TextClassifier b;
    
    v(@j0 final TextView textView) {
        this.a = n.g(textView);
    }
    
    @j0
    @p0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier;
        if ((textClassifier = this.b) == null) {
            final TextClassificationManager textClassificationManager = (TextClassificationManager)this.a.getContext().getSystemService((Class)TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }
    
    @p0(api = 26)
    public void b(@k0 final TextClassifier b) {
        this.b = b;
    }
}
