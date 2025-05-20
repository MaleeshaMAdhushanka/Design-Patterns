package Client;

import facade.HomeTheater;
import facade.HomeTheaterFacade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HomeTheater homeTheater =  new HomeTheaterFacade();
        System.out.println("Preparing to watch movie...");

        homeTheater.watchMovie("hello");

        System.out.println();

        System.out.println("Stopping ......");
        homeTheater.stopMovie();
    }
}