import java.util.Scanner;
public class TrappingWater{
    public static void TrappedWater(int height[]){
        int n=height.length;
        // calculate left Max Boundary -- Array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // calculate Right Max Boundary -- Array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        // Loop
        int trappedWater=0;
        for (int i = 0; i < n; i++) {
            // calculate Water Level
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
        // // calculate Trapped Water
        trappedWater +=waterLevel-height[i];

        }
        System.out.println("Toatal Trapped Water = " +trappedWater );
    }

    public static void main(String[]args){
    int height[]={4,2,0,6,3,2,5};
    TrappedWater(height);
    }
}