<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Pesan</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 15px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Daftar Pesan</h1>
    <table>
        <tr>
            <th>ID Pesan</th>
            <th>ID Penerima</th>
            <th>ID Pengiriman</th>
            <th>Judul</th>
            <th>Pesan</th>
            <th>Waktu Pesan</th>
            <th>Aksi</th>
        </tr>
        <?php
        // Koneksi ke database
        $conn = new mysqli("localhost", "root", "", "ipltujuh");

        // Periksa koneksi
        if ($conn->connect_error) {
            die("Koneksi gagal: " . $conn->connect_error);
        }

        // Ambil data pesan
        $sql = "SELECT idpesan, idpenerima, idpengiriman, judul, textpesan, wktpesan FROM pesan";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // Output data setiap baris
            while($row = $result->fetch_assoc()) {
                echo "<tr>";
                echo "<td>" . $row["idpesan"] . "</td>";
                echo "<td>" . $row["idpenerima"] . "</td>";
                echo "<td>" . $row["idpengiriman"] . "</td>";
                echo "<td>" . $row["judul"] . "</td>";
                echo "<td>" . $row["textpesan"] . "</td>";
                echo "<td>" . $row["wktpesan"] . "</td>";
                echo "<td><a href='hapus_pesan.php?id=" . $row["idpesan"] . "'>Hapus</a></td>";
                echo "</tr>";
            }
        } else {
            echo "<tr><td colspan='7'>Tidak ada pesan ditemukan</td></tr>";
        }
        $conn->close();
        ?>
    </table>
</body>
</html>
