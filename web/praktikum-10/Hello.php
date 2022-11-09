<html>
  <head>
    <title>Halo ini php</title>
  </head>
  <body>
    <h1>DATA PRIBADI SAYA</h1>
    <p>
      <?php // deklarasi variable
        $nama_saya = "Kevin";
        $kelas = "XI RPL 1";
        $nis = "2020201121";
        $umur = 16;
        $berat_badan = 50.78;
        /* dibawah ini adalah script untuk menampilkan data yang telah dideklarasikan di atas */
        echo ("Nama saya $nama_saya <br />");
        echo "sekarang saya kelas $kelas dan NIS saya $nis <br />";
        echo 'Umur saya sekarang adalah ' . $umur . ' tahun <br />';
        echo "Berat badan saya $berat_badan kg";
      ?>
    </p>
  </body>
</html>
