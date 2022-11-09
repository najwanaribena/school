<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Regitrasi</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  <body>
    <center>
      <h1>REGISTRASI</h1>
      <form method="POST" action="lihat.php">
        <table>
          <tr>
            <td>Nama Depan </td>
            <td><input type="text" name="nama_depan"></td>
            <td>Nama Belakang </td>
            <td><input type="text" name="nama_belakang"></td>
          </tr> 
          <tr>
            <td>Tempat, Tanggal lahir </td>
            <td><input type="text" name="ttl"></td>
          </tr>
          <tr>
            <td>Jenis Kelamin</td>
            <td>
              <input type="radio" name="kelamin" value="Pria" id="pria">
              <label for="pria">Pria</label>
              <input type="radio" name="kelamin" value="Wanita" id="wanita"> 
              <label for="wanita">Wanita</label>
            </td>
          </tr>
          <tr>
            <td>Agama</td>
            <td>
              <select name="agama">
                <option value="Islam">Islam</option>
                <option value="Kristen">Kristen</option>
                <option value="Hindu">Hindu</option>
                <option value="Buddha">Buddha</option>
                <option value="Konghucu">konghucu</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>Alamat</td>
            <td><textarea name="alamat"></textarea></td>
          </tr>
          <tr>
            <td></td>
            <td>
              <button type="submit">Daftar</button>
            </td>
          </tr>
        </table>
      </form>
    </center> 
  </body>
</html>
