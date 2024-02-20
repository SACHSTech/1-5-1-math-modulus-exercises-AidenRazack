
class Km_to_Miles extends ConsoleProgram {

  /**
    * A program that lets you enter a distance in kilometers and that converts it into miles
    * @author: A. Razack
    */
    
    public void run() {
      
      // Variables
      double dblDistaneceKm;
      double dblDistaneceM;

      // Assigning
      dblDistaneceKm = readDouble("How many KM: ");

      // Calculations
      dblDistaneceM = dblDistaneceKm *  0.621371;

      // Outputs
      System.out.println(dblDistaneceKm+" km is "+ dblDistaneceM +" miles");
      
    }
  }