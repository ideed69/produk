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
public class produk3 {
    <?php
include_once("config.php");


if(isset($_POST['Submit'])){
	$id = $_POST['id'];
	$nama = $_POST['nama'];
	$harga = $_POST['harga'];

	$result = mysqli_query($mysqli, "INSERT INTO produk(nama,harga)"."VALUES('$nama','$harga')");

	echo "<script>alert('Tambah maklumat berjaya');"
	."window.location='index.php'</script>";

}
else
{

}
?>

<!DOCTYPE html>
<html>
<head>
	<title>TAMBAH REKOD</title>
</head>
<body>
	<center> <h2>Tambah rekod barangan dan harga</h2></center>
	<fieldset>
		<form action="add.php" method="post" name="form1">
			<table width="25%" border="0">
				<tr>
					<td>Nama produk</td>
					<td><input type="text" name="nama"></td>
				</tr>
				<tr>
					<td>Harga</td>
					<td><input type="text" name="harga"></td>
				</tr>
				<tr>
						<td></td>
						<td><input type="submit" name="Submit" value="Add"></td>
					</tr>
				</table>
			</form>

			<br><a href="index.php">kembali ke laman utama</a>
		</fieldset>
	
	<?php}
	?>
	</body>
	</html>
			</table>
	</fieldset>
</body>
</html>


}
