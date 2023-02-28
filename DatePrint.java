import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar; 


public class DatePrint{
    private Date date;
    private Calendar calendar; 
    private SimpleDateFormat format; 
    private int daysToPrint; 

    //Takes in an int and prints how every date from now until that many
    //days into the future 
    public DatePrint(int daysToPrint){
        calendar = Calendar.getInstance(); 
        date = new Date(); 
        date = calendar.getTime(); 
        this.daysToPrint = daysToPrint; 
        
        for(int i = 0; i < daysToPrint; i++){
            printDate(); 
            calendar.add(Calendar.DATE, 1);
            date = calendar.getTime(); 
        }
        
    }

    public void printDate(){
        format = new SimpleDateFormat("MM-dd-yyyy");

        String dateToPrint = format.format(date);
        System.out.println(dateToPrint);
    }



public static void main(String[] args){
  //Prints today to 500 days in the future 
    new DatePrint(500); 
    
}

}
