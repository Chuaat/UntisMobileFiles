// 
// Decompiled by Procyon v0.5.36
// 

package k5;

import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import rx.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000b\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000e\u001a\u00020\u0002¨\u0006\u0012" }, d2 = { "Lk5/a;", "Landroidx/lifecycle/w0;", "", "profileId", "", "lessonId", "Lkotlin/j2;", "c", "Lrx/g;", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "d", "channelName", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannel;", "b", "channelId", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends w0
{
    private String a;
    private long b;
    private com.untis.mobile.services.messenger.a c;
    
    @e
    public final g<MessengerChannel> a(@e final String s) {
        k0.p(s, "channelId");
        final com.untis.mobile.services.messenger.a c = this.c;
        if (c != null) {
            return c.d(this.b, s);
        }
        k0.S("messengerService");
        throw null;
    }
    
    @e
    public final g<MessengerChannel> b(@e final String s) {
        k0.p(s, "channelName");
        final com.untis.mobile.services.messenger.a c = this.c;
        if (c != null) {
            return c.c(this.b, s);
        }
        k0.S("messengerService");
        throw null;
    }
    
    public final void c(@e final String a, final long b) {
        k0.p(a, "profileId");
        this.a = a;
        this.b = b;
        this.c = new com.untis.mobile.services.messenger.e(a);
    }
    
    @e
    public final g<MessengerChannelData> d() {
        final com.untis.mobile.services.messenger.a c = this.c;
        if (c != null) {
            return c.a(this.b);
        }
        k0.S("messengerService");
        throw null;
    }
}
