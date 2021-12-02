// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.k0;

public final class d extends IllegalStateException
{
    private d(final String message, @k0 final Throwable cause) {
        super(message, cause);
    }
    
    public static IllegalStateException a(final m<?> m) {
        if (!m.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        final Exception q = m.q();
        String string;
        if (q != null) {
            string = "failure";
        }
        else if (m.v()) {
            final String value = String.valueOf(m.r());
            final StringBuilder sb = new StringBuilder(value.length() + 7);
            sb.append("result ");
            sb.append(value);
            string = sb.toString();
        }
        else if (m.t()) {
            string = "cancellation";
        }
        else {
            string = "unknown issue";
        }
        final String value2 = String.valueOf(string);
        String concat;
        if (value2.length() != 0) {
            concat = "Complete with: ".concat(value2);
        }
        else {
            concat = new String("Complete with: ");
        }
        return new d(concat, q);
    }
}
