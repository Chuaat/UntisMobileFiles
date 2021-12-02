// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.drive;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.widget.ListAdapter;
import androidx.annotation.k0;
import android.os.Bundle;
import java.util.Collection;
import android.content.Intent;
import java.util.List;
import androidx.annotation.j0;
import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import com.untis.mobile.ui.activities.common.b;

public class DriveAttachmentListActivity extends b
{
    private static final String I = "drive_Attachments";
    private ArrayList<DriveAttachment> G;
    private ListView H;
    
    public static void s(@j0 final Context context, @j0 final List<DriveAttachment> c) {
        final Intent intent = new Intent(context, (Class)DriveAttachmentListActivity.class);
        final ArrayList list = new ArrayList();
        list.addAll(c);
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("drive_Attachments", list);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492909);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            this.G = (ArrayList<DriveAttachment>)extras.getParcelableArrayList("drive_Attachments");
        }
        if (this.G == null) {
            this.G = new ArrayList<DriveAttachment>();
        }
        (this.H = (ListView)this.findViewById(2131296561)).setAdapter((ListAdapter)new com.untis.mobile.ui.activities.drive.b((Context)this, this.G));
        this.findViewById(2131296559).setOnClickListener((View$OnClickListener)new c(this));
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((ComponentActivity)this).onBackPressed();
        return true;
    }
    
    public void onSaveInstanceState(final Bundle bundle, final PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putParcelableArrayList("drive_Attachments", (ArrayList)this.G);
    }
}
