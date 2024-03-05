// Student.java
 public class Student { 
    private String studentID;
    private String studentName;
    private String[] extraActivities;
    // Constructor 
    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName; 
        this.extraActivities = new String[numExtraActivities];
    } // AddExtraActivity method 
    public void addExtraActivity(int index, String activity) { 
        if (index >= 0 && index < extraActivities.length) { 
            extraActivities[index] = activity;
        } 
        else { System.out.println("Invalid index for adding activity."); 
        } 
        } // toString method @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append(", Name: ").append(studentName).append(", Extra Activities: [");
        for (int i = 0; i < extraActivities.length; i++) {
            if (extraActivities[i] != null) { 
                sb.append(extraActivities[i]); 
                    if (i < extraActivities.length - 1) { 
                        sb.append(", "); 
                    }
            } 
        }
                sb.append("]"); 
                return sb.toString();
    } // Getters and setters
    public String getStudentID() {
        return studentID;
    } 
    public void setStudentID(String studentID) { 
        this.studentID = studentID;
    } 
    public String getStudentName() { 
        return studentName;
    }
    public void setStudentName(String studentName) { 
        this.studentName = studentName;
    } 
    public String[] getExtraActivities() {
        return extraActivities;
    } 
    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    } 
}