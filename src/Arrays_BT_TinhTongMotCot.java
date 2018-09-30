import java.util.Scanner;

public class Arrays_BT_TinhTongMotCot {
    public static void main(String[] args) {
        int matrix[][];
        int row;
        int column;
        int check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich co cua ma tran: ");
        System.out.print("So dong: row = ");
        row = scanner.nextInt();
        System.out.println("So cot: column = ");
        column = scanner.nextInt();
        matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "," + j+ "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Nhập vào cột cần tính tổng: ");
        check = scanner.nextInt();
        int sum=0;
        for(int i = 0; i < row; i++)
            sum+= matrix[i][check];
        System.out.println(sum);
    }
}
