import java.time.LocalDate;
import java.time.LocalTime;

public class dateTime {
  public static void main(String[] args) {
    LocalDate date=LocalDate.now(); 
    LocalTime time=LocalTime.now(); 
    System.out.println("Date : "+date); 
    System.out.println("Time : "+time); 
  }
}