
import java.util.PriorityQueue;
import java.util.Queue;

/**
  *Program that puts patients in a row according to their priorities using PriorityQueue.
  * 
  *Muhammed Serhan Genis
  *14.08.2022
  *
*/
public class Main {
    
    
    public static void main(String[] args) {
        Queue<patient> p=new PriorityQueue<patient>();
        
        p.offer(new patient("Ahmet", "Fever"));
        p.offer(new patient("Mehmet", "Headache"));
        p.offer(new patient("Veli", "Poisoning"));
        p.offer(new patient("Ayse", "Cough"));
        p.offer(new patient("Melda", "Headache"));
        p.offer(new patient("Yuksel", "Fever"));
        p.offer(new patient("Serhan", "Headache"));
        p.offer(new patient("Mert", "Poisoning"));
        p.offer(new patient("Yigit", "Fever"));
        p.offer(new patient("Zeynep", "Cough"));
        
        int patientNumber=1;
        while(!p.isEmpty()){
            
            System.out.println(patientNumber+". Row");
            System.out.println(p.poll());
            System.out.println();
            patientNumber++;
        }
    }
}
