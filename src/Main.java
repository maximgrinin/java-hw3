public class Main {
    public static void main(String[] args) {
        // ClassWork();

        // Level1:
        // В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
        // Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?
        long populationChina = 1_411_778_724L;
        int countryCounter = 197;
        long populationTotal = populationChina * countryCounter;
        System.out.printf("На Земле жило бы %,d человек\n", populationTotal);

        // Level2:
        // Феликс прожил 3_011_456_567 секунд.
        // Сколько лет прожил Феликс?
        // Посчитать, используя Java, Long-переменные и деление.
        long ttlInSeconds = 3_011_456_567L;

        // В минуты, в часы, в дни, в годы (в одной секунде - 1/31_536_000 года)
        double ttlInYears = (double) ttlInSeconds / 60 / 60 / 24 / 365;
        System.out.printf("Феликс прожил %.0f лет (без учета високосных годов) и еще %.0f месяцев\n",
                ttlInYears, Math.floor(ttlInYears % 1 * 12));



        // Level1:
        // Астерикс и Обеликс варили зелье.
        // Зелье будет сварено правильно, если его будут варить больше 5 часов.
        // Астерикс варил его 3 часа, Обеликс в два раза меньше.
        // Получится ли у них сварить зелье?
        // true - если получится, иначе false
        double neededCookTime = 5;
        double currentCookTime;

        currentCookTime = 3;                    // Вариал Астерикс
        currentCookTime += currentCookTime / 2; // Доваривал Обеликс

        if (currentCookTime > neededCookTime) {
            System.out.println("Получится сварить зелье");
        } else {
            System.out.println("Не получится сварить зелье :(");
        }
    }

    public static void ClassWork() {

        // Вася получает зарплату в 5.6 евро в час. Он работает 12 часов в день,
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в году.
        // Ему дали отпуск в течение двух недель, он оплачивается в 50% от зп, пересчитайте зарплату за год
        double annualSalary;
        double perHour = 5.6;
        int hoursPerDay = 12;
        int daysPerYear = 364;
        int vacationPeriod = 14;

        annualSalary = perHour * hoursPerDay * (daysPerYear - vacationPeriod);
        annualSalary += perHour / 2 * hoursPerDay * vacationPeriod;

        System.out.printf("Годовая зарплата Васи: %.2f\n", annualSalary);

        // Мама дала Васе 1000 рублей, у него осталось 1000 рублей после похода в магазин.
        // Узнать, купил ли что-то Вася. Если купил - выводим true.
        // Если не купил - выводим false.
        double givenMoney = 1000;
        double restMoney = 1000;
        if (restMoney < givenMoney) {
            System.out.println("Купил");
        } else {
            System.out.println("Не купил");
        }

        // Петя имеет средний балл 3.49. Он очень хочет пятерку за четверть.
        // Он уверен, что сможет улучить средний балл на +1 (Подсказка: будет 4.49).
        // Получит ли он 5? true - если да, false - если нет.
        double avgGrade = 3.49;
        double wishGrade = avgGrade + 1;

        if (wishGrade >= 4.5) {
            System.out.println("Получит");
        } else {
            System.out.println("Не получит");
        }
        if (Math.round(wishGrade) == 5) {
            System.out.println("Получит");
        } else {
            System.out.println("Не получит");
        }
    }
}