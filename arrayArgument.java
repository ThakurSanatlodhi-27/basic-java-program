
public class arrayArgument {
    public static void update(int marks[],int nonchange){
         nonchange=10;
        for(int i=0;i<marks.length;i++){
            marks[i]+=2;
        }

    }
    public static void main(String args[]){
        int marks[]={54,85,74,63,94,52};
        int nonchange=5;
        System.out.println(nonchange);
        update(marks,nonchange);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            //array call by refrance hota h and simple variable call by value hota h;
        }
    }
    
}
