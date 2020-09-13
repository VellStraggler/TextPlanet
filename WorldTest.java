public class WorldTest{
  public static void main(String[] args) throws InterruptedException{
    String[][] map = mapstore();
    String[][] stars = starstore();
    int time = 0;
    while(true){
      world(map,stars,time);
      Thread.sleep(400);
      time++;
    }
  }
  public static void world(String[][] map,String[][] stars,int time){
    int stime = time/2;
    for(int r = 0;r<23;r++){
      for(int x = 0;x<78;x++){
        if(r>5&&r<17){
          if((r==6||r==16)&&x>33&&x<45){
            System.out.print(map[(x-29+time)%44][r-6]);}
          else if((r==7||r==15)&&x>30&&x<48){
            System.out.print(map[(x-29+time)%44][r-6]);}
          else if((r==8||r==14)&&x>29&&x<49){
            System.out.print(map[(x-29+time)%44][r-6]);}
          else if((r>8&&r<14)&&x>28&&x<50){
            System.out.print(map[(x-29+time)%44][r-6]);}
          else{System.out.print(stars[((144-(x+66-(stime%144)))/144)*143+x+66-stime%144][r]);}}
        else{System.out.print(stars[((144-(x+66-(stime%144)))/144)*143+x+66-stime%144][r]);}//Issue here, stars jump at 65
      }System.out.println();}}
    //System.out.println("𝗧𝗘𝗫𝗧𝗘𝗥𝗥𝗔");
    //System.out.println("press any key...");
  public static String[][] starstore(){
    String raw = "                            ✦                                                                                                                            .                                    .                                  ✦                     .                    ★                                                     .                                 .                     ✦                                                 .                  ✦                                                                                                                                                            ✸                      ✦                       .                  ✦                                  .                                                                                                                               ★                                 ★                   .                   ✦                . ✦                 .                                              ✦                                           ✦                             ✦                                     ✦     .                                                                                              ✦         ✦                                                  ✸                                  .             ★                     .      ★        .                                                                                                     .                                            ★                       ✦     ★                                                  ✦              ✦                               ✦      ✦                                                                      ✦                                                                                              .                                      .                               ✦                                ✦                                              ✸                                                            .                                                                                                                                                         .                                           .                                                                                                               ✦                                      ✦                         ✦             ★                                                                                                                           .                                               .      ✦                                       .         ★                                                  .                                                                                                                                   ✦                                                                         ✸                                                      .                                              ✦                            .                                                                                                                                                                 ★                       .                                          ✸                                                                ";
    String[][] stars = new String[144][23];
    for(int r = 0;r<23;r++){//█▓░
      for(int x = 0;x<144;x++){
        stars[x][r] = raw.substring(r*144+x,r*144+x+1);
      }}return stars;}
  public static String[][] mapstore(){
    String raw = "████████████████████░░░░████████████████████████░░░░██████████░░░░██░█████████████████████████░███████████████░█████░░░████░███████████████░░█████████████████░░░░███░░░░███████████░░░░░░███████░█████████░░░░░░░░░███░███████░░░░░░░░████████░████████░░░░░░░████░███████░░░░█░░██████░█░░██████████░░░░░░████████████░░░██████████░░█░█████████░░░░░░░░████████████░░████████████████████████░░░████████████████░████████████████████░░░░░██████░█████████████████████████████████████░██████████";
    String[][] map = new String[44][11];
    for(int r = 0;r<11;r++){
      for(int x = 0;x<44;x++){
        map[x][r] = raw.substring(r*44+x,r*44+x+1);
      }}return map;}}
