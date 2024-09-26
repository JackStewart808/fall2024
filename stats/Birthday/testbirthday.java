package stats.Birthday;

class testbirthday
{
    public static void main(String[] args)
    {
        Birthday testBirthday = new Birthday();

        System.out.println(testBirthday.getProbabilityOfSharedBirthday(100_000, 10) + " Success rate at class size " + 10);
        System.out.println(testBirthday.getProbabilityOfSharedBirthday(100_000, 20) + " Success rate at class size " + 20);
        System.out.println(testBirthday.getProbabilityOfSharedBirthday(100_000, 25) + " Success rate at class size " + 25);
        System.out.println(testBirthday.getProbabilityOfSharedBirthday(100_000, 30) + " Success rate at class size " + 30);
    }
}