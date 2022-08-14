
public class patient implements Comparable<patient>{
    
    private String patientName;
    private String complaint;
    private Integer priority;

    public patient(String patientName, String complaint) {
        this.patientName = patientName;
        this.complaint = complaint;
        
        
        if(complaint.equals("Headache")){
            this.priority=4;
        }
        else if(complaint.equals("Cough")){
            this.priority=3;
        }
      
         else if(complaint.equals("Fever")){
            this.priority=2;
        }
         else if(complaint.equals("Poisoning")){
            this.priority=1;
        }
    }

    public String getPatientName() {
        return patientName;
    }

    public String getComplaint() {
        return complaint;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    
    
    @Override
    public int compareTo(patient o) {
        
        return this.getPriority().compareTo(o.getPriority());
    }

    @Override
    public String toString() {
        return  "Patient Name= " + patientName + "\nComplaint= " + complaint + "\nPriority= " + priority;
    }
    
    
    
    
}
