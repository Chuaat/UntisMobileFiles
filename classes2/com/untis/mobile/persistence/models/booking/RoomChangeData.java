// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.booking;

import java.util.Comparator;
import java.util.Collections;
import com.untis.mobile.utils.comparator.b;
import java.util.ArrayList;
import android.os.Parcel;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RoomChangeData implements Parcelable
{
    public static final Parcelable$Creator<RoomChangeData> CREATOR;
    @j0
    private List<Room> availableRooms;
    @j0
    private List<ValidationError> validationErrors;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<RoomChangeData>() {
            public RoomChangeData createFromParcel(final Parcel parcel) {
                return new RoomChangeData(parcel);
            }
            
            public RoomChangeData[] newArray(final int n) {
                return new RoomChangeData[n];
            }
        };
    }
    
    public RoomChangeData() {
        this.availableRooms = new ArrayList<Room>();
        this.validationErrors = new ArrayList<ValidationError>();
    }
    
    protected RoomChangeData(final Parcel parcel) {
        this.availableRooms = new ArrayList<Room>();
        this.validationErrors = new ArrayList<ValidationError>();
        this.availableRooms = (List<Room>)parcel.createTypedArrayList((Parcelable$Creator)Room.CREATOR);
        this.validationErrors = (List<ValidationError>)parcel.createTypedArrayList((Parcelable$Creator)ValidationError.CREATOR);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    public List<Room> getAvailableRooms() {
        return this.availableRooms;
    }
    
    @j0
    public List<ValidationError> getValidationErrors() {
        return this.validationErrors;
    }
    
    public void setAvailableRooms(@j0 final List<Room> availableRooms) {
        Collections.sort(this.availableRooms = availableRooms, a.G);
    }
    
    public void setValidationErrors(@j0 final List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.availableRooms);
        parcel.writeTypedList((List)this.validationErrors);
    }
}
