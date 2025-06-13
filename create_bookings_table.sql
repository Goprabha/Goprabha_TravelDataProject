CREATE TABLE bookings (
    id INT PRIMARY KEY,
    type VARCHAR(50),
    customerName VARCHAR(100),
    details TEXT,
    status VARCHAR(20)
);