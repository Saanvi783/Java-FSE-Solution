/*
QUESTION:
Exercise 1: Control Structures
*/

-- Scenario 1: Discount loan interest rates for customers over 60 years old.
-- Scenario 2: Promote customer to VIP status based on balance > 10000.
-- Scenario 3: Send reminders for loans due within the next 30 days.

-- Schema Setup
CREATE TABLE Customers (CustomerID NUMBER PRIMARY KEY, Name VARCHAR2(50), DOB DATE, Balance NUMBER, IsVIP VARCHAR2(1));
CREATE TABLE Loans (LoanID NUMBER PRIMARY KEY, CustomerID NUMBER, InterestRate NUMBER, DueDate DATE);

-- Solution 1: Control Structures Procedure
DECLARE
    CURSOR c_cust IS SELECT CustomerID, DOB, Balance FROM Customers;
BEGIN
    FOR r IN c_cust LOOP
        -- Scenario 1
        IF MONTHS_BETWEEN(SYSDATE, r.DOB)/12 > 60 THEN
            UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID = r.CustomerID;
        END IF;
        -- Scenario 2
        IF r.Balance > 10000 THEN
            UPDATE Customers SET IsVIP = 'Y' WHERE CustomerID = r.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
