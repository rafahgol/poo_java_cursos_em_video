package aula7;


public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
        l[0]= new Lutador("Pretty Boy", "França",31, 
                            1.75f, 11, 2, 1, 68.9f);
        l[1]= new Lutador("Putscript", "Brasil", 29, 1.68f, 
                                14, 2, 3, 57.8f);
        l[2]=new Lutador("Snapshadow", "EUA", 35, 1.65f, 12, 2, 1,80.9f);
        l[3]=new Lutador("Dead Code", "Austrália", 28, 1.93f, 13, 0, 2, 81.3f);
        l[4]=new Lutador("UFOCobol", "Brasil", 37, 1.70f, 5, 4, 3, 119.3f);
        l[5]=new Lutador("Nerdaart", "EUA", 30, 1.81f, 12, 2, 4, 105.7f);


        l[0].ganharLuta();
        l[0].status();
    }
}
