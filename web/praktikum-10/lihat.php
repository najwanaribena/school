<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Lihat</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  <body>
    <?php 
      $nama_depan = $_POST['nama_depan'];
      $nama_belakang = $_POST['nama_belakang'];
      $ttl = $_POST['ttl'];
      $kelamin = $_POST['kelamin'];
      $agama = $_POST['agama'];
      $alamat = $_POST['alamat'];

      echo "Selamat datang $nama_depan $nama_belakang, anda telah berhasil daftar. Data diri anda: <br>
            Tempat, Tanggal lahir: $ttl <br>
            Jenis Kelamin: $kelamin <br>
            Agama: $agama <br>
            Alamat: $alamat";
    ?> 
  </body>
</html>
