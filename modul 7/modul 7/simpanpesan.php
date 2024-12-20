<?php
// Mulai sesi
session_start();

// Koneksi ke database
$conn = new mysqli("localhost", "root", "", "ipltujuh");

// Periksa koneksi
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fungsi untuk membersihkan data
function clean_input($data) {
    return htmlspecialchars(stripslashes(trim($data)));
}

// Dapatkan data dari form dan sesi dengan sanitasi input
$idpengiriman = isset($_SESSION['idpengiriman']) ? clean_input($_SESSION['idpengiriman']) : '';
$idpenerima = isset($_POST['idpenerima']) ? clean_input($_POST['idpenerima']) : '';
$judul = isset($_POST['judul']) ? clean_input($_POST['judul']) : '';
$textpesan = isset($_POST['textpesan']) ? clean_input($_POST['textpesan']) : '';
$wktpesan = date('Y-m-d H:i:s'); // Tanggal saat ini dengan waktu

// Siapkan pernyataan SQL
$stmt = $conn->prepare("INSERT INTO pesan (idpengiriman, idpenerima, judul, textpesan, wktpesan) VALUES (?, ?, ?, ?, ?)");
$stmt->bind_param("sssss", $idpengiriman, $idpenerima, $judul, $textpesan, $wktpesan);

// Eksekusi pernyataan SQL dan periksa hasilnya
if ($stmt->execute()) {
    $message = "Pesan berhasil ditambahkan";
} else {
    $message = "Pesan gagal ditambahkan: " . $stmt->error;
}

// Tutup pernyataan dan koneksi
$stmt->close();
$conn->close();
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hasil Pengiriman Pesan</title>
</head>
<body>
    <p><?php echo $message; ?></p>
    <ul>
        <li><a href="form_tampilpesan.php">Tampilkan Pesan?</a></li>
    </ul>
</body>
</html>
