import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog + 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend /= 2;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = boxer1 + boxer2;
        System.out.println("общий вес боксеров " + boxersWeight);
        System.out.println();
        System.out.println( boxer2 % boxer1);
        System.out.println();

        var totalHours = 640;
        var hourPerWorker = 8;
        var totalWorkers = totalHours / hourPerWorker;
        System.out.println(" Всего работников в компании - " + totalWorkers + "человек");
        System.out.println();
        totalHours = (totalWorkers + 94) * hourPerWorker;
        System.out.println(" Если в компании работает " + (totalWorkers +94) + " чееловека, то всего "
                + totalHours + " часов работы может быть поделено между сотрудниками");





    }


}