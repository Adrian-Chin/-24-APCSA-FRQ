public class Scoreboard {
  private String team1;
  private String team2;
  private int points1;
  private int points2;
  private boolean active1;
  private boolean active2;

  public Scoreboard(String n1, String n2){
    team1= n1;
    team2=n2;
    points1=0;
    points2=0;
    active1= true;
    active2= false;
  }

  public String getScore(){
    if(active1){
    return points1 + "-" + points2 + "-" + team1;
    }else{
    return points1 + "-" + points2 + "-" + team2;
    }
  }

  public void recordPlay(int score){
    if (score>0 && active1){
      points1+=score;
    }else if(score>0 && active2){
      points2+=score;
    }else if(score==0 && active1){
      active1=false;
      active2=true;
    }else if(score==0 && active2){
      active1=true;
      active2=false;
    }
  }
}
