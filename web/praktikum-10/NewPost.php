<!DOCTYPE html>
<html lang="en">
  <head>
    <title>New Post</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  <body>
    <form method="POST" action="ViewPost.php">
      <table> 
        <tr>
          <td><label for="penulis">Penulis: </label></td>
          <td><input type="text" name="penulis" id="penulis"></td>
        </tr>

        <tr>
          <td><label for="tglWaktu">Tanggal & Waktu Post: </label></td>
          <td><input type="datetime-local" name="tgl_waktu" id="tglWwaktu"></td>
        </tr>

        <tr>
          <td><label for="judulBerita">Judul Berita: </label></td> 
          <td><input type="text" name="judul_berita" id="judulBerita"></td>
        </tr>

        <tr>
          <td><label for="isiBerita">Isi Berita: </label></td>
          <td><textarea name="isi_berita" id="isiBerita"></textarea></td>
        </tr>

        <tr>
          <td></td>
          <td><button type="submit">New Post</button></td>
        </tr>
      </table>
    </form> 
  </body>
</html>
