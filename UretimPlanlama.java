
import java.util.*;

public class UretimPlanlama {

    public static void main(String[] args) {
        // ornek veri: 4 iş
        int[][] islemSuresi = {
            {9, 2, 7},
            {6, 4, 3},
            {5, 8, 1},
            {7, 6, 9}
        };
        // 3 makine
        int[][] gecisMaliyeti = {
            {0, 3, 2},
            {3, 0, 1},
            {2, 1, 0}
        };

        int sonuc = minimumToplamSureyiBul(islemSuresi, gecisMaliyeti);
        System.out.println("Minimum toplam uretim suresi: " + sonuc);
    }

    public static int minimumToplamSureyiBul(int[][] islemSuresi, int[][] gecisMaliyeti) {
        int isSayisi = islemSuresi.length; // iş sayısı
        int makineSayisi = islemSuresi[0].length; // makine sayısı

        int[][] dp = new int[isSayisi][makineSayisi];

        // ilk iş için işlem süresi başlangıç olarak alınır
        for (int j = 0; j < makineSayisi; j++) {
            dp[0][j] = islemSuresi[0][j];
        }

        // dinamik Programlama ile minimum süre hesaplama
        for (int i = 1; i < isSayisi; i++) {
            for (int j = 0; j < makineSayisi; j++) {
                int minMaliyet = Integer.MAX_VALUE;
                for (int k = 0; k < makineSayisi; k++) {
                    int maliyet = dp[i - 1][k] + gecisMaliyeti[k][j];
                    minMaliyet = Math.min(minMaliyet, maliyet);
                }
                dp[i][j] = islemSuresi[i][j] + minMaliyet;
            }
        }

        // son iş için minimum süreyi bul
        int minimumSonuc = Arrays.stream(dp[isSayisi - 1]).min().getAsInt();

        return minimumSonuc;
    }
}
