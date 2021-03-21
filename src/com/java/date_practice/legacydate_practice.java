package com.java.date_practice;
//https://www.edureka.co/blog/date-format-in-java/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class legacydate_practice {

    public static void main(String args[])
    {


        //DateFormat

        //Initializing the date formatter
        DateFormat Datee = DateFormat.getDateInstance();
//Initializing Calender Object
        Calendar cals = Calendar.getInstance();
//Displaying the actual date
        System.out.println("The original Date: " + cals.getTime());
//Using format() method for conversion
        String currentDate = Datee.format(cals.getTime());
        System.out.println("Formatted Date: " + currentDate);



        //SimpleDateFormat

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate= DateFor.format(date);
        System.out.println(stringDate);



        //String to Date Converson
        try{
            Date dater = DateFor.parse("08/07/2019");
            System.out.println("Date : "+dater);
        }catch (ParseException e) {e.printStackTrace();}


        //Date To String

        String stringDatee= DateFor.format(date);
        System.out.println(stringDatee);

    }
}

