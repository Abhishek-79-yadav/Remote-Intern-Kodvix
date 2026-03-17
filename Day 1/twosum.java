class twosum{
//    Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
public static void main(String[] args) {
    int []l1={2,4,3};
    int []l2={5,6,4};
    int []result=new int[l1.length]; 
    for(int i=l1.length-1;i>=0;i--){
        result[i]=l1[i]+l2[i];   //7 10 7
        int sum=result[i];      //7 10 7
        if(sum>9){    //10 10 7
            result[i]=sum%10;  
            if(i-1>=0){        
                l1[i-1]=l1[i-1]+sum/10; 
            }
        }
             System.out.print(result[i]); 
            //  int s=0;
            // int d=result[i]%10;  //708%10  8
            // s=s*10+d; //8 80 807

            // int t=result[i]/10;  //0 1 0
            // // s=s+t; //8 81 807
            // System.out.print(s);

    }
}

}