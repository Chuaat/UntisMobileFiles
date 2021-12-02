// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.pm;

import androidx.annotation.k0;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.Set;
import androidx.annotation.u0;
import java.util.Map;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.SigningInfo;
import java.util.Collections;
import android.content.pm.Signature;
import java.util.List;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageInfo;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Arrays;
import androidx.annotation.j0;

public final class b
{
    private b() {
    }
    
    private static boolean a(@j0 final byte[][] array, @j0 final byte[] a) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (Arrays.equals(a, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    private static byte[] b(byte[] digest) {
        try {
            digest = MessageDigest.getInstance("SHA256").digest(digest);
            return digest;
        }
        catch (NoSuchAlgorithmException cause) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", cause);
        }
    }
    
    public static long c(@j0 final PackageInfo packageInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }
    
    @j0
    public static List<Signature> d(@j0 final PackageManager packageManager, @j0 final String s) throws PackageManager$NameNotFoundException {
        Signature[] a;
        if (Build$VERSION.SDK_INT >= 28) {
            final SigningInfo signingInfo = packageManager.getPackageInfo(s, 134217728).signingInfo;
            if (b.a.c(signingInfo)) {
                a = b.a.a(signingInfo);
            }
            else {
                a = b.a.b(signingInfo);
            }
        }
        else {
            a = packageManager.getPackageInfo(s, 64).signatures;
        }
        if (a == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(a);
    }
    
    public static boolean e(@j0 final PackageManager packageManager, @j0 final String str, @j0 @u0(min = 1L) final Map<byte[], Integer> map, final boolean b) throws PackageManager$NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        final Set<byte[]> keySet = map.keySet();
        for (final byte[] array : keySet) {
            if (array == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cert byte array cannot be null when verifying ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            final Integer obj = map.get(array);
            if (obj == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Type must be specified for cert when verifying ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            final int intValue = obj;
            if (intValue == 0) {
                continue;
            }
            if (intValue == 1) {
                continue;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unsupported certificate type ");
            sb3.append(obj);
            sb3.append(" when verifying ");
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
        final List<Signature> d = d(packageManager, str);
        if (!b && Build$VERSION.SDK_INT >= 28) {
            for (final byte[] array2 : keySet) {
                if (!a.d(packageManager, str, array2, map.get(array2))) {
                    return false;
                }
            }
            return true;
        }
        if (d.size() != 0 && map.size() <= d.size()) {
            if (!b || map.size() == d.size()) {
                final boolean containsValue = map.containsValue(1);
                byte[][] array3 = null;
                if (containsValue) {
                    final byte[][] array4 = new byte[d.size()][];
                    int n = 0;
                    while (true) {
                        array3 = array4;
                        if (n >= d.size()) {
                            break;
                        }
                        array4[n] = b(d.get(n).toByteArray());
                        ++n;
                    }
                }
                final Iterator<byte[]> iterator3 = keySet.iterator();
                if (iterator3.hasNext()) {
                    final byte[] array5 = iterator3.next();
                    final Integer obj2 = map.get(array5);
                    final int intValue2 = obj2;
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Unsupported certificate type ");
                            sb4.append(obj2);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        if (!a(array3, array5)) {
                            return false;
                        }
                    }
                    else if (!d.contains(new Signature(array5))) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @p0(28)
    private static class a
    {
        @k0
        static Signature[] a(@j0 final SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }
        
        @k0
        static Signature[] b(@j0 final SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }
        
        static boolean c(@j0 final SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }
        
        static boolean d(@j0 final PackageManager packageManager, @j0 final String s, @j0 final byte[] array, final int n) {
            return packageManager.hasSigningCertificate(s, array, n);
        }
    }
}
