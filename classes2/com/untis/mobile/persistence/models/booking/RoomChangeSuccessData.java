// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.booking;

import java.util.ArrayList;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;

public class RoomChangeSuccessData
{
    @j0
    private List<Period> periods;
    @j0
    private List<ValidationError> validationErrors;
    
    public RoomChangeSuccessData() {
        this.periods = new ArrayList<Period>();
        this.validationErrors = new ArrayList<ValidationError>();
    }
    
    public RoomChangeSuccessData(@j0 final List<Period> periods, @j0 final List<ValidationError> validationErrors) {
        this.periods = new ArrayList<Period>();
        this.validationErrors = new ArrayList<ValidationError>();
        this.periods = periods;
        this.validationErrors = validationErrors;
    }
    
    @j0
    public List<Period> getPeriods() {
        return this.periods;
    }
    
    @j0
    public List<ValidationError> getValidationErrors() {
        return this.validationErrors;
    }
    
    public void setPeriods(@j0 final List<Period> periods) {
        this.periods = periods;
    }
    
    public void setValidationErrors(@j0 final List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
