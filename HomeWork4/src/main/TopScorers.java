package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class pLAYER {
    String NAME;
    int THESCORE;

    public pLAYER(String NAME, int SCORE) {

        this.NAME = NAME;
        this.THESCORE = SCORE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getTHESCORE() {
        return THESCORE;
    }

    public void setTHESCORE(int THESCORE) {
        this.THESCORE = THESCORE;
    }

    /*Comparator for sorting the list by roll no*/
    public static Comparator<pLAYER> StuRollno = new Comparator<pLAYER>() {

        public int compare(pLAYER p1, pLAYER p2) {
            // to go down
            int score1=p1.getTHESCORE();
            int score2=p2.getTHESCORE();
            // to go upp
            return score2-score1;

        }};

}

public class TopScorers {

    static ArrayList<pLAYER> SCORELIST =new ArrayList<pLAYER>();
    String fileName;

    public TopScorers(String fileName) {
        this.fileName = fileName;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the file Name :");
        String fileName=sc.next();

        TopScorers topScore=new TopScorers(fileName);

        File file1 = new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/");

        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        String st1;
        String name = null, temp;
        int count=1;

        while ((st1 = br1.readLine()) != null) {
            if(count%2!=0) {
                name=st1;
                count++;
            }
            else {
                temp=st1;
                int score=Integer.parseInt(temp);
                pLAYER player=new pLAYER(name, score);
                SCORELIST.add(player);
                count=1;
            }
        }
        Collections.sort(SCORELIST, pLAYER.StuRollno);
        System.out.println("------------All Players Info---------");
        for(pLAYER player: SCORELIST) {
            System.out.println("Name: "+player.getNAME()+", Score: "+player.getTHESCORE());
        }
        System.out.println(":::::::::::::::::::::::::::");
        int scor=playerScore("Messi");
        System.out.println("-----------Top five Name------------");
        String[] topNames=getTopNames();
        for(int i=0; i<topNames.length; i++) {
            System.out.println("Name: "+topNames[i]);
        }
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("-----------Top five Score------------");
        int[] topScor=getTopScores();
        for(int i=0; i<topScor.length; i++) {
            System.out.println("Score: "+topScor[i]);
        }
        ArrayList<pLAYER> TOPSCORELIST= GETTOPFIVE();
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("-----------Top five Player------------");
        for(pLAYER PLAYER: TOPSCORELIST) {
            System.out.println("Name: "+PLAYER.getNAME()+", Score: "+PLAYER.getTHESCORE());
        }
        // write into file
        topFiveToFile();
    }


    private static void topFiveToFile() throws IOException {

        FileWriter fw=new FileWriter("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/");
        int count=0;
        for(pLAYER player: SCORELIST) {
            fw.write(player.getNAME());
            fw.write(player.getTHESCORE());
            count++;
            if(count==5) {
                break;
            }
        }

        fw.close();
    }


    private static int[] getTopScores() {
        int[] topScore=new int[5];
        int count=0;
        for(pLAYER player: SCORELIST) {
            topScore[count]=player.getTHESCORE();
            count++;
            if(count==5) {
                break;
            }
        }
        return topScore;
    }


    private static String[] getTopNames() {
        String[] TOPNAMES=new String[5];
        int count=0;
        for(pLAYER player: SCORELIST) {
            TOPNAMES[count]=player.getNAME();
            count++;
            if(count==5) {
                break;
            }
        }
        return TOPNAMES;
    }


    private static ArrayList<pLAYER> GETTOPFIVE() {
        ArrayList<pLAYER> scoreTop=new ArrayList<pLAYER>();
        int count=0;
        for(pLAYER player: SCORELIST) {
            scoreTop.add(player);
            count++;
            if(count==5) {
                break;
            }
        }
        return scoreTop;
    }


    private static int playerScore(String name) {
        int score=0;
        for(pLAYER player: SCORELIST) {
            if(player.getNAME().equalsIgnoreCase(name)) {
                score=player.getTHESCORE();
            }
        }
        return score;
    }

}