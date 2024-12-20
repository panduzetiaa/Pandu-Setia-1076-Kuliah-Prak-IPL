<?php
// Koneksi ke database
$conn = new mysqli("localhost", "root", "", "ipltujuh");

// Periksa koneksi
if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}

// Hapus pesan berdasarkan ID
if (isset($_GET['id'])) {
    $idpesan = intval($_GET['id']);

    $sql = "DELETE FROM pesan WHERE idpesan = ?";
    $stmt = $conn->prepare($sql);
    $stmt->bind_param("i", $idpesan);

    if ($stmt->execute()) {
        echo "Pesan berhasil dihapus";
    } else {
        echo "Pesan gagal dihapus: " . $conn->error;
    }

    $stmt->close();
}

// Tutup koneksi
$conn->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hapus Pesan</title>
</head>
<body>
    <ul>
        <li><a href="index.php">Kembali ke Daftar Pesan</a></li>
    </ul>
</body>
</html>
