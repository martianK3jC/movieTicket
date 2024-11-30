package com.application.movieticket;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicketController {

    @FXML
    private Label dateShowingLabel1;

    @FXML
    private Label dateShowingLabel2;

    @FXML
    private Label movieTitleLabel;

    @FXML
    private ImageView qrCodeImage;

    @FXML
    private Label seatNameLabel1;

    @FXML
    private Label seatNameLabel2;

    @FXML
    private Label theaterNumLabel1;

    @FXML
    private Label theaterNumLabel2;

    @FXML
    private Label ticketIdNum1;

    @FXML
    private Label ticketIdNum2;

    public void initialize() {
        TicketData ticketData = TicketData.getInstance();


        String imagePath = getClass().getResource("/AppIcons/qrCodeSample.png").toExternalForm();
        Image qrCodeImage = new Image(imagePath);
        this.qrCodeImage.setImage(qrCodeImage);


        //SAMPLE DATA
        ticketData.setTheaterNum("2");
        ticketData.setTicketIdNum("01235254");
        ticketData.setMovieTitle("Wild Robot");
        ticketData.setSeatName("D1");
        ticketData.setDateShowing("2024/11/29");


        theaterNumLabel1.setText(ticketData.getTheaterNum());
        theaterNumLabel2.setText(ticketData.getTheaterNum());
        ticketIdNum1.setText(ticketData.getTicketIdNum());
        ticketIdNum2.setText(ticketData.getTicketIdNum());
        movieTitleLabel.setText(ticketData.getMovieTitle());
        seatNameLabel1.setText(ticketData.getSeatName());
        seatNameLabel2.setText(ticketData.getSeatName());
        dateShowingLabel1.setText(ticketData.getDateShowing());
        dateShowingLabel2.setText(ticketData.getDateShowing());
    }



}
