import org.code.neighborhood.*;
// Free Schlep!
public class NeighborhoodRunner {
  public static void main(String[] args) {
    
//Instantiates and calls the method(s). Just makes sure both painters have enough paint for the job
BackgroundPainter BillyBob = new BackgroundPainter();
SchlepPainter Schlep = new SchlepPainter();
    Schlep.setPaint(99);
    BillyBob.setPaint(999);
    BillyBob.paintEverything("#F06E46");//used chatGpt, we did not learn hex colors and I needed a specific color


    //Paints Schlep's eyes and mouth
    Schlep.setPaint(1000);
    Schlep.paintSchlep("black");


System.out.println("Context:");
System.out.println("I'm sure you're aware of today's news that Roblox has been recieving an insane amount of backlash by it's community.");
System.out.println("Roblox is a site for kids and all ages alike, however there has been many cases of pedophilia.");
System.out.println("Schlep, films content of exposing those people and has legally worked with law enforcement to catch some of them.");
System.out.println("However roblox responded to that by banning him permanently from the platform thus sparking rage within the community.");
System.out.println("Roblox claims that people should be reporting those people to them instead of the police,");
System.out.println("Schlep has numerously told them that he has, but to no avail from roblox support. ");
System.out.println("This raises the question, is roblox more fixated on money than it's playerbase?");
System.out.println("#FreeSchlep");
  }
}
