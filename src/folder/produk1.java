/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author SAMSUNG
 */
public class produk1 {
    
   <?php 
//PANGGIL FAIL SAMBUNG KE PANGKALAN DATA
include_once("config.php");

//MEMAPARKAN DATA MENGIKUT SUSUNAN DATA TERBARU DIMASUKAN

$result=mysqli_query($mysqli, "SELECT * FROM produk ORDER BY id DESC");
 ?>
<html>
<head>
	<title>Senarai Barangan</title>
</head>

<body>

		<h2>SENARAI BARANGAN DAN HARGA</h2>
	<fieldset>
		<table width='80%' border=0>
			<tr bgcolor='#CCCCCC'>
				<td>Bil.</td>
				<td>Nama Produk</td>
				<td>Harga</td>
				<td>Tindakan</td>
			</tr>

			<?php 
				$no=1;
				while($res = mysqli_fetch_array($result)){
					echo "<tr>";
					echo "<td>".$no;
					echo "<td>".$res['nama']."</td>";
					echo "<td>".RM.$res['harga']."</td>";
					echo "<td><a href=\"edit.php?id=$res[id]\">kemaskini</a> | <a href=\"delete.php?id=$res[id]\" onClick=\"return confirm('Adakah anda pasti?')\">hapus</a></td>";
					$no++;
				}
			 ?>
		</table>
		<br><a href="dead.php">Daftar Barang Baru<a href="bid.php">Bidden</a><Br><a href="server.php">error</a>
	</center>
</fieldset>
</body>
</html>
 
    
}
