public class Feeder{
  private int currentFood;

  public Feeder(int cF){
    currentFood=cF;
  }

  public void simulateOneDay(int numBirds){
    int day= (int)(Math.random()*(100))+1;

    if (day<=95){
    int ate= (int)(Math.random()*41)+10;

        if(ate*numBirds>currentFood){
          currentFood=0;
        }else{
          currentFood-=ate*numBirds;
        }
      
    }else{
      currentFood=0;
    }
  }

  public int simulateManyDays(int numBirds, int numDays){
    if(currentFood==0){
      return 0;
    }
    for (int i=0; i<numDays; i++){
      simulateOneDay(numBirds);
      if(currentFood==0){
        return i+1;
      }
      
    }
    return numDays;
  }

  public int getFood() {
    return currentFood;
  }
}
