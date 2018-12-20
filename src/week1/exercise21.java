package week1;

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        System.out.println("What is the last episode number you watched");
        Scanner scanner = new Scanner(System.in);
        Double episode = scanner.nextDouble();

        Double season2 = (episode%12)*Math.floor(episode/12)+(12*Math.floor(episode/24));

        Double season1 = episode-season2;
        Double season2minutes = season2*34;
        Double season1minutes = season1*47;
        Double totalMinutes = season1minutes + season2minutes;
        Double hours = totalMinutes/60;
        hours = Math.floor(hours);
        Double minutes = totalMinutes%60;
        String message = "You have watched a total of" ;
        message = message + hours + " hours and " + minutes + " minutes (";
        message = message + totalMinutes + ")";
        System.out.println(message);



    }
}

