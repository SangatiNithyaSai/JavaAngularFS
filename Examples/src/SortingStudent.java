 class StudentDetails{
    private int id;
    private String name;
    StudentDetails(int id,String name){
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @Override
     public String toString() {
         return "StudentDetails{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
class SortStudentArray{  //StudentSorterUtility can be used
    public  StudentDetails[] sortingById(StudentDetails[] student){
        StudentDetails swap;
        for(int i=0;i<student.length-1;i++){
            for(int j=0;j<student.length-i-1;j++){
            if(student[j].getId()>student[j+1].getId()) {
                swap = student[j];
                student[j] = student[j + 1];
                student[j + 1] = swap;
            }
            }
        }
        return student;
    }
    public  StudentDetails[] sortingByName(StudentDetails[] student){
        StudentDetails swap;
        for(int i=0;i<student.length-1;i++){
            for(int j=0;j<student.length-i-1;j++){
               int comparison= student[j].getName().compareTo(student[j+1].getName());
                if(comparison>0) {
                    swap = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = swap;
                }
            }
        }
        return student;
    }
    public  StudentDetails[] sortingByIdAndName(StudentDetails[] student){
        StudentDetails swap;
        for(int i=0;i<student.length-1;i++){
            for(int j=0;j<student.length-i-1;j++){
                int comparison= student[j].getName().compareTo(student[j+1].getName());
                if(comparison>0 && student[j].getId()>student[j+1].getId()) {
                    swap = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = swap;
                }
            }
        }
        return student;
    }

}

public class SortingStudent {
    public static void main(String[] args){
        StudentDetails[] student=new StudentDetails[4];

        student[0]=new StudentDetails(101,"raj");
        student[1]=new StudentDetails(101,"rahim");
        student[2]=new StudentDetails(101,"kiran");
        student[3]=new StudentDetails(114,"tom");
        SortStudentArray sortObj1=new SortStudentArray();
        StudentDetails[] studentSortedById=sortObj1.sortingById(student);

        StudentDetails[] studentSortedByName=sortObj1.sortingByName(student);
        StudentDetails[] studentSortedByIdAndName=sortObj1.sortingByIdAndName(student);

        System.out.println("Sorted by Id");
        for(int i=0;i<student.length;i++){
            System.out.println(studentSortedById[i]);
        }
        System.out.println("\n"+"Sorted by Name");
        for(int i=0;i<student.length;i++){
            System.out.println(studentSortedByName[i]);
        }

        System.out.println("\n"+"Sorted by Id AND Name");
        for(int i=0;i<student.length;i++){
            System.out.println(studentSortedByIdAndName[i]);
        }



    }
}
