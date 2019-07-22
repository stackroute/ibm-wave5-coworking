package com.stackroute.kafka.domain;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Booking {

    @Id
    private int bookingId;
    private boolean status;
    private MyUser myUser;
    Date startDate;
    Date endDate;

    public Booking() {
    }

    public Booking(int bookingId, boolean status, MyUser myUser, Date startDate, Date endDate) {
        this.bookingId = bookingId;
        this.status = status;
        this.myUser = myUser;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }



    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", status=" + status +
                ", myUser=" + myUser +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

