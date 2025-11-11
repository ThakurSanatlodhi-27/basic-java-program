public class binarySearch {
    public static void searcharr(int arra[],int key){
        int start=0;
        int end=arra.length-1;
       
        
        while(start<=end){
            int mid=(start+end)/2;
           
            if(arra[mid]==key){
                System.out.print("element is found at index ("+mid+")");
                
                start=mid+1;
            }
            else if(arra[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }


    }
    public static void main(String args[]){
        int arra[]={1,8,25,27,31,34,39,42,45,51,69,75,84,96,110};
        int key=51;
        searcharr(arra,key);
        
    }
    
}
