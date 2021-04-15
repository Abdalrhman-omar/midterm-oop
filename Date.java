/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author 202011847
 */
public class Date {
    int day, month , year;
    int [] class_a={1,3,5,7,8,10,12 };
    int [] class_b={4,6,11,9};
    
    public Date(int day ,int month ,int year){
        if (checkday( day, month)==true){
        this.day=day;
        }
       if (checkmonth(  month)==true){
        this.month=month;
        }
        if (checkyear(  year)==true){
        this.year=year;
        }
    
        
        
        
    }
    public void setday( int day){
    this.day=day;
    }
    public void setmonth( int month){
    this.month=month;
    }
    public void setyear( int year){
    this.year=year;
    }
    public int getday(){
    return day;
    }
     public int getmonth(){
    return month;
    }
      public int getyear(){
    return year;
    }
    public boolean checkday(int day , int month ){
        if (day >=32&&day <=27){
        System.out.print("uncorrect value  ");
        }
        if (day >=1&& day <=31){
           return true;
    }
        if (day ==31 ){
            for (int i =0; i<=class_a.length;i++){
                if (class_a[i]==month){
                    return true ;
                }
                else {
                     System.out.println("uncorect value");
                return false;}
            }
            
            }
        if (day ==28 ||day ==29 &&month==2){
        return true ;}
        
        if (day ==30 ){
            for (int i =0; i<=class_b.length;i++){
                if (class_b[i]==month){
                    return true ;
                }
                else {
                  
                     System.out.println("uncorect value");
                return false;}
            }
            
            }
        
        
        
        
        
    return false;}
        public boolean checkmonth(int month){
            if (month <=12&& month>=1){
                return true;
                
            }
            else{
                 System.out.println("uncorect value");
                return false;
            }
            
            
        
        }
        public boolean checkyear(int year){
        if (year >=1900&&year <=2100){
            
        return true;
        }
        else {
            System.out.println("uncorect value");
        return false;
        
        }
        
        
        }
        
        
        

        
        
    }

    
    

