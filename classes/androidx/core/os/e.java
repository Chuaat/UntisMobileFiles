// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import java.io.IOException;
import android.util.Log;
import android.os.Environment;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import java.io.File;

public final class e
{
    private static final String a = "EnvironmentCompat";
    public static final String b = "unknown";
    
    private e() {
    }
    
    @j0
    public static String a(@j0 final File file) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            return Environment.getExternalStorageState(file);
        }
        if (sdk_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        }
        catch (IOException obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve canonical path: ");
            sb.append(obj);
            Log.w("EnvironmentCompat", sb.toString());
        }
        return "unknown";
    }
}
