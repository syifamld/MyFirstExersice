package com.example.gunungtertinggiind;

import java.util.ArrayList;

public class DataGunung {
    private static int[] IdGunung = {
            0,
            1,
            2,
            3,
            4,
            5,
            6,
    };
    private static String[] NamaGunung = {
            "Gunung Jaya Wijaya",
            "Gunung Kerinci",
            "Gunung Rinjani",
            "Gunung Semeru",
            "Gunung Sanggar",
            "Gunung Latimojong",
            "Gunung Slamet",
    };
    private static String[] DeskripsiGunung = {
            "Gunung ini menjadi gunung tertinggi nomor satu di Indonesia karena memiliki ketinggian mencapai 4.884 meter. Gunung ini juga merupakan salah satu gunung tertinggi di dunia.Gunung yang terletak di Provinsi Papua ini juga dikenal dengan nama Carstensz Pyramid.Saking tingginya, di puncak gunung ini terdapat salju abadi.",
            "Gunung tertinggi kedua ini memiliki ketinggian mencapai 3.805 meter. Gunung ini merupakan gunung tertinggi di pulau Sumatera. Walaupun biasa dipanjat para pendaki, gunung ini masih dalam kategori aktif.",
            "Gunung Rinjani terletak di Lombok, Nusa Tenggara Barat. Buat para pendaki, gunung ini menyajikan pemandangan yang indah karena terdapat padang rumput yang luas dan hutan tropis.Gunung ini memiliki ketinggian mencapai 3.762 meter. Terdapat juga Taman Nasional Lombok di sekitar gunung tersebut.",
            "Gunung yang terkenal di film 5 cm ini memiliki ketinggian mencapai 3.676 meter. Puncak gunung yang terletak di Jawa Timur ini dikenal dengan nama Mahameru. Gunung ini merupakan salah satu gunung tertinggi di Pulau Jawa.",
            "Walaupun masih jarang terdengar namanya, gunung ini memiliki ketinggian mencapai 3.564 meter. Alhasil, gunung ini ditetapkan menjadi gunung tertinggi ke-5 di Indonesia.",
            "Dikenal juga dengan nama Bulu Rantemario, gunung ini memiliki ketinggian 3.478 meter. Dari pusat kota Makassar, pendaki harus memakan waktu hingga 10 jam untuk mencapai kaki gunung.",
            "Terletak di Jawa Tengah, gunung ini memiliki ketinggian mencapai 3.428 meter. Gunung ini menjadi salah satu gunung yang masih aktif, bahkan tercatat gunung ini telah meletus sebanyak 42 kali.",
    };
    private static int[] FotoGunung = {
            R.drawable.jayawijaya,
            R.drawable.kerinci,
            R.drawable.rinjani,
            R.drawable.semeru,
            R.drawable.sanggar,
            R.drawable.latimojong,
            R.drawable.slamet,
    };

    static ArrayList<Gunung> getListData(){
        ArrayList<Gunung> list = new ArrayList<>();
        for (int position = 0; position < NamaGunung.length; position++){
            Gunung gunung = new Gunung();
            gunung.setId(IdGunung[position]);
            gunung.setName(NamaGunung[position]);
            gunung.setDescription(DeskripsiGunung[position]);
            gunung.setPhoto(FotoGunung[position]);
            list.add(gunung);
        }
        return list;
    }
    }
