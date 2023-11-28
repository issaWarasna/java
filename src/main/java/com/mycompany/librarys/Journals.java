/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarys;

/**
 *
 * @author Jessuse
 */
public class Journals extends Book implements Display {
    private String conferenceName;
    private int conferenceNumber;
    private boolean onLoan;

    public Journals(String Title, String Genre, String Version, int No, com.mycompany.librarys.date date, Auther auther) {
        super(Title, Genre, Version, No, date, auther);
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }

    public void setConferenceNumber(int conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }
    
    

    @Override
    public String getInfo() {
        return super.getInfo()+"conferenceName"+conferenceName+"conferenceNumber"+conferenceNumber ;
                
                }
    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    // Method to check if the book with given bookId is on loan
    
    @Override
    public boolean inLoan(int No) {
        return (this.No == No && onLoan);
    }
}
