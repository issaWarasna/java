/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarys;


/**
 *
 * @author Jessuse
 */
public class Magazien extends Book implements Display{
    private int issueNumber;
    private String releaseDate;
    private boolean onLoan;

    public Magazien(String Title, String Genre, String Version, int No, com.mycompany.librarys.date date, Auther auther) {
        super(Title, Genre, Version, No, date, auther);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    
    @Override
    public String getInfo() {
        return super.getInfo()+", issueNumber :"+issueNumber+", releaseDate :"+releaseDate ;
                
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
