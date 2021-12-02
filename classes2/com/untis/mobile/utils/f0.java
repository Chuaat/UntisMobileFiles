// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Process;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/utils/f0;", "", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f0
{
    @e
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/utils/f0$a", "", "Landroid/content/Context;", "context", "", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final boolean a(@e final Context context) {
            k0.p(context, "context");
            try {
                if (!k0.g(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toCharsString(), "308201dd30820146020101300d06092a864886f70d010105050030373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b3009060355040613025553301e170d3138303231343135323835355a170d3438303230373135323835355a30373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b300906035504061302555330819f300d06092a864886f70d010101050003818d00308189028181008df3ddc7087fab15e03c22d0248e9521f518abf608803988cbb26c789e0af032069dfea22e265e6b357edde6558d559d2855b860981770dff226e9a0e2a03ba736e84280801b985270e8f4cb551a5093cd37a0583c85f8f10177ffb673e5ba79a57c169ca44e747f69486ba3b48f1c559c0176cbf76972f00046a597dcc00c3f0203010001300d06092a864886f70d010105050003818100832d9b00995c04bd4e95fc3d9288bc6e60e50aa89c890d911801e86a665df007a9ee84cd3fa5d2285451135dbdd40376cc9e942f9e2116e88023b409b3b6dd371a7c0a8009bdf7e56db8456958e4b1e8dc06f560ef46711114e02378fb9681dfafbb7770af5542d00b6d6c801b9c296a00413a44834b8cdcd781cc64a5c10849") && !k0.g("com.grupet.web.app", context.getPackageName())) {
                    Process.killProcess(Process.myPid());
                    return false;
                }
                return true;
            }
            catch (PackageManager$NameNotFoundException ex) {
                ex.getStackTrace();
                Process.killProcess(Process.myPid());
                return false;
            }
        }
    }
}
