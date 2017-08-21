import java.util.*;
class Circle
{
   public static void main(String[] args)
   {
       int r;
	   float area,peri;
	   final float pi=3.14f;
	   Scanner S = new Scanner(System.in);
	   System.out.print("Enter Radius:");
	   r=S.nextInt();
	   area = pi*r*r;
	   peri=2*pi*r;
       System.out.println("Area="+area+"\t Perimeter="+peri);
    }
}