package ProjectWithMocky;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner Main = new Scanner (System.in);

        int ClassicBlack330ML = 17000;
        int ClassicBlack600ML = 30000;
        int ClassicWhite330ML = 22000;
        int ClassicWhite600ML = 40000;
        int Vanilla330ML = 22000;
        int Vanilla600ML = 40000;
        int ButterScotch330ML = 24000;
        int ButterScotch600ML = 44000;
        int Chocomalt330ML = 26000;
        int Chocomalt600ML = 48000;
        int VanillaSpecullos330ML = 23000;
        int VanillaSpecullos600ML = 40000;
        int CherryBlossom330ML = 23000;
        int CherryBlossom600ML = 40000;


        String[] Data = new String[16];
        Data[0] = " ";
        Data[1] = " ";
        Data[2] = " ";
        Data[3] = " ";
        Data[4] = " ";
        Data[5] = " ";
        Data[6] = " ";
        Data[7] = " ";
        Data[8] = " ";
        Data[9] = " ";
        Data[10] = " ";
        Data[11] = " ";
        Data[12] = " ";
        Data[13] = " ";

        int Total330ML = 0;
        int Total600ML = 0;

        String Menu;

        do {
            System.out.print ("1. Menu Varian 330ML\n");
            System.out.print ("2. Menu Varian 600ML\n");
            System.out.print ("3. Hitung Total Penjualan\n");
            System.out.print ("4. Hapus Varian\n" );
            System.out.print ("Pilih Menu\t: ");
            byte PilihVarian = Main.nextByte ();

            switch (PilihVarian) {
                case 1 -> {
                    System.out.print ("Menu Varian 330ML\n");
                    System.out.print ("~~~~~~~~~~~~~~~~~\n");
                    System.out.print ("Classic Black\t\t: ");
                    Data[0] = Main.next () + Main.nextLine ();
                    System.out.print ("Classic White\t\t: ");
                    Data[1] = Main.next () + Main.nextLine ();
                    System.out.print ("Vanilla\t\t: ");
                    Data[2] = Main.next () + Main.nextLine ();
                    System.out.print ("Butter Scotch\t\t: ");
                    Data[3] = Main.next () + Main.nextLine ();
                    System.out.print ("Chocomalt\t\t: ");
                    Data[4] = Main.next () + Main.nextLine ();
                    System.out.print ("Vanilla Specullos\t\t: ");
                    Data[5] = Main.next () + Main.nextLine ();
                    System.out.print ("Cherry Blossom\t\t: ");
                    Data[6] = Main.next () + Main.nextLine ();

                    double CBlack330ML = Double.parseDouble (Data[0]);
                    double CWhite330ML = Double.parseDouble (Data[1]);
                    double V330ML = Double.parseDouble (Data[2]);
                    double BScotch330ML = Double.parseDouble (Data[3]);
                    double C330ML = Double.parseDouble (Data[4]);
                    double VSpecullos330ML = Double.parseDouble (Data[5]);
                    double CBlossom330ML = Double.parseDouble (Data[6]);
                    Total330ML = (int) ((CBlack330ML * ClassicBlack330ML)
                                                + (CWhite330ML * ClassicWhite330ML)
                                                + (V330ML * Vanilla330ML)
                                                + (BScotch330ML * ButterScotch330ML)
                                                + (C330ML * Chocomalt330ML)
                                                + (VSpecullos330ML * VanillaSpecullos330ML)
                                                + (CBlossom330ML * CherryBlossom330ML));

                    System.out.printf ("Total Penjualan 330ML\t:\t%d\n", Total330ML);
                }
                case 2 -> {
                    System.out.print ("Menu Varian 600ML\n");
                    System.out.print ("~~~~~~~~~~~~~~~~~\n");
                    System.out.print ("Classic Black\t\t: ");
                    Data[7] = Main.next () + Main.nextLine ();
                    System.out.print ("Classic White\t\t: ");
                    Data[8] = Main.next () + Main.nextLine ();
                    System.out.print ("Vanilla\t\t: ");
                    Data[9] = Main.next () + Main.nextLine ();
                    System.out.print ("Butter Scotch\t\t: ");
                    Data[10] = Main.next () + Main.nextLine ();
                    System.out.print ("Chocomalt\t\t: ");
                    Data[11] = Main.next () + Main.nextLine ();
                    System.out.print ("Vanilla Specullos\t\t: ");
                    Data[12] = Main.next () + Main.nextLine ();
                    System.out.print ("Cherry Blossom\t\t: ");
                    Data[13] = Main.next () + Main.nextLine ();

                    double CBlack600ML = Double.parseDouble (Data[7]);
                    double CWhite600ML = Double.parseDouble (Data[8]);
                    double V600ML = Double.parseDouble (Data[9]);
                    double BScotch600ML = Double.parseDouble (Data[10]);
                    double C600ML = Double.parseDouble (Data[11]);
                    double VSpecullos600ML = Double.parseDouble (Data[12]);
                    double CBlossom600ML = Double.parseDouble (Data[13]);
                    Total600ML = (int) ((CBlack600ML * ClassicBlack600ML)
                                                + (CWhite600ML * ClassicWhite600ML)
                                                + (V600ML * Vanilla600ML)
                                                + (BScotch600ML * ButterScotch600ML)
                                                + (C600ML * Chocomalt600ML)
                                                + (VSpecullos600ML * VanillaSpecullos600ML)
                                                + (CBlossom600ML * CherryBlossom600ML));

                    System.out.printf ("Total Penjualan 600ML\t:\t%d\n", Total600ML);
                }
                case 3 -> {
                    if (Total330ML > 0 || Total600ML > 0) {
                        int GTotal = Total330ML + Total600ML;
                        System.out.printf ("Grand Total Penjualah Hari Ini\t:\t%d\n", GTotal);
                    } else {
                        System.out.print ("Anda Belum Menghitung Pedapatan Hari Ini, Silahkan Coba Ke\n");
                    }
                }
                case 4 -> {
                    if (Total330ML > 0 || Total600ML > 0){
                        System.out.print("1. Varian 330ML\n");
                        System.out.print("2. Varian 600ML\n");
                        System.out.print("Pilih     :\n");
                        int hapus = Main.nextInt();
                        if ( hapus == 1) {
                            System.out.print  ("--PESANAN SEBELUMNYA--\n");
                            System.out.print  ("=======================================\n");
                            System.out.print  ("A. Jumlah Classic Black :"+ Data[0] + "\n");
                            System.out.print  ("B. Jumlah Classic White :"+ Data[1] + "\n");
                            System.out.print  ("C. Jumlah Vanilla       :"+ Data[2] + "\n");
                            System.out.print  ("D. Jumlah Butter Scotch :"+ Data[3] + "\n");
                            System.out.print  ("E. Jumlah Chocomalt     :"+ Data[4] + "\n");
                            System.out.print  ("F. Vanilla Specullos    :"+ Data[5] + "\n");
                            System.out.print  ("G. Cherry Blossom       :"+ Data[6] + "\n");
                            System.out.print  ("=======================================\n");
                            System.out.println(" ");
                            System.out.print  ("--PESANAN YANG INGIN DIRUBAH--\n");
                           // System.out.print();




                        }
                    }
                    else {
                        System.out.print ("Anda Belum Menghitung Pedapatan Hari Ini !!\n");
                    }
                }
            }
            System.out.print ("Ketik Y/y Untuk Kembali ke Menu Awal, Dan Ketik Keyword Lain Untuk Mengakhiri Program Ini\t: ");
            Menu = Main.next () + Main.nextLine ();
        } while ("Y".equalsIgnoreCase (Menu));
    }
}