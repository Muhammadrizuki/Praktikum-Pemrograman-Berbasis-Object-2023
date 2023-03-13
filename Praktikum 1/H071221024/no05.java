import java.util.Scanner;
import java.util.ArrayList;
public class no05 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("");
            String input = sc.nextLine();
            konversiTanggal(input);
            sc.close();
        } catch (Exception e) {
            System.out.println("Inputan data salah!");
        }
    }
    static void konversiTanggal(String date) {
        int panjangString = date.length();
        // String tanggalSubString = date.substring(0, 2);
        // // System.out.println(tanggalSubString);
        String[] hariBulanTahun = date.split("-");
        if (panjangString < 8 || date.charAt(2) != '-') {
            System.out.println("Inputan harus memiliki format seperti DD/MM/YY (hari/bulan/tahun)");
        } else if (panjangString > 8 || date.charAt(5) != '-') {
            System.out.println("Inputan harus memiliki format seperti DD/MM/YY (hari/bulan/tahun)");
        // } else if (tanggalSubString == "00") {
        //     System.out.println("Harap Input data yang benar!");
        } else {
            String bulan;
            int tanggal, tahun;
            ArrayList<Integer> dateList = new ArrayList<Integer>();
            for (String dateMonthYear : hariBulanTahun) {
                int dateMonthYearInt = Integer.parseInt(dateMonthYear);
                dateList.add(dateMonthYearInt);
            }
            // int tahunString = Integer.parseInt(dateList.get(2));
            if (dateList.get(2) > 23) {
                tahun = dateList.get(2);
                if (dateList.get(1) < 13 && dateList.get(1) > 0) {
                    if (dateList.get(1) == 1) {
                        bulan = "Januari";
                        if (dateList.get(0) <= 31 && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Januari sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 2) {
                        bulan = "Februari";
                        if (tahun % 4 == 0) {
                            if (dateList.get(0) <= 29  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 19" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 29 hari pada tahun tersebut! Harap input tanggal yang benar! ");
                            }
                        } else {
                            if (dateList.get(0) <= 28  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 19" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 28 hari! (Kecuali pada pada empat tahun sekali maksimal sebanyak 29 hari) Harap input tanggal yang benar! ");
                            }
                        }
                    } else if (dateList.get(1) == 3) {
                        bulan = "Maret";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Maret sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 4) {
                        bulan = "April";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan April sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 5) {
                        bulan = "Mei";
                        if (dateList.get(0) <= 31 && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Mei sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 6) {
                        bulan = "Juni";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juni sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 7) {
                        bulan = "Juli";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juli sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 8) {
                        bulan = "Agustus";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Agustus sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 9) {
                        bulan = "September";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan September sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 10) {
                        bulan = "Oktober";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Oktober sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 11) {
                        bulan = "November";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan November sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 12) {
                        bulan = "Desember";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 19" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Desember sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    }
                } else if (dateList.get(1) >= 13 || dateList.get(1) == 0){
                    System.out.println("Harap input angka tanggal, bulan dan tahun yang benar");
                }
            } else if (dateList.get(2) <= 23 && dateList.get(2) >= 10) {
                tahun = dateList.get(2);
                if (dateList.get(1) < 13  && dateList.get(1) > 0 ) {
                    if (dateList.get(1) == 1) {
                        bulan = "Januari";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Januari sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 2) {
                        bulan = "Februari";
                        if (tahun % 4 == 0) {
                            if (dateList.get(0) <= 29  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 20" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 29 hari pada tahun tersebut! Harap input tanggal yang benar! ");
                            }
                        } else {
                            if (dateList.get(0) <= 28  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 20" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 28 hari! (Kecuali pada pada empat tahun sekali maksimal sebanyak 29 hari) Harap input tanggal yang benar! ");
                            }
                        }
                    } else if (dateList.get(1) == 3) {
                        bulan = "Maret";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Maret sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 4) {
                        bulan = "April";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan April sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 5) {
                        bulan = "Mei";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Mei sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 6) {
                        bulan = "Juni";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juni sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 7) {
                        bulan = "Juli";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juli sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 8) {
                        bulan = "Agustus";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Agustus sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 9) {
                        bulan = "September";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan September sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 10) {
                        bulan = "Oktober";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Oktober sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 11) {
                        bulan = "November";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan November sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 12) {
                        bulan = "Desember";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 20" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Desember sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    }
                } else if (dateList.get(1) >= 13 || dateList.get(1) == 0) {
                    System.out.println("Harap input angka tanggal, bulan dan tahun yang benar");
                }
            } else if (dateList.get(2) < 10) {
                tahun = dateList.get(2);
                if (dateList.get(1) < 13  && dateList.get(1) > 0) {
                    if (dateList.get(1) == 1) {
                        bulan = "Januari";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Januari sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 2) {
                        bulan = "Februari";
                        if (tahun % 4 == 0) {
                            if (dateList.get(0) <= 29  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 200" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 29 hari pada tahun tersebut! Harap input tanggal yang benar! ");
                            }
                        } else {
                            if (dateList.get(0) <= 28  && dateList.get(0) > 0) {
                                tanggal = dateList.get(0);
                                System.out.println(tanggal + " " + bulan + " 200" + tahun);
                            } else if (dateList.get(0) == 0) {
                                System.out.println("Harap Input data yang benar!");
                            } else {
                                System.out.println("Maksimal hari pada bulan Februari sebanyak 28 hari! (Kecuali pada pada empat tahun sekali maksimal sebanyak 29 hari) Harap input tanggal yang benar! ");
                            }
                        }
                    } else if (dateList.get(1) == 3) {
                        bulan = "Maret";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Maret sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 4) {
                        bulan = "April";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan April sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 5) {
                        bulan = "Mei";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Mei sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 6) {
                        bulan = "Juni";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juni sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 7) {
                        bulan = "Juli";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Juli sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 8) {
                        bulan = "Agustus";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Agustus sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 9) {
                        bulan = "September";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan September sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 10) {
                        bulan = "Oktober";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Oktober sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 11) {
                        bulan = "November";
                        if (dateList.get(0) <= 30  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan November sebanyak 30 hari! Harap input tanggal yang benar! ");
                        }
                    } else if (dateList.get(1) == 12) {
                        bulan = "Desember";
                        if (dateList.get(0) <= 31  && dateList.get(0) > 0) {
                            tanggal = dateList.get(0);
                            System.out.println(tanggal + " " + bulan + " 200" + tahun);
                        } else if (dateList.get(0) == 0) {
                            System.out.println("Harap Input data yang benar!");
                        } else {
                            System.out.println("Maksimal hari pada bulan Desember sebanyak 31 hari! Harap input tanggal yang benar! ");
                        }
                    }
                } else if (dateList.get(1) >= 13 || dateList.get(1) == 0) {
                    System.out.println("Harap input angka tanggal, bulan dan tahun yang benar");
                }
            }
        }
    }
}