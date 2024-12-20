-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2024 at 02:22 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ipltujuh`
--

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `idpesan` int(7) NOT NULL,
  `idpenerima` int(7) NOT NULL,
  `idpengiriman` int(7) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `textpesan` text NOT NULL,
  `wktpesan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`idpesan`, `idpenerima`, `idpengiriman`, `judul`, `textpesan`, `wktpesan`) VALUES
(1, 0, 1, 'tes', '', '2024-12-16'),
(2, 0, 0, '1', '', '2024-12-16'),
(3, 0, 0, '1', '', '2024-12-20'),
(4, 0, 0, '1', '', '2024-12-20'),
(5, 0, 0, '1', '', '2024-12-20'),
(6, 0, 0, '1', '', '2024-12-20'),
(7, 0, 0, '1', '', '2024-12-20'),
(8, 0, 0, '1', '', '2024-12-20'),
(9, 0, 0, 'tes', '', '2024-12-20'),
(10, 0, 0, 'tegar', '', '2024-12-20'),
(11, 0, 0, '', '', '2024-12-20'),
(12, 0, 0, '', '', '2024-12-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`idpesan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `idpesan` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
