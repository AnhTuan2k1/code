import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] array = {
            88, 126, -45, 189, 105, 11, -22, 56, 133, 91, 
            -49, 54, 72, 160, -8, 101, 42, 180, 197, 88, 
            54, 188, 123, -38, -7, 167, 50, 137, 26, 184, 
            90, 18, 70, 132, 64, 58, -13, 17, 199, 101, 
            92, 141, 113, 98, 186, 5, 140, 152, 7, 156, 
            89, 33, 138, 191, 26, 87, 32, 121, -31, 129, 
            6, 91, 46, 139, 65, -34, 198, 99, 74, 145, 
            76, 168, 52, 105, -29, 176, 47, 73, -9, 132, 
            111, 150, 19, -48, -11, 142, 98, 26, 3, -5, 
            188, 32, 95, -41, -4, 120, 153, 180, 123, 88
        };
        int[][] matrix = {
            {88, 126, -45, 189, 105, 11},
            {-49, 54, 72, 160, -8, 101},
            {54, 188, 123, -38, -7, 167}
        };


        System.out.println("Hello"); 
        System.out.println(Sum15(3));
        System.out.println(Tich10(3, 3));
        System.out.println(Sum40(3, 3));
        System.out.println(FindMax90(15));
        System.out.println(ReadNumber105(20));
        DrawTriangle111(5);
        Function120(15);
        System.out.println(CountPrime120(array));
        System.out.println(FindFirstValueWithOdd165(array));
        System.out.println(FindMinOddValue(array));
        System.out.println(FindMaxEvenValue169(array));
        System.out.println(CountDecreasingArray300(array));
        System.out.println(CountPrimes335(matrix));
        System.out.println(SumEvenRecursive704(array, 0));
    }

    //1.
    public static float Sum1(int n){
        float s = 0;
        while (n > 0) {
            s += n;
            n--;
        }
        return s;
    }

    //2.
    public static float Sum2(int n){
        float s = 0;
        while (n > 0) {
            s += n*n;
            n--;
        }
        return s;
    }

    //3.
    public static float Sum3(int n){
        float s = 0;
        while (n > 0) {
            s += 1/n;
            n--;
        }
        return s;
    }

    //4.
    public static float Sum4(int n){
        float s = 0;
        while (n > 0) {
            s += 1/(2*n);
            n--;
        }
        return s;
    }

    //5. 
    public static float Sum5(int n){
        float s = 0;
        while (n >= 0) {
            s += 1.0f/(2*n+1);
            n--;
        }
        return s;
    }

    //6.
    public static float Sum6(int n){
        float s = 0;
        while (n > 0) {
            s += 1/(n * (n+1));
            n--;
        }
        return s;
    }

    //7.
    public static float Sum7(int n){
        float s = 0;
        while (n > 0) {
            s += n/(n+1);
            n--;
        }
        return s;
    }

    //8.
    public static float Sum8(int n){
        float s = 0;
        while (n > 0) {
            s += (2*n+1)/(2*n+2);
            n--;
        }
        return s;
    }

    //9.
    public static float Sum9(int n){
        if(n>1) return n * Sum9(n-1);
        else return n;
    }

    //10. Tính T(x, n) = x^n
    public static float Tich10(int x, int n){
        int s = 1;
        if(n==0) return 1;
        while (n > 0) {
            s *= x;
            n--;
        }
        return s;
    }

    //11.
    public static float Sum11(int n){
        float s = 0;
        float p = 1;
        for (int i = 1; i <= n; i++) {
            p = p*i;
            s = s + p;
        }

        return s;
    }

    //12.
    public static float Sum12(int n, int x){
        float s = 0;
        float p = 1;
        for (int i = 1; i <= n; i++) {
            p = p*x;
            s = s + p;
        }

        return s;
    }

    //13.
    public static float Sum13(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Tich10(x, 2*i);
        }

        return s;
    }

    //14.
    public static float Sum14(int n, int x){
        float s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + Tich10(x, 2*i + 1);
        }

        return s;
    }

    //15
    public static float Sum15(int n){
        float s = 0;
        
        for(int i = 1, denominator = 1; i<=n; i++, denominator+=i)
        {
            s += 1.0f/denominator;
        }

        return s;
    }

    //16
    public static float Sum16(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Tich10(x, i)/Sum1(i);
        }

        return s;
    }

    //17
    public static float Sum17(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Tich10(x, i)/Sum9(i);
        }

        return s;
    }   

    //18
    public static float Sum18(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Tich10(x, 2*i)/Sum9(2*i);
        }

        return s;
    }

    //19
    public static float Sum19(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Tich10(x, 2*i + 1)/Sum9(2*i + 1);
        }

        return s;
    } 

    //20. Liệt kê tất cả “ước số” của số nguyên dương n.
    public static void Divisor20(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    //21.
    public static float SumDivisor21(int n){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                s+=i;
            }
        }

        return s;
    }

    //22.
    public static float ProductDivisor22(int n){
        float s = 1;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                s*=i;
            }
        }

        return s;
    }

    //23.
    public static float CountDivisor23(int n){
        float count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
               count++;
            }
        }

        return count;
    }

    //24.
    public static void OddDivisor24(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0 && i%2 == 1){
                System.out.println(i);
            }
        }
    }

    //25. Tính tổng tất cả “ước số chẵn” của số nguyên dương n.
    public static float SumEvenDivisor25(int n){
        float s = 0;
        for (int i = 2; i <= n; i+=2) {
            if(n%i==0 && i%2 == 0){
               s+=i;
            }
        }
        return s;
    }

    //26. Tính tích tất cả “ước số lẻ" của số nguyên dương n.
    public static float ProductOddDivisor26(int n){
        float s = 1;
        for (int i = 2; i < n; i+=2) {
            if(n%i==0 && i%2 == 1){
               s*=i;
            }
        }
        return s;
    }

    //27. Đếm số lượng “ước số chẵn” của số nguyên dương n.
    public static float CountEvenDivisor27(int n){
        float count = 0;
        for (int i = 2; i <= n; i+=2) {
            if(n%i==0 && i%2 == 0){
                count++;
            }
        }
        return count;
    }

    //30. Cho số nguyên dương n. Kiểm tra số dương n có phải là số hoàn thiện hay không?
    public static boolean IsPerfect30(int n){
        int sumDivisor = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sumDivisor += i;
            }
        }

        return sumDivisor == n;
    }

    //35. Tính S(n) = √1 + √2 + √3 + ⋯ √n − 1 + √n có n dấu căn.
    public static double Sum35(int n){
        double s = 0;
        while (n > 0) {
            s = Math.sqrt(n + s);
            n--;
        }
        return s;
    }

    //40. Tính S(n) = √x
    public static double Sum40(int n, int x){
        double s = 0;
        for (int i = 1, power = x; i <= n; i++, power*=x) {
            s = Math.sqrt(power + s);
        }
        return s;
    }

    //90. Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + 3 + ... + m < N.
    public static int FindMax90(int n){
        int s = 0;
        int m = 1;
        for (; m < n; m++) {
            s += m;
            if(s>=n) return m-1;
        }

        return 0;
    }

    //100.Viết chương trình giải phương trình bậc 2.
    public static void giaiPhuongTrinhBacHai100(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("không có nghiệm.");
        }
    }

    //105.Viết chương trình nhập một số nguyên có hai chữ số. Hãy in ra cách đọc của số nguyên này.
    public static String ReadNumber105(int n){
        String[] chuc = {"", "mười ", "hai mươi ", "ba mươi ", "bốn mươi ", "năm mươi ", "sáu mươi ", "bảy mươi ", "tám mươi ", "chín mươi "};
        String[] donvi = {"", "mốt ", "hai ", "ba ", "bốn ", "năm ", "sáu ", "bảy ", "tám ", "chín "};
        return chuc[n/10] + donvi[n%10];
    }

    //111. Viết chương trình in ra tam giác cân có độ cao h.
    public static void DrawTriangle111(int height){
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    //120. Liệt kê tất cả các số chính phương nhỏ hơn n.
    public static void Function120(int n){
        for (int i = 1; i < n / 2 + 1; i++) {
            if(i*i < n) System.out.print(i + " ");
        }
        System.out.println();
    }

    //125.Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng.
    public static int CountPrime120(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num) && num < 100) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //135.Tìm “giá trị dương đầu tiên” trong mảng một chiều (duongdau). Nếu mảng không có giá trị dương thì trả về giá trị -1.
    public static int FindFirstPositiveValue135(int[] array) {
        for (int num : array) {
            if (num > 0) {
                return num;
            }
        }
        return -1;
    }

    //140.
    public static int FindMinPositiveValue140(int[] array) {
        int minPositive = 99999; 
        boolean foundPositive = false;

        for (int num : array) {
            if (num > 0 && num < minPositive) {
                minPositive = num;
                foundPositive = true;
            }
        }

        return foundPositive?minPositive:-1;
    }

    //145. 
    public static int FindFirstPerfectNumber145(int[] array) {
        for (int num : array) {
            if (IsPerfect30(num)) {
                return num;
            }
        }
        return -1;
    }

    //150. 
    public static int FindMaxNegativeValue150(int[] array) {
        int maxNegative = -99999;

        for (int num : array) {
            if (num < 0 && num > maxNegative) {
                maxNegative = num;
            }
        }

        return maxNegative == -99999 ? 0 : maxNegative;
    }

    //165. 
    static int FindFirstValueWithOdd165(int[] array) {
        for (int num : array) {
            if (FirstNumOdd(num)) return num;
        }
        return 0; 
    }
    public static boolean FirstNumOdd(int number) {
        int firstNum = Math.abs(number);

        while (firstNum >= 10) {
            firstNum /= 10;
        }

        return (firstNum % 2 != 0);
    }

    //169. 
    public static int FindMaxEvenValue169(int[] array) {
        int maxPositive = -99999;
        int minOddvalue = FindMinOddValue(array);

        for (int num : array) {
            if (num %2 == 0 && num > maxPositive && num < minOddvalue) {
                maxPositive = num;
            }
        }

        return maxPositive == -99999 ? -99999 : maxPositive;
    }
    public static int FindMinOddValue(int[] array) {
        int minOddvalue = 99998;

        for (int num : array) {
            if (num %2 == 1 && num < minOddvalue) {
                minOddvalue = num;
            }
        }

        return minOddvalue == 99998 ? 99998 : minOddvalue;
    }

    //170. 
    public static int[] FindClosest170(int[] array) {
        Arrays.sort(array);

        int minDistance = Integer.MAX_VALUE;
        int[] closest = {0, 0};

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i+1]);
            if (distance < minDistance) {
                minDistance = distance;
                closest[0] = array[i];
                closest[1] = array[i + 1];
            }
        }

        return closest;
    }

    //300.Đếm số lượng mảng con giảm trong mảng một chiều
    public static int CountDecreasingArray300(int[] array) {
        int count = 0;
        boolean canCount = true;
        for (int i = 0; i < array.length - 1; i++) {
            if( canCount && array[i] > array[i+1]){
                count++;
                canCount = false;
            }
            else if(array[i] < array[i+1]) canCount = true;
        }

        return count;
    }
    
    //320.Tính tổng các số dương trong ma trận
    public static int SumPositive320(int[][] matrix) {
        int s = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > 0)  s += num;
            }
        }
        return s;
    }

    //321.Tính tích các giá trị lẻ trong ma trận
    public static int ProductOdd321(int[][] matrix) {
        int p = 1;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 != 0) {
                    p *= num;
                }
            }
        }
        return p;
    }

    //335.Đếm số lượng số nguyên tố trong ma trận các số nguyên.
    public static int CountPrimes335(int[][] matrix) {
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (isPrime(num)) {
                    count++;
                }
            }
        }

        return count;
    }

    //350.Kiểm tra ma trận có tồn tại số lẻ hay không.
    public static boolean ExistOdd350(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 1) return true;
            }
        }

        return false;
    }

    //351.Kiểm tra ma trận có toàn dương hay không.
    public static boolean AllPositive351(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) return false;
            }
        }

        return true;
    }

    //704.Cho mảng một chiều các số nguyên. Viết hàm tính tổng các số chẵn trong mảng bằng phương pháp đệ qui.
    public static int SumEvenRecursive704(int[] array, int index) {
        if (index >= array.length)  return 0;

        int currentNumber = array[index];
        if (currentNumber % 2 == 0) {
            return currentNumber + SumEvenRecursive704(array, index + 1);
        } 
        else return SumEvenRecursive704(array, index + 1);
    }

    //725
    static boolean AllNegative725(int[] array, int index) {
        if (index >= array.length) return true;

        if (array[index] >= 0)  return false;

        return AllNegative725(array, index + 1);
    }

}

