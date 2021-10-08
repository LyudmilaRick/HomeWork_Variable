public class Main2 {

        public static void main(String[] args) {
            // Home work for the lesson Variable
            // Задача 1. Инициализация
            byte   age         = 54;
            short  ageMonth    = 648;
            int    ageDays     = 19440;
            long   ageHours    = 4665560L;
            float  valueFamous = 3.141592f;
            double valueMore   = 3.1415926535;
            //  Задача 2.
            float  firstMan  = 78.2f;
            float  secondMan = 82.7f;
            System.out.println("Задача 2");
            System.out.println("Oбщий вес двух бойцов равен " + (firstMan + secondMan) );
            System.out.println("Разница между весами бойцов равна " + ( secondMan - firstMan ) );
            //  Задача 3.
            short  weightBanana  = 80;
            short  weightMilk    = 105;
            short  weightCream   = 100;
            short  weightEgg     = 70;
            int weightBreakfast  = weightBanana * 5 + weightMilk * 2 + weightCream * 2 + weightEgg * 4;
            float weightBreakfastKg = weightBreakfast;
            weightBreakfastKg = weightBreakfastKg / 1000;
            System.out.println("Задача 3");
            System.out.println("Спорт-завтрак " + weightBreakfast + " грамм");
            System.out.println("Спорт-завтрак " + weightBreakfastKg + " килограмм");
            //  Задача 4.
            System.out.println("Задача 4");
            int   kgOverWeight = 7;
            short transferUnit = 1000;
            short firstVariant = 250;
            short secondVariant = 500;
            float overWeight = transferUnit * kgOverWeight;
            float dayFirstVariant  = overWeight / firstVariant;
            float daySecondVariant = overWeight / secondVariant;
            float thirdVariant = ( dayFirstVariant + daySecondVariant ) / 2;
            float dayThirdVariant  = overWeight / thirdVariant;
            System.out.println("Пессимистичный срок похудения " + dayFirstVariant + " дней");
            System.out.println("Оптимистичный срок похудения "  + daySecondVariant + " дней");
            System.out.println("Средний срок похудения "        + thirdVariant + " дней");
            //  Задача 5.
            System.out.println("Задача 5");
            int oldSalaryMary = 67760;
            int oldSalaryDen  = 83690;
            int oldSalaryKris  = 76230;
            float newSalaryMary = oldSalaryMary * 110;
            newSalaryMary = newSalaryMary / 100;
            float newSalaryDen  = oldSalaryDen * 110;
            newSalaryDen  = newSalaryDen / 100;
            float newSalaryKris = oldSalaryKris * 110;
            newSalaryKris = newSalaryKris / 100;
            System.out.println("Маша теперь получает " + newSalaryMary +  "рублей");
            System.out.println("Годовой доход вырос на " + (newSalaryMary  - oldSalaryMary ) * 12 +  "рублей");
            System.out.println("Денис теперь получает " + newSalaryDen +  "рублей");
            System.out.println("Годовой доход вырос на " + (newSalaryDen  - oldSalaryDen ) * 12 +  "рублей");
            System.out.println("Кртистина теперь получает " + newSalaryKris +  "рублей");
            System.out.println("Годовой доход вырос на " + (newSalaryKris  - oldSalaryKris ) * 12 +  "рублей");
            //  Задача 6.
            System.out.println("Задача 6");
            byte a = 12;
            byte b = 27;
            byte c = 44;
            byte d = 15;
            byte e = 9;
            byte minus = -1;
            int result  = a * (b + (c - d * e ) );
            result  = minus * result;
            System.out.println("Инвертированный результат " + result );
            //  Задача 7.
            System.out.println("Задача 7");
            int aa = 5;
            int bb = 7;
            System.out.println("До расчета а =  " + aa );
            System.out.println("До расчета b =  " + bb );
            aa =  bb - aa;
            bb =  bb - aa;
            aa =  aa + bb;
            System.out.println("После расчета а =  " + aa );
            System.out.println("После расчета b =  " + bb );
            //  Задача 8.
            System.out.println("Задача 8");
            int aaa = 789;
            int bbb;
            // уберу единицы
            int WithOutlastDigit = aaa / 10;
            // число сотен
            int OnlyFirstDigit   = aaa / 100;
            int Middledigit      = WithOutlastDigit - OnlyFirstDigit * 10;
            System.out.println("Трехзначное число "  + aaa);
            System.out.println("Цифра посередине "   + Middledigit);
        }
    }
