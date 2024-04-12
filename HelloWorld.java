import java.util.ArrayList;
import java.util.Arrays;
import java.util.PrimitiveIterator;

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
        System.out.println(FindMaxDivisorValue171(new int[] {8 , 12, 32}));
        System.out.println(IncreaseNum60(15570));
        System.out.println(CountNum43(2101));
        System.out.println(SumNum44(2101));
        System.out.println(ProductNum45(2101));
        System.out.println(CountOddNum46(2101));
        System.out.println(Power10(3, 3));
        System.out.println(Sum40(3, 3));
        System.out.println(IsPrime31(2));
        System.out.println(ReadNumber105(20));
        DrawTriangle111(5);
        Function120(15);
        System.out.println(AveragePrimeValue211(array));
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
    public static float Factorial9(int n){
        if(n>1) return n * Factorial9(n-1);
        else return n;
    }

    //10. Tính T(x, n) = x^n
    public static float Power10(int x, int n){
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
            s = s + Power10(x, 2*i);
        }

        return s;
    }

    //14.
    public static float Sum14(int n, int x){
        float s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + Power10(x, 2*i + 1);
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
            s = s + Power10(x, i)/Sum1(i);
        }

        return s;
    }

    //17
    public static float Sum17(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Power10(x, i)/Factorial9(i);
        }

        return s;
    }   

    //18
    public static float Sum18(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Power10(x, 2*i)/Factorial9(2*i);
        }

        return s;
    }

    //19
    public static float Sum19(int n, int x){
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + Power10(x, 2*i + 1)/Factorial9(2*i + 1);
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
        for (int i = 1; i < n; i+=2) {
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

    //28. Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó.
    public static float SumDivisor28(int n){
        float sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    //29. Tìm ước số lẻ lớn nhất của số nguyên dương n.
    public static float FindMaxOddDivisor29(int n){
        for (int i = n; i < n; i--) {
            if(n%i==0 && i%2 == 1){
                return i;
            }
        }
        return 1;
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

    //31. Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số nguyên tố hay không?
    public static boolean IsPrime31(int n){
        if(n<2) return false;

        for (int i = 2; i < n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    //32. Cho số nguyên dương n. Kiểm tra số nguyên dương n có phải là số chính phương hay không?
    public static boolean IsPerfectsquare32(int n){
        for (int i = 2; i < n/2+1; i++) {
            if(i*i==n) return true;
        }
        return false;
    }

    //33
    public static double Sum33(int n){
        double s = 0;
        while (n > 0) {
            s += Math.sqrt(2);
            n--;
        }
        return s;
    }

    //34. 
    public static float Sum34(int n){
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = Math.sqrt(s + i);
        }

        return (float) s;
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

    //36. 
    public static float Sum36(int n){
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = Math.sqrt(s + Factorial9(i));
        }

        return (float) s;
    }

    //40. Tính S(n) = √x
    public static double Sum40(int n, int x){
        double s = 0;
        for (int i = 1, power = x; i <= n; i++, power*=x) {
            s = Math.sqrt(power + s);
        }
        return s;
    }

    //41
    public static float Sum41(int n){
        float s = 1/2f;
        if(n == 1) return s;
        
        while (n > 1) {
            s = 1f/(1+s);
            n--;
        }
        return s;
    }

    //42
    public static float FindNum42(int n){
        float s = 0;
        int i = 0;
        for(; s<n; i++){
            s+=i;
        }
        return i;
    }

    //43. Hãy đếm số lượng chữ số của số nguyên dương n.
    public static int CountNum43(int n){
        if(n > 9) return 1+CountNum43(n/10);
        else return 1;
    }

    //44. Hãy tính tổng các chữ số của số nguyên dương n.
    public static int SumNum44(int n){
        if(n > 9) return n%10+SumNum44(n/10);
        else return n;
    }

    //45. Hãy tính tích các chữ số của số nguyên dương n.
    public static int ProductNum45(int n){
        if(n > 9) return (n%10)*ProductNum45(n/10);
        else return n;
    }

    //46. Hãy đếm số lượng chữ số lẻ của số nguyên dương n.
    public static int CountOddNum46(int n){
        if(n > 9) return ((n%10)%2==1?1:0)+CountOddNum46(n/10);
        else return n%2==1?1:0;
    }

    //47. Hãy tính tổng các chữ số chẵn của số nguyên dương n.
    public static int SumEvenNum47(int n){
        int num = n%10;
        if(n > 9) return (num%2==0?num:0)+SumEvenNum47(n/10);
        else return num%2==0?num:0;
    }

    //48. Hãy tính tích các chữ số lẻ của số nguyên dương n.
    public static int ProductOddNum48(int n){
        int num = n%10;
        if(n > 9) return (num%2==1?num:1)*ProductOddNum48(n/10);
        else return num%2==1?num:1;
    }

    //49. Cho số nguyên dương n. Hãy tìm chữ số đầu tiên của n.
    public static int FirstNum49(int n){
        if(n > 9) return FirstNum49(n/10);
        else return n;
    }

    //50. Hãy tìm chữ số đảo ngược của số nguyên dương n.
    public static int ReverseNum50(int n){
        int reverse = 0;
        while (n > 0) {
            reverse = reverse*10 + n%10;
            n = n/10;
        }

        return reverse;
    }

    //51. Tìm chữ số lớn nhất của số nguyên dương n.
    public static int BiggestNum51(int n){
        int big = 0;
        while (n > 0) {
            if(n%10 > big) big = n%10;
            n = n/10;
        }

        return big;
    }

    //52. Tìm chữ số nhỏ nhất của số nguyên dương n.
    public static int SmallestNum52(int n){
        int small = 9;
        while (n > 0) {
            if(n%10 < small) small = n%10;
            n = n/10;
        }

        return small;
    }

    //53. Hãy đếm số lượng chữ số lớn nhất của số nguyên dương n.
    public static int CountBiggestNum53(int n){
        int big = 0;
        int count = 1;
        while (n > 0) {
            if(n%10 > big) {
                big = n%10;
                count = 1;
            }
            else if(n%10 == big) count++;

            n = n/10;
        }

        return count;
    }

    //54. Hãy đếm số lượng chữ số nhỏ nhất của số nguyên dương n.
    public static int CountSmallestNum54(int n){
        int small = 9;
        int count = 1;
        while (n > 0) {
            if(n%10 < small) {
                small = n%10;
                count = 1;
            }
            else if(n%10 == small) count++;
            
            n = n/10;
        }

        return count;
    }

    //55. Hãy đêm số lượng chữ số đầu tiên của số nguyên dương n.
    public static int CountFirstNum55(int n){
        int firstNum = FirstNum49(n);
        int count = 1;
        while (n > 0) {
            if(n%10 == firstNum) count++;
            n = n/10;
        }

        return count;
    }

    //56. Hãy kiểm tra số nguyên dương n có toàn chữ số lẻ hay không?
    public static boolean IsAllOddNum56(int n){
        while (n > 0) {
            if((n%10)%2==0) return false;
            n = n/10;
        }

        return true;
    }

    //57. Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không?
    public static boolean IsAllEvenNum57(int n){
        while (n > 0) {
            if((n%10)%2==1) return false;
            n = n/10;
        }

        return true;
    }

    //59. Hãy kiểm tra số nguyên dương n có phải số đối xứng hay không?
    public static boolean SymmetricalNum59(int n){
        String num = String.valueOf(n);

        for (int i = 0; i < num.length()/2; i++) {
            if(num.charAt(i) != num.charAt(num.length() - i)) return false;
        }

        return true;
    }

    //60. Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không?
    public static boolean IncreaseNum60(int n){
        int currentNum = 9;

        while (n > 0) {
            if(n%10 <= currentNum) currentNum = n%10;
            else return false;
            n = n/10;
        }

        return true;
    }

    //61. Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không?
    public static boolean IncreaseNum61(int n){
        int currentNum = 0;

        while (n > 0) {
            if(n%10 >= currentNum) currentNum = n%10;
            else return false;
            n = n/10;
        }

        return true;
    }

    //62. Giải phương trình ax + b = 0.
    public static double SolveLinearEquation62(double a, double b) {
        if (a == 0) System.out.println("ko phai pt bac 1");

        return -b / a;
    }

    //67
    public static float Sum67(int n, int x){
        float s = 0;

        while (n > 0) {
            s += Power10(x, n) * (n+1)%2==0?1:-1;
            n--;
        }
        return s;
    }

    //68
    public static float Sum68(int n, int x){
        float s = 0;

        while (n > 0) {
            s += Power10(x, 2*n) * n%2==0?1:-1;
            n--;
        }
        return s;
    }

    //69
    public static float Sum69(int n, int x){
        float s = 0;

        while (n >= 0) {
            s += Power10(x, 2*n + 1) * n%2==0?1:-1;
            n--;
        }
        return s;
    }

    //70
    public static float Sum70(int n){
        float s = 0;

        while (n >= 0) {
            s += 1/Sum1(n) * (n+1)%2==0?1:-1;
            n--;
        }
        return s;
    }

    //71
    public static float Sum71(int n, int x){
        float s = 0;

        while (n >= 0) {
            s += Power10(x, n)/Sum1(n) * n%2==0?1:-1;
            n--;
        }
        return s;
    }

    //72
    public static float Sum72(int n, int x){
        float s = 0;

        while (n >= 0) {
            s += Power10(x, n)/Factorial9(n) * n%2==0?1:-1;
            n--;
        }
        return s;
    }

    //73
    public static float Sum73(int n, int x){
        float s = 0;

        while (n >= 0) {
            s += Power10(x, 2*n)/Factorial9(2*n) * (n+1)%2==0?1:-1;
            n--;
        }
        return s;
    }

    //74
    public static float Sum74(int n, int x){
        float s = 0;

        while (n >= 0) {
            s += Power10(x, 2*n + 1)/Factorial9(2*n + 1) * (n+1)%2==0?1:-1;
            n--;
        }
        return s;
    }

    //78. Liệt kê tất cả các ước số của số nguyên dương n.
    public static int[] Divisor78(int n, int x){
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                a.add(i);
            }
        }

        return Arrays.stream(a.toArray(new Integer[a.size()]))
        .mapToInt(Integer::intValue).toArray();
    }

    //82. Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
    public static float Max(int a, int b, int c){
        if(a>=c && a>=b) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }

    //83. Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng dấu hay không.
    public static boolean SameSign(float a, float b){
        //return (a+b > a && a+b > b) || (a+b < a && a+b < b);
        return a*b>0;
    }

    //85. Nhập vào tháng của một năm. Cho biết tháng thuộc quí mấy trong năm.
    public static int Month(int month){
        if(month == 1 ||month == 2 ||month == 3) return 1;
        else if(month == 4 ||month == 5 ||month == 6) return 2;
        else if(month == 7 ||month == 8 ||month == 9) return 3;
        else return 4;
    }

    //86. Tính S(n) = 13 + 23 + 33 + ... + n3
    public static int Sum86(int n){
        int s = 0;
        while (n > 0) {
            s+=n*n*n;
            n--;
        }

        return s;
    }

    //87. Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + ... + n > 10000.
    public static int FindMinNum87(){
        int s = 0;
        int i = 0;
        while (s < 1000) {
            i++;
            s+=i;
        }
        return i;
    }

    //88. Hãy sử dụng vòng lặp for để xuất tất cả các ký tự A tới Z.
    public static void Charr88(){
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    //89. Viết chương trình tính tổng các giá trị lẻ nguyên dương nhỏ hơn N.
    public static int Sum89(int n){
        int s = 0;
        while (n > 1) {
            n--;
            if(n%2==1) s+=n;
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

    //91. In tất cả các số nguyên dương lẻ nhỏ hơn 100.
    public static void PrintPositive91(){
        for (int i = 0; i < 100; i+=2) {
            System.out.println(i);
        }
    }

    //92. Tìm ước số chung lớn nhất của hai số nguyên dương.
    public static int MaxDivisor92(int a, int b){
        for (int i = a; i > 1; i--) {
            if(a%i==0 && b%i==0) return i;
        }

        return 1;
    }

    //94. Viết chương trình In ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93.
    public static void PrintOdd94(){
        for (int i = 1; i < 100; i+=2) {
            if(i != 5 && i!=7 && i!=93) System.out.println(i);
        }
    }

    //100.Viết chương trình giải phương trình bậc 2.
    public static void GiaiPhuongTrinhBacHai100(double a, double b, double c) {
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

    //101.Viết chương trình nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày.
    public static int DaysOfMonth(int month, int year){
        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                days = 29;
                else days = 28;
                break;
            default:
        }
        return days;
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

    //122.Tìm giá trị lớn nhất trong mảng một chiều.
    public static int Max122(int[] array) {
        int max = -999999;
        for (int num : array) {
            if (max < num) max = num;
        }
        return max;
    }

    //123.Viết hàm tìm một vị trí mà giá trị tại vị trí đó là một giá trị nhỏ nhất trong mảng một chiều các số nguyên.
    public static int IndexOfMin123(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
                index = i;
            }
        }
        
        return index;
    }

    //124. Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ hơn 2004 hay không?
    public static boolean ExistEven124(int[] array) {
        for (int i : array) {
            if(i%2==0 && i < 2004) return true;
        }
        return false;
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

    //126.Viết hàm tính tổng các giá trị âm trong mảng một chiều các số thực.
    public static float SumNegative126(int[] array) {
        float s = 0;
        for (int num : array) {
            if(num < 0) s+= num;
        }
        return s;
     }

     //127.Viết hàm sắp xếp mảng một chiều các số thực tăng dần.
    public static int[] Sort127(int[] array) {
        Arrays.sort(array);
        return array;
    }

    //134.Viết hàm tìm “giá trị lớn nhất” trong mảng một chiều số thực
    public static int Max134(int[] array) {
        return Arrays.stream(array).max().getAsInt();
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

    //136.Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên(chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
    public static int FindLastPositiveValue136(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] % 2 == 0) return array[i];
        }
        return -1;
    }

    //137.Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng một chiều các số thực
    public static int FindIndexMinValue137(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();

        for (int i = 0; i < array.length; i++) {
            if(min == array[i]) return i;
        }
        return -1;
    }

    //138.Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
    //nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
    //về giá trị là – 1.
    public static int FindIndexFirstPositiveValue138(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) return i;
        }
        return -1;
    }

    //139.Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số
    //nguyen (vitrihoanthiencuoi). Nếu mảng không có số hoàn thiện thì trả
    //về giá trị - 1.
    public static int FindIndexLastPerfectValue139(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(IsPerfect30(array[i])) return i;
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

    //142.Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực.
    public static int FindMinValue142(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    //143.Viết hàm tìm “số chẵn đầu tiên” trong mảng các số nguyên (chandau).
    //Nếu mảng không có giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -1.
    public static int FindFirstPositiveValue143(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) return array[i];
        }
        return -1;
    }

    //144.Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
    //(nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1.
    public static int FindFirstPositiveValue144(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(IsPrime31(array[i])) return array[i];
        }
        return -1;
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

    //146.Tìm giá trị âm đầu tiên trong mảng một chiều các sô thực (amdau). Nếu
    //mảng không có giá trị âm thì trả về giá trị không âm là giá trị 1.
    public static int FindFirstPositiveValue146(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0) return array[i];
        }
        return 1;
    }

    //147.Tìm “số dương cuối cùng” trong mảng số thực (duongcuoi). Nếu mảng
    //không có giá trị dương thì trả về giá trị - 1.
    public static int FindLastPositiveValue139(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > 0) return array[i];
        }
        return -1;
    }

    //148.Tìm “số nguyên tố cuối cùng” trong mảng một chiều các số nguyên
    //(nguyentocuoi). Nếu mảng không có số nguyên tố thì trả về giá trị -1.
    public static int FindLastPrimeValue139(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(IsPrime31(array[i])) return array[i];
        }
        return -1;
    }

    //149.Tìm “số hoàn thiện cuối cùng” trong mảng một chiều các số nguyên
    //(hoanthiencuoi). Nếu mảng không có số hoàn thiện thì hàm sẽ trả về
    //giá trị -1.
    public static int FindLastPerfectValue139(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(IsPerfect30(array[i])) return array[i];
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

    //151.Hãy tìm “số nguyên tố lớn nhất” trong mảng một chiều các số nguyên
    //(nguyentolonnhat). Nếu mảng không có số nguyên tố thì trả về giá trị 0.
    public static int FindMaxPrimeValue151(int[] array) {
        int prime = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > prime && IsPrime31(array[i])) prime = array[i];
        }
        return prime;
        //return Arrays.stream(array).filter(num->IsPrime31(num)).min().getAsInt();
    }

    //152.Hãy tìm “hoàn thiện nhỏ nhất” trong mảng một chiều các số nguyên
    //(hoanthiennhonhat). Nếu mảng không có số hoàn thiện thì trả về giá trị 0.
    public static int FindMinPerfectValue152(int[] array) {
        int perfect = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] < perfect && IsPerfect30(array[i])) perfect = array[i];
        }
        return perfect == -1 ? 0 : perfect;
    }

    //153.Hãy tìm “giá trị chẵn nhỏ nhất” trong mảng một chiều các số nguyên
    //(channhonhat). Nếu mảng không có giá trị chẵn thì trả về giá trị không
    //chẵn là -1.
    public static int FindMinEvenValue152(int[] array) {
        int even = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] < even && array[i]%2==0) even = array[i];
        }
        return even;
    }
    //154.Hãy tìm “vị trí giá trị âm lớn nhất” trong mảng các số thực
    //(vtamlonnhat). Nếu mảng không có giá trị âm thì trả về -1.
    public static int FindMaxNegativeValue151(int[] array) {
        int negative = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > negative && array[i] < 0) negative = array[i];
        }
        return negative == 1 ? -1 : negative;
    }

    //159.Cho mảng một chiều các số thực hãy tìm giá trị đầu tiên lớn hơn giá trị
    //2003 (dautien). Nếu mảng không có giá trị thỏa điều kiện trên thì hàm
    //trả về giá trị là 0.
    public static int FindFirstValue159(int[] array) {
        int value = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > 2003) value = array[i];
        }
        return value;
    }

    //161.Cho mảng một chiều các số nguyên, hãy tìm giá trị đầu tiên trong mảng
    //nằm trong khoảng (x,y) cho trước (dautientrongdoan). Nếu mảng
    //không có giá trị thỏa điều kiện trên thì hàm trả về giá trị là x.

    public static int FindFirstValue161(int[] array, int x, int y) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] > x && array[i] < y) return array[i];
        }
        return x;
    }

    //162.Cho mảng một chiều các số thực. Hãy viết hàm tìm một vị trí trong
    //mảng thỏa hai điền kiện: có hai giá trị lân cận và giá trị tại vịt trí đó
    //bằng tích hai gia trị lân cận. Nếu mảng không tồn tại giá trị như vậy thì
    //hàm trả về giá trị - 1.
    public static int FindCloseValue162(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i]*array[i+2] == array[i+1]) return i;
        }
        return -1;
    }

    //163.Tìm số chính phương đầu tiên trong mảng một chiều các số nguyên.
    static int FindFirstPerfectSquare163(int[] array) {
        for (int num : array) {
            if (IsPerfectsquare32(num)) return num;
        }
        return 0; 
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

    //167.Hãy tìm giá trị thỏa điều kiện toàn chữ số lẻ và là giá trị lớn nhất thỏa
    //điều kiện ấy trong mảng một chiều các số nguyên (nếu mảng không có
    //giá trị thỏa điều kiện trên thì hàm trả về giá trị 0).
    public static int FindMaxAllOddValue167(int[] array) {
        int odd = -999998;
        for (int num : array) {
            if ( num > odd && IsAllOddNum56(num)) {
                odd = num;
            }
        }

        return odd == -999998 ? 0 : odd;
    }

    //169.(*) Cho mảng một chiều các số nguyên. Hãy viết hàm tìm số chẵn lớn
    //nhất nhỏ hơn mọi giá trị lẻ có trong mảng. 
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

    //171.Cho mảng một chiều các số nguyên dương. Hãy viết hàm tìm ước
    //chung lớn nhất của tất cả các phần tử trong mảng.
    public static int FindMaxDivisorValue171(int[] array) {
        int maxvalue = Arrays.stream(array).min().getAsInt();

        for (int value = maxvalue; value > 1; value--) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] % value != 0) break;
                else if(i == array.length - 1){
                    return value;
                }
            }
        }

        return 1;
    }

    //172.Cho mảng một chiều các số nguyên dương. Hãy viết hàm tìm bội
    //chung nhỏ nhất của tất cả các phần tử trong mảng.
    public static int FindMinMutiple172(int[] array) {
        int minMutiple = Arrays.stream(array).max().getAsInt();
        int maxMutiple = Arrays.stream(array).reduce(1, (a, b) -> a*b);
        while (minMutiple < maxMutiple) {

            for (int i = 0; i < array.length; i++) {
                if(array[i] % minMutiple != 0) break;
                else if(i == array.length - 1){
                    return minMutiple;
                }
            }
 
            minMutiple++;
        }

        return maxMutiple;
    }

    //200.Tính tổng các phần tử trong mảng (tonggiatri).
    public static int Sum200(int[] array) {
        return Arrays.stream(array).sum();
    }
    
    //201.Tính tổng các giá trị dương trong mảng một chiều các số thực
    public static int SumPositive201(int[] array) {
        return Arrays.stream(array).filter(value->value>0).sum();
    }

    //202.Tính tổng các giá trị có chữ số đầu tiên là chữ số lẻ trong mảng một
    //chiều các số nguyên (tongdaule).
    public static int SumFirstOddValue201(int[] array) {
        return Arrays.stream(array).filter(value->FirstNumOdd(value)).sum();
    }

    //203.Tính tổng các giá trị có chữ số hàng chục là chữ số 5 có trong mảng các
    //số nguyên (tongchuc).
    public static int SumTen5Value203(int[] array) {
        return Arrays.stream(array).filter(value->(value/10)%10==5).sum();
    }

    //204.Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng một
    //chiều các số thực.
    public static int SumBiggerPrecedingValue204(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) sum+=array[i];
        }
        return sum;
    }

    //205.Tính tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó
    //trong mảng một chiều các số thực.
    public static int SumBiggerSucceedingValue205(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > Math.abs(array[i+1])) sum+=array[i];
        }
        return sum;
    }

    //206.Tính tổng các giá trị lớn hơn các giá trị xung quanh trong mảng một
    //chiều các số thực (tongcucdai).
    //Lưu ý: Một giá trị trong mảng có tối đa hai giá trị xung quanh.
    public static int SumBiggerAroundValue206(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if(array[i-1] < array[i] && array[i] > array[i+1]) sum+=array[i];
        }
        return sum;
    }

    //207.Tính tổng các phần tử “cực trị” trong mảng (tongcuctri). Một phần tử
    //được gọi là cực trị khi nó lớn hơn hoặc nhỏ hơn các phần tử xung
    //quanh nó.
    public static int SumBiggerOrSmallAroundValue207(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if(array[i-1] < array[i] && array[i] > array[i+1]
            ||array[i-1] > array[i] && array[i] < array[i+1]) sum+=array[i];
        }
        return sum;
    }

    //208.Tính tổng các giá trị chính phương trong mảng một chiều các số
    //nguyên (tongchinhphuong).
    public static int SumPerfectSquareValue208(int[] array) {
        return Arrays.stream(array).filter(value->IsPerfectsquare32(value)).sum();
    }

    //209.Tính tổng các giá trị đối xứng trong mảng các số nguyên
    //(tongdoixung).
    public static int SumSymmetricValue209(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] == array[array.length - i - 1]) sum+=array[i]*2;
        }
        return sum;
    }

    //210.Tính tổng các giá trị có chữ số đầu tiên là chữ số chẵn có trong mảng
    //các số nguyên (tongdauchan).
    public static int SumFirstEvenValue210(int[] array) {
        return Arrays.stream(array).filter(value->
        { 
            while (value >= 10) {
                value = value/10;
            }
            return value%2 == 0;
        }).sum();
    }

    //211.Tính trung bình cộng các số nguyên tố trong mảng một chiều các số nguyên.
    public static double AveragePrimeValue211(int[] array) {
        return Arrays.stream(array).filter(value-> IsPrime31(value)).average().orElse(0);
    }

    //212.Tính trung bình cộng các số dương trong mảng một chiều các số thực.
    public static double AveragePositiveValue211(int[] array) {
        return Arrays.stream(array).filter(value-> value > 0).average().orElse(0);
    }

    //213.Tính trung bình cộng các giá trị lớn hơn giá trị x trong mảng một chiều.
    public static double AverageBiggerXValue213(int[] array, int x) {
        return Arrays.stream(array).filter(value-> value > x).average().orElse(0);
    }

    //216.Đếm số lượng số chẵn có trong mảng một chiều
    public static double CountEvenValue216(int[] array) {
        return Arrays.stream(array).filter(value-> value%2 == 0).count();
    }

    //217.Đếm số lượng giá trị dương chia hết cho 7 trong mảng một chiều các số nguyên.
    public static double CountEven7Value217(int[] array) {
        return Arrays.stream(array).filter(value-> value%7 == 0).count();
    }

    //219.Đếm số lần xuất hiện của giá trị x trong mảng một chiều các số thực
    public static double CountEven7Value219(int[] array, int x) {
        return Arrays.stream(array).filter(value-> value == x).count();
    }

    //220.Hãy đếm số lượng giá trị có chữ số tận cùng bằng 5 trong mảng các số nguyên.
    public static double CountLast5Value219(int[] array) {
        return Arrays.stream(array).filter(value-> value%10 == 5).count();
    }

    /**
     * 221.Hãy cho biết sự tương quan giữa số lượng số chẵn và số lượng số lẻ
trong mảng các số nguyên (tuongquanchanle)
* Hàm này trả về một trong ba giá trị -1, 0, và 1.
* Giá trị -1 có nghĩa số lượng số chẵn nhiều hơn số lẻ.
* Giá trị 0 có nghĩa số lượng số lẻ bằng số lượng số chẵn
* Giá trị 1 có nghĩa số lẻ nhiều hơn số chẵn.
     */
    public static int Tuongquanchanle221(int[] array) {
        int even = (int)Arrays.stream(array).filter(value-> value%2 == 0).count();

        if(even > array.length/2f)return -1;
        else if(even == array.length/2f)return 0;
        else return 1;
        
    }

    //223.Hãy đếm số lượng “số nguyên tố” có trong mảng một chiều
    public static double CountPrimeValue223(int[] array) {
        return Arrays.stream(array).filter(value-> IsPrime31(value)).count();
    }

    //224.Hãy đếm số lượng “số hoàn thiện” có trong mảng một chiều
    public static double CountPerfectValue223(int[] array) {
        return Arrays.stream(array).filter(value-> IsPerfect30(value)).count();
    }

    //225.Hãy đếm số lượng các giá trị lớn nhất có trong mảng một chiều
    public static double CountMaxValue223(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        return Arrays.stream(array).filter(value-> value == max).count();
    }

    //226.Hãy xác định số lượng các phần tử kề nhau mà cả hai đều chẵn
    public static int CountCloseEvenValue226(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0 && array[i + 1]%2 == 0) count++;
        }
        return count;
    }

    //227.Hãy xác định số lượng các phần tử kề nhau mà cả hai số trái dấu nhau
    public static int CountCloseOppositeSignValue227(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] * array[i + 1] < 0) count++;
        }
        return count;
    }

    //228.Hãy xác định số lượng các phần tử kề nhau mà số đứng sau cùng dấu
    //số đứng trước và có giá trị tuyệt đối lớn hơn
    public static int CountCloseSameSignValue228(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] * array[array.length - i - 1] < 0
            && array[i] < Math.abs(array[i + 1])) count++;
        }
        return count;
    }

    //229.Hãy đếm số lượng các giá trị phân biệt có trong mảng
    public static double CountDistinctValue229(int[] array) {
        return Arrays.stream(array).distinct().count();
    }

    //240.Hãy kiểm tra mảng số nguyên có tồn tại giá trị không hay không? Nếu
    //không tồn tại giá trị không trả về giá trị 0, ngược lại trả về 1
    public static int ExistZeroValue240(int[] array) {
        return Arrays.stream(array).anyMatch(value->value==0)?1:0;
    }

    //241.Hãy kiểm tra mảng số nguyên có tồn tại hai giá trị không liên tiếp hay
    //không ?(haikhong).
    public static boolean Exist2ZeroValue241(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == 0 && array[i + 1] == 0) return true;
        }
        return false;
    }

    //242.Hãy kiểm tra mảng số nguyên có tồn tại giá trị chẵn hay không? Nếu
    //không tồn tại giá trị chẵn trả về giá trị 0, hay ngược lại trả về 1.
    public static int ExistEvenValue242(int[] array) {
        return Arrays.stream(array).anyMatch(value->value%2==0)?0:1;
    }

    //243.Hãy kiểm tra mảng số nguyên có tồn tại số nguyên tố hay không? Nếu
    //có trả về 1, nếu không trả về 0
    public static int ExistPrimeValue243(int[] array) {
        return Arrays.stream(array).anyMatch(value->IsPrime31(value))?1:0;
    }

    //244.Hãy kiểm tra mảng có thỏa mãn tính chất sau không: “Mảng không có
    //tồn tại số hoàn thiện lớn hơn 256”. Nếu thỏa trả về 1, nếu không trả về 0
    public static int ExistPerfectValue244(int[] array) {
        return Arrays.stream(array).anyMatch(value-> value>256 && IsPerfect30(value))?1:0;
    }

    //245.Hãy cho biết mảng các số nguyên có toàn số chẵn hay không? Nếu có
   //tồn tại giá trị lẻ trả về giá trị 0, ngược lại trả về 1 .
    public static int ExistOddValue2(int[] array) {
        return Arrays.stream(array).anyMatch(value-> value%2 == 1)?0:1;
    }

    //246.Hãy kiểm tra mảng một chiều các số thực có đối xứng hay không?
    public static boolean SymmetricValue246(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[array.length - i - 1]) return false;
        }
        return true;
    }

    //247.Ta định nghĩa một mảng có tính chẵn lẻ, khi tổng của hai phần tử liên
    //tiếp trong mảng luôn luôn là số lẻ. Hãy viết hàm kiểm tra mảng a có
    //tính chẵn lẻ hay không?
    public static boolean EvenOddArray246(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if((array[i] + array[i+1])%2 == 0) return false;
        }
        return true;
    }

    //248.Hãy kiểm tra mảng có tăng dần hay không?
    public static boolean IncreasingArray248(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] > array[i+1]) return false;
        }
        return true;
    }

    //249.Hãy kiểm tra mảng có giảm dần hay không?.
    public static boolean DecreasingArray249(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] < array[i+1]) return false;
        }
        return true;
    }

    //250.Hãy cho biết các phần tử trong mảng có lập thành cấp số cộng không?
    //Nếu có hãy chỉ ra công sai
    public static int ArithmeticProgression250(int[] array) {
        int a = array[1] - array[0];
        for (int i = 0; i < array.length -1; i++) {
            if(array[i+1] - array[i] != a) return 0;
        }
        return a;
    }

    //251.Hãy cho biết các phần tử trong mảng có bằng nhau không?
    public static boolean EqualValue251(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] != array[i+1]) return false;
        }
        return true;
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

    //333.TÍnh tổng các số hoàn thiện trong ma trận các số nguyên.
    public static int SumPerfect333(int[][] matrix) {
        int s = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (IsPerfect30(num)) {
                    s *= num;
                }
            }
        }
        return s;
    }

    //334.Viết hàm đếm số lượng số dương trong ma trận
    public static int SumPositive334(int[][] matrix) {
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num>0) {
                    count++;
                }
            }
        }
        return count;
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

    //348.Kiểm tra ma trận có tồn tại số dương hay không.
    public static boolean ExistPositive348(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > 0) return true;
            }
        }

        return false;
    }

    //349.Kiểm tra ma trận có tồn tại số hoàn thiện hay không.
    public static boolean ExistPerfect349(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (IsPerfect30(num)) return true;
            }
        }

        return false;
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

    //366.Tìm số chẵn xuất hiện đầu tiên trong ma trận số nguyên.
    public static int FindFirstEven366(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num%2 == 0) return num;
            }
        }

        return 1;
    }

    //367.Tìm giá trị lớn nhất trong ma trận.
    public static int FindBiggestvalue367(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().orElse(0);
    }

    //369.Tìm giá trị dương đầu tiên trong ma trận.
    public static int FindFirstPositive369(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > 0) return num;
            }
        }
        return -1;
    }

    //370.Tìm giá trị âm lớn nhất trong ma trận.
    public static int FindBiggestNegative370(int[][] matrix) {
        int negative = 1;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0 && num > negative) return negative = num;
            }
        }

        return negative;
    }

    //374.Tìm số nguyên tố đầu tiên trong ma trận các số nguyên.
    public static int FindFirstPrime374(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (IsPrime31(num)) return num;
            }
        }
        return 1;
    }

    //375.Tìm số chẵn lớn nhất trong ma trận các số nguyên.
    public static int FindBiggestEven375(int[][] matrix) {
        int even = 1;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num%2 == 0 && num > even) return even = num;
            }
        }

        return even;
    }

    //376.Tìm giá trị dương nhỏ nhất trong ma trận các số thực.
    public static int FindMinPositive376(int[][] matrix) {
        int min = 99999;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > 0 && num < min) return min = num;
            }
        }

        return min;
    }

    //377.Tìm số nguyên tố lớn nhất trong ma trận các số nguyên.
    public static int FindMaxPrime377(int[][] matrix) {
        int prime = 99999;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > prime && IsPrime31(num)) return prime = num;
            }
        }

        return prime;
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

    //705.Cho mảng một chiều các số thực. Viết hàm đếm số lượng giá trị dương
    //trong mảng bằng phương pháp đệ qui.
    public static int SumPositiveRecursive705(int[] array, int index) {
        if (index >= array.length)  return 0;

        if (array[index] > 0) {
            return 1 + SumPositiveRecursive705(array, index + 1);
        } 
        else return SumPositiveRecursive705(array, index + 1);
    }

    //710.Viết hàm đệ qui tính tổng của biểu thức
    public static float SumRecursive710(int x, int n) {
        if(n > 0) return Power10(x, n)/Factorial9(n) + SumRecursive710(x, n);
        else return 0;
    }

    //722.Cho mảng một chiều các ố thực. Hãy viết hàm đệ quy tính tổng các giá
    //trị có trong mảng.
    public static float SumRecursive722(int[] array, int index) {
        if (index >= array.length) return 0;
        else return array[index] + SumRecursive722(array, index + 1);
    }

    //723.Cho mảng một chiều các số thực. Hãy viết hàm đệ quy tính tổng các giá trị dương có trong mảng.
    public static float SumRecursive723(int[] array, int index) {
        if (index >= array.length) return 0;
        else if(array[index] > 0) return array[index] + SumRecursive723(array, index + 1);
        else return SumRecursive723(array, index + 1);
    }

    //724.Cho mảng một chiều các số thực. Hãy viết hàm đệ quy tính tích các giá
    //trị lớn hơn giá trị đứng trước nó trong mảng.
    public static float SumRecursive724(int[] array, int index) {
        if (index + 1 >= array.length) return 1;
        else if(array[index] > array[index+1]) return array[index] * SumRecursive723(array, index + 1);
        else return SumRecursive723(array, index + 1);
    }

    //725
    static boolean AllNegative725(int[] array, int index) {
        if (index >= array.length) return true;

        if (array[index] >= 0)  return false;

        return AllNegative725(array, index + 1);
    }

}

