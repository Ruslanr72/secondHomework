package ru.skypro;

public class Main {

    public static void main(String[] args) {
      // ЗАДАЧА 1
        byte a = 1;
        short b =1;
        int c = 1;
        long d = 1;
        float g = 1;
        double g2 = 1;
        char a1 = 1;
        boolean a2 = true;

        // ЗАДАЧА 2
        float weight1 = 78.2f;
                float weight2 = 82.7f;
                float fullWeight = weight1 + weight2;
        System.out.println("Obshiy ves 2h boxerov = " + fullWeight + " kg");
        //Общий вес боксеров, пишу на английском, т.к. мне при выводе на консоль русские буквы показываются вопросиками.
        float weightDifference = weight2 - weight1;
        System.out.println("Raznica v vese = " + weightDifference + " kg");

        //ЗАДАЧА 3
        byte bananas = 5;
        short milk = 200;
        byte iceСream = 2;
        byte eggs = 4;
        int breakfastInGrams = (bananas * 80) + (milk / 100 * 105) + (iceСream * 100) + (eggs * 70);
        System.out.println("Final breakfast in grams is = " + breakfastInGrams + " gr");
        float breakfastInKilogram = breakfastInGrams / 1000f;
        System.out.println("Breakfast in kilogram is = " + breakfastInKilogram + " kg");

        //ЗАДАЧА 4
        short FinalLoseWeight = 7000;
        short FirstLoseWeight = 250;
        short SecondLoseWeight = 500;
        int DaysToLoseWeight1 = FinalLoseWeight / FirstLoseWeight;
        int DaysToLoseWeight2 = FinalLoseWeight / SecondLoseWeight;
        System.out.println("First lose weight diet will take = " + DaysToLoseWeight1 + " days");
        System.out.println("Second lose weight diet will take = " + DaysToLoseWeight2 + " days");

        // ЗАДАЧА 5
        int MariasSalaryBeforeRise = 67760;
        int DenisSalaryBeforeRise = 83690;
        int KristinasSalaryBeforeRise = 76230;


        int MariasPrize = (MariasSalaryBeforeRise / 100) * 10;// Премия Марии 10%
        int MariasSalaryAfterRise = (MariasSalaryBeforeRise + MariasPrize);//ЗП Марии с премией
        int MariasAnnualIncome = (MariasSalaryBeforeRise + MariasPrize) * 12; //Годовой доход Марии с учетом ежемесячной премии
        int MariasPastAnnualIncome = (MariasSalaryBeforeRise * 12);//Прошлый годовой доход Марии
        int MariasAnnualIncomeDifference = (MariasAnnualIncome - MariasPastAnnualIncome);//Разниа годового дохода Марии

        int DenisPrize = (DenisSalaryBeforeRise / 100) * 10;// Премия Дениса 10%
       int DenisSalaryAfterRise = (DenisSalaryBeforeRise + DenisPrize);//ЗП Дениса с премией
        int DenisAnnualIncome = (DenisSalaryBeforeRise + DenisPrize) * 12; // Годовой доход Дениса с учетом премии
       int DenisPastAnnualIncome = (DenisSalaryBeforeRise * 12);// Прошлый годовой доход Дениса
       int DenisAnnualIncomeDifference = (DenisAnnualIncome - DenisPastAnnualIncome); //Разница годового дохода Дениса

        int KristinasPrize = (KristinasSalaryBeforeRise / 100) * 10;//Премия Кристины 10%
        int KristinasSalaryAfterRise = (KristinasSalaryBeforeRise + KristinasPrize);//ЗП Кристины с премией
        int KristinasAnnualIncome = (KristinasSalaryBeforeRise + KristinasPrize) * 12; //Годовой доход Кристины с учетом ежемесячной премии.
       int KristinasPastAnnualIncome = (KristinasSalaryBeforeRise * 12);//Прошлый годовой доход Кристины
       int KristinasAnnualIncomeDifference = (KristinasAnnualIncome - KristinasPastAnnualIncome);//Разниа годового дохода Кристины.
        System.out.println("Marias salary after rise = " + MariasSalaryAfterRise + " rubbles. " + " Annual income rise to = " + MariasAnnualIncomeDifference + " rubbles.");
        System.out.println("Denis salary after rise = " + DenisSalaryAfterRise + " rubbles. " + " Annual income rise to = " + DenisAnnualIncomeDifference + " rubbles.");
        System.out.println("Kristinas salary after rise = " + KristinasSalaryAfterRise + " rubbles. " + "Annual income rise to = " + KristinasAnnualIncomeDifference + " rubbles."); //Задача пятая, возможно намудрил, но в конце проще все складывать и перемножать, чтобы не запутаться.






    }
}
