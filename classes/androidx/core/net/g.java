// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.net;

import kotlin.jvm.internal.k0;
import java.io.File;
import org.jetbrains.annotations.e;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006" }, d2 = { "", "Landroid/net/Uri;", "c", "Ljava/io/File;", "b", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class g
{
    @e
    public static final File a(@e final Uri uri) {
        k0.p((Object)uri, "<this>");
        if (!k0.g((Object)uri.getScheme(), (Object)"file")) {
            throw new IllegalArgumentException(k0.C("Uri lacks 'file' scheme: ", (Object)uri).toString());
        }
        final String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(k0.C("Uri path is null: ", (Object)uri).toString());
    }
    
    @e
    public static final Uri b(@e final File file) {
        k0.p((Object)file, "<this>");
        final Uri fromFile = Uri.fromFile(file);
        k0.o((Object)fromFile, "fromFile(this)");
        return fromFile;
    }
    
    @e
    public static final Uri c(@e final String s) {
        k0.p((Object)s, "<this>");
        final Uri parse = Uri.parse(s);
        k0.o((Object)parse, "parse(this)");
        return parse;
    }
}
