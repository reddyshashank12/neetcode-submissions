
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trap(int arr[]) { 
        
      int n = arr.length;
      if(n<=2){
          return 0;
      }
      int []leftBound = new int[n];
      int []rightBound = new int[n];
      
      //Calculate left side Boundry
      
     leftBound[0]=arr[0];
      for(int i = 1;i<n;i++){
      
      leftBound[i] =Math.max(leftBound[i-1],arr[i]);
      
    } 
    
     //Calculate right side Boundry
      
     rightBound[n-1]=arr[n-1];
      for(int i = n-2;i>=0;i--){
      
      rightBound[i] =Math.max(rightBound[i+1],arr[i]);
      
    }
    
    //Calculate water level
    int trapWater = 0;
    
    for(int i = 0;i<n-1;i++){
        
        int waterLevel = Math.min(leftBound[i],rightBound[i]);
        
       int    water = waterLevel - arr[i];
        
        // if(water<0){
        //     water = 0;
        // }
        trapWater +=water;
    }
    return trapWater;
}
}
