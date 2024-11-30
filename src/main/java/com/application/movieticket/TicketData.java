package com.application.movieticket;

public class TicketData {
    private static TicketData instance;

    private String theaterNum;
    private String seatName;
    private String ticketIdNum;
    private String movieTitle;
    private String dateShowing;

    private TicketData(){}

    public static TicketData getInstance(){
        if(instance == null){
            instance = new TicketData();
        }
        return instance;
    }

    //Getters and Setters
    public String getTheaterNum() {
        return theaterNum;
    }

    public void setTheaterNum(String theaterNum) {
        this.theaterNum = theaterNum;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public String getTicketIdNum() {
        return ticketIdNum;
    }

    public void setTicketIdNum(String ticketIdNum) {
        this.ticketIdNum = ticketIdNum;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDateShowing() {
        return dateShowing;
    }

    public void setDateShowing(String dateShowing) {
        this.dateShowing = dateShowing;
    }

}

