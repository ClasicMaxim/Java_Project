public class Information {
    public static void OutputSystem() {
        // vars
        String XboxPristavkaOff, XboxPristavkaOn, dataCPUandchips, dataCPUandchipsAllReady;
        String Questions, Very, End;
        XboxPristavkaOff = "Выключен Xbox";
        XboxPristavkaOn = "Включен Xbox";
        dataCPUandchips = "Дата данные загружается";
        dataCPUandchipsAllReady = "Дата данные загруженны";
        Questions = "Когда?";
        Very = "Понял, всё хорошо!";
        End = "Я заершаю";

        // loding
        LoadingJava Loding = new LoadingJava();
        Information info = new Information();
        // out
        System.out.println(XboxPristavkaOff);
        System.out.println(Questions);
        Loding.JavaLoding();
        System.out.println(dataCPUandchips);
        Loding.JavaLoding();
        System.out.println(XboxPristavkaOn);
        System.out.println(Questions);
        Loding.JavaLoding_2_5000();
        System.out.println(dataCPUandchipsAllReady);
        Loding.JavaLoding();
        System.out.println(Very);
        Loding.JavaLoding_2_5000();
        System.out.println(End);
    }
}
