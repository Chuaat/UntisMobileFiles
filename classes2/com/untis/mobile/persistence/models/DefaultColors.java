// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import android.graphics.Color;

public class DefaultColors
{
    private DefaultColor absence;
    private DefaultColor booking;
    private DefaultColor booking_lock;
    private DefaultColor break_supervision;
    private DefaultColor cancelled;
    private DefaultColor conflict;
    private DefaultColor element_changed;
    private DefaultColor exam;
    private DefaultColor free;
    private DefaultColor holiday;
    private DefaultColor holiday_lock;
    private DefaultColor lesson;
    private DefaultColor office_hours;
    private DefaultColor reservation;
    private DefaultColor shift;
    private DefaultColor special_duty;
    private DefaultColor standby;
    private DefaultColor storno;
    private DefaultColor substitution;
    private long timestamp;
    private DefaultColor without_element;
    private DefaultColor worktime;
    
    public DefaultColors() {
        this.free = new DefaultColor(Color.parseColor("#eceded"), -16777216);
        this.lesson = new DefaultColor(Color.parseColor("#f49f25"), -16777216);
        this.reservation = new DefaultColor(Color.parseColor("#d7dd7a"), -16777216);
        this.booking = new DefaultColor(Color.parseColor("#b0bc00"), -16777216);
        this.storno = new DefaultColor(Color.parseColor("#f3c480"), -16777216);
        this.booking_lock = new DefaultColor(Color.parseColor("#b1b3b4"), -16777216);
        this.holiday = new DefaultColor(Color.parseColor("#53aedd"), -16777216);
        this.holiday_lock = new DefaultColor(Color.parseColor("#a2d8f4"), -16777216);
        this.conflict = new DefaultColor(Color.parseColor("#e53527"), -16777216);
        this.substitution = new DefaultColor(Color.parseColor("#a781b5"), -16777216);
        this.cancelled = new DefaultColor(Color.parseColor("#b1b3b4"), -16777216);
        this.without_element = new DefaultColor(Color.parseColor("#b1b3b4"), -16777216);
        this.element_changed = new DefaultColor(Color.parseColor("#a781b5"), -16777216);
        this.shift = new DefaultColor(Color.parseColor("#a781b5"), -16777216);
        this.special_duty = new DefaultColor(Color.parseColor("#a781b5"), -16777216);
        this.exam = new DefaultColor(Color.parseColor("#ffed00"), -16777216);
        this.break_supervision = new DefaultColor(Color.parseColor("#ea6ea3"), -16777216);
        this.standby = new DefaultColor(Color.parseColor("#f49f25"), -16777216);
        this.office_hours = new DefaultColor(Color.parseColor("#f49f25"), -16777216);
        this.absence = new DefaultColor(Color.parseColor("#e53527"), -16777216);
        this.worktime = new DefaultColor(Color.parseColor("#a4fa9e"), -16777216);
    }
    
    public DefaultColor getAbsence() {
        return this.absence;
    }
    
    public DefaultColor getBooking() {
        return this.booking;
    }
    
    public DefaultColor getBookingLock() {
        return this.booking_lock;
    }
    
    public DefaultColor getBreakSupervision() {
        return this.break_supervision;
    }
    
    public DefaultColor getCancelled() {
        return this.cancelled;
    }
    
    public DefaultColor getConflict() {
        return this.conflict;
    }
    
    public DefaultColor getElementChanged() {
        return this.element_changed;
    }
    
    public DefaultColor getExam() {
        return this.exam;
    }
    
    public DefaultColor getFree() {
        return this.free;
    }
    
    public DefaultColor getHoliday() {
        return this.holiday;
    }
    
    public DefaultColor getHolidayLock() {
        return this.holiday_lock;
    }
    
    public DefaultColor getLesson() {
        return this.lesson;
    }
    
    public DefaultColor getOfficeHours() {
        return this.office_hours;
    }
    
    public DefaultColor getReservation() {
        return this.reservation;
    }
    
    public DefaultColor getShift() {
        return this.shift;
    }
    
    public DefaultColor getSpecialDuty() {
        return this.special_duty;
    }
    
    public DefaultColor getStandby() {
        return this.standby;
    }
    
    public DefaultColor getStorno() {
        return this.storno;
    }
    
    public DefaultColor getSubstitution() {
        return this.substitution;
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }
    
    public DefaultColor getWithoutElement() {
        return this.without_element;
    }
    
    public DefaultColor getWorktime() {
        return this.worktime;
    }
    
    public void setAbsence(final DefaultColor absence) {
        this.absence = absence;
    }
    
    public void setBooking(final DefaultColor booking) {
        this.booking = booking;
    }
    
    public void setBookingLock(final DefaultColor booking_lock) {
        this.booking_lock = booking_lock;
    }
    
    public void setBreakSupervision(final DefaultColor break_supervision) {
        this.break_supervision = break_supervision;
    }
    
    public void setCancelled(final DefaultColor cancelled) {
        this.cancelled = cancelled;
    }
    
    public void setConflict(final DefaultColor conflict) {
        this.conflict = conflict;
    }
    
    public void setElementChanged(final DefaultColor element_changed) {
        this.element_changed = element_changed;
    }
    
    public void setExam(final DefaultColor exam) {
        this.exam = exam;
    }
    
    public void setFree(final DefaultColor free) {
        this.free = free;
    }
    
    public void setHoliday(final DefaultColor holiday) {
        this.holiday = holiday;
    }
    
    public void setHolidayLock(final DefaultColor holiday_lock) {
        this.holiday_lock = holiday_lock;
    }
    
    public void setLesson(final DefaultColor lesson) {
        this.lesson = lesson;
    }
    
    public void setOfficeHours(final DefaultColor office_hours) {
        this.office_hours = office_hours;
    }
    
    public void setReservation(final DefaultColor reservation) {
        this.reservation = reservation;
    }
    
    public void setShift(final DefaultColor shift) {
        this.shift = shift;
    }
    
    public void setSpecialDuty(final DefaultColor special_duty) {
        this.special_duty = special_duty;
    }
    
    public void setStandby(final DefaultColor standby) {
        this.standby = standby;
    }
    
    public void setStorno(final DefaultColor storno) {
        this.storno = storno;
    }
    
    public void setSubstitution(final DefaultColor substitution) {
        this.substitution = substitution;
    }
    
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
    
    public void setWithoutElement(final DefaultColor without_element) {
        this.without_element = without_element;
    }
    
    public void setWorktime(final DefaultColor worktime) {
        this.worktime = worktime;
    }
    
    public static class DefaultColor
    {
        public int backColor;
        public int foreColor;
        
        public DefaultColor(final int backColor, final int foreColor) {
            this.backColor = backColor;
            this.foreColor = foreColor;
        }
    }
}
