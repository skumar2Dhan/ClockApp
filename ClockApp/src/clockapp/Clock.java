/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;

/**
 *
 * @author user
 */
public class Clock {
    private int hours;
    private int minutes;
    
    public Clock(){
        hours = 24;
        minutes = 0;
    }
    public Clock(int hours){
        this.hours=hours;
        minutes=0;
    }
    public Clock(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public Clock(Clock other){
        this.hours = other.hours;
        this.minutes = other.minutes;
    }
    public String toString(){
        if (hours>24 || hours<0){
            return "This time does not exist";
        }
        if (minutes<0 || minutes>59){
              return "This time does not exist";
            }
        if (hours == 24){
            if (minutes<10){
              return (hours-12) + ":" + "0" + minutes + "AM";
            }
            else {
              return (hours-12) + ":" + minutes + "AM";
            }
        }
        if (hours == 12){
            if (minutes<10){
              return hours + ":" + "0" + minutes + "PM";
            }
            else {
              return hours + ":" + minutes + "PM";
            }
        }
        if (hours>12){
            if (minutes<10){
              return (hours-12) + ":" + "0" + minutes + "PM";
            }
            else {
              return (hours-12) + ":" + minutes + "PM";
            }
        }
        else {
            if (minutes<10){
              return hours + ":" + "0" + minutes + "AM";
            }
            else {
              return hours + ":" + minutes + "AM";
            }
        }
    }
    int getHours(){return hours;}
    int getMinutes(){return minutes;}
    
    void setHours(int hours){this.hours=hours;}
    void setMinutes(int minutes){this.minutes=minutes;}

    public void addTo(int hours,int minutes){
        this.hours+=hours;
        if (this.hours>24){
            this.hours=this.hours-24;
        }
        this.minutes+=minutes;
        if (this.minutes>59){
            this.minutes=this.minutes-60;
            this.hours=this.hours+1;
            if (this.hours>24){
                this.hours=this.hours-24;
            }
        }            
    }
    public void subtractFrom(int hours, int minutes){
        this.hours-=hours;
        if (this.hours<=0){
            this.hours=this.hours+24;
        }
        this.minutes-=minutes;
        if (this.minutes<0){
            this.minutes=this.minutes+60;
            this.hours=this.hours-1;
            if (this.hours<=0){
                this.hours=this.hours+24;
            }
        }
    }
}








