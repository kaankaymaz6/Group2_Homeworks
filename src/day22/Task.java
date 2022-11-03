package day22;

public class Task {
    public static void main(String[] args) {
        String[] data = {"Ahmet", "Fizik", "Sengul", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji", "Cengiz", "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};
        System.out.println("Adi \t Bölümü");
        for (int i = 0; i < data.length; i = i + 2) {
            System.out.println(data[i] + " \t " + data[i + 1]);
        }
    }
}