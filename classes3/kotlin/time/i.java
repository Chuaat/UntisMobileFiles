// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0001¨\u0006\u0004" }, d2 = { "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "", "e", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/time/DurationUnitKt")
class i extends h
{
    public i() {
    }
    
    @e1(version = "1.3")
    @j
    @e
    public static final String e(@e final TimeUnit obj) {
        k0.p((Object)obj, "$this$shortName");
        String s = null;
        switch (f.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown unit: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            case 7: {
                s = "d";
                break;
            }
            case 6: {
                s = "h";
                break;
            }
            case 5: {
                s = "m";
                break;
            }
            case 4: {
                s = "s";
                break;
            }
            case 3: {
                s = "ms";
                break;
            }
            case 2: {
                s = "us";
                break;
            }
            case 1: {
                s = "ns";
                break;
            }
        }
        return s;
    }
}
