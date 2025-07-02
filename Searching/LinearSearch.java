
class LinearSearch {
      public static String finalScore(String student_name,String[][] student_score){
            for(int i = 0 ; i < student_score.length; i++){
                if(student_score[i][0].equals(student_name)){
                    return student_score[i][1];
                }
                
            }
            return("Student not found");
      }      
            
    public static void main(String[] args) {
        String[][] student_score = {
            {"Alice","86"},
            {"Ritik","67"},
            {"Aditi","97"}
        };
        String student_name1 = "Aditi";
        System.out.println("score of " + student_name1 + " is " + finalScore(student_name1,student_score));
        
        
        String student_name2 = "Siddhi";
        System.out.println("score of " + student_name2 + " is " + finalScore(student_name2,student_score));
        
    }
      
      
            
        }
        
    
    



