// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.opensource;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ListAdapter;
import android.content.Context;
import android.widget.ListView;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import java.util.Comparator;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/opensource/OpenSourceActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "Lcom/untis/mobile/ui/activities/settings/opensource/j;", "t", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "<init>", "()V", "G", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class OpenSourceActivity extends b
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    private static final void s(final OpenSourceActivity openSourceActivity, final View view) {
        k0.p(openSourceActivity, "this$0");
        ((ComponentActivity)openSourceActivity).onBackPressed();
    }
    
    private final List<j> t() {
        final ArrayList<j> list = new ArrayList<j>();
        list.add(new j("Realm", "Use the Realm Database to update data in minutes so you can build mobile apps in a fraction of the time. Our object database is a simple alternative to SQLite and Core Data and proudly open source.", "Realm.io", "10.3.1", com.untis.mobile.ui.activities.settings.opensource.a.N, "https://realm.io/contact/", "https://realm.io/"));
        final com.untis.mobile.ui.activities.settings.opensource.a k = com.untis.mobile.ui.activities.settings.opensource.a.K;
        list.add(new j("Kotlin", "Kotlin is a statically-typed programming language", "JetBrains", "1.4.30", k, "https://www.jetbrains.com/", "https://kotlinlang.org/"));
        list.add(new j("Google Support Libraries", "Provides additional convenience classes and features not available in the standard Framework API for easier development and support across more devices", "Google LLC", "30", k, "https://www.google.at/contact/impressum.html", "https://developer.android.com/topic/libraries/support-library/index.html"));
        list.add(new j("Retrofit 2", "A type-safe HTTP client for Android and Java", "Square, Inc", "2.9.0", k, "http://square.github.io/", "http://square.github.io/retrofit/"));
        list.add(new j("Joda Time", "Date and time library to replace JDK date handling", "Joda.org", "2.10.6", k, "http://www.joda.org/", "http://www.joda.org/joda-time/"));
        list.add(new j("Gson", "A Java library that can be used to convert Java Objects into their JSON representation", "Google LLC", "2.8.6", k, "https://www.google.at/contact/impressum.html", "https://github.com/google/gson"));
        list.add(new j("Commons Codec", "The Apache Commons Codec package contains simple encoder and decoders for various formats such as Base64 and Hexadecimal. In addition to these widely used encoders and decoders, the codec package also maintains a collection of phonetic encoding utilities", "Apache", "1.14", k, "http://www.apache.org/", "http://commons.apache.org/proper/commons-codec/"));
        list.add(new j("Viewpager Indicator", "Paging indicator widgets that are compatible with the ViewPager from the Android Support Library to improve discoverability of content", "Jake Wharton", "2.4.1", k, "jakewharton@gmail.com", "https://github.com/JakeWharton/ViewPagerIndicator"));
        list.add(new j("Firebase", "Firebase Cloud Messaging (FCM) is a cross-platform messaging solution that lets you reliably deliver messages at no cost", "Google LLC", "18.0.2", k, "https://www.google.at/contact/impressum.html", "https://firebase.google.com/docs/cloud-messaging/"));
        list.add(new j("RxJava & -Android", "ReactiveX is a combination of the best ideas from the Observer pattern, the Iterator pattern, and functional programming", "ReactiveX", "1.3.8 & (android) 1.2.1", k, "http://reactivex.io/", "https://github.com/ReactiveX/RxAndroid"));
        list.add(new j("Colorpicker", "Simple android color picker with color wheel and lightness bar", "QuadFlask", "0.0.13", k, "https://github.com/QuadFlask", "https://github.com/QuadFlask/colorpicker"));
        list.add(new j("PugNotifications", "Abstracts all the notifications construction process for you", "Halyson L. Gon\u00e7alves", "1.8.1", k, "http://www.halysongoncalves.com/", "https://github.com/halysongoncalves/Pugnotification"));
        return (List<j>)v.h5((Iterable<?>)list, (Comparator<? super Object>)c.G);
    }
    
    private static final int u(final j j, final j i) {
        return j.f().compareTo(i.f());
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492938);
        final int v7 = com.untis.mobile.c.i.V7;
        ((ListView)this.findViewById(v7)).setAdapter((ListAdapter)new i((Context)this, this.t()));
        ((ListView)this.findViewById(v7)).setDividerHeight(0);
        ((ImageView)this.findViewById(com.untis.mobile.c.i.U7)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.opensource.b(this));
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        boolean onOptionsItemSelected;
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            onOptionsItemSelected = true;
        }
        else {
            onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        }
        return onOptionsItemSelected;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/settings/opensource/OpenSourceActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)OpenSourceActivity.class);
        }
    }
}
