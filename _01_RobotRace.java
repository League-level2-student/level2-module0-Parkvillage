package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
       public static void main(String[] args) {
    	   Robot[]robs= new Robot[5];
    
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
 for(int i=0;i<5;i++) {
	 robs[i]= new Robot();
 
		//4. make each robot start at the bottom of the screen, side by side, facing up
robs[i].setX(i*200+50);
robs[i].setY(500);
 }
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

Random r= new Random();
boolean b= false;
while(b==false) {


for (int j = 0; j < robs.length; j++) {
	if(robs[j].getY()<110) {
		b=true;
		System.out.println(j+ " is the winner");
	}
	int randomNum= r.nextInt(50);
	robs[j].move(randomNum);
	
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
    
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
}