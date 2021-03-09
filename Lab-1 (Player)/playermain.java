import java.util.*;
class player
{
	int id;
    String name;
    int no_matches_played;
	int scores;
	
	player()
	{
		id=1000;
        name="Levi";
		no_matches_played=5;
        scores=240;
	}
	
	void setdata()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Input player details");
		System.out.println("Enter name of the player");
		name=s1.next();
		System.out.println("Enter id of the player");
		id=s1.nextInt();
		System.out.println("Enter no of matches of the player");
		no_matches_played=s1.nextInt();
		System.out.println("Enter the score");
		scores=s1.nextInt();	
		
	}

    player calc(player p1,player p2){
        
        
        if((p1.scores/p1.no_matches_played) > (p2.scores/p2.no_matches_played))
            return p1;
        else
            return p2;
    }
	void printdata()
	{
		System.out.println("Player with higher avg is Name = "  + name + " "  + " ID = " + " "  + id + " " + " Scores = " + scores + " " + "No of matches= " + no_matches_played);
	}
	
	
	

}
class playermain
{
	public static void main(String argX[])
	{
		Scanner s = new Scanner(System.in);
		player p1=new player();
		player p2=new player();
        player p3=new player();
        
		
		p1.setdata();
		p2.setdata();
		
		p3=p3.calc(p1,p2);
		p3.printdata();
		
	}
}
