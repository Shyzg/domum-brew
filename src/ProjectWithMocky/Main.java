package ProjectWithMocky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Main = new Scanner(System.in);

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
        int Hapus;

        String Menu;
        String loop;
        String loop2;

        do {
            System.out.print("=======================================\n");
            System.out.print("~~PROGRAM PERHITUNGAN KEUNTUNGAN HARIAN~~\n");
            System.out.print("1. Menu Varian 330ML\n");
            System.out.print("2. Menu Varian 600ML\n");
            System.out.print("3. Hitung Grand Total Penjualan\n");
            System.out.print("4. Ganti Varian\n");
            System.out.print("Pilih Menu\t:\t");
            byte PilihVarian = Main.nextByte();
            for ( int i = 0 ;i < 50 ; i++ ) {
                System.out.println("\n");
            }



            switch (PilihVarian) {
                case 1 -> {
                    if ( Total330ML <= 0) {
                        System.out.print("Menu Varian 330ML\n");
                        System.out.print("~~~~~~~~~~~~~~~~~\n");
                        System.out.print("Classic Black        :\t");
                        Data[0] = Main.next() + Main.nextLine();
                        System.out.print("Classic White        :\t");
                        Data[1] = Main.next() + Main.nextLine();
                        System.out.print("Vanilla              :\t");
                        Data[2] = Main.next() + Main.nextLine();
                        System.out.print("Butter Scotch        :\t");
                        Data[3] = Main.next() + Main.nextLine();
                        System.out.print("Chocomalt            :\t");
                        Data[4] = Main.next() + Main.nextLine();
                        System.out.print("Vanilla Specullos    :\t");
                        Data[5] = Main.next() + Main.nextLine();
                        System.out.print("Cherry Blossom       :\t");
                        Data[6] = Main.next() + Main.nextLine();

                        double CBlack330ML = Double.parseDouble(Data[0]);
                        double CWhite330ML = Double.parseDouble(Data[1]);
                        double V330ML = Double.parseDouble(Data[2]);
                        double BScotch330ML = Double.parseDouble(Data[3]);
                        double C330ML = Double.parseDouble(Data[4]);
                        double VSpecullos330ML = Double.parseDouble(Data[5]);
                        double CBlossom330ML = Double.parseDouble(Data[6]);
                        Total330ML = (int) ((CBlack330ML * ClassicBlack330ML)
                                + (CWhite330ML * ClassicWhite330ML)
                                + (V330ML * Vanilla330ML)
                                + (BScotch330ML * ButterScotch330ML)
                                + (C330ML * Chocomalt330ML)
                                + (VSpecullos330ML * VanillaSpecullos330ML)
                                + (CBlossom330ML * CherryBlossom330ML));

                        System.out.printf("Total Penjualan 330ML\t:\t%d\n", Total330ML);
                    }else{
                        System.out.print("Data sudah terisi, jika ingin mengganti maka pilih menu 4 !!\n");
                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    }



                }
                case 2 -> {
                    if ( Total600ML <= 0) {
                        System.out.print("Menu Varian 600ML\n");
                        System.out.print("~~~~~~~~~~~~~~~~~\n");
                        System.out.print("Classic Black        :\t");
                        Data[7] = Main.next() + Main.nextLine();
                        System.out.print("Classic White        :\t");
                        Data[8] = Main.next() + Main.nextLine();
                        System.out.print("Vanilla              :\t");
                        Data[9] = Main.next() + Main.nextLine();
                        System.out.print("Butter Scotch        :\t");
                        Data[10] = Main.next() + Main.nextLine();
                        System.out.print("Chocomalt            :\t");
                        Data[11] = Main.next() + Main.nextLine();
                        System.out.print("Vanilla Specullos    :\t");
                        Data[12] = Main.next() + Main.nextLine();
                        System.out.print("Cherry Blossom       :\t");
                        Data[13] = Main.next() + Main.nextLine();

                        double CBlack600ML = Double.parseDouble(Data[7]);
                        double CWhite600ML = Double.parseDouble(Data[8]);
                        double V600ML = Double.parseDouble(Data[9]);
                        double BScotch600ML = Double.parseDouble(Data[10]);
                        double C600ML = Double.parseDouble(Data[11]);
                        double VSpecullos600ML = Double.parseDouble(Data[12]);
                        double CBlossom600ML = Double.parseDouble(Data[13]);
                        Total600ML = (int) ((CBlack600ML * ClassicBlack600ML)
                                + (CWhite600ML * ClassicWhite600ML)
                                + (V600ML * Vanilla600ML)
                                + (BScotch600ML * ButterScotch600ML)
                                + (C600ML * Chocomalt600ML)
                                + (VSpecullos600ML * VanillaSpecullos600ML)
                                + (CBlossom600ML * CherryBlossom600ML));

                        System.out.printf("Total Penjualan 600ML\t:\t%d\n", Total600ML);
                    }else{
                        System.out.print("Data sudah terisi, jika ingin mengganti maka pilih menu 4 !!\n");
                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    }


                }
                case 3 -> {
                    if (Total330ML > 0 || Total600ML > 0) {
                        int GTotal = Total330ML + Total600ML;
                        System.out.print("~~~~~~LIST PERHITUNGAN~~~~~~~~\n");
                        System.out.printf("A. Jumlah Classic Black      330ML        :\t%s\n", Data[0]);
                        System.out.printf("B. Jumlah Classic White      330ML        :\t%s\n", Data[1]);
                        System.out.printf("C. Jumlah Vanilla            330ML        :\t%s\n", Data[2]);
                        System.out.printf("D. Jumlah Butter Scotch      330ML        :\t%s\n", Data[3]);
                        System.out.printf("E. Jumlah Chocomalt          330ML        :\t%s\n", Data[4]);
                        System.out.printf("F. Jumlah Vanilla Specullos  330ML        :\t%s\n", Data[5]);
                        System.out.printf("G. Jumlah Cherry Blossom     330ML        :\t%s\n", Data[6]);
                        System.out.printf("A. Jumlah Classic Black      600ML        :\t%s\n", Data[7]);
                        System.out.printf("B. Jumlah Classic White      600ML        :\t%s\n", Data[8]);
                        System.out.printf("C. Jumlah Vanilla            600ML        :\t%s\n", Data[9]);
                        System.out.printf("D. Jumlah Butter Scotch      600ML        :\t%s\n", Data[10]);
                        System.out.printf("E. Jumlah Chocomalt          600ML        :\t%s\n", Data[11]);
                        System.out.printf("F. Jumlah Vanilla Specullos  600ML        :\t%s\n", Data[12]);
                        System.out.printf("G. Jumlah Cherry Blossom     600ML        :\t%s\n", Data[13]);

                        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        System.out.printf("Grand Total Penjualah Hari Ini\t:\t%d\n", GTotal);
                    } else {
                        System.out.print("Anda Belum Menghitung Pedapatan Hari Ini, Silahkan Mengisi Terlebih Dahulu\n");
                    }
                }
                case 4 -> {
                    do {
                    if (Total330ML > 0 || Total600ML > 0) {

                            System.out.print("1. Varian 330ML\n");
                            System.out.print("2. Varian 600ML\n");
                            System.out.print("Pilih\t:\t");
                            Hapus = Main.nextInt();

                            if (Hapus == 1) {
                                do {
                                    System.out.print("~~~~~~PESANAN SEBELUMNYA~~~~~~\n");
                                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                                    System.out.printf("A. Jumlah Classic Black      330ML        :\t%s\n", Data[0]);
                                    System.out.printf("B. Jumlah Classic White      330ML        :\t%s\n", Data[1]);
                                    System.out.printf("C. Jumlah Vanilla            330ML        :\t%s\n", Data[2]);
                                    System.out.printf("D. Jumlah Butter Scotch      330ML        :\t%s\n", Data[3]);
                                    System.out.printf("E. Jumlah Chocomalt          330ML        :\t%s\n", Data[4]);
                                    System.out.printf("F. Jumlah Vanilla Specullos  330ML        :\t%s\n", Data[5]);
                                    System.out.printf("G. Jumlah Cherry Blossom     330ML        :\t%s\n", Data[6]);
                                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                                    System.out.print("Pilih Varian Yang Ingin Anda Ganti Sesuai Abjad : \n");
                                    String pilihg = Main.next() + Main.nextLine();

                                    if ("A".equalsIgnoreCase(pilihg)) {
                                        Data[0] = null;
                                        System.out.print("A. Jumlah Ganti Baru Classic Black       330ML   :\t");
                                        Data[0] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("B".equalsIgnoreCase(pilihg)) {
                                        Data[1] = null;
                                        System.out.print("B. Jumlah Ganti Baru Classic White       330ML   :\t");
                                        Data[1] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("C".equalsIgnoreCase(pilihg)) {
                                        Data[2] = null;
                                        System.out.print("C. Jumlah Ganti Baru vanilla             330ML   :\t");
                                        Data[2] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("D".equalsIgnoreCase(pilihg)) {
                                        Data[3] = null;
                                        System.out.print("D. Jumlah Ganti Baru Butter Scotch       330ML   :\t");
                                        Data[3] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("E".equalsIgnoreCase(pilihg)) {
                                        Data[4] = null;
                                        System.out.print("E. Jumlah Ganti Baru Chocomalt           330ML   :\t");
                                        Data[4] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("F".equalsIgnoreCase(pilihg)) {
                                        Data[5] = null;
                                        System.out.print("F. Jumlah Ganti Baru vanilla Specullos   330ML   :\t");
                                        Data[5] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("G".equalsIgnoreCase(pilihg)) {
                                        Data[6] = null;
                                        System.out.print("A. Jumlah Ganti Baru Cherry Blossom      330ML   :\t");
                                        Data[6] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    }
                                    System.out.println("Ketik Y/y untuk merubah menu 330ML lagi, dan ketik Keyword Lain Untuk Kembali ke Menu Awal : ");
                                    loop = Main.next() + Main.nextLine();
                                } while ("Y".equalsIgnoreCase(loop));
                            } else if (Hapus == 2) {
                                do {
                                    System.out.print("~~~~~~PESANAN SEBELUMNYA~~~~~~\n");
                                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                                    System.out.printf("A. Jumlah Classic Black      600ML        :\t%s\n", Data[7]);
                                    System.out.printf("B. Jumlah Classic White      600ML        :\t%s\n", Data[8]);
                                    System.out.printf("C. Jumlah Vanilla            600ML        :\t%s\n", Data[9]);
                                    System.out.printf("D. Jumlah Butter Scotch      600ML        :\t%s\n", Data[10]);
                                    System.out.printf("E. Jumlah Chocomalt          600ML        :\t%s\n", Data[11]);
                                    System.out.printf("F. Jumlah Vanilla Specullos  600ML        :\t%s\n", Data[12]);
                                    System.out.printf("G. Jumlah Cherry Blossom     600ML        :\t%s\n", Data[13]);
                                    System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                                    System.out.print("Pilih Varian Yang Ingin Anda Ganti Sesuai Abjad : \n");
                                    String pilihg = Main.next() + Main.nextLine();

                                    if ("A".equalsIgnoreCase(pilihg)) {
                                        Data[7] = null;
                                        System.out.print("A. Jumlah Ganti Baru Classic Black       600ML   :\t");
                                        Data[7] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("B".equalsIgnoreCase(pilihg)) {
                                        Data[8] = null;
                                        System.out.print("B. Jumlah Ganti Baru Classic White       600ML   :\t");
                                        Data[8] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("C".equalsIgnoreCase(pilihg)) {
                                        Data[9] = null;
                                        System.out.print("C. Jumlah Ganti Baru vanilla             600ML   :\t");
                                        Data[9] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("D".equalsIgnoreCase(pilihg)) {
                                        Data[10] = null;
                                        System.out.print("D. Jumlah Ganti Baru Butter Scotch       600ML   :\t");
                                        Data[10] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t");
                                    } else if ("E".equalsIgnoreCase(pilihg)) {
                                        Data[11] = null;
                                        System.out.print("E. Jumlah Ganti Baru Chocomalt           600ML   :\t");
                                        Data[11] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("F".equalsIgnoreCase(pilihg)) {
                                        Data[12] = null;
                                        System.out.print("F. Jumlah Ganti Baru vanilla Specullos   600ML   :\t");
                                        Data[12] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    } else if ("G".equalsIgnoreCase(pilihg)) {
                                        Data[13] = null;
                                        System.out.print("G. Jumlah Ganti Baru Cherry Blossom      600ML   :\t");
                                        Data[13] = Main.next() + Main.nextLine();
                                        System.out.print("Data Berhasil Diganti !!\t\n");
                                    }

                                    System.out.println("Ketik Y/y untuk merubah menu 660 ML lagi, dan ketik Keyword Lain Untuk Kembali ke Menu Pergantian Jumlah Varian : ");
                                    loop = Main.next() + Main.nextLine();
                                } while ("Y".equalsIgnoreCase(loop));
                            }

                        } else {
                            System.out.print("Anda Belum Menghitung Pedapatan Hari Ini !!!\n");
                        }

                        System.out.print("Apakah Anda Yakin (Y/N) ?");
                        loop2 = Main.next() + Main.nextLine();
                    } while ("Y".equalsIgnoreCase(loop2)) ;


                }

            }
            if ( PilihVarian > 4 ) {
                System.out.print("Pilihan Anda Diluar Dari Pilihan Yang Tersedia !!\n");

            }
            System.out.print("Ketik Y/y Untuk Kembali ke Menu Awal, Dan Ketik Keyword Lain Untuk Mengakhiri Program Ini\t:\t");
            Menu = Main.next() + Main.nextLine();
            for ( int i = 0 ;i < 50 ; i++  ) {
                System.out.println("\n");
            }

        } while ("Y".equalsIgnoreCase(Menu));
    }
}