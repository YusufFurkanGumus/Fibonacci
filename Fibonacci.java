import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Kullanıcıdan eleman sayısını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scanner.nextInt(); // n Fibonacci eleman sayısını al

        // İlk iki eleman
        int first = 0, second = 1;

        // Fibonacci serisini yazdır
        System.out.print("Fibonacci Serisi: ");

        // Eğer n 1 ise sadece 0 yazdır
        if (n >= 1) {
            System.out.print(first + " ");
        }

        // Eğer n 2 veya daha büyükse, ilk iki elemanı yazdır ve devam et
        if (n >= 2) {
            System.out.print(second + " ");
        }

        // 3. elemandan başlayarak Fibonacci dizisini oluştur
        for (int i = 3; i <= n; i++) {
            int next = first + second; // Fibonacci'nin yeni elemanı
            System.out.print(next + " ");

            // İlk ve ikinci elemanları bir adım ilerlet
            first = second;
            second = next;
        }

        // Scanner nesnesini kapat
        scanner.close();
    }
}
