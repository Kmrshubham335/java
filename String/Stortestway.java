package String;
//Shortest path 
public class Stortestway {
    public static void main(String[] args) {
     String path="NS";
    float res =Shortestway(path);
    System.out.println(res);
    }

    public static  float Shortestway(String path2) {
        int x=0 ,y=0;
        for(int i=0;i<path2.length();i++){
            char dir =path2.charAt(i);  //taking each letter from every index and matching with the path
            
            //South direction
            if(dir=='S' || dir =='s'){
                y--;
            }
            //North
            else if(dir == 'N' || dir == 'n'){
                y++;
            }
            //East
            else if(dir == 'E' || dir =='e'){
                x++;
            }
            //West
            else if(dir == 'W' || dir =='w' ){
                x--;
            }
        }
        int x2=x*x;
        int y2 =y*y;

        return (float)Math.sqrt(x2+y2);
    }
}
