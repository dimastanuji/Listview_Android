package com.dimastm.pendemi;

import java.util.ArrayList;

public class DaftarPendemi {
    private static String[] namap={
            "HIV/AIDS",
            "FLU HONGKONG",
            "FLU ASIA",
            "FlU",
            "KOLERA",
            "FLU RUSIA",
            "KOLERA (1852-1860)",
            "THE BLACK DEATH",
            "WABAH JUSTINIAN",
            "WABAH ANTONINE"
    };

    private  static  String[] tahun={
            "1981 - Sekarang",
            "1968",
            "1956-1958",
            "1918-1920",
            "1910-1911",
            "1889-1890",
            "1852-1860",
            "1346-1353",
            "541-542",
            "165"
    };

    private static String[] total={
            "36 juta jiwa",
            "1 juta jiwa",
            "2 juta jiwa",
            "20-50 juta jiwa",
            "800 ribu jiwa",
            "1 juta jiwa",
            "1 juta jiwa",
            "25 juta jiwa",
            "25 juta jiwa",
            "5 juta jiwa"
    };

    private static String[] detail={
            "Penyakit ini pertama kali terindetifikasi di Kongo pada tahun 1976 dan ditetapkan sebagai pandemik global karena telah menewaskan 36 juta orang sejak tahun 1981. Hingga kekinian, terdapat 31 juta jiwa yang hidup dengan HIV. Beruntung, sejak kesadaran mulai tumbuh dalam mengatasi penyakit ini, perawatan baru telah dikembangkan. Dengan begitu, membuat HIV jauh lebih mudah dikelola sehingga banyak dari mereka yang terinfeksi bisa terus menjalani kehidupan yang produktif.",
            "Pandemik ini disebut juga sebagai flu kategori 2 atau Flu Hongkong karena menginfeksi pertama kali di Hongkong pada tahun 1968. Berdasarkan catatan laporan tentang pandemik ini, kasus Flu Hongkong pertama kali dilaporkan pada 13 Juli 1968. Setelah itu, hanya butuh waktu tiga bulan sampai virus ini menyerang penduduk di Singapura, Vietnam, Filipina, India, Australia, Eropa, hingga Amerika Serikat. Meski tingkat kematiannya relatif rendah (0,5%), pandemik ini mengakibatkan lebih dari satu juta orang meninggal dan separuh di antaranya adalah penduduk Hongkong.",
            "Wabah ini menyerang penduduk China pada tahun 1956-1958. Selama kurun waktu tersebut, wabah ini menyebar dari provinsi Guizhou ke Singapura, Hongkong, dan Amerika Serikat. World Health Organization (WHO) atau Badan Kesehatan Dunia menetapkan bahwa wabah ini telah menelan dua juta korban jiwa dengan perkiraan 69.800 jiwa di antaranya terjadi di Amerika Serikat.",
            "Tahun-tahun paling mengerikan terjadi antara tahun 1918-1920. Dalam kurun waktu tersebut, muncul wabah influenza yang mematikan dan menginfeksi hampir sepertiga populasi dunia. Yang menyebabkan pandemi influenza 1918 berbeda dengan yang lainnya adalah para korban justru berusia produktif. Wabah ini bukan hanya menyerang orang tua atau pasien yang daya tahan tubuhnya lemah, namun juga menyerang mereka yang berusia dewasa produktif dan dalam kondisi sehat. Ini menyebabkan anak-anak mereka atau generasi setelah mereka menjadi lemah.",
            "Wabah ini berasal dari India dan telah menewaskan lebih dari 800 ribu jiwa sebelum akhirnya menyebar hingga ke Timur Tengah, Afrika Utara, Eropa Timur, dan Rusia. Wabah ini juga tercatat sebagai wabah kolera terakhir di Amerika Serikat (1910-1911). Otoritas Kesehatan Amerika yang telah belajar dari masa lalu bergerak cepat dengan mengisolasi pasien yang terinfeksi sehingga hanya ada 11 kematian yang terjadi di Amerika karena wabah ini. Tahun 1923, wabah kolera di India berkurang secara drastis meskipun masih ada beberapa kasus yang tercatat.",
            "Flu yang menyerang pada tahun-tahun ini awalnya disebut Flu Asia atau Flu Rusia. Pertumbuhan populasi yang cepat membantu penyebaran wabah ini meluas hingga ke seluruh dunia. Tercatat selama kurun waktu tersebut, satu juta orang dilaporkan meninggal karena wabah ini.",
            "Sama seperti wabah kolera pertama dan kedua yang berasal dari India, wabah kolera 'ketiga' ini juga terjadi dan bermula dari sana. Wabah ini menyebar dari sungai Gangga hingga ke Asia, Eropa, Afrika, dan Amerika Utara. Seorang dokter di Inggris bernama John Snow berhasil melacak bahwa penyebab wabah ini berasal dari air yang tercemar. Di Inggris, sebanyak 23 ribu orang meninggal karena wabah ini.",
            "Ini juga menjadi salah satu wabah paling mengerikan yang pernah tercatat oleh dunia. Wabah ini menghancurkan tiga benua sekaligus yaitu Asia, Afrika, dan Eropa. Wabah ini dibawa oleh kutu yang tinggal pada tikus dan menumpang hidup di atas kapal dagang. Fatalnya, pada tahun-tahun tersebut, perdagangan dunia sedang berada di titik puncak sehingga memudahkan penyebaran wabah tersebut yang akhirnya menelan korban puluhan juta jiwa.",
            "Penyakit ini diperkirakan telah membunuh setengah populasi Eropa. Wabah ini menyerang Kekaisaran Bizantium dan kota-kota pelabuhan Mediterania. Diperkirakan lima ribu orang terbunuh setiap harinya karena wabah ini sehingga pada masa itu sebanyak 40% populasi kota meninggal dan lenyap.",
            "Wabah ini dicurigai sebagai pandemi kuno yang menyerang Asia Kecil, Mesir, Yunani, dan Italia. Diduga penyakit tersebut adalah campak atau cacar meskipun tak ada yang benar-benar bisa membuktikan hal ini.",

    };
    private static int[] foto={
            R.drawable.hiv,
            R.drawable.fluhongkong,
            R.drawable.fluasia,
            R.drawable.flu,
            R.drawable.kolera,
            R.drawable.flurusia,
            R.drawable.kolera6,
            R.drawable.black,
            R.drawable.justinian,
            R.drawable.antoninus

    };

    static ArrayList<Pendemi> getListData() {
        ArrayList<Pendemi> list = new ArrayList<>();
        for (int position = 0; position < namap.length; position++) {
            Pendemi pendem = new Pendemi();
            pendem.setNamap(namap[position]);
            pendem.setTahun(tahun[position]);
            pendem.setTotal(total[position]);
            pendem.setDetail(detail[position]);
            pendem.setFoto(foto[position]);
            list.add(pendem);
        }
        return list;
    }
}
