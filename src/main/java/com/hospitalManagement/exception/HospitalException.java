package com.hospitalManagement.exception;

public class HospitalException extends Exception{
    public  HospitalException(String message){
        super(message);
    }
    public HospitalException(String message, Throwable cause){
        super(message,cause);
    }
    public HospitalException(){
        super();
    }
    public HospitalException(Throwable cause){
        super(cause);
    }
}
