<html>
  <head>
    <title>Registrasi</title>
  </head>
  <body>
    <p id="hasil">
      <?php 
        $nama = $_GET['nama'];
        $alamat = $_GET['alamat'];

        echo 'Halooo ' . $nama . '<br />';
        echo '' . $alamat . ' pasti adalah alamatmu ya';
      ?>
    </p>
  </body>
</html>
