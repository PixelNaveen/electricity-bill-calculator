-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2025 at 08:02 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electricity_bill_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `electricity_usage`
--

CREATE TABLE `electricity_usage` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `customer_nic` varchar(20) DEFAULT NULL,
  `month` varchar(20) NOT NULL,
  `units` int(11) NOT NULL,
  `total_bill` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `electricity_usage`
--

INSERT INTO `electricity_usage` (`id`, `customer_id`, `customer_nic`, `month`, `units`, `total_bill`) VALUES
(1, 2, '2004', 'March 2025', 50, 392.50),
(2, 2, '2004', 'May', 100, 1048.50),
(3, 2, '2004', 'January 2025', 20, 157.00),
(4, 2, '2004', 'June 2025', 10, 78.50),
(5, 2, '2004', 'April 2025', 50, 392.50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `electricity_usage`
--
ALTER TABLE `electricity_usage`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `customer_nic` (`customer_nic`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `electricity_usage`
--
ALTER TABLE `electricity_usage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `electricity_usage`
--
ALTER TABLE `electricity_usage`
  ADD CONSTRAINT `electricity_usage_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`),
  ADD CONSTRAINT `electricity_usage_ibfk_2` FOREIGN KEY (`customer_nic`) REFERENCES `customers` (`nic_number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
