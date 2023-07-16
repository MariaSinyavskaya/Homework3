public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int applesWeight = 1000;
        byte grapeWeight = 3;
        short bananasWeight = 150;
        long square = 1000000000L;
        float sugarWeight = 5.45f;
        double goldWeight = 31.00983;
        System.out.println("Значение переменной applesWeight с типом int равно " + applesWeight);
        System.out.println("Значение переменной grapeWeight с типом byte равно " + grapeWeight);
        System.out.println("Значение переменной bananasWeight с типом short равно " + bananasWeight);
        System.out.println("Значение переменной square с типом long равно " + square);
        System.out.println("Значение переменной sugarWeight с типом float равно " + sugarWeight);
        System.out.println("Значение переменной goldWeight с типом double равно " + goldWeight);
    }
    public static void task2() {
        System.out.println("Задача 2:");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задача 3:");
        byte lyudmilaPavlovna = 23;
        byte annaSergeyevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int studentsNumber = lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna;
        int studentPaper = totalPaper / studentsNumber;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4:");
        byte machinePerformance = 16;
        int twentyMinutes = machinePerformance * 20 / 2;
        int oneDay = machinePerformance * 24 * 60 / 2;
        int threeDays = oneDay * 3;
        int oneMonth = oneDay * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5:");
        byte cansNumber = 120;
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        int classNumber = cansNumber / (whiteOneClass + brownOneClass);
        int whiteCansNumber = classNumber * whiteOneClass;
        int brownCansNumber = classNumber * brownOneClass;
        System.out.println("В школе, где " + classNumber + " классов, нужно " + whiteCansNumber + " банок белой краски и " + brownCansNumber + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6:");
        byte bananasAmount = 5;
        byte oneBananaWeight = 80;
        short milkAmount = 200;
        byte milkWeightOnePortion = 105;
        byte iceCreamAmount = 2;
        byte iceCreamOnePortion = 100;
        byte eggsAmount = 4;
        byte oneEggWeight = 70;
        float gramsNumber = bananasAmount * oneBananaWeight + (milkAmount * milkWeightOnePortion / 100) + iceCreamAmount * iceCreamOnePortion + eggsAmount * oneEggWeight;
        float kilogramsNumber = gramsNumber / 1000;
        System.out.println("Вес составляет " + gramsNumber + " грамм или " + kilogramsNumber + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7:");
        byte loseWeight = 7;
        short variantA = 250;
        short variantB = 500;
        int loseTwoHundredFifty = loseWeight * 1000 / variantA;
        int loseFiveHundred = loseWeight * 1000 / variantB;
        int average = (loseTwoHundredFifty + loseFiveHundred) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + loseTwoHundredFifty + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + loseFiveHundred + " дней");
        System.out.println("В среднем ему потребуется " + average + " день");
    }
    public static void task8() {
        System.out.println("Задача 8:");
        int currentSalaryMasha = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryKristina = 76230;
        int increasedSalaryMasha = currentSalaryMasha + currentSalaryMasha * 10 / 100;
        int increasedSalaryDenis = currentSalaryDenis + currentSalaryDenis * 10 / 100;
        int increasedSalaryKristina = currentSalaryKristina + currentSalaryKristina * 10 / 100;
        int incomeDiffMasha = (increasedSalaryMasha - currentSalaryMasha) * 12;
        int incomeDiffDenis = (increasedSalaryDenis - currentSalaryDenis) * 12;
        int incomeDiffKristina = (increasedSalaryKristina - currentSalaryKristina) * 12;
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + incomeDiffMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + incomeDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + incomeDiffKristina + " рублей");
    }
}
