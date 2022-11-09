<!DOCTYPE html>
<html lang="en">
  <head>
    <title>View Post</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  <body>
    <?php 
      $penulis = $_POST['penulis'];
      $tgl_waktu = $_POST['tgl_waktu'];
      $judul_berita = $_POST['judul_berita'];
      $isi_berita = $_POST['isi_berita'];

      echo "<h1>$judul_berita</h1>
            Ditulis oleh <b>$penulis</b> pada <b>$tgl_waktu</b> <br><br> 
            $isi_berita";
    ?>
  </body>
</html>
