public class Task3 {

    public static void firstAndLastSimbolsToString(String string) {
        System.out.println("Первая буква предложения: " + string.charAt(0));
        System.out.println("Последняя буква предложения: " + string.charAt(string.length() - 1));
    }

    public static void countSimbolsWithoutSpace(String string) {
        String replaceStr = string.replace(" ", "");
        int countSimbols = replaceStr.length();
        System.out.println("Количество символов (без пробелов) " + countSimbols);
    }

    public static void reverseStr(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        System.out.println("Перевернутое предложение " + stringBuilder);
    }

    public static void countUpperAndLowerCase(String string) {
        int countUpper = 0;
        int countLower = 0;
        char[] charString = string.toCharArray();
        for (char el : charString) {
            if (Character.isLetter(el)) {
                if (el == Character.toLowerCase(el)) {
                    countLower++;
                } else {
                    countUpper++;
                }
            }
        }
        System.out.println("Кол-во букв предложения в верхнем регистре " + countUpper);
        System.out.println("Кол-во букв предложения в нижнем регистре " + countLower);

    }

    public static void countWords(String string) {
        String[] arr = string.trim().split(" +");
        int arrLength = arr.length;
        System.out.println("Количество слов в предложении: " + arrLength);
    }

    public static void infoString(String string) {
        countUpperAndLowerCase(string);
        countSimbolsWithoutSpace(string);
        countWords(string);
        firstAndLastSimbolsToString(string);
        reverseStr(string);
    }

    public static void main(String[] args) {
        String string = "Hello world";

        infoString(string);
    }
}

//Программа должна выводить следующую информацию о предложении:
//•	Кол-во букв предложения в верхнем регистре.
//•	Кол-во букв предложения в нижнем регистре.
//•	Количество символов (без пробелов).
//•	Количество слов в предложении.
//•	Первую и последнюю букву предложения.
//•	Перевернутое предложение.