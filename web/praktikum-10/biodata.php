<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" type="text/css" href="./assets/css/portalfolio.css">
  <title>Biodata</title>
</head>
<body>

  <h1>Biodata</h1>  

  <nav>
    <a href="">Biografi</a>
    <a href="">Peristiwa</a>
    <a href="">Masa Pemerintahan</a>
    <a href="">Kejatuhan</a>
  </nav>

  <main>
    <img src="assets/img/profile.jpeg" alt="profile"> 
    <div>
      <?php 
        $nama = 'Soeharto';
        $gelar = 'Jendral Besar TNI (Purn.) H. M.';
        $lahir = '8 Juni 1921';
        $wafat = '27 Januari 2008';
        $julukan_en = 'The Smilling General';
        $julukan_id = 'Sang Jendral yang Tersenyum';

        echo "$gelar $nama (ER, EYD: Suharto; $lahir – $wafat) adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno. Di dunia internasional, terutama di Dunia Barat, Soeharto sering dirujuk dengan sebutan populer \"$julukan_en\" (bahasa Indonesia: \"$julukan_id\") karena raut mukanya yang senantiasa tersenyum dan menunjukkan keramahan. Meski begitu, dengan berbagai kontroversi yang terjadi, ia sering juga disebut sebagai otoriter bagi yang berseberangan dengannya.";
      ?>
    </div>
  </main>

</body>
</html>
