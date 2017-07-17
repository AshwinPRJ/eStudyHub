package com.excelit.estudyhub.utils;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.hibernate.SessionFactory;

public class EStudyHubUtill {
	private  SessionFactory sessionFactory;
	/**
     * This method is used for Logger.
     * 
     * @param
     * @return
     */
	
	public static void rakshaNidhiLogger(String str) {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(java.util.logging.Level.ALL);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(java.util.logging.Level.ALL);
		handler.setFormatter(new SimpleFormatter());
		logger.addHandler(handler);
		logger.info(str);
	}
	/**
     * This method is for adding new line
     * 
     * @return line separator
     */
	public static String newLine() {
        return System.getProperty("line.separator");
    }
	/**
     * This method is used to check whether the string is null or not.
     * 
     * @param string
     * @return
     */
	public static boolean isNullString(String string) {
        boolean isNullString = true;
        if (string != null && !"".equals(string.trim())) {
            isNullString = false;
        }
        return isNullString;
    }
	/**
     * Method returns the trimmed string
     * 
     * @param stringValue
     * @return
     */
	public static String trim(String stringValueInp) {
        String stringValue = stringValueInp;
        if (!isNullString(stringValue)) {
            stringValue = stringValue.trim();
        }
        return stringValue;
    }
	/**
     * This method is used to check whether an object is null or not.
     * 
     * @param obj
     * @return
     */
	public static boolean isNull(Object obj) {
        return null == obj ? true : false;
    }
	/**
     * This method is used to check whether a list is null or not.
     * 
     * @param list
     * @return
     */
    @SuppressWarnings("unchecked")
    public static boolean isNullList(Object obj) {
        boolean isNullList = true;
        if (obj != null) {
            if (obj instanceof List) {
                List<Object> list = (List<Object>) obj;
                isNullList = (list.isEmpty() || list.size() < 1);
            }
        }
        return isNullList;
    }
    /**
     * Method returns the upper case string
     * 
     * @param stringValue
     * @return
     */
    public static String toUpper(String stringValueInp) {
        String stringValue = stringValueInp;
        if (!isNullString(stringValue)) {
            stringValue = trim(stringValue).toUpperCase();
        }
        return stringValue;
    }
    /**
     * Return time difference in mins
     * 
     * @param timeA
     * @param timeB
     * @return
     */
    public static int getDifferenceBwnTimeInMins(Timestamp timeA,
            Timestamp timeB) {
        long diff = timeA.getTime() - timeB.getTime();
        int min = (int) (diff / (60 * 1000));
        return min;
    }
    /**
     * This method is used to get the difference in time stamps in days
     * 
     * @param timeA
     * @param timeB
     * @return
     */
    public static int getDifferenceBwnTimestampsInDays(Timestamp timeA,
            Timestamp timeB) {
        long diff = timeA.getTime() - timeB.getTime();
        if((diff / (24 * 60 * 60 * 1000)) > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else{
            if((diff / (24 * 60 * 60 * 1000)) < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            } else{
                return (int)(diff / (24 * 60 * 60 * 1000));
            }
        }
    }

    /**
     * This method is used to get the current day of the week.
     * 
     * @param date
     * @return
     */
    public static int getDayOfWeek(java.util.Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = 0;

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.MONDAY:
            day = Calendar.MONDAY;
            break;
        case Calendar.TUESDAY:
            day = Calendar.TUESDAY;
            break;
        case Calendar.WEDNESDAY:
            day = Calendar.WEDNESDAY;
            break;
        case Calendar.THURSDAY:
            day = Calendar.THURSDAY;
            break;
        case Calendar.FRIDAY:
            day = Calendar.FRIDAY;
            break;
        case Calendar.SATURDAY:
            day = Calendar.SATURDAY;
            break;
        case Calendar.SUNDAY:
            day = Calendar.SUNDAY;
            break;
        default:
            break;
        }
        return day;
    }
    

       
}
